package com.bytedance.sdk.openadsdk.component.reward;

import android.content.Context;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.TTClientBidding;
import com.bytedance.sdk.openadsdk.api.reward.PAGRewardedAd;
import com.bytedance.sdk.openadsdk.api.reward.PAGRewardedAdLoadListener;

/* JADX INFO: loaded from: classes.dex */
public class sns extends kq<PAGRewardedAdLoadListener, TTClientBidding> {
    sns(Context context) {
        super(context);
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.kq
    protected int oq() {
        return 7;
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.kq
    protected int rhi() {
        return 6;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.bytedance.sdk.openadsdk.component.reward.kq
    /* JADX INFO: renamed from: oq, reason: merged with bridge method [inline-methods] */
    public TTClientBidding kq(Context context, com.bytedance.sdk.openadsdk.core.model.kq kqVar, AdSlot adSlot) {
        return new gm(context, kqVar, adSlot);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.bytedance.sdk.openadsdk.component.reward.kq
    public void oq(TTClientBidding tTClientBidding) {
        if (tTClientBidding instanceof gm) {
            ((gm) tTClientBidding).oq();
        }
    }

    public static sns kq(Context context) {
        return (sns) fax.kq(context, 7);
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.kq
    protected suf kq() {
        return suf.kq(this.kq, suf.kq.REWARD_VIDEO);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.bytedance.sdk.openadsdk.component.reward.kq
    public Object kq(TTClientBidding tTClientBidding) {
        if (tTClientBidding instanceof gm) {
            return ((gm) tTClientBidding).kq();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.bytedance.sdk.openadsdk.component.reward.kq
    public void kq(PAGRewardedAdLoadListener pAGRewardedAdLoadListener, int i10, String str) {
        pAGRewardedAdLoadListener.onError(i10, str);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.bytedance.sdk.openadsdk.component.reward.kq
    public void kq(PAGRewardedAdLoadListener pAGRewardedAdLoadListener, Object obj) {
        if (pAGRewardedAdLoadListener == null || obj == null || !(obj instanceof PAGRewardedAd)) {
            return;
        }
        pAGRewardedAdLoadListener.onAdLoaded((PAGRewardedAd) obj);
    }
}
