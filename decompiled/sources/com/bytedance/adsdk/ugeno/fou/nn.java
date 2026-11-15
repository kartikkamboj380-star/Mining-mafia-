package com.bytedance.adsdk.ugeno.fou;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class nn {
    private static Map<String, rjo> kq = new HashMap();

    public static void kq(List<rjo> list) {
        if (list == null || list.size() <= 0) {
            return;
        }
        for (rjo rjoVar : list) {
            if (rjoVar != null) {
                kq.put(rjoVar.kq(), rjoVar);
            }
        }
    }

    public static rjo kq(String str) {
        return kq.get(str);
    }
}
