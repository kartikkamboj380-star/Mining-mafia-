package com.bytedance.sdk.openadsdk.core.model;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class nb {
    private final int bob;
    private final int fou;
    private final int kq;
    private final int oq;

    public nb(JSONObject jSONObject) {
        this.kq = jSONObject.optInt("max_time", 0);
        this.oq = jSONObject.optInt("auto_skip_time", -1);
        this.bob = jSONObject.optInt("show_after_inactivity", 10);
        this.fou = jSONObject.optInt("user_wait_time", 10);
    }

    public int bob() {
        return this.fou;
    }

    public JSONObject fou() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("max_time", this.kq);
            jSONObject.put("auto_skip_time", this.oq);
            jSONObject.put("show_after_inactivity", this.bob);
            jSONObject.put("user_wait_time", this.fou);
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    public int kq() {
        return this.kq;
    }

    public int oq() {
        return this.bob;
    }
}
