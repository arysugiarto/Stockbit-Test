package com.stockbit.hiring.util;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 2, d1 = {"\u00008\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\r\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a%\u0010\u0016\u001a\u00020\u000b*\u0004\u0018\u00010\u00072\b\b\u0002\u0010\u0017\u001a\u00020\u000b2\b\b\u0002\u0010\u0018\u001a\u00020\u000b\u00a2\u0006\u0002\u0010\u0019\u001a\f\u0010\u001a\u001a\u00020\u0001*\u0004\u0018\u00010\u000b\u001a\f\u0010\u001b\u001a\u00020\u0001*\u0004\u0018\u00010\u000b\u001a\f\u0010\u001c\u001a\u00020\u0001*\u0004\u0018\u00010\u000b\u001a\f\u0010\u001d\u001a\u00020\u0001*\u0004\u0018\u00010\u000b\u001a\f\u0010\u001e\u001a\u00020\u0001*\u0004\u0018\u00010\u000b\u001a\f\u0010\u001f\u001a\u00020\u0001*\u0004\u0018\u00010\u000b\u001a\u001b\u0010\f\u001a\u00020\u0001*\u0004\u0018\u00010\u00012\b\b\u0002\u0010 \u001a\u00020\u0001\u00a2\u0006\u0002\u0010!\u001a\"\u0010\f\u001a\u00020\u000f*\u0004\u0018\u00010\u000f2\b\b\u0002\u0010 \u001a\u00020\u000b2\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010#\u001a\u001b\u0010\f\u001a\u00020\u0003*\u0004\u0018\u00010\u00032\b\b\u0002\u0010 \u001a\u00020\u0003\u00a2\u0006\u0002\u0010$\u001a\u001b\u0010\f\u001a\u00020\u0005*\u0004\u0018\u00010\u00052\b\b\u0002\u0010 \u001a\u00020\u0005\u00a2\u0006\u0002\u0010%\u001a\u001b\u0010\f\u001a\u00020\u0007*\u0004\u0018\u00010\u00072\b\b\u0002\u0010 \u001a\u00020\u0007\u00a2\u0006\u0002\u0010&\u001a\u001b\u0010\f\u001a\u00020\t*\u0004\u0018\u00010\t2\b\b\u0002\u0010 \u001a\u00020\t\u00a2\u0006\u0002\u0010\'\u001a\"\u0010\f\u001a\u00020\u000b*\u0004\u0018\u00010\u000b2\b\b\u0002\u0010 \u001a\u00020\u000b2\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010#\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0003X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0006\u001a\u00020\u0007X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\b\u001a\u00020\tX\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\n\u001a\u00020\u000bX\u0086T\u00a2\u0006\u0002\n\u0000\"\u0017\u0010\f\u001a\u00020\u0001*\u0004\u0018\u00010\u00018F\u00a2\u0006\u0006\u001a\u0004\b\r\u0010\u000e\"\u0017\u0010\f\u001a\u00020\u000f*\u0004\u0018\u00010\u000f8F\u00a2\u0006\u0006\u001a\u0004\b\r\u0010\u0010\"\u0017\u0010\f\u001a\u00020\u0003*\u0004\u0018\u00010\u00038F\u00a2\u0006\u0006\u001a\u0004\b\r\u0010\u0011\"\u0017\u0010\f\u001a\u00020\u0005*\u0004\u0018\u00010\u00058F\u00a2\u0006\u0006\u001a\u0004\b\r\u0010\u0012\"\u0017\u0010\f\u001a\u00020\u0007*\u0004\u0018\u00010\u00078F\u00a2\u0006\u0006\u001a\u0004\b\r\u0010\u0013\"\u0017\u0010\f\u001a\u00020\t*\u0004\u0018\u00010\t8F\u00a2\u0006\u0006\u001a\u0004\b\r\u0010\u0014\"\u0017\u0010\f\u001a\u00020\u000b*\u0004\u0018\u00010\u000b8F\u00a2\u0006\u0006\u001a\u0004\b\r\u0010\u0015\u00a8\u0006("}, d2 = {"emptyBoolean", "", "emptyDouble", "", "emptyFloat", "", "emptyInt", "", "emptyLong", "", "emptyString", "", "orEmpty", "getOrEmpty", "(Ljava/lang/Boolean;)Z", "", "(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;", "(Ljava/lang/Double;)D", "(Ljava/lang/Float;)F", "(Ljava/lang/Integer;)I", "(Ljava/lang/Long;)J", "(Ljava/lang/String;)Ljava/lang/String;", "asIDCurrency", "prefix", "suffix", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "isAlphabet", "isAlphabetSpace", "isEmailPattern", "isNumeric", "isPasswordValidate", "isPhoneNumber", "default", "(Ljava/lang/Boolean;Z)Z", "condition", "Lkotlin/text/Regex;", "(Ljava/lang/Double;D)D", "(Ljava/lang/Float;F)F", "(Ljava/lang/Integer;I)I", "(Ljava/lang/Long;J)J", "app_devDebug"})
public final class PrimitiveExtensionKt {
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String emptyString = "";
    public static final int emptyInt = -1;
    public static final float emptyFloat = 0.0F;
    public static final long emptyLong = 0L;
    public static final double emptyDouble = 0.0;
    public static final boolean emptyBoolean = false;
    
    /**
     * Proceed and Return Non-Null Value of Nullable String
     * @param default is the replacement of nullable value of any word in the string
     * @param condition is the condition which nullable can be replaced with non-null value
     * @return [String]
     */
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String orEmpty(@org.jetbrains.annotations.Nullable()
    java.lang.String $this$orEmpty, @org.jetbrains.annotations.NotNull()
    java.lang.String p1_772401952, @org.jetbrains.annotations.Nullable()
    kotlin.text.Regex condition) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String getOrEmpty(@org.jetbrains.annotations.Nullable()
    java.lang.String $this$orEmpty) {
        return null;
    }
    
    /**
     * Check if string is match for Regular Email Pattern
     * @return [Boolean], if Match and Not Null will return True otherwise false
     */
    public static final boolean isEmailPattern(@org.jetbrains.annotations.Nullable()
    java.lang.String $this$isEmailPattern) {
        return false;
    }
    
    /**
     * Check if string is match for Numeric Pattern
     * @return [Boolean], if Match and Not Null will return True otherwise false
     */
    public static final boolean isNumeric(@org.jetbrains.annotations.Nullable()
    java.lang.String $this$isNumeric) {
        return false;
    }
    
    /**
     * Check if string is match of Alphabet
     * @return [Boolean], if Match and Not Null will return True otherwise false
     */
    public static final boolean isAlphabet(@org.jetbrains.annotations.Nullable()
    java.lang.String $this$isAlphabet) {
        return false;
    }
    
    /**
     * Check if string is match of Alphabet & Space
     * @return [Boolean], if Match and Not Null will return True otherwise false
     */
    public static final boolean isAlphabetSpace(@org.jetbrains.annotations.Nullable()
    java.lang.String $this$isAlphabetSpace) {
        return false;
    }
    
    /**
     * Check if string is contains right Phone Number Pattern such as ID-Prefix and ID-length
     * @return [Boolean], if Match and Not Null will return True otherwise false
     */
    public static final boolean isPhoneNumber(@org.jetbrains.annotations.Nullable()
    java.lang.String $this$isPhoneNumber) {
        return false;
    }
    
    /**
     * Proceed and Return Non-Null Value of Nullable CharSequence
     * @param default is the replacement of nullable value of any word in the CharSequence
     * @param condition is the condition which nullable can be replaced with non-null value
     * @return [CharSequence]
     */
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.CharSequence orEmpty(@org.jetbrains.annotations.Nullable()
    java.lang.CharSequence $this$orEmpty, @org.jetbrains.annotations.NotNull()
    java.lang.String p1_772401952, @org.jetbrains.annotations.Nullable()
    kotlin.text.Regex condition) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.CharSequence getOrEmpty(@org.jetbrains.annotations.Nullable()
    java.lang.CharSequence $this$orEmpty) {
        return null;
    }
    
    /**
     * Proceed and Return Non-Null Value of Nullable Long
     * @param default is the replacement of nullable value of Long
     * @return [Long]
     */
    public static final long orEmpty(@org.jetbrains.annotations.Nullable()
    java.lang.Long $this$orEmpty, long p1_772401952) {
        return 0L;
    }
    
    public static final long getOrEmpty(@org.jetbrains.annotations.Nullable()
    java.lang.Long $this$orEmpty) {
        return 0L;
    }
    
    /**
     * Proceed and Return Non-Null Value of Nullable Float
     * @param default is the replacement of nullable value of Float
     * @return [Float]
     */
    public static final float orEmpty(@org.jetbrains.annotations.Nullable()
    java.lang.Float $this$orEmpty, float p1_772401952) {
        return 0.0F;
    }
    
    public static final float getOrEmpty(@org.jetbrains.annotations.Nullable()
    java.lang.Float $this$orEmpty) {
        return 0.0F;
    }
    
    /**
     * Proceed and Return Non-Null Value of Nullable Int
     * @param default is the replacement of nullable value of Int
     * @return [Int]
     */
    public static final int orEmpty(@org.jetbrains.annotations.Nullable()
    java.lang.Integer $this$orEmpty, int p1_772401952) {
        return 0;
    }
    
    public static final int getOrEmpty(@org.jetbrains.annotations.Nullable()
    java.lang.Integer $this$orEmpty) {
        return 0;
    }
    
    /**
     * Format Int to ID Currency Value of String Type
     * @param prefix used for prefix of currency Value with default ID currency (Rp.)
     * @param suffix used for suffix of currency value
     * @return [String] Of ID Currency
     */
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String asIDCurrency(@org.jetbrains.annotations.Nullable()
    java.lang.Integer $this$asIDCurrency, @org.jetbrains.annotations.NotNull()
    java.lang.String prefix, @org.jetbrains.annotations.NotNull()
    java.lang.String suffix) {
        return null;
    }
    
    /**
     * Proceed and Return Non-Null Value of Nullable Double
     * @param default is the replacement of nullable value of Double
     * @return [Double]
     */
    public static final double orEmpty(@org.jetbrains.annotations.Nullable()
    java.lang.Double $this$orEmpty, double p1_772401952) {
        return 0.0;
    }
    
    public static final double getOrEmpty(@org.jetbrains.annotations.Nullable()
    java.lang.Double $this$orEmpty) {
        return 0.0;
    }
    
    /**
     * Proceed and Return Non-Null Value of Nullable Boolean
     * @param default is the replacement of nullable value of Boolean
     * @return [Boolean]
     */
    public static final boolean orEmpty(@org.jetbrains.annotations.Nullable()
    java.lang.Boolean $this$orEmpty, boolean p1_772401952) {
        return false;
    }
    
    public static final boolean getOrEmpty(@org.jetbrains.annotations.Nullable()
    java.lang.Boolean $this$orEmpty) {
        return false;
    }
    
    public static final boolean isPasswordValidate(@org.jetbrains.annotations.Nullable()
    java.lang.String $this$isPasswordValidate) {
        return false;
    }
}