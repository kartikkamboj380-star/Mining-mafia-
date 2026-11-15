package com.bytedance.sdk.openadsdk.kq.oq;

import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAd;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAdLoadListener;
import com.bytedance.sdk.openadsdk.utils.nz;

/* JADX INFO: loaded from: classes.dex */
public class csi implements PAGNativeAdLoadListener {
    private final PAGNativeAdLoadListener kq;

    public csi(PAGNativeAdLoadListener pAGNativeAdLoadListener) {
        this.kq = pAGNativeAdLoadListener;
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener, com.bytedance.sdk.openadsdk.common.rjo
    public void onError(final int i10, final String str) {
        if (this.kq == null) {
            return;
        }
        if (str == null) {
            str = "Unknown exception.";
        }
        nz.kq(new Runnable() { // from class: com.bytedance.sdk.openadsdk.kq.oq.csi.1
            @Override // java.lang.Runnable
            public void run() {
                if (csi.this.kq != null) {
                    csi.this.kq.onError(i10, str);
                }
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener
    /* JADX INFO: renamed from: kq, reason: merged with bridge method [inline-methods] */
    public void onAdLoaded(final PAGNativeAd pAGNativeAd) {
        if (this.kq == null) {
            return;
        }
        nz.kq(new Runnable() { // from class: com.bytedance.sdk.openadsdk.kq.oq.csi.2
            @Override // java.lang.Runnable
            public void run() {
                if (csi.this.kq != null) {
                    csi.this.kq.onAdLoaded(pAGNativeAd);
                }
            }
        });
    }
}
