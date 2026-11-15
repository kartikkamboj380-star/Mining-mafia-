package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Wl0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C2612Wl0 implements InterfaceC3294dx0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ C3147cm0 f24865a;

    C2612Wl0(C3147cm0 c3147cm0) {
        Objects.requireNonNull(c3147cm0);
        this.f24865a = c3147cm0;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3294dx0
    public final /* bridge */ /* synthetic */ com.google.common.util.concurrent.p zza(Object obj) {
        InterfaceC2508Ul0 interfaceC2508Ul0 = (InterfaceC2508Ul0) obj;
        if (interfaceC2508Ul0 != null) {
            return AbstractC5685wx0.a(interfaceC2508Ul0);
        }
        C3147cm0 c3147cm0 = this.f24865a;
        c3147cm0.a().b(51);
        return c3147cm0.d(2);
    }
}
