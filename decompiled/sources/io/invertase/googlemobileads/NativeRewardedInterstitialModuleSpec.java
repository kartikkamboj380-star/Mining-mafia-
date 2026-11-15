package io.invertase.googlemobileads;

import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;

/* JADX INFO: loaded from: classes3.dex */
public abstract class NativeRewardedInterstitialModuleSpec extends ReactContextBaseJavaModule implements TurboModule {
    public static final String NAME = "RNGoogleMobileAdsRewardedInterstitialModule";

    public NativeRewardedInterstitialModuleSpec(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "RNGoogleMobileAdsRewardedInterstitialModule";
    }

    @ReactMethod
    @p024c3.a
    public abstract void rewardedInterstitialLoad(double d10, String str, ReadableMap readableMap);

    @ReactMethod
    @p024c3.a
    public abstract void rewardedInterstitialShow(double d10, String str, ReadableMap readableMap, Promise promise);
}
