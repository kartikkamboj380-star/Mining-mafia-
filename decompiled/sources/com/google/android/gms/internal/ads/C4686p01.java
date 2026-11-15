package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.p01, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C4686p01 implements InterfaceC5570w2 {

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private boolean f32242B;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C3930j01 f32243a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final KX0 f32246d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final FX0 f32247e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private InterfaceC4560o01 f32248f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private JY0 f32249g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private DX0 f32250h;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f32258p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f32259q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f32260r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private int f32261s;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private boolean f32265w;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private JY0 f32268z;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C4056k01 f32244b = new C4056k01();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f32251i = 1000;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private long[] f32252j = new long[1000];

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private long[] f32253k = new long[1000];

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private long[] f32256n = new long[1000];

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int[] f32255m = new int[1000];

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int[] f32254l = new int[1000];

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private C5444v2[] f32257o = new C5444v2[1000];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final C5441v01 f32245c = new C5441v01(C4182l01.f31152a);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private long f32262t = Long.MIN_VALUE;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private long f32263u = Long.MIN_VALUE;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private long f32264v = Long.MIN_VALUE;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private boolean f32267y = true;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private boolean f32266x = true;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private boolean f32241A = true;

    protected C4686p01(InterfaceC4683p interfaceC4683p, KX0 kx0, FX0 fx0) {
        this.f32246d = kx0;
        this.f32247e = fx0;
        this.f32243a = new C3930j01(interfaceC4683p);
    }

    private final synchronized void a() {
        this.f32261s = 0;
        this.f32243a.b();
    }

    private final synchronized int i(ZR0 zr0, C5741xO0 c5741xO0, boolean z9, boolean z10, C4056k01 c4056k01) {
        try {
            c5741xO0.f34804e = false;
            if (!o()) {
                if (!z10 && !this.f32265w) {
                    JY0 jy0 = this.f32268z;
                    if (jy0 == null || (!z9 && jy0 == this.f32249g)) {
                        return -3;
                    }
                    p(jy0, zr0);
                    return -5;
                }
                c5741xO0.g(4);
                c5741xO0.f34805f = Long.MIN_VALUE;
                return -4;
            }
            JY0 jy1 = ((C4308m01) this.f32245c.a(this.f32259q + this.f32261s)).f31413a;
            if (!z9 && jy1 == this.f32249g) {
                int iT = t(this.f32261s);
                if (!q(iT)) {
                    c5741xO0.f34804e = true;
                    return -3;
                }
                c5741xO0.g(this.f32255m[iT]);
                if (this.f32261s == this.f32258p - 1 && (z10 || this.f32265w)) {
                    c5741xO0.h(536870912);
                }
                c5741xO0.f34805f = this.f32256n[iT];
                c4056k01.f30665a = this.f32254l[iT];
                c4056k01.f30666b = this.f32253k[iT];
                c4056k01.f30667c = this.f32257o[iT];
                return -4;
            }
            p(jy1, zr0);
            return -5;
        } catch (Throwable th) {
            throw th;
        }
    }

    private final synchronized boolean j(JY0 jy0) {
        try {
            this.f32267y = false;
            if (Objects.equals(jy0, this.f32268z)) {
                return false;
            }
            C5441v01 c5441v01 = this.f32245c;
            if (c5441v01.f() || !((C4308m01) c5441v01.c()).f31413a.equals(jy0)) {
                this.f32268z = jy0;
            } else {
                this.f32268z = ((C4308m01) c5441v01.c()).f31413a;
            }
            boolean z9 = this.f32241A;
            JY0 jy1 = this.f32268z;
            this.f32241A = z9 & A8.d(jy1.f19929o, jy1.f19925k);
            this.f32242B = false;
            return true;
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:8:0x000f  */
    private final synchronized long k(long j10, boolean z9, boolean z10) throws Throwable {
        Throwable th;
        try {
            try {
                int i10 = this.f32258p;
                if (i10 != 0) {
                    long[] jArr = this.f32256n;
                    int i11 = this.f32260r;
                    if (j10 >= jArr[i11]) {
                        if (z10) {
                            try {
                                int i12 = this.f32261s;
                                if (i12 != i10) {
                                    i10 = i12 + 1;
                                }
                            } catch (Throwable th2) {
                                th = th2;
                                throw th;
                            }
                        }
                        int iR = r(i11, i10, j10, false);
                        if (iR != -1) {
                            return s(iR);
                        }
                    }
                }
                return -1L;
            } catch (Throwable th3) {
                th = th3;
                th = th;
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
        }
    }

    private final synchronized long l() {
        int i10 = this.f32258p;
        if (i10 == 0) {
            return -1L;
        }
        return s(i10);
    }

    private final void m() {
        if (this.f32250h != null) {
            this.f32250h = null;
            this.f32249g = null;
        }
    }

    private final synchronized void n(long j10, int i10, long j11, int i11, C5444v2 c5444v2) {
        try {
            int i12 = this.f32258p;
            if (i12 > 0) {
                int iT = t(i12 - 1);
                AbstractC2418Ss0.a(this.f32253k[iT] + ((long) this.f32254l[iT]) <= j11);
            }
            this.f32265w = (536870912 & i10) != 0;
            this.f32264v = Math.max(this.f32264v, j10);
            int iT2 = t(this.f32258p);
            this.f32256n[iT2] = j10;
            this.f32253k[iT2] = j11;
            this.f32254l[iT2] = i11;
            this.f32255m[iT2] = i10;
            this.f32257o[iT2] = c5444v2;
            this.f32252j[iT2] = 0;
            C5441v01 c5441v01 = this.f32245c;
            if (c5441v01.f() || !((C4308m01) c5441v01.c()).f31413a.equals(this.f32268z)) {
                JY0 jy0 = this.f32268z;
                if (jy0 == null) {
                    throw null;
                }
                c5441v01.b(this.f32259q + this.f32258p, new C4308m01(jy0, JX0.f19897a, null));
            }
            int i13 = this.f32258p + 1;
            this.f32258p = i13;
            int i14 = this.f32251i;
            if (i13 == i14) {
                int i15 = i14 + 1000;
                long[] jArr = new long[i15];
                long[] jArr2 = new long[i15];
                long[] jArr3 = new long[i15];
                int[] iArr = new int[i15];
                int[] iArr2 = new int[i15];
                C5444v2[] c5444v2Arr = new C5444v2[i15];
                int i16 = this.f32260r;
                int i17 = i14 - i16;
                System.arraycopy(this.f32253k, i16, jArr2, 0, i17);
                System.arraycopy(this.f32256n, this.f32260r, jArr3, 0, i17);
                System.arraycopy(this.f32255m, this.f32260r, iArr, 0, i17);
                System.arraycopy(this.f32254l, this.f32260r, iArr2, 0, i17);
                System.arraycopy(this.f32257o, this.f32260r, c5444v2Arr, 0, i17);
                System.arraycopy(this.f32252j, this.f32260r, jArr, 0, i17);
                int i18 = this.f32260r;
                System.arraycopy(this.f32253k, 0, jArr2, i17, i18);
                System.arraycopy(this.f32256n, 0, jArr3, i17, i18);
                System.arraycopy(this.f32255m, 0, iArr, i17, i18);
                System.arraycopy(this.f32254l, 0, iArr2, i17, i18);
                System.arraycopy(this.f32257o, 0, c5444v2Arr, i17, i18);
                System.arraycopy(this.f32252j, 0, jArr, i17, i18);
                this.f32253k = jArr2;
                this.f32256n = jArr3;
                this.f32255m = iArr;
                this.f32254l = iArr2;
                this.f32257o = c5444v2Arr;
                this.f32252j = jArr;
                this.f32260r = 0;
                this.f32251i = i15;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    private final boolean o() {
        return this.f32261s != this.f32258p;
    }

    private final void p(JY0 jy0, ZR0 zr0) {
        JY0 jy1 = this.f32249g;
        IV0 iv0 = jy1 == null ? null : jy1.f19933s;
        this.f32249g = jy0;
        IV0 iv1 = jy0.f19933s;
        KX0 kx0 = this.f32246d;
        zr0.f26192b = jy0.b(kx0.a(jy0));
        zr0.f26191a = this.f32250h;
        if (jy1 == null || !Objects.equals(iv0, iv1)) {
            DX0 dx0B = kx0.b(this.f32247e, jy0);
            this.f32250h = dx0B;
            zr0.f26191a = dx0B;
        }
    }

    private final boolean q(int i10) {
        if (this.f32250h == null) {
            return true;
        }
        int i11 = this.f32255m[i10];
        return false;
    }

    private final int r(int i10, int i11, long j10, boolean z9) {
        int i12 = -1;
        for (int i13 = 0; i13 < i11; i13++) {
            long j11 = this.f32256n[i10];
            if (j11 > j10) {
                break;
            }
            if (!z9 || (this.f32255m[i10] & 1) != 0) {
                if (j11 == j10) {
                    return i13;
                }
                i12 = i13;
            }
            i10++;
            if (i10 == this.f32251i) {
                i10 = 0;
            }
        }
        return i12;
    }

    private final long s(int i10) {
        long j10 = this.f32263u;
        long jMax = Long.MIN_VALUE;
        if (i10 != 0) {
            int iT = t(i10 - 1);
            for (int i11 = 0; i11 < i10; i11++) {
                jMax = Math.max(jMax, this.f32256n[iT]);
                if ((this.f32255m[iT] & 1) != 0) {
                    break;
                }
                iT--;
                if (iT == -1) {
                    iT = this.f32251i - 1;
                }
            }
        }
        this.f32263u = Math.max(j10, jMax);
        this.f32258p -= i10;
        int i12 = this.f32259q + i10;
        this.f32259q = i12;
        int i13 = this.f32260r + i10;
        this.f32260r = i13;
        int i14 = this.f32251i;
        if (i13 >= i14) {
            this.f32260r = i13 - i14;
        }
        int i15 = this.f32261s - i10;
        this.f32261s = i15;
        if (i15 < 0) {
            this.f32261s = 0;
        }
        this.f32245c.d(i12);
        if (this.f32258p != 0) {
            return this.f32253k[this.f32260r];
        }
        int i16 = this.f32260r;
        if (i16 == 0) {
            i16 = this.f32251i;
        }
        int i17 = i16 - 1;
        return this.f32253k[i17] + ((long) this.f32254l[i17]);
    }

    private final int t(int i10) {
        int i11 = this.f32260r + i10;
        int i12 = this.f32251i;
        return i11 < i12 ? i11 : i11 - i12;
    }

    public final int A() {
        return this.f32259q;
    }

    public final int B() {
        return this.f32259q + this.f32261s;
    }

    public final synchronized JY0 C() {
        if (this.f32267y) {
            return null;
        }
        return this.f32268z;
    }

    public final synchronized long D() {
        return this.f32264v;
    }

    public final synchronized boolean E() {
        return this.f32265w;
    }

    public final synchronized boolean F(boolean z9) {
        boolean z10 = true;
        if (o()) {
            if (((C4308m01) this.f32245c.a(this.f32259q + this.f32261s)).f31413a != this.f32249g) {
                return true;
            }
            return q(t(this.f32261s));
        }
        if (!z9 && !this.f32265w) {
            JY0 jy0 = this.f32268z;
            if (jy0 == null) {
                z10 = false;
            } else if (jy0 == this.f32249g) {
                return false;
            }
        }
        return z10;
    }

    public final int G(ZR0 zr0, C5741xO0 c5741xO0, int i10, boolean z9) {
        boolean z10 = (i10 & 2) != 0;
        C4056k01 c4056k01 = this.f32244b;
        int i11 = i(zr0, c5741xO0, z10, z9, c4056k01);
        if (i11 != -4) {
            return i11;
        }
        if (!c5741xO0.b()) {
            int i12 = i10 & 1;
            if ((i10 & 4) == 0) {
                if (i12 != 0) {
                    this.f32243a.d(c5741xO0, c4056k01);
                    return -4;
                }
                this.f32243a.c(c5741xO0, c4056k01);
            } else if (i12 != 0) {
                return -4;
            }
            this.f32261s++;
        }
        return -4;
    }

    public final synchronized boolean H(int i10) {
        a();
        int i11 = this.f32259q;
        if (i10 >= i11 && i10 <= this.f32258p + i11) {
            this.f32262t = Long.MIN_VALUE;
            this.f32261s = i10 - i11;
            return true;
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0024  */
    public final synchronized boolean I(long j10, boolean z9) throws Throwable {
        Throwable th;
        C4686p01 c4686p01;
        long j11;
        int iR;
        try {
            try {
                a();
                int i10 = this.f32261s;
                int iT = t(i10);
                if (o() && j10 >= this.f32256n[iT]) {
                    if (j10 > this.f32264v) {
                        if (z9) {
                            z9 = true;
                        }
                    }
                    if (this.f32241A) {
                        try {
                            int i11 = this.f32258p - i10;
                            int i12 = 0;
                            while (true) {
                                if (i12 >= i11) {
                                    if (!z9) {
                                        c4686p01 = this;
                                        j11 = j10;
                                        iR = -1;
                                        break;
                                    }
                                    j11 = j10;
                                    iR = i11;
                                    c4686p01 = this;
                                    break;
                                }
                                if (this.f32256n[iT] >= j10) {
                                    c4686p01 = this;
                                    j11 = j10;
                                    iR = i12;
                                    break;
                                }
                                iT++;
                                if (iT == this.f32251i) {
                                    iT = 0;
                                }
                                i12++;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            throw th;
                        }
                    } else {
                        c4686p01 = this;
                        j11 = j10;
                        iR = c4686p01.r(iT, this.f32258p - i10, j11, true);
                    }
                    if (iR != -1) {
                        c4686p01.f32262t = j11;
                        c4686p01.f32261s += iR;
                        return true;
                    }
                }
                return false;
            } catch (Throwable th3) {
                th = th3;
                th = th;
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
        }
    }

    public final synchronized int J(long j10, boolean z9) {
        Throwable th;
        try {
            try {
                int i10 = this.f32261s;
                int iT = t(i10);
                if (!o() || j10 < this.f32256n[iT]) {
                    return 0;
                }
                if (j10 <= this.f32264v || !z9) {
                    int iR = r(iT, this.f32258p - i10, j10, true);
                    if (iR == -1) {
                        return 0;
                    }
                    return iR;
                }
                try {
                    return this.f32258p - i10;
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (Throwable th3) {
                th = th3;
                th = th;
            }
        } catch (Throwable th4) {
            th = th4;
            th = th;
        }
        throw th;
    }

    public final synchronized void K(int i10) {
        boolean z9 = false;
        if (i10 >= 0) {
            try {
                if (this.f32261s + i10 <= this.f32258p) {
                    z9 = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        AbstractC2418Ss0.a(z9);
        this.f32261s += i10;
    }

    public final void L(long j10, boolean z9, boolean z10) {
        this.f32243a.e(k(j10, false, z10));
    }

    public final void M() {
        this.f32243a.e(l());
    }

    public final void N(InterfaceC4560o01 interfaceC4560o01) {
        this.f32248f = interfaceC4560o01;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5570w2
    public final void c(long j10, int i10, int i11, int i12, C5444v2 c5444v2) {
        if (this.f32266x) {
            if ((i10 & 1) == 0) {
                return;
            } else {
                this.f32266x = false;
            }
        }
        if (this.f32241A) {
            if (j10 < this.f32262t) {
                return;
            }
            if ((i10 & 1) == 0) {
                if (!this.f32242B) {
                    YU.c("SampleQueue", "Overriding unexpected non-sync sample for format: ".concat(String.valueOf(this.f32268z)));
                    this.f32242B = true;
                }
                i10 |= 1;
            }
        }
        int i13 = i10;
        n(j10, i13, (this.f32243a.f() - ((long) i11)) - ((long) i12), i11, c5444v2);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5570w2
    public final void e(P10 p10, int i10, int i11) {
        this.f32243a.h(p10, i10);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5570w2
    public final void f(JY0 jy0) {
        boolean zJ = j(jy0);
        InterfaceC4560o01 interfaceC4560o01 = this.f32248f;
        if (interfaceC4560o01 == null || !zJ) {
            return;
        }
        interfaceC4560o01.h(jy0);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5570w2
    public final int h(PQ0 pq0, int i10, boolean z9, int i11) {
        return this.f32243a.g(pq0, i10, z9);
    }

    public final void u() {
        v(true);
        m();
    }

    public final void v(boolean z9) {
        this.f32243a.a();
        this.f32258p = 0;
        this.f32259q = 0;
        this.f32260r = 0;
        this.f32261s = 0;
        this.f32266x = true;
        this.f32262t = Long.MIN_VALUE;
        this.f32263u = Long.MIN_VALUE;
        this.f32264v = Long.MIN_VALUE;
        this.f32265w = false;
        this.f32245c.e();
        if (z9) {
            this.f32268z = null;
            this.f32267y = true;
            this.f32241A = true;
        }
    }

    public final void w(long j10) {
        this.f32262t = j10;
    }

    public final int x() {
        return this.f32259q + this.f32258p;
    }

    public final void y() {
        M();
        m();
    }

    public final void z() {
        DX0 dx0 = this.f32250h;
        if (dx0 != null) {
            throw dx0.zza();
        }
    }
}
