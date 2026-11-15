package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Xk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class BinderC2661Xk extends AbstractBinderC1674Ek {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ C2713Yk f25373a;

    /* synthetic */ BinderC2661Xk(C2713Yk c2713Yk, byte[] bArr) {
        Objects.requireNonNull(c2713Yk);
        this.f25373a = c2713Yk;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1726Fk
    public final void L3(InterfaceC5154sk interfaceC5154sk) {
        C2713Yk c2713Yk = this.f25373a;
        c2713Yk.c().e(c2713Yk.e(interfaceC5154sk));
    }
}
