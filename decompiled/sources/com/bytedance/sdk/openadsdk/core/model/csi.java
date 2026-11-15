package com.bytedance.sdk.openadsdk.core.model;

import java.util.ArrayList;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class csi {
    private ArrayList<kq> kq;
    private fou oq;

    public static class kq {
        private com.bytedance.sdk.openadsdk.core.vvw.fou bob;
        private Set<com.bytedance.sdk.openadsdk.core.vvw.nn> fou;
        private final String kq;
        private final String oq;

        public kq(JSONObject jSONObject) {
            this.kq = jSONObject.optString("vast_url");
            this.oq = jSONObject.optString("vast_content");
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("videoTrackers");
            if (jSONObjectOptJSONObject != null) {
                com.bytedance.sdk.openadsdk.core.vvw.fou fouVar = new com.bytedance.sdk.openadsdk.core.vvw.fou();
                this.bob = fouVar;
                fouVar.kq(jSONObjectOptJSONObject);
            }
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("viewabilityVendor");
            if (jSONArrayOptJSONArray != null) {
                this.fou = com.bytedance.sdk.openadsdk.core.vvw.nn.kq(jSONArrayOptJSONArray);
            }
        }

        public String bob() {
            return this.kq;
        }

        public JSONObject csi() throws JSONException {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("vast_url", this.kq);
            jSONObject.put("vast_content", this.oq);
            com.bytedance.sdk.openadsdk.core.vvw.fou fouVar = this.bob;
            if (fouVar != null) {
                jSONObject.put("videoTrackers", fouVar.kq());
            }
            if (this.fou != null) {
                JSONArray jSONArray = new JSONArray();
                for (com.bytedance.sdk.openadsdk.core.vvw.nn nnVar : this.fou) {
                    if (nnVar != null) {
                        jSONArray.put(nnVar.fou());
                    }
                }
                jSONObject.put("viewabilityVendor", jSONArray);
            }
            return jSONObject;
        }

        public String fou() {
            return this.oq;
        }

        public com.bytedance.sdk.openadsdk.core.vvw.fou kq() {
            return this.bob;
        }

        public Set<com.bytedance.sdk.openadsdk.core.vvw.nn> oq() {
            return this.fou;
        }

        public void kq(com.bytedance.sdk.openadsdk.core.vvw.fou fouVar) {
            this.bob = fouVar;
        }

        public void kq(Set<com.bytedance.sdk.openadsdk.core.vvw.nn> set) {
            this.fou = set;
        }
    }

    public csi(JSONArray jSONArray) {
        if (jSONArray == null) {
            return;
        }
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            kq kqVar = new kq(jSONArray.optJSONObject(i10));
            if (this.kq == null) {
                this.kq = new ArrayList<>();
            }
            this.kq.add(kqVar);
        }
    }

    public static boolean kq(uml umlVar) {
        if (umlVar == null || umlVar.fgm()) {
            return false;
        }
        int iAin = umlVar.ain();
        int iPcj = umlVar.pcj();
        return (iAin == 3 || iAin == 7 || iAin == 8) && (iPcj == 5 || iPcj == 15 || iPcj == 50);
    }

    public fou bob() {
        if (this.oq == null) {
            this.oq = new fou();
            ArrayList<kq> arrayList = this.kq;
            if (arrayList != null) {
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    kq kqVar = arrayList.get(i10);
                    i10++;
                    kq kqVar2 = kqVar;
                    com.bytedance.sdk.openadsdk.core.vvw.fou fouVarKq = kqVar2.kq();
                    Set<com.bytedance.sdk.openadsdk.core.vvw.nn> setOq = kqVar2.oq();
                    if (fouVarKq != null) {
                        this.oq.kq().kq(fouVarKq);
                    }
                    if (setOq != null) {
                        this.oq.oq().addAll(setOq);
                    }
                }
            }
        }
        return this.oq;
    }

    public boolean fou() {
        ArrayList<kq> arrayList = this.kq;
        return (arrayList == null || arrayList.isEmpty()) ? false : true;
    }

    public JSONArray oq() {
        JSONArray jSONArray = new JSONArray();
        ArrayList<kq> arrayList = this.kq;
        if (arrayList != null) {
            try {
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    kq kqVar = arrayList.get(i10);
                    i10++;
                    jSONArray.put(kqVar.csi());
                }
            } catch (Exception unused) {
            }
        }
        return jSONArray;
    }

    public ArrayList<kq> kq() {
        return this.kq;
    }
}
