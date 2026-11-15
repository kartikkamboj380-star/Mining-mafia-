package sk.kedros.playintegrity;

import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.google.android.gms.tasks.Task;
import com.google.android.play.core.integrity.C6687a;
import com.google.android.play.core.integrity.IntegrityManager;
import com.google.android.play.core.integrity.IntegrityManagerFactory;
import com.google.android.play.core.integrity.IntegrityTokenRequest;
import com.google.android.play.core.integrity.IntegrityTokenResponse;
import com.google.android.play.core.integrity.InterfaceC6689c;
import p176r5.InterfaceC7088e;
import p176r5.InterfaceC7089f;
import p176r5.InterfaceC7090g;

/* JADX INFO: loaded from: classes3.dex */
public class RNGooglePlayIntegrityModule extends ReactContextBaseJavaModule {
    private static final String UNEXPECTED_ERROR_CODE = "-255";
    private final ReactApplicationContext baseContext;
    private final ReactApplicationContext reactContext;
    private volatile InterfaceC6689c.InterfaceC0366c standardIntegrityTokenProvider;

    class a implements InterfaceC7088e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Promise f49414a;

        a(Promise promise) {
            this.f49414a = promise;
        }

        @Override // p176r5.InterfaceC7088e
        public void a() {
            this.f49414a.reject(RNGooglePlayIntegrityModule.UNEXPECTED_ERROR_CODE, "Canceled");
        }
    }

    class b implements InterfaceC7090g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Promise f49416a;

        b(Promise promise) {
            this.f49416a = promise;
        }

        @Override // p176r5.InterfaceC7090g
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(InterfaceC6689c.InterfaceC0366c interfaceC0366c) {
            RNGooglePlayIntegrityModule.this.standardIntegrityTokenProvider = interfaceC0366c;
            this.f49416a.resolve(null);
        }
    }

    class c implements InterfaceC7089f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Promise f49418a;

        c(Promise promise) {
            this.f49418a = promise;
        }

        @Override // p176r5.InterfaceC7089f
        public void onFailure(Exception exc) {
            if (!(exc instanceof C6687a)) {
                this.f49418a.reject(RNGooglePlayIntegrityModule.UNEXPECTED_ERROR_CODE, exc);
            } else {
                C6687a c6687a = (C6687a) exc;
                this.f49418a.reject(String.valueOf(c6687a.a()), c6687a);
            }
        }
    }

    class d implements InterfaceC7088e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Promise f49420a;

        d(Promise promise) {
            this.f49420a = promise;
        }

        @Override // p176r5.InterfaceC7088e
        public void a() {
            this.f49420a.reject(RNGooglePlayIntegrityModule.UNEXPECTED_ERROR_CODE, "Canceled");
        }
    }

    class e implements InterfaceC7090g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Promise f49422a;

        e(Promise promise) {
            this.f49422a = promise;
        }

        @Override // p176r5.InterfaceC7090g
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(IntegrityTokenResponse integrityTokenResponse) {
            this.f49422a.resolve(integrityTokenResponse.token());
        }
    }

    class f implements InterfaceC7089f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Promise f49424a;

        f(Promise promise) {
            this.f49424a = promise;
        }

        @Override // p176r5.InterfaceC7089f
        public void onFailure(Exception exc) {
            if (!(exc instanceof C6687a)) {
                this.f49424a.reject(RNGooglePlayIntegrityModule.UNEXPECTED_ERROR_CODE, exc);
            } else {
                C6687a c6687a = (C6687a) exc;
                this.f49424a.reject(String.valueOf(c6687a.a()), c6687a);
            }
        }
    }

    class g implements InterfaceC7088e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Promise f49426a;

        g(Promise promise) {
            this.f49426a = promise;
        }

        @Override // p176r5.InterfaceC7088e
        public void a() {
            this.f49426a.reject(RNGooglePlayIntegrityModule.UNEXPECTED_ERROR_CODE, "Canceled");
        }
    }

    class h implements InterfaceC7090g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Promise f49428a;

        h(Promise promise) {
            this.f49428a = promise;
        }

        @Override // p176r5.InterfaceC7090g
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(InterfaceC6689c.b bVar) {
            this.f49428a.resolve(bVar.a());
        }
    }

    class i implements InterfaceC7089f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Promise f49430a;

        i(Promise promise) {
            this.f49430a = promise;
        }

        @Override // p176r5.InterfaceC7089f
        public void onFailure(Exception exc) {
            if (!(exc instanceof C6687a)) {
                this.f49430a.reject(RNGooglePlayIntegrityModule.UNEXPECTED_ERROR_CODE, exc);
            } else {
                C6687a c6687a = (C6687a) exc;
                this.f49430a.reject(String.valueOf(c6687a.a()), c6687a);
            }
        }
    }

    public RNGooglePlayIntegrityModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        this.reactContext = reactApplicationContext;
        this.baseContext = getReactApplicationContext();
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "RNGooglePlayIntegrity";
    }

    @ReactMethod
    public void isPlayIntegrityAvailable(Promise promise) {
        promise.resolve(Boolean.valueOf(GooglePlayServicesUtil.isGooglePlayServicesAvailable(this.baseContext) == 0));
    }

    @ReactMethod
    public void isStandardIntegrityTokenProviderPrepared(Promise promise) {
        promise.resolve(Boolean.valueOf(this.standardIntegrityTokenProvider != null));
    }

    @ReactMethod
    public void prepareStandardIntegrityTokenProvider(String str, Promise promise) {
        try {
            InterfaceC6689c interfaceC6689cA = IntegrityManagerFactory.a(this.baseContext);
            InterfaceC6689c.a.AbstractC0365a abstractC0365aC = InterfaceC6689c.a.c();
            if (str != null && !str.isEmpty()) {
                abstractC0365aC.b(Long.parseLong(str));
            }
            Task taskA = interfaceC6689cA.a(abstractC0365aC.a());
            taskA.b(new a(promise));
            taskA.g(new b(promise));
            taskA.e(new c(promise));
        } catch (Throwable th) {
            promise.reject(UNEXPECTED_ERROR_CODE, th);
        }
    }

    @ReactMethod
    public void requestIntegrityToken(String str, String str2, Promise promise) {
        try {
            IntegrityManager integrityManagerCreate = IntegrityManagerFactory.create(this.baseContext);
            IntegrityTokenRequest.Builder nonce = IntegrityTokenRequest.builder().setNonce(str);
            if (str2 != null && !str2.isEmpty()) {
                nonce.setCloudProjectNumber(Long.parseLong(str2));
            }
            Task<IntegrityTokenResponse> taskRequestIntegrityToken = integrityManagerCreate.requestIntegrityToken(nonce.build());
            taskRequestIntegrityToken.b(new d(promise));
            taskRequestIntegrityToken.g(new e(promise));
            taskRequestIntegrityToken.e(new f(promise));
        } catch (Throwable th) {
            promise.reject(UNEXPECTED_ERROR_CODE, th);
        }
    }

    @ReactMethod
    public void requestStandardIntegrityToken(String str, Promise promise) {
        try {
            if (this.standardIntegrityTokenProvider == null) {
                promise.reject(UNEXPECTED_ERROR_CODE, "Integrity token provider not prepared");
                return;
            }
            Task taskA = this.standardIntegrityTokenProvider.a(InterfaceC6689c.d.b().b(str).a());
            taskA.b(new g(promise));
            taskA.g(new h(promise));
            taskA.e(new i(promise));
        } catch (Throwable th) {
            promise.reject(UNEXPECTED_ERROR_CODE, th);
        }
    }
}
