package Y7;

import B4.C0564a;
import B4.j;
import B4.k;
import B4.p;
import com.unity3d.scar.adapter.common.i;

/* JADX INFO: loaded from: classes3.dex */
public class h extends Y7.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final g f7038b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final i f7039c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final U4.d f7040d = new a();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final p f7041e = new b();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final j f7042f = new c();

    class a extends U4.d {
        a() {
        }

        @Override // B4.e
        public void a(k kVar) {
            super.a(kVar);
            h.this.f7039c.onAdFailedToLoad(kVar.a(), kVar.toString());
        }

        @Override // B4.e
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void b(U4.c cVar) {
            super.b(cVar);
            h.this.f7039c.onAdLoaded();
            cVar.e(h.this.f7042f);
            h.this.f7038b.d(cVar);
            U7.b bVar = h.this.f7023a;
            if (bVar != null) {
                bVar.onAdLoaded();
            }
        }
    }

    class b implements p {
        b() {
        }

        @Override // B4.p
        public void c(U4.b bVar) {
            h.this.f7039c.onUserEarnedReward();
        }
    }

    class c extends j {
        c() {
        }

        @Override // B4.j
        public void b() {
            super.b();
            h.this.f7039c.onAdClicked();
        }

        @Override // B4.j
        public void c() {
            super.c();
            h.this.f7039c.onAdClosed();
        }

        @Override // B4.j
        public void d(C0564a c0564a) {
            super.d(c0564a);
            h.this.f7039c.onAdFailedToShow(c0564a.a(), c0564a.toString());
        }

        @Override // B4.j
        public void e() {
            super.e();
            h.this.f7039c.onAdImpression();
        }

        @Override // B4.j
        public void f() {
            super.f();
            h.this.f7039c.onAdOpened();
        }
    }

    public h(i iVar, g gVar) {
        this.f7039c = iVar;
        this.f7038b = gVar;
    }

    public U4.d e() {
        return this.f7040d;
    }

    public p f() {
        return this.f7041e;
    }
}
