package Y7;

import B4.k;

/* JADX INFO: loaded from: classes3.dex */
public class d extends b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.unity3d.scar.adapter.common.g f7028b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final c f7029c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final B4.d f7030d = new a();

    class a extends B4.d {
        a() {
        }

        @Override // B4.d
        public void i() {
            super.i();
            d.this.f7028b.onAdClosed();
        }

        @Override // B4.d
        public void j(k kVar) {
            super.j(kVar);
            d.this.f7029c.e();
            d.this.f7028b.onAdFailedToLoad(kVar.a(), kVar.c());
        }

        @Override // B4.d
        public void k() {
            super.k();
            d.this.f7028b.onAdImpression();
        }

        @Override // B4.d
        public void m() {
            super.m();
            d.this.f7028b.onAdLoaded();
        }

        @Override // B4.d
        public void o() {
            super.o();
            d.this.f7028b.onAdOpened();
        }

        @Override // B4.d
        public void onAdClicked() {
            super.onAdClicked();
            d.this.f7028b.onAdClicked();
        }
    }

    public d(com.unity3d.scar.adapter.common.g gVar, c cVar) {
        this.f7028b = gVar;
        this.f7029c = cVar;
    }

    public B4.d d() {
        return this.f7030d;
    }
}
