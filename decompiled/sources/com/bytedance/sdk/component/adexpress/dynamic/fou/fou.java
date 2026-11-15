package com.bytedance.sdk.component.adexpress.dynamic.fou;

import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class fou {
    public String bob;
    public String fou;
    public List<kq> kq;
    public String oq;

    public static class kq {
        public int kq;
        public JSONObject oq;
    }

    public static fou kq(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        fou fouVar = new fou();
        String strOptString = jSONObject.optString("custom_components");
        ArrayList arrayList = new ArrayList();
        try {
            JSONArray jSONArray = new JSONArray(strOptString);
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i10);
                if (jSONObjectOptJSONObject != null) {
                    kq kqVar = new kq();
                    kqVar.kq = jSONObjectOptJSONObject.optInt("id");
                    kqVar.oq = new JSONObject(jSONObjectOptJSONObject.optString("componentLayout"));
                    arrayList.add(kqVar);
                }
            }
        } catch (JSONException unused) {
        }
        fouVar.kq = arrayList;
        fouVar.oq = jSONObject.optString("diff_data");
        fouVar.bob = jSONObject.optString("style_diff");
        fouVar.fou = jSONObject.optString("tag_diff");
        return fouVar;
    }
}
