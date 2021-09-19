package com.stockbit.hiring.util;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 2, d1 = {"\u00004\n\u0000\n\u0002\u0010\b\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0016\u0010\u000b\u001a\u00020\u0001*\u0004\u0018\u00010\u00062\b\b\u0001\u0010\f\u001a\u00020\u0001\u001a\u0018\u0010\r\u001a\u0004\u0018\u00010\u000e*\u0004\u0018\u00010\u00062\b\b\u0001\u0010\f\u001a\u00020\u0001\u001a\u001d\u0010\u000f\u001a\u0004\u0018\u00010\u0010*\u0004\u0018\u00010\u00062\b\b\u0001\u0010\u0011\u001a\u00020\u0001\u00a2\u0006\u0002\u0010\u0012\u001a\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u0014*\u0004\u0018\u00010\u00062\b\b\u0001\u0010\u0015\u001a\u00020\u0001\u001a\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u0017*\u0004\u0018\u00010\u00062\b\b\u0001\u0010\u0018\u001a\u00020\u0001\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F\u00a2\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0017\u0010\u0005\u001a\u00020\u0001*\u0004\u0018\u00010\u00068F\u00a2\u0006\u0006\u001a\u0004\b\u0007\u0010\b\"\u0017\u0010\t\u001a\u00020\u0001*\u0004\u0018\u00010\u00068F\u00a2\u0006\u0006\u001a\u0004\b\n\u0010\b\u00a8\u0006\u0019"}, d2 = {"asColor", "", "", "getAsColor", "(Ljava/lang/String;)I", "deviceHeight", "Landroid/content/Context;", "getDeviceHeight", "(Landroid/content/Context;)I", "deviceWidth", "getDeviceWidth", "color", "colorRes", "colorStateList", "Landroid/content/res/ColorStateList;", "dimen", "", "dimenRes", "(Landroid/content/Context;I)Ljava/lang/Float;", "drawable", "Landroid/graphics/drawable/Drawable;", "drawableRes", "font", "Landroid/graphics/Typeface;", "fontRes", "app_devDebug"})
public final class ResourceExtensionKt {
    
    public static final int getAsColor(@org.jetbrains.annotations.NotNull()
    java.lang.String $this$asColor) {
        return 0;
    }
    
    public static final int getDeviceWidth(@org.jetbrains.annotations.Nullable()
    android.content.Context $this$deviceWidth) {
        return 0;
    }
    
    public static final int getDeviceHeight(@org.jetbrains.annotations.Nullable()
    android.content.Context $this$deviceHeight) {
        return 0;
    }
    
    /**
     * Return Font/Typeface from res directory, will return null when [Context] is Null
     * @return [Typeface]
     */
    @org.jetbrains.annotations.Nullable()
    public static final android.graphics.Typeface font(@org.jetbrains.annotations.Nullable()
    android.content.Context $this$font, @androidx.annotation.FontRes()
    int fontRes) {
        return null;
    }
    
    /**
     * Return Image/Drawable from res directory, will return null when [Context] is Null
     * @return [Drawable]
     */
    @org.jetbrains.annotations.Nullable()
    public static final android.graphics.drawable.Drawable drawable(@org.jetbrains.annotations.Nullable()
    android.content.Context $this$drawable, @androidx.annotation.DrawableRes()
    int drawableRes) {
        return null;
    }
    
    /**
     * Return Color from res directory of type [Int], will return null when [Context] is Null
     * @return Color[Int]
     */
    public static final int color(@org.jetbrains.annotations.Nullable()
    android.content.Context $this$color, @androidx.annotation.ColorRes()
    int colorRes) {
        return 0;
    }
    
    /**
     * Return Gradient/ColorStateList from res directory, will return null when [Context] is Null
     * @return [ColorStateList]
     */
    @org.jetbrains.annotations.Nullable()
    public static final android.content.res.ColorStateList colorStateList(@org.jetbrains.annotations.Nullable()
    android.content.Context $this$colorStateList, @androidx.annotation.ColorRes()
    int colorRes) {
        return null;
    }
    
    /**
     * Return Dimension pixel from res directory, will return null when [Context] is Null
     * @return [Int]
     */
    @org.jetbrains.annotations.Nullable()
    public static final java.lang.Float dimen(@org.jetbrains.annotations.Nullable()
    android.content.Context $this$dimen, @androidx.annotation.DimenRes()
    int dimenRes) {
        return null;
    }
}