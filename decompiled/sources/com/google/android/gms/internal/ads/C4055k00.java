package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.k00, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C4055k00 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private C2799a00 f30664a;

    C4055k00() {
    }

    public static C4055k00 a(C2799a00 c2799a00) {
        return new C4055k00(c2799a00);
    }

    public final C2799a00 b(Clock clock, C3050c00 c3050c00, C5004rY c5004rY, C3636gf0 c3636gf0) {
        C2799a00 c2799a00 = this.f30664a;
        return c2799a00 != null ? c2799a00 : new C2799a00(clock, c3050c00, c5004rY, c3636gf0);
    }

    private C4055k00(C2799a00 c2799a00) {
        this.f30664a = c2799a00;
    }
}
