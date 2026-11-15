package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.rz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C5058rz implements InterfaceC2694Ya0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C2325Qy f33055a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Context f33056b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f33057c;

    /* synthetic */ C5058rz(C2325Qy c2325Qy, byte[] bArr) {
        this.f33055a = c2325Qy;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2694Ya0
    public final /* bridge */ /* synthetic */ InterfaceC2694Ya0 e(Context context) {
        context.getClass();
        this.f33056b = context;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2694Ya0
    public final /* synthetic */ InterfaceC2694Ya0 j(String str) {
        this.f33057c = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2694Ya0
    public final InterfaceC2746Za0 zza() {
        AbstractC4738pQ0.c(this.f33056b, Context.class);
        return new C5184sz(this.f33055a, this.f33056b, this.f33057c);
    }
}
