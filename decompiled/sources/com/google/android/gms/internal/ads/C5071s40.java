package com.google.android.gms.internal.ads;

import android.os.Bundle;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.s40, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5071s40 implements InterfaceC3065c70 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final JSONObject f33079a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final JSONObject f33080b;

    public C5071s40(JSONObject jSONObject, JSONObject jSONObject2) {
        this.f33079a = jSONObject;
        this.f33080b = jSONObject2;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3065c70
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        Bundle bundle = ((AF) obj).f17275a;
        JSONObject jSONObject = this.f33079a;
        if (jSONObject != null) {
            bundle.putString("fwd_cld", jSONObject.toString());
        }
        JSONObject jSONObject2 = this.f33080b;
        if (jSONObject2 != null) {
            bundle.putString("fwd_common_cld", jSONObject2.toString());
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3065c70
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        JSONObject jSONObject = this.f33080b;
        AF af = (AF) obj;
        if (jSONObject != null) {
            af.f17276b.putString("fwd_common_cld", jSONObject.toString());
        }
    }
}
