package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class ZY0 implements InterfaceC5385uZ0, InterfaceC5259tZ0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC5385uZ0 f26230a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private InterfaceC5259tZ0 f26231b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private YY0[] f26232c = new YY0[0];

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f26233d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    long f26234e;

    public ZY0(InterfaceC5385uZ0 interfaceC5385uZ0, boolean z9, long j10, long j11) {
        this.f26230a = interfaceC5385uZ0;
        this.f26234e = j11;
    }

    private static long j(long j10, long j11, long j12) {
        long jMax = Math.max(j10, j11);
        return j12 != Long.MIN_VALUE ? Math.min(jMax, j12) : jMax;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5385uZ0, com.google.android.gms.internal.ads.InterfaceC5063s01
    public final void a(long j10) {
        this.f26230a.a(j10);
    }

    public final void b(long j10, long j11) {
        this.f26234e = j11;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5385uZ0
    public final long c() {
        if (f()) {
            long j10 = this.f26233d;
            this.f26233d = -9223372036854775807L;
            long jC = c();
            return jC != -9223372036854775807L ? jC : j10;
        }
        long jC2 = this.f26230a.c();
        if (jC2 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return j(jC2, 0L, this.f26234e);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5385uZ0, com.google.android.gms.internal.ads.InterfaceC5063s01
    public final boolean d(C3233dS0 c3233dS0) {
        return this.f26230a.d(c3233dS0);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4937r01
    public final /* bridge */ /* synthetic */ void e(InterfaceC5063s01 interfaceC5063s01) {
        InterfaceC5259tZ0 interfaceC5259tZ0 = this.f26231b;
        interfaceC5259tZ0.getClass();
        interfaceC5259tZ0.e(this);
    }

    final boolean f() {
        return this.f26233d != -9223372036854775807L;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5385uZ0
    public final long g(InterfaceC3299e[] interfaceC3299eArr, boolean[] zArr, InterfaceC4812q01[] interfaceC4812q01Arr, boolean[] zArr2, long j10) {
        int length = interfaceC4812q01Arr.length;
        this.f26232c = new YY0[length];
        InterfaceC4812q01[] interfaceC4812q01Arr2 = new InterfaceC4812q01[length];
        int i10 = 0;
        while (true) {
            InterfaceC4812q01 interfaceC4812q01 = null;
            if (i10 >= interfaceC4812q01Arr.length) {
                break;
            }
            YY0[] yy0Arr = this.f26232c;
            YY0 yy0 = (YY0) interfaceC4812q01Arr[i10];
            yy0Arr[i10] = yy0;
            if (yy0 != null) {
                interfaceC4812q01 = yy0.f25634a;
            }
            interfaceC4812q01Arr2[i10] = interfaceC4812q01;
            i10++;
        }
        long jG = this.f26230a.g(interfaceC3299eArr, zArr, interfaceC4812q01Arr2, zArr2, j10);
        long j11 = j(jG, j10, this.f26234e);
        long j12 = -9223372036854775807L;
        if (f()) {
            if (jG < j10) {
                j12 = j11;
                break;
            }
            if (jG != 0) {
                for (InterfaceC3299e interfaceC3299e : interfaceC3299eArr) {
                    if (interfaceC3299e != null) {
                        JY0 jy0Zzc = interfaceC3299e.zzc();
                        if (!A8.d(jy0Zzc.f19929o, jy0Zzc.f19925k)) {
                            j12 = j11;
                            break;
                        }
                    }
                }
            }
        }
        this.f26233d = j12;
        for (int i11 = 0; i11 < interfaceC4812q01Arr.length; i11++) {
            InterfaceC4812q01 interfaceC4812q02 = interfaceC4812q01Arr2[i11];
            if (interfaceC4812q02 == null) {
                this.f26232c[i11] = null;
            } else {
                YY0[] yy0Arr2 = this.f26232c;
                YY0 yy1 = yy0Arr2[i11];
                if (yy1 == null || yy1.f25634a != interfaceC4812q02) {
                    yy0Arr2[i11] = new YY0(this, interfaceC4812q02);
                }
            }
            interfaceC4812q01Arr[i11] = this.f26232c[i11];
        }
        return j11;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5259tZ0
    public final void h(InterfaceC5385uZ0 interfaceC5385uZ0) {
        InterfaceC5259tZ0 interfaceC5259tZ0 = this.f26231b;
        interfaceC5259tZ0.getClass();
        interfaceC5259tZ0.h(this);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5385uZ0
    public final long i(long j10) {
        this.f26233d = -9223372036854775807L;
        for (YY0 yy0 : this.f26232c) {
            if (yy0 != null) {
                yy0.b();
            }
        }
        return j(this.f26230a.i(j10), 0L, this.f26234e);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5385uZ0
    public final void k(InterfaceC5259tZ0 interfaceC5259tZ0, long j10) {
        this.f26231b = interfaceC5259tZ0;
        this.f26230a.k(this, j10);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5385uZ0
    public final void l(long j10, boolean z9) {
        this.f26230a.l(j10, false);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5385uZ0
    public final long m(long j10, MS0 ms0) {
        if (j10 == 0) {
            return 0L;
        }
        long j11 = ms0.f20839a;
        String str = AbstractC4634ob0.f32117a;
        long jMax = Math.max(0L, Math.min(j11, j10));
        long j12 = ms0.f20840b;
        long j13 = this.f26234e;
        long jMax2 = Math.max(0L, Math.min(j12, j13 == Long.MIN_VALUE ? Long.MAX_VALUE : j13 - j10));
        if (jMax != j11 || jMax2 != j12) {
            ms0 = new MS0(jMax, jMax2);
        }
        return this.f26230a.m(j10, ms0);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5385uZ0
    public final void zzc() {
        this.f26230a.zzc();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5385uZ0
    public final A01 zzd() {
        return this.f26230a.zzd();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5385uZ0, com.google.android.gms.internal.ads.InterfaceC5063s01
    public final long zzi() {
        long jZzi = this.f26230a.zzi();
        if (jZzi != Long.MIN_VALUE) {
            long j10 = this.f26234e;
            if (j10 == Long.MIN_VALUE || jZzi < j10) {
                return jZzi;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5385uZ0, com.google.android.gms.internal.ads.InterfaceC5063s01
    public final long zzl() {
        long jZzl = this.f26230a.zzl();
        if (jZzl != Long.MIN_VALUE) {
            long j10 = this.f26234e;
            if (j10 == Long.MIN_VALUE || jZzl < j10) {
                return jZzl;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5385uZ0, com.google.android.gms.internal.ads.InterfaceC5063s01
    public final boolean zzn() {
        return this.f26230a.zzn();
    }
}
