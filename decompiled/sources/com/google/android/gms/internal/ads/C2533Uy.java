package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Uy, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C2533Uy implements D80 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C2325Qy f24141a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Context f24142b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f24143c;

    /* synthetic */ C2533Uy(C2325Qy c2325Qy, byte[] bArr) {
        this.f24141a = c2325Qy;
    }

    @Override // com.google.android.gms.internal.ads.D80
    public final /* bridge */ /* synthetic */ D80 e(Context context) {
        context.getClass();
        this.f24142b = context;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.D80
    public final /* bridge */ /* synthetic */ D80 j(String str) {
        str.getClass();
        this.f24143c = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.D80
    public final E80 zza() {
        AbstractC4738pQ0.c(this.f24142b, Context.class);
        AbstractC4738pQ0.c(this.f24143c, String.class);
        return new C2585Vy(this.f24141a, this.f24142b, this.f24143c);
    }
}
