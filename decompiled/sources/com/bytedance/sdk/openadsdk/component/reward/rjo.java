package com.bytedance.sdk.openadsdk.component.reward;

import android.content.Context;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.TTClientBidding;
import com.bytedance.sdk.openadsdk.api.interstitial.PAGInterstitialAd;
import com.bytedance.sdk.openadsdk.api.interstitial.PAGInterstitialAdLoadListener;

/* JADX INFO: loaded from: classes.dex */
public class rjo extends kq<PAGInterstitialAdLoadListener, TTClientBidding> {
    rjo(Context context) {
        super(context);
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.kq
    protected int oq() {
        return 8;
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.kq
    protected int rhi() {
        return 5;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.bytedance.sdk.openadsdk.component.reward.kq
    /* JADX INFO: renamed from: oq, reason: merged with bridge method [inline-methods] */
    public TTClientBidding kq(Context context, com.bytedance.sdk.openadsdk.core.model.kq kqVar, AdSlot adSlot) {
        return new wcx(context, kqVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.bytedance.sdk.openadsdk.component.reward.kq
    public void oq(TTClientBidding tTClientBidding) {
        if (tTClientBidding instanceof wcx) {
            ((wcx) tTClientBidding).oq();
        }
    }

    public static rjo kq(Context context) {
        return (rjo) fax.kq(context, 8);
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.kq
    protected suf kq() {
        return suf.kq(this.kq, suf.kq.FULL_SCREEN_VIDEO);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.bytedance.sdk.openadsdk.component.reward.kq
    public Object kq(TTClientBidding tTClientBidding) {
        if (tTClientBidding instanceof wcx) {
            return ((wcx) tTClientBidding).kq();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.bytedance.sdk.openadsdk.component.reward.kq
    public void kq(PAGInterstitialAdLoadListener pAGInterstitialAdLoadListener, int i10, String str) {
        pAGInterstitialAdLoadListener.onError(i10, str);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.bytedance.sdk.openadsdk.component.reward.kq
    public void kq(PAGInterstitialAdLoadListener pAGInterstitialAdLoadListener, Object obj) {
        if (pAGInterstitialAdLoadListener == null || obj == null || !(obj instanceof PAGInterstitialAd)) {
            return;
        }
        pAGInterstitialAdLoadListener.onAdLoaded((PAGInterstitialAd) obj);
    }
}
