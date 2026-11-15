package com.tenjin;

import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import p024c3.a;

/* JADX INFO: loaded from: classes3.dex */
public abstract class NativeTenjinSpec extends ReactContextBaseJavaModule implements TurboModule {
    public static final String NAME = "Tenjin";

    public NativeTenjinSpec(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    @ReactMethod
    @a
    public abstract void appendAppSubversion(double d10);

    @ReactMethod
    @a
    public abstract void connect();

    @ReactMethod
    @a
    public abstract void eventAdImpressionAdMob(ReadableMap readableMap);

    @ReactMethod
    @a
    public abstract void eventAdImpressionAppLovin(ReadableMap readableMap);

    @ReactMethod
    @a
    public abstract void eventAdImpressionHyperBid(ReadableMap readableMap);

    @ReactMethod
    @a
    public abstract void eventAdImpressionIronSource(ReadableMap readableMap);

    @ReactMethod
    @a
    public abstract void eventAdImpressionTopOn(ReadableMap readableMap);

    @ReactMethod
    @a
    public abstract void eventAdImpressionTradPlus(ReadableMap readableMap);

    @ReactMethod
    @a
    public abstract void eventWithName(String str);

    @ReactMethod
    @a
    public abstract void eventWithNameAndValue(String str, double d10);

    @ReactMethod
    @a
    public abstract void getAnalyticsInstallationId(Callback callback);

    @ReactMethod
    @a
    public abstract void getAttributionInfo(Callback callback, Callback callback2);

    @ReactMethod
    @a
    public abstract void getCustomerUserId(Callback callback);

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "Tenjin";
    }

    @ReactMethod
    @a
    public abstract void getUserProfileDictionary(Callback callback);

    @ReactMethod
    @a
    public abstract void initialize(String str);

    @ReactMethod
    @a
    public abstract void optIn();

    @ReactMethod
    @a
    public abstract void optInGoogleDMA();

    @ReactMethod
    @a
    public abstract void optInOutUsingCMP();

    @ReactMethod
    @a
    public abstract void optInParams(ReadableArray readableArray);

    @ReactMethod
    @a
    public abstract void optOut();

    @ReactMethod
    @a
    public abstract void optOutGoogleDMA();

    @ReactMethod
    @a
    public abstract void optOutParams(ReadableArray readableArray);

    @ReactMethod
    @a
    public abstract void resetUserProfile();

    @ReactMethod
    @a
    public abstract void setAppStore(String str);

    @ReactMethod
    @a
    public abstract void setCacheEventSetting(boolean z9);

    @ReactMethod
    @a
    public abstract void setCustomerUserId(String str);

    @ReactMethod
    @a
    public abstract void setEncryptRequestsSetting(boolean z9);

    @ReactMethod
    @a
    public abstract void setGoogleDMAParameters(boolean z9, boolean z10);

    @ReactMethod
    @a
    public abstract void transaction(String str, String str2, double d10, double d11);

    @ReactMethod
    @a
    public abstract void transactionWithDataSignature(String str, String str2, double d10, double d11, String str3, String str4);

    @ReactMethod
    @a
    public abstract void transactionWithReceipt(String str, String str2, double d10, double d11, String str3, String str4);

    @ReactMethod
    @a
    public abstract void updatePostbackConversionValue(double d10);

    @ReactMethod
    @a
    public abstract void updatePostbackConversionValueWithCoarseValue(double d10, String str);

    @ReactMethod
    @a
    public abstract void updatePostbackConversionValueWithCoarseValueAndLockWindow(double d10, String str, boolean z9);
}
