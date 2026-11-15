package com.google.android.gms.internal.ads;

import K4.AbstractC0786o0;
import java.util.Objects;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.En, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C1680En implements InterfaceC2783Zt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ C1784Gn f18564a;

    C1680En(C1784Gn c1784Gn) {
        Objects.requireNonNull(c1784Gn);
        this.f18564a = c1784Gn;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2783Zt
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        AbstractC0786o0.k("Releasing engine reference.");
        this.f18564a.h().h();
    }
}
