package com.google.android.gms.internal.ads;

import java.io.EOFException;
import java.io.IOException;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.a5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C2809a5 implements InterfaceC3689h5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C3563g5 f26401a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f26402b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f26403c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final AbstractC4191l5 f26404d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f26405e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long f26406f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private long f26407g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f26408h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private long f26409i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private long f26410j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private long f26411k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private long f26412l;

    public C2809a5(AbstractC4191l5 abstractC4191l5, long j10, long j11, long j12, long j13, boolean z9) {
        AbstractC2418Ss0.a(j10 >= 0 && j11 > j10);
        this.f26404d = abstractC4191l5;
        this.f26402b = j10;
        this.f26403c = j11;
        if (j12 == j11 - j10 || z9) {
            this.f26406f = j13;
            this.f26405e = 4;
        } else {
            this.f26405e = 0;
        }
        this.f26401a = new C3563g5();
    }

    final /* synthetic */ long a() {
        return this.f26402b;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3689h5
    public final void b(long j10) {
        long j11 = this.f26406f - 1;
        String str = AbstractC4634ob0.f32117a;
        this.f26408h = Math.max(0L, Math.min(j10, j11));
        this.f26405e = 2;
        this.f26409i = this.f26402b;
        this.f26410j = this.f26403c;
        this.f26411k = 0L;
        this.f26412l = this.f26406f;
    }

    final /* synthetic */ long c() {
        return this.f26403c;
    }

    final /* synthetic */ AbstractC4191l5 d() {
        return this.f26404d;
    }

    /* JADX WARN: Code duplicated, block: B:39:0x00bb A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:40:0x00bc  */
    @Override // com.google.android.gms.internal.ads.InterfaceC3689h5
    public final long e(J1 j10) throws IOException {
        long j11;
        long j12;
        long jMax;
        int i10 = this.f26405e;
        if (i10 == 0) {
            long jZzn = j10.zzn();
            this.f26407g = jZzn;
            this.f26405e = 1;
            long j13 = this.f26403c - 65307;
            if (j13 > jZzn) {
                return j13;
            }
        } else if (i10 != 1) {
            if (i10 == 2) {
                long j14 = this.f26409i;
                long j15 = this.f26410j;
                if (j14 == j15) {
                    jMax = -1;
                    j12 = -1;
                } else {
                    long jZzn2 = j10.zzn();
                    C3563g5 c3563g5 = this.f26401a;
                    if (c3563g5.b(j10, j15)) {
                        c3563g5.c(j10, false);
                        j10.zzl();
                        long j16 = this.f26408h;
                        j11 = 2;
                        long j17 = c3563g5.f28560b;
                        long j18 = j16 - j17;
                        int i11 = c3563g5.f28562d + c3563g5.f28563e;
                        if (j18 < 0 || j18 >= 72000) {
                            if (j18 < 0) {
                                this.f26410j = jZzn2;
                                this.f26412l = j17;
                            } else {
                                this.f26409i = j10.zzn() + ((long) i11);
                                this.f26411k = j17;
                            }
                            long j19 = this.f26410j;
                            long j20 = this.f26409i;
                            long j21 = j19 - j20;
                            if (j21 < 100000) {
                                this.f26410j = j20;
                                j12 = -1;
                                jMax = j20;
                            } else {
                                long jZzn3 = j10.zzn() - (((long) i11) * (j18 <= 0 ? 2L : 1L));
                                j12 = -1;
                                String str = AbstractC4634ob0.f32117a;
                                jMax = Math.max(j20, Math.min(jZzn3 + ((j18 * j21) / (this.f26412l - this.f26411k)), j19 - 1));
                            }
                        } else {
                            jMax = -1;
                            j12 = -1;
                        }
                    } else {
                        jMax = this.f26409i;
                        if (jMax == jZzn2) {
                            throw new IOException("No ogg page can be found.");
                        }
                        j12 = -1;
                    }
                    if (jMax != j12) {
                        return jMax;
                    }
                    this.f26405e = 3;
                }
                j11 = 2;
                if (jMax != j12) {
                    return jMax;
                }
                this.f26405e = 3;
            } else {
                if (i10 != 3) {
                    return -1L;
                }
                j12 = -1;
                j11 = 2;
            }
            while (true) {
                C3563g5 c3563g6 = this.f26401a;
                c3563g6.b(j10, j12);
                c3563g6.c(j10, false);
                if (c3563g6.f28560b > this.f26408h) {
                    j10.zzl();
                    this.f26405e = 4;
                    return -(this.f26411k + j11);
                }
                j10.n(c3563g6.f28562d + c3563g6.f28563e);
                this.f26409i = j10.zzn();
                this.f26411k = c3563g6.f28560b;
                j12 = -1;
            }
        }
        C3563g5 c3563g7 = this.f26401a;
        c3563g7.a();
        if (!c3563g7.b(j10, -1L)) {
            throw new EOFException();
        }
        c3563g7.c(j10, false);
        j10.n(c3563g7.f28562d + c3563g7.f28563e);
        long j22 = c3563g7.f28560b;
        while ((c3563g7.f28559a & 4) != 4 && c3563g7.b(j10, -1L) && j10.zzn() < this.f26403c && c3563g7.c(j10, true) && M1.d(j10, c3563g7.f28562d + c3563g7.f28563e)) {
            j22 = c3563g7.f28560b;
        }
        this.f26406f = j22;
        this.f26405e = 4;
        return this.f26407g;
    }

    final /* synthetic */ long f() {
        return this.f26406f;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3689h5
    public final /* bridge */ /* synthetic */ InterfaceC4311m2 zzc() {
        byte[] bArr = null;
        if (this.f26406f != 0) {
            return new Z4(this, bArr);
        }
        return null;
    }
}
