package com.bytedance.sdk.openadsdk.core.ubx.syt;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class kq {
    private String bob;
    private String csi;
    private String fou;
    private String kq;
    private String oq;

    public String bob() {
        return this.bob;
    }

    public String csi() {
        return this.csi;
    }

    public String fou() {
        return this.fou;
    }

    public String kq() {
        return this.kq;
    }

    public String oq() {
        return this.oq;
    }

    public kq bob(String str) {
        this.bob = str;
        return this;
    }

    public kq csi(String str) {
        this.csi = str;
        return this;
    }

    public kq fou(String str) {
        this.fou = str;
        return this;
    }

    public kq kq(String str) {
        this.kq = str;
        return this;
    }

    public kq oq(String str) {
        this.oq = str;
        return this;
    }

    public JSONObject kq(kq kqVar) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("id", this.kq);
            jSONObject.put("md5", this.oq);
            jSONObject.put("url", this.bob);
            if (kqVar != null) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("id", kqVar.kq());
                jSONObject2.put("md5", kqVar.oq());
                jSONObject2.put("url", kqVar.bob());
                jSONObject.put("overlay", jSONObject2);
            }
            return jSONObject;
        } catch (JSONException unused) {
            return null;
        }
    }
}
