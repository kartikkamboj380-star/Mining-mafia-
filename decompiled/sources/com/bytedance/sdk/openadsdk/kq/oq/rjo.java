package com.bytedance.sdk.openadsdk.kq.oq;

import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAd;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAdInteractionListener;
import com.bytedance.sdk.openadsdk.utils.nz;

/* JADX INFO: loaded from: classes.dex */
public class rjo implements rhi {
    private final PAGNativeAdInteractionListener kq;

    public rjo(PAGNativeAdInteractionListener pAGNativeAdInteractionListener) {
        this.kq = pAGNativeAdInteractionListener;
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGAdWrapperListener
    public void onAdClicked() {
        nz.kq(new Runnable() { // from class: com.bytedance.sdk.openadsdk.kq.oq.rjo.1
            @Override // java.lang.Runnable
            public void run() {
                if (rjo.this.kq != null) {
                    rjo.this.kq.onAdClicked();
                }
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.kq.oq.rhi
    public boolean oq() {
        return this.kq != null;
    }

    @Override // com.bytedance.sdk.openadsdk.kq.oq.rhi
    public void kq(PAGNativeAd pAGNativeAd) {
        nz.kq(new Runnable() { // from class: com.bytedance.sdk.openadsdk.kq.oq.rjo.2
            @Override // java.lang.Runnable
            public void run() {
                if (rjo.this.kq != null) {
                    rjo.this.kq.onAdShowed();
                }
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.kq.oq.rhi
    public void kq() {
        nz.kq(new Runnable() { // from class: com.bytedance.sdk.openadsdk.kq.oq.rjo.3
            @Override // java.lang.Runnable
            public void run() {
                if (rjo.this.kq != null) {
                    rjo.this.kq.onAdDismissed();
                }
            }
        });
    }
}
