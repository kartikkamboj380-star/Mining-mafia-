package p029c8;

import B4.C0564a;
import B4.j;
import B4.k;
import B4.p;
import U4.d;
import com.unity3d.scar.adapter.common.i;

/* JADX INFO: loaded from: classes3.dex */
public class h extends p029c8.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final g f11895b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final i f11896c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final d f11897d = new a();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final p f11898e = new b();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final j f11899f = new c();

    class a extends d {
        a() {
        }

        @Override // B4.e
        public void a(k kVar) {
            super.a(kVar);
            h.this.f11896c.onAdFailedToLoad(kVar.a(), kVar.toString());
        }

        @Override // B4.e
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void b(U4.c cVar) {
            super.b(cVar);
            h.this.f11896c.onAdLoaded();
            cVar.e(h.this.f11899f);
            h.this.f11895b.d(cVar);
            U7.b bVar = h.this.f11880a;
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
            h.this.f11896c.onUserEarnedReward();
        }
    }

    class c extends j {
        c() {
        }

        @Override // B4.j
        public void b() {
            super.b();
            h.this.f11896c.onAdClicked();
        }

        @Override // B4.j
        public void c() {
            super.c();
            h.this.f11896c.onAdClosed();
        }

        @Override // B4.j
        public void d(C0564a c0564a) {
            super.d(c0564a);
            h.this.f11896c.onAdFailedToShow(c0564a.a(), c0564a.toString());
        }

        @Override // B4.j
        public void e() {
            super.e();
            h.this.f11896c.onAdImpression();
        }

        @Override // B4.j
        public void f() {
            super.f();
            h.this.f11896c.onAdOpened();
        }
    }

    public h(i iVar, g gVar) {
        this.f11896c = iVar;
        this.f11895b = gVar;
    }

    public d e() {
        return this.f11897d;
    }

    public p f() {
        return this.f11898e;
    }
}
