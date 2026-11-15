package com.google.ads.mediation.unity;

import com.unity3d.ads.UnityAdsLoadOptions;
import com.unity3d.services.banners.BannerView;

/* JADX INFO: loaded from: classes2.dex */
class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final BannerView f16754a;

    e(BannerView bannerView) {
        this.f16754a = bannerView;
    }

    public BannerView a() {
        return this.f16754a;
    }

    public void b(UnityAdsLoadOptions unityAdsLoadOptions) {
        this.f16754a.load(unityAdsLoadOptions);
    }

    public void c(BannerView.IListener iListener) {
        this.f16754a.setListener(iListener);
    }
}
