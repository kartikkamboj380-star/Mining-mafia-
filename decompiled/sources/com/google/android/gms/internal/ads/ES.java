package com.google.android.gms.internal.ads;

import K4.AbstractC0786o0;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
final class ES {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Long f18496a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f18497b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f18498c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Integer f18499d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f18500e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Integer f18501f;

    /* synthetic */ ES(String str, byte[] bArr) {
        this.f18497b = str;
    }

    final /* synthetic */ String a() {
        String str = (String) H4.B.c().d(AbstractC3892ii.wb);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.putOpt("objectId", this.f18496a);
            jSONObject.put("eventCategory", this.f18497b);
            jSONObject.putOpt("event", this.f18498c);
            jSONObject.putOpt("errorCode", this.f18499d);
            jSONObject.putOpt("rewardType", this.f18500e);
            jSONObject.putOpt("rewardAmount", this.f18501f);
        } catch (JSONException unused) {
            int i10 = AbstractC0786o0.f2696b;
            L4.p.f("Could not convert parameters to JSON.");
        }
        String string = jSONObject.toString();
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 14 + String.valueOf(string).length() + 2);
        sb.append(str);
        sb.append("(\"h5adsEvent\",");
        sb.append(string);
        sb.append(");");
        return sb.toString();
    }

    final /* synthetic */ void b(Long l10) {
        this.f18496a = l10;
    }

    final /* synthetic */ void c(String str) {
        this.f18498c = str;
    }

    final /* synthetic */ void d(Integer num) {
        this.f18499d = num;
    }

    final /* synthetic */ void e(String str) {
        this.f18500e = str;
    }

    final /* synthetic */ void f(Integer num) {
        this.f18501f = num;
    }
}
