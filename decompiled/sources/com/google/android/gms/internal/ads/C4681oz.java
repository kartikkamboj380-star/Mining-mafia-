package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.oz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C4681oz implements XV {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C2325Qy f32229a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C4681oz f32230b = this;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final InterfaceC4864qQ0 f32231c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final InterfaceC4864qQ0 f32232d;

    C4681oz(C2325Qy c2325Qy, Context context) {
        this.f32229a = c2325Qy;
        HW hwB = HW.b(c2325Qy.f22555F0);
        this.f32231c = hwB;
        this.f32232d = C5882yW.a(c2325Qy.f22621i, C3129cd0.a(), AbstractC2014Ky.f20305a, c2325Qy.f22552E0, hwB, c2325Qy.f22558G0, AbstractC1858Hy.f19422a, c2325Qy.f22554F);
    }

    @Override // com.google.android.gms.internal.ads.XV
    public final C3114cW zza() {
        C2325Qy c2325Qy = this.f32229a;
        InterfaceC4864qQ0 interfaceC4864qQ0 = c2325Qy.f22639o;
        C3170cy c3170cyJ = c2325Qy.J();
        return AbstractC3240dW.a(C4049jy.c(c2325Qy.J()), C3884id0.b(), C3129cd0.b(), C3606gQ0.b(this.f32232d), C1546By.c(c3170cyJ), this, (QR) interfaceC4864qQ0.zzb());
    }

    @Override // com.google.android.gms.internal.ads.XV
    public final InterfaceC3365eW zzb() {
        return new C4807pz(this.f32229a, this.f32230b, null);
    }
}
