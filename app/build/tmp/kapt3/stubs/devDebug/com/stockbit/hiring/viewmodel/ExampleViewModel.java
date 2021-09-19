package com.stockbit.hiring.viewmodel;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0006\u0010\u000e\u001a\u00020\u0010R \u0010\u0007\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R#\u0010\f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\t0\r8F\u00a2\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0011"}, d2 = {"Lcom/stockbit/hiring/viewmodel/ExampleViewModel;", "Lcom/stockbit/hiring/base/BaseViewModel;", "application", "Landroid/app/Application;", "repository", "Lcom/stockbit/hiring/data/repository/ExampleRepository;", "(Landroid/app/Application;Lcom/stockbit/hiring/data/repository/ExampleRepository;)V", "_example", "Landroidx/lifecycle/MutableLiveData;", "Lcom/stockbit/hiring/data/remote/Result;", "", "Lcom/stockbit/hiring/data/model/ExamplesModel;", "example", "Landroidx/lifecycle/LiveData;", "getExample", "()Landroidx/lifecycle/LiveData;", "Lkotlinx/coroutines/Job;", "app_devDebug"})
public final class ExampleViewModel extends com.stockbit.hiring.base.BaseViewModel {
    private final androidx.lifecycle.MutableLiveData<com.stockbit.hiring.data.remote.Result<java.util.List<com.stockbit.hiring.data.model.ExamplesModel>>> _example = null;
    private final com.stockbit.hiring.data.repository.ExampleRepository repository = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.stockbit.hiring.data.remote.Result<java.util.List<com.stockbit.hiring.data.model.ExamplesModel>>> getExample() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job getExample() {
        return null;
    }
    
    @javax.inject.Inject()
    public ExampleViewModel(@org.jetbrains.annotations.NotNull()
    android.app.Application application, @org.jetbrains.annotations.NotNull()
    com.stockbit.hiring.data.repository.ExampleRepository repository) {
        super(null);
    }
}