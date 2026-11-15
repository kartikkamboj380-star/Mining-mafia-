package com.bytedance.sdk.openadsdk.kq.fou;

import com.bytedance.sdk.openadsdk.api.open.PAGAppOpenAd;
import com.bytedance.sdk.openadsdk.api.open.PAGAppOpenAdLoadListener;
import com.bytedance.sdk.openadsdk.utils.nz;

/* JADX INFO: loaded from: classes.dex */
public class kq implements PAGAppOpenAdLoadListener {
    private final PAGAppOpenAdLoadListener kq;

    public kq(PAGAppOpenAdLoadListener pAGAppOpenAdLoadListener) {
        this.kq = pAGAppOpenAdLoadListener;
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener, com.bytedance.sdk.openadsdk.common.rjo
    public void onError(final int i10, final String str) {
        if (this.kq == null) {
            return;
        }
        if (str == null) {
            str = "Unknown exception.";
        }
        nz.kq(new Runnable() { // from class: com.bytedance.sdk.openadsdk.kq.fou.kq.1
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
    public void onAdLoaded(final PAGAppOpenAd pAGAppOpenAd) {
        if (this.kq == null) {
            return;
        }
        nz.kq(new Runnable() { // from class: com.bytedance.sdk.openadsdk.kq.fou.kq.2
            @Override // java.lang.Runnable
            public void run() {
                if (kq.this.kq != null) {
                    kq.this.kq.onAdLoaded(pAGAppOpenAd);
                }
            }
        });
    }
}
