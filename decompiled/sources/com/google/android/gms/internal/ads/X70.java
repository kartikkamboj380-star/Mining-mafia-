package com.google.android.gms.internal.ads;

import K4.AbstractC0786o0;
import android.content.Context;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
final class X70 implements InterfaceC3191d70 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final JSONObject f25150a;

    X70(Context context) {
        this.f25150a = C4917qr.c(context, L4.a.a());
    }

    final /* synthetic */ void a(JSONObject jSONObject) {
        try {
            jSONObject.put("gms_sdk_env", this.f25150a);
        } catch (JSONException unused) {
            AbstractC0786o0.k("Failed putting version constants.");
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3191d70
    public final com.google.common.util.concurrent.p zza() {
        return ((Boolean) H4.B.c().d(AbstractC3892ii.ud)).booleanValue() ? AbstractC5685wx0.a(V70.f24205a) : AbstractC5685wx0.a(new InterfaceC3065c70() { // from class: com.google.android.gms.internal.ads.W70
            @Override // com.google.android.gms.internal.ads.InterfaceC3065c70
            public final /* synthetic */ void zza(Object obj) {
                this.f24712a.a((JSONObject) obj);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3191d70
    public final int zzb() {
        return 46;
    }
}
