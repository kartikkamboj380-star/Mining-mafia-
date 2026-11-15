package com.facebook.fbreact.specs;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import com.horcrux.svg.BuildConfig;
import p024c3.a;

/* JADX INFO: loaded from: classes.dex */
public abstract class NativeReactDevToolsSettingsManagerSpec extends ReactContextBaseJavaModule implements TurboModule {
    public static final String NAME = "ReactDevToolsSettingsManager";

    public NativeReactDevToolsSettingsManagerSpec(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    @ReactMethod(isBlockingSynchronousMethod = BuildConfig.IS_NEW_ARCHITECTURE_ENABLED)
    @a
    public abstract String getGlobalHookSettings();

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "ReactDevToolsSettingsManager";
    }

    @ReactMethod
    @a
    public abstract void setGlobalHookSettings(String str);
}
