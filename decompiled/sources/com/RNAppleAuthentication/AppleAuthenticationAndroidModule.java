package com.RNAppleAuthentication;

import android.app.Activity;
import androidx.fragment.app.AbstractActivityC1148t;
import androidx.fragment.app.G;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
import com.google.android.gms.common.Scopes;
import com.unity3d.ads.metadata.MediationMetaData;
import java.security.MessageDigest;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import org.json.JSONObject;
import p202u1.d;
import p202u1.h;

/* JADX INFO: loaded from: classes.dex */
public class AppleAuthenticationAndroidModule extends ReactContextBaseJavaModule {
    private static final String E_NOT_CONFIGURED_ERROR = "E_NOT_CONFIGURED_ERROR";
    private static final String E_SIGNIN_CANCELLED_ERROR = "E_SIGNIN_CANCELLED_ERROR";
    private static final String E_SIGNIN_FAILED_ERROR = "E_SIGNIN_FAILED_ERROR";
    private com.RNAppleAuthentication.a configuration;
    private final ReactApplicationContext reactContext;

    class a implements d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Promise f12388a;

        a(Promise promise) {
            this.f12388a = promise;
        }

        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        @Override // p202u1.d
        public void a(String str, String str2, String str3, String str4) {
            WritableMap writableMapCreateMap = Arguments.createMap();
            writableMapCreateMap.putString("code", str);
            writableMapCreateMap.putString("id_token", str2);
            writableMapCreateMap.putString("state", str3);
            String strC = AppleAuthenticationAndroidModule.this.configuration.c();
            if (!strC.isEmpty()) {
                writableMapCreateMap.putString("nonce", strC);
            }
            try {
                JSONObject jSONObject = new JSONObject(str4);
                WritableMap writableMapCreateMap2 = Arguments.createMap();
                if (jSONObject.has(MediationMetaData.KEY_NAME)) {
                    JSONObject jSONObject2 = jSONObject.getJSONObject(MediationMetaData.KEY_NAME);
                    WritableMap writableMapCreateMap3 = Arguments.createMap();
                    if (jSONObject2.has("firstName")) {
                        writableMapCreateMap3.putString("firstName", jSONObject2.getString("firstName"));
                    }
                    if (jSONObject2.has("lastName")) {
                        writableMapCreateMap3.putString("lastName", jSONObject2.getString("lastName"));
                    }
                    if (writableMapCreateMap3.hasKey("firstName") || writableMapCreateMap3.hasKey("lastName")) {
                        writableMapCreateMap2.putMap(MediationMetaData.KEY_NAME, writableMapCreateMap3);
                    }
                }
                if (jSONObject.has(Scopes.EMAIL)) {
                    writableMapCreateMap2.putString(Scopes.EMAIL, jSONObject.getString(Scopes.EMAIL));
                }
                if (writableMapCreateMap2.hasKey(MediationMetaData.KEY_NAME) || writableMapCreateMap2.hasKey(Scopes.EMAIL)) {
                    writableMapCreateMap.putMap("user", writableMapCreateMap2);
                }
            } catch (Exception unused) {
            }
            this.f12388a.resolve(writableMapCreateMap);
        }

        @Override // p202u1.d
        public void b() {
            this.f12388a.reject(AppleAuthenticationAndroidModule.E_SIGNIN_CANCELLED_ERROR);
        }

        @Override // p202u1.d
        public void c(Throwable th) {
            this.f12388a.reject(AppleAuthenticationAndroidModule.E_SIGNIN_FAILED_ERROR, th);
        }
    }

    class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ h f12390a;

        b(h hVar) {
            this.f12390a = hVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f12390a.a();
        }
    }

    public AppleAuthenticationAndroidModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        this.reactContext = reactApplicationContext;
    }

    private static String bytesToHex(byte[] bArr) {
        StringBuffer stringBuffer = new StringBuffer();
        for (int i10 = 0; i10 < bArr.length; i10++) {
            stringBuffer.append(Character.forDigit((bArr[i10] >> 4) & 15, 16));
            stringBuffer.append(Character.forDigit(bArr[i10] & 15, 16));
        }
        return stringBuffer.toString();
    }

    private G getFragmentManagerHelper() {
        Activity currentActivity = getCurrentActivity();
        if (currentActivity == null || !(currentActivity instanceof AbstractActivityC1148t)) {
            return null;
        }
        return ((AbstractActivityC1148t) currentActivity).C();
    }

    @ReactMethod
    public void configure(ReadableMap readableMap) {
        String strBytesToHex;
        String string;
        String string2;
        com.RNAppleAuthentication.a.c cVarValueOf = com.RNAppleAuthentication.a.c.f12413c;
        com.RNAppleAuthentication.a.b bVar = com.RNAppleAuthentication.a.b.f12406a;
        String string3 = UUID.randomUUID().toString();
        boolean z9 = readableMap.hasKey("nonceEnabled") ? readableMap.getBoolean("nonceEnabled") : true;
        String string4 = "";
        String string5 = readableMap.hasKey("clientId") ? readableMap.getString("clientId") : "";
        String string6 = readableMap.hasKey("redirectUri") ? readableMap.getString("redirectUri") : "";
        if (readableMap.hasKey("scope") && (string2 = readableMap.getString("scope")) != null) {
            cVarValueOf = com.RNAppleAuthentication.a.c.valueOf(string2);
        }
        if (readableMap.hasKey("responseType") && (string = readableMap.getString("responseType")) != null) {
            com.RNAppleAuthentication.a.b.valueOf(string);
        }
        if (readableMap.hasKey("state")) {
            string3 = readableMap.getString("state");
        }
        if (z9) {
            string4 = readableMap.hasKey("nonce") ? readableMap.getString("nonce") : UUID.randomUUID().toString();
            try {
                MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
                messageDigest.update(string4.getBytes());
                strBytesToHex = bytesToHex(messageDigest.digest());
            } catch (Exception unused) {
                strBytesToHex = string4;
            }
        } else {
            strBytesToHex = string4;
        }
        this.configuration = new com.RNAppleAuthentication.a.C0207a().b(string5).e(string6).f(com.RNAppleAuthentication.a.b.f12408c).g(cVarValueOf).h(string3).d(string4).c(strBytesToHex).a();
    }

    @Override // com.facebook.react.bridge.BaseJavaModule
    public Map<String, Object> getConstants() {
        HashMap map = new HashMap();
        map.put("ALL", com.RNAppleAuthentication.a.b.f12408c.toString());
        map.put("CODE", com.RNAppleAuthentication.a.b.f12406a.toString());
        map.put("ID_TOKEN", com.RNAppleAuthentication.a.b.f12407b.toString());
        HashMap map2 = new HashMap();
        map2.put("ALL", com.RNAppleAuthentication.a.c.f12413c.toString());
        map2.put("EMAIL", com.RNAppleAuthentication.a.c.f12412b.toString());
        map2.put("NAME", com.RNAppleAuthentication.a.c.f12411a.toString());
        HashMap map3 = new HashMap();
        map3.put(E_NOT_CONFIGURED_ERROR, E_NOT_CONFIGURED_ERROR);
        map3.put(E_SIGNIN_FAILED_ERROR, E_SIGNIN_FAILED_ERROR);
        map3.put(E_SIGNIN_CANCELLED_ERROR, E_SIGNIN_CANCELLED_ERROR);
        map3.put("ResponseType", map);
        map3.put("Scope", map2);
        map3.put("isSupported", true);
        return map3;
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "RNAppleAuthModuleAndroid";
    }

    @ReactMethod
    public void signIn(Promise promise) {
        if (this.configuration == null) {
            promise.reject(E_NOT_CONFIGURED_ERROR);
            return;
        }
        G fragmentManagerHelper = getFragmentManagerHelper();
        if (fragmentManagerHelper == null) {
            promise.reject(E_NOT_CONFIGURED_ERROR);
            return;
        }
        h hVar = new h(fragmentManagerHelper, "SignInWithAppleButton-$id-SignInWebViewDialogFragment", this.configuration, new a(promise));
        Activity currentActivity = getCurrentActivity();
        if (currentActivity == null) {
            promise.reject(new RuntimeException("Activity is not found"));
        } else {
            currentActivity.runOnUiThread(new b(hVar));
        }
    }
}
