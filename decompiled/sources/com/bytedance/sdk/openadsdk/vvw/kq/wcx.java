package com.bytedance.sdk.openadsdk.vvw.kq;

import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.core.model.uml;
import com.bytedance.sdk.openadsdk.core.yyl;
import com.unity3d.services.UnityAdsConstants;
import java.util.Arrays;
import java.util.HashSet;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class wcx extends com.bytedance.sdk.component.kq.wcx<JSONObject, JSONObject> {
    public static final HashSet<String> kq = new HashSet<>(Arrays.asList("setStorageItem", "getStorageItem", "removeAllStorage", "removeStorageItem"));
    private uml oq;

    public wcx(uml umlVar) {
        this.oq = umlVar;
    }

    public static void kq(com.bytedance.sdk.component.kq.nze nzeVar, uml umlVar) {
        nzeVar.kq(kq, new wcx(umlVar));
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.bytedance.sdk.component.kq.fou
    public JSONObject kq(String str, JSONObject jSONObject, com.bytedance.sdk.component.kq.csi csiVar) throws JSONException {
        String strNu;
        uml umlVar = this.oq;
        if (umlVar == null || (strNu = umlVar.nu()) == null) {
            return null;
        }
        JSONObject jSONObject2 = new JSONObject();
        str.getClass();
        byte b10 = -1;
        switch (str.hashCode()) {
            case -1166163208:
                if (str.equals("getStorageItem")) {
                    b10 = 0;
                }
                break;
            case 541948222:
                if (str.equals("removeAllStorage")) {
                    b10 = 1;
                }
                break;
            case 1357067884:
                if (str.equals("setStorageItem")) {
                    b10 = 2;
                }
                break;
            case 1498706186:
                if (str.equals("removeStorageItem")) {
                    b10 = 3;
                }
                break;
        }
        String str2 = UnityAdsConstants.OpenMeasurement.OM_PARTNER_VERSION;
        switch (b10) {
            case 0:
                String strOptString = jSONObject.optString("key");
                if (!TextUtils.isEmpty(strOptString) && yyl.kq().oq(strNu, strOptString)) {
                    jSONObject2.put("value", yyl.kq().kq(strNu, strOptString));
                    jSONObject2.put("code", "0");
                    return jSONObject2;
                }
                jSONObject2.put("code", UnityAdsConstants.OpenMeasurement.OM_PARTNER_VERSION);
                return jSONObject2;
            case 1:
                yyl.kq().kq(strNu);
                jSONObject2.put("code", "0");
                return jSONObject2;
            case 2:
                String strOptString2 = jSONObject.optString("key");
                String strOptString3 = jSONObject.optString("value");
                if (strOptString2 != null) {
                    yyl.kq().kq(strNu, strOptString2, strOptString3);
                    jSONObject2.put("code", "0");
                    return jSONObject2;
                }
                jSONObject2.put("code", UnityAdsConstants.OpenMeasurement.OM_PARTNER_VERSION);
                return jSONObject2;
            case 3:
                String strOptString4 = jSONObject.optString("key");
                if (!TextUtils.isEmpty(strOptString4)) {
                    if (yyl.kq().bob(strNu, strOptString4)) {
                        str2 = "0";
                    }
                    jSONObject2.put("code", str2);
                    return jSONObject2;
                }
                jSONObject2.put("code", UnityAdsConstants.OpenMeasurement.OM_PARTNER_VERSION);
                return jSONObject2;
            default:
                return jSONObject2;
        }
    }
}
