package com.facebook.fbreact.specs;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import com.horcrux.svg.BuildConfig;
import p024c3.a;

/* JADX INFO: loaded from: classes.dex */
public abstract class NativeReactDevToolsRuntimeSettingsModuleSpec extends ReactContextBaseJavaModule implements TurboModule {
    public static final String NAME = "ReactDevToolsRuntimeSettingsModule";

    public NativeReactDevToolsRuntimeSettingsModuleSpec(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "ReactDevToolsRuntimeSettingsModule";
    }

    @ReactMethod(isBlockingSynchronousMethod = BuildConfig.IS_NEW_ARCHITECTURE_ENABLED)
    @a
    public abstract WritableMap getReloadAndProfileConfig();

    @ReactMethod
    @a
    public abstract void setReloadAndProfileConfig(ReadableMap readableMap);
}
