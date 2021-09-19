package com.stockbit.hiring.data.remote.api

import com.stockbit.hiring.base.BaseResponse
import com.stockbit.hiring.data.model.ExampleModel
import com.stockbit.hiring.data.model.ExamplesModel
import com.stockbit.hiring.util.Const
import retrofit2.Response
import retrofit2.http.GET

interface ExampleServiceCallback {

    @GET(Const.Network.Example.DATA_EXAMPLE )
    suspend fun requestData(): Response<BaseResponse<List<ExamplesModel>, Any>>
}