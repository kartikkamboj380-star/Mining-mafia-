package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.k4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C4063k4 implements InterfaceC3687h4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f30683a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f30684b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f30685c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f30686d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final long f30687e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final long f30688f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final long[] f30689g;

    private C4063k4(long j10, int i10, long j11, int i11, long j12, long[] jArr) {
        this.f30683a = j10;
        this.f30684b = i10;
        this.f30685c = j11;
        this.f30686d = i11;
        this.f30687e = j12;
        this.f30689g = jArr;
        this.f30688f = j12 != -1 ? j10 + j12 : -1L;
    }

    public static C4063k4 d(C3937j4 c3937j4, long j10) {
        long jB = c3937j4.b();
        if (jB == -9223372036854775807L) {
            return null;
        }
        C3431f2 c3431f2 = c3937j4.f30288a;
        return new C4063k4(j10, c3431f2.f28132c, jB, c3431f2.f28135f, c3937j4.f30290c, c3937j4.f30293f);
    }

    private final long e(int i10) {
        return (this.f30685c * ((long) i10)) / 100;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4311m2
    public final C4059k2 a(long j10) {
        if (!zzb()) {
            C4437n2 c4437n2 = new C4437n2(0L, this.f30683a + ((long) this.f30684b));
            return new C4059k2(c4437n2, c4437n2);
        }
        long j11 = this.f30685c;
        String str = AbstractC4634ob0.f32117a;
        long jMax = Math.max(0L, Math.min(j10, j11));
        double d10 = (jMax * 100.0d) / j11;
        double d11 = 0.0d;
        if (d10 > 0.0d) {
            if (d10 >= 100.0d) {
                d11 = 256.0d;
            } else {
                int i10 = (int) d10;
                long[] jArr = this.f30689g;
                jArr.getClass();
                double d12 = jArr[i10];
                d11 = d12 + ((d10 - ((double) i10)) * ((i10 == 99 ? 256.0d : jArr[i10 + 1]) - d12));
            }
        }
        long j12 = this.f30687e;
        C4437n2 c4437n3 = new C4437n2(jMax, this.f30683a + Math.max(this.f30684b, Math.min(Math.round((d11 / 256.0d) * j12), j12 - 1)));
        return new C4059k2(c4437n3, c4437n3);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3687h4
    public final long b() {
        return this.f30688f;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3687h4
    public final long c(long j10) {
        if (!zzb()) {
            return 0L;
        }
        long j11 = j10 - this.f30683a;
        if (j11 <= this.f30684b) {
            return 0L;
        }
        long[] jArr = this.f30689g;
        jArr.getClass();
        double d10 = (j11 * 256.0d) / this.f30687e;
        int I9 = AbstractC4634ob0.I(jArr, (long) d10, true, true);
        long jE = e(I9);
        long j12 = jArr[I9];
        int i10 = I9 + 1;
        long jE2 = e(i10);
        long j13 = I9 == 99 ? 256L : jArr[i10];
        return jE + Math.round((j12 == j13 ? 0.0d : (d10 - j12) / (j13 - j12)) * (jE2 - jE));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4311m2
    public final long zza() {
        return this.f30685c;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4311m2
    public final boolean zzb() {
        return this.f30689g != null;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3687h4
    public final int zzg() {
        return this.f30686d;
    }
}
