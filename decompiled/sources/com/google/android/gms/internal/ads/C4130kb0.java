package com.google.android.gms.internal.ads;

import android.util.JsonReader;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.kb0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C4130kb0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f30842a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f30843b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final JSONObject f30844c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final JSONObject f30845d;

    C4130kb0(JsonReader jsonReader) {
        JSONObject jSONObjectD = K4.S.d(jsonReader);
        this.f30845d = jSONObjectD;
        this.f30842a = jSONObjectD.optString("ad_html", null);
        this.f30843b = jSONObjectD.optString("ad_base_url", null);
        this.f30844c = jSONObjectD.optJSONObject("ad_json");
    }
}
