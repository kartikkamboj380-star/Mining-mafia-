package com.bytedance.adsdk.kq;

import android.text.TextUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class rhi implements dgq {
    @Override // com.bytedance.adsdk.kq.dgq
    /* JADX INFO: renamed from: oq, reason: merged with bridge method [inline-methods] */
    public String kq(JSONObject jSONObject, Object[] objArr) {
        if (objArr == null || objArr.length < 2) {
            return null;
        }
        String strValueOf = String.valueOf(objArr[0]);
        if (TextUtils.isEmpty(strValueOf)) {
            return null;
        }
        try {
            JSONObject jSONObject2 = new JSONObject(strValueOf);
            String strValueOf2 = String.valueOf(objArr[1]);
            if (TextUtils.isEmpty(strValueOf2)) {
                return null;
            }
            Object objKq = com.bytedance.adsdk.kq.oq.kq.kq(strValueOf2).kq(jSONObject2);
            if (!TextUtils.isEmpty(String.valueOf(objKq))) {
                return String.valueOf(objKq);
            }
            if (objArr.length >= 3) {
                return String.valueOf(objArr[2]);
            }
            return null;
        } catch (JSONException unused) {
            return null;
        }
    }
}
