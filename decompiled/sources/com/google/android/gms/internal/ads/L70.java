package com.google.android.gms.internal.ads;

import K4.AbstractC0786o0;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class L70 implements InterfaceC3065c70 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f20386a;

    public L70(String str) {
        this.f20386a = str;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3065c70
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        try {
            ((JSONObject) obj).put("ms", this.f20386a);
        } catch (JSONException e10) {
            AbstractC0786o0.l("Failed putting Ad ID.", e10);
        }
    }
}
