package com.stockbit.hiring.data.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u001a\u0010\u0006\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b0\u0007H\u0016R\u000e\u0010\u0005\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lcom/stockbit/hiring/data/repository/ExampleRepository;", "Lcom/stockbit/hiring/data/source/callback/ExampleSourceCallback;", "exampleRemoteDataSource", "Lcom/stockbit/hiring/data/source/ExampleRemoteDataSource;", "(Lcom/stockbit/hiring/data/source/ExampleRemoteDataSource;)V", "remoteDataSource", "example", "Lkotlinx/coroutines/flow/Flow;", "Lcom/stockbit/hiring/data/remote/Result;", "", "Lcom/stockbit/hiring/data/model/ExamplesModel;", "app_devDebug"})
public final class ExampleRepository implements com.stockbit.hiring.data.source.callback.ExampleSourceCallback {
    private final com.stockbit.hiring.data.source.ExampleRemoteDataSource remoteDataSource = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public kotlinx.coroutines.flow.Flow<com.stockbit.hiring.data.remote.Result<java.util.List<com.stockbit.hiring.data.model.ExamplesModel>>> example() {
        return null;
    }
    
    public ExampleRepository(@org.jetbrains.annotations.NotNull()
    com.stockbit.hiring.data.source.ExampleRemoteDataSource exampleRemoteDataSource) {
        super();
    }
}