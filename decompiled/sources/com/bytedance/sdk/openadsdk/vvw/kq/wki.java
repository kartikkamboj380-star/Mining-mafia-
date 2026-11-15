package com.bytedance.sdk.openadsdk.vvw.kq;

import java.lang.ref.WeakReference;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class wki extends com.bytedance.sdk.component.kq.fou<JSONObject, JSONObject> {
    private WeakReference<com.bytedance.sdk.component.dgq.rhi> kq;

    public wki(com.bytedance.sdk.component.dgq.rhi rhiVar) {
        this.kq = new WeakReference<>(rhiVar);
    }

    public static void kq(com.bytedance.sdk.component.kq.nze nzeVar, com.bytedance.sdk.component.dgq.rhi rhiVar) {
        nzeVar.kq("preventTouchEvent", new wki(rhiVar));
    }

    @Override // com.bytedance.sdk.component.kq.fou
    public JSONObject kq(String str, JSONObject jSONObject, com.bytedance.sdk.component.kq.csi csiVar) throws JSONException {
        JSONObject jSONObject2 = new JSONObject();
        try {
            boolean zOptBoolean = jSONObject.optBoolean("isPrevent", false);
            com.bytedance.sdk.component.dgq.rhi rhiVar = this.kq.get();
            if (rhiVar != null) {
                rhiVar.setIsPreventTouchEvent(zOptBoolean);
                jSONObject2.put("success", true);
                return jSONObject2;
            }
            jSONObject2.put("success", false);
            return jSONObject2;
        } catch (Throwable unused) {
            jSONObject2.put("success", false);
            return jSONObject2;
        }
    }
}
