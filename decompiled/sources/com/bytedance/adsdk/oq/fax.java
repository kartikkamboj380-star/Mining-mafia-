package com.bytedance.adsdk.oq;

import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class fax {
    private final Map<String, String> kq;
    private boolean oq;

    public String kq(String str) {
        return str;
    }

    public final String oq(String str, String str2) {
        if (this.oq && this.kq.containsKey(str2)) {
            return this.kq.get(str2);
        }
        String strKq = kq(str, str2);
        if (this.oq) {
            this.kq.put(str2, strKq);
        }
        return strKq;
    }

    public String kq(String str, String str2) {
        return kq(str2);
    }
}
