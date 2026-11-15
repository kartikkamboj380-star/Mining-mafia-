package com.bytedance.sdk.openadsdk.kq.kq;

import com.bytedance.sdk.openadsdk.api.banner.PAGBannerAd;
import com.bytedance.sdk.openadsdk.api.banner.PAGBannerAdLoadListener;
import com.bytedance.sdk.openadsdk.utils.nz;

/* JADX INFO: loaded from: classes.dex */
public class kq implements PAGBannerAdLoadListener {
    private final PAGBannerAdLoadListener kq;

    public kq(PAGBannerAdLoadListener pAGBannerAdLoadListener) {
        this.kq = pAGBannerAdLoadListener;
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener, com.bytedance.sdk.openadsdk.common.rjo
    public void onError(final int i10, final String str) {
        if (this.kq == null) {
            return;
        }
        if (str == null) {
            str = "Unknown exception.";
        }
        nz.kq(new Runnable() { // from class: com.bytedance.sdk.openadsdk.kq.kq.kq.1
            @Override // java.lang.Runnable
            public void run() {
                kq.this.kq.onError(i10, str);
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener
    /* JADX INFO: renamed from: kq, reason: merged with bridge method [inline-methods] */
    public void onAdLoaded(final PAGBannerAd pAGBannerAd) {
        if (this.kq == null) {
            return;
        }
        nz.kq(new Runnable() { // from class: com.bytedance.sdk.openadsdk.kq.kq.kq.2
            @Override // java.lang.Runnable
            public void run() {
                kq.this.kq.onAdLoaded(pAGBannerAd);
            }
        });
    }
}
