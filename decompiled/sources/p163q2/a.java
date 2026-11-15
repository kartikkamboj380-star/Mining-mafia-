package p163q2;

import Y1.g;
import Y1.i;
import Y1.k;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.view.MotionEvent;
import com.unity3d.services.UnityAdsConstants;
import java.util.Map;
import java.util.concurrent.Executor;
import p153p2.d;
import p223w2.c;

/* JADX INFO: loaded from: classes.dex */
public abstract class a implements p223w2.a, p153p2.a.InterfaceC0513a, p213v2.a.InterfaceC0548a {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static final Map f47981w = g.of("component_tag", "drawee");

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private static final Map f47982x = g.of("origin", "memory_bitmap", "origin_sub", "shortcut");

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private static final Class f47983y = a.class;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final p153p2.a f47985b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Executor f47986c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private d f47987d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private p213v2.a f47988e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    protected d f47989f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private c f47991h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private Drawable f47992i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private String f47993j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private Object f47994k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f47995l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f47996m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f47997n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f47998o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f47999p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private String f48000q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private p083i2.c f48001r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private Object f48002s;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    protected Drawable f48005v;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p153p2.c f47984a = p153p2.c.a();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    protected p253z2.d f47990g = new p253z2.d();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f48003t = true;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private boolean f48004u = false;

    /* JADX INFO: renamed from: q2.a$a, reason: collision with other inner class name */
    class C0519a extends p083i2.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f48006a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f48007b;

        C0519a(String str, boolean z9) {
            this.f48006a = str;
            this.f48007b = z9;
        }

        @Override // p083i2.b, p083i2.e
        public void d(p083i2.c cVar) {
            boolean zC = cVar.c();
            a.this.O(this.f48006a, cVar, cVar.f(), zC);
        }

        @Override // p083i2.b
        public void e(p083i2.c cVar) {
            a.this.L(this.f48006a, cVar, cVar.d(), true);
        }

        @Override // p083i2.b
        public void f(p083i2.c cVar) {
            boolean zC = cVar.c();
            boolean zG = cVar.g();
            float f10 = cVar.f();
            Object objA = cVar.a();
            if (objA != null) {
                a.this.N(this.f48006a, cVar, objA, f10, zC, this.f48007b, zG);
            } else if (zC) {
                a.this.L(this.f48006a, cVar, new NullPointerException(), true);
            }
        }
    }

    private static class b extends f {
        private b() {
        }

        public static b e(d dVar, d dVar2) {
            if (V2.b.d()) {
                V2.b.a("AbstractDraweeController#createInternal");
            }
            b bVar = new b();
            bVar.b(dVar);
            bVar.b(dVar2);
            if (V2.b.d()) {
                V2.b.b();
            }
            return bVar;
        }
    }

    public a(p153p2.a aVar, Executor executor, String str, Object obj) {
        this.f47985b = aVar;
        this.f47986c = executor;
        C(str, obj);
    }

    private c B() {
        c cVar = this.f47991h;
        if (cVar != null) {
            return cVar;
        }
        throw new IllegalStateException("mSettableDraweeHierarchy is null; Caller context: " + this.f47994k);
    }

    private synchronized void C(String str, Object obj) {
        p153p2.a aVar;
        try {
            if (V2.b.d()) {
                V2.b.a("AbstractDraweeController#init");
            }
            this.f47984a.b(p2.c.a.ON_INIT_CONTROLLER);
            if (!this.f48003t && (aVar = this.f47985b) != null) {
                aVar.a(this);
            }
            this.f47995l = false;
            this.f47997n = false;
            Q();
            this.f47999p = false;
            d dVar = this.f47987d;
            if (dVar != null) {
                dVar.a();
            }
            p213v2.a aVar2 = this.f47988e;
            if (aVar2 != null) {
                aVar2.a();
                this.f47988e.f(this);
            }
            d dVar2 = this.f47989f;
            if (dVar2 instanceof b) {
                ((b) dVar2).c();
            } else {
                this.f47989f = null;
            }
            c cVar = this.f47991h;
            if (cVar != null) {
                cVar.reset();
                this.f47991h.f(null);
                this.f47991h = null;
            }
            this.f47992i = null;
            if (Z1.a.w(2)) {
                Z1.a.A(f47983y, "controller %x %s -> %s: initialize", Integer.valueOf(System.identityHashCode(this)), this.f47993j, str);
            }
            this.f47993j = str;
            this.f47994k = obj;
            if (V2.b.d()) {
                V2.b.b();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    private boolean E(String str, p083i2.c cVar) {
        if (cVar == null && this.f48001r == null) {
            return true;
        }
        return str.equals(this.f47993j) && cVar == this.f48001r && this.f47996m;
    }

    private void G(String str, Throwable th) {
        if (Z1.a.w(2)) {
            Z1.a.B(f47983y, "controller %x %s: %s: failure: %s", Integer.valueOf(System.identityHashCode(this)), this.f47993j, str, th);
        }
    }

    private void H(String str, Object obj) {
        if (Z1.a.w(2)) {
            Z1.a.C(f47983y, "controller %x %s: %s: image: %s %x", Integer.valueOf(System.identityHashCode(this)), this.f47993j, str, w(obj), Integer.valueOf(x(obj)));
        }
    }

    private z2.b.a I(p083i2.c cVar, Object obj, Uri uri) {
        return J(cVar == null ? null : cVar.getExtras(), K(obj), uri);
    }

    private z2.b.a J(Map map, Map map2, Uri uri) {
        String str;
        PointF pointFL;
        c cVar = this.f47991h;
        if (cVar instanceof p203u2.a) {
            p203u2.a aVar = (p203u2.a) cVar;
            String strValueOf = String.valueOf(aVar.m());
            pointFL = aVar.l();
            str = strValueOf;
        } else {
            str = null;
            pointFL = null;
        }
        return p243y2.b.a(f47981w, f47982x, map, null, t(), str, pointFL, map2, o(), F(), uri);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void L(String str, p083i2.c cVar, Throwable th, boolean z9) {
        Drawable drawable;
        if (V2.b.d()) {
            V2.b.a("AbstractDraweeController#onFailureInternal");
        }
        if (!E(str, cVar)) {
            G("ignore_old_datasource @ onFailure", th);
            cVar.close();
            if (V2.b.d()) {
                V2.b.b();
                return;
            }
            return;
        }
        this.f47984a.b(z9 ? p2.c.a.ON_DATASOURCE_FAILURE : p2.c.a.ON_DATASOURCE_FAILURE_INT);
        if (z9) {
            G("final_failed @ onFailure", th);
            this.f48001r = null;
            this.f47998o = true;
            c cVar2 = this.f47991h;
            if (cVar2 != null) {
                if (this.f47999p && (drawable = this.f48005v) != null) {
                    cVar2.e(drawable, 1.0f, true);
                } else if (g0()) {
                    cVar2.a(th);
                } else {
                    cVar2.b(th);
                }
            }
            T(th, cVar);
        } else {
            G("intermediate_failed @ onFailure", th);
            U(th);
        }
        if (V2.b.d()) {
            V2.b.b();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void N(String str, p083i2.c cVar, Object obj, float f10, boolean z9, boolean z10, boolean z11) {
        try {
            if (V2.b.d()) {
                V2.b.a("AbstractDraweeController#onNewResultInternal");
            }
            if (!E(str, cVar)) {
                H("ignore_old_datasource @ onNewResult", obj);
                R(obj);
                cVar.close();
                if (V2.b.d()) {
                    V2.b.b();
                    return;
                }
                return;
            }
            this.f47984a.b(z9 ? p2.c.a.ON_DATASOURCE_RESULT : p2.c.a.ON_DATASOURCE_RESULT_INT);
            try {
                Drawable drawableL = l(obj);
                Object obj2 = this.f48002s;
                Drawable drawable = this.f48005v;
                this.f48002s = obj;
                this.f48005v = drawableL;
                try {
                    if (z9) {
                        H("set_final_result @ onNewResult", obj);
                        this.f48001r = null;
                        B().e(drawableL, 1.0f, z10);
                        Y(str, obj, cVar);
                    } else if (z11) {
                        H("set_temporary_result @ onNewResult", obj);
                        B().e(drawableL, 1.0f, z10);
                        Y(str, obj, cVar);
                    } else {
                        H("set_intermediate_result @ onNewResult", obj);
                        B().e(drawableL, f10, z10);
                        V(str, obj);
                    }
                    if (drawable != null && drawable != drawableL) {
                        P(drawable);
                    }
                    if (obj2 != null && obj2 != obj) {
                        H("release_previous_result @ onNewResult", obj2);
                        R(obj2);
                    }
                    if (V2.b.d()) {
                        V2.b.b();
                    }
                } catch (Throwable th) {
                    if (drawable != null && drawable != drawableL) {
                        P(drawable);
                    }
                    if (obj2 != null && obj2 != obj) {
                        H("release_previous_result @ onNewResult", obj2);
                        R(obj2);
                    }
                    throw th;
                }
            } catch (Exception e10) {
                H("drawable_failed @ onNewResult", obj);
                R(obj);
                L(str, cVar, e10, z9);
                if (V2.b.d()) {
                    V2.b.b();
                }
            }
        } catch (Throwable th2) {
            if (V2.b.d()) {
                V2.b.b();
            }
            throw th2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void O(String str, p083i2.c cVar, float f10, boolean z9) {
        if (!E(str, cVar)) {
            G("ignore_old_datasource @ onProgress", null);
            cVar.close();
        } else {
            if (z9) {
                return;
            }
            this.f47991h.c(f10, false);
        }
    }

    private void Q() {
        Map extras;
        boolean z9 = this.f47996m;
        this.f47996m = false;
        this.f47998o = false;
        p083i2.c cVar = this.f48001r;
        Map map = null;
        if (cVar != null) {
            extras = cVar.getExtras();
            this.f48001r.close();
            this.f48001r = null;
        } else {
            extras = null;
        }
        Drawable drawable = this.f48005v;
        if (drawable != null) {
            P(drawable);
        }
        if (this.f48000q != null) {
            this.f48000q = null;
        }
        this.f48005v = null;
        Object obj = this.f48002s;
        if (obj != null) {
            Map mapK = K(y(obj));
            H("release", this.f48002s);
            R(this.f48002s);
            this.f48002s = null;
            map = mapK;
        }
        if (z9) {
            W(extras, map);
        }
    }

    private void T(Throwable th, p083i2.c cVar) {
        z2.b.a aVarI = I(cVar, null, null);
        p().f(this.f47993j, th);
        q().j(this.f47993j, th, aVarI);
    }

    private void U(Throwable th) {
        p().r(this.f47993j, th);
        q().c(this.f47993j);
    }

    private void V(String str, Object obj) {
        Object objY = y(obj);
        p().a(str, objY);
        q().a(str, objY);
    }

    private void W(Map map, Map map2) {
        p().g(this.f47993j);
        q().h(this.f47993j, J(map, map2, null));
    }

    private void Y(String str, Object obj, p083i2.c cVar) {
        Object objY = y(obj);
        p().m(str, objY, m());
        q().v(str, objY, I(cVar, objY, null));
    }

    private boolean g0() {
        d dVar;
        return this.f47998o && (dVar = this.f47987d) != null && dVar.e();
    }

    private Rect t() {
        c cVar = this.f47991h;
        if (cVar == null) {
            return null;
        }
        return cVar.getBounds();
    }

    protected d A() {
        if (this.f47987d == null) {
            this.f47987d = new d();
        }
        return this.f47987d;
    }

    protected void D(String str, Object obj) {
        C(str, obj);
        this.f48003t = false;
        this.f48004u = false;
    }

    protected boolean F() {
        return this.f48004u;
    }

    public abstract Map K(Object obj);

    protected abstract void P(Drawable drawable);

    protected abstract void R(Object obj);

    public void S(p253z2.b bVar) {
        this.f47990g.G(bVar);
    }

    protected void X(p083i2.c cVar, Object obj) {
        p().q(this.f47993j, this.f47994k);
        q().w(this.f47993j, this.f47994k, I(cVar, obj, z()));
    }

    public void Z(String str) {
        this.f48000q = str;
    }

    @Override // p223w2.a
    public void a(p223w2.b bVar) {
        if (Z1.a.w(2)) {
            Z1.a.A(f47983y, "controller %x %s: setHierarchy: %s", Integer.valueOf(System.identityHashCode(this)), this.f47993j, bVar);
        }
        this.f47984a.b(bVar != null ? p2.c.a.ON_SET_HIERARCHY : p2.c.a.ON_CLEAR_HIERARCHY);
        if (this.f47996m) {
            this.f47985b.a(this);
            release();
        }
        c cVar = this.f47991h;
        if (cVar != null) {
            cVar.f(null);
            this.f47991h = null;
        }
        if (bVar != null) {
            k.b(Boolean.valueOf(bVar instanceof c));
            c cVar2 = (c) bVar;
            this.f47991h = cVar2;
            cVar2.f(this.f47992i);
        }
    }

    protected void a0(Drawable drawable) {
        this.f47992i = drawable;
        c cVar = this.f47991h;
        if (cVar != null) {
            cVar.f(drawable);
        }
    }

    @Override // p213v2.a.InterfaceC0548a
    public boolean b() {
        if (Z1.a.w(2)) {
            Z1.a.z(f47983y, "controller %x %s: onClick", Integer.valueOf(System.identityHashCode(this)), this.f47993j);
        }
        if (!g0()) {
            return false;
        }
        this.f47987d.b();
        this.f47991h.reset();
        h0();
        return true;
    }

    @Override // p223w2.a
    public void c() {
        if (V2.b.d()) {
            V2.b.a("AbstractDraweeController#onAttach");
        }
        if (Z1.a.w(2)) {
            Z1.a.A(f47983y, "controller %x %s: onAttach: %s", Integer.valueOf(System.identityHashCode(this)), this.f47993j, this.f47996m ? "request already submitted" : "request needs submit");
        }
        this.f47984a.b(p2.c.a.ON_ATTACH_CONTROLLER);
        k.g(this.f47991h);
        this.f47985b.a(this);
        this.f47995l = true;
        if (!this.f47996m) {
            h0();
        }
        if (V2.b.d()) {
            V2.b.b();
        }
    }

    protected void c0(p213v2.a aVar) {
        this.f47988e = aVar;
        if (aVar != null) {
            aVar.f(this);
        }
    }

    @Override // p223w2.a
    public void d() {
        if (V2.b.d()) {
            V2.b.a("AbstractDraweeController#onDetach");
        }
        if (Z1.a.w(2)) {
            Z1.a.z(f47983y, "controller %x %s: onDetach", Integer.valueOf(System.identityHashCode(this)), this.f47993j);
        }
        this.f47984a.b(p2.c.a.ON_DETACH_CONTROLLER);
        this.f47995l = false;
        this.f47985b.d(this);
        if (V2.b.d()) {
            V2.b.b();
        }
    }

    protected void d0(boolean z9) {
        this.f48004u = z9;
    }

    @Override // p223w2.a
    public p223w2.b e() {
        return this.f47991h;
    }

    protected void e0(boolean z9) {
        this.f47999p = z9;
    }

    @Override // p223w2.a
    public boolean f(MotionEvent motionEvent) {
        if (Z1.a.w(2)) {
            Z1.a.A(f47983y, "controller %x %s: onTouchEvent %s", Integer.valueOf(System.identityHashCode(this)), this.f47993j, motionEvent);
        }
        p213v2.a aVar = this.f47988e;
        if (aVar == null) {
            return false;
        }
        if (!aVar.b() && !f0()) {
            return false;
        }
        this.f47988e.d(motionEvent);
        return true;
    }

    protected boolean f0() {
        return g0();
    }

    protected void h0() {
        if (V2.b.d()) {
            V2.b.a("AbstractDraweeController#submitRequest");
        }
        Object objN = n();
        if (objN != null) {
            if (V2.b.d()) {
                V2.b.a("AbstractDraweeController#submitRequest->cache");
            }
            this.f48001r = null;
            this.f47996m = true;
            this.f47998o = false;
            this.f47984a.b(p2.c.a.ON_SUBMIT_CACHE_HIT);
            X(this.f48001r, y(objN));
            M(this.f47993j, objN);
            N(this.f47993j, this.f48001r, objN, 1.0f, true, true, true);
            if (V2.b.d()) {
                V2.b.b();
            }
            if (V2.b.d()) {
                V2.b.b();
                return;
            }
            return;
        }
        this.f47984a.b(p2.c.a.ON_DATASOURCE_SUBMIT);
        this.f47991h.c(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, true);
        this.f47996m = true;
        this.f47998o = false;
        p083i2.c cVarS = s();
        this.f48001r = cVarS;
        X(cVarS, null);
        if (Z1.a.w(2)) {
            Z1.a.A(f47983y, "controller %x %s: submitRequest: dataSource: %x", Integer.valueOf(System.identityHashCode(this)), this.f47993j, Integer.valueOf(System.identityHashCode(this.f48001r)));
        }
        this.f48001r.e(new C0519a(this.f47993j, this.f48001r.b()), this.f47986c);
        if (V2.b.d()) {
            V2.b.b();
        }
    }

    public void j(d dVar) {
        k.g(dVar);
        d dVar2 = this.f47989f;
        if (dVar2 instanceof b) {
            ((b) dVar2).b(dVar);
        } else if (dVar2 != null) {
            this.f47989f = b.e(dVar2, dVar);
        } else {
            this.f47989f = dVar;
        }
    }

    public void k(p253z2.b bVar) {
        this.f47990g.x(bVar);
    }

    protected abstract Drawable l(Object obj);

    public Animatable m() {
        Object obj = this.f48005v;
        if (obj instanceof Animatable) {
            return (Animatable) obj;
        }
        return null;
    }

    protected abstract Object n();

    public Object o() {
        return this.f47994k;
    }

    protected d p() {
        d dVar = this.f47989f;
        return dVar == null ? c.b() : dVar;
    }

    protected p253z2.b q() {
        return this.f47990g;
    }

    protected Drawable r() {
        return this.f47992i;
    }

    @Override // p153p2.a.InterfaceC0513a
    public void release() {
        this.f47984a.b(p2.c.a.ON_RELEASE_CONTROLLER);
        d dVar = this.f47987d;
        if (dVar != null) {
            dVar.c();
        }
        p213v2.a aVar = this.f47988e;
        if (aVar != null) {
            aVar.e();
        }
        c cVar = this.f47991h;
        if (cVar != null) {
            cVar.reset();
        }
        Q();
    }

    protected abstract p083i2.c s();

    public String toString() {
        return i.b(this).c("isAttached", this.f47995l).c("isRequestSubmitted", this.f47996m).c("hasFetchFailed", this.f47998o).a("fetchedImage", x(this.f48002s)).b("events", this.f47984a.toString()).toString();
    }

    protected p213v2.a u() {
        return this.f47988e;
    }

    public String v() {
        return this.f47993j;
    }

    protected String w(Object obj) {
        return obj != null ? obj.getClass().getSimpleName() : "<null>";
    }

    protected abstract int x(Object obj);

    protected abstract Object y(Object obj);

    protected abstract Uri z();

    public void b0(e eVar) {
    }

    protected void M(String str, Object obj) {
    }
}
