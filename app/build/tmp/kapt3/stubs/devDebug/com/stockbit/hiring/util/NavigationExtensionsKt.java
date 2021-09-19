package com.stockbit.hiring.util;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 2, d1 = {"\u0000~\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a \u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0002\u001a \u0010\u000f\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u0012H\u0002\u001a \u0010\u0013\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u0012H\u0002\u001a\u0018\u0010\u0015\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0002\u001a\u0010\u0010\u0016\u001a\u00020\u00122\u0006\u0010\u0017\u001a\u00020\u0018H\u0002\u001a(\u0010\u0019\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u001a\u001a\u00020\u00122\u0006\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u001c\u001a\u00020\u0018H\u0002\u001a\u0014\u0010\u001d\u001a\u00020\u000e*\u00020\n2\u0006\u0010\u001e\u001a\u00020\u0012H\u0002\u001a-\u0010\u001f\u001a\u00020\b*\u00020\u00012\b\u0010 \u001a\u0004\u0018\u00010!2\u0017\u0010\"\u001a\u0013\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020\b0#\u00a2\u0006\u0002\b%\u001a\u001e\u0010\u001f\u001a\u00020\b*\u00020\u00012\b\u0010 \u001a\u0004\u0018\u00010!2\b\b\u0002\u0010&\u001a\u00020\u000e\u001a2\u0010\'\u001a\u00020\b*\u00020(2\f\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00180*2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u001c\u001a\u00020\u00182\u0006\u0010+\u001a\u00020,H\u0002\u001a\"\u0010-\u001a\u00020\b*\u00020(2\f\u0010.\u001a\b\u0012\u0004\u0012\u00020\u00120/2\u0006\u0010\t\u001a\u00020\nH\u0002\u001aF\u00100\u001a\b\u0012\u0004\u0012\u00020\u000101*\u00020(2\u0006\u0010\t\u001a\u00020\n2\f\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00180*2\u0006\u00102\u001a\u0002032\u0006\u0010\u001c\u001a\u00020\u00182\u0006\u00104\u001a\u00020\u00182\u0006\u0010+\u001a\u00020,\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F\u00a2\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00058F\u00a2\u0006\u0006\u001a\u0004\b\u0003\u0010\u0006\u00a8\u00065"}, d2 = {"navController", "Landroidx/navigation/NavController;", "Landroid/view/View;", "getNavController", "(Landroid/view/View;)Landroidx/navigation/NavController;", "Landroidx/fragment/app/Fragment;", "(Landroidx/fragment/app/Fragment;)Landroidx/navigation/NavController;", "attachNavHostFragment", "", "fragmentManager", "Landroidx/fragment/app/FragmentManager;", "navHostFragment", "Landroidx/navigation/fragment/NavHostFragment;", "isPrimaryNavFragment", "", "commitTransaction", "selectedFragment", "selectedItemTag", "", "commitTransactionWithFixedStart", "firstFragmentTag", "detachNavHostFragment", "getFragmentTag", "index", "", "obtainNavHostFragment", "fragmentTag", "navGraphId", "containerId", "isOnBackStack", "backStackName", "navigateOrNull", "direction", "Landroidx/navigation/NavDirections;", "options", "Lkotlin/Function1;", "Landroidx/navigation/NavOptions$Builder;", "Lkotlin/ExtensionFunctionType;", "clearTask", "setupDeepLinks", "Lcom/google/android/material/bottomnavigation/BottomNavigationView;", "navGraphIds", "", "intent", "Landroid/content/Intent;", "setupItemReselected", "graphIdToTagMap", "Landroid/util/SparseArray;", "setupWithNavController", "Landroidx/lifecycle/LiveData;", "backButtonBehaviour", "Lcom/stockbit/hiring/util/BackButtonBehaviour;", "firstItemId", "app_devDebug"})
public final class NavigationExtensionsKt {
    
    @org.jetbrains.annotations.NotNull()
    public static final androidx.lifecycle.LiveData<androidx.navigation.NavController> setupWithNavController(@org.jetbrains.annotations.NotNull()
    com.google.android.material.bottomnavigation.BottomNavigationView $this$setupWithNavController, @org.jetbrains.annotations.NotNull()
    androidx.fragment.app.FragmentManager fragmentManager, @org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.Integer> navGraphIds, @org.jetbrains.annotations.NotNull()
    com.stockbit.hiring.util.BackButtonBehaviour backButtonBehaviour, int containerId, int firstItemId, @org.jetbrains.annotations.NotNull()
    android.content.Intent intent) {
        return null;
    }
    
    private static final void commitTransaction(androidx.fragment.app.FragmentManager fragmentManager, androidx.navigation.fragment.NavHostFragment selectedFragment, java.lang.String selectedItemTag) {
    }
    
    private static final void commitTransactionWithFixedStart(androidx.fragment.app.FragmentManager fragmentManager, androidx.navigation.fragment.NavHostFragment selectedFragment, java.lang.String firstFragmentTag) {
    }
    
    private static final void setupDeepLinks(com.google.android.material.bottomnavigation.BottomNavigationView $this$setupDeepLinks, java.util.List<java.lang.Integer> navGraphIds, androidx.fragment.app.FragmentManager fragmentManager, int containerId, android.content.Intent intent) {
    }
    
    private static final void setupItemReselected(com.google.android.material.bottomnavigation.BottomNavigationView $this$setupItemReselected, android.util.SparseArray<java.lang.String> graphIdToTagMap, androidx.fragment.app.FragmentManager fragmentManager) {
    }
    
    private static final void detachNavHostFragment(androidx.fragment.app.FragmentManager fragmentManager, androidx.navigation.fragment.NavHostFragment navHostFragment) {
    }
    
    private static final void attachNavHostFragment(androidx.fragment.app.FragmentManager fragmentManager, androidx.navigation.fragment.NavHostFragment navHostFragment, boolean isPrimaryNavFragment) {
    }
    
    private static final androidx.navigation.fragment.NavHostFragment obtainNavHostFragment(androidx.fragment.app.FragmentManager fragmentManager, java.lang.String fragmentTag, int navGraphId, int containerId) {
        return null;
    }
    
    private static final boolean isOnBackStack(androidx.fragment.app.FragmentManager $this$isOnBackStack, java.lang.String backStackName) {
        return false;
    }
    
    private static final java.lang.String getFragmentTag(int index) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final androidx.navigation.NavController getNavController(@org.jetbrains.annotations.NotNull()
    androidx.fragment.app.Fragment $this$navController) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final androidx.navigation.NavController getNavController(@org.jetbrains.annotations.NotNull()
    android.view.View $this$navController) {
        return null;
    }
    
    /**
     * Navigate To [NavDirections] with null safety or crash issue, it also give Default Animation on
     * It's Navigation
     * @param direction is Direction to other page
     * @param clearTask will clear previous backStack when navigated, same functionality as [Activity.finish]
     */
    public static final void navigateOrNull(@org.jetbrains.annotations.NotNull()
    androidx.navigation.NavController $this$navigateOrNull, @org.jetbrains.annotations.Nullable()
    androidx.navigation.NavDirections direction, boolean clearTask) {
    }
    
    /**
     * Navigate To [NavDirections] with null safety or crash issue, it also give Default Animation on
     * It's Navigation or Custom Animation and other attributes depend on [options]
     * @param direction is Direction to other page
     * @param options is the navigation attributes that will be executed on Navigation
     */
    public static final void navigateOrNull(@org.jetbrains.annotations.NotNull()
    androidx.navigation.NavController $this$navigateOrNull, @org.jetbrains.annotations.Nullable()
    androidx.navigation.NavDirections direction, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super androidx.navigation.NavOptions.Builder, kotlin.Unit> options) {
    }
}