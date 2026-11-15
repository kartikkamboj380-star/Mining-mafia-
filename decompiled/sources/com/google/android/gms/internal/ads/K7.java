package com.google.android.gms.internal.ads;

import java.math.RoundingMode;

/* JADX INFO: loaded from: classes2.dex */
final class K7 implements InterfaceC4311m2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final H7 f20101a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f20102b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f20103c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f20104d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final long f20105e;

    public K7(H7 h10, int i10, long j10, long j11) {
        this.f20101a = h10;
        this.f20102b = i10;
        this.f20103c = j10;
        long j12 = (j11 - j10) / ((long) h10.f19222d);
        this.f20104d = j12;
        this.f20105e = d(j12);
    }

    private final long d(long j10) {
        return AbstractC4634ob0.P(j10 * ((long) this.f20102b), 1000000L, this.f20101a.f19221c, RoundingMode.DOWN);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4311m2
    public final C4059k2 a(long j10) {
        long j11 = this.f20102b;
        H7 h10 = this.f20101a;
        long j12 = (((long) h10.f19221c) * j10) / (j11 * 1000000);
        String str = AbstractC4634ob0.f32117a;
        long j13 = this.f20104d - 1;
        long jMax = Math.max(0L, Math.min(j12, j13));
        long j14 = h10.f19222d;
        long jD = d(jMax);
        long j15 = this.f20103c;
        C4437n2 c4437n2 = new C4437n2(jD, (jMax * j14) + j15);
        if (jD >= j10 || jMax == j13) {
            return new C4059k2(c4437n2, c4437n2);
        }
        long j16 = jMax + 1;
        return new C4059k2(c4437n2, new C4437n2(d(j16), j15 + (j14 * j16)));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4311m2
    public final long zza() {
        return this.f20105e;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4311m2
    public final boolean zzb() {
        return true;
    }
}
