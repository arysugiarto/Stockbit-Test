package com.stockbit.hiring.data.di;

import java.lang.System;

@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\tH\u0007J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0007\u00a8\u0006\u000e"}, d2 = {"Lcom/stockbit/hiring/data/di/ApplicationModule;", "", "()V", "provideAccessManager", "Lcom/stockbit/hiring/data/local/preferences/AccessManager;", "context", "Landroid/content/Context;", "provideApplication", "application", "Landroid/app/Application;", "provideExampleepository", "Lcom/stockbit/hiring/data/repository/ExampleRepository;", "provideDefaultApiCallback", "Lcom/stockbit/hiring/data/remote/api/ExampleServiceCallback;", "app_devDebug"})
@dagger.Module(includes = {com.stockbit.hiring.data.di.DatabaseModule.class})
public final class ApplicationModule {
    @org.jetbrains.annotations.NotNull()
    public static final com.stockbit.hiring.data.di.ApplicationModule INSTANCE = null;
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final android.content.Context provideApplication(@org.jetbrains.annotations.NotNull()
    android.app.Application application) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final com.stockbit.hiring.data.local.preferences.AccessManager provideAccessManager(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final com.stockbit.hiring.data.repository.ExampleRepository provideExampleepository(@org.jetbrains.annotations.NotNull()
    com.stockbit.hiring.data.remote.api.ExampleServiceCallback provideDefaultApiCallback) {
        return null;
    }
    
    private ApplicationModule() {
        super();
    }
}