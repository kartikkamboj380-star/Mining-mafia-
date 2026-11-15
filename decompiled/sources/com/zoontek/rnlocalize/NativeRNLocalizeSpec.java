package com.zoontek.rnlocalize;

import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import com.horcrux.svg.BuildConfig;
import p024c3.a;

/* JADX INFO: loaded from: classes3.dex */
public abstract class NativeRNLocalizeSpec extends ReactContextBaseJavaModule implements TurboModule {
    public static final String NAME = "RNLocalize";

    public NativeRNLocalizeSpec(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    @ReactMethod(isBlockingSynchronousMethod = BuildConfig.IS_NEW_ARCHITECTURE_ENABLED)
    @a
    public abstract String getCalendar();

    @ReactMethod(isBlockingSynchronousMethod = BuildConfig.IS_NEW_ARCHITECTURE_ENABLED)
    @a
    public abstract String getCountry();

    @ReactMethod(isBlockingSynchronousMethod = BuildConfig.IS_NEW_ARCHITECTURE_ENABLED)
    @a
    public abstract WritableArray getCurrencies();

    @ReactMethod(isBlockingSynchronousMethod = BuildConfig.IS_NEW_ARCHITECTURE_ENABLED)
    @a
    public abstract WritableArray getLocales();

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return NAME;
    }

    @ReactMethod(isBlockingSynchronousMethod = BuildConfig.IS_NEW_ARCHITECTURE_ENABLED)
    @a
    public abstract WritableMap getNumberFormatSettings();

    @ReactMethod(isBlockingSynchronousMethod = BuildConfig.IS_NEW_ARCHITECTURE_ENABLED)
    @a
    public abstract String getTemperatureUnit();

    @ReactMethod(isBlockingSynchronousMethod = BuildConfig.IS_NEW_ARCHITECTURE_ENABLED)
    @a
    public abstract String getTimeZone();

    @ReactMethod
    @a
    public abstract void openAppLanguageSettings(Promise promise);

    @ReactMethod(isBlockingSynchronousMethod = BuildConfig.IS_NEW_ARCHITECTURE_ENABLED)
    @a
    public abstract boolean uses24HourClock();

    @ReactMethod(isBlockingSynchronousMethod = BuildConfig.IS_NEW_ARCHITECTURE_ENABLED)
    @a
    public abstract Boolean usesAutoDateAndTime();

    @ReactMethod(isBlockingSynchronousMethod = BuildConfig.IS_NEW_ARCHITECTURE_ENABLED)
    @a
    public abstract Boolean usesAutoTimeZone();

    @ReactMethod(isBlockingSynchronousMethod = BuildConfig.IS_NEW_ARCHITECTURE_ENABLED)
    @a
    public abstract boolean usesMetricSystem();
}
