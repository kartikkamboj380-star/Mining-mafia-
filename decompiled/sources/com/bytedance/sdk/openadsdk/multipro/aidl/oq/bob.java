package com.bytedance.sdk.openadsdk.multipro.aidl.oq;

import com.bytedance.sdk.openadsdk.IFullScreenVideoAdInteractionListener;
import com.bytedance.sdk.openadsdk.utils.nz;

/* JADX INFO: loaded from: classes.dex */
public class bob extends IFullScreenVideoAdInteractionListener.Stub {
    private com.bytedance.sdk.openadsdk.kq.bob.oq kq;

    public bob(com.bytedance.sdk.openadsdk.kq.bob.oq oqVar) {
        this.kq = oqVar;
    }

    @Override // com.bytedance.sdk.openadsdk.IFullScreenVideoAdInteractionListener
    public void onAdClose() {
        if (this.kq == null) {
            return;
        }
        nz.kq(new Runnable() { // from class: com.bytedance.sdk.openadsdk.multipro.aidl.oq.bob.3
            @Override // java.lang.Runnable
            public void run() {
                if (bob.this.kq != null) {
                    bob.this.kq.oq();
                }
                bob.this.kq();
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.IFullScreenVideoAdInteractionListener
    public void onAdShow() {
        if (this.kq == null) {
            return;
        }
        nz.kq(new Runnable() { // from class: com.bytedance.sdk.openadsdk.multipro.aidl.oq.bob.1
            @Override // java.lang.Runnable
            public void run() {
                if (bob.this.kq != null) {
                    bob.this.kq.kq();
                }
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.IFullScreenVideoAdInteractionListener
    public void onAdVideoBarClick() {
        if (this.kq == null) {
            return;
        }
        nz.kq(new Runnable() { // from class: com.bytedance.sdk.openadsdk.multipro.aidl.oq.bob.2
            @Override // java.lang.Runnable
            public void run() {
                if (bob.this.kq != null) {
                    bob.this.kq.onAdClicked();
                }
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.IFullScreenVideoAdInteractionListener
    public void onDestroy() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void kq() {
        this.kq = null;
    }
}
