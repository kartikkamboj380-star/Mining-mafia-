package com.bytedance.adsdk.kq.oq.oq.kq;

import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class fax implements com.bytedance.adsdk.kq.oq.oq.kq {
    private final String kq;

    public fax(String str) {
        this.kq = str;
    }

    @Override // com.bytedance.adsdk.kq.oq.oq.kq
    public Object kq(Map<String, JSONObject> map) {
        return this.kq;
    }

    @Override // com.bytedance.adsdk.kq.oq.oq.kq
    public String oq() {
        return "'" + this.kq + "'";
    }

    public String toString() {
        return oq();
    }

    @Override // com.bytedance.adsdk.kq.oq.oq.kq
    public com.bytedance.adsdk.kq.oq.fou.csi kq() {
        return com.bytedance.adsdk.kq.oq.fou.rhi.STRING;
    }
}
