package com.bytedance.sdk.openadsdk.fou.oq;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class bob implements oq {
    oq kq;

    @Override // com.bytedance.sdk.openadsdk.fou.oq.oq
    public void kq(JSONObject jSONObject, long j10) throws JSONException {
        oq oqVar = this.kq;
        if (oqVar != null) {
            oqVar.kq(jSONObject, j10);
        }
        if (j10 <= 0) {
            j10 = System.currentTimeMillis();
        }
        jSONObject.put("event_ts", j10);
    }
}
