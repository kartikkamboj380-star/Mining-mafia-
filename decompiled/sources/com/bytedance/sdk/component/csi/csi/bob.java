package com.bytedance.sdk.component.csi.csi;

import android.text.TextUtils;

/* JADX INFO: loaded from: classes.dex */
public class bob extends kq {
    @Override // com.bytedance.sdk.component.csi.csi.dgq
    public void kq(com.bytedance.sdk.component.csi.bob.bob bobVar) {
        if (TextUtils.isEmpty(bobVar.nn())) {
            com.bytedance.sdk.component.csi.vvw vvwVarRhi = bobVar.wcx().rhi();
            bobVar.oq(vvwVarRhi.kq(bobVar));
            bobVar.kq(vvwVarRhi.oq(bobVar));
        }
        bobVar.kq(new rjo());
    }

    @Override // com.bytedance.sdk.component.csi.csi.dgq
    public String kq() {
        return "generate_key";
    }
}
