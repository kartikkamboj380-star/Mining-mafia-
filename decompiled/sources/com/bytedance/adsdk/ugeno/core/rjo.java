package com.bytedance.adsdk.ugeno.core;

import android.text.TextUtils;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import com.unity3d.ads.metadata.MediationMetaData;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class rjo {
    private String bob;
    private String csi;
    private float dgq;
    private JSONObject fou;
    private JSONObject kq;
    private JSONObject oq;
    private JSONObject rhi;
    private boolean rjo;
    private float syt;

    public static class kq {
        private JSONObject bob;
        private LinkedList<kq> csi;
        private boolean dgq;
        private JSONObject fou;
        private String kq;
        private boolean nn;
        private String oq;
        private kq rhi;
        private String rjo;
        private String syt;

        public List<kq> csi() {
            return this.csi;
        }

        public JSONObject rhi() {
            return this.fou;
        }

        public String toString() {
            return "UGNode{id='" + this.kq + "', name='" + this.oq + "'}";
        }

        public JSONObject fou() {
            return this.bob;
        }

        public String bob() {
            return this.oq;
        }

        public String oq() {
            return this.rjo;
        }

        public String kq() {
            return this.kq;
        }

        public void oq(boolean z9) {
            this.nn = z9;
        }

        public void kq(String str) {
            this.oq = str;
        }

        public void oq(kq kqVar) {
            if (this.csi == null) {
                this.csi = new LinkedList<>();
            }
            this.csi.addLast(kqVar);
        }

        public void kq(boolean z9) {
            this.dgq = z9;
        }

        public void kq(kq kqVar) {
            if (this.csi == null) {
                this.csi = new LinkedList<>();
            }
            this.csi.add(kqVar);
        }

        public void kq(int i10, kq kqVar) {
            if (this.csi == null) {
                this.csi = new LinkedList<>();
            }
            this.csi.add(i10, kqVar);
        }
    }

    public rjo(JSONObject jSONObject, JSONObject jSONObject2) {
        this(jSONObject, jSONObject2, null);
    }

    private kq csi() {
        if (!fou()) {
            return kq(this.kq, (kq) null);
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("flexDirection", "row");
            jSONObject.put("justifyContent", "flex_start");
            jSONObject.put("alignItems", "flex_start");
            jSONObject.put("clickable", false);
            jSONObject.put("width", "match_parent");
            jSONObject.put("height", "wrap_content");
            float f10 = this.syt;
            if (f10 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                jSONObject.put("width", f10);
            }
            float f11 = this.dgq;
            if (f11 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                jSONObject.put("height", f11);
            }
            JSONObject jSONObject2 = this.fou;
            if (jSONObject2 != null) {
                String strOptString = jSONObject2.optString("xSize");
                if (!TextUtils.isEmpty(strOptString)) {
                    JSONObject jSONObject3 = new JSONObject(strOptString);
                    if (jSONObject3.optInt("width") > 0) {
                        jSONObject.put("width", jSONObject3.optInt("width"));
                    }
                    if (jSONObject3.optInt("height") > 0) {
                        jSONObject.put("height", jSONObject3.optInt("height"));
                    }
                }
            }
        } catch (JSONException unused) {
        }
        kq kqVar = new kq();
        kqVar.oq = "View";
        kqVar.kq = "virtualNode";
        kqVar.bob = jSONObject;
        kqVar.rhi = null;
        kqVar.rjo = this.bob;
        kqVar.syt = this.csi;
        kqVar.kq(kq(this.kq, kqVar));
        return kqVar;
    }

    public List<kq> bob() {
        if (this.oq == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<String> itKeys = this.oq.keys();
        while (itKeys.hasNext()) {
            kq kqVarKq = kq(this.oq.optJSONObject(itKeys.next()), (kq) null);
            if (kqVarKq != null) {
                arrayList.add(kqVarKq);
            }
        }
        return arrayList;
    }

    public boolean fou() {
        return this.rjo;
    }

    public kq kq() {
        return csi();
    }

    public String oq() {
        return this.bob;
    }

    public rjo(JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
        if (jSONObject != null) {
            if (jSONObject.has("body")) {
                this.kq = jSONObject.optJSONObject("body");
            } else {
                this.kq = jSONObject.optJSONObject("main_template");
            }
            this.oq = jSONObject.optJSONObject("sub_templates");
            JSONObject jSONObjectOptJSONObject = jSONObject.has("meta") ? jSONObject.optJSONObject("meta") : jSONObject.optJSONObject("template_info");
            if (jSONObjectOptJSONObject != null) {
                if (jSONObject.has("body")) {
                    this.rjo = true;
                    String strOptString = jSONObjectOptJSONObject.optString("version");
                    this.bob = strOptString;
                    if (TextUtils.isEmpty(strOptString)) {
                        this.bob = "3.0";
                    }
                } else {
                    this.bob = jSONObjectOptJSONObject.optString("sdk_version");
                }
                if (jSONObjectOptJSONObject.has("adType")) {
                    this.csi = jSONObjectOptJSONObject.optString("adType");
                }
            } else if (jSONObject.has("body")) {
                this.bob = "3.0";
                this.rjo = true;
            }
            this.fou = jSONObject2;
            this.rhi = jSONObject3;
        }
    }

    public static boolean fou(kq kqVar) {
        return (kqVar == null || kqVar.bob == null) ? false : true;
    }

    public void kq(float f10, float f11) {
        this.syt = f10;
        this.dgq = f11;
    }

    public boolean oq(kq kqVar) {
        JSONObject jSONObjectFou;
        if (kqVar == null || (jSONObjectFou = kqVar.fou()) == null) {
            return false;
        }
        return TextUtils.equals(jSONObjectFou.optString("height"), "match_parent");
    }

    private kq kq(JSONObject jSONObject, kq kqVar) {
        String strOptString;
        String strOptString2;
        kq kqVarKq;
        if (jSONObject == null) {
            return null;
        }
        if (jSONObject.has(HandleInvocationsFromAdViewer.KEY_AD_TYPE)) {
            strOptString = jSONObject.optString(HandleInvocationsFromAdViewer.KEY_AD_TYPE);
        } else {
            strOptString = jSONObject.optString(MediationMetaData.KEY_NAME);
        }
        String strOptString3 = jSONObject.optString("id");
        JSONObject jSONObject2 = new JSONObject();
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            if (!TextUtils.equals(next, "children")) {
                try {
                    jSONObject2.put(next, jSONObject.opt(next));
                } catch (JSONException unused) {
                }
            }
        }
        kq kqVar2 = new kq();
        kqVar2.kq = strOptString3;
        if (!this.rjo || !TextUtils.equals("Video", strOptString)) {
            kqVar2.oq = strOptString;
        } else {
            kqVar2.oq = strOptString + "V3";
        }
        kqVar2.bob = jSONObject2;
        kqVar2.rhi = kqVar;
        kqVar2.rjo = this.bob;
        kqVar2.syt = this.csi;
        if (jSONObject2.has("i18n")) {
            kqVar2.fou = jSONObject2.optJSONObject("i18n");
        }
        if (TextUtils.equals(strOptString, "CustomComponent")) {
            kq(jSONObject, kqVar2.bob);
        }
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("children");
        if (jSONArrayOptJSONArray != null && jSONArrayOptJSONArray.length() > 0) {
            int i10 = 0;
            for (int i11 = 0; i11 < jSONArrayOptJSONArray.length(); i11++) {
                JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i11);
                if (jSONObject.has(HandleInvocationsFromAdViewer.KEY_AD_TYPE)) {
                    strOptString2 = jSONObject.optString(HandleInvocationsFromAdViewer.KEY_AD_TYPE);
                } else {
                    strOptString2 = jSONObject.optString(MediationMetaData.KEY_NAME);
                }
                String strKq = com.bytedance.adsdk.ugeno.bob.oq.kq(jSONObjectOptJSONObject.optString("id"), this.fou);
                if (TextUtils.equals(strOptString2, "Template")) {
                    JSONObject jSONObject3 = this.oq;
                    if (jSONObject3 != null) {
                        jSONObjectOptJSONObject = jSONObject3.optJSONObject(strKq);
                        kqVarKq = kq(jSONObjectOptJSONObject, kqVar2);
                    } else {
                        kqVarKq = null;
                    }
                } else {
                    kqVarKq = kq(jSONObjectOptJSONObject, kqVar2);
                }
                if (kqVarKq != null) {
                    kqVarKq.oq(oq(kqVarKq));
                    kqVarKq.kq(kq(kqVarKq));
                }
                if (bob(kqVarKq)) {
                    i10++;
                    kqVar2.oq(kqVarKq);
                } else if (kqVarKq != null) {
                    kqVar2.kq(i11 - i10, kqVarKq);
                }
            }
        }
        return kqVar2;
    }

    public boolean bob(kq kqVar) {
        JSONObject jSONObjectFou;
        if (kqVar == null || (jSONObjectFou = kqVar.fou()) == null) {
            return false;
        }
        return TextUtils.equals(jSONObjectFou.optString("position"), "absolute");
    }

    public boolean kq(kq kqVar) {
        JSONObject jSONObjectFou;
        if (kqVar == null || (jSONObjectFou = kqVar.fou()) == null) {
            return false;
        }
        return TextUtils.equals(jSONObjectFou.optString("width"), "match_parent");
    }

    private void kq(JSONObject jSONObject, JSONObject jSONObject2) {
        if (this.rhi == null || jSONObject2 == null) {
            return;
        }
        try {
            String strOptString = this.rhi.optString(jSONObject2.optString("targetId"));
            if (TextUtils.isEmpty(strOptString)) {
                return;
            }
            JSONObject jSONObject3 = new JSONObject(strOptString);
            JSONObject jSONObjectOptJSONObject = jSONObject2.optJSONObject("targetProps");
            if (jSONObjectOptJSONObject != null) {
                Iterator<String> itKeys = jSONObjectOptJSONObject.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    Object objOpt = jSONObjectOptJSONObject.opt(next);
                    if (TextUtils.equals(next, "events") && jSONObject3.has("events")) {
                        if (objOpt instanceof JSONArray) {
                            com.bytedance.adsdk.ugeno.rjo.oq.kq(jSONObject3.optJSONArray("events"), (JSONArray) objOpt);
                        }
                    } else {
                        jSONObject3.put(next, objOpt);
                    }
                }
                JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("children");
                if (jSONArrayOptJSONArray == null) {
                    jSONArrayOptJSONArray = new JSONArray();
                }
                jSONArrayOptJSONArray.put(jSONObject3);
                if (jSONObject.has("children")) {
                    return;
                }
                jSONObject.put("children", jSONArrayOptJSONArray);
            }
        } catch (JSONException unused) {
        }
    }
}
