package com.bytedance.sdk.openadsdk.core.model;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class nze {
    private final int kq;
    private final int oq;

    public nze(JSONObject jSONObject) {
        this.kq = jSONObject.optInt("auto_click", 0);
        this.oq = jSONObject.optInt("hidden_bar", 0);
    }

    public JSONObject bob() {
        try {
            JSONObject jSONObject = new JSONObject();
            int i10 = this.kq;
            if (i10 == 1) {
                jSONObject.put("auto_click", i10);
            }
            if (this.oq == 1) {
                jSONObject.put("hidden_bar", 1);
            }
            return jSONObject;
        } catch (JSONException unused) {
            return null;
        }
    }

    public int kq() {
        return this.kq;
    }

    public boolean oq() {
        return this.oq == 1;
    }

    public static boolean kq(uml umlVar) {
        if (umlVar == null || !umlVar.bns() || umlVar.md() == null) {
            return false;
        }
        return umlVar.md().oq();
    }
}
