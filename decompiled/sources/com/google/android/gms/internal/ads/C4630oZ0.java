package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.oZ0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C4630oZ0 implements InterfaceC5385uZ0, InterfaceC5259tZ0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C5637wZ0 f32108a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f32109b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final InterfaceC4683p f32110c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private InterfaceC5889yZ0 f32111d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private InterfaceC5385uZ0 f32112e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private InterfaceC5259tZ0 f32113f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private long f32114g = -9223372036854775807L;

    public C4630oZ0(C5637wZ0 c5637wZ0, InterfaceC4683p interfaceC4683p, long j10) {
        this.f32108a = c5637wZ0;
        this.f32110c = interfaceC4683p;
        this.f32109b = j10;
    }

    private final long q(long j10) {
        long j11 = this.f32114g;
        return j11 != -9223372036854775807L ? j11 : j10;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5385uZ0, com.google.android.gms.internal.ads.InterfaceC5063s01
    public final void a(long j10) {
        InterfaceC5385uZ0 interfaceC5385uZ0 = this.f32112e;
        String str = AbstractC4634ob0.f32117a;
        interfaceC5385uZ0.a(j10);
    }

    public final long b() {
        return this.f32109b;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5385uZ0
    public final long c() {
        InterfaceC5385uZ0 interfaceC5385uZ0 = this.f32112e;
        String str = AbstractC4634ob0.f32117a;
        return interfaceC5385uZ0.c();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5385uZ0, com.google.android.gms.internal.ads.InterfaceC5063s01
    public final boolean d(C3233dS0 c3233dS0) {
        InterfaceC5385uZ0 interfaceC5385uZ0 = this.f32112e;
        return interfaceC5385uZ0 != null && interfaceC5385uZ0.d(c3233dS0);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4937r01
    public final /* bridge */ /* synthetic */ void e(InterfaceC5063s01 interfaceC5063s01) {
        InterfaceC5259tZ0 interfaceC5259tZ0 = this.f32113f;
        String str = AbstractC4634ob0.f32117a;
        interfaceC5259tZ0.e(this);
    }

    public final void f(long j10) {
        this.f32114g = j10;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5385uZ0
    public final long g(InterfaceC3299e[] interfaceC3299eArr, boolean[] zArr, InterfaceC4812q01[] interfaceC4812q01Arr, boolean[] zArr2, long j10) {
        long j11 = this.f32114g;
        long j12 = (j11 == -9223372036854775807L || j10 != this.f32109b) ? j10 : j11;
        this.f32114g = -9223372036854775807L;
        InterfaceC5385uZ0 interfaceC5385uZ0 = this.f32112e;
        String str = AbstractC4634ob0.f32117a;
        return interfaceC5385uZ0.g(interfaceC3299eArr, zArr, interfaceC4812q01Arr, zArr2, j12);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5259tZ0
    public final void h(InterfaceC5385uZ0 interfaceC5385uZ0) {
        InterfaceC5259tZ0 interfaceC5259tZ0 = this.f32113f;
        String str = AbstractC4634ob0.f32117a;
        interfaceC5259tZ0.h(this);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5385uZ0
    public final long i(long j10) {
        InterfaceC5385uZ0 interfaceC5385uZ0 = this.f32112e;
        String str = AbstractC4634ob0.f32117a;
        return interfaceC5385uZ0.i(j10);
    }

    public final long j() {
        return this.f32114g;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5385uZ0
    public final void k(InterfaceC5259tZ0 interfaceC5259tZ0, long j10) {
        this.f32113f = interfaceC5259tZ0;
        InterfaceC5385uZ0 interfaceC5385uZ0 = this.f32112e;
        if (interfaceC5385uZ0 != null) {
            interfaceC5385uZ0.k(this, q(this.f32109b));
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5385uZ0
    public final void l(long j10, boolean z9) {
        InterfaceC5385uZ0 interfaceC5385uZ0 = this.f32112e;
        String str = AbstractC4634ob0.f32117a;
        interfaceC5385uZ0.l(j10, false);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5385uZ0
    public final long m(long j10, MS0 ms0) {
        InterfaceC5385uZ0 interfaceC5385uZ0 = this.f32112e;
        String str = AbstractC4634ob0.f32117a;
        return interfaceC5385uZ0.m(j10, ms0);
    }

    public final void n(InterfaceC5889yZ0 interfaceC5889yZ0) {
        AbstractC2418Ss0.i(this.f32111d == null);
        this.f32111d = interfaceC5889yZ0;
    }

    public final void o(C5637wZ0 c5637wZ0) {
        long jQ = q(this.f32109b);
        InterfaceC5889yZ0 interfaceC5889yZ0 = this.f32111d;
        interfaceC5889yZ0.getClass();
        InterfaceC5385uZ0 interfaceC5385uZ0F = interfaceC5889yZ0.f(c5637wZ0, this.f32110c, jQ);
        this.f32112e = interfaceC5385uZ0F;
        if (this.f32113f != null) {
            interfaceC5385uZ0F.k(this, jQ);
        }
    }

    public final void p() {
        InterfaceC5385uZ0 interfaceC5385uZ0 = this.f32112e;
        if (interfaceC5385uZ0 != null) {
            InterfaceC5889yZ0 interfaceC5889yZ0 = this.f32111d;
            interfaceC5889yZ0.getClass();
            interfaceC5889yZ0.j(interfaceC5385uZ0);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5385uZ0
    public final void zzc() {
        InterfaceC5385uZ0 interfaceC5385uZ0 = this.f32112e;
        if (interfaceC5385uZ0 != null) {
            interfaceC5385uZ0.zzc();
            return;
        }
        InterfaceC5889yZ0 interfaceC5889yZ0 = this.f32111d;
        if (interfaceC5889yZ0 != null) {
            interfaceC5889yZ0.g();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5385uZ0
    public final A01 zzd() {
        InterfaceC5385uZ0 interfaceC5385uZ0 = this.f32112e;
        String str = AbstractC4634ob0.f32117a;
        return interfaceC5385uZ0.zzd();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5385uZ0, com.google.android.gms.internal.ads.InterfaceC5063s01
    public final long zzi() {
        InterfaceC5385uZ0 interfaceC5385uZ0 = this.f32112e;
        String str = AbstractC4634ob0.f32117a;
        return interfaceC5385uZ0.zzi();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5385uZ0, com.google.android.gms.internal.ads.InterfaceC5063s01
    public final long zzl() {
        InterfaceC5385uZ0 interfaceC5385uZ0 = this.f32112e;
        String str = AbstractC4634ob0.f32117a;
        return interfaceC5385uZ0.zzl();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5385uZ0, com.google.android.gms.internal.ads.InterfaceC5063s01
    public final boolean zzn() {
        InterfaceC5385uZ0 interfaceC5385uZ0 = this.f32112e;
        return interfaceC5385uZ0 != null && interfaceC5385uZ0.zzn();
    }
}
