package com.stockbit.hiring.data.di

import android.app.Application
import android.content.Context
import com.stockbit.hiring.data.local.preferences.AccessManager
import com.stockbit.hiring.data.remote.api.ExampleServiceCallback
import com.stockbit.hiring.data.repository.ExampleRepository
import com.stockbit.hiring.data.source.ExampleRemoteDataSource
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ApplicationComponent
import dagger.hilt.components.SingletonComponent

@Module(includes = [DatabaseModule::class])
@InstallIn(SingletonComponent::class)
object ApplicationModule {

    @Provides
    fun provideApplication(application: Application): Context = application

    @Provides
    fun provideAccessManager(context: Context) = AccessManager(context)

    // Todo : Add Repositories & Injectable Application Module here

    @Provides
    fun provideExampleepository(
        provideDefaultApiCallback: ExampleServiceCallback
    ) = ExampleRepository(
        ExampleRemoteDataSource(provideDefaultApiCallback)
    )
}