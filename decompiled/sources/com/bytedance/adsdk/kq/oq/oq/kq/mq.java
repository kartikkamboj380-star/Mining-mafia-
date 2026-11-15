package com.bytedance.adsdk.kq.oq.oq.kq;

import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class mq implements com.bytedance.adsdk.kq.oq.oq.kq {
    private com.bytedance.adsdk.kq.oq.fou.fou kq;

    public mq(com.bytedance.adsdk.kq.oq.fou.fou fouVar) {
        this.kq = fouVar;
    }

    @Override // com.bytedance.adsdk.kq.oq.oq.kq
    public Object kq(Map<String, JSONObject> map) {
        throw new UnsupportedOperationException();
    }

    @Override // com.bytedance.adsdk.kq.oq.oq.kq
    public String oq() {
        return this.kq.kq();
    }

    public String toString() {
        return oq();
    }

    @Override // com.bytedance.adsdk.kq.oq.oq.kq
    public com.bytedance.adsdk.kq.oq.fou.csi kq() {
        return this.kq;
    }
}
