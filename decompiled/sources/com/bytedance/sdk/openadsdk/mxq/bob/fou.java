package com.bytedance.sdk.openadsdk.mxq.bob;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class fou {

    public static class kq {
        public final String kq;
        public final JSONObject oq;

        public kq(String str, JSONObject jSONObject) {
            this.kq = str;
            this.oq = jSONObject;
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("device_info");
            if (jSONObjectOptJSONObject != null) {
                try {
                    jSONObjectOptJSONObject.put("gaid", com.bytedance.sdk.openadsdk.fax.kq.oq.kq.kq().oq());
                    jSONObject.put("device_info", jSONObjectOptJSONObject);
                } catch (JSONException unused) {
                }
            }
        }
    }

    public static bob kq() {
        return csi.kq();
    }
}
