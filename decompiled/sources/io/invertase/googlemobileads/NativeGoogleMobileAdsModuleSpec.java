package io.invertase.googlemobileads;

import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;

/* JADX INFO: loaded from: classes3.dex */
public abstract class NativeGoogleMobileAdsModuleSpec extends ReactContextBaseJavaModule implements TurboModule {
    public static final String NAME = "RNGoogleMobileAdsModule";

    public NativeGoogleMobileAdsModuleSpec(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "RNGoogleMobileAdsModule";
    }

    @ReactMethod
    @p024c3.a
    public abstract void initialize(Promise promise);

    @ReactMethod
    @p024c3.a
    public abstract void openAdInspector(Promise promise);

    @ReactMethod
    @p024c3.a
    public abstract void openDebugMenu(String str);

    @ReactMethod
    @p024c3.a
    public abstract void setAppMuted(boolean z9);

    @ReactMethod
    @p024c3.a
    public abstract void setAppVolume(double d10);

    @ReactMethod
    @p024c3.a
    public abstract void setRequestConfiguration(ReadableMap readableMap, Promise promise);
}
