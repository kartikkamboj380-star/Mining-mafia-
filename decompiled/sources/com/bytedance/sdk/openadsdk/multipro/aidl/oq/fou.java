package com.bytedance.sdk.openadsdk.multipro.aidl.oq;

import com.bytedance.sdk.openadsdk.IRewardAdInteractionListener;
import com.bytedance.sdk.openadsdk.utils.nz;

/* JADX INFO: loaded from: classes.dex */
public class fou extends IRewardAdInteractionListener.Stub {
    private com.bytedance.sdk.openadsdk.kq.csi.kq kq;

    public fou(com.bytedance.sdk.openadsdk.kq.csi.kq kqVar) {
        this.kq = kqVar;
    }

    @Override // com.bytedance.sdk.openadsdk.IRewardAdInteractionListener
    public void onAdClose() {
        if (this.kq == null) {
            return;
        }
        nz.kq(new Runnable() { // from class: com.bytedance.sdk.openadsdk.multipro.aidl.oq.fou.3
            @Override // java.lang.Runnable
            public void run() {
                if (fou.this.kq != null) {
                    fou.this.kq.oq();
                }
                fou.this.kq();
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.IRewardAdInteractionListener
    public void onAdShow() {
        if (this.kq == null) {
            return;
        }
        nz.kq(new Runnable() { // from class: com.bytedance.sdk.openadsdk.multipro.aidl.oq.fou.1
            @Override // java.lang.Runnable
            public void run() {
                if (fou.this.kq != null) {
                    fou.this.kq.kq();
                }
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.IRewardAdInteractionListener
    public void onAdVideoBarClick() {
        if (this.kq == null) {
            return;
        }
        nz.kq(new Runnable() { // from class: com.bytedance.sdk.openadsdk.multipro.aidl.oq.fou.2
            @Override // java.lang.Runnable
            public void run() {
                if (fou.this.kq != null) {
                    fou.this.kq.onAdClicked();
                }
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.IRewardAdInteractionListener
    public void onDestroy() {
    }

    @Override // com.bytedance.sdk.openadsdk.IRewardAdInteractionListener
    public void onRewardVerify(final boolean z9, final int i10, final String str, final int i11, final String str2) {
        if (this.kq == null) {
            return;
        }
        nz.kq(new Runnable() { // from class: com.bytedance.sdk.openadsdk.multipro.aidl.oq.fou.4
            @Override // java.lang.Runnable
            public void run() {
                if (fou.this.kq != null) {
                    fou.this.kq.kq(z9, i10, str, i11, str2);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void kq() {
        this.kq = null;
    }
}
