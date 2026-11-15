package com.google.android.gms.internal.ads;

import H4.C0654z;
import K4.AbstractC0786o0;
import android.os.Bundle;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.j80, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C3946j80 implements InterfaceC3065c70 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Bundle f30318a;

    public C3946j80(Bundle bundle) {
        this.f30318a = bundle;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3065c70
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        JSONObject jSONObject = (JSONObject) obj;
        Bundle bundle = this.f30318a;
        if (bundle != null) {
            try {
                K4.S.h(K4.S.h(jSONObject, "device"), "play_store").put("parental_controls", C0654z.a().v(bundle));
            } catch (JSONException unused) {
                AbstractC0786o0.k("Failed putting parental controls bundle.");
            }
        }
    }
}
