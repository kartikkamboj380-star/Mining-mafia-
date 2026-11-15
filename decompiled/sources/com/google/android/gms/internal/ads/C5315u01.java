package com.google.android.gms.internal.ads;

import android.net.Uri;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.u01, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5315u01 extends AbstractC5270tf {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final Object f33690g = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f33691b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f33692c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f33693d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final C4819q4 f33694e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final N1 f33695f;

    static {
        M01 m01 = new M01();
        m01.a("SinglePeriodTimeline");
        m01.b(Uri.EMPTY);
        m01.c();
    }

    public C5315u01(long j10, long j11, long j12, long j13, long j14, long j15, long j16, boolean z9, boolean z10, boolean z11, Object obj, C4819q4 c4819q4, N1 n10) {
        this.f33691b = j13;
        this.f33692c = j14;
        this.f33693d = z9;
        c4819q4.getClass();
        this.f33694e = c4819q4;
        this.f33695f = n10;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC5270tf
    public final int a() {
        return 1;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC5270tf
    public final C2337Re b(int i10, C2337Re c2337Re, long j10) {
        AbstractC2418Ss0.m(i10, 1, "index");
        boolean z9 = this.f33693d;
        c2337Re.a(C2337Re.f22865o, this.f33694e, null, -9223372036854775807L, -9223372036854775807L, -9223372036854775807L, z9, false, this.f33695f, 0L, this.f33692c, 0, 0, 0L);
        return c2337Re;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC5270tf
    public final int c() {
        return 1;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC5270tf
    public final C4891qe d(int i10, C4891qe c4891qe, boolean z9) {
        AbstractC2418Ss0.m(i10, 1, "index");
        c4891qe.a(null, z9 ? f33690g : null, 0, this.f33691b, 0L, C1480Ar.f17414e, false);
        return c4891qe;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC5270tf
    public final int e(Object obj) {
        return f33690g.equals(obj) ? 0 : -1;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC5270tf
    public final Object f(int i10) {
        AbstractC2418Ss0.m(i10, 1, "index");
        return f33690g;
    }
}
