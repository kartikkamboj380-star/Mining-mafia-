package com.bytedance.sdk.component.csi.csi;

/* JADX INFO: loaded from: classes.dex */
public class fou extends kq {
    @Override // com.bytedance.sdk.component.csi.csi.dgq
    public void kq(com.bytedance.sdk.component.csi.bob.bob bobVar) {
        com.bytedance.sdk.component.csi.oq oqVarGm = bobVar.gm();
        if (oqVarGm != null) {
            if (oqVarGm.csi()) {
                bobVar.kq(new nn());
                return;
            } else if (oqVarGm.rjo()) {
                bobVar.kq(new rhi());
                return;
            }
        }
        bobVar.kq(new ubx());
    }

    @Override // com.bytedance.sdk.component.csi.csi.dgq
    public String kq() {
        return "cache_policy";
    }
}
