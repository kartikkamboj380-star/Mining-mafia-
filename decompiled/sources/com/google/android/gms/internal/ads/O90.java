package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class O90 implements InterfaceC1899Is0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ R90 f21486a;

    O90(R90 r90) {
        Objects.requireNonNull(r90);
        this.f21486a = r90;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1899Is0
    public final /* bridge */ /* synthetic */ Object apply(Object obj) {
        C5420ur c5420ur = (C5420ur) obj;
        P90 p90 = new P90(c5420ur, new C1555Cc0(c5420ur.f33917j), null);
        R90 r90 = this.f21486a;
        r90.d(p90);
        return r90.c();
    }
}
