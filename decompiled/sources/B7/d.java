package B7;

import N4.InterfaceC0823e;
import android.view.View;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class d extends B4.d implements N4.k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final N4.m f312a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterfaceC0823e f313b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public C4.b f314c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public N4.l f315d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f316e;

    public d(N4.m mediationBannerAdConfiguration, InterfaceC0823e mediationBannerAdCallback) {
        Intrinsics.checkNotNullParameter(mediationBannerAdConfiguration, "mediationBannerAdConfiguration");
        Intrinsics.checkNotNullParameter(mediationBannerAdCallback, "mediationBannerAdCallback");
        this.f312a = mediationBannerAdConfiguration;
        this.f313b = mediationBannerAdCallback;
        this.f316e = "";
    }

    @Override // N4.k
    public final View getView() {
        C4.b bVar = this.f314c;
        if (bVar != null) {
            return bVar;
        }
        Intrinsics.r("adManagerAdView");
        return null;
    }

    @Override // B4.d
    public final void i() {
        super.i();
        u("ad closed");
        N4.l lVar = this.f315d;
        if (lVar == null) {
            Intrinsics.r("bannerAdCallback");
            lVar = null;
        }
        lVar.onAdClosed();
    }

    @Override // B4.d
    public final void j(B4.k adError) {
        Intrinsics.checkNotNullParameter(adError, "adError");
        super.j(adError);
        u("ad load failed due to " + adError);
        this.f313b.b(adError);
    }

    @Override // B4.d
    public final void k() {
        super.k();
        u("ad impression recorded");
        N4.l lVar = this.f315d;
        if (lVar == null) {
            Intrinsics.r("bannerAdCallback");
            lVar = null;
        }
        lVar.g();
    }

    @Override // B4.d
    public final void m() {
        super.m();
        u("ad loaded");
        this.f315d = (N4.l) this.f313b.onSuccess(this);
    }

    @Override // B4.d
    public final void o() {
        super.o();
        u("ad opened");
        N4.l lVar = this.f315d;
        if (lVar == null) {
            Intrinsics.r("bannerAdCallback");
            lVar = null;
        }
        lVar.onAdOpened();
    }

    @Override // B4.d
    public final void onAdClicked() {
        super.onAdClicked();
        u("ad clicked");
        N4.l lVar = this.f315d;
        if (lVar == null) {
            Intrinsics.r("bannerAdCallback");
            lVar = null;
        }
        lVar.h();
    }

    public final void u(String str) {
        v.a("[Banner/" + this.f316e + "] " + str);
    }
}
