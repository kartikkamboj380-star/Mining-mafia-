package com.google.android.gms.internal.ads;

import K4.AbstractC0786o0;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class T70 implements InterfaceC3065c70 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final JSONObject f23447a;

    public T70(JSONObject jSONObject) {
        this.f23447a = jSONObject;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3065c70
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        try {
            ((JSONObject) obj).put("cache_state", this.f23447a);
        } catch (JSONException unused) {
            AbstractC0786o0.k("Unable to get cache_state");
        }
    }
}
