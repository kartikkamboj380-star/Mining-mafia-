package com.bytedance.sdk.component.csi.csi;

import com.bytedance.sdk.component.csi.mxq;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class syt extends kq {
    private String bob;
    private Throwable kq;
    private int oq;

    public syt(int i10, String str, Throwable th) {
        this.oq = i10;
        this.bob = str;
        this.kq = th;
    }

    private void oq(com.bytedance.sdk.component.csi.bob.bob bobVar) {
        mxq mxqVarSyt = bobVar.syt();
        if (mxqVarSyt != null) {
            mxqVarSyt.kq(this.oq, this.bob, this.kq);
        }
    }

    @Override // com.bytedance.sdk.component.csi.csi.dgq
    public void kq(com.bytedance.sdk.component.csi.bob.bob bobVar) {
        bobVar.kq(new com.bytedance.sdk.component.csi.bob.kq(this.oq, this.bob, this.kq));
        String strJhe = bobVar.jhe();
        Map<String, List<com.bytedance.sdk.component.csi.bob.bob>> mapSyt = bobVar.wcx().syt();
        List<com.bytedance.sdk.component.csi.bob.bob> list = mapSyt.get(strJhe);
        if (list == null) {
            oq(bobVar);
            return;
        }
        synchronized (list) {
            try {
                Iterator<com.bytedance.sdk.component.csi.bob.bob> it = list.iterator();
                while (it.hasNext()) {
                    oq(it.next());
                }
                list.clear();
                mapSyt.remove(strJhe);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.bytedance.sdk.component.csi.csi.dgq
    public String kq() {
        return "failed";
    }
}
