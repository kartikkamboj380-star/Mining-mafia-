package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.y1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC5820y1 implements InterfaceC4311m2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f35215a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f35216b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f35217c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f35218d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f35219e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final long f35220f;

    public AbstractC5820y1(long j10, long j11, int i10, int i11, boolean z9) {
        long jE;
        this.f35215a = j10;
        this.f35216b = j11;
        this.f35217c = i11 == -1 ? 1 : i11;
        this.f35219e = i10;
        if (j10 == -1) {
            this.f35218d = -1L;
            jE = -9223372036854775807L;
        } else {
            this.f35218d = j10 - j11;
            jE = e(j10, j11, i10);
        }
        this.f35220f = jE;
    }

    private static long e(long j10, long j11, int i10) {
        return (Math.max(0L, j10 - j11) * 8000000) / ((long) i10);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4311m2
    public final C4059k2 a(long j10) {
        long j11 = this.f35218d;
        if (j11 == -1) {
            C4437n2 c4437n2 = new C4437n2(0L, this.f35216b);
            return new C4059k2(c4437n2, c4437n2);
        }
        long j12 = ((long) this.f35219e) * j10;
        long j13 = this.f35217c;
        long jMin = ((j12 / 8000000) / j13) * j13;
        if (j11 != -1) {
            jMin = Math.min(jMin, j11 - j13);
        }
        long jMax = this.f35216b + Math.max(jMin, 0L);
        long jD = d(jMax);
        C4437n2 c4437n3 = new C4437n2(jD, jMax);
        if (j11 != -1 && jD < j10) {
            long j14 = jMax + j13;
            if (j14 < this.f35215a) {
                return new C4059k2(c4437n3, new C4437n2(d(j14), j14));
            }
        }
        return new C4059k2(c4437n3, c4437n3);
    }

    public final long d(long j10) {
        return e(j10, this.f35216b, this.f35219e);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4311m2
    public final long zza() {
        return this.f35220f;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4311m2
    public final boolean zzb() {
        return this.f35218d != -1;
    }
}
