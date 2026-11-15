package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.c2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C3054c2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f26992a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f26993b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f26994c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f26995d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f26996e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f26997f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f26998g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f26999h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f27000i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f27001j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f27002k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final float f27003l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f27004m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final String f27005n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final C1683Eo0 f27006o;

    private C3054c2(List list, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i20, int i21, float f10, int i22, String str, C1683Eo0 c1683Eo0) {
        this.f26992a = list;
        this.f26993b = i10;
        this.f26994c = i11;
        this.f26995d = i14;
        this.f26996e = i15;
        this.f26997f = i16;
        this.f26998g = i17;
        this.f26999h = i18;
        this.f27000i = i19;
        this.f27001j = i20;
        this.f27002k = i21;
        this.f27003l = f10;
        this.f27004m = i22;
        this.f27005n = str;
        this.f27006o = c1683Eo0;
    }

    public static C3054c2 a(P10 p10) {
        return c(p10, false, null);
    }

    public static C3054c2 b(P10 p10, C1683Eo0 c1683Eo0) {
        return c(p10, true, c1683Eo0);
    }

    /* JADX WARN: Code duplicated, block: B:115:0x0296  */
    /* JADX WARN: Code duplicated, block: B:116:0x0299  */
    /* JADX WARN: Code duplicated, block: B:39:0x0133 A[PHI: r34
      0x0133: PHI (r34v2 int) = (r34v0 int), (r34v0 int), (r34v0 int), (r34v0 int), (r34v3 int) binds: [B:41:0x013c, B:42:0x013e, B:96:0x023e, B:97:0x0240, B:38:0x0131] A[DONT_GENERATE, DONT_INLINE]] */
    private static C3054c2 c(P10 p10, boolean z9, C1683Eo0 c1683Eo0) throws C2817a9 {
        boolean z10;
        boolean z11;
        String str;
        int i10;
        int i11;
        C1471Am0 c1471Am0;
        int i12;
        int iMax;
        int i13;
        int iMax2;
        int i14;
        int i15;
        int i16 = 4;
        boolean z12 = true;
        if (z9) {
            try {
                p10.J(4);
            } catch (ArrayIndexOutOfBoundsException e10) {
                e = e10;
                z11 = true;
                if (z11 != z9) {
                    str = "HEVC config";
                } else {
                    str = "L-HEVC config";
                }
                throw C2817a9.b("Error parsing".concat(str), e);
            }
        } else {
            try {
                p10.J(21);
            } catch (ArrayIndexOutOfBoundsException e11) {
                e = e11;
                z10 = z12;
                z11 = z10;
                if (z11 != z9) {
                    str = "HEVC config";
                } else {
                    str = "L-HEVC config";
                }
                throw C2817a9.b("Error parsing".concat(str), e);
            }
        }
        int iR = p10.R() & 3;
        int iR2 = p10.R();
        int iF = p10.F();
        int i17 = 0;
        int i18 = 0;
        for (int i19 = 0; i19 < iR2; i19++) {
            p10.J(1);
            int iS = p10.S();
            for (int i20 = 0; i20 < iS; i20++) {
                int iS2 = p10.S();
                i18 += iS2 + 4;
                p10.J(iS2);
            }
        }
        p10.G(iF);
        byte[] bArr = new byte[i18];
        C1683Eo0 c1683Eo1 = c1683Eo0;
        int i21 = 0;
        float f10 = 1.0f;
        int i22 = -1;
        int i23 = -1;
        int i24 = -1;
        int i25 = -1;
        int i26 = -1;
        int i27 = -1;
        int i28 = -1;
        int i29 = -1;
        int i30 = -1;
        int i31 = -1;
        int i32 = -1;
        int i33 = -1;
        String strB = null;
        int i34 = 0;
        while (i34 < iR2) {
            int iR3 = p10.R() & 63;
            int iS3 = p10.S();
            z10 = z12;
            int i35 = i17;
            C1683Eo0 c1683Eo0F = c1683Eo1;
            while (i35 < iS3) {
                try {
                    int iS4 = p10.S();
                    int i36 = i35;
                    System.arraycopy(AbstractC4034jq0.f30572a, i17, bArr, i21, i16);
                    int i37 = i21 + 4;
                    System.arraycopy(p10.H(), p10.F(), bArr, i37, iS4);
                    int i38 = 32;
                    if (iR3 == 32) {
                        if (i36 == 0) {
                            c1683Eo0F = AbstractC4034jq0.f(bArr, i37, i37 + iS4);
                            i11 = i37;
                            i10 = iR;
                            i15 = 0;
                            i14 = 0;
                        }
                        i21 = i11 + iS4;
                        p10.J(iS4);
                        i35 = i15 + 1;
                        i17 = i14;
                        iR = i10;
                        i16 = 4;
                    } else {
                        i38 = iR3;
                    }
                    i10 = iR;
                    if (i38 != 33) {
                        i11 = i37;
                        int i39 = 8;
                        if (i38 == 39 && i36 == 0) {
                            int i40 = i21 + 6;
                            int i41 = (i11 + iS4) - 1;
                            while (true) {
                                byte b10 = bArr[i41];
                                if (b10 != 0) {
                                    if (b10 == 0 || i41 <= i40) {
                                        break;
                                    }
                                    C1999Kq0 c1999Kq0 = new C1999Kq0(bArr, i40, i41 + 1);
                                    while (true) {
                                        if (c1999Kq0.d(16)) {
                                            int i42 = i39;
                                            int iF2 = c1999Kq0.f(i42);
                                            int i43 = 0;
                                            while (iF2 == 255) {
                                                i43 += 255;
                                                iF2 = c1999Kq0.f(i42);
                                            }
                                            int i44 = i43 + iF2;
                                            int iF3 = c1999Kq0.f(i42);
                                            int i45 = 0;
                                            while (iF3 == 255) {
                                                i45 += 255;
                                                iF3 = c1999Kq0.f(8);
                                            }
                                            i39 = 8;
                                            int i46 = i45 + iF3;
                                            if (i46 == 0 || !c1999Kq0.d(i46)) {
                                                break;
                                            }
                                            if (i44 == 176) {
                                                int iG = c1999Kq0.g();
                                                boolean zE = c1999Kq0.e();
                                                int iG2 = zE ? c1999Kq0.g() : 0;
                                                int iG3 = c1999Kq0.g();
                                                int iG4 = -1;
                                                int iG5 = -1;
                                                int i47 = -1;
                                                int iF4 = -1;
                                                int i48 = -1;
                                                int iF5 = -1;
                                                int i49 = 0;
                                                while (true) {
                                                    if (i49 > iG3) {
                                                        c1471Am0 = new C1471Am0(iG, iG2, iG3 + 1, iG4, iG5, i47, iF4, i48, iF5);
                                                        break;
                                                    }
                                                    iG4 = c1999Kq0.g();
                                                    iG5 = c1999Kq0.g();
                                                    boolean z13 = zE;
                                                    int iF6 = c1999Kq0.f(6);
                                                    if (iF6 != 63) {
                                                        if (iF6 == 0) {
                                                            i12 = iF6;
                                                            iMax = Math.max(0, iG - 30);
                                                        } else {
                                                            i12 = iF6;
                                                            iMax = Math.max(0, (i12 + iG) - 31);
                                                        }
                                                        iF4 = c1999Kq0.f(iMax);
                                                        if (z13) {
                                                            int iF7 = c1999Kq0.f(6);
                                                            if (iF7 != 63) {
                                                                if (iF7 == 0) {
                                                                    i13 = iF7;
                                                                    iMax2 = Math.max(0, iG2 - 30);
                                                                } else {
                                                                    i13 = iF7;
                                                                    iMax2 = Math.max(0, (i13 + iG2) - 31);
                                                                }
                                                                iF5 = c1999Kq0.f(iMax2);
                                                                i48 = i13;
                                                            }
                                                        }
                                                        if (c1999Kq0.e()) {
                                                            c1999Kq0.b(10);
                                                        }
                                                        i49++;
                                                        zE = z13;
                                                        i47 = i12;
                                                    }
                                                }
                                            } else {
                                                c1999Kq0.b(i46 * 8);
                                            }
                                        }
                                    }
                                } else if (i41 > i40) {
                                    i41--;
                                }
                                c1471Am0 = null;
                                break;
                            }
                            if (c1471Am0 == null || c1683Eo0F == null) {
                                i14 = 0;
                            } else {
                                i14 = 0;
                                if (c1471Am0.f17403a == ((C5279tj0) c1683Eo0F.f18570a.get(0)).f33468b) {
                                    i15 = i36;
                                    i32 = 4;
                                } else {
                                    i32 = 5;
                                }
                            }
                            i15 = i36;
                        } else {
                            i14 = 0;
                            i15 = i36;
                        }
                    } else if (i36 == 0) {
                        C3024bn0 c3024bn0G = AbstractC4034jq0.g(bArr, i37, i37 + iS4, c1683Eo0F);
                        int i50 = c3024bn0G.f26918a + 1;
                        int i51 = c3024bn0G.f26922e;
                        int i52 = c3024bn0G.f26923f;
                        int i53 = c3024bn0G.f26924g;
                        i11 = i37;
                        int i54 = c3024bn0G.f26925h;
                        int i55 = c3024bn0G.f26920c + 8;
                        int i56 = c3024bn0G.f26921d + 8;
                        int i57 = c3024bn0G.f26928k;
                        int i58 = c3024bn0G.f26929l;
                        int i59 = c3024bn0G.f26930m;
                        float f11 = c3024bn0G.f26926i;
                        int i60 = c3024bn0G.f26927j;
                        C5659wk0 c5659wk0 = c3024bn0G.f26919b;
                        if (c5659wk0 != null) {
                            strB = GM.b(c5659wk0.f34614a, c5659wk0.f34615b, c5659wk0.f34616c, c5659wk0.f34617d, c5659wk0.f34618e, c5659wk0.f34619f);
                        }
                        i31 = i59;
                        f10 = f11;
                        i33 = i60;
                        i15 = i36;
                        i28 = i56;
                        i29 = i57;
                        i30 = i58;
                        i25 = i53;
                        i26 = i54;
                        i27 = i55;
                        i14 = 0;
                        i23 = i51;
                        i24 = i52;
                        i22 = i50;
                    } else {
                        i11 = i37;
                        i14 = 0;
                        i15 = i36;
                    }
                    i21 = i11 + iS4;
                    p10.J(iS4);
                    i35 = i15 + 1;
                    i17 = i14;
                    iR = i10;
                    i16 = 4;
                } catch (ArrayIndexOutOfBoundsException e12) {
                    e = e12;
                    z11 = z10;
                    if (z11 != z9) {
                        str = "HEVC config";
                    } else {
                        str = "L-HEVC config";
                    }
                    throw C2817a9.b("Error parsing".concat(str), e);
                }
            }
            i34++;
            c1683Eo1 = c1683Eo0F;
            z12 = z10;
            iR = iR;
            i16 = 4;
        }
        z10 = z12;
        return new C3054c2(i18 == 0 ? Collections.EMPTY_LIST : Collections.singletonList(bArr), iR + 1, i22, i23, i24, i25, i26, i27, i28, i29, i30, i31, i32, f10, i33, strB, c1683Eo1);
    }
}
