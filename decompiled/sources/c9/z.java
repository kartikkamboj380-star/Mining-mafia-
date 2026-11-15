package c9;

import com.unity3d.services.UnityAdsConstants;
import java.net.Proxy;
import java.net.ProxySelector;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public class z implements Cloneable, InterfaceC1217e.a {

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public static final b f12291V = new b(null);

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    private static final List f12292W = d9.e.w(A.HTTP_2, A.HTTP_1_1);

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    private static final List f12293X = d9.e.w(l.f12181i, l.f12183k);

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private final SocketFactory f12294G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private final SSLSocketFactory f12295H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private final X509TrustManager f12296I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private final List f12297J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    private final List f12298K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    private final HostnameVerifier f12299L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    private final C1219g f12300M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    private final p9.c f12301N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final int f12302O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    private final int f12303P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    private final int f12304Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    private final int f12305R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    private final int f12306S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    private final long f12307T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    private final h9.h f12308U;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p f12309a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final k f12310b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List f12311c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final List f12312d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final r.c f12313e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final boolean f12314f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final InterfaceC1214b f12315g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final boolean f12316h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final boolean f12317i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final n f12318j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final C1215c f12319k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final q f12320l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final Proxy f12321m;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final ProxySelector f12322v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final InterfaceC1214b f12323w;

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final List a() {
            return z.f12293X;
        }

        public final List b() {
            return z.f12292W;
        }

        private b() {
        }
    }

    public z(a builder) throws NoSuchAlgorithmException, KeyStoreException {
        ProxySelector proxySelectorD;
        Intrinsics.checkNotNullParameter(builder, "builder");
        this.f12309a = builder.q();
        this.f12310b = builder.n();
        this.f12311c = d9.e.V(builder.w());
        this.f12312d = d9.e.V(builder.y());
        this.f12313e = builder.s();
        this.f12314f = builder.F();
        this.f12315g = builder.h();
        this.f12316h = builder.t();
        this.f12317i = builder.u();
        this.f12318j = builder.p();
        this.f12319k = builder.i();
        this.f12320l = builder.r();
        this.f12321m = builder.B();
        if (builder.B() != null) {
            proxySelectorD = o9.a.f47701a;
        } else {
            proxySelectorD = builder.D();
            proxySelectorD = proxySelectorD == null ? ProxySelector.getDefault() : proxySelectorD;
            if (proxySelectorD == null) {
                proxySelectorD = o9.a.f47701a;
            }
        }
        this.f12322v = proxySelectorD;
        this.f12323w = builder.C();
        this.f12294G = builder.H();
        List listO = builder.o();
        this.f12297J = listO;
        this.f12298K = builder.A();
        this.f12299L = builder.v();
        this.f12302O = builder.j();
        this.f12303P = builder.m();
        this.f12304Q = builder.E();
        this.f12305R = builder.J();
        this.f12306S = builder.z();
        this.f12307T = builder.x();
        h9.h hVarG = builder.G();
        this.f12308U = hVarG == null ? new h9.h() : hVarG;
        if (listO == null || !listO.isEmpty()) {
            Iterator it = listO.iterator();
            while (it.hasNext()) {
                if (((l) it.next()).f()) {
                    if (builder.I() != null) {
                        this.f12295H = builder.I();
                        p9.c cVarK = builder.k();
                        Intrinsics.c(cVarK);
                        this.f12301N = cVarK;
                        X509TrustManager x509TrustManagerK = builder.K();
                        Intrinsics.c(x509TrustManagerK);
                        this.f12296I = x509TrustManagerK;
                        C1219g c1219gL = builder.l();
                        Intrinsics.c(cVarK);
                        this.f12300M = c1219gL.e(cVarK);
                    } else {
                        m9.j.a aVar = m9.j.f46495a;
                        X509TrustManager x509TrustManagerP = aVar.g().p();
                        this.f12296I = x509TrustManagerP;
                        m9.j jVarG = aVar.g();
                        Intrinsics.c(x509TrustManagerP);
                        this.f12295H = jVarG.o(x509TrustManagerP);
                        p9.c.a aVar2 = p9.c.f47973a;
                        Intrinsics.c(x509TrustManagerP);
                        p9.c cVarA = aVar2.a(x509TrustManagerP);
                        this.f12301N = cVarA;
                        C1219g c1219gL2 = builder.l();
                        Intrinsics.c(cVarA);
                        this.f12300M = c1219gL2.e(cVarA);
                    }
                }
            }
            this.f12295H = null;
            this.f12301N = null;
            this.f12296I = null;
            this.f12300M = C1219g.f12044d;
        } else {
            this.f12295H = null;
            this.f12301N = null;
            this.f12296I = null;
            this.f12300M = C1219g.f12044d;
        }
        R();
    }

    private final void R() {
        List list = this.f12311c;
        Intrinsics.d(list, "null cannot be cast to non-null type kotlin.collections.List<okhttp3.Interceptor?>");
        if (list.contains(null)) {
            throw new IllegalStateException(("Null interceptor: " + this.f12311c).toString());
        }
        List list2 = this.f12312d;
        Intrinsics.d(list2, "null cannot be cast to non-null type kotlin.collections.List<okhttp3.Interceptor?>");
        if (list2.contains(null)) {
            throw new IllegalStateException(("Null network interceptor: " + this.f12312d).toString());
        }
        List list3 = this.f12297J;
        if (list3 == null || !list3.isEmpty()) {
            Iterator it = list3.iterator();
            while (it.hasNext()) {
                if (((l) it.next()).f()) {
                    if (this.f12295H == null) {
                        throw new IllegalStateException("sslSocketFactory == null");
                    }
                    if (this.f12301N == null) {
                        throw new IllegalStateException("certificateChainCleaner == null");
                    }
                    if (this.f12296I == null) {
                        throw new IllegalStateException("x509TrustManager == null");
                    }
                    return;
                }
            }
        }
        if (this.f12295H != null) {
            throw new IllegalStateException("Check failed.");
        }
        if (this.f12301N != null) {
            throw new IllegalStateException("Check failed.");
        }
        if (this.f12296I != null) {
            throw new IllegalStateException("Check failed.");
        }
        if (!Intrinsics.b(this.f12300M, C1219g.f12044d)) {
            throw new IllegalStateException("Check failed.");
        }
    }

    public final List A() {
        return this.f12311c;
    }

    public final long B() {
        return this.f12307T;
    }

    public final List C() {
        return this.f12312d;
    }

    public a D() {
        return new a(this);
    }

    public H E(B request, I listener) {
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(listener, "listener");
        q9.d dVar = new q9.d(g9.e.f44447i, request, listener, new Random(), this.f12306S, null, this.f12307T);
        dVar.o(this);
        return dVar;
    }

    public final int F() {
        return this.f12306S;
    }

    public final List G() {
        return this.f12298K;
    }

    public final Proxy H() {
        return this.f12321m;
    }

    public final InterfaceC1214b I() {
        return this.f12323w;
    }

    public final ProxySelector K() {
        return this.f12322v;
    }

    public final int L() {
        return this.f12304Q;
    }

    public final boolean M() {
        return this.f12314f;
    }

    public final SocketFactory O() {
        return this.f12294G;
    }

    public final SSLSocketFactory P() {
        SSLSocketFactory sSLSocketFactory = this.f12295H;
        if (sSLSocketFactory != null) {
            return sSLSocketFactory;
        }
        throw new IllegalStateException("CLEARTEXT-only client");
    }

    public final int U() {
        return this.f12305R;
    }

    public final X509TrustManager V() {
        return this.f12296I;
    }

    @Override // c9.InterfaceC1217e.a
    public InterfaceC1217e b(B request) {
        Intrinsics.checkNotNullParameter(request, "request");
        return new h9.e(this, request, false);
    }

    public final int c() {
        return this.f12302O;
    }

    public Object clone() {
        return super.clone();
    }

    public final n d() {
        return this.f12318j;
    }

    public final p e() {
        return this.f12309a;
    }

    public final InterfaceC1214b i() {
        return this.f12315g;
    }

    public final C1215c k() {
        return this.f12319k;
    }

    public final int l() {
        return this.f12302O;
    }

    public final p9.c m() {
        return this.f12301N;
    }

    public final C1219g n() {
        return this.f12300M;
    }

    public final int o() {
        return this.f12303P;
    }

    public final k p() {
        return this.f12310b;
    }

    public final List q() {
        return this.f12297J;
    }

    public final n r() {
        return this.f12318j;
    }

    public final p s() {
        return this.f12309a;
    }

    public final q t() {
        return this.f12320l;
    }

    public final r.c u() {
        return this.f12313e;
    }

    public final boolean w() {
        return this.f12316h;
    }

    public final boolean x() {
        return this.f12317i;
    }

    public final h9.h y() {
        return this.f12308U;
    }

    public final HostnameVerifier z() {
        return this.f12299L;
    }

    public static final class a {

        /* JADX INFO: renamed from: A, reason: collision with root package name */
        private int f12324A;

        /* JADX INFO: renamed from: B, reason: collision with root package name */
        private int f12325B;

        /* JADX INFO: renamed from: C, reason: collision with root package name */
        private long f12326C;

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        private h9.h f12327D;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private p f12328a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private k f12329b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final List f12330c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final List f12331d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private r.c f12332e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private boolean f12333f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private InterfaceC1214b f12334g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private boolean f12335h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private boolean f12336i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private n f12337j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private C1215c f12338k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private q f12339l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private Proxy f12340m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private ProxySelector f12341n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private InterfaceC1214b f12342o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private SocketFactory f12343p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private SSLSocketFactory f12344q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private X509TrustManager f12345r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        private List f12346s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private List f12347t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        private HostnameVerifier f12348u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        private C1219g f12349v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        private p9.c f12350w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        private int f12351x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        private int f12352y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        private int f12353z;

        public a() {
            this.f12328a = new p();
            this.f12329b = new k();
            this.f12330c = new ArrayList();
            this.f12331d = new ArrayList();
            this.f12332e = d9.e.g(r.f12230b);
            this.f12333f = true;
            InterfaceC1214b interfaceC1214b = InterfaceC1214b.f11984b;
            this.f12334g = interfaceC1214b;
            this.f12335h = true;
            this.f12336i = true;
            this.f12337j = n.f12216b;
            this.f12339l = q.f12227b;
            this.f12342o = interfaceC1214b;
            SocketFactory socketFactory = SocketFactory.getDefault();
            Intrinsics.checkNotNullExpressionValue(socketFactory, "getDefault()");
            this.f12343p = socketFactory;
            b bVar = z.f12291V;
            this.f12346s = bVar.a();
            this.f12347t = bVar.b();
            this.f12348u = p9.d.f47974a;
            this.f12349v = C1219g.f12044d;
            this.f12352y = UnityAdsConstants.AdOperations.SHOW_TIMEOUT_MS;
            this.f12353z = UnityAdsConstants.AdOperations.SHOW_TIMEOUT_MS;
            this.f12324A = UnityAdsConstants.AdOperations.SHOW_TIMEOUT_MS;
            this.f12326C = 1024L;
        }

        public final List A() {
            return this.f12347t;
        }

        public final Proxy B() {
            return this.f12340m;
        }

        public final InterfaceC1214b C() {
            return this.f12342o;
        }

        public final ProxySelector D() {
            return this.f12341n;
        }

        public final int E() {
            return this.f12353z;
        }

        public final boolean F() {
            return this.f12333f;
        }

        public final h9.h G() {
            return this.f12327D;
        }

        public final SocketFactory H() {
            return this.f12343p;
        }

        public final SSLSocketFactory I() {
            return this.f12344q;
        }

        public final int J() {
            return this.f12324A;
        }

        public final X509TrustManager K() {
            return this.f12345r;
        }

        public final a L(List protocols) {
            Intrinsics.checkNotNullParameter(protocols, "protocols");
            List listY0 = CollectionsKt.y0(protocols);
            A a10 = A.H2_PRIOR_KNOWLEDGE;
            if (!listY0.contains(a10) && !listY0.contains(A.HTTP_1_1)) {
                throw new IllegalArgumentException(("protocols must contain h2_prior_knowledge or http/1.1: " + listY0).toString());
            }
            if (listY0.contains(a10) && listY0.size() > 1) {
                throw new IllegalArgumentException(("protocols containing h2_prior_knowledge cannot use other protocols: " + listY0).toString());
            }
            if (listY0.contains(A.HTTP_1_0)) {
                throw new IllegalArgumentException(("protocols must not contain http/1.0: " + listY0).toString());
            }
            Intrinsics.d(listY0, "null cannot be cast to non-null type kotlin.collections.List<okhttp3.Protocol?>");
            if (listY0.contains(null)) {
                throw new IllegalArgumentException("protocols must not contain null");
            }
            listY0.remove(A.SPDY_3);
            if (!Intrinsics.b(listY0, this.f12347t)) {
                this.f12327D = null;
            }
            List listUnmodifiableList = Collections.unmodifiableList(listY0);
            Intrinsics.checkNotNullExpressionValue(listUnmodifiableList, "unmodifiableList(protocolsCopy)");
            this.f12347t = listUnmodifiableList;
            return this;
        }

        public final a M(long j10, TimeUnit unit) {
            Intrinsics.checkNotNullParameter(unit, "unit");
            this.f12353z = d9.e.k("timeout", j10, unit);
            return this;
        }

        public final a N(long j10, TimeUnit unit) {
            Intrinsics.checkNotNullParameter(unit, "unit");
            this.f12324A = d9.e.k("timeout", j10, unit);
            return this;
        }

        public final a a(v interceptor) {
            Intrinsics.checkNotNullParameter(interceptor, "interceptor");
            this.f12331d.add(interceptor);
            return this;
        }

        public final z b() {
            return new z(this);
        }

        public final a c(C1215c c1215c) {
            this.f12338k = c1215c;
            return this;
        }

        public final a d(long j10, TimeUnit unit) {
            Intrinsics.checkNotNullParameter(unit, "unit");
            this.f12351x = d9.e.k("timeout", j10, unit);
            return this;
        }

        public final a e(long j10, TimeUnit unit) {
            Intrinsics.checkNotNullParameter(unit, "unit");
            this.f12352y = d9.e.k("timeout", j10, unit);
            return this;
        }

        public final a f(n cookieJar) {
            Intrinsics.checkNotNullParameter(cookieJar, "cookieJar");
            this.f12337j = cookieJar;
            return this;
        }

        public final a g(r eventListener) {
            Intrinsics.checkNotNullParameter(eventListener, "eventListener");
            this.f12332e = d9.e.g(eventListener);
            return this;
        }

        public final InterfaceC1214b h() {
            return this.f12334g;
        }

        public final C1215c i() {
            return this.f12338k;
        }

        public final int j() {
            return this.f12351x;
        }

        public final p9.c k() {
            return this.f12350w;
        }

        public final C1219g l() {
            return this.f12349v;
        }

        public final int m() {
            return this.f12352y;
        }

        public final k n() {
            return this.f12329b;
        }

        public final List o() {
            return this.f12346s;
        }

        public final n p() {
            return this.f12337j;
        }

        public final p q() {
            return this.f12328a;
        }

        public final q r() {
            return this.f12339l;
        }

        public final r.c s() {
            return this.f12332e;
        }

        public final boolean t() {
            return this.f12335h;
        }

        public final boolean u() {
            return this.f12336i;
        }

        public final HostnameVerifier v() {
            return this.f12348u;
        }

        public final List w() {
            return this.f12330c;
        }

        public final long x() {
            return this.f12326C;
        }

        public final List y() {
            return this.f12331d;
        }

        public final int z() {
            return this.f12325B;
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public a(z okHttpClient) {
            this();
            Intrinsics.checkNotNullParameter(okHttpClient, "okHttpClient");
            this.f12328a = okHttpClient.s();
            this.f12329b = okHttpClient.p();
            CollectionsKt.w(this.f12330c, okHttpClient.A());
            CollectionsKt.w(this.f12331d, okHttpClient.C());
            this.f12332e = okHttpClient.u();
            this.f12333f = okHttpClient.M();
            this.f12334g = okHttpClient.i();
            this.f12335h = okHttpClient.w();
            this.f12336i = okHttpClient.x();
            this.f12337j = okHttpClient.r();
            this.f12338k = okHttpClient.k();
            this.f12339l = okHttpClient.t();
            this.f12340m = okHttpClient.H();
            this.f12341n = okHttpClient.K();
            this.f12342o = okHttpClient.I();
            this.f12343p = okHttpClient.O();
            this.f12344q = okHttpClient.f12295H;
            this.f12345r = okHttpClient.V();
            this.f12346s = okHttpClient.q();
            this.f12347t = okHttpClient.G();
            this.f12348u = okHttpClient.z();
            this.f12349v = okHttpClient.n();
            this.f12350w = okHttpClient.m();
            this.f12351x = okHttpClient.l();
            this.f12352y = okHttpClient.o();
            this.f12353z = okHttpClient.L();
            this.f12324A = okHttpClient.U();
            this.f12325B = okHttpClient.F();
            this.f12326C = okHttpClient.B();
            this.f12327D = okHttpClient.y();
        }
    }

    public z() {
        this(new a());
    }
}
