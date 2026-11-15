package com.bytedance.sdk.openadsdk.multipro.aidl.oq;

import com.bytedance.sdk.openadsdk.IDislikeClosedListener;
import com.bytedance.sdk.openadsdk.bob.nn;
import com.bytedance.sdk.openadsdk.core.fou.rjo;
import com.bytedance.sdk.openadsdk.utils.nz;

/* JADX INFO: loaded from: classes.dex */
public class oq extends IDislikeClosedListener.Stub {
    private final rjo.kq kq;
    private final String oq;

    public oq(String str, rjo.kq kqVar) {
        this.oq = str;
        this.kq = kqVar;
    }

    @Override // com.bytedance.sdk.openadsdk.IDislikeClosedListener
    public void onItemClickClosed() {
        nz.kq(new Runnable() { // from class: com.bytedance.sdk.openadsdk.multipro.aidl.oq.oq.1
            @Override // java.lang.Runnable
            public void run() {
                if (oq.this.kq != null) {
                    oq.this.kq.kq();
                    nn.kq(6, oq.this.oq);
                }
            }
        });
    }
}
