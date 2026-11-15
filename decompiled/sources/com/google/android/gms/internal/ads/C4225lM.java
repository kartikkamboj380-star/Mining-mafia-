package com.google.android.gms.internal.ads;

import org.json.JSONObject;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.lM, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C4225lM implements InterfaceC3732hQ0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C3973jM f31251a;

    private C4225lM(C3973jM c3973jM) {
        this.f31251a = c3973jM;
    }

    public static C4225lM b(C3973jM c3973jM) {
        return new C4225lM(c3973jM);
    }

    public static JSONObject c(C3973jM c3973jM) {
        JSONObject jSONObjectC = c3973jM.c();
        AbstractC4738pQ0.b(jSONObjectC);
        return jSONObjectC;
    }

    public final JSONObject a() {
        return c(this.f31251a);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5493vQ0
    public final /* synthetic */ Object zzb() {
        return c(this.f31251a);
    }
}
