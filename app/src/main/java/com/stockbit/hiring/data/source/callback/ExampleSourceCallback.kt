package com.stockbit.hiring.data.source.callback

import com.stockbit.hiring.data.model.ExampleModel
import com.stockbit.hiring.data.model.ExamplesModel
import kotlinx.coroutines.flow.Flow
import com.stockbit.hiring.data.remote.Result

interface ExampleSourceCallback {
    fun example(): Flow<Result<List<ExamplesModel>>>
}