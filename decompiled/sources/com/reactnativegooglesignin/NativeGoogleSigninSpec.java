package com.reactnativegooglesignin;

import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import com.horcrux.svg.BuildConfig;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public abstract class NativeGoogleSigninSpec extends ReactContextBaseJavaModule implements TurboModule {
    public static final String NAME = "RNGoogleSignin";

    public NativeGoogleSigninSpec(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    @ReactMethod
    @p024c3.a
    public abstract void addScopes(ReadableMap readableMap, Promise promise);

    @ReactMethod
    @p024c3.a
    public abstract void clearCachedAccessToken(String str, Promise promise);

    @ReactMethod
    @p024c3.a
    public abstract void configure(ReadableMap readableMap, Promise promise);

    @Override // com.facebook.react.bridge.BaseJavaModule
    @p024c3.a
    public final Map<String, Object> getConstants() {
        Map<String, Object> typedExportedConstants = getTypedExportedConstants();
        if (p084i3.a.f45066b || p084i3.a.f45067c) {
            HashSet hashSet = new HashSet(Arrays.asList("BUTTON_SIZE_ICON", "BUTTON_SIZE_STANDARD", "BUTTON_SIZE_WIDE", "IN_PROGRESS", "NO_SAVED_CREDENTIAL_FOUND", "ONE_TAP_START_FAILED", RNGoogleSigninModule.PLAY_SERVICES_NOT_AVAILABLE, "SCOPES_ALREADY_GRANTED", "SIGN_IN_CANCELLED", "SIGN_IN_REQUIRED"));
            HashSet hashSet2 = new HashSet();
            HashSet hashSet3 = new HashSet(typedExportedConstants.keySet());
            hashSet3.removeAll(hashSet);
            hashSet3.removeAll(hashSet2);
            if (!hashSet3.isEmpty()) {
                throw new IllegalStateException(String.format("Native Module Flow doesn't declare constants: %s", hashSet3));
            }
            hashSet.removeAll(typedExportedConstants.keySet());
            if (!hashSet.isEmpty()) {
                throw new IllegalStateException(String.format("Native Module doesn't fill in constants: %s", hashSet));
            }
        }
        return typedExportedConstants;
    }

    @ReactMethod(isBlockingSynchronousMethod = BuildConfig.IS_NEW_ARCHITECTURE_ENABLED)
    @p024c3.a
    public abstract WritableMap getCurrentUser();

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return NAME;
    }

    @ReactMethod
    @p024c3.a
    public abstract void getTokens(Promise promise);

    protected abstract Map<String, Object> getTypedExportedConstants();

    @ReactMethod(isBlockingSynchronousMethod = BuildConfig.IS_NEW_ARCHITECTURE_ENABLED)
    @p024c3.a
    public abstract boolean hasPreviousSignIn();

    @ReactMethod
    @p024c3.a
    public abstract void playServicesAvailable(boolean z9, Promise promise);

    @ReactMethod
    @p024c3.a
    public abstract void revokeAccess(Promise promise);

    @ReactMethod
    @p024c3.a
    public abstract void signIn(ReadableMap readableMap, Promise promise);

    @ReactMethod
    @p024c3.a
    public abstract void signInSilently(Promise promise);

    @ReactMethod
    @p024c3.a
    public abstract void signOut(Promise promise);
}
