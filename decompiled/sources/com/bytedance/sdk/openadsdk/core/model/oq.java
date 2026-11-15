package com.bytedance.sdk.openadsdk.core.model;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class oq {
    private String bob;
    private boolean csi;
    private String fou;
    private String kq;
    private String oq;

    public String bob() {
        return this.bob;
    }

    public boolean csi() {
        return this.csi;
    }

    public String fou() {
        return this.fou;
    }

    public void kq(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        this.kq = jSONObject.optString("icon");
        this.oq = jSONObject.optString("text");
        this.bob = jSONObject.optString("privacy_url");
        this.fou = jSONObject.optString("privacy_title");
    }

    public String oq() {
        return this.oq;
    }

    public JSONObject rhi() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("privacy_url", this.bob);
            jSONObject.put("privacy_title", this.fou);
            jSONObject.put("text", this.oq);
            jSONObject.put("icon", this.kq);
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    public String kq() {
        return this.kq;
    }

    public void kq(boolean z9) {
        this.csi = z9;
    }
}
