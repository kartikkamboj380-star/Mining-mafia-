package com.bytedance.sdk.openadsdk.component;

import com.bytedance.sdk.component.utils.fax;
import com.bytedance.sdk.openadsdk.api.open.PAGAppOpenAdInteractionListener;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public class csi implements com.bytedance.sdk.openadsdk.kq.fou.oq {
    private final PAGAppOpenAdInteractionListener kq;
    private final AtomicBoolean oq = new AtomicBoolean(false);
    private final AtomicBoolean bob = new AtomicBoolean(false);

    public csi(PAGAppOpenAdInteractionListener pAGAppOpenAdInteractionListener) {
        this.kq = pAGAppOpenAdInteractionListener;
    }

    @Override // com.bytedance.sdk.openadsdk.kq.fou.oq
    public void bob() {
        PAGAppOpenAdInteractionListener pAGAppOpenAdInteractionListener;
        if (this.oq.getAndSet(true) || (pAGAppOpenAdInteractionListener = this.kq) == null) {
            return;
        }
        pAGAppOpenAdInteractionListener.onAdDismissed();
    }

    @Override // com.bytedance.sdk.openadsdk.kq.fou.oq
    public void kq() {
        if (this.bob.compareAndSet(false, true)) {
            fax.kq("BVA", "onAdShow");
            PAGAppOpenAdInteractionListener pAGAppOpenAdInteractionListener = this.kq;
            if (pAGAppOpenAdInteractionListener != null) {
                pAGAppOpenAdInteractionListener.onAdShowed();
            }
        }
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGAdWrapperListener
    public void onAdClicked() {
        fax.kq("BVA", "onAdClicked");
        PAGAppOpenAdInteractionListener pAGAppOpenAdInteractionListener = this.kq;
        if (pAGAppOpenAdInteractionListener != null) {
            pAGAppOpenAdInteractionListener.onAdClicked();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.kq.fou.oq
    public void oq() {
        PAGAppOpenAdInteractionListener pAGAppOpenAdInteractionListener;
        fax.kq("BVA", "onAdSkip");
        if (this.oq.getAndSet(true) || (pAGAppOpenAdInteractionListener = this.kq) == null) {
            return;
        }
        pAGAppOpenAdInteractionListener.onAdDismissed();
    }
}
