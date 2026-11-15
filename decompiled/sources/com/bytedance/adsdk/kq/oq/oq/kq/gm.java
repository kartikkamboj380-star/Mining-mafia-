package com.bytedance.adsdk.kq.oq.oq.kq;

import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class gm implements com.bytedance.adsdk.kq.oq.oq.oq {
    private com.bytedance.adsdk.kq.oq.oq.kq bob;
    private com.bytedance.adsdk.kq.oq.oq.kq kq;
    private com.bytedance.adsdk.kq.oq.oq.kq oq;

    @Override // com.bytedance.adsdk.kq.oq.oq.oq
    public void bob(com.bytedance.adsdk.kq.oq.oq.kq kqVar) {
        this.bob = kqVar;
    }

    @Override // com.bytedance.adsdk.kq.oq.oq.kq
    public Object kq(Map<String, JSONObject> map) {
        Object objKq = this.kq.kq(map);
        if (objKq == null) {
            return null;
        }
        return ((Boolean) objKq).booleanValue() ? this.oq.kq(map) : this.bob.kq(map);
    }

    @Override // com.bytedance.adsdk.kq.oq.oq.oq
    public void oq(com.bytedance.adsdk.kq.oq.oq.kq kqVar) {
        this.oq = kqVar;
    }

    public String toString() {
        return oq();
    }

    @Override // com.bytedance.adsdk.kq.oq.oq.kq
    public String oq() {
        return this.kq.oq() + "?" + this.oq.oq() + ":" + this.bob.oq();
    }

    @Override // com.bytedance.adsdk.kq.oq.oq.kq
    public com.bytedance.adsdk.kq.oq.fou.csi kq() {
        return com.bytedance.adsdk.kq.oq.fou.rhi.OPERATOR_RESULT;
    }

    @Override // com.bytedance.adsdk.kq.oq.oq.oq
    public void kq(com.bytedance.adsdk.kq.oq.oq.kq kqVar) {
        this.kq = kqVar;
    }
}
