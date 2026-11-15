package p143o2;

import O2.l;
import java.io.Closeable;
import p193t2.F;
import p253z2.a;
import p253z2.e;
import p253z2.i;
import p253z2.j;
import p253z2.n;

/* JADX INFO: loaded from: classes.dex */
public class b extends a implements Closeable, F {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final p053f2.b f47174c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final j f47175d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final i f47176e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private i f47177f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final boolean f47178g;

    public b(p053f2.b bVar, j jVar, i iVar) {
        this(bVar, jVar, iVar, true);
    }

    private void J(j jVar, long j10) {
        jVar.R(false);
        jVar.L(j10);
        R(jVar, n.INVISIBLE);
    }

    private void Q(j jVar, e eVar) {
        jVar.H(eVar);
        this.f47176e.b(jVar, eVar);
        i iVar = this.f47177f;
        if (iVar != null) {
            iVar.b(jVar, eVar);
        }
    }

    private void R(j jVar, n nVar) {
        this.f47176e.a(jVar, nVar);
        i iVar = this.f47177f;
        if (iVar != null) {
            iVar.a(jVar, nVar);
        }
    }

    @Override // p253z2.a, p253z2.b
    /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
    public void a(String str, l lVar) {
        long jNow = this.f47174c.now();
        j jVar = this.f47175d;
        jVar.C(jNow);
        jVar.B(str);
        jVar.G(lVar);
        Q(jVar, e.INTERMEDIATE_AVAILABLE);
    }

    public void M(j jVar, long j10) {
        jVar.R(true);
        jVar.Q(j10);
        R(jVar, n.VISIBLE);
    }

    public void N() {
        this.f47175d.w();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        N();
    }

    @Override // p253z2.a, p253z2.b
    public void h(String str, z2.b.a aVar) {
        long jNow = this.f47174c.now();
        j jVar = this.f47175d;
        jVar.F(aVar);
        jVar.B(str);
        Q(jVar, e.RELEASED);
        if (this.f47178g) {
            J(jVar, jNow);
        }
    }

    @Override // p253z2.a, p253z2.b
    public void j(String str, Throwable th, z2.b.a aVar) {
        long jNow = this.f47174c.now();
        j jVar = this.f47175d;
        jVar.F(aVar);
        jVar.z(jNow);
        jVar.B(str);
        jVar.E(th);
        Q(jVar, e.ERROR);
        J(jVar, jNow);
    }

    @Override // p193t2.F
    public void n(boolean z9) {
        if (z9) {
            M(this.f47175d, this.f47174c.now());
        } else {
            J(this.f47175d, this.f47174c.now());
        }
    }

    @Override // p253z2.a, p253z2.b
    public void w(String str, Object obj, z2.b.a aVar) {
        long jNow = this.f47174c.now();
        j jVar = this.f47175d;
        jVar.x();
        jVar.D(jNow);
        jVar.B(str);
        jVar.y(obj);
        jVar.F(aVar);
        Q(jVar, e.REQUESTED);
        if (this.f47178g) {
            M(jVar, jNow);
        }
    }

    @Override // p253z2.a, p253z2.b
    /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
    public void v(String str, l lVar, z2.b.a aVar) {
        long jNow = this.f47174c.now();
        j jVar = this.f47175d;
        jVar.F(aVar);
        jVar.A(jNow);
        jVar.J(jNow);
        jVar.B(str);
        jVar.G(lVar);
        Q(jVar, e.SUCCESS);
    }

    public b(p053f2.b bVar, j jVar, i iVar, boolean z9) {
        this.f47177f = null;
        this.f47174c = bVar;
        this.f47175d = jVar;
        this.f47176e = iVar;
        this.f47178g = z9;
    }

    @Override // p193t2.F
    public void onDraw() {
    }
}
