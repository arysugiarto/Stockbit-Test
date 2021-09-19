package com.stockbit.hiring.data.repository

import com.stockbit.hiring.data.source.ExampleRemoteDataSource
import com.stockbit.hiring.data.source.callback.ExampleSourceCallback

class ExampleRepository(exampleRemoteDataSource: ExampleRemoteDataSource): ExampleSourceCallback {
    private val remoteDataSource = exampleRemoteDataSource

    override fun example() = remoteDataSource.handleRequestDataExample()
}