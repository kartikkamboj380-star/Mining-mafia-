package p029c8;

import B4.k;
import com.unity3d.scar.adapter.common.g;

/* JADX INFO: loaded from: classes3.dex */
public class d extends b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final g f11885b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final c f11886c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final B4.d f11887d = new a();

    class a extends B4.d {
        a() {
        }

        @Override // B4.d
        public void i() {
            super.i();
            d.this.f11885b.onAdClosed();
        }

        @Override // B4.d
        public void j(k kVar) {
            super.j(kVar);
            d.this.f11886c.e();
            d.this.f11885b.onAdFailedToLoad(kVar.a(), kVar.c());
        }

        @Override // B4.d
        public void k() {
            super.k();
            d.this.f11885b.onAdImpression();
        }

        @Override // B4.d
        public void m() {
            super.m();
            d.this.f11885b.onAdLoaded();
        }

        @Override // B4.d
        public void o() {
            super.o();
            d.this.f11885b.onAdOpened();
        }

        @Override // B4.d
        public void onAdClicked() {
            super.onAdClicked();
            d.this.f11885b.onAdClicked();
        }
    }

    public d(g gVar, c cVar) {
        this.f11885b = gVar;
        this.f11886c = cVar;
    }

    public B4.d d() {
        return this.f11887d;
    }
}
