package com.stockbit.hiring.base;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004JR\u0010\u001c\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u001e0\u001d0\r\"\u0004\b\u0000\u0010\u001e2/\b\u0004\u0010\u001f\u001a)\u0012\u0013\u0012\u00110\u000e\u00a2\u0006\f\b!\u0012\b\b\"\u0012\u0004\b\b(\u001c\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u001e0\u001d0\r0 H\u0086\b\u00f8\u0001\u0000\u00f8\u0001\u0001J\b\u0010#\u001a\u00020\u0007H\u0002J\u0006\u0010$\u001a\u00020%J\b\u0010&\u001a\u00020%H\u0014R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\b\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0013\u001a\u00020\u00078F\u00a2\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00070\u00178F\u00a2\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u000e\u0010\u001a\u001a\u00020\u001bX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b\u009920\u0001\u00a8\u0006\'"}, d2 = {"Lcom/stockbit/hiring/base/BaseViewModel;", "Landroidx/lifecycle/AndroidViewModel;", "application", "Landroid/app/Application;", "(Landroid/app/Application;)V", "_hasInternetConnectionLiveData", "Landroidx/lifecycle/MutableLiveData;", "", "accessManager", "Lcom/stockbit/hiring/data/local/preferences/AccessManager;", "getAccessManager", "()Lcom/stockbit/hiring/data/local/preferences/AccessManager;", "accessTokenFlow", "Lkotlinx/coroutines/flow/Flow;", "", "getAccessTokenFlow", "()Lkotlinx/coroutines/flow/Flow;", "connectivityManager", "Landroid/net/ConnectivityManager;", "hasInternet", "getHasInternet", "()Z", "hasInternetLiveData", "Landroidx/lifecycle/LiveData;", "getHasInternetLiveData", "()Landroidx/lifecycle/LiveData;", "internetCallback", "Landroid/net/ConnectivityManager$NetworkCallback;", "accessToken", "Lkotlin/Result;", "T", "result", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "checkInternetPermission", "observeNetworkCallback", "", "onCleared", "app_devDebug"})
public class BaseViewModel extends androidx.lifecycle.AndroidViewModel {
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> _hasInternetConnectionLiveData = null;
    @org.jetbrains.annotations.NotNull()
    private final com.stockbit.hiring.data.local.preferences.AccessManager accessManager = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.Flow<java.lang.String> accessTokenFlow = null;
    private final android.net.ConnectivityManager connectivityManager = null;
    private final android.net.ConnectivityManager.NetworkCallback internetCallback = null;
    
    public final boolean getHasInternet() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.Boolean> getHasInternetLiveData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.stockbit.hiring.data.local.preferences.AccessManager getAccessManager() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<java.lang.String> getAccessTokenFlow() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final <T extends java.lang.Object>kotlinx.coroutines.flow.Flow<kotlin.Result<T>> accessToken(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.String, ? extends kotlinx.coroutines.flow.Flow<? extends kotlin.Result<? extends T>>> result) {
        return null;
    }
    
    private final boolean checkInternetPermission() {
        return false;
    }
    
    public final void observeNetworkCallback() {
    }
    
    @java.lang.Override()
    protected void onCleared() {
    }
    
    public BaseViewModel(@org.jetbrains.annotations.NotNull()
    android.app.Application application) {
        super(null);
    }
}