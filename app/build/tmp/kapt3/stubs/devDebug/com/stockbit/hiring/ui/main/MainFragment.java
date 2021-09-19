package com.stockbit.hiring.ui.main;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\u001a\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0010H\u0016J\b\u0010\u0015\u001a\u00020\u000eH\u0002R\u001b\u0010\u0003\u001a\u00020\u00048BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082D\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0017"}, d2 = {"Lcom/stockbit/hiring/ui/main/MainFragment;", "Landroidx/fragment/app/Fragment;", "()V", "binding", "Lcom/stockbit/hiring/databinding/FragmentMainBinding;", "getBinding", "()Lcom/stockbit/hiring/databinding/FragmentMainBinding;", "binding$delegate", "Lcom/stockbit/hiring/util/ViewBindingExtension;", "bottomNavSelectedItemId", "", "bottomNavSelectedItemIdKey", "", "onSaveInstanceState", "", "outState", "Landroid/os/Bundle;", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "setUpBottomNavBar", "Companion", "app_devDebug"})
public final class MainFragment extends androidx.fragment.app.Fragment {
    private final java.lang.String bottomNavSelectedItemIdKey = "BOTTOM_NAV_SELECTED_ITEM_ID_KEY";
    private int bottomNavSelectedItemId = com.stockbit.hiring.R.id.home;
    private final com.stockbit.hiring.util.ViewBindingExtension binding$delegate = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.stockbit.hiring.ui.main.MainFragment.Companion Companion = null;
    
    private final com.stockbit.hiring.databinding.FragmentMainBinding getBinding() {
        return null;
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void onSaveInstanceState(@org.jetbrains.annotations.NotNull()
    android.os.Bundle outState) {
    }
    
    private final void setUpBottomNavBar() {
    }
    
    public MainFragment() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u0004*\u0004\u0018\u00010\u00058F\u00a2\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\b"}, d2 = {"Lcom/stockbit/hiring/ui/main/MainFragment$Companion;", "", "()V", "parentToolbar", "Lcom/google/android/material/appbar/MaterialToolbar;", "Landroidx/fragment/app/Fragment;", "getParentToolbar", "(Landroidx/fragment/app/Fragment;)Lcom/google/android/material/appbar/MaterialToolbar;", "app_devDebug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.Nullable()
        public final com.google.android.material.appbar.MaterialToolbar getParentToolbar(@org.jetbrains.annotations.Nullable()
        androidx.fragment.app.Fragment $this$parentToolbar) {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}