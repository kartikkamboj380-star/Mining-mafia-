package com.bytedance.adsdk.kq;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class bob implements com.bytedance.adsdk.ugeno.bob.kq {

    static class kq implements com.bytedance.adsdk.ugeno.bob.kq.InterfaceC0223kq {
        private com.bytedance.adsdk.kq.oq.kq kq;
        private String oq;

        private kq(String str) {
            this.oq = str;
            this.kq = com.bytedance.adsdk.kq.oq.kq.kq(str);
        }

        public static kq kq(String str) {
            return new kq(str);
        }

        @Override // com.bytedance.adsdk.ugeno.bob.kq.InterfaceC0223kq
        public Object kq(JSONObject jSONObject) {
            com.bytedance.adsdk.kq.oq.kq kqVar = this.kq;
            if (kqVar == null) {
                return this.oq;
            }
            Object objKq = kqVar.kq(jSONObject);
            if (objKq instanceof String) {
                return objKq;
            }
            if (objKq instanceof com.bytedance.adsdk.kq.oq.kq.kq) {
                return String.valueOf(mxq.kq((com.bytedance.adsdk.kq.oq.kq.kq) objKq));
            }
            if (objKq == null || !objKq.getClass().isArray()) {
                return String.valueOf(objKq);
            }
            try {
                return new JSONArray(objKq).toString();
            } catch (JSONException unused) {
                return String.valueOf(objKq);
            }
        }
    }

    @Override // com.bytedance.adsdk.ugeno.bob.kq
    public com.bytedance.adsdk.ugeno.bob.kq.InterfaceC0223kq kq(String str) {
        return kq.kq(str);
    }
}
