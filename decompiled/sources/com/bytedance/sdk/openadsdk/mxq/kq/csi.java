package com.bytedance.sdk.openadsdk.mxq.kq;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class csi {
    public static void kq(final String str, final String str2, final int i10, final String str3) {
        com.bytedance.sdk.openadsdk.mxq.bob.kq(str, false, 10, new com.bytedance.sdk.openadsdk.mxq.oq() { // from class: com.bytedance.sdk.openadsdk.mxq.kq.csi.1
            @Override // com.bytedance.sdk.openadsdk.mxq.oq
            public bob kq() throws JSONException {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("url", str2);
                jSONObject.put("error_code", i10);
                jSONObject.put("error_msg", str3);
                return fou.oq().kq(str).oq(jSONObject.toString());
            }
        });
    }
}
