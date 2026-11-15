package com.bytedance.sdk.openadsdk.multipro.aidl.oq;

import com.bytedance.sdk.openadsdk.IAppOpenAdInteractionListener;
import com.bytedance.sdk.openadsdk.utils.nz;

/* JADX INFO: loaded from: classes.dex */
public class kq extends IAppOpenAdInteractionListener.Stub {
    private com.bytedance.sdk.openadsdk.kq.fou.oq kq;

    public kq(com.bytedance.sdk.openadsdk.kq.fou.oq oqVar) {
        this.kq = oqVar;
    }

    @Override // com.bytedance.sdk.openadsdk.IAppOpenAdInteractionListener
    public void onAdClicked() {
        if (this.kq == null) {
            return;
        }
        nz.kq(new Runnable() { // from class: com.bytedance.sdk.openadsdk.multipro.aidl.oq.kq.2
            @Override // java.lang.Runnable
            public void run() {
                if (kq.this.kq != null) {
                    kq.this.kq.onAdClicked();
                }
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.IAppOpenAdInteractionListener
    public void onAdShow() {
        if (this.kq == null) {
            return;
        }
        nz.kq(new Runnable() { // from class: com.bytedance.sdk.openadsdk.multipro.aidl.oq.kq.1
            @Override // java.lang.Runnable
            public void run() {
                if (kq.this.kq != null) {
                    kq.this.kq.kq();
                }
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.IAppOpenAdInteractionListener
    public void onAdSkip() {
        if (this.kq == null) {
            return;
        }
        nz.kq(new Runnable() { // from class: com.bytedance.sdk.openadsdk.multipro.aidl.oq.kq.3
            @Override // java.lang.Runnable
            public void run() {
                if (kq.this.kq != null) {
                    kq.this.kq.oq();
                }
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.IAppOpenAdInteractionListener
    public void onAdTimeOver() {
        if (this.kq == null) {
            return;
        }
        nz.kq(new Runnable() { // from class: com.bytedance.sdk.openadsdk.multipro.aidl.oq.kq.4
            @Override // java.lang.Runnable
            public void run() {
                if (kq.this.kq != null) {
                    kq.this.kq.bob();
                }
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.IAppOpenAdInteractionListener
    public void onDestroy() {
        kq();
    }

    private void kq() {
        this.kq = null;
    }
}
