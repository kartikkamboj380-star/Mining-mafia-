package com.bytedance.sdk.component.csi.csi;

import com.bytedance.sdk.component.csi.mxq;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class wki<T> extends kq {
    private boolean bob;
    private T kq;
    private com.bytedance.sdk.component.csi.rhi oq;

    public wki(T t10, com.bytedance.sdk.component.csi.rhi rhiVar, boolean z9) {
        this.kq = t10;
        this.oq = rhiVar;
        this.bob = z9;
    }

    private Map<String, String> oq() {
        com.bytedance.sdk.component.csi.rhi rhiVar = this.oq;
        if (rhiVar != null) {
            return rhiVar.csi();
        }
        return null;
    }

    @Override // com.bytedance.sdk.component.csi.csi.dgq
    public void kq(com.bytedance.sdk.component.csi.bob.bob bobVar) {
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

    private void oq(com.bytedance.sdk.component.csi.bob.bob bobVar) {
        mxq mxqVarSyt = bobVar.syt();
        if (mxqVarSyt != null) {
            mxqVarSyt.kq(new com.bytedance.sdk.component.csi.bob.fou().kq(bobVar, this.kq, oq(), this.bob));
        }
    }

    @Override // com.bytedance.sdk.component.csi.csi.dgq
    public String kq() {
        return "success";
    }
}
