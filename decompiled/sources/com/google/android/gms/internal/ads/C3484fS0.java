package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.fS0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C3484fS0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC5385uZ0 f28283a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f28284b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final InterfaceC4812q01[] f28285c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f28286d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f28287e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f28288f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public C3610gS0 f28289g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f28290h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final boolean[] f28291i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final GS0[] f28292j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final AbstractC4179l f28293k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final C5497vS0 f28294l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private C3484fS0 f28295m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private A01 f28296n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private C4305m f28297o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private long f28298p;

    public C3484fS0(GS0[] gs0Arr, long j10, AbstractC4179l abstractC4179l, InterfaceC4683p interfaceC4683p, C5497vS0 c5497vS0, C3610gS0 c3610gS0, C4305m c4305m, long j11) {
        this.f28292j = gs0Arr;
        this.f28298p = j10;
        this.f28293k = abstractC4179l;
        this.f28294l = c5497vS0;
        C5637wZ0 c5637wZ0 = c3610gS0.f28643a;
        this.f28284b = c5637wZ0.f34594a;
        this.f28289g = c3610gS0;
        this.f28296n = A01.f17221d;
        this.f28297o = c4305m;
        this.f28285c = new InterfaceC4812q01[2];
        this.f28291i = new boolean[2];
        long j12 = c3610gS0.f28644b;
        long j13 = c3610gS0.f28646d;
        InterfaceC5385uZ0 interfaceC5385uZ0E = c5497vS0.e(c5637wZ0, interfaceC4683p, j12);
        this.f28283a = j13 != -9223372036854775807L ? new ZY0(interfaceC5385uZ0E, true, 0L, j13) : interfaceC5385uZ0E;
    }

    private final void u() {
        if (!w()) {
            return;
        }
        int i10 = 0;
        while (true) {
            C4305m c4305m = this.f28297o;
            if (i10 >= c4305m.f31400a) {
                return;
            }
            c4305m.a(i10);
            InterfaceC3299e interfaceC3299e = this.f28297o.f31402c[i10];
            i10++;
        }
    }

    private final void v() {
        if (!w()) {
            return;
        }
        int i10 = 0;
        while (true) {
            C4305m c4305m = this.f28297o;
            if (i10 >= c4305m.f31400a) {
                return;
            }
            c4305m.a(i10);
            InterfaceC3299e interfaceC3299e = this.f28297o.f31402c[i10];
            i10++;
        }
    }

    private final boolean w() {
        return this.f28295m == null;
    }

    public final long a() {
        return this.f28298p;
    }

    public final void b(long j10) {
        this.f28298p = j10;
    }

    public final long c() {
        return this.f28289g.f28644b + this.f28298p;
    }

    public final boolean d() {
        if (this.f28287e) {
            return !this.f28288f || this.f28283a.zzi() == Long.MIN_VALUE;
        }
        return false;
    }

    public final boolean e() {
        if (this.f28287e) {
            return d() || f() - this.f28289g.f28644b >= -9223372036854775807L;
        }
        return false;
    }

    public final long f() {
        if (!this.f28287e) {
            return this.f28289g.f28644b;
        }
        long jZzi = this.f28288f ? this.f28283a.zzi() : Long.MIN_VALUE;
        return jZzi == Long.MIN_VALUE ? this.f28289g.f28647e : jZzi;
    }

    public final long g() {
        if (this.f28287e) {
            return this.f28283a.zzl();
        }
        return 0L;
    }

    public final void h(float f10, AbstractC5270tf abstractC5270tf, boolean z9) {
        this.f28287e = true;
        this.f28296n = this.f28283a.zzd();
        C4305m c4305mK = k(f10, abstractC5270tf, z9);
        C3610gS0 c3610gS0 = this.f28289g;
        long jMax = c3610gS0.f28644b;
        long j10 = c3610gS0.f28647e;
        if (j10 != -9223372036854775807L && jMax >= j10) {
            jMax = Math.max(0L, j10 - 1);
        }
        long jL = l(c4305mK, jMax, false);
        long j11 = this.f28298p;
        C3610gS0 c3610gS1 = this.f28289g;
        this.f28298p = j11 + (c3610gS1.f28644b - jL);
        this.f28289g = c3610gS1.a(jL);
    }

    public final void i(long j10) {
        AbstractC2418Ss0.i(w());
        if (this.f28287e) {
            this.f28283a.a(j10 - this.f28298p);
        }
    }

    public final void j(C3233dS0 c3233dS0) {
        AbstractC2418Ss0.i(w());
        this.f28283a.d(c3233dS0);
    }

    public final C4305m k(float f10, AbstractC5270tf abstractC5270tf, boolean z9) {
        A01 a01 = this.f28296n;
        C5637wZ0 c5637wZ0 = this.f28289g.f28643a;
        AbstractC4179l abstractC4179l = this.f28293k;
        GS0[] gs0Arr = this.f28292j;
        C4305m c4305mG = abstractC4179l.g(gs0Arr, a01, c5637wZ0, abstractC5270tf);
        for (int i10 = 0; i10 < c4305mG.f31400a; i10++) {
            boolean z10 = true;
            if (c4305mG.a(i10)) {
                if (c4305mG.f31402c[i10] == null) {
                    gs0Arr[i10].zza();
                    z10 = false;
                }
                AbstractC2418Ss0.i(z10);
            } else {
                AbstractC2418Ss0.i(c4305mG.f31402c[i10] == null);
            }
        }
        for (InterfaceC3299e interfaceC3299e : c4305mG.f31402c) {
        }
        return c4305mG;
    }

    public final long l(C4305m c4305m, long j10, boolean z9) {
        return m(c4305m, j10, false, new boolean[2]);
    }

    public final long m(C4305m c4305m, long j10, boolean z9, boolean[] zArr) {
        GS0[] gs0Arr;
        int i10 = 0;
        while (true) {
            boolean z10 = true;
            if (i10 >= c4305m.f31400a) {
                break;
            }
            boolean[] zArr2 = this.f28291i;
            if (z9 || !c4305m.b(this.f28297o, i10)) {
                z10 = false;
            }
            zArr2[i10] = z10;
            i10++;
        }
        int i11 = 0;
        while (true) {
            gs0Arr = this.f28292j;
            if (i11 >= 2) {
                break;
            }
            gs0Arr[i11].zza();
            i11++;
        }
        v();
        this.f28297o = c4305m;
        u();
        InterfaceC5385uZ0 interfaceC5385uZ0 = this.f28283a;
        InterfaceC3299e[] interfaceC3299eArr = c4305m.f31402c;
        boolean[] zArr3 = this.f28291i;
        InterfaceC4812q01[] interfaceC4812q01Arr = this.f28285c;
        long jG = interfaceC5385uZ0.g(interfaceC3299eArr, zArr3, interfaceC4812q01Arr, zArr, j10);
        for (int i12 = 0; i12 < 2; i12++) {
            gs0Arr[i12].zza();
        }
        this.f28288f = false;
        for (int i13 = 0; i13 < 2; i13++) {
            if (interfaceC4812q01Arr[i13] != null) {
                AbstractC2418Ss0.i(c4305m.a(i13));
                gs0Arr[i13].zza();
                this.f28288f = true;
            } else {
                AbstractC2418Ss0.i(interfaceC3299eArr[i13] == null);
            }
        }
        return jG;
    }

    public final void n() {
        v();
        InterfaceC5385uZ0 interfaceC5385uZ0 = this.f28283a;
        try {
            boolean z9 = interfaceC5385uZ0 instanceof ZY0;
            C5497vS0 c5497vS0 = this.f28294l;
            if (z9) {
                c5497vS0.f(((ZY0) interfaceC5385uZ0).f26230a);
            } else {
                c5497vS0.f(interfaceC5385uZ0);
            }
        } catch (RuntimeException e10) {
            YU.f("MediaPeriodHolder", "Period release failed.", e10);
        }
    }

    public final void o(C3484fS0 c3484fS0) {
        if (c3484fS0 == this.f28295m) {
            return;
        }
        v();
        this.f28295m = c3484fS0;
        u();
    }

    public final C3484fS0 p() {
        return this.f28295m;
    }

    public final A01 q() {
        return this.f28296n;
    }

    public final C4305m r() {
        return this.f28297o;
    }

    public final void s() {
        InterfaceC5385uZ0 interfaceC5385uZ0 = this.f28283a;
        if (interfaceC5385uZ0 instanceof ZY0) {
            long j10 = this.f28289g.f28646d;
            if (j10 == -9223372036854775807L) {
                j10 = Long.MIN_VALUE;
            }
            ((ZY0) interfaceC5385uZ0).b(0L, j10);
        }
    }

    public final void t(InterfaceC5259tZ0 interfaceC5259tZ0, long j10) {
        this.f28286d = true;
        this.f28283a.k(interfaceC5259tZ0, j10);
    }
}
