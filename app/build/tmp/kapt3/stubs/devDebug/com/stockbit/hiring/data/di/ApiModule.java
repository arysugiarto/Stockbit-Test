package com.stockbit.hiring.data.di;

import java.lang.System;

@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\b\u0001\u0010\u0005\u001a\u00020\u0006H\u0007\u00a8\u0006\u0007"}, d2 = {"Lcom/stockbit/hiring/data/di/ApiModule;", "", "()V", "provideDefaultApiCallback", "Lcom/stockbit/hiring/data/remote/api/ExampleServiceCallback;", "retrofit", "Lretrofit2/Retrofit;", "app_devDebug"})
@dagger.Module()
public final class ApiModule {
    @org.jetbrains.annotations.NotNull()
    public static final com.stockbit.hiring.data.di.ApiModule INSTANCE = null;
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final com.stockbit.hiring.data.remote.api.ExampleServiceCallback provideDefaultApiCallback(@org.jetbrains.annotations.NotNull()
    @com.stockbit.hiring.data.di.NetworkModule.ExampleServiceCallback()
    retrofit2.Retrofit retrofit) {
        return null;
    }
    
    private ApiModule() {
        super();
    }
}