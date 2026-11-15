package com.zoontek.rnbootsplash;

import com.facebook.react.Y;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.module.model.ReactModuleInfo;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class u extends Y {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Map getReactModuleInfoProvider$lambda$0() {
        HashMap map = new HashMap();
        map.put(NativeRNBootSplashSpec.NAME, new ReactModuleInfo(NativeRNBootSplashSpec.NAME, NativeRNBootSplashSpec.NAME, false, false, true, false, true));
        return map;
    }

    @Override // com.facebook.react.AbstractC1272a, com.facebook.react.N
    public NativeModule getModule(String name, ReactApplicationContext reactContext) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
        if (Intrinsics.b(name, NativeRNBootSplashSpec.NAME)) {
            return new RNBootSplashModule(reactContext);
        }
        return null;
    }

    @Override // com.facebook.react.AbstractC1272a
    public p244y3.a getReactModuleInfoProvider() {
        return new p244y3.a() { // from class: com.zoontek.rnbootsplash.t
            @Override // p244y3.a
            public final Map a() {
                return u.getReactModuleInfoProvider$lambda$0();
            }
        };
    }
}
