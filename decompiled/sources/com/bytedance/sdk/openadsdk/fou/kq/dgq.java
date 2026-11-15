package com.bytedance.sdk.openadsdk.fou.kq;

import com.bytedance.sdk.openadsdk.core.sns;
import com.bytedance.sdk.openadsdk.utils.ebt;
import com.bytedance.sdk.openadsdk.utils.nz;

/* JADX INFO: loaded from: classes.dex */
class dgq implements com.bytedance.sdk.openadsdk.mxq.bob.bob {
    public static final dgq kq = new dgq();

    private dgq() {
    }

    @Override // com.bytedance.sdk.openadsdk.mxq.bob.bob
    public void kq(com.bytedance.sdk.openadsdk.mxq.oq oqVar) {
        kq(oqVar, false);
    }

    @Override // com.bytedance.sdk.openadsdk.mxq.bob.bob
    public void kq(final com.bytedance.sdk.openadsdk.mxq.oq oqVar, final boolean z9) {
        kq(new com.bytedance.sdk.component.syt.syt("uploadLogEvent") { // from class: com.bytedance.sdk.openadsdk.fou.kq.dgq.1
            @Override // java.lang.Runnable
            public void run() {
                try {
                    com.bytedance.sdk.openadsdk.mxq.kq.bob bobVarKq = oqVar.kq();
                    if (bobVarKq == null) {
                        return;
                    }
                    com.bytedance.sdk.component.rhi.kq.fou.kq.kq kqVar = new com.bytedance.sdk.component.rhi.kq.fou.kq.kq(ebt.kq(), bobVarKq.kq());
                    kqVar.bob((byte) 0);
                    kqVar.oq(z9 ? (byte) 2 : (byte) 3);
                    kqVar.kq((byte) 1);
                    if (com.bytedance.sdk.component.rhi.kq.oq.oq()) {
                        oq.kq(sns.kq(), com.bytedance.sdk.openadsdk.multipro.oq.bob());
                    }
                    com.bytedance.sdk.component.rhi.kq.oq.kq(kqVar);
                } catch (Throwable unused) {
                }
            }
        });
    }

    private void kq(com.bytedance.sdk.component.syt.syt sytVar) {
        if (sytVar == null) {
            return;
        }
        if (!nz.rjo()) {
            nz.oq(sytVar, 5);
        } else {
            sytVar.run();
        }
    }
}
