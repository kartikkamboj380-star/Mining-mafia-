package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.lz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C4303lz implements InterfaceC4002ja0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C2325Qy f31395a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Context f31396b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f31397c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private H4.m2 f31398d;

    /* synthetic */ C4303lz(C2325Qy c2325Qy, byte[] bArr) {
        this.f31395a = c2325Qy;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4002ja0
    public final /* bridge */ /* synthetic */ InterfaceC4002ja0 H(String str) {
        str.getClass();
        this.f31397c = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4002ja0
    public final /* bridge */ /* synthetic */ InterfaceC4002ja0 a(H4.m2 m2Var) {
        m2Var.getClass();
        this.f31398d = m2Var;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4002ja0
    public final /* bridge */ /* synthetic */ InterfaceC4002ja0 b(Context context) {
        context.getClass();
        this.f31396b = context;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4002ja0
    public final InterfaceC4128ka0 zza() {
        AbstractC4738pQ0.c(this.f31396b, Context.class);
        AbstractC4738pQ0.c(this.f31397c, String.class);
        AbstractC4738pQ0.c(this.f31398d, H4.m2.class);
        return new C4429mz(this.f31395a, this.f31396b, this.f31397c, this.f31398d);
    }
}
