package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.nz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C4555nz implements WV {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C2325Qy f31909a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Context f31910b;

    /* synthetic */ C4555nz(C2325Qy c2325Qy, byte[] bArr) {
        this.f31909a = c2325Qy;
    }

    @Override // com.google.android.gms.internal.ads.WV
    public final /* bridge */ /* synthetic */ WV h(Context context) {
        this.f31910b = context;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.WV
    public final XV zza() {
        AbstractC4738pQ0.c(this.f31910b, Context.class);
        return new C4681oz(this.f31909a, this.f31910b);
    }
}
