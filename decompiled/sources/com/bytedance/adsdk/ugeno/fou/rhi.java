package com.bytedance.adsdk.ugeno.fou;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class rhi {
    private kq kq;
    private List<kq> oq;

    public static class kq {
        private String bob = "global";
        private Map<String, String> csi;
        private String fou;
        private String kq;
        private String oq;
        private Map<String, Object> rhi;

        public Map<String, String> bob() {
            return this.csi;
        }

        public String csi() {
            return this.oq;
        }

        public String fou() {
            return this.kq;
        }

        public String kq() {
            return this.bob;
        }

        public String oq() {
            return this.fou;
        }

        public String toString() {
            return "Action{scheme='" + this.bob + "', name='" + this.fou + "', params=" + this.csi + ", host='" + this.oq + "', origin='" + this.kq + "', extra=" + this.rhi + '}';
        }

        public void bob(String str) {
            this.kq = str;
        }

        public void fou(String str) {
            this.oq = str;
        }

        public void kq(String str) {
            this.bob = str;
        }

        public void oq(String str) {
            this.fou = str;
        }

        public void kq(Map<String, String> map) {
            this.csi = map;
        }

        public void oq(Map<String, Object> map) {
            this.rhi = map;
        }
    }

    public kq kq() {
        return this.kq;
    }

    public List<kq> oq() {
        return this.oq;
    }

    public static rhi kq(JSONObject jSONObject, JSONObject jSONObject2) {
        if (jSONObject == null) {
            return null;
        }
        rhi rhiVar = new rhi();
        String strOptString = jSONObject.optString("on");
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("handlers");
        rhiVar.kq = vvw.kq(strOptString, jSONObject2);
        if (jSONArrayOptJSONArray == null || jSONArrayOptJSONArray.length() <= 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < jSONArrayOptJSONArray.length(); i10++) {
            kq kqVarKq = vvw.kq(jSONArrayOptJSONArray.optString(i10), jSONObject2);
            if (kqVarKq != null) {
                arrayList.add(kqVarKq);
            }
        }
        rhiVar.oq = arrayList;
        return rhiVar;
    }
}
