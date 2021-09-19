package com.stockbit.hiring.data.remote;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000 \u0004*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0005\u0004\u0005\u0006\u0007\bB\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0003\u0082\u0001\u0004\t\n\u000b\f\u00a8\u0006\r"}, d2 = {"Lcom/stockbit/hiring/data/remote/Result;", "T", "", "()V", "Companion", "Error", "Loading", "Nothing", "Success", "Lcom/stockbit/hiring/data/remote/Result$Nothing;", "Lcom/stockbit/hiring/data/remote/Result$Loading;", "Lcom/stockbit/hiring/data/remote/Result$Success;", "Lcom/stockbit/hiring/data/remote/Result$Error;", "app_devDebug"})
public abstract class Result<T extends java.lang.Object> {
    @org.jetbrains.annotations.NotNull()
    private static final com.stockbit.hiring.data.remote.Result.Nothing nothing = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.stockbit.hiring.data.remote.Result.Companion Companion = null;
    
    private Result() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0003\u00a8\u0006\u0004"}, d2 = {"Lcom/stockbit/hiring/data/remote/Result$Nothing;", "Lcom/stockbit/hiring/data/remote/Result;", "", "()V", "app_devDebug"})
    public static final class Nothing extends com.stockbit.hiring.data.remote.Result {
        @org.jetbrains.annotations.NotNull()
        public static final com.stockbit.hiring.data.remote.Result.Nothing INSTANCE = null;
        
        private Nothing() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003\u00a8\u0006\u0004"}, d2 = {"Lcom/stockbit/hiring/data/remote/Result$Loading;", "T", "Lcom/stockbit/hiring/data/remote/Result;", "()V", "app_devDebug"})
    public static final class Loading<T extends java.lang.Object> extends com.stockbit.hiring.data.remote.Result<T> {
        
        public Loading() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u000f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00018\u0001\u00a2\u0006\u0002\u0010\u0004R\u0015\u0010\u0003\u001a\u0004\u0018\u00018\u0001\u00a2\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\b"}, d2 = {"Lcom/stockbit/hiring/data/remote/Result$Success;", "T", "Lcom/stockbit/hiring/data/remote/Result;", "data", "(Ljava/lang/Object;)V", "getData", "()Ljava/lang/Object;", "Ljava/lang/Object;", "app_devDebug"})
    public static final class Success<T extends java.lang.Object> extends com.stockbit.hiring.data.remote.Result<T> {
        @org.jetbrains.annotations.Nullable()
        private final T data = null;
        
        @org.jetbrains.annotations.Nullable()
        public final T getData() {
            return null;
        }
        
        public Success(@org.jetbrains.annotations.Nullable()
        T data) {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\u0018\u0000*\u0004\b\u0001\u0010\u0001*\u0004\b\u0002\u0010\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003B#\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00018\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u00a2\u0006\u0002\u0010\tR\u0015\u0010\u0006\u001a\u0004\u0018\u00018\u0002\u00a2\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010\u00a8\u0006\u0011"}, d2 = {"Lcom/stockbit/hiring/data/remote/Result$Error;", "T", "X", "Lcom/stockbit/hiring/data/remote/Result;", "message", "", "data", "status_code", "", "(Ljava/lang/String;Ljava/lang/Object;I)V", "getData", "()Ljava/lang/Object;", "Ljava/lang/Object;", "getMessage", "()Ljava/lang/String;", "getStatus_code", "()I", "app_devDebug"})
    public static final class Error<T extends java.lang.Object, X extends java.lang.Object> extends com.stockbit.hiring.data.remote.Result<T> {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String message = null;
        @org.jetbrains.annotations.Nullable()
        private final X data = null;
        private final int status_code = 0;
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getMessage() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final X getData() {
            return null;
        }
        
        public final int getStatus_code() {
            return 0;
        }
        
        public Error(@org.jetbrains.annotations.NotNull()
        java.lang.String message, @org.jetbrains.annotations.Nullable()
        X data, int status_code) {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002JA\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u0002H\t\u0012\u0004\u0012\u0002H\n0\b\"\u0004\b\u0001\u0010\t\"\u0004\b\u0002\u0010\n2\u0006\u0010\u000b\u001a\u00020\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u0001H\n2\b\b\u0002\u0010\u000e\u001a\u00020\u000f\u00a2\u0006\u0002\u0010\u0010J\u0012\u0010\u0011\u001a\b\u0012\u0004\u0012\u0002H\t0\u0012\"\u0004\b\u0001\u0010\tJ!\u0010\u0013\u001a\b\u0012\u0004\u0012\u0002H\t0\u0014\"\u0004\b\u0001\u0010\t2\b\u0010\r\u001a\u0004\u0018\u0001H\t\u00a2\u0006\u0002\u0010\u0015R\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0016"}, d2 = {"Lcom/stockbit/hiring/data/remote/Result$Companion;", "", "()V", "nothing", "Lcom/stockbit/hiring/data/remote/Result$Nothing;", "getNothing", "()Lcom/stockbit/hiring/data/remote/Result$Nothing;", "error", "Lcom/stockbit/hiring/data/remote/Result$Error;", "T", "X", "message", "", "data", "code", "", "(Ljava/lang/String;Ljava/lang/Object;I)Lcom/stockbit/hiring/data/remote/Result$Error;", "loading", "Lcom/stockbit/hiring/data/remote/Result$Loading;", "success", "Lcom/stockbit/hiring/data/remote/Result$Success;", "(Ljava/lang/Object;)Lcom/stockbit/hiring/data/remote/Result$Success;", "app_devDebug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final com.stockbit.hiring.data.remote.Result.Nothing getNothing() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final <T extends java.lang.Object>com.stockbit.hiring.data.remote.Result.Loading<T> loading() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final <T extends java.lang.Object>com.stockbit.hiring.data.remote.Result.Success<T> success(@org.jetbrains.annotations.Nullable()
        T data) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final <T extends java.lang.Object, X extends java.lang.Object>com.stockbit.hiring.data.remote.Result.Error<T, X> error(@org.jetbrains.annotations.NotNull()
        java.lang.String message, @org.jetbrains.annotations.Nullable()
        X data, int code) {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}