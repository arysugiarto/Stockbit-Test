package com.stockbit.hiring.base;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 0*\u0004\b\u0000\u0010\u0001*\b\b\u0001\u0010\u0002*\u00020\u00032\u0018\u0012\u0014\u0012\u00120\u0005R\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00020\u00000\u0004:\u0005/0123B?\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0007\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00010\r\u00a2\u0006\u0002\u0010\u000eJ\b\u0010$\u001a\u00020%H\u0016J(\u0010&\u001a\u00020!2\u0016\u0010\'\u001a\u00120\u0005R\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010(\u001a\u00020%H\u0016J(\u0010)\u001a\u00120\u0005R\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020%H\u0016J>\u0010-\u001a\u00020!26\u0010.\u001a2\u0012\u0013\u0012\u00118\u0001\u00a2\u0006\f\b\u001d\u0012\b\b\u001e\u0012\u0004\b\b(\u001f\u0012\u0013\u0012\u00118\u0000\u00a2\u0006\f\b\u001d\u0012\b\b\u001e\u0012\u0004\b\b( \u0012\u0004\u0012\u00020!0\u001cR\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0010X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u0011\u001a\u0010\u0012\f\u0012\n \u0013*\u0004\u0018\u00018\u00008\u00000\u0012X\u0082\u0004\u00a2\u0006\u0002\n\u0000R0\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u00152\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u00158F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR>\u0010\u001b\u001a2\u0012\u0013\u0012\u00118\u0001\u00a2\u0006\f\b\u001d\u0012\b\b\u001e\u0012\u0004\b\b(\u001f\u0012\u0013\u0012\u00118\u0000\u00a2\u0006\f\b\u001d\u0012\b\b\u001e\u0012\u0004\b\b( \u0012\u0004\u0012\u00020!0\u001cX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001c\u0010\"\u001a\u0010\u0012\f\u0012\n \u0013*\u0004\u0018\u00018\u00018\u00010#X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u00064"}, d2 = {"Lcom/stockbit/hiring/base/BaseViewAdapter;", "T", "V", "Landroid/view/View;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/stockbit/hiring/base/BaseViewAdapter$BaseViewHolder;", "register", "Lcom/stockbit/hiring/base/BaseViewAdapter$Register;", "diff", "Lcom/stockbit/hiring/base/BaseViewAdapter$Diff;", "params", "Lcom/stockbit/hiring/base/BaseViewAdapter$Params;", "viewClass", "Ljava/lang/Class;", "(Lcom/stockbit/hiring/base/BaseViewAdapter$Register;Lcom/stockbit/hiring/base/BaseViewAdapter$Diff;Lcom/stockbit/hiring/base/BaseViewAdapter$Params;Ljava/lang/Class;)V", "diffCallBack", "Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "diffUtil", "Landroidx/recyclerview/widget/AsyncListDiffer;", "kotlin.jvm.PlatformType", "value", "", "items", "getItems", "()Ljava/util/List;", "setItems", "(Ljava/util/List;)V", "onItemClickCallback", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "view", "item", "", "viewConstructor", "Ljava/lang/reflect/Constructor;", "getItemCount", "", "onBindViewHolder", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setOnItemClickListener", "callback", "BaseViewHolder", "Companion", "Diff", "Params", "Register", "app_devDebug"})
public final class BaseViewAdapter<T extends java.lang.Object, V extends android.view.View> extends androidx.recyclerview.widget.RecyclerView.Adapter<com.stockbit.hiring.base.BaseViewAdapter<T, V>.BaseViewHolder> {
    private final java.lang.reflect.Constructor<V> viewConstructor = null;
    private final androidx.recyclerview.widget.DiffUtil.ItemCallback<T> diffCallBack = null;
    private final androidx.recyclerview.widget.AsyncListDiffer<T> diffUtil = null;
    private kotlin.jvm.functions.Function2<? super V, ? super T, kotlin.Unit> onItemClickCallback;
    private com.stockbit.hiring.base.BaseViewAdapter.Register<T, V> register;
    private com.stockbit.hiring.base.BaseViewAdapter.Diff<T> diff;
    private com.stockbit.hiring.base.BaseViewAdapter.Params params;
    @org.jetbrains.annotations.NotNull()
    public static final com.stockbit.hiring.base.BaseViewAdapter.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<T> getItems() {
        return null;
    }
    
    public final void setItems(@org.jetbrains.annotations.NotNull()
    java.util.List<? extends T> value) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.stockbit.hiring.base.BaseViewAdapter<T, V>.BaseViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.stockbit.hiring.base.BaseViewAdapter<T, V>.BaseViewHolder holder, int position) {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    public final void setOnItemClickListener(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function2<? super V, ? super T, kotlin.Unit> callback) {
    }
    
    public BaseViewAdapter(@org.jetbrains.annotations.NotNull()
    com.stockbit.hiring.base.BaseViewAdapter.Register<T, V> register, @org.jetbrains.annotations.NotNull()
    com.stockbit.hiring.base.BaseViewAdapter.Diff<T> diff, @org.jetbrains.annotations.NotNull()
    com.stockbit.hiring.base.BaseViewAdapter.Params params, @org.jetbrains.annotations.NotNull()
    java.lang.Class<V> viewClass) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00028\u0001\u00a2\u0006\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00028\u0000\u00a2\u0006\u0002\u0010\u0007\u00a8\u0006\b"}, d2 = {"Lcom/stockbit/hiring/base/BaseViewAdapter$BaseViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "(Lcom/stockbit/hiring/base/BaseViewAdapter;Landroid/view/View;)V", "bind", "", "item", "(Ljava/lang/Object;)V", "app_devDebug"})
    public final class BaseViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        
        public final void bind(T item) {
        }
        
        public BaseViewHolder(@org.jetbrains.annotations.NotNull()
        V itemView) {
            super(null);
        }
    }
    
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u0000*\u0004\b\u0002\u0010\u0001*\b\b\u0003\u0010\u0002*\u00020\u00032\u00020\u0004B\\\u0012K\u0010\u0005\u001aG\u0012\u0013\u0012\u00110\u0007\u00a2\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0013\u0012\u00118\u0002\u00a2\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\u000b\u0012\u0013\u0012\u00118\u0003\u00a2\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00020\r0\u0006\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000f\u00a2\u0006\u0002\u0010\u0010JN\u0010\u0019\u001aG\u0012\u0013\u0012\u00110\u0007\u00a2\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0013\u0012\u00118\u0002\u00a2\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\u000b\u0012\u0013\u0012\u00118\u0003\u00a2\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00020\r0\u0006H\u00c6\u0003J\t\u0010\u001a\u001a\u00020\u000fH\u00c6\u0003Jn\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u00002M\b\u0002\u0010\u0005\u001aG\u0012\u0013\u0012\u00110\u0007\u00a2\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0013\u0012\u00118\u0002\u00a2\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\u000b\u0012\u0013\u0012\u00118\u0003\u00a2\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00020\r0\u00062\b\b\u0002\u0010\u000e\u001a\u00020\u000fH\u00c6\u0001J\u0013\u0010\u001c\u001a\u00020\u000f2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0004H\u00d6\u0003J\t\u0010\u001e\u001a\u00020\u0007H\u00d6\u0001J\t\u0010\u001f\u001a\u00020 H\u00d6\u0001R\u001a\u0010\u000e\u001a\u00020\u000fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R_\u0010\u0005\u001aG\u0012\u0013\u0012\u00110\u0007\u00a2\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0013\u0012\u00118\u0002\u00a2\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\u000b\u0012\u0013\u0012\u00118\u0003\u00a2\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00020\r0\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018\u00a8\u0006!"}, d2 = {"Lcom/stockbit/hiring/base/BaseViewAdapter$Register;", "T", "V", "Landroid/view/View;", "", "onBindHolder", "Lkotlin/Function3;", "", "Lkotlin/ParameterName;", "name", "position", "item", "view", "", "asyncLayout", "", "(Lkotlin/jvm/functions/Function3;Z)V", "getAsyncLayout", "()Z", "setAsyncLayout", "(Z)V", "getOnBindHolder", "()Lkotlin/jvm/functions/Function3;", "setOnBindHolder", "(Lkotlin/jvm/functions/Function3;)V", "component1", "component2", "copy", "equals", "other", "hashCode", "toString", "", "app_devDebug"})
    public static final class Register<T extends java.lang.Object, V extends android.view.View> {
        @org.jetbrains.annotations.NotNull()
        private kotlin.jvm.functions.Function3<? super java.lang.Integer, ? super T, ? super V, kotlin.Unit> onBindHolder;
        private boolean asyncLayout;
        
        @org.jetbrains.annotations.NotNull()
        public final kotlin.jvm.functions.Function3<java.lang.Integer, T, V, kotlin.Unit> getOnBindHolder() {
            return null;
        }
        
        public final void setOnBindHolder(@org.jetbrains.annotations.NotNull()
        kotlin.jvm.functions.Function3<? super java.lang.Integer, ? super T, ? super V, kotlin.Unit> p0) {
        }
        
        public final boolean getAsyncLayout() {
            return false;
        }
        
        public final void setAsyncLayout(boolean p0) {
        }
        
        public Register(@org.jetbrains.annotations.NotNull()
        kotlin.jvm.functions.Function3<? super java.lang.Integer, ? super T, ? super V, kotlin.Unit> onBindHolder, boolean asyncLayout) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final kotlin.jvm.functions.Function3<java.lang.Integer, T, V, kotlin.Unit> component1() {
            return null;
        }
        
        public final boolean component2() {
            return false;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.stockbit.hiring.base.BaseViewAdapter.Register<T, V> copy(@org.jetbrains.annotations.NotNull()
        kotlin.jvm.functions.Function3<? super java.lang.Integer, ? super T, ? super V, kotlin.Unit> onBindHolder, boolean asyncLayout) {
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
    
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u0000*\u0004\b\u0002\u0010\u00012\u00020\u0002Bu\u00126\u0010\u0003\u001a2\u0012\u0013\u0012\u00118\u0002\u00a2\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0013\u0012\u00118\u0002\u00a2\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\b\u0012\u0004\u0012\u00020\t0\u0004\u00126\u0010\n\u001a2\u0012\u0013\u0012\u00118\u0002\u00a2\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0013\u0012\u00118\u0002\u00a2\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\b\u0012\u0004\u0012\u00020\t0\u0004\u00a2\u0006\u0002\u0010\u000bJ9\u0010\u0012\u001a2\u0012\u0013\u0012\u00118\u0002\u00a2\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0013\u0012\u00118\u0002\u00a2\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\b\u0012\u0004\u0012\u00020\t0\u0004H\u00c6\u0003J9\u0010\u0013\u001a2\u0012\u0013\u0012\u00118\u0002\u00a2\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0013\u0012\u00118\u0002\u00a2\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\b\u0012\u0004\u0012\u00020\t0\u0004H\u00c6\u0003J\u0083\u0001\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00020\u000028\b\u0002\u0010\u0003\u001a2\u0012\u0013\u0012\u00118\u0002\u00a2\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0013\u0012\u00118\u0002\u00a2\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\b\u0012\u0004\u0012\u00020\t0\u000428\b\u0002\u0010\n\u001a2\u0012\u0013\u0012\u00118\u0002\u00a2\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0013\u0012\u00118\u0002\u00a2\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\b\u0012\u0004\u0012\u00020\t0\u0004H\u00c6\u0001J\u0013\u0010\u0015\u001a\u00020\t2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0002H\u00d6\u0003J\t\u0010\u0017\u001a\u00020\u0018H\u00d6\u0001J\t\u0010\u0019\u001a\u00020\u001aH\u00d6\u0001RJ\u0010\u0003\u001a2\u0012\u0013\u0012\u00118\u0002\u00a2\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0013\u0012\u00118\u0002\u00a2\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\b\u0012\u0004\u0012\u00020\t0\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fRJ\u0010\n\u001a2\u0012\u0013\u0012\u00118\u0002\u00a2\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0013\u0012\u00118\u0002\u00a2\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\b\u0012\u0004\u0012\u00020\t0\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\r\"\u0004\b\u0011\u0010\u000f\u00a8\u0006\u001b"}, d2 = {"Lcom/stockbit/hiring/base/BaseViewAdapter$Diff;", "T", "", "areContentsTheSame", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "old", "new", "", "areItemsTheSame", "(Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;)V", "getAreContentsTheSame", "()Lkotlin/jvm/functions/Function2;", "setAreContentsTheSame", "(Lkotlin/jvm/functions/Function2;)V", "getAreItemsTheSame", "setAreItemsTheSame", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "", "app_devDebug"})
    public static final class Diff<T extends java.lang.Object> {
        @org.jetbrains.annotations.NotNull()
        private kotlin.jvm.functions.Function2<? super T, ? super T, java.lang.Boolean> areContentsTheSame;
        @org.jetbrains.annotations.NotNull()
        private kotlin.jvm.functions.Function2<? super T, ? super T, java.lang.Boolean> areItemsTheSame;
        
        @org.jetbrains.annotations.NotNull()
        public final kotlin.jvm.functions.Function2<T, T, java.lang.Boolean> getAreContentsTheSame() {
            return null;
        }
        
        public final void setAreContentsTheSame(@org.jetbrains.annotations.NotNull()
        kotlin.jvm.functions.Function2<? super T, ? super T, java.lang.Boolean> p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final kotlin.jvm.functions.Function2<T, T, java.lang.Boolean> getAreItemsTheSame() {
            return null;
        }
        
        public final void setAreItemsTheSame(@org.jetbrains.annotations.NotNull()
        kotlin.jvm.functions.Function2<? super T, ? super T, java.lang.Boolean> p0) {
        }
        
        public Diff(@org.jetbrains.annotations.NotNull()
        kotlin.jvm.functions.Function2<? super T, ? super T, java.lang.Boolean> areContentsTheSame, @org.jetbrains.annotations.NotNull()
        kotlin.jvm.functions.Function2<? super T, ? super T, java.lang.Boolean> areItemsTheSame) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final kotlin.jvm.functions.Function2<T, T, java.lang.Boolean> component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final kotlin.jvm.functions.Function2<T, T, java.lang.Boolean> component2() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.stockbit.hiring.base.BaseViewAdapter.Diff<T> copy(@org.jetbrains.annotations.NotNull()
        kotlin.jvm.functions.Function2<? super T, ? super T, java.lang.Boolean> areContentsTheSame, @org.jetbrains.annotations.NotNull()
        kotlin.jvm.functions.Function2<? super T, ? super T, java.lang.Boolean> areItemsTheSame) {
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
    
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u001dB#\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J\t\u0010\u0012\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0013\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0014\u001a\u00020\u0006H\u00c6\u0003J\'\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006H\u00c6\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0019\u001a\u00020\u001aH\u00d6\u0001J\t\u0010\u001b\u001a\u00020\u001cH\u00d6\u0001R\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\t\"\u0004\b\u0011\u0010\u000b\u00a8\u0006\u001e"}, d2 = {"Lcom/stockbit/hiring/base/BaseViewAdapter$Params;", "", "widthPercent", "", "heightPercent", "margin", "Lcom/stockbit/hiring/base/BaseViewAdapter$Params$Margin;", "(DDLcom/stockbit/hiring/base/BaseViewAdapter$Params$Margin;)V", "getHeightPercent", "()D", "setHeightPercent", "(D)V", "getMargin", "()Lcom/stockbit/hiring/base/BaseViewAdapter$Params$Margin;", "setMargin", "(Lcom/stockbit/hiring/base/BaseViewAdapter$Params$Margin;)V", "getWidthPercent", "setWidthPercent", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "Margin", "app_devDebug"})
    public static final class Params {
        private double widthPercent;
        private double heightPercent;
        @org.jetbrains.annotations.NotNull()
        private com.stockbit.hiring.base.BaseViewAdapter.Params.Margin margin;
        
        public final double getWidthPercent() {
            return 0.0;
        }
        
        public final void setWidthPercent(double p0) {
        }
        
        public final double getHeightPercent() {
            return 0.0;
        }
        
        public final void setHeightPercent(double p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.stockbit.hiring.base.BaseViewAdapter.Params.Margin getMargin() {
            return null;
        }
        
        public final void setMargin(@org.jetbrains.annotations.NotNull()
        com.stockbit.hiring.base.BaseViewAdapter.Params.Margin p0) {
        }
        
        public Params(double widthPercent, double heightPercent, @org.jetbrains.annotations.NotNull()
        com.stockbit.hiring.base.BaseViewAdapter.Params.Margin margin) {
            super();
        }
        
        public Params() {
            super();
        }
        
        public final double component1() {
            return 0.0;
        }
        
        public final double component2() {
            return 0.0;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.stockbit.hiring.base.BaseViewAdapter.Params.Margin component3() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.stockbit.hiring.base.BaseViewAdapter.Params copy(double widthPercent, double heightPercent, @org.jetbrains.annotations.NotNull()
        com.stockbit.hiring.base.BaseViewAdapter.Params.Margin margin) {
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
        
        @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B-\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u000e\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u000f\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0010\u001a\u00020\u0003H\u00c6\u0003J1\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0015\u001a\u00020\u0003H\u00d6\u0001J\t\u0010\u0016\u001a\u00020\u0017H\u00d6\u0001R\u0011\u0010\u0006\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t\u00a8\u0006\u0018"}, d2 = {"Lcom/stockbit/hiring/base/BaseViewAdapter$Params$Margin;", "", "top", "", "left", "right", "bottom", "(IIII)V", "getBottom", "()I", "getLeft", "getRight", "getTop", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "", "app_devDebug"})
        public static final class Margin {
            private final int top = 0;
            private final int left = 0;
            private final int right = 0;
            private final int bottom = 0;
            
            public final int getTop() {
                return 0;
            }
            
            public final int getLeft() {
                return 0;
            }
            
            public final int getRight() {
                return 0;
            }
            
            public final int getBottom() {
                return 0;
            }
            
            public Margin(int top, int left, int right, int bottom) {
                super();
            }
            
            public Margin() {
                super();
            }
            
            public final int component1() {
                return 0;
            }
            
            public final int component2() {
                return 0;
            }
            
            public final int component3() {
                return 0;
            }
            
            public final int component4() {
                return 0;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final com.stockbit.hiring.base.BaseViewAdapter.Params.Margin copy(int top, int left, int right, int bottom) {
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
    }
    
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002Jc\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u0002H\u0005\u0012\u0004\u0012\u0002H\u00060\u0004\"\u0004\b\u0002\u0010\u0005\"\n\b\u0003\u0010\u0006\u0018\u0001*\u00020\u00072\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u0002H\u0005\u0012\u0004\u0012\u0002H\u00060\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u0002H\u00050\u000b2\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u0002H\u00050\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000fH\u0086\bJG\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u0002H\u00060\u0004\"\n\b\u0002\u0010\u0006\u0018\u0001*\u00020\u00072\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u0002H\u00060\t2\u0006\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u000e\u001a\u00020\u000fH\u0086\b\u00a8\u0006\u0013"}, d2 = {"Lcom/stockbit/hiring/base/BaseViewAdapter$Companion;", "", "()V", "adapterOf", "Lcom/stockbit/hiring/base/BaseViewAdapter;", "T", "V", "Landroid/view/View;", "register", "Lcom/stockbit/hiring/base/BaseViewAdapter$Register;", "diff", "Lcom/stockbit/hiring/base/BaseViewAdapter$Diff;", "itemList", "", "params", "Lcom/stockbit/hiring/base/BaseViewAdapter$Params;", "shimmerAdapter", "", "size", "app_devDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}