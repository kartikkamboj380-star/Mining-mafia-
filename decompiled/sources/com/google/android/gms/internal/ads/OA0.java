package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: loaded from: classes2.dex */
public final class OA0 implements InterfaceC1961Jx0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f21488a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC1961Jx0 f21489b;

    public OA0(Context context) {
        QB0 qb0 = new QB0();
        this.f21488a = context.getApplicationContext();
        this.f21489b = qb0;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1961Jx0
    public final /* bridge */ /* synthetic */ InterfaceC4176ky0 zza() {
        return new C4708pB0(this.f21488a, this.f21489b.zza());
    }
}
