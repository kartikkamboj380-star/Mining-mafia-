package com.bytedance.sdk.openadsdk.component.reward;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.RemoteException;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.IListenerManager;
import com.bytedance.sdk.openadsdk.activity.TTAdActivity;
import com.bytedance.sdk.openadsdk.activity.TTRewardExpressVideoActivity;
import com.bytedance.sdk.openadsdk.activity.TTRewardVideoActivity;
import com.bytedance.sdk.openadsdk.api.reward.PAGRewardedAd;
import com.bytedance.sdk.openadsdk.api.reward.PAGRewardedAdInteractionCallback;
import com.bytedance.sdk.openadsdk.api.reward.PAGRewardedAdInteractionListener;
import com.bytedance.sdk.openadsdk.core.model.uml;
import com.bytedance.sdk.openadsdk.core.rs;
import com.bytedance.sdk.openadsdk.utils.ebt;
import com.bytedance.sdk.openadsdk.utils.nz;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
class nn extends PAGRewardedAd {
    private com.bytedance.sdk.openadsdk.kq.csi.kq bob;
    private final wki csi;
    private final String fou = ebt.kq();
    private final com.bytedance.sdk.openadsdk.core.model.kq kq;
    private final AdSlot oq;

    nn(Context context, com.bytedance.sdk.openadsdk.core.model.kq kqVar, AdSlot adSlot) {
        this.kq = kqVar;
        this.oq = adSlot;
        this.csi = new wki(context, kqVar, "rewarded_video", new wki.kq() { // from class: com.bytedance.sdk.openadsdk.component.reward.nn.1
            @Override // com.bytedance.sdk.openadsdk.component.reward.wki.kq
            public Intent kq(Context context2, uml umlVar, Activity activity) {
                if (umlVar.ls()) {
                    return new Intent(context2, (Class<?>) TTAdActivity.class);
                }
                return umlVar.rhi() ? new Intent(context2, (Class<?>) TTRewardExpressVideoActivity.class) : new Intent(context2, (Class<?>) TTRewardVideoActivity.class);
            }

            @Override // com.bytedance.sdk.openadsdk.component.reward.wki.kq
            public void kq(Intent intent, Activity activity, uml umlVar, boolean z9) {
                com.bytedance.sdk.openadsdk.component.reward.kq.oq.kq(intent, activity, nn.this.csi.bob(), nn.this.kq, nn.this.fou);
                intent.putExtra("media_extra", nn.this.oq.getMediaExtra());
                intent.putExtra("user_id", nn.this.oq.getUserID());
            }

            @Override // com.bytedance.sdk.openadsdk.component.reward.wki.kq
            public void kq(boolean z9) {
                if (nn.this.bob == null) {
                    return;
                }
                if (z9) {
                    rs.kq().kq(nn.this.fou, nn.this.bob);
                } else {
                    rs.kq().kq(nn.this.bob);
                }
                nn.this.bob = null;
            }

            @Override // com.bytedance.sdk.openadsdk.component.reward.wki.kq
            public void kq(uml umlVar) {
                oq.kq(umlVar, nn.this.csi.bob(), true);
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.api.PangleAd
    public Object getExtraInfo(String str) {
        return this.csi.kq(str);
    }

    @Override // com.bytedance.sdk.openadsdk.api.PangleAd
    public Map<String, Object> getMediaExtraInfo() {
        return this.csi.oq();
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGClientBidding
    public void loss(Double d10, String str, String str2) {
        this.csi.kq(d10, str, str2);
    }

    @Override // com.bytedance.sdk.openadsdk.api.reward.PAGRewardedAd
    public void setAdInteractionCallback(PAGRewardedAdInteractionCallback pAGRewardedAdInteractionCallback) {
        this.bob = new ubx(pAGRewardedAdInteractionCallback, this.kq);
        kq(0);
    }

    @Override // com.bytedance.sdk.openadsdk.api.reward.PAGRewardedAd
    public void setAdInteractionListener(PAGRewardedAdInteractionListener pAGRewardedAdInteractionListener) {
        this.bob = new ubx(pAGRewardedAdInteractionListener, this.kq);
        kq(0);
    }

    @Override // com.bytedance.sdk.openadsdk.api.reward.PAGRewardedAd
    public void show(Activity activity) {
        this.csi.kq(activity);
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGClientBidding
    public void win(Double d10) {
        this.csi.kq(d10);
    }

    public void kq() {
        this.csi.kq();
    }

    private void kq(final int i10) {
        if (com.bytedance.sdk.openadsdk.multipro.oq.bob()) {
            nz.bob(new com.bytedance.sdk.component.syt.syt("Reward_registerMultiProcessListener") { // from class: com.bytedance.sdk.openadsdk.component.reward.nn.2
                @Override // java.lang.Runnable
                public void run() {
                    com.bytedance.sdk.openadsdk.multipro.aidl.kq kqVarKq = com.bytedance.sdk.openadsdk.multipro.aidl.kq.kq();
                    if (i10 != 0 || nn.this.bob == null) {
                        return;
                    }
                    com.bytedance.sdk.openadsdk.multipro.aidl.oq.fou fouVar = new com.bytedance.sdk.openadsdk.multipro.aidl.oq.fou(nn.this.bob);
                    IListenerManager iListenerManagerAsInterface = IListenerManager.Stub.asInterface(kqVarKq.kq(0));
                    if (iListenerManagerAsInterface != null) {
                        try {
                            iListenerManagerAsInterface.registerRewardVideoListener(nn.this.fou, fouVar);
                        } catch (RemoteException e10) {
                            com.bytedance.sdk.component.utils.fax.bob("TTRewardVideoAdImpl", e10.getMessage());
                        }
                    }
                }
            }, 5);
        }
    }
}
