package com.bytedance.adsdk.kq;

import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class syt implements dgq {
    @Override // com.bytedance.adsdk.kq.dgq
    /* JADX INFO: renamed from: oq, reason: merged with bridge method [inline-methods] */
    public Boolean kq(JSONObject jSONObject, Object[] objArr) {
        if (objArr == null || objArr.length <= 0) {
            return Boolean.FALSE;
        }
        try {
            Double.parseDouble(String.valueOf(objArr[0]));
            return Boolean.TRUE;
        } catch (NumberFormatException unused) {
            return Boolean.FALSE;
        }
    }
}
