package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.x01, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C5693x01 implements InterfaceC5385uZ0, InterfaceC5259tZ0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC5385uZ0 f34707a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f34708b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private InterfaceC5259tZ0 f34709c;

    public C5693x01(InterfaceC5385uZ0 interfaceC5385uZ0, long j10) {
        this.f34707a = interfaceC5385uZ0;
        this.f34708b = j10;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5385uZ0, com.google.android.gms.internal.ads.InterfaceC5063s01
    public final void a(long j10) {
        this.f34707a.a(j10 - this.f34708b);
    }

    public final InterfaceC5385uZ0 b() {
        return this.f34707a;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5385uZ0
    public final long c() {
        long jC = this.f34707a.c();
        if (jC == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return jC + this.f34708b;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5385uZ0, com.google.android.gms.internal.ads.InterfaceC5063s01
    public final boolean d(C3233dS0 c3233dS0) {
        long j10 = c3233dS0.f27418a;
        long j11 = this.f34708b;
        C3107cS0 c3107cS0A = c3233dS0.a();
        c3107cS0A.a(j10 - j11);
        return this.f34707a.d(c3107cS0A.d());
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4937r01
    public final /* bridge */ /* synthetic */ void e(InterfaceC5063s01 interfaceC5063s01) {
        InterfaceC5259tZ0 interfaceC5259tZ0 = this.f34709c;
        interfaceC5259tZ0.getClass();
        interfaceC5259tZ0.e(this);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5385uZ0
    public final long g(InterfaceC3299e[] interfaceC3299eArr, boolean[] zArr, InterfaceC4812q01[] interfaceC4812q01Arr, boolean[] zArr2, long j10) {
        InterfaceC4812q01[] interfaceC4812q01Arr2 = new InterfaceC4812q01[interfaceC4812q01Arr.length];
        int i10 = 0;
        while (true) {
            InterfaceC4812q01 interfaceC4812q01B = null;
            if (i10 >= interfaceC4812q01Arr.length) {
                break;
            }
            C5567w01 c5567w01 = (C5567w01) interfaceC4812q01Arr[i10];
            if (c5567w01 != null) {
                interfaceC4812q01B = c5567w01.b();
            }
            interfaceC4812q01Arr2[i10] = interfaceC4812q01B;
            i10++;
        }
        InterfaceC5385uZ0 interfaceC5385uZ0 = this.f34707a;
        long j11 = this.f34708b;
        long jG = interfaceC5385uZ0.g(interfaceC3299eArr, zArr, interfaceC4812q01Arr2, zArr2, j10 - j11);
        for (int i11 = 0; i11 < interfaceC4812q01Arr.length; i11++) {
            InterfaceC4812q01 interfaceC4812q01 = interfaceC4812q01Arr2[i11];
            if (interfaceC4812q01 == null) {
                interfaceC4812q01Arr[i11] = null;
            } else {
                InterfaceC4812q01 interfaceC4812q02 = interfaceC4812q01Arr[i11];
                if (interfaceC4812q02 == null || ((C5567w01) interfaceC4812q02).b() != interfaceC4812q01) {
                    interfaceC4812q01Arr[i11] = new C5567w01(interfaceC4812q01, j11);
                }
            }
        }
        return jG + j11;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5259tZ0
    public final void h(InterfaceC5385uZ0 interfaceC5385uZ0) {
        InterfaceC5259tZ0 interfaceC5259tZ0 = this.f34709c;
        interfaceC5259tZ0.getClass();
        interfaceC5259tZ0.h(this);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5385uZ0
    public final long i(long j10) {
        long j11 = this.f34708b;
        return this.f34707a.i(j10 - j11) + j11;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5385uZ0
    public final void k(InterfaceC5259tZ0 interfaceC5259tZ0, long j10) {
        this.f34709c = interfaceC5259tZ0;
        this.f34707a.k(this, j10 - this.f34708b);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5385uZ0
    public final void l(long j10, boolean z9) {
        this.f34707a.l(j10 - this.f34708b, false);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5385uZ0
    public final long m(long j10, MS0 ms0) {
        long j11 = this.f34708b;
        return this.f34707a.m(j10 - j11, ms0) + j11;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5385uZ0
    public final void zzc() {
        this.f34707a.zzc();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5385uZ0
    public final A01 zzd() {
        return this.f34707a.zzd();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5385uZ0, com.google.android.gms.internal.ads.InterfaceC5063s01
    public final long zzi() {
        long jZzi = this.f34707a.zzi();
        if (jZzi == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return jZzi + this.f34708b;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5385uZ0, com.google.android.gms.internal.ads.InterfaceC5063s01
    public final long zzl() {
        long jZzl = this.f34707a.zzl();
        if (jZzl == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return jZzl + this.f34708b;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5385uZ0, com.google.android.gms.internal.ads.InterfaceC5063s01
    public final boolean zzn() {
        return this.f34707a.zzn();
    }
}
