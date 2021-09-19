package com.stockbit.hiring.util;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b,\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B_\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u00a2\u0006\u0002\u0010\u000fJ\t\u0010-\u001a\u00020\u0003H\u00c6\u0003J\t\u0010.\u001a\u00020\u0005H\u00c6\u0003J\t\u0010/\u001a\u00020\u0007H\u00c6\u0003J\u0010\u00100\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0011J\u000b\u00101\u001a\u0004\u0018\u00010\nH\u00c6\u0003J\u000b\u00102\u001a\u0004\u0018\u00010\nH\u00c6\u0003J\u0010\u00103\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0011J\u000b\u00104\u001a\u0004\u0018\u00010\u000eH\u00c6\u0003Jh\u00105\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000eH\u00c6\u0001\u00a2\u0006\u0002\u00106J\u0013\u00107\u001a\u00020\u00072\b\u00108\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u00109\u001a\u00020\u0005H\u00d6\u0001J\t\u0010:\u001a\u00020;H\u00d6\u0001R\u001e\u0010\f\u001a\u0004\u0018\u00010\u0005X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\u0014\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001e\u0010\b\u001a\u0004\u0018\u00010\u0005X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\u0014\u001a\u0004\b\u001d\u0010\u0011\"\u0004\b\u001e\u0010\u0013R\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u001a\"\u0004\b \u0010\u001cR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\u001c\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b%\u0010&\"\u0004\b\'\u0010(R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,\u00a8\u0006<"}, d2 = {"Lcom/stockbit/hiring/util/ImageOptionsBuilder;", "", "cornerOptions", "Lcom/stockbit/hiring/util/ImageCornerOptions;", "radius", "", "shimmerPlaceholder", "", "overrideSize", "placeHolder", "Landroid/graphics/drawable/Drawable;", "errorPlaceholder", "background", "scaleType", "Landroid/widget/ImageView$ScaleType;", "(Lcom/stockbit/hiring/util/ImageCornerOptions;IZLjava/lang/Integer;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Ljava/lang/Integer;Landroid/widget/ImageView$ScaleType;)V", "getBackground", "()Ljava/lang/Integer;", "setBackground", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getCornerOptions", "()Lcom/stockbit/hiring/util/ImageCornerOptions;", "setCornerOptions", "(Lcom/stockbit/hiring/util/ImageCornerOptions;)V", "getErrorPlaceholder", "()Landroid/graphics/drawable/Drawable;", "setErrorPlaceholder", "(Landroid/graphics/drawable/Drawable;)V", "getOverrideSize", "setOverrideSize", "getPlaceHolder", "setPlaceHolder", "getRadius", "()I", "setRadius", "(I)V", "getScaleType", "()Landroid/widget/ImageView$ScaleType;", "setScaleType", "(Landroid/widget/ImageView$ScaleType;)V", "getShimmerPlaceholder", "()Z", "setShimmerPlaceholder", "(Z)V", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "(Lcom/stockbit/hiring/util/ImageCornerOptions;IZLjava/lang/Integer;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Ljava/lang/Integer;Landroid/widget/ImageView$ScaleType;)Lcom/stockbit/hiring/util/ImageOptionsBuilder;", "equals", "other", "hashCode", "toString", "", "app_devDebug"})
public final class ImageOptionsBuilder {
    @org.jetbrains.annotations.NotNull()
    private com.stockbit.hiring.util.ImageCornerOptions cornerOptions;
    private int radius;
    private boolean shimmerPlaceholder;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Integer overrideSize;
    @org.jetbrains.annotations.Nullable()
    private android.graphics.drawable.Drawable placeHolder;
    @org.jetbrains.annotations.Nullable()
    private android.graphics.drawable.Drawable errorPlaceholder;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Integer background;
    @org.jetbrains.annotations.Nullable()
    private android.widget.ImageView.ScaleType scaleType;
    
    @org.jetbrains.annotations.NotNull()
    public final com.stockbit.hiring.util.ImageCornerOptions getCornerOptions() {
        return null;
    }
    
    public final void setCornerOptions(@org.jetbrains.annotations.NotNull()
    com.stockbit.hiring.util.ImageCornerOptions p0) {
    }
    
    public final int getRadius() {
        return 0;
    }
    
    public final void setRadius(int p0) {
    }
    
    public final boolean getShimmerPlaceholder() {
        return false;
    }
    
    public final void setShimmerPlaceholder(boolean p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getOverrideSize() {
        return null;
    }
    
    public final void setOverrideSize(@org.jetbrains.annotations.Nullable()
    java.lang.Integer p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final android.graphics.drawable.Drawable getPlaceHolder() {
        return null;
    }
    
    public final void setPlaceHolder(@org.jetbrains.annotations.Nullable()
    android.graphics.drawable.Drawable p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final android.graphics.drawable.Drawable getErrorPlaceholder() {
        return null;
    }
    
    public final void setErrorPlaceholder(@org.jetbrains.annotations.Nullable()
    android.graphics.drawable.Drawable p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getBackground() {
        return null;
    }
    
    public final void setBackground(@org.jetbrains.annotations.Nullable()
    java.lang.Integer p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final android.widget.ImageView.ScaleType getScaleType() {
        return null;
    }
    
    public final void setScaleType(@org.jetbrains.annotations.Nullable()
    android.widget.ImageView.ScaleType p0) {
    }
    
    public ImageOptionsBuilder(@org.jetbrains.annotations.NotNull()
    com.stockbit.hiring.util.ImageCornerOptions cornerOptions, int radius, boolean shimmerPlaceholder, @org.jetbrains.annotations.Nullable()
    java.lang.Integer overrideSize, @org.jetbrains.annotations.Nullable()
    android.graphics.drawable.Drawable placeHolder, @org.jetbrains.annotations.Nullable()
    android.graphics.drawable.Drawable errorPlaceholder, @org.jetbrains.annotations.Nullable()
    java.lang.Integer background, @org.jetbrains.annotations.Nullable()
    android.widget.ImageView.ScaleType scaleType) {
        super();
    }
    
    public ImageOptionsBuilder() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.stockbit.hiring.util.ImageCornerOptions component1() {
        return null;
    }
    
    public final int component2() {
        return 0;
    }
    
    public final boolean component3() {
        return false;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component4() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final android.graphics.drawable.Drawable component5() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final android.graphics.drawable.Drawable component6() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component7() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final android.widget.ImageView.ScaleType component8() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.stockbit.hiring.util.ImageOptionsBuilder copy(@org.jetbrains.annotations.NotNull()
    com.stockbit.hiring.util.ImageCornerOptions cornerOptions, int radius, boolean shimmerPlaceholder, @org.jetbrains.annotations.Nullable()
    java.lang.Integer overrideSize, @org.jetbrains.annotations.Nullable()
    android.graphics.drawable.Drawable placeHolder, @org.jetbrains.annotations.Nullable()
    android.graphics.drawable.Drawable errorPlaceholder, @org.jetbrains.annotations.Nullable()
    java.lang.Integer background, @org.jetbrains.annotations.Nullable()
    android.widget.ImageView.ScaleType scaleType) {
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