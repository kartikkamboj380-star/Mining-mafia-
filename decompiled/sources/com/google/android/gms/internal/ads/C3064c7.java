package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.c7, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C3064c7 implements InterfaceC5832y7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final I6 f27042a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C4436n10 f27043b = new C4436n10(new byte[10], 10);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f27044c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f27045d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private L90 f27046e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f27047f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f27048g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f27049h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f27050i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f27051j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f27052k;

    public C3064c7(I6 i10) {
        this.f27042a = i10;
    }

    private final void d(int i10) {
        this.f27044c = i10;
        this.f27045d = 0;
    }

    private final boolean e(P10 p10, byte[] bArr, int i10) {
        int iMin = Math.min(p10.C(), i10 - this.f27045d);
        if (iMin <= 0) {
            return true;
        }
        if (bArr == null) {
            p10.J(iMin);
        } else {
            p10.L(bArr, this.f27045d, iMin);
        }
        int i11 = this.f27045d + iMin;
        this.f27045d = i11;
        return i11 == i10;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5832y7
    public final void a(L90 l90, L1 l10, C5706x7 c5706x7) {
        this.f27046e = l90;
        this.f27042a.m0(l10, c5706x7);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5832y7
    public final void b(P10 p10, int i10) {
        int i11;
        int i12;
        long jE;
        this.f27046e.getClass();
        int i13 = -1;
        int i14 = 2;
        if ((i10 & 1) != 0) {
            int i15 = this.f27044c;
            if (i15 != 0 && i15 != 1) {
                if (i15 != 2) {
                    int i16 = this.f27051j;
                    if (i16 != -1) {
                        StringBuilder sb = new StringBuilder(String.valueOf(i16).length() + 48);
                        sb.append("Unexpected start indicator: expected ");
                        sb.append(i16);
                        sb.append(" more bytes");
                        YU.c("PesReader", sb.toString());
                    }
                    this.f27042a.l0(p10.D() == 0);
                } else {
                    YU.c("PesReader", "Unexpected start indicator reading extended header");
                }
            }
            d(1);
        }
        int i17 = i10;
        while (p10.C() > 0) {
            int i18 = this.f27044c;
            if (i18 == 0) {
                i11 = i14;
                p10.J(p10.C());
            } else if (i18 != 1) {
                if (i18 != i14) {
                    int iC = p10.C();
                    int i19 = this.f27051j;
                    int i20 = i19 == i13 ? 0 : iC - i19;
                    if (i20 > 0) {
                        iC -= i20;
                        p10.E(p10.F() + iC);
                    }
                    I6 i21 = this.f27042a;
                    i21.o0(p10);
                    int i22 = this.f27051j;
                    if (i22 != i13) {
                        int i23 = i22 - iC;
                        this.f27051j = i23;
                        if (i23 == 0) {
                            i21.l0(false);
                            d(1);
                        }
                    }
                } else {
                    int iMin = Math.min(10, this.f27050i);
                    C4436n10 c4436n10 = this.f27043b;
                    if (e(p10, c4436n10.f31642a, iMin) && e(p10, null, this.f27050i)) {
                        c4436n10.f(0);
                        if (this.f27047f) {
                            c4436n10.h(4);
                            long j10 = c4436n10.j(3);
                            c4436n10.h(1);
                            int iJ = c4436n10.j(15) << 15;
                            c4436n10.h(1);
                            long j11 = c4436n10.j(15);
                            c4436n10.h(1);
                            if (!this.f27049h && this.f27048g) {
                                c4436n10.h(4);
                                long j12 = ((long) c4436n10.j(3)) << 30;
                                c4436n10.h(1);
                                int iJ2 = c4436n10.j(15) << 15;
                                c4436n10.h(1);
                                long j13 = c4436n10.j(15);
                                c4436n10.h(1);
                                this.f27046e.e(j12 | ((long) iJ2) | j13);
                                this.f27049h = true;
                            }
                            jE = this.f27046e.e(j11 | (j10 << 30) | ((long) iJ));
                        } else {
                            jE = -9223372036854775807L;
                        }
                        i17 |= true != this.f27052k ? 0 : 4;
                        this.f27042a.n0(jE, i17);
                        d(3);
                        i13 = -1;
                        i14 = 2;
                    }
                }
                i11 = i14;
            } else {
                C4436n10 c4436n11 = this.f27043b;
                if (e(p10, c4436n11.f31642a, 9)) {
                    c4436n11.f(0);
                    int iJ3 = c4436n11.j(24);
                    if (iJ3 != 1) {
                        StringBuilder sb2 = new StringBuilder(String.valueOf(iJ3).length() + 30);
                        sb2.append("Unexpected start code prefix: ");
                        sb2.append(iJ3);
                        YU.c("PesReader", sb2.toString());
                        i13 = -1;
                        this.f27051j = -1;
                        i12 = 0;
                        i11 = 2;
                    } else {
                        c4436n11.h(8);
                        int iJ4 = c4436n11.j(16);
                        c4436n11.h(5);
                        this.f27052k = c4436n11.i();
                        i11 = 2;
                        c4436n11.h(2);
                        this.f27047f = c4436n11.i();
                        this.f27048g = c4436n11.i();
                        c4436n11.h(6);
                        int iJ5 = c4436n11.j(8);
                        this.f27050i = iJ5;
                        if (iJ4 == 0) {
                            this.f27051j = -1;
                            i13 = -1;
                        } else {
                            int i24 = (iJ4 - 3) - iJ5;
                            this.f27051j = i24;
                            if (i24 < 0) {
                                StringBuilder sb3 = new StringBuilder(String.valueOf(i24).length() + 36);
                                sb3.append("Found negative packet payload size: ");
                                sb3.append(i24);
                                YU.c("PesReader", sb3.toString());
                                i13 = -1;
                                this.f27051j = -1;
                            } else {
                                i13 = -1;
                            }
                        }
                        i12 = 2;
                    }
                    d(i12);
                } else {
                    i13 = -1;
                    i11 = 2;
                }
            }
            i14 = i11;
        }
    }

    public final boolean c(boolean z9) {
        return this.f27044c == 3 && this.f27051j == -1;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5832y7
    public final void zzb() {
        this.f27044c = 0;
        this.f27045d = 0;
        this.f27049h = false;
        this.f27042a.zza();
    }
}
