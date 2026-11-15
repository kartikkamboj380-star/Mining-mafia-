package p163q2;

import Y1.i;
import Y1.k;
import Y1.n;
import android.content.Context;
import android.graphics.drawable.Animatable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.atomic.AtomicLong;
import p083i2.d;
import p083i2.f;
import p083i2.h;

/* JADX INFO: loaded from: classes.dex */
public abstract class b {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final d f48009q = new a();

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final NullPointerException f48010r = new NullPointerException("No image request was specified!");

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final AtomicLong f48011s = new AtomicLong();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f48012a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Set f48013b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Set f48014c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Object f48015d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Object f48016e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Object f48017f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Object[] f48018g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f48019h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private n f48020i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private d f48021j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f48022k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f48023l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f48024m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f48025n = false;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private String f48026o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private p223w2.a f48027p;

    class a extends p163q2.c {
        a() {
        }

        @Override // p163q2.c, p163q2.d
        public void m(String str, Object obj, Animatable animatable) {
            if (animatable != null) {
                animatable.start();
            }
        }
    }

    /* JADX INFO: renamed from: q2.b$b, reason: collision with other inner class name */
    class C0520b implements n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ p223w2.a f48028a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f48029b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Object f48030c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ Object f48031d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ c f48032e;

        C0520b(p223w2.a aVar, String str, Object obj, Object obj2, c cVar) {
            this.f48028a = aVar;
            this.f48029b = str;
            this.f48030c = obj;
            this.f48031d = obj2;
            this.f48032e = cVar;
        }

        @Override // Y1.n
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public p083i2.c get() {
            return b.this.g(this.f48028a, this.f48029b, this.f48030c, this.f48031d, this.f48032e);
        }

        public String toString() {
            return i.b(this).b("request", this.f48030c.toString()).toString();
        }
    }

    public enum c {
        FULL_FETCH,
        DISK_CACHE,
        BITMAP_MEMORY_CACHE
    }

    protected b(Context context, Set set, Set set2) {
        this.f48012a = context;
        this.f48013b = set;
        this.f48014c = set2;
        q();
    }

    protected static String c() {
        return String.valueOf(f48011s.getAndIncrement());
    }

    private void q() {
        this.f48015d = null;
        this.f48016e = null;
        this.f48017f = null;
        this.f48018g = null;
        this.f48019h = true;
        this.f48021j = null;
        this.f48022k = false;
        this.f48023l = false;
        this.f48025n = false;
        this.f48027p = null;
        this.f48026o = null;
    }

    public b A(d dVar) {
        this.f48021j = dVar;
        return p();
    }

    public b B(Object obj) {
        this.f48016e = obj;
        return p();
    }

    public b C(Object obj) {
        this.f48017f = obj;
        return p();
    }

    public b D(p223w2.a aVar) {
        this.f48027p = aVar;
        return p();
    }

    protected void E() {
        boolean z9 = true;
        k.j(this.f48018g == null || this.f48016e == null, "Cannot specify both ImageRequest and FirstAvailableImageRequests!");
        if (this.f48020i != null && (this.f48018g != null || this.f48016e != null || this.f48017f != null)) {
            z9 = false;
        }
        k.j(z9, "Cannot specify DataSourceSupplier with other ImageRequests! Use one or the other.");
    }

    public p163q2.a a() {
        Object obj;
        E();
        if (this.f48016e == null && this.f48018g == null && (obj = this.f48017f) != null) {
            this.f48016e = obj;
            this.f48017f = null;
        }
        return b();
    }

    protected p163q2.a b() {
        if (V2.b.d()) {
            V2.b.a("AbstractDraweeControllerBuilder#buildController");
        }
        p163q2.a aVarV = v();
        aVarV.d0(r());
        aVarV.e0(o());
        aVarV.Z(e());
        f();
        aVarV.b0(null);
        u(aVarV);
        s(aVarV);
        if (V2.b.d()) {
            V2.b.b();
        }
        return aVarV;
    }

    public Object d() {
        return this.f48015d;
    }

    public String e() {
        return this.f48026o;
    }

    public e f() {
        return null;
    }

    protected abstract p083i2.c g(p223w2.a aVar, String str, Object obj, Object obj2, c cVar);

    protected n h(p223w2.a aVar, String str, Object obj) {
        return i(aVar, str, obj, c.FULL_FETCH);
    }

    protected n i(p223w2.a aVar, String str, Object obj, c cVar) {
        return new C0520b(aVar, str, obj, d(), cVar);
    }

    protected n j(p223w2.a aVar, String str, Object[] objArr, boolean z9) {
        ArrayList arrayList = new ArrayList(objArr.length * 2);
        if (z9) {
            for (Object obj : objArr) {
                arrayList.add(i(aVar, str, obj, c.BITMAP_MEMORY_CACHE));
            }
        }
        for (Object obj2 : objArr) {
            arrayList.add(h(aVar, str, obj2));
        }
        return f.b(arrayList);
    }

    public Object[] k() {
        return this.f48018g;
    }

    public Object l() {
        return this.f48016e;
    }

    public Object m() {
        return this.f48017f;
    }

    public p223w2.a n() {
        return this.f48027p;
    }

    public boolean o() {
        return this.f48024m;
    }

    public boolean r() {
        return this.f48025n;
    }

    protected void s(p163q2.a aVar) {
        Set set = this.f48013b;
        if (set != null) {
            Iterator it = set.iterator();
            while (it.hasNext()) {
                aVar.j((d) it.next());
            }
        }
        Set set2 = this.f48014c;
        if (set2 != null) {
            Iterator it2 = set2.iterator();
            while (it2.hasNext()) {
                aVar.k((p253z2.b) it2.next());
            }
        }
        d dVar = this.f48021j;
        if (dVar != null) {
            aVar.j(dVar);
        }
        if (this.f48023l) {
            aVar.j(f48009q);
        }
    }

    protected void t(p163q2.a aVar) {
        if (aVar.u() == null) {
            aVar.c0(p213v2.a.c(this.f48012a));
        }
    }

    protected void u(p163q2.a aVar) {
        if (this.f48022k) {
            aVar.A().d(this.f48022k);
            t(aVar);
        }
    }

    protected abstract p163q2.a v();

    protected n w(p223w2.a aVar, String str) {
        n nVarJ;
        n nVar = this.f48020i;
        if (nVar != null) {
            return nVar;
        }
        Object obj = this.f48016e;
        if (obj != null) {
            nVarJ = h(aVar, str, obj);
        } else {
            Object[] objArr = this.f48018g;
            nVarJ = objArr != null ? j(aVar, str, objArr, this.f48019h) : null;
        }
        if (nVarJ != null && this.f48017f != null) {
            ArrayList arrayList = new ArrayList(2);
            arrayList.add(nVarJ);
            arrayList.add(h(aVar, str, this.f48017f));
            nVarJ = h.c(arrayList, false);
        }
        return nVarJ == null ? d.a(f48010r) : nVarJ;
    }

    public b x() {
        q();
        return p();
    }

    public b y(boolean z9) {
        this.f48023l = z9;
        return p();
    }

    public b z(Object obj) {
        this.f48015d = obj;
        return p();
    }

    protected final b p() {
        return this;
    }
}
