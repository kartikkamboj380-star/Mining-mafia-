package io.invertase.googlemobileads;

import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;

/* JADX INFO: loaded from: classes3.dex */
public abstract class NativeConsentModuleSpec extends ReactContextBaseJavaModule implements TurboModule {
    public static final String NAME = "RNGoogleMobileAdsConsentModule";

    public NativeConsentModuleSpec(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    @ReactMethod
    @p024c3.a
    public abstract void getConsentInfo(Promise promise);

    @ReactMethod
    @p024c3.a
    public abstract void getGdprApplies(Promise promise);

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return NAME;
    }

    @ReactMethod
    @p024c3.a
    public abstract void getPurposeConsents(Promise promise);

    @ReactMethod
    @p024c3.a
    public abstract void getPurposeLegitimateInterests(Promise promise);

    @ReactMethod
    @p024c3.a
    public abstract void getTCString(Promise promise);

    @ReactMethod
    @p024c3.a
    public abstract void loadAndShowConsentFormIfRequired(Promise promise);

    @ReactMethod
    @p024c3.a
    public abstract void requestInfoUpdate(ReadableMap readableMap, Promise promise);

    @ReactMethod
    @p024c3.a
    public abstract void reset();

    @ReactMethod
    @p024c3.a
    public abstract void showForm(Promise promise);

    @ReactMethod
    @p024c3.a
    public abstract void showPrivacyOptionsForm(Promise promise);
}
