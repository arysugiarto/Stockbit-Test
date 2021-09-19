package com.stockbit.hiring.data.remote.api;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J)\u0010\u0002\u001a\u001a\u0012\u0016\u0012\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0004\u0012\u00020\u00010\u00040\u0003H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0007\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\b"}, d2 = {"Lcom/stockbit/hiring/data/remote/api/ExampleServiceCallback;", "", "requestData", "Lretrofit2/Response;", "Lcom/stockbit/hiring/base/BaseResponse;", "", "Lcom/stockbit/hiring/data/model/ExamplesModel;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_devDebug"})
public abstract interface ExampleServiceCallback {
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "data/top/totaltoptiervolfull?limit=10&tsym=USD")
    public abstract java.lang.Object requestData(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.stockbit.hiring.base.BaseResponse<java.util.List<com.stockbit.hiring.data.model.ExamplesModel>, java.lang.Object>>> p0);
}