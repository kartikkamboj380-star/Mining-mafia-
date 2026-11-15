package io.invertase.googlemobileads;

import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;

/* JADX INFO: loaded from: classes3.dex */
public abstract class NativeGoogleMobileAdsNativeModuleSpec extends ReactContextBaseJavaModule implements TurboModule {
    public static final String NAME = "RNGoogleMobileAdsNativeModule";

    public NativeGoogleMobileAdsNativeModuleSpec(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    @ReactMethod
    @p024c3.a
    public abstract void destroy(String str);

    protected final void emitOnAdEvent(ReadableMap readableMap) {
        this.mEventEmitterCallback.invoke("onAdEvent", readableMap);
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "RNGoogleMobileAdsNativeModule";
    }

    @ReactMethod
    @p024c3.a
    public abstract void load(String str, ReadableMap readableMap, Promise promise);
}
