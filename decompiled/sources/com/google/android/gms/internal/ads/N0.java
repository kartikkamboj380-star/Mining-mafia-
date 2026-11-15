package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
final class N0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C5817y0 f20987a;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final C5943z0 f20992f;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private long f20997k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final W f20998l;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C5565w0 f20988b = new C5565w0();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final C4074k90 f20989c = new C4074k90(10);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final C4074k90 f20990d = new C4074k90(10);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final C2863aW f20991e = new C2863aW(16);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private long f20993g = -9223372036854775807L;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private C3152cp f20996j = C3152cp.f27221d;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f20994h = -9223372036854775807L;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private long f20995i = -9223372036854775807L;

    public N0(W w10, C5817y0 c5817y0, C5943z0 c5943z0) {
        this.f20998l = w10;
        this.f20987a = c5817y0;
        this.f20992f = c5943z0;
    }

    private static Object h(C4074k90 c4074k90) {
        AbstractC2418Ss0.a(c4074k90.c() > 0);
        while (c4074k90.c() > 1) {
            c4074k90.d();
        }
        Object objD = c4074k90.d();
        objD.getClass();
        return objD;
    }

    public final void a() {
        this.f20991e.e();
        this.f20993g = -9223372036854775807L;
        this.f20994h = -9223372036854775807L;
        this.f20995i = -9223372036854775807L;
        C4074k90 c4074k90 = this.f20990d;
        if (c4074k90.c() > 0) {
            this.f20997k = ((Long) h(c4074k90)).longValue();
        }
        C4074k90 c4074k91 = this.f20989c;
        if (c4074k91.c() > 0) {
            c4074k91.a(0L, (C3152cp) h(c4074k91));
        }
    }

    public final void b(long j10, long j11) {
        while (true) {
            C2863aW c2863aW = this.f20991e;
            if (c2863aW.d()) {
                return;
            }
            C4074k90 c4074k90 = this.f20990d;
            long jC = c2863aW.c();
            Long l10 = (Long) c4074k90.e(jC);
            if (l10 != null && l10.longValue() != this.f20997k) {
                this.f20997k = l10.longValue();
                this.f20987a.a(2);
            }
            C5817y0 c5817y0 = this.f20987a;
            long j12 = this.f20997k;
            C5565w0 c5565w0 = this.f20988b;
            int iK = c5817y0.k(jC, j10, j11, j12, false, false, c5565w0);
            if (iK != 5 && iK != 4) {
                this.f20992f.a(jC, c5565w0.a());
            }
            if (iK == 0 || iK == 1) {
                this.f20994h = jC;
                long jB = c2863aW.b();
                C3152cp c3152cp = (C3152cp) this.f20989c.e(jB);
                if (c3152cp != null && !c3152cp.equals(C3152cp.f27221d) && !c3152cp.equals(this.f20996j)) {
                    this.f20996j = c3152cp;
                    this.f20998l.a(c3152cp);
                }
                this.f20998l.b(iK == 0 ? System.nanoTime() : c5565w0.b(), jB, c5817y0.f());
            } else if (iK == 2 || iK == 3) {
                this.f20994h = jC;
                c2863aW.b();
                final W w10 = this.f20998l;
                Runnable runnable = new Runnable() { // from class: com.google.android.gms.internal.ads.U
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        w10.f24626b.q().zzc();
                    }
                };
                X x10 = w10.f24626b;
                x10.r().execute(runnable);
                ((InterfaceC3052c1) x10.u().remove()).zzb();
            } else if (iK != 4) {
                return;
            } else {
                this.f20994h = jC;
            }
        }
    }

    public final void c(int i10, int i11) {
        long j10 = this.f20993g;
        this.f20989c.a(j10 == -9223372036854775807L ? 0L : j10 + 1, new C3152cp(i10, i11, 1.0f));
    }

    public final void d(int i10, long j10) {
        if (this.f20991e.d()) {
            this.f20987a.a(i10);
            this.f20997k = j10;
        } else {
            C4074k90 c4074k90 = this.f20990d;
            long j11 = this.f20993g;
            c4074k90.a(j11 == -9223372036854775807L ? -4611686018427387904L : j11 + 1, Long.valueOf(j10));
        }
    }

    public final void e(long j10) {
        this.f20991e.a(j10);
        this.f20993g = j10;
        this.f20995i = -9223372036854775807L;
    }

    public final void f() {
        long j10 = this.f20993g;
        if (j10 == -9223372036854775807L) {
            j10 = Long.MIN_VALUE;
            this.f20993g = Long.MIN_VALUE;
            this.f20994h = Long.MIN_VALUE;
        }
        this.f20995i = j10;
    }

    public final boolean g() {
        long j10 = this.f20995i;
        return j10 != -9223372036854775807L && this.f20994h == j10;
    }
}
