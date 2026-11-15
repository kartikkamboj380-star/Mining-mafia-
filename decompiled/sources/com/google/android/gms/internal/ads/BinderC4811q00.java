package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.q00, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class BinderC4811q00 extends AbstractBinderC5038rp {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C4753pY f32537a;

    /* synthetic */ BinderC4811q00(C4936r00 c4936r00, C4753pY c4753pY, byte[] bArr) {
        Objects.requireNonNull(c4936r00);
        this.f32537a = c4753pY;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5164sp
    public final void i(String str) {
        ((BinderC3120cZ) this.f32537a.f32420c).s6(0, str);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5164sp
    public final void o(H4.Z0 z9) {
        ((BinderC3120cZ) this.f32537a.f32420c).R1(z9);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5164sp
    public final void zze() {
        ((BinderC3120cZ) this.f32537a.f32420c).d();
    }
}
