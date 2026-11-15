package Y7;

import B4.C0564a;
import B4.j;
import B4.k;

/* JADX INFO: loaded from: classes3.dex */
public class f extends Y7.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e f7032b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.unity3d.scar.adapter.common.h f7033c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final M4.b f7034d = new a();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final j f7035e = new b();

    class a extends M4.b {
        a() {
        }

        @Override // B4.e
        public void a(k kVar) {
            super.a(kVar);
            f.this.f7033c.onAdFailedToLoad(kVar.a(), kVar.toString());
        }

        @Override // B4.e
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void b(M4.a aVar) {
            super.b(aVar);
            f.this.f7033c.onAdLoaded();
            aVar.c(f.this.f7035e);
            f.this.f7032b.d(aVar);
            U7.b bVar = f.this.f7023a;
            if (bVar != null) {
                bVar.onAdLoaded();
            }
        }
    }

    class b extends j {
        b() {
        }

        @Override // B4.j
        public void b() {
            super.b();
            f.this.f7033c.onAdClicked();
        }

        @Override // B4.j
        public void c() {
            super.c();
            f.this.f7033c.onAdClosed();
        }

        @Override // B4.j
        public void d(C0564a c0564a) {
            super.d(c0564a);
            f.this.f7033c.onAdFailedToShow(c0564a.a(), c0564a.toString());
        }

        @Override // B4.j
        public void e() {
            super.e();
            f.this.f7033c.onAdImpression();
        }

        @Override // B4.j
        public void f() {
            super.f();
            f.this.f7033c.onAdOpened();
        }
    }

    public f(com.unity3d.scar.adapter.common.h hVar, e eVar) {
        this.f7033c = hVar;
        this.f7032b = eVar;
    }

    public M4.b e() {
        return this.f7034d;
    }
}
