package com.bytedance.sdk.component.csi.fou.oq;

import android.graphics.Bitmap;
import com.bytedance.sdk.component.csi.gm;

/* JADX INFO: loaded from: classes.dex */
public class kq<T> implements rhi {
    @Override // com.bytedance.sdk.component.csi.fou.oq.rhi
    public boolean kq(com.bytedance.sdk.component.csi.fou.bob.bob bobVar, gm gmVar, com.bytedance.sdk.component.csi.fou.bob.kq kqVar) {
        Bitmap bitmapKq;
        String strNn = bobVar.nn();
        bobVar.kq();
        com.bytedance.sdk.component.csi.oq oqVarWcx = bobVar.wcx();
        com.bytedance.sdk.component.csi.fou.bob.rhi rhiVarSns = bobVar.sns();
        if (oqVarWcx == null || rhiVarSns == null || !oqVarWcx.csi() || !kq(bobVar) || (bitmapKq = rhiVarSns.kq(oqVarWcx).kq(strNn)) == null) {
            return true;
        }
        bobVar.kq();
        kqVar.kq(new com.bytedance.sdk.component.csi.fou.bob.fou().kq(bobVar, bitmapKq, null, false));
        return false;
    }

    private boolean kq(com.bytedance.sdk.component.csi.fou.bob.bob bobVar) {
        int iVvw = bobVar.vvw();
        return iVvw == 1 || iVvw == 2;
    }

    @Override // com.bytedance.sdk.component.csi.fou.oq.rhi
    public String kq() {
        return "bitmap_cache";
    }
}
