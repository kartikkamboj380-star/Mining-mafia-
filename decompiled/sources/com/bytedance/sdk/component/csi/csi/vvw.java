package com.bytedance.sdk.component.csi.csi;

/* JADX INFO: loaded from: classes.dex */
public class vvw extends kq {
    @Override // com.bytedance.sdk.component.csi.csi.dgq
    public void kq(com.bytedance.sdk.component.csi.bob.bob bobVar) {
        byte[] bArrKq = bobVar.wcx().oq(bobVar.gm()).kq(bobVar.dgq());
        if (bArrKq == null) {
            bobVar.kq(new rhi());
        } else {
            bobVar.kq(new oq(bArrKq, null));
        }
    }

    @Override // com.bytedance.sdk.component.csi.csi.dgq
    public String kq() {
        return "raw_cache";
    }
}
