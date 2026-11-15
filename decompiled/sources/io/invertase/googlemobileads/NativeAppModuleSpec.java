package io.invertase.googlemobileads;

import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;

/* JADX INFO: loaded from: classes3.dex */
public abstract class NativeAppModuleSpec extends ReactContextBaseJavaModule implements TurboModule {
    public static final String NAME = "RNAppModule";

    public NativeAppModuleSpec(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    @ReactMethod
    @p024c3.a
    public abstract void addListener(String str);

    @ReactMethod
    @p024c3.a
    public abstract void deleteApp(String str, Promise promise);

    @ReactMethod
    @p024c3.a
    public abstract void eventsAddListener(String str);

    @ReactMethod
    @p024c3.a
    public abstract void eventsGetListeners(Promise promise);

    @ReactMethod
    @p024c3.a
    public abstract void eventsNotifyReady(boolean z9);

    @ReactMethod
    @p024c3.a
    public abstract void eventsPing(String str, ReadableMap readableMap, Promise promise);

    @ReactMethod
    @p024c3.a
    public abstract void eventsRemoveListener(String str, boolean z9);

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "RNAppModule";
    }

    @ReactMethod
    @p024c3.a
    public abstract void initializeApp(ReadableMap readableMap, ReadableMap readableMap2, Promise promise);

    @ReactMethod
    @p024c3.a
    public abstract void jsonGetAll(Promise promise);

    @ReactMethod
    @p024c3.a
    public abstract void metaGetAll(Promise promise);

    @ReactMethod
    @p024c3.a
    public abstract void preferencesClearAll(Promise promise);

    @ReactMethod
    @p024c3.a
    public abstract void preferencesGetAll(Promise promise);

    @ReactMethod
    @p024c3.a
    public abstract void preferencesSetBool(String str, boolean z9, Promise promise);

    @ReactMethod
    @p024c3.a
    public abstract void preferencesSetString(String str, String str2, Promise promise);

    @ReactMethod
    @p024c3.a
    public abstract void removeListeners(double d10);

    @ReactMethod
    @p024c3.a
    public abstract void setAutomaticDataCollectionEnabled(String str, boolean z9);
}
