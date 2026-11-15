package com.facebook.react;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.uimanager.ViewManager;
import java.util.Collection;

/* JADX INFO: loaded from: classes.dex */
public interface Z {
    ViewManager createViewManager(ReactApplicationContext reactApplicationContext, String str);

    Collection getViewManagerNames(ReactApplicationContext reactApplicationContext);
}
