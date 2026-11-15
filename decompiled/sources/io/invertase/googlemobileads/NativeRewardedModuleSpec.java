package io.invertase.googlemobileads;

import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;

/* JADX INFO: loaded from: classes3.dex */
public abstract class NativeRewardedModuleSpec extends ReactContextBaseJavaModule implements TurboModule {
    public static final String NAME = "RNGoogleMobileAdsRewardedModule";

    public NativeRewardedModuleSpec(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "RNGoogleMobileAdsRewardedModule";
    }

    @ReactMethod
    @p024c3.a
    public abstract void rewardedLoad(double d10, String str, ReadableMap readableMap);

    @ReactMethod
    @p024c3.a
    public abstract void rewardedShow(double d10, String str, ReadableMap readableMap, Promise promise);
}
