package com.bytedance.sdk.openadsdk.fou;

import java.text.SimpleDateFormat;
import java.util.Locale;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class rhi extends kq {
    public static final SimpleDateFormat bob = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.US);

    public rhi(String str, JSONObject jSONObject) {
        super(str, jSONObject);
    }

    @Override // com.bytedance.sdk.openadsdk.fou.kq
    public JSONObject bob() {
        return this.oq;
    }
}
