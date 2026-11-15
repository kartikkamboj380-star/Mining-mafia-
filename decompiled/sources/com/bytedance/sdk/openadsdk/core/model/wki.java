package com.bytedance.sdk.openadsdk.core.model;

import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class wki {
    private int bob;
    private String kq;
    private String oq;

    public int bob() {
        return this.bob;
    }

    public JSONObject fou() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("u", this.kq);
            jSONObject.put("ft", this.bob);
            jSONObject.put("fu", this.oq);
            return jSONObject;
        } catch (Exception unused) {
            return null;
        }
    }

    public String kq() {
        return this.kq;
    }

    public String oq() {
        return this.oq;
    }

    public void kq(String str) {
        this.kq = str;
    }

    public void oq(String str) {
        this.oq = str;
    }

    public void kq(int i10) {
        this.bob = i10;
    }
}
