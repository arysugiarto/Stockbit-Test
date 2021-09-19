package com.stockbit.hiring.data.source

import com.stockbit.hiring.data.remote.api.ExampleServiceCallback
import com.stockbit.hiring.data.source.callback.ExampleSourceCallback
import com.stockbit.hiring.util.flowResponse

class ExampleRemoteDataSource(exampleServiceCallback: ExampleServiceCallback) {
    private val apiCallback = exampleServiceCallback

    fun handleRequestDataExample() = flowResponse {
        apiCallback.requestData()
    }
}