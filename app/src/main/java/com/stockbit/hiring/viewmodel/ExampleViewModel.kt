package com.stockbit.hiring.viewmodel

import android.app.Application
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.stockbit.hiring.base.BaseViewModel
import com.stockbit.hiring.data.model.ExampleModel
import com.stockbit.hiring.data.model.ExamplesModel
import com.stockbit.hiring.data.repository.ExampleRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach
import com.stockbit.hiring.data.remote.Result
import javax.inject.Inject

@HiltViewModel
class ExampleViewModel @Inject constructor(
    application: Application,
    private val repository: ExampleRepository
) : BaseViewModel(application) {

    private val _example: MutableLiveData<Result<List<ExamplesModel>>> = MutableLiveData()

    val example: LiveData<Result<List<ExamplesModel>>> get() = _example

    init {
        observeNetworkCallback()
    }

    fun getExample() =
        repository.example()
            .onEach { result ->
                _example.value = result
            }.launchIn(viewModelScope)
}