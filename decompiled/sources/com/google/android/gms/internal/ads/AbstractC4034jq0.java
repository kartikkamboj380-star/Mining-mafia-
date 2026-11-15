package com.google.android.gms.internal.ads;

import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.unity3d.services.core.device.MimeTypes;
import java.lang.reflect.Array;
import java.math.RoundingMode;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.jq0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC4034jq0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final byte[] f30572a = {0, 0, 0, 1};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final float[] f30573b = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 2.1818182f, 1.8181819f, 2.909091f, 2.4242425f, 1.6363636f, 1.3636364f, 1.939394f, 1.6161616f, 1.3333334f, 1.5f, 2.0f};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Object f30574c = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static int[] f30575d = new int[10];

    public static int a(byte[] bArr, int i10) {
        int i11;
        synchronized (f30574c) {
            int i12 = 0;
            int i13 = 0;
            while (i12 < i10) {
                while (true) {
                    try {
                        if (i12 >= i10 - 2) {
                            i12 = i10;
                            break;
                        }
                        int i14 = i12 + 1;
                        if (bArr[i12] == 0 && bArr[i14] == 0 && bArr[i12 + 2] == 3) {
                            break;
                        }
                        i12 = i14;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (i12 < i10) {
                    int[] iArr = f30575d;
                    int length = iArr.length;
                    if (length <= i13) {
                        f30575d = Arrays.copyOf(iArr, length + length);
                    }
                    f30575d[i13] = i12;
                    i12 += 3;
                    i13++;
                }
            }
            i11 = i10 - i13;
            int i15 = 0;
            int i16 = 0;
            for (int i17 = 0; i17 < i13; i17++) {
                int i18 = f30575d[i17] - i15;
                System.arraycopy(bArr, i15, bArr, i16, i18);
                int i19 = i16 + i18;
                int i20 = i19 + 1;
                bArr[i19] = 0;
                i16 = i19 + 2;
                bArr[i20] = 0;
                i15 += i18 + 3;
            }
            System.arraycopy(bArr, i15, bArr, i16, i11 - i16);
        }
        return i11;
    }

    public static boolean b(JY0 jy0, byte b10) {
        String strQ = q(jy0);
        if (Objects.equals(strQ, MimeTypes.VIDEO_H264) && (b10 & 31) == 6) {
            return true;
        }
        return Objects.equals(strQ, MimeTypes.VIDEO_H265) && ((b10 & 126) >> 1) == 39;
    }

    public static int c(JY0 jy0) {
        String strQ = q(jy0);
        if (Objects.equals(strQ, MimeTypes.VIDEO_H264)) {
            return 1;
        }
        return Objects.equals(strQ, MimeTypes.VIDEO_H265) ? 2 : 0;
    }

    public static boolean d(byte[] bArr, int i10, int i11, JY0 jy0) {
        String str = jy0.f19929o;
        if (Objects.equals(str, MimeTypes.VIDEO_H264)) {
            byte b10 = bArr[4];
            if (((b10 & 96) >> 5) != 0) {
                return true;
            }
            int i12 = b10 & 31;
            return (i12 == 1 || i12 == 9 || i12 == 14) ? false : true;
        }
        if (Objects.equals(str, MimeTypes.VIDEO_H265)) {
            C2556Vj0 c2556Vj0L = l(new C1999Kq0(bArr, 4, i11 + 4));
            int i13 = c2556Vj0L.f24354a;
            if (i13 == 35) {
                return false;
            }
            return (i13 <= 14 && i13 % 2 == 0 && c2556Vj0L.f24356c == jy0.f19905F + (-1)) ? false : true;
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x01a5  */
    /* JADX WARN: Code duplicated, block: B:102:0x01aa  */
    /* JADX WARN: Code duplicated, block: B:105:0x01d0  */
    /* JADX WARN: Code duplicated, block: B:108:0x01d9  */
    /* JADX WARN: Code duplicated, block: B:110:0x01e4  */
    /* JADX WARN: Code duplicated, block: B:111:0x01e7  */
    /* JADX WARN: Code duplicated, block: B:114:0x01ee  */
    /* JADX WARN: Code duplicated, block: B:116:0x0208  */
    /* JADX WARN: Code duplicated, block: B:117:0x020c  */
    /* JADX WARN: Code duplicated, block: B:120:0x0215  */
    /* JADX WARN: Code duplicated, block: B:123:0x0221  */
    /* JADX WARN: Code duplicated, block: B:126:0x022c  */
    /* JADX WARN: Code duplicated, block: B:129:0x0235  */
    /* JADX WARN: Code duplicated, block: B:132:0x023c  */
    /* JADX WARN: Code duplicated, block: B:135:0x0248  */
    /* JADX WARN: Code duplicated, block: B:137:0x0269  */
    /* JADX WARN: Code duplicated, block: B:142:0x00ab A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:145:0x00a6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:21:0x0059  */
    /* JADX WARN: Code duplicated, block: B:23:0x0061  */
    /* JADX WARN: Code duplicated, block: B:26:0x0076 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:27:0x0078  */
    /* JADX WARN: Code duplicated, block: B:28:0x007a  */
    /* JADX WARN: Code duplicated, block: B:31:0x007f  */
    /* JADX WARN: Code duplicated, block: B:33:0x0085  */
    /* JADX WARN: Code duplicated, block: B:35:0x0088  */
    /* JADX WARN: Code duplicated, block: B:36:0x008b  */
    /* JADX WARN: Code duplicated, block: B:39:0x0094 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:40:0x0096  */
    /* JADX WARN: Code duplicated, block: B:42:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:59:0x0110  */
    /* JADX WARN: Code duplicated, block: B:62:0x0124  */
    /* JADX WARN: Code duplicated, block: B:64:0x0136  */
    /* JADX WARN: Code duplicated, block: B:65:0x0139 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:66:0x013b  */
    /* JADX WARN: Code duplicated, block: B:67:0x013e  */
    /* JADX WARN: Code duplicated, block: B:69:0x0142  */
    /* JADX WARN: Code duplicated, block: B:70:0x0145  */
    /* JADX WARN: Code duplicated, block: B:85:0x016c A[PHI: r2
      0x016c: PHI (r2v6 int) = (r2v4 int), (r2v3 int) binds: [B:87:0x0171, B:83:0x0168] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:86:0x016f A[PHI: r2
      0x016f: PHI (r2v4 int) = (r2v3 int), (r2v3 int), (r2v3 int), (r2v3 int), (r2v3 int), (r2v7 int) binds: [B:74:0x0156, B:76:0x015a, B:78:0x015e, B:80:0x0162, B:82:0x0166, B:84:0x016a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:88:0x0173  */
    /* JADX WARN: Code duplicated, block: B:91:0x017e  */
    /* JADX WARN: Code duplicated, block: B:93:0x0184  */
    /* JADX WARN: Code duplicated, block: B:95:0x018e  */
    /* JADX WARN: Code duplicated, block: B:99:0x01a1  */
    public static C1893Ip0 e(byte[] bArr, int i10, int i11) {
        int iG;
        int i12;
        boolean zE;
        int i13;
        int iG2;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int iH;
        int i19;
        int i20;
        int iG3;
        boolean z9;
        boolean zE2;
        int i21;
        int i22;
        int i23;
        int iG4;
        float f10;
        int i24;
        int i25;
        float f11;
        int i26;
        int i27;
        int iB;
        int iC;
        boolean zE3;
        boolean zE4;
        int i28;
        int iF;
        int iF2;
        int iF3;
        int i29;
        int i30;
        C1999Kq0 c1999Kq0 = new C1999Kq0(bArr, i10, i11);
        int iF4 = c1999Kq0.f(8);
        int iF5 = c1999Kq0.f(8);
        int iF6 = c1999Kq0.f(8);
        int iG5 = c1999Kq0.g();
        if (iF4 == 100 || iF4 == 110 || iF4 == 122 || iF4 == 244 || iF4 == 44 || iF4 == 83 || iF4 == 86 || iF4 == 118 || iF4 == 128) {
            iG = c1999Kq0.g();
            if (iG == 3) {
                zE = c1999Kq0.e();
                i12 = 3;
            } else {
                i12 = iG;
                zE = false;
            }
            i13 = 16;
            int iG6 = c1999Kq0.g();
            iG2 = c1999Kq0.g();
            c1999Kq0.a();
            if (c1999Kq0.e()) {
                if (i12 != 3) {
                    i15 = 8;
                } else {
                    i15 = 12;
                }
                for (i16 = 0; i16 < i15; i16++) {
                    if (!c1999Kq0.e()) {
                        if (i16 < 6) {
                            i17 = 16;
                        } else {
                            i17 = 64;
                        }
                        iH = 8;
                        i19 = 8;
                        for (i18 = 0; i18 < i17; i18++) {
                            if (iH != 0) {
                                iH = ((i19 + c1999Kq0.h()) + IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) % IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER;
                            }
                            if (iH != 0) {
                                i19 = iH;
                            }
                        }
                    }
                }
            }
            i14 = iG6;
        } else if (iF4 == 138) {
            iF4 = 138;
            iG = c1999Kq0.g();
            if (iG == 3) {
                zE = c1999Kq0.e();
                i12 = 3;
            } else {
                i12 = iG;
                zE = false;
            }
            i13 = 16;
            int iG7 = c1999Kq0.g();
            iG2 = c1999Kq0.g();
            c1999Kq0.a();
            if (c1999Kq0.e()) {
                if (i12 != 3) {
                    i15 = 8;
                } else {
                    i15 = 12;
                }
                while (i16 < i15) {
                    if (!c1999Kq0.e()) {
                        if (i16 < 6) {
                            i17 = 16;
                        } else {
                            i17 = 64;
                        }
                        iH = 8;
                        i19 = 8;
                        while (i18 < i17) {
                            if (iH != 0) {
                                iH = ((i19 + c1999Kq0.h()) + IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) % IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER;
                            }
                            if (iH != 0) {
                                i19 = iH;
                            }
                        }
                    }
                }
            }
            i14 = iG7;
        } else {
            iG = 1;
            i13 = 16;
            i14 = 0;
            zE = false;
            iG2 = 0;
        }
        int iG8 = c1999Kq0.g() + 4;
        int iG9 = c1999Kq0.g();
        if (iG9 != 0) {
            if (iG9 == 1) {
                boolean zE5 = c1999Kq0.e();
                c1999Kq0.h();
                c1999Kq0.h();
                long jG = c1999Kq0.g();
                for (int i31 = 0; i31 < jG; i31++) {
                    c1999Kq0.g();
                }
                z9 = zE5;
                iG9 = 1;
                i20 = 244;
                iG3 = 0;
            } else {
                i20 = 244;
                iG3 = 0;
            }
            int iG10 = c1999Kq0.g();
            c1999Kq0.a();
            int iG11 = c1999Kq0.g() + 1;
            int iG12 = c1999Kq0.g() + 1;
            zE2 = c1999Kq0.e();
            i21 = 2 - (zE2 ? 1 : 0);
            if (!zE2) {
                c1999Kq0.a();
            }
            c1999Kq0.a();
            i22 = iG11 * 16;
            i23 = iG12 * i21 * 16;
            if (c1999Kq0.e()) {
                int iG13 = c1999Kq0.g();
                int iG14 = c1999Kq0.g();
                int iG15 = c1999Kq0.g();
                int iG16 = c1999Kq0.g();
                if (iG == 0) {
                    i29 = 1;
                } else {
                    if (iG == 3) {
                        i29 = 1;
                    } else {
                        i29 = 2;
                    }
                    if (iG == 1) {
                        i30 = 2;
                    } else {
                        i30 = 1;
                    }
                    i21 *= i30;
                }
                i22 -= (iG13 + iG14) * i29;
                i23 -= (iG15 + iG16) * i21;
            }
            if (iF4 != 44 || iF4 == 86 || iF4 == 100 || iF4 == 110 || iF4 == 122) {
                if ((iF5 & 16) != 0) {
                    iG4 = 0;
                } else {
                    iG4 = i13;
                }
            } else if (iF4 == i20) {
                iF4 = i20;
                if ((iF5 & 16) != 0) {
                    iG4 = 0;
                } else {
                    iG4 = i13;
                }
            } else {
                iG4 = i13;
            }
            f10 = 1.0f;
            i24 = -1;
            if (c1999Kq0.e()) {
                if (c1999Kq0.e()) {
                    iF = c1999Kq0.f(8);
                    if (iF == 255) {
                        int i32 = i13;
                        iF2 = c1999Kq0.f(i32);
                        iF3 = c1999Kq0.f(i32);
                        if (iF2 != 0 && iF3 != 0) {
                            f10 = iF2 / iF3;
                        }
                    } else if (iF < 17) {
                        f10 = f30573b[iF];
                    } else {
                        StringBuilder sb = new StringBuilder(String.valueOf(iF).length() + 35);
                        sb.append("Unexpected aspect_ratio_idc value: ");
                        sb.append(iF);
                        YU.c("NalUnitUtil", sb.toString());
                    }
                }
                if (c1999Kq0.e()) {
                    c1999Kq0.a();
                }
                if (c1999Kq0.e()) {
                    c1999Kq0.b(3);
                    if (true != c1999Kq0.e()) {
                        i28 = 2;
                    } else {
                        i28 = 1;
                    }
                    if (c1999Kq0.e()) {
                        int iF7 = c1999Kq0.f(8);
                        int iF8 = c1999Kq0.f(8);
                        c1999Kq0.b(8);
                        iB = C3470fL0.b(iF7);
                        iC = C3470fL0.c(iF8);
                    } else {
                        iB = -1;
                        iC = -1;
                    }
                    i24 = i28;
                } else {
                    iB = -1;
                    iC = -1;
                }
                if (c1999Kq0.e()) {
                    c1999Kq0.g();
                    c1999Kq0.g();
                }
                if (c1999Kq0.e()) {
                    c1999Kq0.b(65);
                }
                zE3 = c1999Kq0.e();
                if (zE3) {
                    p(c1999Kq0);
                }
                zE4 = c1999Kq0.e();
                if (zE4) {
                    p(c1999Kq0);
                }
                if (zE3 || zE4) {
                    c1999Kq0.a();
                }
                c1999Kq0.a();
                if (c1999Kq0.e()) {
                    c1999Kq0.a();
                    c1999Kq0.g();
                    c1999Kq0.g();
                    c1999Kq0.g();
                    c1999Kq0.g();
                    iG4 = c1999Kq0.g();
                    c1999Kq0.g();
                }
                i27 = iC;
                i25 = iG4;
                f11 = f10;
                i26 = i24;
                i24 = iB;
            } else {
                i25 = iG4;
                f11 = 1.0f;
                i26 = -1;
                i27 = -1;
            }
            return new C1893Ip0(iF4, iF5, iF6, iG5, iG10, i22, i23, f11, i14, iG2, zE, zE2, iG8, iG9, iG3, z9, i24, i26, i27, i25);
        }
        iG3 = c1999Kq0.g() + 4;
        i20 = 244;
        z9 = false;
        int iG17 = c1999Kq0.g();
        c1999Kq0.a();
        int iG18 = c1999Kq0.g() + 1;
        int iG19 = c1999Kq0.g() + 1;
        zE2 = c1999Kq0.e();
        i21 = 2 - (zE2 ? 1 : 0);
        if (!zE2) {
            c1999Kq0.a();
        }
        c1999Kq0.a();
        i22 = iG18 * 16;
        i23 = iG19 * i21 * 16;
        if (c1999Kq0.e()) {
            int iG110 = c1999Kq0.g();
            int iG111 = c1999Kq0.g();
            int iG112 = c1999Kq0.g();
            int iG113 = c1999Kq0.g();
            if (iG == 0) {
                i29 = 1;
            } else {
                if (iG == 3) {
                    i29 = 1;
                } else {
                    i29 = 2;
                }
                if (iG == 1) {
                    i30 = 2;
                } else {
                    i30 = 1;
                }
                i21 *= i30;
            }
            i22 -= (iG110 + iG111) * i29;
            i23 -= (iG112 + iG113) * i21;
        }
        if (iF4 != 44) {
            if ((iF5 & 16) != 0) {
                iG4 = 0;
            } else {
                iG4 = i13;
            }
        } else if ((iF5 & 16) != 0) {
            iG4 = 0;
        } else {
            iG4 = i13;
        }
        f10 = 1.0f;
        i24 = -1;
        if (c1999Kq0.e()) {
            if (c1999Kq0.e()) {
                iF = c1999Kq0.f(8);
                if (iF == 255) {
                    int i33 = i13;
                    iF2 = c1999Kq0.f(i33);
                    iF3 = c1999Kq0.f(i33);
                    if (iF2 != 0) {
                        f10 = iF2 / iF3;
                    }
                } else if (iF < 17) {
                    f10 = f30573b[iF];
                } else {
                    StringBuilder sb2 = new StringBuilder(String.valueOf(iF).length() + 35);
                    sb2.append("Unexpected aspect_ratio_idc value: ");
                    sb2.append(iF);
                    YU.c("NalUnitUtil", sb2.toString());
                }
            }
            if (c1999Kq0.e()) {
                c1999Kq0.a();
            }
            if (c1999Kq0.e()) {
                c1999Kq0.b(3);
                if (true != c1999Kq0.e()) {
                    i28 = 2;
                } else {
                    i28 = 1;
                }
                if (c1999Kq0.e()) {
                    int iF9 = c1999Kq0.f(8);
                    int iF10 = c1999Kq0.f(8);
                    c1999Kq0.b(8);
                    iB = C3470fL0.b(iF9);
                    iC = C3470fL0.c(iF10);
                } else {
                    iB = -1;
                    iC = -1;
                }
                i24 = i28;
            } else {
                iB = -1;
                iC = -1;
            }
            if (c1999Kq0.e()) {
                c1999Kq0.g();
                c1999Kq0.g();
            }
            if (c1999Kq0.e()) {
                c1999Kq0.b(65);
            }
            zE3 = c1999Kq0.e();
            if (zE3) {
                p(c1999Kq0);
            }
            zE4 = c1999Kq0.e();
            if (zE4) {
                p(c1999Kq0);
            }
            if (zE3) {
                c1999Kq0.a();
            } else {
                c1999Kq0.a();
            }
            c1999Kq0.a();
            if (c1999Kq0.e()) {
                c1999Kq0.a();
                c1999Kq0.g();
                c1999Kq0.g();
                c1999Kq0.g();
                c1999Kq0.g();
                iG4 = c1999Kq0.g();
                c1999Kq0.g();
            }
            i27 = iC;
            i25 = iG4;
            f11 = f10;
            i26 = i24;
            i24 = iB;
        } else {
            i25 = iG4;
            f11 = 1.0f;
            i26 = -1;
            i27 = -1;
        }
        return new C1893Ip0(iF4, iF5, iF6, iG5, iG17, i22, i23, f11, i14, iG2, zE, zE2, iG8, iG9, iG3, z9, i24, i26, i27, i25);
    }

    /* JADX WARN: Code duplicated, block: B:458:0x0158 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:59:0x0119  */
    /* JADX WARN: Code duplicated, block: B:68:0x0132  */
    /* JADX WARN: Code duplicated, block: B:72:0x0145  */
    /* JADX WARN: Code duplicated, block: B:74:0x014a  */
    /* JADX WARN: Code duplicated, block: B:76:0x0152  */
    /* JADX WARN: Multi-variable type inference failed */
    public static C1683Eo0 f(byte[] bArr, int i10, int i11) {
        int i12;
        C3276do0 c3276do0;
        boolean z9;
        int iF;
        int iF2;
        int iF3;
        int iF4;
        int i13;
        int i14;
        int i15;
        boolean[][] zArr;
        int[] iArr;
        boolean[][] zArr2;
        int[] iArr2;
        int i16;
        int i17;
        boolean zE;
        int i18;
        int i19;
        int i20;
        int iG;
        int i21;
        int i22;
        int i23;
        boolean z10;
        boolean z11;
        C1999Kq0 c1999Kq0 = new C1999Kq0(bArr, i10, i11);
        C2556Vj0 c2556Vj0L = l(c1999Kq0);
        c1999Kq0.b(4);
        boolean zE2 = c1999Kq0.e();
        boolean zE3 = c1999Kq0.e();
        int iF5 = c1999Kq0.f(6);
        int i24 = iF5 + 1;
        int iF6 = c1999Kq0.f(3);
        c1999Kq0.b(17);
        C5659wk0 c5659wk0M = m(c1999Kq0, true, iF6, null);
        for (int i25 = true != c1999Kq0.e() ? iF6 : 0; i25 <= iF6; i25++) {
            c1999Kq0.g();
            c1999Kq0.g();
            c1999Kq0.g();
        }
        int iF7 = c1999Kq0.f(6);
        int iG2 = c1999Kq0.g() + 1;
        int i26 = 6;
        C2662Xk0 c2662Xk0 = new C2662Xk0(AbstractC5931yu0.m(c5659wk0M), new int[1]);
        boolean z12 = i24 >= 2 && iG2 >= 2;
        boolean z13 = zE2 && zE3;
        int i27 = 1;
        int i28 = iF7 + 1;
        if (!z12 || !z13 || i28 < i24) {
            return new C1683Eo0(c2556Vj0L, null, c2662Xk0, null, null);
        }
        Class cls = Integer.TYPE;
        int[][] iArr3 = (int[][]) Array.newInstance((Class<?>) cls, iG2, i28);
        int[] iArr4 = new int[iG2];
        int[] iArr5 = new int[iG2];
        iArr3[0][0] = 0;
        iArr4[0] = 1;
        iArr5[0] = 0;
        for (int i29 = 1; i29 < iG2; i29++) {
            int i30 = 0;
            for (int i31 = 0; i31 <= iF7; i31++) {
                if (c1999Kq0.e()) {
                    iArr3[i29][i30] = i31;
                    iArr5[i29] = i31;
                    i30++;
                }
                iArr4[i29] = i30;
            }
        }
        if (c1999Kq0.e()) {
            c1999Kq0.b(64);
            if (c1999Kq0.e()) {
                c1999Kq0.g();
            }
            int iG3 = c1999Kq0.g();
            int i32 = 0;
            while (i32 < iG3) {
                c1999Kq0.g();
                if (i32 == 0 || c1999Kq0.e()) {
                    boolean zE4 = c1999Kq0.e();
                    boolean zE5 = c1999Kq0.e();
                    if (zE4 || zE5) {
                        zE = c1999Kq0.e();
                        iG3 = iG3;
                        if (zE) {
                            c1999Kq0.b(19);
                        }
                        c1999Kq0.b(8);
                        if (zE) {
                            c1999Kq0.b(4);
                        }
                        c1999Kq0.b(15);
                        i19 = zE4;
                        i18 = zE5;
                    } else {
                        z11 = zE4;
                        z10 = zE5;
                    }
                    i20 = 0;
                    while (i20 <= iF6) {
                        if (!c1999Kq0.e() || c1999Kq0.e()) {
                            c1999Kq0.g();
                        } else {
                            if (c1999Kq0.e()) {
                                iG = 0;
                            }
                            C2556Vj0 c2556Vj0 = c2556Vj0L;
                            i21 = i19 + i18;
                            int[][] iArr6 = iArr3;
                            i22 = 0;
                            while (i22 < i21) {
                                int i33 = i21;
                                for (i23 = 0; i23 <= iG; i23++) {
                                    c1999Kq0.g();
                                    c1999Kq0.g();
                                    if (zE) {
                                        c1999Kq0.g();
                                        c1999Kq0.g();
                                    }
                                    c1999Kq0.a();
                                }
                                i22++;
                                i21 = i33;
                            }
                            i20++;
                            c2556Vj0L = c2556Vj0;
                            iArr3 = iArr6;
                        }
                        iG = c1999Kq0.g();
                        C2556Vj0 c2556Vj1 = c2556Vj0L;
                        i21 = i19 + i18;
                        int[][] iArr7 = iArr3;
                        i22 = 0;
                        while (i22 < i21) {
                            int i34 = i21;
                            while (i23 <= iG) {
                                c1999Kq0.g();
                                c1999Kq0.g();
                                if (zE) {
                                    c1999Kq0.g();
                                    c1999Kq0.g();
                                }
                                c1999Kq0.a();
                            }
                            i22++;
                            i21 = i34;
                        }
                        i20++;
                        c2556Vj0L = c2556Vj1;
                        iArr3 = iArr7;
                    }
                    i32++;
                    iG3 = iG3;
                } else {
                    z11 = false;
                    z10 = false;
                }
                zE = false;
                i19 = z11;
                i18 = z10;
                i20 = 0;
                while (i20 <= iF6) {
                    if (c1999Kq0.e()) {
                        c1999Kq0.g();
                        iG = c1999Kq0.g();
                    } else {
                        c1999Kq0.g();
                        iG = c1999Kq0.g();
                    }
                    C2556Vj0 c2556Vj2 = c2556Vj0L;
                    i21 = i19 + i18;
                    int[][] iArr8 = iArr3;
                    i22 = 0;
                    while (i22 < i21) {
                        int i35 = i21;
                        while (i23 <= iG) {
                            c1999Kq0.g();
                            c1999Kq0.g();
                            if (zE) {
                                c1999Kq0.g();
                                c1999Kq0.g();
                            }
                            c1999Kq0.a();
                        }
                        i22++;
                        i21 = i35;
                    }
                    i20++;
                    c2556Vj0L = c2556Vj2;
                    iArr3 = iArr8;
                }
                i32++;
                iG3 = iG3;
            }
        }
        C2556Vj0 c2556Vj3 = c2556Vj0L;
        int[][] iArr9 = iArr3;
        if (!c1999Kq0.e()) {
            return new C1683Eo0(c2556Vj3, null, c2662Xk0, null, null);
        }
        c1999Kq0.c();
        C5659wk0 c5659wk0M2 = m(c1999Kq0, false, iF6, c5659wk0M);
        boolean zE6 = c1999Kq0.e();
        boolean[] zArr3 = new boolean[16];
        int i36 = 0;
        for (int i37 = 0; i37 < 16; i37++) {
            boolean zE7 = c1999Kq0.e();
            zArr3[i37] = zE7;
            if (zE7) {
                i36++;
            }
        }
        if (i36 == 0 || !zArr3[1]) {
            return new C1683Eo0(c2556Vj3, null, c2662Xk0, null, null);
        }
        int i38 = i36 + 1;
        int[] iArr10 = new int[i36];
        for (int i39 = 0; i39 < i36 - (zE6 ? 1 : 0); i39++) {
            iArr10[i39] = c1999Kq0.f(3);
        }
        int[] iArr11 = new int[i38];
        if (zE6) {
            for (int i40 = 1; i40 < i36; i40++) {
                for (int i41 = 0; i41 < i40; i41++) {
                    iArr11[i40] = iArr11[i40] + iArr10[i41] + 1;
                }
            }
            iArr11[i36] = 6;
        }
        int[][] iArr12 = (int[][]) Array.newInstance((Class<?>) cls, i24, i36);
        int[] iArr13 = new int[i24];
        iArr13[0] = 0;
        boolean zE8 = c1999Kq0.e();
        int i42 = 1;
        while (i42 < i24) {
            if (zE8) {
                iArr13[i42] = c1999Kq0.f(i26);
            } else {
                iArr13[i42] = i42;
            }
            if (zE6) {
                i17 = i42;
                int i43 = 0;
                while (i43 < i36) {
                    int i44 = i43 + 1;
                    iArr12[i17][i43] = (iArr13[i17] & ((1 << iArr11[i44]) - 1)) >> iArr11[i43];
                    i43 = i44;
                }
            } else {
                int i45 = 0;
                while (i45 < i36) {
                    iArr12[i42][i45] = c1999Kq0.f(iArr10[i45] + 1);
                    i45++;
                    i42 = i42;
                }
                i17 = i42;
            }
            i42 = i17 + 1;
            i26 = 6;
        }
        int[] iArr14 = new int[i28];
        int i46 = 1;
        int i47 = 0;
        while (i47 < i24) {
            iArr14[iArr13[i47]] = -1;
            int[] iArr15 = iArr14;
            int i48 = 0;
            int i49 = 0;
            while (i48 < 16) {
                if (zArr3[i48]) {
                    i16 = i27;
                    if (i48 == i16) {
                        iArr15[iArr13[i47]] = iArr12[i47][i49];
                        i48 = i16;
                    }
                    i49++;
                } else {
                    i16 = i27;
                }
                i48 += i16;
                i27 = i16;
            }
            if (i47 > 0) {
                int i50 = 0;
                while (true) {
                    if (i50 >= i47) {
                        i46++;
                        break;
                    }
                    if (iArr15[iArr13[i47]] == iArr15[iArr13[i50]]) {
                        break;
                    }
                    i50++;
                }
            }
            i47++;
            iArr14 = iArr15;
            i27 = 1;
        }
        int[] iArr16 = iArr14;
        int iF8 = c1999Kq0.f(4);
        if (i46 < 2 || iF8 == 0) {
            return new C1683Eo0(c2556Vj3, null, c2662Xk0, null, null);
        }
        int[] iArr17 = new int[i46];
        for (int i51 = 0; i51 < i46; i51++) {
            iArr17[i51] = c1999Kq0.f(iF8);
        }
        int[] iArr18 = new int[i28];
        for (int i52 = 0; i52 < i24; i52++) {
            iArr18[Math.min(iArr13[i52], iF7)] = i52;
        }
        C5553vu0 c5553vu0 = new C5553vu0();
        int i53 = 0;
        while (i53 <= iF7) {
            int[] iArr19 = iArr17;
            int i54 = i46;
            int iMin = Math.min(iArr16[i53], i54 - 1);
            int[] iArr20 = iArr18;
            c5553vu0.g(new C5279tj0(iArr20[i53], iMin >= 0 ? iArr19[iMin] : -1));
            i53++;
            i46 = i54;
            iArr17 = iArr19;
            iArr18 = iArr20;
        }
        AbstractC5931yu0 abstractC5931yu0J = c5553vu0.j();
        if (((C5279tj0) abstractC5931yu0J.get(0)).f33468b == -1) {
            return new C1683Eo0(c2556Vj3, null, c2662Xk0, null, null);
        }
        int i55 = 1;
        while (true) {
            C2556Vj0 c2556Vj4 = c2556Vj3;
            if (i55 > iF7) {
                c2556Vj3 = c2556Vj4;
                i12 = -1;
                i55 = -1;
                break;
            }
            c2556Vj3 = c2556Vj4;
            i12 = -1;
            if (((C5279tj0) abstractC5931yu0J.get(i55)).f33468b != -1) {
                break;
            }
            i55++;
        }
        if (i55 == i12) {
            return new C1683Eo0(c2556Vj3, null, c2662Xk0, null, null);
        }
        Class cls2 = Boolean.TYPE;
        boolean[][] zArr4 = (boolean[][]) Array.newInstance((Class<?>) cls2, i24, i24);
        boolean[][] zArr5 = (boolean[][]) Array.newInstance((Class<?>) cls2, i24, i24);
        int i56 = 1;
        while (i56 < i24) {
            boolean[][] zArr6 = zArr5;
            for (int i57 = 0; i57 < i56; i57++) {
                boolean[] zArr7 = zArr4[i56];
                boolean[] zArr8 = zArr6[i56];
                boolean zE9 = c1999Kq0.e();
                zArr8[i57] = zE9;
                zArr7[i57] = zE9;
            }
            i56++;
            zArr5 = zArr6;
        }
        boolean[][] zArr9 = zArr5;
        for (int i58 = 1; i58 < i24; i58++) {
            int i59 = 0;
            while (i59 < iF5) {
                int i60 = i59;
                for (int i61 = 0; i61 < i58; i61++) {
                    boolean[] zArr10 = zArr9[i58];
                    if (zArr10[i61] && zArr9[i61][i60]) {
                        zArr10[i60] = true;
                        break;
                    }
                }
                i59 = i60 + 1;
            }
        }
        int[] iArr21 = new int[i28];
        int i62 = 0;
        while (i62 < i24) {
            int[] iArr22 = iArr21;
            int i63 = 0;
            for (int i64 = 0; i64 < i62; i64++) {
                i63 += zArr4[i62][i64] ? 1 : 0;
            }
            iArr22[iArr13[i62]] = i63;
            i62++;
            iArr21 = iArr22;
        }
        int[] iArr23 = iArr21;
        int i65 = 0;
        for (int i66 = 0; i66 < i24; i66++) {
            if (iArr23[iArr13[i66]] == 0) {
                i65++;
            }
        }
        if (i65 > 1) {
            return new C1683Eo0(c2556Vj3, null, c2662Xk0, null, null);
        }
        int[] iArr24 = new int[i24];
        int[] iArr25 = new int[iG2];
        if (c1999Kq0.e()) {
            int i67 = 0;
            while (i67 < i24) {
                int i68 = i67;
                iArr24[i68] = c1999Kq0.f(3);
                i67 = i68 + 1;
            }
        } else {
            Arrays.fill(iArr24, 0, i24, iF6);
        }
        int i69 = 0;
        while (i69 < iG2) {
            int[] iArr26 = iArr24;
            int i70 = i69;
            int[] iArr27 = iArr13;
            int iMax = 0;
            for (int i71 = 0; i71 < iArr4[i70]; i71++) {
                iMax = Math.max(iMax, iArr26[((C5279tj0) abstractC5931yu0J.get(iArr9[i70][i71])).f33467a]);
            }
            iArr25[i70] = iMax + 1;
            i69 = i70 + 1;
            iArr24 = iArr26;
            iArr13 = iArr27;
        }
        int[] iArr28 = iArr13;
        if (c1999Kq0.e()) {
            int i72 = 0;
            while (i72 < iF5) {
                int i73 = i72 + 1;
                int i74 = i73;
                while (i74 < i24) {
                    if (zArr4[i74][i72]) {
                        c1999Kq0.b(3);
                    }
                    i74++;
                    i72 = i72;
                }
                i72 = i73;
            }
        }
        c1999Kq0.a();
        int iG4 = c1999Kq0.g() + 1;
        C5553vu0 c5553vu1 = new C5553vu0();
        c5553vu1.g(c5659wk0M);
        if (iG4 > 1) {
            c5553vu1.g(c5659wk0M2);
            for (int i75 = 2; i75 < iG4; i75++) {
                c5659wk0M2 = m(c1999Kq0, c1999Kq0.e(), iF6, c5659wk0M2);
                c5553vu1.g(c5659wk0M2);
            }
        }
        AbstractC5931yu0 abstractC5931yu0J2 = c5553vu1.j();
        int iG5 = c1999Kq0.g() + iG2;
        if (iG5 > iG2) {
            return new C1683Eo0(c2556Vj3, null, c2662Xk0, null, null);
        }
        int iF9 = c1999Kq0.f(2);
        boolean[][] zArr11 = (boolean[][]) Array.newInstance((Class<?>) cls2, iG5, i28);
        int[] iArr29 = new int[iG5];
        int i76 = 0;
        int[] iArr30 = new int[iG5];
        int i77 = 0;
        while (i77 < iG2) {
            iArr29[i77] = i76;
            int i78 = i77;
            int i79 = iArr5[i78];
            iArr30[i78] = i79;
            if (iF9 == 0) {
                iArr = iArr5;
                zArr2 = zArr11;
                iArr2 = iArr29;
                Arrays.fill(zArr11[i78], i76, iArr4[i78], true);
                iArr2[i78] = iArr4[i78];
            } else {
                iArr = iArr5;
                zArr2 = zArr11;
                iArr2 = iArr29;
                if (iF9 == 1) {
                    for (int i80 = 0; i80 < iArr4[i78]; i80++) {
                        zArr2[i78][i80] = iArr9[i78][i80] == i79;
                    }
                    iArr2[i78] = 1;
                } else {
                    i76 = 0;
                    zArr2[0][0] = true;
                    iArr2[0] = 1;
                }
                i77 = i78 + 1;
                iArr5 = iArr;
                zArr11 = zArr2;
                iArr29 = iArr2;
            }
            i76 = 0;
            i77 = i78 + 1;
            iArr5 = iArr;
            zArr11 = zArr2;
            iArr29 = iArr2;
        }
        boolean[][] zArr12 = zArr11;
        int[] iArr31 = iArr29;
        int[] iArr32 = new int[i28];
        int i81 = 2;
        int[] iArr33 = new int[2];
        iArr33[1] = i28;
        iArr33[i76] = iG5;
        boolean[][] zArr13 = (boolean[][]) Array.newInstance((Class<?>) cls2, iArr33);
        int i82 = 1;
        int i83 = 0;
        while (i82 < iG5) {
            if (iF9 == i81) {
                for (int i84 = 0; i84 < iArr4[i82]; i84++) {
                    zArr12[i82][i84] = c1999Kq0.e();
                    int i85 = iArr31[i82];
                    boolean z14 = zArr12[i82][i84];
                    iArr31[i82] = i85 + (z14 ? 1 : 0);
                    if (z14) {
                        iArr30[i82] = iArr9[i82][i84];
                    }
                }
            }
            if (i83 == 0) {
                i13 = 0;
                if (iArr9[i82][0] == 0 && zArr12[i82][0]) {
                    i83 = 0;
                    for (int i86 = 1; i86 < iArr4[i82]; i86++) {
                        if (iArr9[i82][i86] == i55 && zArr12[i82][i55]) {
                            i83 = i82;
                        }
                    }
                } else {
                    i83 = 0;
                }
            } else {
                i13 = 0;
            }
            int i87 = i13;
            while (i87 < iArr4[i82]) {
                if (iG4 > 1) {
                    zArr13[i82][i87] = zArr12[i82][i87];
                    zArr = zArr4;
                    i14 = iG4;
                    int iC = AbstractC4046jw0.c(iG4, RoundingMode.CEILING);
                    if (zArr13[i82][i87]) {
                        i15 = iF9;
                        break;
                    }
                    int i88 = ((C5279tj0) abstractC5931yu0J.get(iArr9[i82][i87])).f33467a;
                    int i89 = i13;
                    while (true) {
                        if (i89 >= i87) {
                            i15 = iF9;
                            break;
                        }
                        i15 = iF9;
                        if (zArr9[i88][((C5279tj0) abstractC5931yu0J.get(iArr9[i82][i89])).f33467a]) {
                            zArr13[i82][i87] = true;
                            break;
                        }
                        i89++;
                        iF9 = i15;
                    }
                    if (zArr13[i82][i87]) {
                        if (i83 <= 0 || i82 != i83) {
                            c1999Kq0.b(iC);
                        } else {
                            iArr32[i87] = c1999Kq0.f(iC);
                        }
                    }
                } else {
                    i14 = iG4;
                    i15 = iF9;
                    zArr = zArr4;
                }
                i87++;
                zArr4 = zArr;
                iG4 = i14;
                iF9 = i15;
            }
            int i90 = iG4;
            int i91 = iF9;
            boolean[][] zArr14 = zArr4;
            if (iArr31[i82] == 1 && iArr23[iArr30[i82]] > 0) {
                c1999Kq0.a();
            }
            i82++;
            zArr4 = zArr14;
            iG4 = i90;
            iF9 = i91;
            i81 = 2;
        }
        boolean[][] zArr15 = zArr4;
        if (i83 == 0) {
            return new C1683Eo0(c2556Vj3, null, c2662Xk0, null, null);
        }
        C2556Vj0 c2556Vj5 = c2556Vj3;
        int iG6 = c1999Kq0.g();
        int i92 = iG6 + 1;
        C5553vu0 c5553vu0A = AbstractC5931yu0.A(i92);
        int[] iArr34 = new int[i24];
        int i93 = 0;
        while (i93 < i92) {
            int iF10 = c1999Kq0.f(16);
            AbstractC5931yu0 abstractC5931yu0 = abstractC5931yu0J;
            int iF11 = c1999Kq0.f(16);
            if (c1999Kq0.e()) {
                iF2 = c1999Kq0.f(2);
                if (iF2 == 3) {
                    c1999Kq0.a();
                }
                iF3 = c1999Kq0.f(4);
                iF4 = c1999Kq0.f(4);
            } else {
                iF2 = 0;
                iF3 = 0;
                iF4 = 0;
            }
            if (c1999Kq0.e()) {
                int iG7 = c1999Kq0.g();
                int iG8 = c1999Kq0.g();
                int iG9 = c1999Kq0.g();
                int iG10 = c1999Kq0.g();
                iF10 = n(iF10, iF2, iG7, iG8);
                iF11 = o(iF11, iF2, iG9, iG10);
            }
            c5553vu0A.g(new C5913yl0(iF2, iF3, iF4, iF10, iF11));
            i93++;
            abstractC5931yu0J = abstractC5931yu0;
            zArr13 = zArr13;
            c2556Vj5 = c2556Vj5;
            abstractC5931yu0J2 = abstractC5931yu0J2;
        }
        AbstractC5931yu0 abstractC5931yu1 = abstractC5931yu0J;
        C2556Vj0 c2556Vj6 = c2556Vj5;
        AbstractC5931yu0 abstractC5931yu2 = abstractC5931yu0J2;
        boolean[][] zArr16 = zArr13;
        if (i92 <= 1 || !c1999Kq0.e()) {
            for (int i94 = 1; i94 < i24; i94++) {
                iArr34[i94] = Math.min(i94, iG6);
            }
        } else {
            int iC2 = AbstractC4046jw0.c(i92, RoundingMode.CEILING);
            for (int i95 = 1; i95 < i24; i95++) {
                iArr34[i95] = c1999Kq0.f(iC2);
            }
        }
        C2768Zl0 c2768Zl0 = new C2768Zl0(c5553vu0A.j(), iArr34);
        c1999Kq0.b(2);
        for (int i96 = 1; i96 < i24; i96++) {
            if (iArr23[iArr28[i96]] == 0) {
                c1999Kq0.a();
            }
        }
        for (int i97 = 1; i97 < iG5; i97++) {
            boolean zE10 = c1999Kq0.e();
            int i98 = 0;
            while (i98 < iArr25[i97]) {
                if ((i98 <= 0 || !zE10) ? i98 == 0 : c1999Kq0.e()) {
                    for (int i99 = 0; i99 < iArr4[i97]; i99++) {
                        if (zArr16[i97][i99]) {
                            c1999Kq0.g();
                        }
                    }
                    c1999Kq0.g();
                    c1999Kq0.g();
                }
                i98++;
            }
        }
        int iG11 = c1999Kq0.g() + 2;
        if (c1999Kq0.e()) {
            c1999Kq0.b(iG11);
        } else {
            for (int i100 = 1; i100 < i24; i100++) {
                for (int i101 = 0; i101 < i100; i101++) {
                    if (zArr15[i100][i101]) {
                        c1999Kq0.b(iG11);
                    }
                }
            }
        }
        int iG12 = c1999Kq0.g();
        for (int i102 = 1; i102 <= iG12; i102++) {
            c1999Kq0.b(8);
        }
        if (c1999Kq0.e()) {
            c1999Kq0.c();
            if (c1999Kq0.e() || c1999Kq0.e()) {
                c1999Kq0.a();
            }
            boolean zE11 = c1999Kq0.e();
            boolean zE12 = c1999Kq0.e();
            if (zE11 || zE12) {
                for (int i103 = 0; i103 < iG2; i103++) {
                    for (int i104 = 0; i104 < iArr25[i103]; i104++) {
                        boolean zE13 = zE11 ? c1999Kq0.e() : false;
                        boolean zE14 = zE12 ? c1999Kq0.e() : false;
                        if (zE13) {
                            c1999Kq0.b(32);
                        }
                        if (zE14) {
                            c1999Kq0.b(18);
                        }
                    }
                }
            }
            boolean zE15 = c1999Kq0.e();
            if (zE15) {
                z9 = true;
                iF = c1999Kq0.f(4) + 1;
            } else {
                z9 = true;
                iF = i24;
            }
            C5553vu0 c5553vu0A2 = AbstractC5931yu0.A(iF);
            int[] iArr35 = new int[i24];
            int i105 = 0;
            while (i105 < iF) {
                c1999Kq0.b(3);
                int i106 = z9 != c1999Kq0.e() ? 2 : 1;
                int iB = C3470fL0.b(c1999Kq0.f(8));
                int iC3 = C3470fL0.c(c1999Kq0.f(8));
                c1999Kq0.b(8);
                c5553vu0A2.g(new C1577Cn0(iB, i106, iC3));
                i105++;
                z9 = true;
            }
            if (zE15 && iF > 1) {
                for (int i107 = 0; i107 < i24; i107++) {
                    iArr35[i107] = c1999Kq0.f(4);
                }
            }
            c3276do0 = new C3276do0(c5553vu0A2.j(), iArr35);
        } else {
            c3276do0 = null;
        }
        return new C1683Eo0(c2556Vj6, abstractC5931yu1, new C2662Xk0(abstractC5931yu2, iArr32), c2768Zl0, c3276do0);
    }

    /* JADX WARN: Code duplicated, block: B:13:0x004a  */
    /* JADX WARN: Code duplicated, block: B:195:0x03cc  */
    /* JADX WARN: Code duplicated, block: B:36:0x00ac  */
    public static C3024bn0 g(byte[] bArr, int i10, int i11, C1683Eo0 c1683Eo0) {
        boolean z9;
        int i12;
        int i13;
        int iO;
        int iN;
        int iG;
        int i14;
        int i15;
        int i16;
        int i17;
        int iG2;
        int i18;
        int iMax;
        float f10;
        int i19;
        int i20;
        int i21;
        int iB;
        int iC;
        int i22;
        C3276do0 c3276do0;
        int i23;
        C2768Zl0 c2768Zl0;
        C2556Vj0 c2556Vj0L = l(new C1999Kq0(bArr, i10, i11));
        C1999Kq0 c1999Kq0 = new C1999Kq0(bArr, i10 + 2, i11);
        c1999Kq0.b(4);
        int iF = c1999Kq0.f(3);
        int i24 = c2556Vj0L.f24355b;
        if (i24 == 0 || iF != 7) {
            z9 = false;
        } else {
            iF = 7;
            z9 = true;
        }
        if (c1683Eo0 != null) {
            AbstractC5931yu0 abstractC5931yu0 = c1683Eo0.f18570a;
            if (abstractC5931yu0.isEmpty()) {
                i12 = 0;
            } else {
                i12 = ((C5279tj0) abstractC5931yu0.get(Math.min(i24, abstractC5931yu0.size() - 1))).f33467a;
            }
        } else {
            i12 = 0;
        }
        C5659wk0 c5659wk0M = null;
        if (!z9) {
            c1999Kq0.a();
            c5659wk0M = m(c1999Kq0, true, iF, null);
        } else if (c1683Eo0 != null) {
            C2662Xk0 c2662Xk0 = c1683Eo0.f18571b;
            int i25 = c2662Xk0.f25375b[i12];
            AbstractC5931yu0 abstractC5931yu1 = c2662Xk0.f25374a;
            if (abstractC5931yu1.size() > i25) {
                c5659wk0M = (C5659wk0) abstractC5931yu1.get(i25);
            }
        }
        int iG3 = c1999Kq0.g();
        if (z9) {
            int iF2 = c1999Kq0.e() ? c1999Kq0.f(8) : -1;
            if (c1683Eo0 == null || (c2768Zl0 = c1683Eo0.f18572c) == null) {
                i15 = 0;
                i17 = 0;
                iG = 0;
                i18 = 0;
                iG2 = 0;
                i14 = 0;
                i16 = 0;
            } else {
                if (iF2 == -1) {
                    iF2 = c2768Zl0.f26297b[i12];
                }
                if (iF2 != -1) {
                    AbstractC5931yu0 abstractC5931yu2 = c2768Zl0.f26296a;
                    if (abstractC5931yu2.size() > iF2) {
                        C5913yl0 c5913yl0 = (C5913yl0) abstractC5931yu2.get(iF2);
                        int i26 = c5913yl0.f35435a;
                        i16 = c5913yl0.f35438d;
                        i14 = c5913yl0.f35439e;
                        iG = c5913yl0.f35436b;
                        iG2 = c5913yl0.f35437c;
                        i18 = i26;
                        i15 = i14;
                        i17 = i16;
                    } else {
                        i15 = 0;
                        i17 = 0;
                        iG = 0;
                        i18 = 0;
                        iG2 = 0;
                        i14 = 0;
                        i16 = 0;
                    }
                } else {
                    i15 = 0;
                    i17 = 0;
                    iG = 0;
                    i18 = 0;
                    iG2 = 0;
                    i14 = 0;
                    i16 = 0;
                }
            }
        } else {
            int iG4 = c1999Kq0.g();
            if (iG4 == 3) {
                c1999Kq0.a();
                i13 = 3;
            } else {
                i13 = iG4;
            }
            int iG5 = c1999Kq0.g();
            int iG6 = c1999Kq0.g();
            if (c1999Kq0.e()) {
                int iG7 = c1999Kq0.g();
                int iG8 = c1999Kq0.g();
                int iG9 = c1999Kq0.g();
                int iG10 = c1999Kq0.g();
                iN = n(iG5, i13, iG7, iG8);
                iO = o(iG6, i13, iG9, iG10);
            } else {
                iO = iG6;
                iN = iG5;
            }
            iG = c1999Kq0.g();
            i14 = iO;
            i15 = iG6;
            i16 = iN;
            i17 = iG5;
            iG2 = c1999Kq0.g();
            i18 = iG4;
        }
        int iG11 = c1999Kq0.g();
        if (z9) {
            iMax = -1;
        } else {
            iMax = -1;
            for (int i27 = true != c1999Kq0.e() ? iF : 0; i27 <= iF; i27++) {
                c1999Kq0.g();
                iMax = Math.max(c1999Kq0.g(), iMax);
                c1999Kq0.g();
            }
        }
        c1999Kq0.g();
        c1999Kq0.g();
        c1999Kq0.g();
        c1999Kq0.g();
        c1999Kq0.g();
        c1999Kq0.g();
        if (c1999Kq0.e()) {
            if (z9 && c1999Kq0.e()) {
                c1999Kq0.b(6);
            } else if (c1999Kq0.e()) {
                int i28 = 4;
                int i29 = 0;
                while (i29 < i28) {
                    int i30 = i28;
                    int i31 = iMax;
                    for (int i32 = 0; i32 < 6; i32 += i29 == 3 ? 3 : 1) {
                        if (c1999Kq0.e()) {
                            int iMin = Math.min(64, 1 << ((i29 + i29) + 4));
                            if (i29 > 1) {
                                c1999Kq0.h();
                            }
                            for (int i33 = 0; i33 < iMin; i33++) {
                                c1999Kq0.h();
                            }
                        } else {
                            c1999Kq0.g();
                        }
                    }
                    i29++;
                    iMax = i31;
                    i28 = i30;
                }
            }
        }
        int i34 = iMax;
        c1999Kq0.b(2);
        if (c1999Kq0.e()) {
            c1999Kq0.b(8);
            c1999Kq0.g();
            c1999Kq0.g();
            c1999Kq0.a();
        }
        int iG12 = c1999Kq0.g();
        int i35 = 0;
        int[] iArr = new int[0];
        int i36 = iF;
        int[] iArrCopyOf = new int[0];
        int i37 = iG;
        int i38 = -1;
        int i39 = -1;
        while (i35 < iG12) {
            if (i35 == 0 || !c1999Kq0.e()) {
                int iG13 = c1999Kq0.g();
                int iG14 = c1999Kq0.g();
                int[] iArr2 = new int[iG13];
                int i40 = 0;
                while (i40 < iG13) {
                    iArr2[i40] = (i40 > 0 ? iArr2[i40 - 1] : 0) - (c1999Kq0.g() + 1);
                    c1999Kq0.a();
                    i40++;
                }
                int[] iArr3 = new int[iG14];
                int i41 = 0;
                while (i41 < iG14) {
                    iArr3[i41] = (i41 > 0 ? iArr3[i41 - 1] : 0) + c1999Kq0.g() + 1;
                    c1999Kq0.a();
                    i41++;
                }
                iArr = iArr2;
                iArrCopyOf = iArr3;
                i38 = iG13;
                i39 = iG14;
            } else {
                int i42 = i38 + i39;
                boolean zE = c1999Kq0.e();
                boolean z10 = true;
                int iG15 = c1999Kq0.g() + 1;
                int i43 = 1 - ((zE ? 1 : 0) + (zE ? 1 : 0));
                int i44 = i42 + 1;
                boolean[] zArr = new boolean[i44];
                int i45 = 0;
                while (i45 <= i42) {
                    if (c1999Kq0.e()) {
                        zArr[i45] = z10;
                    } else {
                        zArr[i45] = c1999Kq0.e();
                    }
                    i45++;
                    z10 = true;
                }
                int i46 = i39 - 1;
                int[] iArr4 = new int[i44];
                int[] iArr5 = new int[i44];
                int i47 = 0;
                while (true) {
                    i23 = i43 * iG15;
                    if (i46 < 0) {
                        break;
                    }
                    int i48 = iArrCopyOf[i46] + i23;
                    if (i48 < 0 && zArr[i38 + i46]) {
                        iArr4[i47] = i48;
                        i47++;
                    }
                    i46--;
                }
                if (i23 < 0 && zArr[i42]) {
                    iArr4[i47] = i23;
                    i47++;
                }
                int i49 = i47;
                for (int i50 = 0; i50 < i38; i50++) {
                    int i51 = iArr[i50] + i23;
                    if (i51 < 0 && zArr[i50]) {
                        iArr4[i49] = i51;
                        i49++;
                    }
                }
                int[] iArrCopyOf2 = Arrays.copyOf(iArr4, i49);
                int i52 = 0;
                for (int i53 = i38 - 1; i53 >= 0; i53--) {
                    int i54 = iArr[i53] + i23;
                    if (i54 > 0 && zArr[i53]) {
                        iArr5[i52] = i54;
                        i52++;
                    }
                }
                if (i23 > 0 && zArr[i42]) {
                    iArr5[i52] = i23;
                    i52++;
                }
                int i55 = i52;
                for (int i56 = 0; i56 < i39; i56++) {
                    int i57 = iArrCopyOf[i56] + i23;
                    if (i57 > 0 && zArr[i38 + i56]) {
                        iArr5[i55] = i57;
                        i55++;
                    }
                }
                iArr = iArrCopyOf2;
                iArrCopyOf = Arrays.copyOf(iArr5, i55);
                i38 = i49;
                i39 = i55;
            }
            i35++;
            iG12 = iG12;
            i12 = i12;
            c2556Vj0L = c2556Vj0L;
        }
        C2556Vj0 c2556Vj0 = c2556Vj0L;
        int i58 = i12;
        if (c1999Kq0.e()) {
            int iG16 = c1999Kq0.g();
            for (int i59 = 0; i59 < iG16; i59++) {
                c1999Kq0.b(iG11 + 5);
            }
        }
        c1999Kq0.b(2);
        float f11 = 1.0f;
        if (c1999Kq0.e()) {
            if (c1999Kq0.e()) {
                int iF3 = c1999Kq0.f(8);
                if (iF3 == 255) {
                    int iF4 = c1999Kq0.f(16);
                    int iF5 = c1999Kq0.f(16);
                    if (iF4 != 0 && iF5 != 0) {
                        f11 = iF4 / iF5;
                    }
                } else if (iF3 < 17) {
                    f11 = f30573b[iF3];
                } else {
                    StringBuilder sb = new StringBuilder(String.valueOf(iF3).length() + 35);
                    sb.append("Unexpected aspect_ratio_idc value: ");
                    sb.append(iF3);
                    YU.c("NalUnitUtil", sb.toString());
                }
            }
            if (c1999Kq0.e()) {
                c1999Kq0.a();
            }
            if (c1999Kq0.e()) {
                c1999Kq0.b(3);
                i22 = true != c1999Kq0.e() ? 2 : 1;
                if (c1999Kq0.e()) {
                    int iF6 = c1999Kq0.f(8);
                    int iF7 = c1999Kq0.f(8);
                    c1999Kq0.b(8);
                    iB = C3470fL0.b(iF6);
                    iC = C3470fL0.c(iF7);
                } else {
                    iB = -1;
                    iC = -1;
                }
            } else if (c1683Eo0 == null || (c3276do0 = c1683Eo0.f18573d) == null) {
                iB = -1;
                iC = -1;
                i22 = -1;
            } else {
                int i60 = c3276do0.f27514b[i58];
                AbstractC5931yu0 abstractC5931yu3 = c3276do0.f27513a;
                if (abstractC5931yu3.size() > i60) {
                    C1577Cn0 c1577Cn0 = (C1577Cn0) abstractC5931yu3.get(i60);
                    int i61 = c1577Cn0.f17936a;
                    int i62 = c1577Cn0.f17937b;
                    iC = c1577Cn0.f17938c;
                    iB = i61;
                    i22 = i62;
                } else {
                    iB = -1;
                    iC = -1;
                    i22 = -1;
                }
            }
            if (c1999Kq0.e()) {
                c1999Kq0.g();
                c1999Kq0.g();
            }
            c1999Kq0.a();
            if (c1999Kq0.e()) {
                i14 += i14;
            }
            i19 = iB;
            f10 = f11;
            i21 = iC;
            i20 = i22;
        } else {
            f10 = 1.0f;
            i19 = -1;
            i20 = -1;
            i21 = -1;
        }
        return new C3024bn0(c2556Vj0, i36, c5659wk0M, i18, i37, iG2, iG3, i16, i14, i17, i15, f10, i34, i19, i20, i21);
    }

    public static C3530fp0 h(byte[] bArr, int i10, int i11) {
        C1999Kq0 c1999Kq0 = new C1999Kq0(bArr, 4, i11);
        int iG = c1999Kq0.g();
        int iG2 = c1999Kq0.g();
        c1999Kq0.a();
        return new C3530fp0(iG, iG2, c1999Kq0.e());
    }

    public static int i(byte[] bArr, int i10, int i11, boolean[] zArr) {
        int i12 = i11 - i10;
        AbstractC2418Ss0.i(i12 >= 0);
        if (i12 == 0) {
            return i11;
        }
        if (zArr[0]) {
            j(zArr);
            return i10 - 3;
        }
        if (i12 > 1 && zArr[1] && bArr[i10] == 1) {
            j(zArr);
            return i10 - 2;
        }
        if (i12 > 2 && zArr[2] && bArr[i10] == 0 && bArr[i10 + 1] == 1) {
            j(zArr);
            return i10 - 1;
        }
        int i13 = i11 - 1;
        int i14 = i10 + 2;
        while (i14 < i13) {
            byte b10 = bArr[i14];
            if ((b10 & 254) == 0) {
                int i15 = i14 - 2;
                if (bArr[i15] == 0 && bArr[i14 - 1] == 0 && b10 == 1) {
                    j(zArr);
                    return i15;
                }
                i14 = i15;
            }
            i14 += 3;
        }
        zArr[0] = i12 <= 2 ? !(i12 != 2 ? !(zArr[1] && bArr[i13] == 1) : !(zArr[2] && bArr[i11 + (-2)] == 0 && bArr[i13] == 1)) : bArr[i11 + (-3)] == 0 && bArr[i11 + (-2)] == 0 && bArr[i13] == 1;
        zArr[1] = i12 <= 1 ? zArr[2] && bArr[i13] == 0 : bArr[i11 + (-2)] == 0 && bArr[i13] == 0;
        zArr[2] = bArr[i13] == 0;
        return i11;
    }

    public static void j(boolean[] zArr) {
        zArr[0] = false;
        zArr[1] = false;
        zArr[2] = false;
    }

    public static String k(List list) {
        for (int i10 = 0; i10 < list.size(); i10++) {
            byte[] bArr = (byte[]) list.get(i10);
            int length = bArr.length;
            if (length > 3) {
                boolean[] zArr = new boolean[3];
                int i11 = AbstractC5931yu0.f35482c;
                C5553vu0 c5553vu0 = new C5553vu0();
                int i12 = 0;
                while (true) {
                    int length2 = bArr.length;
                    if (i12 >= length2) {
                        break;
                    }
                    int i13 = i(bArr, i12, length2, zArr);
                    if (i13 != length2) {
                        c5553vu0.g(Integer.valueOf(i13));
                    }
                    i12 = i13 + 3;
                }
                AbstractC5931yu0 abstractC5931yu0J = c5553vu0.j();
                for (int i14 = 0; i14 < abstractC5931yu0J.size(); i14++) {
                    if (((Integer) abstractC5931yu0J.get(i14)).intValue() + 3 < length) {
                        C1999Kq0 c1999Kq0 = new C1999Kq0(bArr, ((Integer) abstractC5931yu0J.get(i14)).intValue() + 3, length);
                        C2556Vj0 c2556Vj0L = l(c1999Kq0);
                        if (c2556Vj0L.f24354a == 33 && c2556Vj0L.f24355b == 0) {
                            c1999Kq0.b(4);
                            int iF = c1999Kq0.f(3);
                            c1999Kq0.a();
                            C5659wk0 c5659wk0M = m(c1999Kq0, true, iF, null);
                            return GM.b(c5659wk0M.f34614a, c5659wk0M.f34615b, c5659wk0M.f34616c, c5659wk0M.f34617d, c5659wk0M.f34618e, c5659wk0M.f34619f);
                        }
                    }
                }
            }
        }
        return null;
    }

    private static C2556Vj0 l(C1999Kq0 c1999Kq0) {
        c1999Kq0.a();
        return new C2556Vj0(c1999Kq0.f(6), c1999Kq0.f(6), c1999Kq0.f(3) - 1);
    }

    /* JADX WARN: Code duplicated, block: B:21:0x005c  */
    /* JADX WARN: Code duplicated, block: B:23:0x0062  */
    /* JADX WARN: Code duplicated, block: B:26:0x006a  */
    /* JADX WARN: Code duplicated, block: B:30:0x0074  */
    /* JADX WARN: Code duplicated, block: B:39:0x006c A[SYNTHETIC] */
    private static C5659wk0 m(C1999Kq0 c1999Kq0, boolean z9, int i10, C5659wk0 c5659wk0) {
        int[] iArr;
        int i11;
        boolean z10;
        int i12;
        int i13;
        boolean zE;
        int iF;
        int i14;
        int i15;
        int[] iArr2 = new int[6];
        if (!z9) {
            if (c5659wk0 != null) {
                int i16 = c5659wk0.f34614a;
                zE = c5659wk0.f34615b;
                iF = c5659wk0.f34616c;
                i14 = c5659wk0.f34617d;
                iArr2 = c5659wk0.f34618e;
                i11 = i16;
            } else {
                iArr = iArr2;
                i11 = 0;
                z10 = false;
                i12 = 0;
                i13 = 0;
            }
            int iF2 = c1999Kq0.f(8);
            i15 = 0;
            for (int i17 = 0; i17 < i10; i17++) {
                if (c1999Kq0.e()) {
                    i15 += 88;
                }
                if (c1999Kq0.e()) {
                    i15 += 8;
                }
            }
            c1999Kq0.b(i15);
            if (i10 > 0) {
                int i18 = 8 - i10;
                c1999Kq0.b(i18 + i18);
            }
            return new C5659wk0(i11, z10, i12, i13, iArr, iF2);
        }
        int iF3 = c1999Kq0.f(2);
        zE = c1999Kq0.e();
        iF = c1999Kq0.f(5);
        i14 = 0;
        for (int i19 = 0; i19 < 32; i19++) {
            if (c1999Kq0.e()) {
                i14 |= 1 << i19;
            }
        }
        for (int i20 = 0; i20 < 6; i20++) {
            iArr2[i20] = c1999Kq0.f(8);
        }
        i11 = iF3;
        iArr = iArr2;
        z10 = zE;
        i12 = iF;
        i13 = i14;
        int iF4 = c1999Kq0.f(8);
        i15 = 0;
        while (i17 < i10) {
            if (c1999Kq0.e()) {
                i15 += 88;
            }
            if (c1999Kq0.e()) {
                i15 += 8;
            }
        }
        c1999Kq0.b(i15);
        if (i10 > 0) {
            int i110 = 8 - i10;
            c1999Kq0.b(i110 + i110);
        }
        return new C5659wk0(i11, z10, i12, i13, iArr, iF4);
    }

    private static int n(int i10, int i11, int i12, int i13) {
        int i14 = 2;
        if (i11 != 1 && i11 != 2) {
            i14 = 1;
        }
        return i10 - (i14 * (i12 + i13));
    }

    private static int o(int i10, int i11, int i12, int i13) {
        return i10 - ((i11 == 1 ? 2 : 1) * (i12 + i13));
    }

    private static void p(C1999Kq0 c1999Kq0) {
        int iG = c1999Kq0.g() + 1;
        c1999Kq0.b(8);
        for (int i10 = 0; i10 < iG; i10++) {
            c1999Kq0.g();
            c1999Kq0.g();
            c1999Kq0.a();
        }
        c1999Kq0.b(20);
    }

    private static String q(JY0 jy0) {
        String str;
        String str2 = jy0.f19929o;
        if (Objects.equals(str2, "video/dolby-vision") && (str = jy0.f19925k) != null) {
            if (str.startsWith("dva1") || str.startsWith("dvav")) {
                return MimeTypes.VIDEO_H264;
            }
            if (str.startsWith("dvh1") || str.startsWith("dvhe")) {
                return MimeTypes.VIDEO_H265;
            }
        }
        return str2;
    }
}
