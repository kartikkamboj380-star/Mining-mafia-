package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class EZ extends AbstractBinderC4661op {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C4753pY f18521a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ FZ f18522b;

    /* synthetic */ EZ(FZ fz, C4753pY c4753pY, byte[] bArr) {
        Objects.requireNonNull(fz);
        this.f18522b = fz;
        this.f18521a = c4753pY;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4787pp
    public final void d3(InterfaceC2097Mo interfaceC2097Mo) {
        this.f18522b.c(interfaceC2097Mo);
        ((BinderC3120cZ) this.f18521a.f32420c).d();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4787pp
    public final void i(String str) {
        ((BinderC3120cZ) this.f18521a.f32420c).s6(0, str);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4787pp
    public final void o(H4.Z0 z9) {
        ((BinderC3120cZ) this.f18521a.f32420c).R1(z9);
    }
}
