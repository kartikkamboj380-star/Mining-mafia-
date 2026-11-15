package com.bytedance.sdk.openadsdk.component.reward;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.RemoteException;
import com.bytedance.sdk.openadsdk.IListenerManager;
import com.bytedance.sdk.openadsdk.activity.TTAdActivity;
import com.bytedance.sdk.openadsdk.activity.TTFullScreenExpressVideoActivity;
import com.bytedance.sdk.openadsdk.activity.TTFullScreenVideoActivity;
import com.bytedance.sdk.openadsdk.api.interstitial.PAGInterstitialAd;
import com.bytedance.sdk.openadsdk.api.interstitial.PAGInterstitialAdInteractionCallback;
import com.bytedance.sdk.openadsdk.api.interstitial.PAGInterstitialAdInteractionListener;
import com.bytedance.sdk.openadsdk.core.model.uml;
import com.bytedance.sdk.openadsdk.core.rs;
import com.bytedance.sdk.openadsdk.utils.ebt;
import com.bytedance.sdk.openadsdk.utils.nz;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
class syt extends PAGInterstitialAd {
    private final String bob = ebt.kq();
    private final wki fou;
    private final com.bytedance.sdk.openadsdk.core.model.kq kq;
    private com.bytedance.sdk.openadsdk.kq.bob.oq oq;

    syt(Context context, com.bytedance.sdk.openadsdk.core.model.kq kqVar) {
        this.kq = kqVar;
        this.fou = new wki(context, kqVar, "fullscreen_interstitial_ad", new wki.kq() { // from class: com.bytedance.sdk.openadsdk.component.reward.syt.1
            @Override // com.bytedance.sdk.openadsdk.component.reward.wki.kq
            public Intent kq(Context context2, uml umlVar, Activity activity) {
                if (umlVar.ls()) {
                    return new Intent(context2, (Class<?>) TTAdActivity.class);
                }
                return umlVar.rhi() ? new Intent(context2, (Class<?>) TTFullScreenExpressVideoActivity.class) : new Intent(context2, (Class<?>) TTFullScreenVideoActivity.class);
            }

            @Override // com.bytedance.sdk.openadsdk.component.reward.wki.kq
            public void kq(Intent intent, Activity activity, uml umlVar, boolean z9) {
                com.bytedance.sdk.openadsdk.component.reward.kq.oq.kq(intent, activity, syt.this.fou.bob(), syt.this.kq, syt.this.bob);
            }

            @Override // com.bytedance.sdk.openadsdk.component.reward.wki.kq
            public void kq(boolean z9) {
                if (syt.this.oq == null) {
                    return;
                }
                if (z9) {
                    rs.kq().kq(syt.this.bob, syt.this.oq);
                } else {
                    rs.kq().kq(syt.this.oq);
                }
                syt.this.oq = null;
            }

            @Override // com.bytedance.sdk.openadsdk.component.reward.wki.kq
            public void kq(uml umlVar) {
                oq.kq(umlVar, syt.this.fou.bob(), false);
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.api.PangleAd
    public Object getExtraInfo(String str) {
        return this.fou.kq(str);
    }

    @Override // com.bytedance.sdk.openadsdk.api.PangleAd
    public Map<String, Object> getMediaExtraInfo() {
        return this.fou.oq();
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGClientBidding
    public void loss(Double d10, String str, String str2) {
        this.fou.kq(d10, str, str2);
    }

    @Override // com.bytedance.sdk.openadsdk.api.interstitial.PAGInterstitialAd
    public void setAdInteractionCallback(PAGInterstitialAdInteractionCallback pAGInterstitialAdInteractionCallback) {
        this.oq = new com.bytedance.sdk.openadsdk.component.bob.kq(pAGInterstitialAdInteractionCallback, this.kq);
        kq(1);
    }

    @Override // com.bytedance.sdk.openadsdk.api.interstitial.PAGInterstitialAd
    public void setAdInteractionListener(PAGInterstitialAdInteractionListener pAGInterstitialAdInteractionListener) {
        this.oq = new com.bytedance.sdk.openadsdk.component.bob.kq(pAGInterstitialAdInteractionListener, this.kq);
        kq(1);
    }

    @Override // com.bytedance.sdk.openadsdk.api.interstitial.PAGInterstitialAd
    public void show(Activity activity) {
        this.fou.kq(activity);
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGClientBidding
    public void win(Double d10) {
        this.fou.kq(d10);
    }

    public void kq() {
        this.fou.kq();
    }

    private void kq(final int i10) {
        if (com.bytedance.sdk.openadsdk.multipro.oq.bob()) {
            nz.bob(new com.bytedance.sdk.component.syt.syt("FullScreen_registerMultiProcessListener") { // from class: com.bytedance.sdk.openadsdk.component.reward.syt.2
                @Override // java.lang.Runnable
                public void run() {
                    com.bytedance.sdk.openadsdk.multipro.aidl.kq kqVarKq = com.bytedance.sdk.openadsdk.multipro.aidl.kq.kq();
                    if (i10 != 1 || syt.this.oq == null) {
                        return;
                    }
                    com.bytedance.sdk.openadsdk.multipro.aidl.oq.bob bobVar = new com.bytedance.sdk.openadsdk.multipro.aidl.oq.bob(syt.this.oq);
                    IListenerManager iListenerManagerAsInterface = IListenerManager.Stub.asInterface(kqVarKq.kq(1));
                    if (iListenerManagerAsInterface != null) {
                        try {
                            iListenerManagerAsInterface.registerFullVideoListener(syt.this.bob, bobVar);
                        } catch (RemoteException e10) {
                            com.bytedance.sdk.component.utils.fax.bob("TTFullScreenVideoAdImpl", e10.getMessage());
                        }
                    }
                }
            }, 5);
        }
    }
}
