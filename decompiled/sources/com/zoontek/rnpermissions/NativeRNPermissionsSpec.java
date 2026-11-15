package com.zoontek.rnpermissions;

import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import p024c3.a;

/* JADX INFO: loaded from: classes3.dex */
public abstract class NativeRNPermissionsSpec extends ReactContextBaseJavaModule implements TurboModule {
    public static final String NAME = "RNPermissions";

    public NativeRNPermissionsSpec(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    @ReactMethod
    @a
    public abstract void canScheduleExactAlarms(Promise promise);

    @ReactMethod
    @a
    public abstract void canUseFullScreenIntent(Promise promise);

    @ReactMethod
    @a
    public abstract void check(String str, Promise promise);

    @ReactMethod
    @a
    public abstract void checkLocationAccuracy(Promise promise);

    @ReactMethod
    @a
    public abstract void checkMultiple(ReadableArray readableArray, Promise promise);

    @ReactMethod
    @a
    public abstract void checkNotifications(Promise promise);

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return NAME;
    }

    @ReactMethod
    @a
    public abstract void openPhotoPicker(Promise promise);

    @ReactMethod
    @a
    public abstract void openSettings(String str, Promise promise);

    @ReactMethod
    @a
    public abstract void request(String str, Promise promise);

    @ReactMethod
    @a
    public abstract void requestLocationAccuracy(String str, Promise promise);

    @ReactMethod
    @a
    public abstract void requestMultiple(ReadableArray readableArray, Promise promise);

    @ReactMethod
    @a
    public abstract void requestNotifications(ReadableArray readableArray, Promise promise);

    @ReactMethod
    @a
    public abstract void shouldShowRequestRationale(String str, Promise promise);
}
