package com.google.android.gms.internal.ads;

import com.google.protobuf.CodedOutputStream;
import java.io.EOFException;
import java.math.RoundingMode;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.f4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C3435f4 implements I1 {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final /* synthetic */ int f28148r = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final InterfaceC5570w2 f28153e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private L1 f28154f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private InterfaceC5570w2 f28155g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private InterfaceC5570w2 f28156h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f28157i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private V6 f28158j;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private long f28160l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private long f28161m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private long f28162n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f28163o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private InterfaceC3687h4 f28164p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f28165q;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final P10 f28149a = new P10(10);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C3431f2 f28150b = new C3431f2();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final C2929b2 f28151c = new C2929b2();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private long f28159k = -9223372036854775807L;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final C3180d2 f28152d = new C3180d2();

    static {
        int i10 = AbstractC3184d4.f27323a;
    }

    public C3435f4(int i10) {
        F1 f10 = new F1();
        this.f28153e = f10;
        this.f28156h = f10;
        this.f28162n = -1L;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x005a  */
    /* JADX WARN: Code duplicated, block: B:26:0x0062  */
    /* JADX WARN: Code duplicated, block: B:28:0x006b  */
    /* JADX WARN: Code duplicated, block: B:29:0x006d  */
    /* JADX WARN: Code duplicated, block: B:37:0x0096  */
    /* JADX WARN: Code duplicated, block: B:46:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:48:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:50:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:51:0x010e  */
    /* JADX WARN: Code duplicated, block: B:54:0x011a  */
    /* JADX WARN: Code duplicated, block: B:55:0x0120  */
    /* JADX WARN: Code duplicated, block: B:57:0x012c  */
    /* JADX WARN: Code duplicated, block: B:59:0x0130  */
    /* JADX WARN: Code duplicated, block: B:61:0x0136  */
    /* JADX WARN: Code duplicated, block: B:63:0x0144  */
    /* JADX WARN: Code duplicated, block: B:65:0x0149  */
    private final int c(J1 j10) {
        long j11;
        int iB;
        C3937j4 c3937j4A;
        C2929b2 c2929b2;
        long jZzn;
        long jZzo;
        long jB;
        long j12;
        long j13;
        InterfaceC3687h4 c2933b4;
        long j14;
        long j15;
        int i10;
        int i11;
        H3 h10;
        C3058c4 c3058c4D;
        InterfaceC3687h4 c2933b5;
        int i12 = -1;
        if (this.f28157i == 0) {
            try {
                i(j10, false);
            } catch (EOFException unused) {
                return -1;
            }
        }
        if (this.f28164p == null) {
            C3431f2 c3431f2 = this.f28150b;
            P10 p10 = new P10(c3431f2.f28132c);
            j10.J(p10.H(), 0, c3431f2.f28132c);
            int i13 = 21;
            if ((c3431f2.f28130a & 1) != 0) {
                if (c3431f2.f28134e != 1) {
                    i13 = 36;
                }
            } else if (c3431f2.f28134e == 1) {
                i13 = 13;
            }
            if (p10.D() >= i13 + 4) {
                p10.G(i13);
                iB = p10.b();
                if (iB != 1483304551) {
                    if (iB == 1231971951) {
                        iB = 1231971951;
                    } else if (p10.D() >= 40) {
                        p10.G(36);
                        if (p10.b() == 1447187017) {
                            iB = 1447187017;
                        } else {
                            iB = 0;
                        }
                    } else {
                        iB = 0;
                    }
                }
            } else if (p10.D() >= 40) {
                p10.G(36);
                if (p10.b() == 1447187017) {
                    iB = 1447187017;
                } else {
                    iB = 0;
                }
            } else {
                iB = 0;
            }
            InterfaceC3687h4 interfaceC3687h4 = null;
            if (iB == 1231971951) {
                c3937j4A = C3937j4.a(c3431f2, p10);
                c2929b2 = this.f28151c;
                if (!c2929b2.b() && (i10 = c3937j4A.f30291d) != -1 && (i11 = c3937j4A.f30292e) != -1) {
                    c2929b2.f26702a = i10;
                    c2929b2.f26703b = i11;
                }
                jZzn = j10.zzn();
                if (j10.zzo() != -1) {
                    j14 = c3937j4A.f30290c;
                    if (j14 != -1) {
                        j15 = j14 + jZzn;
                        if (j10.zzo() != j15) {
                            j11 = -9223372036854775807L;
                            long jZzo2 = j10.zzo();
                            StringBuilder sb = new StringBuilder(String.valueOf(jZzo2).length() + 53 + String.valueOf(j15).length() + 20);
                            sb.append("Data size mismatch between stream (");
                            sb.append(jZzo2);
                            sb.append(") and Xing frame (");
                            sb.append(j15);
                            sb.append("), using Xing value.");
                            YU.b("Mp3Extractor", sb.toString());
                        } else {
                            j11 = -9223372036854775807L;
                        }
                    } else {
                        j11 = -9223372036854775807L;
                    }
                } else {
                    j11 = -9223372036854775807L;
                }
                j10.n(c3431f2.f28132c);
                if (iB == 1483304551) {
                    c2933b4 = C4063k4.d(c3937j4A, jZzn);
                    i12 = -1;
                } else {
                    jZzo = j10.zzo();
                    jB = c3937j4A.b();
                    if (jB == j11) {
                        i12 = -1;
                    } else {
                        j12 = c3937j4A.f30290c;
                        if (j12 != -1) {
                            jZzo = jZzn + j12;
                            i12 = -1;
                            j13 = j12 - ((long) c3937j4A.f30288a.f28132c);
                        } else {
                            i12 = -1;
                            if (jZzo != -1) {
                                j13 = (jZzo - jZzn) - ((long) c3937j4A.f30288a.f28132c);
                            }
                        }
                        long j16 = jZzo;
                        long j17 = j13;
                        RoundingMode roundingMode = RoundingMode.HALF_UP;
                        c2933b4 = new C2933b4(j16, jZzn + ((long) c3937j4A.f30288a.f28132c), AbstractC5305tw0.a(AbstractC4634ob0.P(j17, 8000000L, jB, roundingMode)), AbstractC5305tw0.a(AbstractC4676ow0.a(j17, c3937j4A.f30289b, roundingMode)), false);
                    }
                    c2933b4 = null;
                }
            } else {
                if (iB == 1447187017) {
                    c2933b4 = C3813i4.d(j10.zzo(), j10.zzn(), c3431f2, p10);
                    j10.n(c3431f2.f28132c);
                } else if (iB != 1483304551) {
                    j10.zzl();
                    c2933b4 = null;
                } else {
                    c3937j4A = C3937j4.a(c3431f2, p10);
                    c2929b2 = this.f28151c;
                    if (!c2929b2.b()) {
                        c2929b2.f26702a = i10;
                        c2929b2.f26703b = i11;
                    }
                    jZzn = j10.zzn();
                    if (j10.zzo() != -1) {
                        j14 = c3937j4A.f30290c;
                        if (j14 != -1) {
                            j15 = j14 + jZzn;
                            if (j10.zzo() != j15) {
                                j11 = -9223372036854775807L;
                                long jZzo3 = j10.zzo();
                                StringBuilder sb2 = new StringBuilder(String.valueOf(jZzo3).length() + 53 + String.valueOf(j15).length() + 20);
                                sb2.append("Data size mismatch between stream (");
                                sb2.append(jZzo3);
                                sb2.append(") and Xing frame (");
                                sb2.append(j15);
                                sb2.append("), using Xing value.");
                                YU.b("Mp3Extractor", sb2.toString());
                            } else {
                                j11 = -9223372036854775807L;
                            }
                        } else {
                            j11 = -9223372036854775807L;
                        }
                    } else {
                        j11 = -9223372036854775807L;
                    }
                    j10.n(c3431f2.f28132c);
                    if (iB == 1483304551) {
                        c2933b4 = C4063k4.d(c3937j4A, jZzn);
                        i12 = -1;
                    } else {
                        jZzo = j10.zzo();
                        jB = c3937j4A.b();
                        if (jB == j11) {
                            i12 = -1;
                        } else {
                            j12 = c3937j4A.f30290c;
                            if (j12 != -1) {
                                jZzo = jZzn + j12;
                                i12 = -1;
                                j13 = j12 - ((long) c3937j4A.f30288a.f28132c);
                            } else {
                                i12 = -1;
                                if (jZzo != -1) {
                                    j13 = (jZzo - jZzn) - ((long) c3937j4A.f30288a.f28132c);
                                }
                            }
                            long j18 = jZzo;
                            long j19 = j13;
                            RoundingMode roundingMode2 = RoundingMode.HALF_UP;
                            c2933b4 = new C2933b4(j18, jZzn + ((long) c3937j4A.f30288a.f28132c), AbstractC5305tw0.a(AbstractC4634ob0.P(j19, 8000000L, jB, roundingMode2)), AbstractC5305tw0.a(AbstractC4676ow0.a(j19, c3937j4A.f30289b, roundingMode2)), false);
                        }
                        c2933b4 = null;
                    }
                }
                j11 = -9223372036854775807L;
            }
            V6 v10 = this.f28158j;
            long jZzn2 = j10.zzn();
            if (v10 == null || (h10 = (H3) v10.c(H3.class, AbstractC2626Ws0.a())) == null) {
                c3058c4D = null;
            } else {
                J3 j20 = (J3) v10.c(J3.class, C3309e4.f27675a);
                c3058c4D = C3058c4.d(jZzn2, h10, j20 == null ? j11 : AbstractC4634ob0.M(Long.parseLong((String) j20.f19736c.get(0))));
            }
            if (this.f28165q) {
                c2933b5 = new C3561g4();
            } else {
                if (c3058c4D != null) {
                    interfaceC3687h4 = c3058c4D;
                } else if (c2933b4 != null) {
                    interfaceC3687h4 = c2933b4;
                }
                if (interfaceC3687h4 == null) {
                    P10 p11 = this.f28149a;
                    j10.J(p11.H(), 0, 4);
                    p11.G(0);
                    c3431f2.a(p11.b());
                    c2933b5 = new C2933b4(j10.zzo(), j10.zzn(), c3431f2.f28135f, c3431f2.f28132c, false);
                } else {
                    c2933b5 = interfaceC3687h4;
                }
                this.f28155g.g(c2933b5.zza());
            }
            this.f28164p = c2933b5;
            this.f28154f.o(c2933b5);
            C5507vX0 c5507vX0 = new C5507vX0();
            c5507vX0.k0("audio/mpeg");
            c5507vX0.l0(c3431f2.f28131b);
            c5507vX0.m0(CodedOutputStream.DEFAULT_BUFFER_SIZE);
            c5507vX0.e(c3431f2.f28134e);
            c5507vX0.f(c3431f2.f28133d);
            C2929b2 c2929b3 = this.f28151c;
            c5507vX0.h(c2929b3.f26702a);
            c5507vX0.i(c2929b3.f26703b);
            c5507vX0.j0(this.f28158j);
            if (this.f28164p.zzg() != -2147483647) {
                c5507vX0.g0(this.f28164p.zzg());
            }
            this.f28156h.f(c5507vX0.m());
            this.f28161m = j10.zzn();
        } else {
            i12 = -1;
            j11 = -9223372036854775807L;
            long j21 = this.f28161m;
            if (j21 != 0) {
                long jZzn3 = j10.zzn();
                if (jZzn3 < j21) {
                    j10.n((int) (j21 - jZzn3));
                }
            }
        }
        int i14 = this.f28163o;
        if (i14 == 0) {
            j10.zzl();
            if (j(j10)) {
                return i12;
            }
            P10 p12 = this.f28149a;
            p12.G(0);
            int iB2 = p12.b();
            if (!l(iB2, this.f28157i) || AbstractC3557g2.a(iB2) == i12) {
                j10.n(1);
                this.f28157i = 0;
                return 0;
            }
            C3431f2 c3431f3 = this.f28150b;
            c3431f3.a(iB2);
            if (this.f28159k == j11) {
                this.f28159k = this.f28164p.c(j10.zzn());
            }
            i14 = c3431f3.f28132c;
            this.f28163o = i14;
            this.f28162n = j10.zzn() + ((long) i14);
        }
        int iD = this.f28156h.d(j10, i14, true);
        if (iD == -1) {
            return -1;
        }
        int i15 = this.f28163o - iD;
        this.f28163o = i15;
        if (i15 > 0) {
            return 0;
        }
        InterfaceC5570w2 interfaceC5570w2 = this.f28156h;
        long jH = h(this.f28160l);
        C3431f2 c3431f4 = this.f28150b;
        interfaceC5570w2.c(jH, 1, c3431f4.f28132c, 0, null);
        this.f28160l += (long) c3431f4.f28136g;
        this.f28163o = 0;
        return 0;
    }

    private final long h(long j10) {
        return this.f28159k + ((j10 * 1000000) / ((long) this.f28150b.f28133d));
    }

    private final boolean i(J1 j10, boolean z9) throws EOFException {
        int iE;
        int i10;
        int iA;
        j10.zzl();
        if (j10.zzn() == 0) {
            V6 v6A = this.f28152d.a(j10, null, 131072);
            this.f28158j = v6A;
            if (v6A != null) {
                this.f28151c.a(v6A);
            }
            iE = (int) j10.e();
            if (!z9) {
                j10.n(iE);
            }
            i10 = 0;
        } else {
            iE = 0;
            i10 = 0;
        }
        int i11 = i10;
        int i12 = i11;
        while (true) {
            if (j(j10)) {
                if (i11 > 0) {
                    break;
                }
                k();
                throw new EOFException();
            }
            P10 p10 = this.f28149a;
            p10.G(0);
            int iB = p10.b();
            if ((i10 == 0 || l(iB, i10)) && (iA = AbstractC3557g2.a(iB)) != -1) {
                i11++;
                if (i11 != 1) {
                    if (i11 == 4) {
                        break;
                    }
                } else {
                    this.f28150b.a(iB);
                    i10 = iB;
                }
                j10.E(iA - 4);
            } else {
                int i13 = i12 + 1;
                if (i12 == 131072) {
                    if (z9) {
                        return false;
                    }
                    k();
                    throw new EOFException();
                }
                if (z9) {
                    j10.zzl();
                    j10.E(iE + i13);
                } else {
                    j10.n(1);
                }
                i11 = 0;
                i12 = i13;
                i10 = 0;
            }
        }
        if (z9) {
            j10.n(iE + i12);
        } else {
            j10.zzl();
        }
        this.f28157i = i10;
        return true;
    }

    private final boolean j(J1 j10) {
        InterfaceC3687h4 interfaceC3687h4 = this.f28164p;
        if (interfaceC3687h4 != null) {
            long jB = interfaceC3687h4.b();
            if (jB != -1 && j10.e() > jB - 4) {
                return true;
            }
        }
        try {
            return !j10.H(this.f28149a.H(), 0, 4, true);
        } catch (EOFException unused) {
            return true;
        }
    }

    private final void k() {
        InterfaceC3687h4 interfaceC3687h4 = this.f28164p;
        if ((interfaceC3687h4 instanceof C2933b4) && interfaceC3687h4.zzb()) {
            long j10 = this.f28162n;
            if (j10 == -1 || j10 == this.f28164p.b()) {
                return;
            }
            this.f28164p = ((C2933b4) this.f28164p).f(this.f28162n);
            L1 l10 = this.f28154f;
            l10.getClass();
            l10.o(this.f28164p);
            this.f28155g.getClass();
            this.f28164p.zza();
        }
    }

    private static boolean l(int i10, long j10) {
        return ((long) (i10 & (-128000))) == (j10 & (-128000));
    }

    public final void a() {
        this.f28165q = true;
    }

    @Override // com.google.android.gms.internal.ads.I1
    public final void b() {
    }

    @Override // com.google.android.gms.internal.ads.I1
    public final void d(long j10, long j11) {
        this.f28157i = 0;
        this.f28159k = -9223372036854775807L;
        this.f28160l = 0L;
        this.f28163o = 0;
        this.f28162n = -1L;
    }

    @Override // com.google.android.gms.internal.ads.I1
    public final boolean e(J1 j10) {
        return i(j10, true);
    }

    @Override // com.google.android.gms.internal.ads.I1
    public final void f(L1 l10) {
        this.f28154f = l10;
        InterfaceC5570w2 interfaceC5570w2B = l10.b(0, 1);
        this.f28155g = interfaceC5570w2B;
        this.f28156h = interfaceC5570w2B;
        this.f28154f.q();
    }

    @Override // com.google.android.gms.internal.ads.I1
    public final int g(J1 j10, C3933j2 c3933j2) {
        this.f28155g.getClass();
        String str = AbstractC4634ob0.f32117a;
        return c(j10);
    }
}
