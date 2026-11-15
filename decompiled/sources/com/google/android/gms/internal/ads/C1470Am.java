package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Am, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C1470Am implements InterfaceC3294dx0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ C5032rm f17402a;

    C1470Am(C1678Em c1678Em, C5032rm c5032rm) {
        this.f17402a = c5032rm;
        Objects.requireNonNull(c1678Em);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3294dx0
    public final /* bridge */ /* synthetic */ com.google.common.util.concurrent.p zza(Object obj) {
        C2575Vt c2575Vt = new C2575Vt();
        ((C5788xm) obj).H1(this.f17402a, new BinderC6040zm(this, c2575Vt));
        return c2575Vt;
    }
}
