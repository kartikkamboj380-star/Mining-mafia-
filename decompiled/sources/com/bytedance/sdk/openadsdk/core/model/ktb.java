package com.bytedance.sdk.openadsdk.core.model;

import com.unity3d.services.core.device.reader.JsonStorageKeyNames;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class ktb {
    private String bob;
    private JSONObject csi;
    private String fou;
    private String kq;
    private String oq;
    private kq rhi;

    public static class kq {
        private JSONArray bob;
        private JSONArray kq;
        private JSONArray oq;

        public JSONArray bob() {
            return this.bob;
        }

        public JSONObject fou() {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("image", this.kq);
                jSONObject.put("fetch", this.oq);
                jSONObject.put("script", this.bob);
                return jSONObject;
            } catch (JSONException e10) {
                e10.getMessage();
                return jSONObject;
            }
        }

        public JSONArray kq() {
            return this.kq;
        }

        public JSONArray oq() {
            return this.oq;
        }

        public void bob(JSONArray jSONArray) {
            this.bob = jSONArray;
        }

        public void kq(JSONArray jSONArray) {
            this.kq = jSONArray;
        }

        public void oq(JSONArray jSONArray) {
            this.oq = jSONArray;
        }

        public static kq kq(JSONObject jSONObject) {
            if (jSONObject == null) {
                return null;
            }
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("image");
            kq kqVar = new kq();
            kqVar.kq(jSONArrayOptJSONArray);
            kqVar.oq(jSONObject.optJSONArray("fetch"));
            kqVar.bob(jSONObject.optJSONArray("script"));
            return kqVar;
        }
    }

    public String bob() {
        return this.bob;
    }

    public JSONObject csi() {
        return this.csi;
    }

    public String fou() {
        return this.fou;
    }

    public String kq() {
        return this.kq;
    }

    public String oq() {
        return this.oq;
    }

    public kq rhi() {
        return this.rhi;
    }

    public JSONObject rjo() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("id", this.kq);
            jSONObject.put("md5", this.oq);
            jSONObject.put("url", this.bob);
            jSONObject.put(JsonStorageKeyNames.DATA_KEY, this.fou);
            jSONObject.put("custom_components", this.csi);
            kq kqVar = this.rhi;
            if (kqVar != null) {
                jSONObject.put("preload", kqVar.fou());
            }
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    public static ktb kq(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        ktb ktbVar = new ktb();
        ktbVar.kq = jSONObject.optString("id");
        ktbVar.fou = jSONObject.optString(JsonStorageKeyNames.DATA_KEY);
        ktbVar.bob = jSONObject.optString("url");
        ktbVar.oq = jSONObject.optString("md5");
        ktbVar.csi = jSONObject.optJSONObject("custom_components");
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("preload");
        if (jSONObjectOptJSONObject != null) {
            ktbVar.rhi = kq.kq(jSONObjectOptJSONObject);
        }
        return ktbVar;
    }
}
