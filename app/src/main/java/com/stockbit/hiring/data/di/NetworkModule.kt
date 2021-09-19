package com.stockbit.hiring.data.di

import android.content.Context
import com.stockbit.hiring.BuildConfig
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn

import dagger.hilt.components.SingletonComponent
import okhttp3.Cache
import okhttp3.OkHttpClient
import okhttp3.Request
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit
import javax.inject.Named
import javax.inject.Qualifier
import javax.inject.Singleton

@Module(includes = [ApiModule::class])
@InstallIn(SingletonComponent::class)
object NetworkModule {

    const val STOCKBIT_ACCESS_KEY = "stockbit"

    @Qualifier
    @Retention(AnnotationRetention.BINARY)
    annotation class ExampleServiceCallback

    @Provides
    @Named(STOCKBIT_ACCESS_KEY)
    fun provideBaseURL() = BuildConfig.BASE_URL

    @Provides
    @Singleton
    fun provideLoggingInterceptor() = HttpLoggingInterceptor().apply {
        if (BuildConfig.DEBUG) level = HttpLoggingInterceptor.Level.BODY
    }

    @Provides
    @Singleton
    fun provideOkHttpClientBuilder(okHttpClient: OkHttpClient) =
        okHttpClient.newBuilder()

    @Provides
    @Singleton
    fun provideCache(context: Context): Cache {
        val cacheSize = 10 * 1024 * 1024 // 10 MB Cache
        return Cache(context.cacheDir, cacheSize.toLong())
    }

    @Provides
    @Singleton
    fun provideOkHttpCallback(
        interceptor: HttpLoggingInterceptor,
        cache: Cache
    ) = OkHttpClient.Builder()
        .writeTimeout(60, TimeUnit.SECONDS)
        .readTimeout(60, TimeUnit.SECONDS)
        .addInterceptor(interceptor)
        .addInterceptor{
            val authorisedRequest : Request = it.request().newBuilder()
                .addHeader(BuildConfig.ACCEPT_KEY,BuildConfig.ACCEPT_VALUE)
                .addHeader(BuildConfig.APPLICATION_KEY_NAME,BuildConfig.APPLICATION_KEY_VALUE_NAME)
                .build()

            it.proceed(authorisedRequest)
        }
        .cache(cache)
        .build()

    @ExampleServiceCallback
    @Provides
    @Singleton
    fun provideRetrofit(
        okHttpClient: OkHttpClient,
        @Named(STOCKBIT_ACCESS_KEY) baseURL: String
    ) = Retrofit.Builder()
        .baseUrl(baseURL)
        .addConverterFactory(GsonConverterFactory.create())
        .client(okHttpClient)
        .build()
}