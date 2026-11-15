package com.reactnativecommunity.webview;

import com.facebook.react.Y;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.module.model.ReactModuleInfo;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public class n extends Y {
    public static /* synthetic */ Map c() {
        HashMap map = new HashMap();
        map.put(NativeRNCWebViewModuleSpec.NAME, new ReactModuleInfo(NativeRNCWebViewModuleSpec.NAME, NativeRNCWebViewModuleSpec.NAME, false, false, true, false, true));
        return map;
    }

    @Override // com.facebook.react.AbstractC1272a, com.facebook.react.N
    public List createViewManagers(ReactApplicationContext reactApplicationContext) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new RNCWebViewManager());
        return arrayList;
    }

    @Override // com.facebook.react.AbstractC1272a, com.facebook.react.N
    public NativeModule getModule(String str, ReactApplicationContext reactApplicationContext) {
        if (str.equals(NativeRNCWebViewModuleSpec.NAME)) {
            return new RNCWebViewModule(reactApplicationContext);
        }
        return null;
    }

    @Override // com.facebook.react.AbstractC1272a
    public p244y3.a getReactModuleInfoProvider() {
        return new p244y3.a() { // from class: com.reactnativecommunity.webview.m
            @Override // p244y3.a
            public final Map a() {
                return n.c();
            }
        };
    }
}
