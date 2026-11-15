package com.google.android.gms.internal.ads;

import K4.AbstractC0786o0;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class N90 implements InterfaceC1899Is0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ R90 f21142a;

    N90(R90 r90) {
        Objects.requireNonNull(r90);
        this.f21142a = r90;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1899Is0
    public final /* bridge */ /* synthetic */ Object apply(Object obj) {
        int i10 = AbstractC0786o0.f2696b;
        L4.p.d("", (FV) obj);
        AbstractC0786o0.k("Failed to get a cache key, reverting to legacy flow.");
        R90 r90 = this.f21142a;
        r90.d(new P90(null, r90.b(), null));
        return r90.c();
    }
}
