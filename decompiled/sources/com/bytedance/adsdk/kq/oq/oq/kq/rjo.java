package com.bytedance.adsdk.kq.oq.oq.kq;

import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class rjo implements com.bytedance.adsdk.kq.oq.oq.kq {
    private final Object kq;

    public rjo(String str) {
        if (str.equalsIgnoreCase("true")) {
            this.kq = Boolean.TRUE;
        } else if (str.equalsIgnoreCase("false")) {
            this.kq = Boolean.FALSE;
        } else {
            if (!str.equalsIgnoreCase("null")) {
                throw new IllegalArgumentException();
            }
            this.kq = null;
        }
    }

    @Override // com.bytedance.adsdk.kq.oq.oq.kq
    public Object kq(Map<String, JSONObject> map) {
        return this.kq;
    }

    @Override // com.bytedance.adsdk.kq.oq.oq.kq
    public String oq() {
        Object obj = this.kq;
        return obj != null ? obj.toString() : "NULL";
    }

    public String toString() {
        return "KeywordNode [keywordValue=" + this.kq + "]";
    }

    @Override // com.bytedance.adsdk.kq.oq.oq.kq
    public com.bytedance.adsdk.kq.oq.fou.csi kq() {
        return com.bytedance.adsdk.kq.oq.fou.rhi.CONSTANT;
    }
}
