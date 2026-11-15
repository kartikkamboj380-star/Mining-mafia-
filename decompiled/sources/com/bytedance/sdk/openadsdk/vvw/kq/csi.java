package com.bytedance.sdk.openadsdk.vvw.kq;

import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class csi extends com.bytedance.sdk.component.kq.fou<JSONObject, JSONObject> {
    private JSONObject kq;

    public csi(JSONObject jSONObject) {
        this.kq = jSONObject;
    }

    public static void kq(com.bytedance.sdk.component.kq.nze nzeVar, JSONObject jSONObject) {
        nzeVar.kq("getData", new csi(jSONObject));
    }

    @Override // com.bytedance.sdk.component.kq.fou
    public JSONObject kq(String str, JSONObject jSONObject, com.bytedance.sdk.component.kq.csi csiVar) {
        return com.bytedance.sdk.openadsdk.core.dgq.kq.oq.kq(this.kq, jSONObject);
    }
}
