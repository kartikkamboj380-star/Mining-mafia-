package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.qZ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class BinderC4881qZ extends AbstractBinderC4283lp {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C4753pY f32668a;

    /* synthetic */ BinderC4881qZ(C5006rZ c5006rZ, C4753pY c4753pY, byte[] bArr) {
        Objects.requireNonNull(c5006rZ);
        this.f32668a = c4753pY;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4409mp
    public final void i(String str) {
        ((BinderC3120cZ) this.f32668a.f32420c).s6(0, str);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4409mp
    public final void o(H4.Z0 z9) {
        ((BinderC3120cZ) this.f32668a.f32420c).R1(z9);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4409mp
    public final void zze() {
        ((BinderC3120cZ) this.f32668a.f32420c).d();
    }
}
