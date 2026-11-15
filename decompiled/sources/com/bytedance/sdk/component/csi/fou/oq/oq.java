package com.bytedance.sdk.component.csi.fou.oq;

import android.text.TextUtils;
import com.bytedance.sdk.component.csi.gm;
import com.bytedance.sdk.component.utils.mxq;

/* JADX INFO: loaded from: classes.dex */
public class oq implements rhi {
    @Override // com.bytedance.sdk.component.csi.fou.oq.rhi
    public boolean kq(com.bytedance.sdk.component.csi.fou.bob.bob bobVar, gm gmVar, com.bytedance.sdk.component.csi.fou.bob.kq kqVar) {
        if (TextUtils.isEmpty(bobVar.nn())) {
            String strKq = kq(bobVar);
            bobVar.oq(strKq);
            bobVar.kq(strKq);
        }
        bobVar.kq();
        return true;
    }

    @Override // com.bytedance.sdk.component.csi.fou.oq.rhi
    public String kq() {
        return "generate_key";
    }

    private String kq(com.bytedance.sdk.component.csi.fou.bob.bob bobVar) {
        return mxq.kq(bobVar.kq());
    }
}
