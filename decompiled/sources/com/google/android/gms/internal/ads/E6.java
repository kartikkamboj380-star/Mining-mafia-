package com.google.android.gms.internal.ads;

import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import java.util.Arrays;
import java.util.Collections;

/* JADX INFO: loaded from: classes2.dex */
public final class E6 implements I6 {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private static final byte[] f18385x = {73, 68, 51};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f18386a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f18389d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f18390e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final String f18391f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private String f18392g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private InterfaceC5570w2 f18393h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private InterfaceC5570w2 f18394i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f18395j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f18396k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f18397l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f18398m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f18399n;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f18402q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private boolean f18403r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f18405t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private InterfaceC5570w2 f18407v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private long f18408w;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C4436n10 f18387b = new C4436n10(new byte[7], 7);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final P10 f18388c = new P10(Arrays.copyOf(f18385x, 10));

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f18400o = -1;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f18401p = -1;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private long f18404s = -9223372036854775807L;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private long f18406u = -9223372036854775807L;

    public E6(boolean z9, String str, int i10, String str2) {
        this.f18386a = z9;
        this.f18389d = str;
        this.f18390e = i10;
        this.f18391f = str2;
        d();
    }

    public static boolean a(int i10) {
        return (i10 & 65526) == 65520;
    }

    private final void b() {
        this.f18399n = false;
        d();
    }

    private final boolean c(P10 p10, byte[] bArr, int i10) {
        int iMin = Math.min(p10.C(), i10 - this.f18396k);
        p10.L(bArr, this.f18396k, iMin);
        int i11 = this.f18396k + iMin;
        this.f18396k = i11;
        return i11 == i10;
    }

    private final void d() {
        this.f18395j = 0;
        this.f18396k = 0;
        this.f18397l = IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER;
    }

    private final void e(InterfaceC5570w2 interfaceC5570w2, long j10, int i10, int i11) {
        this.f18395j = 4;
        this.f18396k = i10;
        this.f18407v = interfaceC5570w2;
        this.f18408w = j10;
        this.f18405t = i11;
    }

    private final void f() {
        this.f18395j = 3;
        this.f18396k = 0;
    }

    private static final boolean g(byte b10, byte b11) {
        return a((b11 & 255) | 65280);
    }

    private static final boolean h(P10 p10, byte[] bArr, int i10) {
        if (p10.C() < i10) {
            return false;
        }
        p10.L(bArr, 0, i10);
        return true;
    }

    @Override // com.google.android.gms.internal.ads.I6
    public final void l0(boolean z9) {
    }

    @Override // com.google.android.gms.internal.ads.I6
    public final void m0(L1 l10, C5706x7 c5706x7) {
        c5706x7.a();
        this.f18392g = c5706x7.c();
        InterfaceC5570w2 interfaceC5570w2B = l10.b(c5706x7.b(), 1);
        this.f18393h = interfaceC5570w2B;
        this.f18407v = interfaceC5570w2B;
        if (!this.f18386a) {
            this.f18394i = new F1();
            return;
        }
        c5706x7.a();
        InterfaceC5570w2 interfaceC5570w2B2 = l10.b(c5706x7.b(), 5);
        this.f18394i = interfaceC5570w2B2;
        C5507vX0 c5507vX0 = new C5507vX0();
        c5507vX0.A(c5706x7.c());
        c5507vX0.k0(this.f18391f);
        c5507vX0.l0("application/id3");
        interfaceC5570w2B2.f(c5507vX0.m());
    }

    @Override // com.google.android.gms.internal.ads.I6
    public final void n0(long j10, int i10) {
        this.f18406u = j10;
    }

    /* JADX WARN: Code duplicated, block: B:143:0x0247 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:144:0x0247 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:145:0x0247 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:57:0x01ca  */
    /* JADX WARN: Code duplicated, block: B:71:0x01ff  */
    /* JADX WARN: Code duplicated, block: B:73:0x020d  */
    /* JADX WARN: Code duplicated, block: B:75:0x0218  */
    /* JADX WARN: Code duplicated, block: B:77:0x021c  */
    /* JADX WARN: Code duplicated, block: B:79:0x0220  */
    /* JADX WARN: Code duplicated, block: B:84:0x022f  */
    @Override // com.google.android.gms.internal.ads.I6
    public final void o0(P10 p10) {
        int i10;
        boolean z9;
        int i11;
        int iJ;
        byte[] bArrH;
        int iD;
        int i12;
        byte b10;
        int i13;
        int i14;
        int i15;
        byte b11;
        this.f18393h.getClass();
        String str = AbstractC4634ob0.f32117a;
        while (p10.C() > 0) {
            int i16 = this.f18395j;
            char c10 = 7;
            int i17 = 3;
            int i18 = 2;
            if (i16 == 0) {
                byte[] bArrH2 = p10.H();
                int iF = p10.F();
                int iD2 = p10.D();
                while (true) {
                    if (iF < iD2) {
                        int i19 = iF + 1;
                        byte b12 = bArrH2[iF];
                        int i20 = b12 & 255;
                        int i21 = i17;
                        if (this.f18397l == 512 && g((byte) -1, (byte) i20)) {
                            if (!this.f18399n) {
                                int i22 = iF - 1;
                                p10.G(iF);
                                C4436n10 c4436n10 = this.f18387b;
                                if (h(p10, c4436n10.f31642a, 1)) {
                                    c4436n10.f(4);
                                    int iJ2 = c4436n10.j(1);
                                    int i23 = this.f18400o;
                                    if (i23 != -1 && iJ2 != i23) {
                                        c10 = 7;
                                    } else if (this.f18401p == -1) {
                                        if (h(p10, c4436n10.f31642a, 4)) {
                                            c4436n10.f(14);
                                            iJ = c4436n10.j(13);
                                            c10 = 7;
                                            if (iJ >= 7) {
                                                bArrH = p10.H();
                                                iD = p10.D();
                                                i12 = i22 + iJ;
                                                if (i12 >= iD) {
                                                    b10 = bArrH[i12];
                                                    if (b10 == -1) {
                                                        i15 = i12 + 1;
                                                        if (i15 != iD) {
                                                            b11 = bArrH[i15];
                                                            if (g((byte) -1, b11) || ((b11 & 8) >> 3) != iJ2) {
                                                            }
                                                        }
                                                    } else if (b10 == 73 || ((i13 = i12 + 1) != iD && (bArrH[i13] != 68 || ((i14 = i12 + 2) != iD && bArrH[i14] != 51)))) {
                                                    }
                                                }
                                            }
                                        }
                                    } else if (h(p10, c4436n10.f31642a, 1)) {
                                        c4436n10.f(i18);
                                        if (c4436n10.j(4) == this.f18401p) {
                                            p10.G(iF + 1);
                                            if (h(p10, c4436n10.f31642a, 4)) {
                                                c4436n10.f(14);
                                                iJ = c4436n10.j(13);
                                                c10 = 7;
                                                if (iJ >= 7) {
                                                    bArrH = p10.H();
                                                    iD = p10.D();
                                                    i12 = i22 + iJ;
                                                    if (i12 >= iD) {
                                                        b10 = bArrH[i12];
                                                        if (b10 == -1) {
                                                            i15 = i12 + 1;
                                                            if (i15 != iD) {
                                                                b11 = bArrH[i15];
                                                                if (g((byte) -1, b11)) {
                                                                }
                                                            }
                                                        } else if (b10 == 73) {
                                                        }
                                                    }
                                                }
                                            }
                                        } else {
                                            c10 = 7;
                                        }
                                    }
                                } else {
                                    c10 = 7;
                                }
                            }
                            this.f18402q = (b12 & 8) >> 3;
                            this.f18398m = 1 == ((b12 & 1) ^ 1);
                            if (this.f18399n) {
                                f();
                            } else {
                                this.f18395j = 1;
                                this.f18396k = 0;
                            }
                            p10.G(i19);
                        } else {
                            c10 = c10;
                        }
                        int i24 = this.f18397l;
                        int i25 = i24 | i20;
                        if (i25 == 329) {
                            i10 = 2;
                            z9 = false;
                            i11 = 768;
                        } else if (i25 == 511) {
                            i10 = 2;
                            z9 = false;
                            i11 = IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING;
                        } else if (i25 == 836) {
                            i10 = 2;
                            z9 = false;
                            i11 = IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET;
                        } else if (i25 == 1075) {
                            this.f18395j = 2;
                            this.f18396k = i21;
                            this.f18405t = 0;
                            this.f18388c.G(0);
                            p10.G(i19);
                        } else if (i24 != 256) {
                            this.f18397l = IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER;
                            i17 = i21;
                            i18 = 2;
                        } else {
                            i21 = i21;
                            i10 = 2;
                            z9 = false;
                            iF = i19;
                            i17 = i21;
                            i18 = i10;
                        }
                        this.f18397l = i11;
                        iF = i19;
                        i17 = i21;
                        i18 = i10;
                    } else {
                        p10.G(iF);
                    }
                }
            } else if (i16 != 1) {
                if (i16 == 2) {
                    P10 p11 = this.f18388c;
                    if (c(p10, p11.H(), 10)) {
                        this.f18394i.b(p11, 10);
                        p11.G(6);
                        e(this.f18394i, 0L, 10, p11.g() + 10);
                    }
                } else if (i16 != 3) {
                    int iMin = Math.min(p10.C(), this.f18405t - this.f18396k);
                    this.f18407v.b(p10, iMin);
                    int i26 = this.f18396k + iMin;
                    this.f18396k = i26;
                    if (i26 == this.f18405t) {
                        AbstractC2418Ss0.i(this.f18406u != -9223372036854775807L);
                        this.f18407v.c(this.f18406u, 1, this.f18405t, 0, null);
                        this.f18406u += this.f18408w;
                        d();
                    }
                } else {
                    int i27 = true != this.f18398m ? 5 : 7;
                    C4436n10 c4436n11 = this.f18387b;
                    if (c(p10, c4436n11.f31642a, i27)) {
                        c4436n11.f(0);
                        if (this.f18403r) {
                            c4436n11.h(10);
                        } else {
                            int iJ3 = c4436n11.j(2) + 1;
                            if (iJ3 != 2) {
                                StringBuilder sb = new StringBuilder(String.valueOf(iJ3).length() + 50);
                                sb.append("Detected audio object type: ");
                                sb.append(iJ3);
                                sb.append(", but assuming AAC LC.");
                                YU.c("AdtsReader", sb.toString());
                            }
                            c4436n11.h(5);
                            int iJ4 = c4436n11.j(3);
                            int i28 = this.f18401p;
                            byte[] bArr = {(byte) (((i28 >> 1) & 7) | 16), (byte) (((iJ4 << 3) & 120) | ((i28 << 7) & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT))};
                            C3429f1 c3429f1A = AbstractC3555g1.a(bArr);
                            C5507vX0 c5507vX0 = new C5507vX0();
                            c5507vX0.A(this.f18392g);
                            c5507vX0.k0(this.f18391f);
                            c5507vX0.l0("audio/mp4a-latm");
                            c5507vX0.i0(c3429f1A.f28124c);
                            c5507vX0.e(c3429f1A.f28123b);
                            c5507vX0.f(c3429f1A.f28122a);
                            c5507vX0.o0(Collections.singletonList(bArr));
                            c5507vX0.d0(this.f18389d);
                            c5507vX0.f0(this.f18390e);
                            JY0 jy0M = c5507vX0.m();
                            this.f18404s = 1024000000 / ((long) jy0M.f19907H);
                            this.f18393h.f(jy0M);
                            this.f18403r = true;
                        }
                        c4436n11.h(4);
                        int iJ5 = c4436n11.j(13);
                        int i29 = iJ5 - 7;
                        if (this.f18398m) {
                            i29 = iJ5 - 9;
                        }
                        e(this.f18393h, this.f18404s, 0, i29);
                    }
                }
            } else if (p10.C() != 0) {
                C4436n10 c4436n12 = this.f18387b;
                c4436n12.f31642a[0] = p10.H()[p10.F()];
                c4436n12.f(2);
                int iJ6 = c4436n12.j(4);
                int i30 = this.f18401p;
                if (i30 == -1 || iJ6 == i30) {
                    if (!this.f18399n) {
                        this.f18399n = true;
                        this.f18400o = this.f18402q;
                        this.f18401p = iJ6;
                    }
                    f();
                } else {
                    b();
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.I6
    public final void zza() {
        this.f18406u = -9223372036854775807L;
        b();
    }
}
