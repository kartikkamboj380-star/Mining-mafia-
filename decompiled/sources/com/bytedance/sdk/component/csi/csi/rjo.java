package com.bytedance.sdk.component.csi.csi;

import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class rjo extends kq {
    @Override // com.bytedance.sdk.component.csi.csi.dgq
    public void kq(com.bytedance.sdk.component.csi.bob.bob bobVar) {
        List<com.bytedance.sdk.component.csi.bob.bob> linkedList;
        String strJhe = bobVar.jhe();
        Map<String, List<com.bytedance.sdk.component.csi.bob.bob>> mapSyt = bobVar.wcx().syt();
        synchronized (mapSyt) {
            try {
                linkedList = mapSyt.get(strJhe);
                if (linkedList == null) {
                    linkedList = new LinkedList<>();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        synchronized (linkedList) {
            try {
                linkedList.add(bobVar);
                mapSyt.put(strJhe, linkedList);
                if (linkedList.size() <= 1) {
                    bobVar.kq(new fou());
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.bytedance.sdk.component.csi.csi.dgq
    public String kq() {
        return "check_duplicate";
    }
}
