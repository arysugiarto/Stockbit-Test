package com.stockbit.hiring.data.source.callback;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u001a\u0010\u0002\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00040\u0003H&\u00a8\u0006\u0007"}, d2 = {"Lcom/stockbit/hiring/data/source/callback/ExampleSourceCallback;", "", "example", "Lkotlinx/coroutines/flow/Flow;", "Lcom/stockbit/hiring/data/remote/Result;", "", "Lcom/stockbit/hiring/data/model/ExamplesModel;", "app_devDebug"})
public abstract interface ExampleSourceCallback {
    
    @org.jetbrains.annotations.NotNull()
    public abstract kotlinx.coroutines.flow.Flow<com.stockbit.hiring.data.remote.Result<java.util.List<com.stockbit.hiring.data.model.ExamplesModel>>> example();
}