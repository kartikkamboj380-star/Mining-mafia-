package com.bytedance.sdk.openadsdk.nn;

import com.bytedance.sdk.component.csi.dgq;
import com.bytedance.sdk.component.csi.gm;

/* JADX INFO: loaded from: classes.dex */
public class csi implements gm {
    private static int kq;
    private long bob;
    private final String csi;
    private boolean fou;
    private long oq = 0;

    public csi() {
        kq++;
        this.csi = "image_request_" + kq;
    }

    private String bob(String str, dgq dgqVar) {
        return str;
    }

    @Override // com.bytedance.sdk.component.csi.gm
    public void kq(String str, dgq dgqVar) {
        if (!this.fou) {
            dgqVar.kq();
            dgqVar.oq();
            dgqVar.bob();
            this.fou = true;
        }
        this.oq = System.currentTimeMillis();
        bob(str, dgqVar);
    }

    @Override // com.bytedance.sdk.component.csi.gm
    public void oq(String str, dgq dgqVar) {
        this.bob += System.currentTimeMillis() - this.oq;
        bob(str, dgqVar);
    }
}
