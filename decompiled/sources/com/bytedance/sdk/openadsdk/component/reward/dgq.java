package com.bytedance.sdk.openadsdk.component.reward;

import com.bytedance.sdk.openadsdk.api.reward.PAGRewardedAd;
import com.bytedance.sdk.openadsdk.api.reward.PAGRewardedAdLoadListener;
import com.bytedance.sdk.openadsdk.utils.nz;

/* JADX INFO: loaded from: classes.dex */
public class dgq implements PAGRewardedAdLoadListener {
    final PAGRewardedAdLoadListener kq;

    public dgq(PAGRewardedAdLoadListener pAGRewardedAdLoadListener) {
        this.kq = pAGRewardedAdLoadListener;
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener
    /* JADX INFO: renamed from: kq, reason: merged with bridge method [inline-methods] */
    public void onAdLoaded(final PAGRewardedAd pAGRewardedAd) {
        if (this.kq != null) {
            nz.kq(new Runnable() { // from class: com.bytedance.sdk.openadsdk.component.reward.dgq.2
                @Override // java.lang.Runnable
                public void run() {
                    PAGRewardedAdLoadListener pAGRewardedAdLoadListener = dgq.this.kq;
                    if (pAGRewardedAdLoadListener != null) {
                        pAGRewardedAdLoadListener.onAdLoaded(pAGRewardedAd);
                    }
                }
            });
        }
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener, com.bytedance.sdk.openadsdk.common.rjo
    public void onError(final int i10, final String str) {
        if (this.kq != null) {
            nz.kq(new Runnable() { // from class: com.bytedance.sdk.openadsdk.component.reward.dgq.1
                @Override // java.lang.Runnable
                public void run() {
                    PAGRewardedAdLoadListener pAGRewardedAdLoadListener = dgq.this.kq;
                    if (pAGRewardedAdLoadListener != null) {
                        pAGRewardedAdLoadListener.onError(i10, str);
                    }
                }
            });
        }
    }
}
