package com.stockbit.hiring.data.di;

import java.lang.System;

@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u00c7\u0002\u0018\u00002\u00020\u0001:\u0001\u0017B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0005\u001a\u00020\u0004H\u0007J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0007J\b\u0010\n\u001a\u00020\u000bH\u0007J\u0018\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u0007H\u0007J\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\rH\u0007J\"\u0010\u0013\u001a\n \u0015*\u0004\u0018\u00010\u00140\u00142\u0006\u0010\u0012\u001a\u00020\r2\b\b\u0001\u0010\u0016\u001a\u00020\u0004H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0018"}, d2 = {"Lcom/stockbit/hiring/data/di/NetworkModule;", "", "()V", "STOCKBIT_ACCESS_KEY", "", "provideBaseURL", "provideCache", "Lokhttp3/Cache;", "context", "Landroid/content/Context;", "provideLoggingInterceptor", "Lokhttp3/logging/HttpLoggingInterceptor;", "provideOkHttpCallback", "Lokhttp3/OkHttpClient;", "interceptor", "cache", "provideOkHttpClientBuilder", "Lokhttp3/OkHttpClient$Builder;", "okHttpClient", "provideRetrofit", "Lretrofit2/Retrofit;", "kotlin.jvm.PlatformType", "baseURL", "ExampleServiceCallback", "app_devDebug"})
@dagger.Module(includes = {com.stockbit.hiring.data.di.ApiModule.class})
public final class NetworkModule {
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String STOCKBIT_ACCESS_KEY = "stockbit";
    @org.jetbrains.annotations.NotNull()
    public static final com.stockbit.hiring.data.di.NetworkModule INSTANCE = null;
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Named(value = "stockbit")
    @dagger.Provides()
    public final java.lang.String provideBaseURL() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final okhttp3.logging.HttpLoggingInterceptor provideLoggingInterceptor() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final okhttp3.OkHttpClient.Builder provideOkHttpClientBuilder(@org.jetbrains.annotations.NotNull()
    okhttp3.OkHttpClient okHttpClient) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final okhttp3.Cache provideCache(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final okhttp3.OkHttpClient provideOkHttpCallback(@org.jetbrains.annotations.NotNull()
    okhttp3.logging.HttpLoggingInterceptor interceptor, @org.jetbrains.annotations.NotNull()
    okhttp3.Cache cache) {
        return null;
    }
    
    @com.stockbit.hiring.data.di.NetworkModule.ExampleServiceCallback()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final retrofit2.Retrofit provideRetrofit(@org.jetbrains.annotations.NotNull()
    okhttp3.OkHttpClient okHttpClient, @org.jetbrains.annotations.NotNull()
    @javax.inject.Named(value = "stockbit")
    java.lang.String baseURL) {
        return null;
    }
    
    private NetworkModule() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0000\b\u0087\u0002\u0018\u00002\u00020\u0001B\u0000\u00a8\u0006\u0002"}, d2 = {"Lcom/stockbit/hiring/data/di/NetworkModule$ExampleServiceCallback;", "", "app_devDebug"})
    @java.lang.annotation.Retention(value = java.lang.annotation.RetentionPolicy.CLASS)
    @kotlin.annotation.Retention(value = kotlin.annotation.AnnotationRetention.BINARY)
    @javax.inject.Qualifier()
    public static abstract @interface ExampleServiceCallback {
    }
}