package p253z2;

import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class j extends h {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private long f50985A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private long f50986B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private long f50987C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private boolean f50988D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private int f50989E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private int f50990F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private Throwable f50991G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private e f50992H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private n f50993I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private long f50994J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    private long f50995K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    private b.a f50996L;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private String f50997s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private String f50998t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private Object f50999u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private Object f51000v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private Object f51001w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private long f51002x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private long f51003y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private long f51004z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(k infra) {
        super(infra);
        Intrinsics.checkNotNullParameter(infra, "infra");
        this.f51002x = -1L;
        this.f51003y = -1L;
        this.f51004z = -1L;
        this.f50985A = -1L;
        this.f50986B = -1L;
        this.f50987C = -1L;
        this.f50989E = -1;
        this.f50990F = -1;
        this.f50992H = e.UNKNOWN;
        this.f50993I = n.UNKNOWN;
        this.f50994J = -1L;
        this.f50995K = -1L;
    }

    public final void A(long j10) {
        this.f51004z = j10;
    }

    public final void B(String str) {
        this.f50997s = str;
    }

    public final void C(long j10) {
        this.f51003y = j10;
    }

    public final void D(long j10) {
        this.f51002x = j10;
    }

    public final void E(Throwable th) {
        this.f50991G = th;
    }

    public final void F(b.a aVar) {
        this.f50996L = aVar;
    }

    public final void G(Object obj) {
        this.f51001w = obj;
    }

    public final void H(e eVar) {
        Intrinsics.checkNotNullParameter(eVar, "<set-?>");
        this.f50992H = eVar;
    }

    public final void I(Object obj) {
        this.f50999u = obj;
    }

    public final void J(long j10) {
        this.f50987C = j10;
    }

    public final void K(long j10) {
        this.f50986B = j10;
    }

    public final void L(long j10) {
        this.f50995K = j10;
    }

    public final void M(int i10) {
        this.f50990F = i10;
    }

    public final void N(int i10) {
        this.f50989E = i10;
    }

    public final void O(boolean z9) {
        this.f50988D = z9;
    }

    public final void P(String str) {
        this.f50998t = str;
    }

    public final void Q(long j10) {
        this.f50994J = j10;
    }

    public final void R(boolean z9) {
        this.f50993I = z9 ? n.VISIBLE : n.INVISIBLE;
    }

    public final f S() {
        return new f(j(), this.f50997s, this.f50998t, this.f50999u, this.f51000v, this.f51001w, this.f51002x, this.f51003y, this.f51004z, this.f50985A, this.f50986B, this.f50987C, f(), n(), this.f50988D, this.f50989E, this.f50990F, this.f50991G, this.f50993I, this.f50994J, this.f50995K, null, this.f50996L, a(), o(), c(), d(), b(), r(), q(), l(), p(), CollectionsKt.w0(k()), m(), h(), i(), g(), e());
    }

    public final void w() {
        this.f50998t = null;
        this.f50999u = null;
        this.f51000v = null;
        this.f51001w = null;
        this.f50988D = false;
        this.f50989E = -1;
        this.f50990F = -1;
        this.f50991G = null;
        this.f50992H = e.UNKNOWN;
        this.f50993I = n.UNKNOWN;
        this.f50996L = null;
        x();
        s();
    }

    public final void x() {
        this.f50986B = -1L;
        this.f50987C = -1L;
        this.f51002x = -1L;
        this.f51004z = -1L;
        this.f50985A = -1L;
        this.f50994J = -1L;
        this.f50995K = -1L;
        k().clear();
        u(false);
        t(null);
        v(null);
    }

    public final void y(Object obj) {
        this.f51000v = obj;
    }

    public final void z(long j10) {
        this.f50985A = j10;
    }
}
