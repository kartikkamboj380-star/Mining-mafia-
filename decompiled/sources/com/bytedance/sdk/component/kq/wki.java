package com.bytedance.sdk.component.kq;

import android.text.TextUtils;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class wki {
    private final Map<String, Object> kq = new ConcurrentHashMap();

    private wki() {
    }

    public static wki kq() {
        return new wki();
    }

    public String oq() {
        JSONObject jSONObject = new JSONObject();
        try {
            for (Map.Entry<String, Object> entry : this.kq.entrySet()) {
                jSONObject.put(entry.getKey(), entry.getValue());
            }
            return jSONObject.toString();
        } catch (JSONException unused) {
            return "";
        }
    }

    public wki kq(String str, Object obj) {
        if (!TextUtils.isEmpty(str) && obj != null) {
            this.kq.put(str, obj);
        }
        return this;
    }
}
