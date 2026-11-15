package com.bytedance.adsdk.kq.oq.oq.kq;

import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class nze implements com.bytedance.adsdk.kq.oq.oq.kq {
    private Number kq;

    public nze(String str) {
        if (str.indexOf(46) < 0) {
            try {
                this.kq = Integer.valueOf(str);
            } catch (NumberFormatException unused) {
                this.kq = Long.valueOf(str);
            }
        } else {
            Float fValueOf = Float.valueOf(str);
            this.kq = fValueOf;
            if (Float.isInfinite(fValueOf.floatValue())) {
                this.kq = Double.valueOf(str);
            }
        }
    }

    @Override // com.bytedance.adsdk.kq.oq.oq.kq
    public Object kq(Map<String, JSONObject> map) {
        return this.kq;
    }

    @Override // com.bytedance.adsdk.kq.oq.oq.kq
    public String oq() {
        return this.kq.toString();
    }

    public String toString() {
        return oq();
    }

    @Override // com.bytedance.adsdk.kq.oq.oq.kq
    public com.bytedance.adsdk.kq.oq.fou.csi kq() {
        return com.bytedance.adsdk.kq.oq.fou.rhi.NUMBER;
    }
}
