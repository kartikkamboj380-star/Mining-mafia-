package com.bytedance.sdk.component.adexpress.dynamic.csi;

import android.text.TextUtils;
import com.bytedance.sdk.component.adexpress.oq.wki;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import com.unity3d.services.UnityAdsConstants;
import com.unity3d.services.core.device.MimeTypes;
import com.unity3d.services.core.device.reader.JsonStorageKeyNames;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class rhi {
    private static HashMap<String, String> rjo;
    private com.bytedance.sdk.component.adexpress.dynamic.fou.bob bob;
    private bob csi;
    private kq fou;
    private JSONObject kq;
    private JSONObject oq;
    private com.bytedance.sdk.component.adexpress.dynamic.fou.fou rhi;

    static class kq {
        boolean bob;
        float kq;
        float oq;

        public static kq kq(JSONObject jSONObject) {
            kq kqVar = new kq();
            if (jSONObject != null) {
                kqVar.kq = (float) jSONObject.optDouble("width");
                kqVar.oq = (float) jSONObject.optDouble("height");
                kqVar.bob = jSONObject.optBoolean("isLandscape");
            }
            return kqVar;
        }
    }

    static {
        HashMap<String, String> map = new HashMap<>();
        rjo = map;
        map.put("subtitle", "description");
        rjo.put("source", "source|app.app_name");
        rjo.put("screenshot", "dynamic_creative.screenshot");
    }

    public rhi(JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, JSONObject jSONObject4) {
        this.kq = jSONObject;
        this.oq = jSONObject2;
        this.bob = new com.bytedance.sdk.component.adexpress.dynamic.fou.bob(jSONObject2);
        this.fou = kq.kq(jSONObject3);
        this.rhi = com.bytedance.sdk.component.adexpress.dynamic.fou.fou.kq(jSONObject4);
    }

    private void oq(com.bytedance.sdk.component.adexpress.dynamic.fou.syt sytVar) {
        com.bytedance.sdk.component.adexpress.dynamic.fou.bob bobVar;
        Object objKq;
        Object objKq2;
        Object objKq3;
        Object objKq4;
        if (sytVar == null || (bobVar = this.bob) == null || (objKq = bobVar.kq("image.0.url")) == null) {
            return;
        }
        String strValueOf = String.valueOf(objKq);
        if (TextUtils.isEmpty(strValueOf) || (objKq2 = this.bob.kq("title")) == null) {
            return;
        }
        String strValueOf2 = String.valueOf(objKq2);
        if (TextUtils.isEmpty(strValueOf2) || (objKq3 = this.bob.kq("description")) == null) {
            return;
        }
        String strValueOf3 = String.valueOf(objKq3);
        if (TextUtils.isEmpty(strValueOf3) || (objKq4 = this.bob.kq("icon")) == null) {
            return;
        }
        String strValueOf4 = String.valueOf(objKq4);
        if (TextUtils.isEmpty(strValueOf4)) {
            return;
        }
        Object objKq5 = this.bob.kq("app.app_name");
        Object objKq6 = this.bob.kq("source");
        if (objKq5 == null && objKq6 == null) {
            return;
        }
        if (objKq5 == null) {
            objKq5 = objKq6;
        }
        String strValueOf5 = String.valueOf(objKq5);
        if (TextUtils.isEmpty(strValueOf5)) {
            return;
        }
        sytVar.kq("imageUrl", strValueOf);
        sytVar.kq("title", strValueOf2);
        sytVar.kq("description", strValueOf3);
        sytVar.kq("icon", strValueOf4);
        sytVar.kq("app_name", strValueOf5);
        sytVar.kq(true);
    }

    public com.bytedance.sdk.component.adexpress.dynamic.fou.syt kq(double d10, int i10, double d11, String str, wki wkiVar) {
        JSONObject jSONObject;
        this.bob.kq();
        try {
            jSONObject = new JSONObject(this.rhi.oq);
        } catch (JSONException unused) {
            jSONObject = null;
        }
        com.bytedance.sdk.component.adexpress.dynamic.fou.syt sytVarKq = kq(fou.kq(this.kq, jSONObject), (com.bytedance.sdk.component.adexpress.dynamic.fou.syt) null);
        kq(sytVarKq);
        csi csiVar = new csi(d10, i10, d11, str, wkiVar);
        csi.kq kqVar = new csi.kq();
        kq kqVar2 = this.fou;
        kqVar.kq = kqVar2.kq;
        kqVar.oq = kqVar2.oq;
        kqVar.bob = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        csiVar.kq(kqVar);
        csiVar.kq(sytVarKq, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        csiVar.kq();
        com.bytedance.sdk.component.adexpress.dynamic.fou.oq oqVar = csiVar.kq;
        if (oqVar.fou == 65536.0f) {
            return null;
        }
        return oqVar.rhi;
    }

    private void kq(com.bytedance.sdk.component.adexpress.dynamic.fou.syt sytVar) {
        int iKq;
        if (sytVar == null) {
            return;
        }
        if (com.bytedance.sdk.component.adexpress.kq.kq.kq.kq().bob() != null) {
            iKq = com.bytedance.sdk.component.adexpress.kq.kq.kq.kq().bob().nze();
        } else {
            iKq = com.bytedance.sdk.component.adexpress.fou.rjo.kq(com.bytedance.sdk.component.adexpress.fou.kq());
        }
        int iOq = com.bytedance.sdk.component.adexpress.fou.rjo.oq(com.bytedance.sdk.component.adexpress.fou.kq(), iKq);
        kq kqVar = this.fou;
        float fMin = kqVar.bob ? kqVar.kq : Math.min(kqVar.kq, iOq);
        if (this.fou.oq == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            sytVar.csi(fMin);
            sytVar.nn().csi().nn("auto");
            sytVar.rhi(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        } else {
            sytVar.csi(fMin);
            int iOq2 = com.bytedance.sdk.component.adexpress.fou.rjo.oq(com.bytedance.sdk.component.adexpress.fou.kq(), com.bytedance.sdk.component.adexpress.fou.rjo.oq(com.bytedance.sdk.component.adexpress.fou.kq()));
            kq kqVar2 = this.fou;
            sytVar.rhi(kqVar2.bob ? kqVar2.oq : Math.min(kqVar2.oq, iOq2));
            sytVar.nn().csi().nn("fixed");
        }
    }

    public com.bytedance.sdk.component.adexpress.dynamic.fou.syt kq(JSONObject jSONObject, com.bytedance.sdk.component.adexpress.dynamic.fou.syt sytVar) {
        int length;
        if (jSONObject == null) {
            return null;
        }
        String strOptString = jSONObject.optString(HandleInvocationsFromAdViewer.KEY_AD_TYPE);
        if (TextUtils.equals(strOptString, "custom-component-vessel")) {
            int iOptInt = jSONObject.optInt("componentId");
            if (this.rhi != null) {
                bob bobVar = new bob();
                this.csi = bobVar;
                JSONObject jSONObjectKq = bobVar.kq(this.rhi.kq, iOptInt, jSONObject);
                if (jSONObjectKq != null) {
                    jSONObject = jSONObjectKq;
                }
            }
        }
        com.bytedance.sdk.component.adexpress.dynamic.fou.syt sytVarKq = kq(jSONObject);
        sytVarKq.kq(sytVar);
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("children");
        if (jSONArrayOptJSONArray == null) {
            sytVarKq.kq((List<com.bytedance.sdk.component.adexpress.dynamic.fou.syt>) null);
            return sytVarKq;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (int i10 = 0; i10 < jSONArrayOptJSONArray.length(); i10++) {
            JSONArray jSONArrayOptJSONArray2 = jSONArrayOptJSONArray.optJSONArray(i10);
            if (jSONArrayOptJSONArray2 != null) {
                ArrayList arrayList3 = new ArrayList();
                if (TextUtils.equals(strOptString, "tag-group")) {
                    length = sytVarKq.nn().csi().hn();
                } else {
                    length = jSONArrayOptJSONArray2.length();
                }
                for (int i11 = 0; i11 < length; i11++) {
                    com.bytedance.sdk.component.adexpress.dynamic.fou.syt sytVarKq2 = kq(jSONArrayOptJSONArray2.optJSONObject(i11), sytVarKq);
                    if (com.bytedance.sdk.component.adexpress.fou.oq() && "skip-with-time".equals(sytVarKq.nn().oq()) && !"transparent".equals(sytVarKq.uml()) && !TextUtils.isEmpty(sytVarKq.uml())) {
                        sytVarKq2.bob(sytVarKq.uml());
                    }
                    arrayList.add(sytVarKq2);
                    arrayList3.add(sytVarKq2);
                }
                arrayList2.add(arrayList3);
            }
        }
        if (arrayList.size() > 0) {
            sytVarKq.kq(arrayList);
        }
        if (arrayList2.size() > 0) {
            sytVarKq.oq(arrayList2);
        }
        return sytVarKq;
    }

    public com.bytedance.sdk.component.adexpress.dynamic.fou.syt kq(JSONObject jSONObject) {
        String strKq;
        JSONObject jSONObject2;
        String strOptString = jSONObject.optString(HandleInvocationsFromAdViewer.KEY_AD_TYPE);
        String strOptString2 = jSONObject.optString("id");
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("values");
        dgq.kq(strOptString, jSONObjectOptJSONObject);
        JSONObject jSONObjectKq = dgq.kq(strOptString, dgq.kq(jSONObject.optJSONArray("sceneValues")), jSONObjectOptJSONObject);
        com.bytedance.sdk.component.adexpress.dynamic.fou.syt sytVar = new com.bytedance.sdk.component.adexpress.dynamic.fou.syt();
        if (TextUtils.isEmpty(strOptString2)) {
            sytVar.oq(String.valueOf(sytVar.hashCode()));
        } else {
            sytVar.oq(strOptString2);
        }
        if (jSONObjectOptJSONObject != null) {
            oq(sytVar);
            sytVar.bob((float) jSONObjectOptJSONObject.optDouble("x"));
            sytVar.fou((float) jSONObjectOptJSONObject.optDouble("y"));
            sytVar.csi((float) jSONObjectOptJSONObject.optDouble("width"));
            sytVar.rhi((float) jSONObjectOptJSONObject.optDouble("height"));
            sytVar.rjo(jSONObjectOptJSONObject.optInt("remainWidth"));
            com.bytedance.sdk.component.adexpress.dynamic.fou.csi csiVar = new com.bytedance.sdk.component.adexpress.dynamic.fou.csi();
            csiVar.kq(strOptString);
            csiVar.oq(jSONObjectOptJSONObject.optString(JsonStorageKeyNames.DATA_KEY));
            csiVar.bob(jSONObjectOptJSONObject.optString("dataExtraInfo"));
            com.bytedance.sdk.component.adexpress.dynamic.fou.rhi rhiVarKq = com.bytedance.sdk.component.adexpress.dynamic.fou.rhi.kq(jSONObjectOptJSONObject);
            csiVar.kq(rhiVarKq);
            com.bytedance.sdk.component.adexpress.dynamic.fou.rhi rhiVarKq2 = com.bytedance.sdk.component.adexpress.dynamic.fou.rhi.kq(jSONObjectKq);
            if (rhiVarKq2 == null) {
                csiVar.oq(rhiVarKq);
            } else {
                csiVar.oq(rhiVarKq2);
            }
            kq(rhiVarKq);
            kq(rhiVarKq2);
            if (TextUtils.equals(strOptString, "video-image-budget") && (jSONObject2 = this.oq) != null) {
                kq(csiVar, jSONObject2.optInt("image_mode"));
            }
            String strOq = csiVar.oq();
            com.bytedance.sdk.component.adexpress.dynamic.fou.rhi rhiVarCsi = csiVar.csi();
            if (rjo.containsKey(strOq) && !rhiVarCsi.pms()) {
                rhiVarCsi.fax(rjo.get(strOq));
            }
            if (rhiVarCsi.pms()) {
                strKq = csiVar.bob();
            } else {
                strKq = kq(csiVar.bob());
            }
            if (com.bytedance.sdk.component.adexpress.fou.oq()) {
                if (TextUtils.equals(strOq, "star") || TextUtils.equals(strOq, "text_star")) {
                    strKq = kq("dynamic_creative.score_exact_i18n|");
                }
                if (TextUtils.equals(strOq, "score-count") || TextUtils.equals(strOq, "score-count-type-1") || TextUtils.equals(strOq, "score-count-type-2")) {
                    strKq = kq("dynamic_creative.comment_num_i18n|");
                }
                if ("root".equals(strOq) && rhiVarKq.vt()) {
                    strKq = kq("image.0.url");
                }
            }
            if (!TextUtils.isEmpty(kq()) && (TextUtils.equals("logo-union", strOptString) || TextUtils.equals("logo", strOptString))) {
                csiVar.oq(strKq + "adx:" + kq());
            } else {
                csiVar.oq(strKq);
            }
            sytVar.kq(csiVar);
        }
        return sytVar;
    }

    private void kq(com.bytedance.sdk.component.adexpress.dynamic.fou.csi csiVar, int i10) {
        int iLastIndexOf;
        if (i10 != 5 && i10 != 15 && i10 != 50 && i10 != 154) {
            csiVar.kq("image");
            String strKq = dgq.kq("image");
            com.bytedance.sdk.component.adexpress.dynamic.fou.rhi rhiVarCsi = csiVar.csi();
            rhiVarCsi.fax(strKq);
            csiVar.rjo().fax(strKq);
            String strKq2 = dgq.kq("image", "clickArea");
            if (!TextUtils.isEmpty(strKq2)) {
                rhiVarCsi.nze(strKq2);
                csiVar.rjo().nze(strKq2);
            }
            JSONObject jSONObjectWqw = rhiVarCsi.wqw();
            if (jSONObjectWqw != null) {
                rhiVarCsi.uml(jSONObjectWqw.optString("imageLottieTosPath"));
                rhiVarCsi.vvw(jSONObjectWqw.optBoolean("animationsLoop"));
                rhiVarCsi.ebt(jSONObjectWqw.optInt("lottieAppNameMaxLength"));
                rhiVarCsi.rs(jSONObjectWqw.optInt("lottieAdDescMaxLength"));
                rhiVarCsi.ibd(jSONObjectWqw.optInt("lottieAdTitleMaxLength"));
            }
            csiVar.oq(strKq);
            if (strKq != null && (iLastIndexOf = strKq.lastIndexOf(".")) > 0) {
                String strSubstring = strKq.substring(0, iLastIndexOf);
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("width", kq(strSubstring + ".width"));
                    jSONObject.put("height", kq(strSubstring + ".height"));
                } catch (JSONException unused) {
                }
                csiVar.bob(jSONObject.toString());
            }
            rhiVarCsi.ayo();
            return;
        }
        csiVar.kq(MimeTypes.BASE_TYPE_VIDEO);
        String strKq3 = dgq.kq(MimeTypes.BASE_TYPE_VIDEO);
        csiVar.csi().fax(strKq3);
        String strKq4 = dgq.kq(MimeTypes.BASE_TYPE_VIDEO, "clickArea");
        if (!TextUtils.isEmpty(strKq4)) {
            csiVar.csi().nze(strKq4);
            csiVar.rjo().nze(strKq4);
        }
        csiVar.rjo().fax(strKq3);
        csiVar.oq(strKq3);
        csiVar.csi().xb();
    }

    private String kq(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        for (String str2 : str.split("\\|")) {
            if (this.bob.oq(str2)) {
                String strValueOf = String.valueOf(this.bob.kq(str2));
                if (!TextUtils.isEmpty(strValueOf)) {
                    return strValueOf;
                }
            }
        }
        return "";
    }

    private String kq() {
        Object objKq;
        com.bytedance.sdk.component.adexpress.dynamic.fou.bob bobVar = this.bob;
        return (bobVar == null || (objKq = bobVar.kq("adx_name")) == null) ? "" : String.valueOf(objKq);
    }

    private void kq(com.bytedance.sdk.component.adexpress.dynamic.fou.rhi rhiVar) {
        if (rhiVar == null) {
            return;
        }
        String strHa = rhiVar.ha();
        if (com.bytedance.sdk.component.adexpress.fou.oq()) {
            String strBob = com.bytedance.sdk.component.adexpress.fou.rjo.bob(com.bytedance.sdk.component.adexpress.fou.kq());
            if ("zh".equals(strBob)) {
                strBob = "cn";
            }
            if (!TextUtils.isEmpty(strBob) && rhiVar.rhi() != null) {
                String strOptString = rhiVar.rhi().optString(strBob);
                if (!TextUtils.isEmpty(strOptString)) {
                    strHa = strOptString;
                }
            }
        }
        if (TextUtils.isEmpty(strHa)) {
            return;
        }
        int iIndexOf = strHa.indexOf("{{");
        int iIndexOf2 = strHa.indexOf("}}");
        if (iIndexOf >= 0 && iIndexOf2 >= 0 && iIndexOf2 >= iIndexOf) {
            String strKq = kq(strHa.substring(iIndexOf + 2, iIndexOf2));
            StringBuilder sb = new StringBuilder(strHa.substring(0, iIndexOf));
            if (!TextUtils.isEmpty(strKq)) {
                sb.append(strKq);
            }
            sb.append(strHa.substring(iIndexOf2 + 2));
            rhiVar.vvw(sb.toString());
            return;
        }
        rhiVar.vvw(strHa);
    }
}
