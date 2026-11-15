package com.bytedance.sdk.openadsdk.ou.oq;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class kq {
    private final float bob;
    private final int kq;
    private final int oq;

    public kq(int i10, int i11, float f10) {
        this.kq = i10;
        this.oq = i11;
        this.bob = f10;
    }

    public static JSONObject kq(kq kqVar) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("width", kqVar.kq);
        jSONObject.put("height", kqVar.oq);
        jSONObject.put("alpha", kqVar.bob);
        return jSONObject;
    }
}
