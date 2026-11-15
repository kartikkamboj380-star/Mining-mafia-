package com.bytedance.adsdk.kq;

import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class suf implements dgq {
    @Override // com.bytedance.adsdk.kq.dgq
    /* JADX INFO: renamed from: oq, reason: merged with bridge method [inline-methods] */
    public String kq(JSONObject jSONObject, Object[] objArr) {
        Object obj;
        if (objArr == null || objArr.length == 0 || (obj = objArr[0]) == null) {
            return null;
        }
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof Number) {
            return obj.toString();
        }
        if (obj instanceof Boolean) {
            return obj.toString();
        }
        return null;
    }
}
