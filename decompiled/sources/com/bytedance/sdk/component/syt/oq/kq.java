package com.bytedance.sdk.component.syt.oq;

import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class kq {
    public int bob;
    public int fou;
    public int kq;
    public int oq;

    public kq(int i10, int i11, int i12, int i13) {
        this.kq = i10;
        this.oq = i11;
        this.bob = i12;
        this.fou = i13;
    }

    public JSONObject kq() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("sdk_thread_num", this.kq);
            jSONObject.put("sdk_max_thread_num", this.oq);
            jSONObject.put("app_thread_num", this.bob);
            jSONObject.put("app_max_thread_num", this.fou);
        } catch (Throwable unused) {
        }
        return jSONObject;
    }
}
