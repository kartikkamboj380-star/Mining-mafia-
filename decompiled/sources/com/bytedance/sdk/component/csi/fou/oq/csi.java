package com.bytedance.sdk.component.csi.fou.oq;

import com.bytedance.sdk.component.csi.gm;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes.dex */
public class csi implements rhi {
    @Override // com.bytedance.sdk.component.csi.fou.oq.rhi
    public boolean kq(com.bytedance.sdk.component.csi.fou.bob.bob bobVar, gm gmVar, com.bytedance.sdk.component.csi.fou.bob.kq kqVar) {
        List<com.bytedance.sdk.component.csi.fou.bob.bob> copyOnWriteArrayList;
        String strFax = bobVar.fax();
        Map<String, List<com.bytedance.sdk.component.csi.fou.bob.bob>> mapDgq = bobVar.sns().dgq();
        bobVar.vvw();
        bobVar.kq();
        synchronized (mapDgq) {
            try {
                copyOnWriteArrayList = mapDgq.get(strFax);
                if (copyOnWriteArrayList == null) {
                    copyOnWriteArrayList = new CopyOnWriteArrayList<>();
                    mapDgq.put(strFax, copyOnWriteArrayList);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        synchronized (copyOnWriteArrayList) {
            copyOnWriteArrayList.add(bobVar);
            if (copyOnWriteArrayList.size() <= 1) {
                return true;
            }
            bobVar.vvw();
            bobVar.kq();
            return false;
        }
    }

    @Override // com.bytedance.sdk.component.csi.fou.oq.rhi
    public String kq() {
        return "check_duplicate";
    }
}
