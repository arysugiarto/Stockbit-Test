package com.stockbit.hiring;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001:\u0001\tB\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016J\u0012\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0002J\b\u0010\b\u001a\u00020\u0004H\u0002\u00a8\u0006\n"}, d2 = {"Lcom/stockbit/hiring/App;", "Landroid/app/Application;", "()V", "onCreate", "", "setDefaultTheme", "theme", "Lcom/stockbit/hiring/App$Theme;", "setupTimber", "Theme", "app_devDebug"})
@dagger.hilt.android.HiltAndroidApp()
public final class App extends android.app.Application {
    
    @java.lang.Override()
    public void onCreate() {
    }
    
    private final void setupTimber() {
    }
    
    private final void setDefaultTheme(com.stockbit.hiring.App.Theme theme) {
    }
    
    public App() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0082\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004\u00a8\u0006\u0005"}, d2 = {"Lcom/stockbit/hiring/App$Theme;", "", "(Ljava/lang/String;I)V", "LIGHT", "DARK", "app_devDebug"})
    static enum Theme {
        /*public static final*/ LIGHT /* = new LIGHT() */,
        /*public static final*/ DARK /* = new DARK() */;
        
        Theme() {
        }
    }
}