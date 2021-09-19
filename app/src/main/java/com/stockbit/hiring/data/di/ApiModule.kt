package com.stockbit.hiring.data.di

import com.stockbit.hiring.data.remote.api.ExampleServiceCallback
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ApplicationComponent
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit

@Module
@InstallIn(SingletonComponent::class)
object ApiModule {

    @Provides
    fun provideDefaultApiCallback(@NetworkModule.ExampleServiceCallback retrofit: Retrofit): ExampleServiceCallback =
        retrofit.create(ExampleServiceCallback::class.java)
}