package com.bytedance.adsdk.ugeno.fou.kq;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class kq {
    private volatile Map<String, bob> kq = new HashMap();

    public bob kq(String str) {
        if (this.kq.containsKey(str) && this.kq.get(str) != null) {
            return this.kq.get(str);
        }
        oq oqVar = new oq();
        this.kq.put(str, oqVar);
        return oqVar;
    }

    public void kq(String str, bob bobVar) {
        if (!this.kq.containsKey(str) || this.kq.get(str) == null) {
            this.kq.put(str, bobVar);
        }
    }
}
