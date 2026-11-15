package com.bytedance.adsdk.ugeno.core;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class fou {
    private static Map<String, oq> kq = new HashMap();

    public static void kq(List<oq> list) {
        if (list == null || list.size() <= 0) {
            return;
        }
        for (oq oqVar : list) {
            if (oqVar != null) {
                kq.put(oqVar.kq(), oqVar);
            }
        }
    }

    public static oq kq(String str) {
        return kq.get(str);
    }
}
