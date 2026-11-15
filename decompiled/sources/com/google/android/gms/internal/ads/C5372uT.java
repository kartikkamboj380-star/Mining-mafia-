package com.google.android.gms.internal.ads;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.uT, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C5372uT {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f33823a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f33824b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f33825c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f33826d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f33827e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f33828f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final boolean f33829g;

    public C5372uT(String str, String str2, String str3, int i10, String str4, int i11, boolean z9) {
        this.f33823a = str;
        this.f33824b = str2;
        this.f33825c = str3;
        this.f33826d = i10;
        this.f33827e = str4;
        this.f33828f = i11;
        this.f33829g = z9;
    }

    public final JSONObject a() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("adapterClassName", this.f33823a);
        jSONObject.put("version", this.f33825c);
        if (((Boolean) H4.B.c().d(AbstractC3892ii.Na)).booleanValue()) {
            jSONObject.put("sdkVersion", this.f33824b);
        }
        jSONObject.put("status", this.f33826d);
        jSONObject.put("description", this.f33827e);
        jSONObject.put("initializationLatencyMillis", this.f33828f);
        if (((Boolean) H4.B.c().d(AbstractC3892ii.Oa)).booleanValue()) {
            jSONObject.put("supportsInitialization", this.f33829g);
        }
        return jSONObject;
    }
}
