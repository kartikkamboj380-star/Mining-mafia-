package com.bytedance.adsdk.kq.oq.oq.kq;

import android.text.TextUtils;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class jhe implements com.bytedance.adsdk.kq.oq.oq.kq {
    private final String kq;

    public jhe(String str) {
        this.kq = str;
    }

    @Override // com.bytedance.adsdk.kq.oq.oq.kq
    public Object kq(Map<String, JSONObject> map) {
        Object objKq;
        if (map == null || map.size() <= 0 || (objKq = kq(this.kq, map.get("default_key"))) == JSONObject.NULL) {
            return null;
        }
        return objKq;
    }

    @Override // com.bytedance.adsdk.kq.oq.oq.kq
    public String oq() {
        return this.kq;
    }

    public String toString() {
        return "VariableNode [literals=" + this.kq + "]";
    }

    @Override // com.bytedance.adsdk.kq.oq.oq.kq
    public com.bytedance.adsdk.kq.oq.fou.csi kq() {
        return com.bytedance.adsdk.kq.oq.fou.rhi.VARIABLE;
    }

    public Object kq(String str, JSONObject jSONObject) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return kq(str.split("\\."), 0, jSONObject);
    }

    private Object kq(String[] strArr, int i10, JSONObject jSONObject) {
        Object objOpt;
        if (strArr != null && strArr.length > 0 && i10 < strArr.length && jSONObject != null) {
            String str = strArr[i10];
            int iIndexOf = str.indexOf("[");
            int iIndexOf2 = str.indexOf("]");
            if (iIndexOf >= 0 && iIndexOf2 >= 0 && iIndexOf <= iIndexOf2) {
                String strSubstring = str.substring(0, iIndexOf);
                try {
                    int i11 = Integer.parseInt(str.substring(iIndexOf + 1, iIndexOf2));
                    Object objOpt2 = jSONObject.opt(strSubstring);
                    objOpt = objOpt2 instanceof JSONArray ? ((JSONArray) objOpt2).opt(i11) : null;
                } catch (NumberFormatException unused) {
                    return null;
                }
            } else {
                objOpt = jSONObject.opt(str);
            }
            if (i10 == strArr.length - 1) {
                return objOpt;
            }
            if (objOpt instanceof String) {
                try {
                    return kq(strArr, i10 + 1, new JSONObject((String) objOpt));
                } catch (JSONException unused2) {
                    return objOpt;
                }
            }
            if (objOpt instanceof JSONObject) {
                return kq(strArr, i10 + 1, (JSONObject) objOpt);
            }
        }
        return null;
    }
}
