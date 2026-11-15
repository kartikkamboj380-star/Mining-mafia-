package com.bytedance.sdk.openadsdk.core.model;

import android.text.TextUtils;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class ebt {
    private int bob;
    private String fou = "Next Ad";
    private int kq;
    private int oq;

    public String bob() {
        return this.fou;
    }

    public JSONObject csi() {
        JSONObject jSONObject = new JSONObject();
        try {
            int i10 = this.kq;
            if (i10 != -1) {
                jSONObject.put("endcard_show_time", i10);
            }
            jSONObject.put("is_allow_pause", this.oq);
            jSONObject.put("landing_type", this.bob);
            if (!TextUtils.isEmpty(this.fou)) {
                jSONObject.put("endcard_next_ad_text", this.fou);
            }
            return jSONObject;
        } catch (Throwable unused) {
            return null;
        }
    }

    public int fou() {
        return this.kq;
    }

    public int kq() {
        return this.bob;
    }

    public int oq() {
        return this.oq;
    }

    public void bob(int i10) {
        this.kq = i10;
    }

    public void kq(int i10) {
        this.bob = i10;
    }

    public void oq(int i10) {
        this.oq = i10;
    }

    public void kq(String str) {
        this.fou = str;
    }

    public static ebt kq(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        ebt ebtVar = new ebt();
        try {
            int iMax = Math.max(jSONObject.optInt("endcard_show_time", 0), 0);
            int iOptInt = jSONObject.optInt("is_allow_pause", 0);
            int iOptInt2 = jSONObject.optInt("landing_type", 0);
            String strOptString = jSONObject.optString("endcard_next_ad_text", "Next Ad");
            ebtVar.bob(iMax);
            ebtVar.oq(iOptInt);
            ebtVar.kq(strOptString);
            ebtVar.kq(iOptInt2);
        } catch (Throwable unused) {
        }
        return ebtVar;
    }
}
