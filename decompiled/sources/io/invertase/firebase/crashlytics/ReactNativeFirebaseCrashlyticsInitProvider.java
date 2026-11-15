package io.invertase.firebase.crashlytics;

import android.util.Log;
import com.google.firebase.crashlytics.FirebaseCrashlytics;
import p089i8.h;
import p089i8.i;
import p089i8.j;
import p089i8.k;

/* JADX INFO: loaded from: classes3.dex */
public class ReactNativeFirebaseCrashlyticsInitProvider extends h {
    static boolean a() {
        boolean zB;
        i iVarH = i.h();
        j jVarD = j.d();
        k kVarF = k.f();
        if (kVarF.b("crashlytics_auto_collection_enabled")) {
            zB = kVarF.d("crashlytics_auto_collection_enabled", true);
            Log.d("RNFBCrashlyticsInit", "isCrashlyticsCollectionEnabled via RNFBPreferences: " + zB);
        } else if (iVarH.a("crashlytics_auto_collection_enabled")) {
            zB = iVarH.d("crashlytics_auto_collection_enabled", true);
            Log.d("RNFBCrashlyticsInit", "isCrashlyticsCollectionEnabled via RNFBJSON: " + zB);
        } else {
            zB = jVarD.b("crashlytics_auto_collection_enabled", true);
            Log.d("RNFBCrashlyticsInit", "isCrashlyticsCollectionEnabled via RNFBMeta: " + zB);
        }
        Log.d("RNFBCrashlyticsInit", "isCrashlyticsCollectionEnabled final value: " + zB);
        return zB;
    }

    static boolean b() {
        boolean zB;
        i iVarH = i.h();
        j jVarD = j.d();
        k kVarF = k.f();
        if (kVarF.b("crashlytics_javascript_exception_handler_chaining_enabled")) {
            zB = kVarF.d("crashlytics_javascript_exception_handler_chaining_enabled", true);
            Log.d("RNFBCrashlyticsInit", "isCrashlyticsJavascriptExceptionHandlerChainingEnabled via RNFBPreferences: " + zB);
        } else if (iVarH.a("crashlytics_javascript_exception_handler_chaining_enabled")) {
            zB = iVarH.d("crashlytics_javascript_exception_handler_chaining_enabled", true);
            Log.d("RNFBCrashlyticsInit", "isCrashlyticsJavascriptExceptionHandlerChainingEnabled via RNFBJSON: " + zB);
        } else {
            zB = jVarD.b("crashlytics_javascript_exception_handler_chaining_enabled", true);
            Log.d("RNFBCrashlyticsInit", "isCrashlyticsJavascriptExceptionHandlerChainingEnabled via RNFBMeta: " + zB);
        }
        Log.d("RNFBCrashlyticsInit", "isCrashlyticsJavascriptExceptionHandlerChainingEnabled final value: " + zB);
        return zB;
    }

    static boolean c() {
        boolean zB;
        i iVarH = i.h();
        j jVarD = j.d();
        k kVarF = k.f();
        if (kVarF.b("crashlytics_is_error_generation_on_js_crash_enabled")) {
            zB = kVarF.d("crashlytics_is_error_generation_on_js_crash_enabled", true);
            Log.d("RNFBCrashlyticsInit", "isErrorGenerationOnJSCrashEnabled via RNFBPreferences: " + zB);
        } else if (iVarH.a("crashlytics_is_error_generation_on_js_crash_enabled")) {
            zB = iVarH.d("crashlytics_is_error_generation_on_js_crash_enabled", true);
            Log.d("RNFBCrashlyticsInit", "isErrorGenerationOnJSCrashEnabled via RNFBJSON: " + zB);
        } else {
            zB = jVarD.b("crashlytics_is_error_generation_on_js_crash_enabled", true);
            Log.d("RNFBCrashlyticsInit", "isErrorGenerationOnJSCrashEnabled via RNFBMeta: " + zB);
        }
        Log.d("RNFBCrashlyticsInit", "isErrorGenerationOnJSCrashEnabled final value: " + zB);
        return zB;
    }

    @Override // p089i8.h, android.content.ContentProvider
    public boolean onCreate() {
        super.onCreate();
        try {
            FirebaseCrashlytics.getInstance().setCrashlyticsCollectionEnabled(a());
            Log.i("RNFBCrashlyticsInit", "initialization successful");
            return true;
        } catch (Exception e10) {
            Log.e("RNFBCrashlyticsInit", "initialization failed", e10);
            return false;
        }
    }
}
