package com.bytedance.sdk.openadsdk.core.model;

import android.text.TextUtils;
import com.unity3d.ads.metadata.MediationMetaData;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class nn {
    private String kq;
    private List<String> oq;

    public nn(String str) {
        this.kq = "";
        this.oq = new ArrayList();
        HashMap<String, Object> map = TextUtils.isEmpty(str) ? new HashMap<>() : kq(str);
        try {
            this.kq = (String) map.get("auto_test_param");
            JSONArray jSONArray = new JSONArray((String) map.get("auto_test_hosts"));
            this.oq = new ArrayList();
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                this.oq.add(jSONArray.optString(i10));
            }
        } catch (Exception e10) {
            com.bytedance.sdk.component.utils.fax.bob("AutoTestModel", e10.getMessage());
        }
    }

    public String kq() {
        return this.kq;
    }

    public List<String> oq() {
        return this.oq;
    }

    private static final HashMap<String, Object> kq(String str) {
        if (TextUtils.isEmpty(str)) {
            return new HashMap<>();
        }
        HashMap<String, Object> map = new HashMap<>();
        try {
            JSONArray jSONArray = new JSONArray(str);
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i10);
                map.put(jSONObjectOptJSONObject.optString(MediationMetaData.KEY_NAME), jSONObjectOptJSONObject.optString("value"));
            }
            return map;
        } catch (Exception unused) {
            return new HashMap<>();
        }
    }
}
