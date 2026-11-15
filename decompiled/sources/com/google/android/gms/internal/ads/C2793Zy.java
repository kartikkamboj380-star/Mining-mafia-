package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Zy, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C2793Zy implements InterfaceC5081s90 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C2325Qy f26357a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Context f26358b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f26359c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private H4.m2 f26360d;

    /* synthetic */ C2793Zy(C2325Qy c2325Qy, byte[] bArr) {
        this.f26357a = c2325Qy;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5081s90
    public final /* bridge */ /* synthetic */ InterfaceC5081s90 H(String str) {
        str.getClass();
        this.f26359c = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5081s90
    public final /* bridge */ /* synthetic */ InterfaceC5081s90 a(H4.m2 m2Var) {
        m2Var.getClass();
        this.f26360d = m2Var;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5081s90
    public final /* bridge */ /* synthetic */ InterfaceC5081s90 b(Context context) {
        context.getClass();
        this.f26358b = context;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5081s90
    public final InterfaceC5207t90 zza() {
        AbstractC4738pQ0.c(this.f26358b, Context.class);
        AbstractC4738pQ0.c(this.f26359c, String.class);
        AbstractC4738pQ0.c(this.f26360d, H4.m2.class);
        return new C2921az(this.f26357a, this.f26358b, this.f26359c, this.f26360d);
    }
}
