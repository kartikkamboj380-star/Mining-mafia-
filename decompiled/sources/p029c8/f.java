package p029c8;

import B4.C0564a;
import B4.j;
import B4.k;
import com.unity3d.scar.adapter.common.h;

/* JADX INFO: loaded from: classes3.dex */
public class f extends p029c8.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e f11889b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final h f11890c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final M4.b f11891d = new a();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final j f11892e = new b();

    class a extends M4.b {
        a() {
        }

        @Override // B4.e
        public void a(k kVar) {
            super.a(kVar);
            f.this.f11890c.onAdFailedToLoad(kVar.a(), kVar.toString());
        }

        @Override // B4.e
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void b(M4.a aVar) {
            super.b(aVar);
            f.this.f11890c.onAdLoaded();
            aVar.c(f.this.f11892e);
            f.this.f11889b.d(aVar);
            U7.b bVar = f.this.f11880a;
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
            f.this.f11890c.onAdClicked();
        }

        @Override // B4.j
        public void c() {
            super.c();
            f.this.f11890c.onAdClosed();
        }

        @Override // B4.j
        public void d(C0564a c0564a) {
            super.d(c0564a);
            f.this.f11890c.onAdFailedToShow(c0564a.a(), c0564a.toString());
        }

        @Override // B4.j
        public void e() {
            super.e();
            f.this.f11890c.onAdImpression();
        }

        @Override // B4.j
        public void f() {
            super.f();
            f.this.f11890c.onAdOpened();
        }
    }

    public f(h hVar, e eVar) {
        this.f11890c = hVar;
        this.f11889b = eVar;
    }

    public M4.b e() {
        return this.f11891d;
    }
}
