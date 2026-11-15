package com.bytedance.sdk.openadsdk.core.settings;

import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class kq extends nn {
    public kq() {
        super("tt_set_apm.prop", new nn.kq() { // from class: com.bytedance.sdk.openadsdk.core.settings.kq.1
            @Override // com.bytedance.sdk.openadsdk.core.settings.nn.kq
            public void kq() {
            }

            @Override // com.bytedance.sdk.openadsdk.core.settings.nn.kq
            public void oq() {
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.csi
    public void kq(JSONObject jSONObject) {
        csi.kq kqVarKq = kq();
        if (jSONObject.has("apm_url")) {
            kqVarKq.kq("apm_url", jSONObject.optString("apm_url"));
        }
        if (jSONObject.has("perf_con")) {
            try {
                JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("perf_con");
                if (jSONObjectOptJSONObject != null && jSONObjectOptJSONObject.has("perf_con_apm")) {
                    kqVarKq.kq("perf_con_apm", jSONObjectOptJSONObject.optInt("perf_con_apm"));
                }
            } catch (Exception unused) {
            }
        }
        kqVarKq.kq();
        fou();
    }
}
