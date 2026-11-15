package p048e7;

import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import com.unity3d.services.core.device.reader.JsonStorageKeyNames;
import p257z6.c;

/* JADX INFO: renamed from: e7.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C6957c implements A6.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final A6.a f43431a = new C6957c();

    /* JADX INFO: renamed from: e7.c$a */
    private static final class a implements p257z6.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final a f43432a = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final c f43433b = c.d(HandleInvocationsFromAdViewer.KEY_PACKAGE_NAME);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final c f43434c = c.d("versionName");

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final c f43435d = c.d("appBuildVersion");

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final c f43436e = c.d("deviceManufacturer");

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final c f43437f = c.d("currentProcessDetails");

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private static final c f43438g = c.d("appProcessDetails");

        private a() {
        }

        @Override // p257z6.d
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(C6955a c6955a, p257z6.e eVar) {
            eVar.b(f43433b, c6955a.e());
            eVar.b(f43434c, c6955a.f());
            eVar.b(f43435d, c6955a.a());
            eVar.b(f43436e, c6955a.d());
            eVar.b(f43437f, c6955a.c());
            eVar.b(f43438g, c6955a.b());
        }
    }

    /* JADX INFO: renamed from: e7.c$b */
    private static final class b implements p257z6.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final b f43439a = new b();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final c f43440b = c.d("appId");

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final c f43441c = c.d("deviceModel");

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final c f43442d = c.d("sessionSdkVersion");

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final c f43443e = c.d("osVersion");

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final c f43444f = c.d("logEnvironment");

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private static final c f43445g = c.d("androidAppInfo");

        private b() {
        }

        @Override // p257z6.d
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(C6956b c6956b, p257z6.e eVar) {
            eVar.b(f43440b, c6956b.b());
            eVar.b(f43441c, c6956b.c());
            eVar.b(f43442d, c6956b.f());
            eVar.b(f43443e, c6956b.e());
            eVar.b(f43444f, c6956b.d());
            eVar.b(f43445g, c6956b.a());
        }
    }

    /* JADX INFO: renamed from: e7.c$c, reason: collision with other inner class name */
    private static final class C0418c implements p257z6.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final C0418c f43446a = new C0418c();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final c f43447b = c.d("performance");

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final c f43448c = c.d("crashlytics");

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final c f43449d = c.d("sessionSamplingRate");

        private C0418c() {
        }

        @Override // p257z6.d
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(C6959e c6959e, p257z6.e eVar) {
            eVar.b(f43447b, c6959e.b());
            eVar.b(f43448c, c6959e.a());
            eVar.c(f43449d, c6959e.c());
        }
    }

    /* JADX INFO: renamed from: e7.c$d */
    private static final class d implements p257z6.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final d f43450a = new d();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final c f43451b = c.d("processName");

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final c f43452c = c.d("pid");

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final c f43453d = c.d("importance");

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final c f43454e = c.d("defaultProcess");

        private d() {
        }

        @Override // p257z6.d
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(E e10, p257z6.e eVar) {
            eVar.b(f43451b, e10.c());
            eVar.d(f43452c, e10.b());
            eVar.d(f43453d, e10.a());
            eVar.f(f43454e, e10.d());
        }
    }

    /* JADX INFO: renamed from: e7.c$e */
    private static final class e implements p257z6.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final e f43455a = new e();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final c f43456b = c.d("eventType");

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final c f43457c = c.d("sessionData");

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final c f43458d = c.d("applicationInfo");

        private e() {
        }

        @Override // p257z6.d
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(K k10, p257z6.e eVar) {
            eVar.b(f43456b, k10.b());
            eVar.b(f43457c, k10.c());
            eVar.b(f43458d, k10.a());
        }
    }

    /* JADX INFO: renamed from: e7.c$f */
    private static final class f implements p257z6.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final f f43459a = new f();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final c f43460b = c.d(JsonStorageKeyNames.SESSION_ID_KEY);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final c f43461c = c.d("firstSessionId");

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final c f43462d = c.d("sessionIndex");

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final c f43463e = c.d("eventTimestampUs");

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final c f43464f = c.d("dataCollectionStatus");

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private static final c f43465g = c.d("firebaseInstallationId");

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private static final c f43466h = c.d("firebaseAuthenticationToken");

        private f() {
        }

        @Override // p257z6.d
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(S s10, p257z6.e eVar) {
            eVar.b(f43460b, s10.f());
            eVar.b(f43461c, s10.e());
            eVar.d(f43462d, s10.g());
            eVar.e(f43463e, s10.b());
            eVar.b(f43464f, s10.a());
            eVar.b(f43465g, s10.d());
            eVar.b(f43466h, s10.c());
        }
    }

    private C6957c() {
    }

    @Override // A6.a
    public void a(A6.b bVar) {
        bVar.a(K.class, e.f43455a);
        bVar.a(S.class, f.f43459a);
        bVar.a(C6959e.class, C0418c.f43446a);
        bVar.a(C6956b.class, b.f43439a);
        bVar.a(C6955a.class, a.f43432a);
        bVar.a(E.class, d.f43450a);
    }
}
