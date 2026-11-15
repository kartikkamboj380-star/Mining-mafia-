package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.l5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
abstract class AbstractC4191l5 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private InterfaceC5570w2 f31180b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private L1 f31181c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private InterfaceC3689h5 f31182d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f31183e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long f31184f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private long f31185g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f31186h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f31187i;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private long f31189k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f31190l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f31191m;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C3437f5 f31179a = new C3437f5();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private C3939j5 f31188j = new C3939j5();

    protected void a(boolean z9) {
        int i10;
        if (z9) {
            this.f31188j = new C3939j5();
            this.f31184f = 0L;
            i10 = 0;
        } else {
            i10 = 1;
        }
        this.f31186h = i10;
        this.f31183e = -1L;
        this.f31185g = 0L;
    }

    protected abstract long b(P10 p10);

    protected abstract boolean c(P10 p10, long j10, C3939j5 c3939j5);

    final void d(L1 l10, InterfaceC5570w2 interfaceC5570w2) {
        this.f31181c = l10;
        this.f31180b = interfaceC5570w2;
        a(true);
    }

    final void e(long j10, long j11) {
        this.f31179a.a();
        if (j10 == 0) {
            a(!this.f31190l);
            return;
        }
        if (this.f31186h != 0) {
            long jH = h(j11);
            this.f31183e = jH;
            InterfaceC3689h5 interfaceC3689h5 = this.f31182d;
            String str = AbstractC4634ob0.f32117a;
            interfaceC3689h5.b(jH);
            this.f31186h = 2;
        }
    }

    final int f(J1 j10, C3933j2 c3933j2) {
        this.f31180b.getClass();
        String str = AbstractC4634ob0.f32117a;
        int i10 = this.f31186h;
        if (i10 != 0) {
            if (i10 == 1) {
                j10.n((int) this.f31184f);
                this.f31186h = 2;
                return 0;
            }
            if (i10 != 2) {
                return -1;
            }
            long jE = this.f31182d.e(j10);
            if (jE >= 0) {
                c3933j2.f30283a = jE;
                return 1;
            }
            if (jE < -1) {
                i(-(jE + 2));
            }
            if (!this.f31190l) {
                InterfaceC4311m2 interfaceC4311m2Zzc = this.f31182d.zzc();
                interfaceC4311m2Zzc.getClass();
                this.f31181c.o(interfaceC4311m2Zzc);
                this.f31180b.g(interfaceC4311m2Zzc.zza());
                this.f31190l = true;
            }
            if (this.f31189k <= 0 && !this.f31179a.b(j10)) {
                this.f31186h = 3;
                return -1;
            }
            this.f31189k = 0L;
            P10 p10D = this.f31179a.d();
            long jB = b(p10D);
            if (jB >= 0) {
                long j11 = this.f31185g;
                if (j11 + jB >= this.f31183e) {
                    long jG = g(j11);
                    this.f31180b.b(p10D, p10D.D());
                    this.f31180b.c(jG, 1, p10D.D(), 0, null);
                    this.f31183e = -1L;
                }
            }
            this.f31185g += jB;
            return 0;
        }
        while (true) {
            C3437f5 c3437f5 = this.f31179a;
            if (!c3437f5.b(j10)) {
                this.f31186h = 3;
                return -1;
            }
            long jZzn = j10.zzn();
            long j12 = this.f31184f;
            this.f31189k = jZzn - j12;
            if (!c(c3437f5.d(), j12, this.f31188j)) {
                JY0 jy0 = this.f31188j.f30295a;
                this.f31187i = jy0.f19907H;
                if (!this.f31191m) {
                    this.f31180b.f(jy0);
                    this.f31191m = true;
                }
                InterfaceC3689h5 interfaceC3689h5 = this.f31188j.f30296b;
                if (interfaceC3689h5 != null) {
                    this.f31182d = interfaceC3689h5;
                } else if (j10.zzo() == -1) {
                    this.f31182d = new C4065k5(null);
                } else {
                    C3563g5 c3563g5C = c3437f5.c();
                    this.f31182d = new C2809a5(this, this.f31184f, j10.zzo(), c3563g5C.f28562d + c3563g5C.f28563e, c3563g5C.f28560b, (c3563g5C.f28559a & 4) != 0);
                }
                this.f31186h = 2;
                c3437f5.e();
                return 0;
            }
            this.f31184f = j10.zzn();
        }
    }

    protected final long g(long j10) {
        return (j10 * 1000000) / ((long) this.f31187i);
    }

    protected final long h(long j10) {
        return (((long) this.f31187i) * j10) / 1000000;
    }

    protected void i(long j10) {
        this.f31185g = j10;
    }
}
