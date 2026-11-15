package com.bytedance.sdk.openadsdk.kq.bob;

import com.bytedance.sdk.openadsdk.api.interstitial.PAGInterstitialAd;
import com.bytedance.sdk.openadsdk.api.interstitial.PAGInterstitialAdLoadListener;
import com.bytedance.sdk.openadsdk.utils.nz;

/* JADX INFO: loaded from: classes.dex */
public class kq implements PAGInterstitialAdLoadListener {
    private final PAGInterstitialAdLoadListener kq;

    public kq(PAGInterstitialAdLoadListener pAGInterstitialAdLoadListener) {
        this.kq = pAGInterstitialAdLoadListener;
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener, com.bytedance.sdk.openadsdk.common.rjo
    public void onError(final int i10, final String str) {
        if (this.kq == null) {
            return;
        }
        if (str == null) {
            str = "Unknown exception.";
        }
        nz.kq(new Runnable() { // from class: com.bytedance.sdk.openadsdk.kq.bob.kq.1
            @Override // java.lang.Runnable
            public void run() {
                if (kq.this.kq != null) {
                    kq.this.kq.onError(i10, str);
                }
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener
    /* JADX INFO: renamed from: kq, reason: merged with bridge method [inline-methods] */
    public void onAdLoaded(final PAGInterstitialAd pAGInterstitialAd) {
        if (this.kq == null) {
            return;
        }
        nz.kq(new Runnable() { // from class: com.bytedance.sdk.openadsdk.kq.bob.kq.2
            @Override // java.lang.Runnable
            public void run() {
                if (kq.this.kq != null) {
                    kq.this.kq.onAdLoaded(pAGInterstitialAd);
                }
            }
        });
    }
}
