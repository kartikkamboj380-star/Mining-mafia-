package com.google.android.gms.internal.ads;

import java.io.EOFException;
import java.io.InterruptedIOException;

/* JADX INFO: loaded from: classes2.dex */
public final class Q2 implements I1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final P10 f22274a = new P10(4);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C4689p2 f22275b = new C4689p2(-1, -1, "image/avif");

    private final boolean a(J1 j10, int i10) {
        P10 p10 = this.f22274a;
        p10.z(4);
        ((C5946z1) j10).H(p10.H(), 0, 4, false);
        return p10.Y() == ((long) i10);
    }

    @Override // com.google.android.gms.internal.ads.I1
    public final void b() {
    }

    @Override // com.google.android.gms.internal.ads.I1
    public final void d(long j10, long j11) {
        this.f22275b.d(j10, j11);
    }

    @Override // com.google.android.gms.internal.ads.I1
    public final boolean e(J1 j10) throws EOFException, InterruptedIOException {
        ((C5946z1) j10).c(4, false);
        return a(j10, 1718909296) && a(j10, 1635150182);
    }

    @Override // com.google.android.gms.internal.ads.I1
    public final void f(L1 l10) {
        this.f22275b.f(l10);
    }

    @Override // com.google.android.gms.internal.ads.I1
    public final int g(J1 j10, C3933j2 c3933j2) {
        return this.f22275b.g(j10, c3933j2);
    }
}
