package com.stockbit.hiring.util;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 2, d1 = {"\u0000j\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a[\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\f0\u000b0\n\"\u0004\b\u0000\u0010\f\"\u0004\b\u0001\u0010\r20\b\u0004\u0010\u000e\u001a*\b\u0001\u0012\u001c\u0012\u001a\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\f\u0012\u0004\u0012\u0002H\r0\u00120\u00110\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u000fH\u0086\b\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0014\u001a\"\u0010\u0015\u001a\u0002H\f\"\u0006\b\u0000\u0010\f\u0018\u0001*\u00020\u00012\u0006\u0010\u0016\u001a\u00020\u0005H\u0086\b\u00a2\u0006\u0002\u0010\u0017\u001a\u0012\u0010\u0018\u001a\u00020\u0005*\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0005\u001a\n\u0010\u001b\u001a\u00020\u0005*\u00020\u001c\u001a\f\u0010\u001d\u001a\u00020\u0005*\u00020\u0006H\u0002\u001a\u001c\u0010\u001e\u001a\u0004\u0018\u0001H\f\"\u0006\b\u0000\u0010\f\u0018\u0001*\u00020\u001fH\u0086\b\u00a2\u0006\u0002\u0010 \u001aE\u0010!\u001a\u00020\"*\u00020\u000123\u0010\u0016\u001a/\u0012 \u0012\u001e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00130#j\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0013`$\u0012\u0004\u0012\u00020%0\u000f\u00a2\u0006\u0002\b&H\u0086\b\u00f8\u0001\u0001\u001aE\u0010\'\u001a\u00020\u0005*\u00020\u000123\u0010\u0016\u001a/\u0012 \u0012\u001e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00130#j\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0013`$\u0012\u0004\u0012\u00020%0\u000f\u00a2\u0006\u0002\b&H\u0086\b\u00f8\u0001\u0001\"\u0011\u0010\u0000\u001a\u00020\u00018F\u00a2\u0006\u0006\u001a\u0004\b\u0002\u0010\u0003\"\u0015\u0010\u0004\u001a\u00020\u0005*\u00020\u00068F\u00a2\u0006\u0006\u001a\u0004\b\u0007\u0010\b\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b\u009920\u0001\u00a8\u0006("}, d2 = {"gson", "Lcom/google/gson/Gson;", "getGson", "()Lcom/google/gson/Gson;", "parsedMessage", "", "", "getParsedMessage", "(Ljava/lang/Throwable;)Ljava/lang/String;", "flowResponse", "Lkotlinx/coroutines/flow/Flow;", "Lcom/stockbit/hiring/data/remote/Result;", "T", "X", "responseBody", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "Lretrofit2/Response;", "Lcom/stockbit/hiring/base/BaseResponse;", "", "(Lkotlin/jvm/functions/Function1;)Lkotlinx/coroutines/flow/Flow;", "fromJson", "source", "(Lcom/google/gson/Gson;Ljava/lang/String;)Ljava/lang/Object;", "getFieldOrNull", "Lorg/json/JSONObject;", "field", "handleCode", "", "handleException", "parse", "Lokhttp3/ResponseBody;", "(Lokhttp3/ResponseBody;)Ljava/lang/Object;", "toJsonElement", "Lcom/google/gson/JsonElement;", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "", "Lkotlin/ExtensionFunctionType;", "toJsonString", "app_devDebug"})
public final class NetworkExtensionKt {
    
    @org.jetbrains.annotations.NotNull()
    public static final com.google.gson.Gson getGson() {
        return null;
    }
    
    /**
     * Get Value From JSONObject Field and return Empty when field not recognized
     */
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String getFieldOrNull(@org.jetbrains.annotations.NotNull()
    org.json.JSONObject $this$getFieldOrNull, @org.jetbrains.annotations.NotNull()
    java.lang.String field) {
        return null;
    }
    
    /**
     * Convert any Value within pair of Field and Value to JsonObject
     */
    @org.jetbrains.annotations.NotNull()
    public static final com.google.gson.JsonElement toJsonElement(@org.jetbrains.annotations.NotNull()
    com.google.gson.Gson $this$toJsonElement, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.util.HashMap<java.lang.String, java.lang.Object>, kotlin.Unit> source) {
        return null;
    }
    
    /**
     * Convert any Value within pair of Field and Value to JsonString
     */
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String toJsonString(@org.jetbrains.annotations.NotNull()
    com.google.gson.Gson $this$toJsonString, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.util.HashMap<java.lang.String, java.lang.Object>, kotlin.Unit> source) {
        return null;
    }
    
    /**
     * Convert [Int] from error Body to Custom Error Message
     */
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String handleCode(int $this$handleCode) {
        return null;
    }
    
    private static final java.lang.String handleException(java.lang.Throwable $this$handleException) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String getParsedMessage(@org.jetbrains.annotations.NotNull()
    java.lang.Throwable $this$parsedMessage) {
        return null;
    }
    
    /**
     * @return [Flow] of [Result] object with 3 Step of Result Handling
     * @param responseBody Used for [Response] callback value from ApiCallback
     */
    @org.jetbrains.annotations.NotNull()
    public static final <T extends java.lang.Object, X extends java.lang.Object>kotlinx.coroutines.flow.Flow<com.stockbit.hiring.data.remote.Result<T>> flowResponse(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super kotlin.coroutines.Continuation<? super retrofit2.Response<com.stockbit.hiring.base.BaseResponse<T, X>>>, ? extends java.lang.Object> responseBody) {
        return null;
    }
}