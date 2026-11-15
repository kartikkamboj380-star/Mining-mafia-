package com.google.android.gms.internal.ads;

import android.view.View;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class VY extends AbstractBinderC3906ip {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C4753pY f24310a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ WY f24311b;

    /* synthetic */ VY(WY wy, C4753pY c4753pY, byte[] bArr) {
        Objects.requireNonNull(wy);
        this.f24311b = wy;
        this.f24310a = c4753pY;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4031jp
    public final void F3(InterfaceC1786Go interfaceC1786Go) {
        this.f24311b.e(interfaceC1786Go);
        ((BinderC3120cZ) this.f24310a.f32420c).d();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4031jp
    public final void I(com.google.android.gms.dynamic.a aVar) {
        this.f24311b.d((View) com.google.android.gms.dynamic.b.h0(aVar));
        ((BinderC3120cZ) this.f24310a.f32420c).d();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4031jp
    public final void i(String str) {
        ((BinderC3120cZ) this.f24310a.f32420c).s6(0, str);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4031jp
    public final void o(H4.Z0 z9) {
        ((BinderC3120cZ) this.f24310a.f32420c).R1(z9);
    }
}
