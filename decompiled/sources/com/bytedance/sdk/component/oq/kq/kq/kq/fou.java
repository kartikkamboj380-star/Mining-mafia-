package com.bytedance.sdk.component.oq.kq.kq.kq;

import android.text.TextUtils;
import com.bytedance.sdk.component.oq.kq.ubx;
import com.bytedance.sdk.component.oq.kq.vvw;

/* JADX INFO: loaded from: classes.dex */
public class fou extends ubx {
    public kq dgq;
    public rhi syt;

    public fou(ubx.kq kqVar) {
        super(kqVar);
        rhi rhiVar = new rhi();
        this.syt = rhiVar;
        this.dgq = new kq(rhiVar.oq());
    }

    @Override // com.bytedance.sdk.component.oq.kq.ubx
    public com.bytedance.sdk.component.oq.kq.fou kq() {
        return this.syt;
    }

    @Override // com.bytedance.sdk.component.oq.kq.ubx
    public com.bytedance.sdk.component.oq.kq.oq kq(vvw vvwVar) {
        vvwVar.kq(this);
        if (vvwVar.oq() == null || vvwVar.oq().kq() == null || TextUtils.isEmpty(vvwVar.oq().kq().toString())) {
            return null;
        }
        if (kq.kq == null || !kq.kq.oq() || !this.dgq.csi() || "setting".equals(vvwVar.rhi())) {
            oq oqVar = new oq(vvwVar, this.syt);
            this.syt.bob().add(oqVar);
            return oqVar;
        }
        oq oqVar2 = new oq(vvwVar, this.dgq);
        this.dgq.bob().add(oqVar2);
        return oqVar2;
    }
}
