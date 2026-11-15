package com.bytedance.sdk.component.csi.csi;

import android.graphics.Bitmap;
import com.bytedance.sdk.component.csi.sns;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public class nn extends kq {
    private Bitmap bob(com.bytedance.sdk.component.csi.bob.bob bobVar) {
        return bobVar.wcx().kq(bobVar.gm()).kq(bobVar.nn());
    }

    private Bitmap oq(com.bytedance.sdk.component.csi.bob.bob bobVar) {
        Collection<sns> collectionKq = bobVar.wcx().kq();
        Bitmap bitmapKq = null;
        if (collectionKq == null) {
            return null;
        }
        Iterator<sns> it = collectionKq.iterator();
        while (it.hasNext() && (bitmapKq = it.next().kq(bobVar.nn())) == null) {
        }
        return bitmapKq;
    }

    @Override // com.bytedance.sdk.component.csi.csi.dgq
    public void kq(com.bytedance.sdk.component.csi.bob.bob bobVar) {
        Bitmap bitmapOq;
        int iVvw = bobVar.vvw();
        if (iVvw == 2 || iVvw == 1) {
            bitmapOq = (bobVar.fax() || bobVar.gm().dgq()) ? oq(bobVar) : bob(bobVar);
        } else {
            bitmapOq = null;
        }
        if (bitmapOq == null) {
            bobVar.kq(new vvw());
        } else {
            bobVar.kq(new wki(bitmapOq, null, false));
        }
    }

    @Override // com.bytedance.sdk.component.csi.csi.dgq
    public String kq() {
        return "memory_cache";
    }
}
