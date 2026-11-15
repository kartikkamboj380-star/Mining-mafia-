package com.bytedance.sdk.openadsdk.tool;

import com.bytedance.sdk.component.utils.fax;
import com.bytedance.sdk.openadsdk.FilterWord;
import com.unity3d.ads.metadata.MediationMetaData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class kq {
    public static String kq(List<FilterWord> list) {
        if (list == null) {
            return null;
        }
        JSONArray jSONArray = new JSONArray();
        Iterator<FilterWord> it = list.iterator();
        while (it.hasNext()) {
            JSONObject jSONObjectKq = kq(it.next());
            if (jSONObjectKq != null) {
                jSONArray.put(jSONObjectKq);
            }
        }
        return jSONArray.toString();
    }

    public static List<FilterWord> kq(String str) {
        ArrayList arrayList = new ArrayList();
        try {
            JSONArray jSONArray = new JSONArray(str);
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                FilterWord filterWordKq = kq(jSONArray.optJSONObject(i10));
                if (filterWordKq != null && filterWordKq.isValid()) {
                    arrayList.add(filterWordKq);
                }
            }
            return arrayList;
        } catch (JSONException e10) {
            fax.bob("MaterialMetaTools", e10.getMessage());
            return arrayList;
        }
    }

    private static FilterWord kq(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        try {
            FilterWord filterWord = new FilterWord();
            filterWord.setId(jSONObject.optString("id"));
            filterWord.setName(jSONObject.optString(MediationMetaData.KEY_NAME));
            filterWord.setIsSelected(jSONObject.optBoolean("is_selected"));
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("options");
            if (jSONArrayOptJSONArray != null && jSONArrayOptJSONArray.length() > 0) {
                for (int i10 = 0; i10 < jSONArrayOptJSONArray.length(); i10++) {
                    FilterWord filterWordKq = kq(jSONArrayOptJSONArray.optJSONObject(i10));
                    if (filterWordKq != null && filterWordKq.isValid()) {
                        filterWord.addOption(filterWordKq);
                    }
                }
            }
            return filterWord;
        } catch (Throwable unused) {
            return null;
        }
    }

    private static JSONObject kq(FilterWord filterWord) {
        if (filterWord == null) {
            return null;
        }
        try {
            if (filterWord.isValid()) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("id", filterWord.getId());
                jSONObject.put(MediationMetaData.KEY_NAME, filterWord.getName());
                jSONObject.put("is_selected", filterWord.getIsSelected());
                if (filterWord.hasSecondOptions()) {
                    JSONArray jSONArray = new JSONArray();
                    Iterator<FilterWord> it = filterWord.getOptions().iterator();
                    while (it.hasNext()) {
                        jSONArray.put(kq(it.next()));
                    }
                    if (jSONArray.length() > 0) {
                        jSONObject.put("options", jSONArray);
                    }
                }
                return jSONObject;
            }
        } catch (Throwable unused) {
        }
        return null;
    }
}
