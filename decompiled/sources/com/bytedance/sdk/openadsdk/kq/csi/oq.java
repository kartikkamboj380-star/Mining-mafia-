package com.bytedance.sdk.openadsdk.kq.csi;

import com.bytedance.sdk.openadsdk.api.reward.PAGRewardedAd;
import com.bytedance.sdk.openadsdk.api.reward.PAGRewardedAdLoadListener;
import com.bytedance.sdk.openadsdk.utils.nz;

/* JADX INFO: loaded from: classes.dex */
public class oq implements PAGRewardedAdLoadListener {
    private final PAGRewardedAdLoadListener kq;

    public oq(PAGRewardedAdLoadListener pAGRewardedAdLoadListener) {
        this.kq = pAGRewardedAdLoadListener;
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener, com.bytedance.sdk.openadsdk.common.rjo
    public void onError(final int i10, final String str) {
        if (this.kq == null) {
            return;
        }
        if (str == null) {
            str = "Unknown exception.";
        }
        nz.kq(new Runnable() { // from class: com.bytedance.sdk.openadsdk.kq.csi.oq.1
            @Override // java.lang.Runnable
            public void run() {
                if (oq.this.kq != null) {
                    oq.this.kq.onError(i10, str);
                }
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener
    /* JADX INFO: renamed from: kq, reason: merged with bridge method [inline-methods] */
    public void onAdLoaded(final PAGRewardedAd pAGRewardedAd) {
        if (this.kq == null) {
            return;
        }
        nz.kq(new Runnable() { // from class: com.bytedance.sdk.openadsdk.kq.csi.oq.2
            @Override // java.lang.Runnable
            public void run() {
                if (oq.this.kq != null) {
                    oq.this.kq.onAdLoaded(pAGRewardedAd);
                }
            }
        });
    }
}
