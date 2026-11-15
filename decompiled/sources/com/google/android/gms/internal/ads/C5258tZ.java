package com.google.android.gms.internal.ads;

import org.json.JSONObject;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.tZ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5258tZ implements InterfaceC4627oY {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final DQ f33426a;

    public C5258tZ(DQ dq) {
        this.f33426a = dq;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4627oY
    public final C4753pY a(String str, JSONObject jSONObject) {
        return new C4753pY(this.f33426a.a(str, jSONObject), new BinderC3120cZ(), str);
    }
}
