package com.google.android.gms.internal.ads;

import K4.AbstractC0786o0;
import java.util.Objects;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Hn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C1836Hn implements InterfaceC2783Zt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ C1784Gn f19393a;

    C1836Hn(C2044Ln c2044Ln, C1784Gn c1784Gn) {
        this.f19393a = c1784Gn;
        Objects.requireNonNull(c2044Ln);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2783Zt
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        AbstractC0786o0.k("Getting a new session for JS Engine.");
        this.f19393a.b(((InterfaceC3651gn) obj).zzl());
    }
}
