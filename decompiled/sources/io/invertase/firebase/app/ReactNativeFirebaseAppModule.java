package io.invertase.firebase.app;

import android.util.Log;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.unity3d.ads.metadata.MediationMetaData;
import io.invertase.firebase.common.ReactNativeFirebaseModule;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import p007a6.f;
import p089i8.g;
import p089i8.i;
import p089i8.j;
import p089i8.k;

/* JADX INFO: loaded from: classes3.dex */
public class ReactNativeFirebaseAppModule extends ReactNativeFirebaseModule {
    private static final String TAG = "App";
    public static Map<String, String> authDomains = new HashMap();

    ReactNativeFirebaseAppModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext, TAG);
    }

    public static void configureAuthDomain(String str, String str2) {
        if (str2 == null) {
            authDomains.remove(str);
            return;
        }
        Log.d(TAG, str + " custom authDomain " + str2);
        authDomains.put(str, str2);
    }

    @ReactMethod
    public void addListener(String str) {
    }

    @ReactMethod
    public void deleteApp(String str, Promise promise) {
        f fVarP = f.p(str);
        if (fVarP != null) {
            fVarP.j();
        }
        promise.resolve(null);
    }

    @ReactMethod
    public void eventsAddListener(String str) {
        g.i().e(str);
    }

    @ReactMethod
    public void eventsGetListeners(Promise promise) {
        promise.resolve(g.i().h());
    }

    @ReactMethod
    public void eventsNotifyReady(Boolean bool) {
        g.i().m(bool);
    }

    @ReactMethod
    public void eventsPing(String str, ReadableMap readableMap, Promise promise) {
        g.i().o(new p089i8.b(str, p089i8.a.d(readableMap)));
        promise.resolve(p089i8.a.d(readableMap));
    }

    @ReactMethod
    public void eventsRemoveListener(String str, Boolean bool) {
        g.i().n(str, bool);
    }

    @Override // io.invertase.firebase.common.ReactNativeFirebaseModule, com.facebook.react.bridge.BaseJavaModule
    public Map<String, Object> getConstants() {
        HashMap map = new HashMap();
        ArrayList arrayList = new ArrayList();
        Iterator it = f.n(getReactApplicationContext()).iterator();
        while (it.hasNext()) {
            arrayList.add(p089i8.a.a((f) it.next()));
        }
        map.put("NATIVE_FIREBASE_APPS", arrayList);
        map.put("FIREBASE_RAW_JSON", i.h().g());
        return map;
    }

    @Override // io.invertase.firebase.common.ReactNativeFirebaseModule, com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule, com.facebook.react.turbomodule.core.interfaces.TurboModule
    public void initialize() {
        super.initialize();
        g.i().f(getContext());
    }

    @ReactMethod
    public void initializeApp(ReadableMap readableMap, ReadableMap readableMap2, Promise promise) {
        f fVarC = p089i8.a.c(readableMap, readableMap2, getContext());
        configureAuthDomain(readableMap2.getString(MediationMetaData.KEY_NAME), readableMap.getString("authDomain"));
        promise.resolve(p089i8.a.b(fVarC));
    }

    @ReactMethod
    public void jsonGetAll(Promise promise) {
        promise.resolve(i.h().b());
    }

    @ReactMethod
    public void metaGetAll(Promise promise) {
        promise.resolve(j.d().a());
    }

    @ReactMethod
    public void preferencesClearAll(Promise promise) {
        k.f().a();
        promise.resolve(null);
    }

    @ReactMethod
    public void preferencesGetAll(Promise promise) {
        promise.resolve(k.f().c());
    }

    @ReactMethod
    public void preferencesSetBool(String str, boolean z9, Promise promise) {
        k.f().g(str, z9);
        promise.resolve(null);
    }

    @ReactMethod
    public void preferencesSetString(String str, String str2, Promise promise) {
        k.f().h(str, str2);
        promise.resolve(null);
    }

    @ReactMethod
    public void removeListeners(Integer num) {
    }

    @ReactMethod
    public void setAutomaticDataCollectionEnabled(String str, Boolean bool) {
        f.p(str).D(bool);
    }
}
