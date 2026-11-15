package com.bytedance.sdk.openadsdk.fou.kq;

import android.text.TextUtils;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class nn implements com.bytedance.sdk.openadsdk.mxq.oq {
    private final com.bytedance.sdk.component.rhi.kq.rhi.fou kq;
    private final boolean oq;

    public nn(boolean z9, com.bytedance.sdk.component.rhi.kq.rhi.fou fouVar) {
        this.kq = fouVar;
        this.oq = z9;
    }

    @Override // com.bytedance.sdk.openadsdk.mxq.oq
    public com.bytedance.sdk.openadsdk.mxq.kq.bob kq() throws JSONException {
        int i10;
        if (this.kq == null) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("success", this.oq);
        jSONObject.put("url", this.kq.oq());
        int iFou = this.kq.fou();
        if (iFou <= 0) {
            iFou = 0;
        }
        jSONObject.put("retry_times", iFou);
        jSONObject.put("ad_id", this.kq.rhi());
        jSONObject.put("track_type", this.kq.csi());
        if (!this.oq) {
            i10 = 4;
        } else if (this.kq.nn()) {
            i10 = 3;
        } else {
            i10 = this.kq.fou() <= 0 ? 1 : 2;
        }
        jSONObject.put("upload_scene", i10);
        String strRjo = this.kq.rjo();
        if (!TextUtils.isEmpty(strRjo)) {
            JSONArray jSONArray = new JSONArray();
            for (String str : strRjo.split(",")) {
                jSONArray.put(str);
            }
            jSONObject.put("error_code", jSONArray);
        }
        String strDgq = this.kq.dgq();
        if (!TextUtils.isEmpty(strDgq)) {
            JSONArray jSONArray2 = new JSONArray();
            for (String str2 : strDgq.split(",")) {
                jSONArray2.put(str2);
            }
            jSONObject.put("error_msg", jSONArray2);
        }
        return com.bytedance.sdk.openadsdk.mxq.kq.fou.oq().kq("track_link_result").oq(jSONObject.toString());
    }
}
