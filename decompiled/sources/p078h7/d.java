package p078h7;

import H6.e;
import R8.g;
import android.os.Build;
import android.util.Log;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.E;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import org.json.JSONException;
import org.json.JSONObject;
import p048e7.C6956b;
import p048e7.C6975v;
import p048e7.Z;
import p129m8.n;
import p129m8.q;

/* JADX INFO: loaded from: classes3.dex */
public final class d implements o {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final a f44801g = new a(null);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final int f44802h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final Regex f44803i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Z f44804a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e f44805b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final C6956b f44806c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final p078h7.a f44807d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final l f44808e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final R8.a f44809f;

    private static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int a() {
            return d.f44802h;
        }

        private a() {
        }
    }

    static final class b extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f44810a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f44811b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f44812c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f44814e;

        b(p169q8.b bVar) {
            super(bVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f44812c = obj;
            this.f44814e |= LinearLayoutManager.INVALID_OFFSET;
            return d.this.d(this);
        }
    }

    static final class c extends l implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f44815a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f44816b;

        c(p169q8.b bVar) {
            super(2, bVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final p169q8.b create(Object obj, p169q8.b bVar) {
            c cVar = d.this.new c(bVar);
            cVar.f44816b = obj;
            return cVar;
        }

        /* JADX WARN: Code duplicated, block: B:44:0x00c0  */
        /* JADX WARN: Code duplicated, block: B:45:0x00c5  */
        /* JADX WARN: Code duplicated, block: B:48:0x00f0 A[RETURN] */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws JSONException {
            Boolean bool;
            Double d10;
            Integer num;
            l lVar;
            int iA;
            h hVar;
            Integer num2;
            Double d11;
            Object obj2;
            Object objE = p179r8.b.e();
            int i10 = this.f44815a;
            if (i10 == 0) {
                n.b(obj);
                JSONObject jSONObject = (JSONObject) this.f44816b;
                Log.d("FirebaseSessions", "Fetched settings: " + jSONObject);
                Integer num3 = 0;
                Integer num4 = null;
                Boolean bool2 = null;
                if (jSONObject.has("app_quality")) {
                    Object obj3 = jSONObject.get("app_quality");
                    Intrinsics.d(obj3, "null cannot be cast to non-null type org.json.JSONObject");
                    JSONObject jSONObject2 = (JSONObject) obj3;
                    try {
                        Boolean bool3 = jSONObject2.has("sessions_enabled") ? (Boolean) jSONObject2.get("sessions_enabled") : null;
                        try {
                            d11 = jSONObject2.has("sampling_rate") ? (Double) jSONObject2.get("sampling_rate") : null;
                            try {
                                num2 = jSONObject2.has("session_timeout_seconds") ? (Integer) jSONObject2.get("session_timeout_seconds") : null;
                                try {
                                    num4 = jSONObject2.has("cache_duration") ? (Integer) jSONObject2.get("cache_duration") : null;
                                    Unit unit = Unit.f45918a;
                                    num = num2;
                                    d10 = d11;
                                    bool = bool3;
                                    num3 = num4;
                                } catch (JSONException e10) {
                                    e = e10;
                                    Integer num5 = num4;
                                    bool2 = bool3;
                                    obj2 = num5;
                                    kotlin.coroutines.jvm.internal.b.c(Log.e("FirebaseSessions", "Error parsing the configs remotely fetched: ", e));
                                    num = num2;
                                    d10 = d11;
                                    bool = bool2;
                                    num3 = obj2;
                                }
                            } catch (JSONException e11) {
                                e = e11;
                                num2 = null;
                                bool2 = bool3;
                                obj2 = null;
                            }
                        } catch (JSONException e12) {
                            e = e12;
                            num2 = null;
                            d11 = null;
                            bool2 = bool3;
                            obj2 = d11;
                            kotlin.coroutines.jvm.internal.b.c(Log.e("FirebaseSessions", "Error parsing the configs remotely fetched: ", e));
                            num = num2;
                            d10 = d11;
                            bool = bool2;
                            num3 = obj2;
                            lVar = d.this.f44808e;
                            if (num3 != 0) {
                                iA = num3.intValue();
                            } else {
                                iA = d.f44801g.a();
                            }
                            hVar = new h(bool, d10, num, kotlin.coroutines.jvm.internal.b.c(iA), kotlin.coroutines.jvm.internal.b.d(d.this.f44804a.a().a()));
                            this.f44815a = 1;
                            if (lVar.e(hVar, this) == objE) {
                                return objE;
                            }
                            return Unit.f45918a;
                        }
                    } catch (JSONException e13) {
                        e = e13;
                        num2 = null;
                        d11 = null;
                    }
                } else {
                    bool = null;
                    d10 = null;
                    num = null;
                }
                lVar = d.this.f44808e;
                if (num3 != 0) {
                    iA = num3.intValue();
                } else {
                    iA = d.f44801g.a();
                }
                hVar = new h(bool, d10, num, kotlin.coroutines.jvm.internal.b.c(iA), kotlin.coroutines.jvm.internal.b.d(d.this.f44804a.a().a()));
                this.f44815a = 1;
                if (lVar.e(hVar, this) == objE) {
                    return objE;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                n.b(obj);
            }
            return Unit.f45918a;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
        public final Object invoke(JSONObject jSONObject, p169q8.b bVar) {
            return ((c) create(jSONObject, bVar)).invokeSuspend(Unit.f45918a);
        }
    }

    /* JADX INFO: renamed from: h7.d$d, reason: collision with other inner class name */
    static final class C0436d extends l implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f44818a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f44819b;

        C0436d(p169q8.b bVar) {
            super(2, bVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final p169q8.b create(Object obj, p169q8.b bVar) {
            C0436d c0436d = new C0436d(bVar);
            c0436d.f44819b = obj;
            return c0436d;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            p179r8.b.e();
            if (this.f44818a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            n.b(obj);
            Log.e("FirebaseSessions", "Error failed to fetch the remote configs: " + ((String) this.f44819b));
            return Unit.f45918a;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
        public final Object invoke(String str, p169q8.b bVar) {
            return ((C0436d) create(str, bVar)).invokeSuspend(Unit.f45918a);
        }
    }

    static {
        kotlin.time.b.a aVar = kotlin.time.b.f46051b;
        f44802h = (int) kotlin.time.b.t(kotlin.time.c.p(24, H8.b.HOURS));
        f44803i = new Regex("/");
    }

    public d(Z timeProvider, e firebaseInstallationsApi, C6956b appInfo, p078h7.a configsFetcher, l settingsCache) {
        Intrinsics.checkNotNullParameter(timeProvider, "timeProvider");
        Intrinsics.checkNotNullParameter(firebaseInstallationsApi, "firebaseInstallationsApi");
        Intrinsics.checkNotNullParameter(appInfo, "appInfo");
        Intrinsics.checkNotNullParameter(configsFetcher, "configsFetcher");
        Intrinsics.checkNotNullParameter(settingsCache, "settingsCache");
        this.f44804a = timeProvider;
        this.f44805b = firebaseInstallationsApi;
        this.f44806c = appInfo;
        this.f44807d = configsFetcher;
        this.f44808e = settingsCache;
        this.f44809f = g.b(false, 1, null);
    }

    private final String i(String str) {
        return f44803i.replace(str, "");
    }

    @Override // p078h7.o
    public Boolean a() {
        return this.f44808e.c();
    }

    @Override // p078h7.o
    public kotlin.time.b b() {
        Integer numD = this.f44808e.d();
        if (numD == null) {
            return null;
        }
        kotlin.time.b.a aVar = kotlin.time.b.f46051b;
        return kotlin.time.b.h(kotlin.time.c.p(numD.intValue(), H8.b.SECONDS));
    }

    @Override // p078h7.o
    public Double c() {
        return this.f44808e.a();
    }

    /* JADX WARN: Code duplicated, block: B:49:0x00c4 A[Catch: all -> 0x004f, TRY_LEAVE, TryCatch #2 {all -> 0x004f, blocks: (B:21:0x004a, B:47:0x00b6, B:49:0x00c4, B:52:0x00cf), top: B:64:0x004a }] */
    /* JADX WARN: Code duplicated, block: B:52:0x00cf A[Catch: all -> 0x004f, TRY_ENTER, TRY_LEAVE, TryCatch #2 {all -> 0x004f, blocks: (B:21:0x004a, B:47:0x00b6, B:49:0x00c4, B:52:0x00cf), top: B:64:0x004a }] */
    /* JADX WARN: Code duplicated, block: B:55:0x0146  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Instruction removed from duplicated block: B:52:0x00cf, please report this as an issue */
    @Override // p078h7.o
    public Object d(p169q8.b bVar) throws Throwable {
        b bVar2;
        R8.a aVar;
        d dVar;
        R8.a aVar2;
        Throwable th;
        R8.a aVar3;
        d dVar2;
        String strB;
        Map mapJ;
        p078h7.a aVar4;
        c cVar;
        C0436d c0436d;
        if (bVar instanceof b) {
            bVar2 = (b) bVar;
            int i10 = bVar2.f44814e;
            if ((i10 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                bVar2.f44814e = i10 - LinearLayoutManager.INVALID_OFFSET;
            } else {
                bVar2 = new b(bVar);
            }
        } else {
            bVar2 = new b(bVar);
        }
        Object obj = bVar2.f44812c;
        Object objE = p179r8.b.e();
        int i11 = bVar2.f44814e;
        try {
            if (i11 == 0) {
                n.b(obj);
                if (!this.f44809f.c() && !this.f44808e.b()) {
                    return Unit.f45918a;
                }
                aVar = this.f44809f;
                bVar2.f44810a = this;
                bVar2.f44811b = aVar;
                bVar2.f44814e = 1;
                if (aVar.d(null, bVar2) != objE) {
                    dVar = this;
                }
                return objE;
            }
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    aVar2 = (R8.a) bVar2.f44810a;
                    try {
                        n.b(obj);
                        Unit unit = Unit.f45918a;
                        aVar2.e(null);
                        return Unit.f45918a;
                    } catch (Throwable th2) {
                        th = th2;
                        aVar2.e(null);
                        throw th;
                    }
                }
                aVar3 = (R8.a) bVar2.f44811b;
                dVar2 = (d) bVar2.f44810a;
                try {
                    n.b(obj);
                    strB = ((C6975v) obj).b();
                    if (Intrinsics.b(strB, "")) {
                        Log.w("FirebaseSessions", "Error getting Firebase Installation ID. Skipping this Session Event.");
                        Unit unit2 = Unit.f45918a;
                        aVar3.e(null);
                        return unit2;
                    }
                    Pair pairA = q.a("X-Crashlytics-Installation-ID", strB);
                    Pair pairA2 = q.a("X-Crashlytics-Device-Model", dVar2.i(Build.MANUFACTURER + Build.MODEL));
                    String INCREMENTAL = Build.VERSION.INCREMENTAL;
                    Intrinsics.checkNotNullExpressionValue(INCREMENTAL, "INCREMENTAL");
                    Pair pairA3 = q.a("X-Crashlytics-OS-Build-Version", dVar2.i(INCREMENTAL));
                    String RELEASE = Build.VERSION.RELEASE;
                    Intrinsics.checkNotNullExpressionValue(RELEASE, "RELEASE");
                    mapJ = E.j(pairA, pairA2, pairA3, q.a("X-Crashlytics-OS-Display-Version", dVar2.i(RELEASE)), q.a("X-Crashlytics-API-Client-Version", dVar2.f44806c.f()));
                    Log.d("FirebaseSessions", "Fetching settings from server.");
                    aVar4 = dVar2.f44807d;
                    cVar = dVar2.new c(null);
                    c0436d = new C0436d(null);
                    bVar2.f44810a = aVar3;
                    bVar2.f44811b = null;
                    bVar2.f44814e = 3;
                    if (aVar4.a(mapJ, cVar, c0436d, bVar2) != objE) {
                        aVar2 = aVar3;
                        Unit unit3 = Unit.f45918a;
                        aVar2.e(null);
                        return Unit.f45918a;
                    }
                    return objE;
                } catch (Throwable th3) {
                    th = th3;
                    aVar2 = aVar3;
                    aVar2.e(null);
                    throw th;
                }
            }
            R8.a aVar5 = (R8.a) bVar2.f44811b;
            dVar = (d) bVar2.f44810a;
            n.b(obj);
            aVar = aVar5;
            if (!dVar.f44808e.b()) {
                Log.d("FirebaseSessions", "Remote settings cache not expired. Using cached values.");
                Unit unit4 = Unit.f45918a;
                aVar.e(null);
                return unit4;
            }
            C6975v.a aVar6 = C6975v.f43503c;
            e eVar = dVar.f44805b;
            bVar2.f44810a = dVar;
            bVar2.f44811b = aVar;
            bVar2.f44814e = 2;
            Object objA = aVar6.a(eVar, bVar2);
            if (objA != objE) {
                aVar3 = aVar;
                obj = objA;
                dVar2 = dVar;
                strB = ((C6975v) obj).b();
                if (Intrinsics.b(strB, "")) {
                    Log.w("FirebaseSessions", "Error getting Firebase Installation ID. Skipping this Session Event.");
                    Unit unit5 = Unit.f45918a;
                    aVar3.e(null);
                    return unit5;
                }
                Pair pairA4 = q.a("X-Crashlytics-Installation-ID", strB);
                Pair pairA5 = q.a("X-Crashlytics-Device-Model", dVar2.i(Build.MANUFACTURER + Build.MODEL));
                String INCREMENTAL2 = Build.VERSION.INCREMENTAL;
                Intrinsics.checkNotNullExpressionValue(INCREMENTAL2, "INCREMENTAL");
                Pair pairA6 = q.a("X-Crashlytics-OS-Build-Version", dVar2.i(INCREMENTAL2));
                String RELEASE2 = Build.VERSION.RELEASE;
                Intrinsics.checkNotNullExpressionValue(RELEASE2, "RELEASE");
                mapJ = E.j(pairA4, pairA5, pairA6, q.a("X-Crashlytics-OS-Display-Version", dVar2.i(RELEASE2)), q.a("X-Crashlytics-API-Client-Version", dVar2.f44806c.f()));
                Log.d("FirebaseSessions", "Fetching settings from server.");
                aVar4 = dVar2.f44807d;
                cVar = dVar2.new c(null);
                c0436d = new C0436d(null);
                bVar2.f44810a = aVar3;
                bVar2.f44811b = null;
                bVar2.f44814e = 3;
                if (aVar4.a(mapJ, cVar, c0436d, bVar2) != objE) {
                    aVar2 = aVar3;
                    Unit unit6 = Unit.f45918a;
                    aVar2.e(null);
                    return Unit.f45918a;
                }
            }
            return objE;
        } catch (Throwable th4) {
            aVar2 = aVar;
            th = th4;
            aVar2.e(null);
            throw th;
        }
    }
}
