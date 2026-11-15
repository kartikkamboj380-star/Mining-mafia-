package com.google.android.gms.internal.ads;

import K4.AbstractC0786o0;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.b80, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2942b80 implements InterfaceC3065c70 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f26735a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f26736b;

    public C2942b80(String str, String str2) {
        this.f26735a = str;
        this.f26736b = str2;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3065c70
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        try {
            JSONObject jSONObjectH = K4.S.h((JSONObject) obj, "pii");
            jSONObjectH.put("doritos", this.f26735a);
            jSONObjectH.put("doritos_v2", this.f26736b);
        } catch (JSONException unused) {
            AbstractC0786o0.k("Failed putting doritos string.");
        }
    }
}
