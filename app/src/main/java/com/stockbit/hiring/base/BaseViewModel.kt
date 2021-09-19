package com.stockbit.hiring.base

import android.app.Application
import android.content.Context
import android.net.ConnectivityManager
import android.net.Network
import android.net.NetworkCapabilities
import android.net.NetworkRequest
import android.os.Build
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.stockbit.hiring.data.local.preferences.AccessManager
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flatMapLatest

open class  BaseViewModel(application: Application) : AndroidViewModel(application) {

    val hasInternet: Boolean get() = checkInternetPermission()
    val hasInternetLiveData: LiveData<Boolean> get() = _hasInternetConnectionLiveData

    private val _hasInternetConnectionLiveData = MutableLiveData<Boolean>()

    val accessManager = AccessManager(application)
    val accessTokenFlow = accessManager.access

    inline fun <T> accessToken(crossinline result: (accessToken: String) -> Flow<Result<T>>) =
        accessTokenFlow.flatMapLatest { token -> result.invoke(token) }

    private val connectivityManager = application.getSystemService(
            Context.CONNECTIVITY_SERVICE
    ) as ConnectivityManager

    private fun checkInternetPermission(): Boolean {
        return if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            val network = connectivityManager.activeNetwork ?: return false
            val capabilities =
                    connectivityManager.getNetworkCapabilities(network) ?: return false

            when {
                capabilities.hasTransport(NetworkCapabilities.TRANSPORT_WIFI) -> true
                capabilities.hasTransport(NetworkCapabilities.TRANSPORT_CELLULAR) -> true
                capabilities.hasTransport(NetworkCapabilities.TRANSPORT_ETHERNET) -> true
                else -> false
            }
        } else false

    }

    fun observeNetworkCallback() {
        val networkRequest = NetworkRequest.Builder()
                .addTransportType(NetworkCapabilities.TRANSPORT_WIFI)
                .addTransportType(NetworkCapabilities.TRANSPORT_CELLULAR)
                .addTransportType(NetworkCapabilities.TRANSPORT_ETHERNET)
                .build()

        connectivityManager.registerNetworkCallback(
                networkRequest, internetCallback
        )
    }

    private val internetCallback = object : ConnectivityManager.NetworkCallback() {
        override fun onAvailable(network: Network) {
            super.onAvailable(network)
            _hasInternetConnectionLiveData.postValue(true)
        }

        override fun onUnavailable() {
            super.onUnavailable()
            _hasInternetConnectionLiveData.postValue(false)
        }

        override fun onLost(network: Network) {
            super.onLost(network)
            _hasInternetConnectionLiveData.postValue(false)
        }
    }

    override fun onCleared() {
        super.onCleared()

        connectivityManager.runCatching {
            unregisterNetworkCallback(internetCallback)
        }
    }
}