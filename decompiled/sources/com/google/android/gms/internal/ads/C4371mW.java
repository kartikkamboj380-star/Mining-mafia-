package com.google.android.gms.internal.ads;

import K4.AbstractC0786o0;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.mW, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class C4371mW implements InterfaceC4386md0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final /* synthetic */ C4371mW f31526a = new C4371mW();

    private /* synthetic */ C4371mW() {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4386md0
    public final /* synthetic */ Object zza(Object obj) {
        JSONObject jSONObject = (JSONObject) obj;
        AbstractC0786o0.k("Ad request signals:");
        AbstractC0786o0.k(jSONObject.toString(2));
        return jSONObject;
    }
}
