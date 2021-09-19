package com.stockbit.hiring.base;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b*\b\u0086\b\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u00020\u0003BU\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00018\u0000\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00018\u0001\u00a2\u0006\u0002\u0010\u000eJ\u0010\u0010)\u001a\u0004\u0018\u00018\u0000H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0010J\u000b\u0010*\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\t\u0010+\u001a\u00020\u0007H\u00c6\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\tH\u00c6\u0003J\u0010\u0010-\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003\u00a2\u0006\u0002\u0010%J\t\u0010.\u001a\u00020\fH\u00c6\u0003J\u0010\u0010/\u001a\u0004\u0018\u00018\u0001H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0010Jj\u00100\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00018\u00002\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\u000b\u001a\u00020\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00018\u0001H\u00c6\u0001\u00a2\u0006\u0002\u00101J\u0013\u00102\u001a\u00020\f2\b\u00103\u001a\u0004\u0018\u00010\u0003H\u00d6\u0003J\t\u00104\u001a\u00020\u0007H\u00d6\u0001J\t\u00105\u001a\u00020\tH\u00d6\u0001R\u001e\u0010\u0004\u001a\u0004\u0018\u00018\u0000X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\u0013\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001a\u0010\u000b\u001a\u00020\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001e\u0010\r\u001a\u0004\u0018\u00018\u0001X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\u0013\u001a\u0004\b\u0018\u0010\u0010\"\u0004\b\u0019\u0010\u0012R\u001c\u0010\b\u001a\u0004\u0018\u00010\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u0010\"\u0004\b\u001f\u0010\u0012R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u001e\u0010\n\u001a\u0004\u0018\u00010\u0007X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010(\u001a\u0004\b$\u0010%\"\u0004\b&\u0010\'\u00a8\u00066"}, d2 = {"Lcom/stockbit/hiring/base/BaseResponse;", "T", "X", "", "data", "status", "status_code", "", "message", "", "total", "error", "", "errors", "(Ljava/lang/Object;Ljava/lang/Object;ILjava/lang/String;Ljava/lang/Integer;ZLjava/lang/Object;)V", "getData", "()Ljava/lang/Object;", "setData", "(Ljava/lang/Object;)V", "Ljava/lang/Object;", "getError", "()Z", "setError", "(Z)V", "getErrors", "setErrors", "getMessage", "()Ljava/lang/String;", "setMessage", "(Ljava/lang/String;)V", "getStatus", "setStatus", "getStatus_code", "()I", "setStatus_code", "(I)V", "getTotal", "()Ljava/lang/Integer;", "setTotal", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "(Ljava/lang/Object;Ljava/lang/Object;ILjava/lang/String;Ljava/lang/Integer;ZLjava/lang/Object;)Lcom/stockbit/hiring/base/BaseResponse;", "equals", "other", "hashCode", "toString", "app_devDebug"})
public final class BaseResponse<T extends java.lang.Object, X extends java.lang.Object> {
    @org.jetbrains.annotations.Nullable()
    private T data;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Object status;
    private int status_code;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String message;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Integer total;
    private boolean error;
    @org.jetbrains.annotations.Nullable()
    private X errors;
    
    @org.jetbrains.annotations.Nullable()
    public final T getData() {
        return null;
    }
    
    public final void setData(@org.jetbrains.annotations.Nullable()
    T p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getStatus() {
        return null;
    }
    
    public final void setStatus(@org.jetbrains.annotations.Nullable()
    java.lang.Object p0) {
    }
    
    public final int getStatus_code() {
        return 0;
    }
    
    public final void setStatus_code(int p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getMessage() {
        return null;
    }
    
    public final void setMessage(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getTotal() {
        return null;
    }
    
    public final void setTotal(@org.jetbrains.annotations.Nullable()
    java.lang.Integer p0) {
    }
    
    public final boolean getError() {
        return false;
    }
    
    public final void setError(boolean p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final X getErrors() {
        return null;
    }
    
    public final void setErrors(@org.jetbrains.annotations.Nullable()
    X p0) {
    }
    
    public BaseResponse(@org.jetbrains.annotations.Nullable()
    T data, @org.jetbrains.annotations.Nullable()
    java.lang.Object status, int status_code, @org.jetbrains.annotations.Nullable()
    java.lang.String message, @org.jetbrains.annotations.Nullable()
    java.lang.Integer total, boolean error, @org.jetbrains.annotations.Nullable()
    X errors) {
        super();
    }
    
    public BaseResponse() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final T component1() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object component2() {
        return null;
    }
    
    public final int component3() {
        return 0;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component4() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component5() {
        return null;
    }
    
    public final boolean component6() {
        return false;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final X component7() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.stockbit.hiring.base.BaseResponse<T, X> copy(@org.jetbrains.annotations.Nullable()
    T data, @org.jetbrains.annotations.Nullable()
    java.lang.Object status, int status_code, @org.jetbrains.annotations.Nullable()
    java.lang.String message, @org.jetbrains.annotations.Nullable()
    java.lang.Integer total, boolean error, @org.jetbrains.annotations.Nullable()
    X errors) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object p0) {
        return false;
    }
}