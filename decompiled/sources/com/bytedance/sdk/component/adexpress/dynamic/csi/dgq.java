package com.bytedance.sdk.component.adexpress.dynamic.csi;

import com.unity3d.services.core.device.reader.JsonStorageKeyNames;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class dgq {
    public static void kq(String str, JSONObject jSONObject) {
        JSONObject jSONObjectFm = com.bytedance.sdk.component.adexpress.oq.fm(str);
        if (jSONObjectFm == null) {
            return;
        }
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        JSONObject jSONObjectOptJSONObject = jSONObjectFm.optJSONObject("values");
        if (jSONObjectOptJSONObject == null) {
            return;
        }
        kq(jSONObjectOptJSONObject, jSONObject);
    }

    public static String oq(String str, String str2) {
        if (!com.bytedance.sdk.component.adexpress.fou.oq()) {
            return kq.kq(str);
        }
        if (str.indexOf(46) < 0) {
            str = str + ".png";
        }
        return str2 + "static/images/" + str;
    }

    public static JSONObject kq(String str, JSONObject jSONObject, JSONObject jSONObject2) {
        JSONObject jSONObjectFm = com.bytedance.sdk.component.adexpress.oq.fm(str);
        if (jSONObjectFm == null) {
            return null;
        }
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        return kq(jSONObject2, jSONObjectFm.optJSONObject("themeValues"), jSONObject);
    }

    private static void kq(JSONObject jSONObject, JSONObject jSONObject2) {
        if (jSONObject2 == null) {
            jSONObject2 = new JSONObject();
        }
        if (jSONObject == null) {
            return;
        }
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            if (!jSONObject2.has(next)) {
                try {
                    jSONObject2.put(next, jSONObject.opt(next));
                } catch (JSONException unused) {
                }
            }
        }
    }

    public static JSONObject kq(JSONObject... jSONObjectArr) {
        JSONObject jSONObject = new JSONObject();
        for (JSONObject jSONObject2 : jSONObjectArr) {
            if (jSONObject2 != null) {
                Iterator<String> itKeys = jSONObject2.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    try {
                        jSONObject.put(next, jSONObject2.opt(next));
                    } catch (JSONException unused) {
                    }
                }
            }
        }
        return jSONObject;
    }

    public static String kq(String str) {
        JSONObject jSONObjectOptJSONObject;
        JSONObject jSONObjectFm = com.bytedance.sdk.component.adexpress.oq.fm(str);
        if (jSONObjectFm == null || (jSONObjectOptJSONObject = jSONObjectFm.optJSONObject("values")) == null) {
            return null;
        }
        return jSONObjectOptJSONObject.optString(JsonStorageKeyNames.DATA_KEY);
    }

    public static String kq(String str, String str2) {
        JSONObject jSONObjectOptJSONObject;
        JSONObject jSONObjectFm = com.bytedance.sdk.component.adexpress.oq.fm(str);
        if (jSONObjectFm == null || (jSONObjectOptJSONObject = jSONObjectFm.optJSONObject("values")) == null) {
            return null;
        }
        return jSONObjectOptJSONObject.optString(str2);
    }

    public static JSONObject kq(JSONArray jSONArray) {
        JSONObject jSONObjectOptJSONObject;
        if (jSONArray == null || jSONArray.length() <= 0 || (jSONObjectOptJSONObject = jSONArray.optJSONObject(0)) == null) {
            return null;
        }
        return jSONObjectOptJSONObject.optJSONObject("values");
    }
}
