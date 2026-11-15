package com.google.android.gms.internal.ads;

import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import java.util.Collections;

/* JADX INFO: loaded from: classes2.dex */
public final class T6 implements I6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f23411a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f23412b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f23413c = "video/mp2t";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final P10 f23414d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final C4436n10 f23415e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private InterfaceC5570w2 f23416f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private String f23417g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private JY0 f23418h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f23419i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f23420j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f23421k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f23422l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private long f23423m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f23424n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f23425o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f23426p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f23427q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private boolean f23428r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private long f23429s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f23430t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private long f23431u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private int f23432v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private String f23433w;

    public T6(String str, int i10, String str2) {
        this.f23411a = str;
        this.f23412b = i10;
        P10 p10 = new P10(IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET);
        this.f23414d = p10;
        byte[] bArrH = p10.H();
        this.f23415e = new C4436n10(bArrH, bArrH.length);
        this.f23423m = -9223372036854775807L;
    }

    private final int a(C4436n10 c4436n10) throws C2817a9 {
        int iC = c4436n10.c();
        C3429f1 c3429f1B = AbstractC3555g1.b(c4436n10, true);
        this.f23433w = c3429f1B.f28124c;
        this.f23430t = c3429f1B.f28122a;
        this.f23432v = c3429f1B.f28123b;
        return iC - c4436n10.c();
    }

    private static long b(C4436n10 c4436n10) {
        return c4436n10.j((c4436n10.j(2) + 1) * 8);
    }

    @Override // com.google.android.gms.internal.ads.I6
    public final void l0(boolean z9) {
    }

    @Override // com.google.android.gms.internal.ads.I6
    public final void m0(L1 l10, C5706x7 c5706x7) {
        c5706x7.a();
        this.f23416f = l10.b(c5706x7.b(), 1);
        this.f23417g = c5706x7.c();
    }

    @Override // com.google.android.gms.internal.ads.I6
    public final void n0(long j10, int i10) {
        this.f23423m = j10;
    }

    @Override // com.google.android.gms.internal.ads.I6
    public final void o0(P10 p10) throws C2817a9 {
        int i10;
        int i11;
        int iJ;
        boolean zI;
        this.f23416f.getClass();
        while (p10.C() > 0) {
            int i12 = this.f23419i;
            if (i12 != 0) {
                if (i12 == 1) {
                    int iR = p10.R();
                    if ((iR & 224) == 224) {
                        this.f23422l = iR;
                        this.f23419i = 2;
                    } else if (iR != 86) {
                        this.f23419i = 0;
                    }
                } else if (i12 != 2) {
                    int iMin = Math.min(p10.C(), this.f23421k - this.f23420j);
                    C4436n10 c4436n10 = this.f23415e;
                    p10.L(c4436n10.f31642a, this.f23420j, iMin);
                    int i13 = this.f23420j + iMin;
                    this.f23420j = i13;
                    if (i13 == this.f23421k) {
                        c4436n10.f(0);
                        if (c4436n10.i()) {
                            if (this.f23424n) {
                            }
                            this.f23419i = 0;
                        } else {
                            this.f23424n = true;
                            int iJ2 = c4436n10.j(1);
                            if (iJ2 == 1) {
                                iJ = c4436n10.j(1);
                                i11 = 1;
                            } else {
                                i11 = iJ2;
                                iJ = 0;
                            }
                            this.f23425o = iJ;
                            if (iJ != 0) {
                                throw C2817a9.b(null, null);
                            }
                            if (i11 == 1) {
                                b(c4436n10);
                                i11 = 1;
                            }
                            if (!c4436n10.i()) {
                                throw C2817a9.b(null, null);
                            }
                            this.f23426p = c4436n10.j(6);
                            int iJ3 = c4436n10.j(4);
                            int iJ4 = c4436n10.j(3);
                            if (iJ3 != 0 || iJ4 != 0) {
                                throw C2817a9.b(null, null);
                            }
                            if (i11 == 0) {
                                int iD = c4436n10.d();
                                int iA = a(c4436n10);
                                c4436n10.f(iD);
                                byte[] bArr = new byte[(iA + 7) / 8];
                                c4436n10.l(bArr, 0, iA);
                                C5507vX0 c5507vX0 = new C5507vX0();
                                c5507vX0.A(this.f23417g);
                                c5507vX0.k0(this.f23413c);
                                c5507vX0.l0("audio/mp4a-latm");
                                c5507vX0.i0(this.f23433w);
                                c5507vX0.e(this.f23432v);
                                c5507vX0.f(this.f23430t);
                                c5507vX0.o0(Collections.singletonList(bArr));
                                c5507vX0.d0(this.f23411a);
                                c5507vX0.f0(this.f23412b);
                                JY0 jy0M = c5507vX0.m();
                                if (!jy0M.equals(this.f23418h)) {
                                    this.f23418h = jy0M;
                                    this.f23431u = 1024000000 / ((long) jy0M.f19907H);
                                    this.f23416f.f(jy0M);
                                }
                            } else {
                                c4436n10.h(((int) b(c4436n10)) - a(c4436n10));
                            }
                            int iJ5 = c4436n10.j(3);
                            this.f23427q = iJ5;
                            if (iJ5 == 0) {
                                c4436n10.h(8);
                            } else if (iJ5 == 1) {
                                c4436n10.h(9);
                            } else if (iJ5 == 3 || iJ5 == 4 || iJ5 == 5) {
                                c4436n10.h(6);
                            } else {
                                if (iJ5 != 6 && iJ5 != 7) {
                                    throw new IllegalStateException();
                                }
                                c4436n10.h(1);
                            }
                            boolean zI2 = c4436n10.i();
                            this.f23428r = zI2;
                            this.f23429s = 0L;
                            if (zI2) {
                                if (i11 != 1) {
                                    do {
                                        zI = c4436n10.i();
                                        this.f23429s = (this.f23429s << 8) + ((long) c4436n10.j(8));
                                    } while (zI);
                                } else {
                                    this.f23429s = b(c4436n10);
                                }
                            }
                            if (c4436n10.i()) {
                                c4436n10.h(8);
                            }
                        }
                        if (this.f23425o != 0) {
                            throw C2817a9.b(null, null);
                        }
                        if (this.f23426p != 0) {
                            throw C2817a9.b(null, null);
                        }
                        if (this.f23427q != 0) {
                            throw C2817a9.b(null, null);
                        }
                        int i14 = 0;
                        while (true) {
                            int iJ6 = c4436n10.j(8);
                            i10 = i14 + iJ6;
                            if (iJ6 != 255) {
                                break;
                            } else {
                                i14 = i10;
                            }
                        }
                        int iD2 = c4436n10.d();
                        if ((iD2 & 7) == 0) {
                            this.f23414d.G(iD2 >> 3);
                        } else {
                            P10 p11 = this.f23414d;
                            c4436n10.l(p11.H(), 0, i10 * 8);
                            p11.G(0);
                        }
                        this.f23416f.b(this.f23414d, i10);
                        AbstractC2418Ss0.i(this.f23423m != -9223372036854775807L);
                        this.f23416f.c(this.f23423m, 1, i10, 0, null);
                        this.f23423m += this.f23431u;
                        if (this.f23428r) {
                            c4436n10.h((int) this.f23429s);
                        }
                        this.f23419i = 0;
                    } else {
                        continue;
                    }
                } else {
                    int iR2 = ((this.f23422l & (-225)) << 8) | p10.R();
                    this.f23421k = iR2;
                    P10 p12 = this.f23414d;
                    if (iR2 > p12.H().length) {
                        p12.z(iR2);
                        C4436n10 c4436n11 = this.f23415e;
                        byte[] bArrH = p12.H();
                        c4436n11.b(bArrH, bArrH.length);
                    }
                    this.f23420j = 0;
                    this.f23419i = 3;
                }
            } else if (p10.R() == 86) {
                this.f23419i = 1;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.I6
    public final void zza() {
        this.f23419i = 0;
        this.f23423m = -9223372036854775807L;
        this.f23424n = false;
    }
}
