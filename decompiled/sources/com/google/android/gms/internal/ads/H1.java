package com.google.android.gms.internal.ads;

import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.google.protobuf.CodedOutputStream;
import java.math.RoundingMode;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes2.dex */
public abstract class H1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int[] f19173a = {1, 2, 2, 2, 2, 3, 3, 4, 4, 5, 6, 6, 6, 7, 8, 8};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int[] f19174b = {-1, 8000, 16000, 32000, -1, -1, 11025, 22050, 44100, -1, -1, 12000, 24000, 48000, -1, -1};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int[] f19175c = {64, 112, IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT, 192, 224, IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER, 384, 448, IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING, 640, 768, 896, IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET, 1152, 1280, 1536, 1920, 2048, 2304, 2560, 2688, 2816, 2823, 2944, 3072, 3840, CodedOutputStream.DEFAULT_BUFFER_SIZE, 6144, 7680};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int[] f19176d = {8000, 16000, 32000, 64000, 128000, 22050, 44100, 88200, 176400, 352800, 12000, 24000, 48000, 96000, 192000, 384000};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int[] f19177e = {5, 8, 10, 12};

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final int[] f19178f = {6, 9, 12, 15};

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final int[] f19179g = {2, 4, 6, 8};

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final int[] f19180h = {9, 11, 13, 16};

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final int[] f19181i = {5, 8, 10, 12};

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ int f19182j = 0;

    public static int a(int i10) {
        if (i10 == 2147385345 || i10 == -25230976 || i10 == 536864768 || i10 == -14745368) {
            return 1;
        }
        if (i10 == 1683496997 || i10 == 622876772) {
            return 2;
        }
        if (i10 == 1078008818 || i10 == -233094848) {
            return 3;
        }
        return (i10 == 1908687592 || i10 == -398277519) ? 4 : 0;
    }

    public static JY0 b(byte[] bArr, String str, String str2, int i10, String str3, IV0 iv0) {
        C4436n10 c4436n10I = i(bArr);
        c4436n10I.h(60);
        int i11 = f19173a[c4436n10I.j(6)];
        int i12 = f19174b[c4436n10I.j(4)];
        int iJ = c4436n10I.j(5);
        int i13 = iJ >= 29 ? -1 : (f19175c[iJ] * 1000) / 2;
        c4436n10I.h(10);
        int i14 = i11 + (c4436n10I.j(2) > 0 ? 1 : 0);
        C5507vX0 c5507vX0 = new C5507vX0();
        c5507vX0.A(str);
        c5507vX0.k0("video/mp2t");
        c5507vX0.l0("audio/vnd.dts");
        c5507vX0.g0(i13);
        c5507vX0.e(i14);
        c5507vX0.f(i12);
        c5507vX0.p0(null);
        c5507vX0.d0(str2);
        c5507vX0.f0(i10);
        return c5507vX0.m();
    }

    /* JADX WARN: Code duplicated, block: B:15:0x005e  */
    /* JADX WARN: Code duplicated, block: B:17:? A[RETURN, SYNTHETIC] */
    public static int c(byte[] bArr) {
        int i10;
        int i11;
        byte b10;
        int i12;
        int i13;
        int i14;
        byte b11;
        boolean z9 = false;
        byte b12 = bArr[0];
        if (b12 != -2) {
            if (b12 == -1) {
                i13 = (bArr[7] & 3) << 12;
                i14 = (bArr[6] & 255) << 4;
                b11 = bArr[9];
            } else if (b12 != 31) {
                i10 = (bArr[5] & 3) << 12;
                i11 = (bArr[6] & 255) << 4;
                b10 = bArr[7];
            } else {
                i13 = (bArr[6] & 3) << 12;
                i14 = (bArr[7] & 255) << 4;
                b11 = bArr[8];
            }
            i12 = (((b11 & 60) >> 2) | i13 | i14) + 1;
            z9 = true;
            if (z9) {
                return (i12 * 16) / 14;
            }
            return i12;
        }
        i10 = (bArr[4] & 3) << 12;
        i11 = (bArr[7] & 255) << 4;
        b10 = bArr[6];
        i12 = (((b10 & 240) >> 4) | i10 | i11) + 1;
        if (z9) {
            return (i12 * 16) / 14;
        }
        return i12;
    }

    public static G1 d(byte[] bArr) throws C2817a9 {
        int iJ;
        int i10;
        long jP;
        int i11;
        C4436n10 c4436n10I = i(bArr);
        c4436n10I.h(40);
        int iJ2 = c4436n10I.j(2);
        boolean zI = c4436n10I.i();
        int i12 = true != zI ? 16 : 20;
        c4436n10I.h(true != zI ? 8 : 12);
        int iJ3 = c4436n10I.j(i12) + 1;
        boolean zI2 = c4436n10I.i();
        int iJ4 = -1;
        int i13 = 0;
        if (zI2) {
            iJ = c4436n10I.j(2);
            int iJ5 = c4436n10I.j(3) + 1;
            if (c4436n10I.i()) {
                c4436n10I.h(36);
            }
            int iJ6 = c4436n10I.j(3) + 1;
            int iJ7 = c4436n10I.j(3) + 1;
            if (iJ6 != 1 || iJ7 != 1) {
                throw C2817a9.c("Multiple audio presentations or assets not supported");
            }
            int i14 = iJ2 + 1;
            int iJ8 = c4436n10I.j(i14);
            for (int i15 = 0; i15 < i14; i15++) {
                if (((iJ8 >> i15) & 1) == 1) {
                    c4436n10I.h(8);
                }
            }
            int i16 = iJ5 * IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING;
            if (c4436n10I.i()) {
                c4436n10I.h(2);
                int iJ9 = (c4436n10I.j(2) + 1) << 2;
                int iJ10 = c4436n10I.j(2) + 1;
                while (i13 < iJ10) {
                    c4436n10I.h(iJ9);
                    i13++;
                }
            }
            i13 = i16;
        } else {
            iJ = -1;
        }
        c4436n10I.h(i12);
        c4436n10I.h(12);
        if (zI2) {
            if (c4436n10I.i()) {
                c4436n10I.h(4);
            }
            if (c4436n10I.i()) {
                c4436n10I.h(24);
            }
            if (c4436n10I.i()) {
                c4436n10I.o(c4436n10I.j(10) + 1);
            }
            c4436n10I.h(5);
            i10 = f19176d[c4436n10I.j(4)];
            iJ4 = c4436n10I.j(8) + 1;
        } else {
            i10 = -2147483647;
        }
        int i17 = i10;
        if (zI2) {
            if (iJ == 0) {
                i11 = 32000;
            } else if (iJ == 1) {
                i11 = 44100;
            } else {
                if (iJ != 2) {
                    StringBuilder sb = new StringBuilder(String.valueOf(iJ).length() + 51);
                    sb.append("Unsupported reference clock code in DTS HD header: ");
                    sb.append(iJ);
                    throw C2817a9.b(sb.toString(), null);
                }
                i11 = 48000;
            }
            jP = AbstractC4634ob0.P(i13, 1000000L, i11, RoundingMode.DOWN);
        } else {
            jP = -9223372036854775807L;
        }
        return new G1("audio/vnd.dts.hd;profile=lbr", iJ4, i17, iJ3, jP, 0, null);
    }

    public static int e(byte[] bArr) {
        C4436n10 c4436n10I = i(bArr);
        c4436n10I.h(42);
        return c4436n10I.j(true != c4436n10I.i() ? 8 : 12) + 1;
    }

    public static G1 f(byte[] bArr, AtomicInteger atomicInteger) throws C2817a9 {
        long jP;
        int iJ;
        AtomicInteger atomicInteger2;
        int i10;
        int i11;
        C4436n10 c4436n10I = i(bArr);
        int iJ2 = c4436n10I.j(32);
        int iH = h(c4436n10I, f19177e, true);
        int i12 = iH + 1;
        char c10 = iJ2 == 1078008818 ? (char) 1 : (char) 0;
        if (c10 == 0) {
            jP = -9223372036854775807L;
            iJ = -2147483647;
        } else {
            if (!c4436n10I.i()) {
                throw C2817a9.c("Only supports full channel mask-based audio presentation");
            }
            int i13 = iH - 1;
            if (((bArr[iH] & 255) | ((char) (bArr[i13] << 8))) != AbstractC4634ob0.h(bArr, 0, i13, 65535)) {
                throw C2817a9.b("CRC check failed", null);
            }
            int iJ3 = c4436n10I.j(2);
            if (iJ3 == 0) {
                i10 = IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING;
            } else if (iJ3 == 1) {
                i10 = 480;
            } else {
                if (iJ3 != 2) {
                    StringBuilder sb = new StringBuilder(String.valueOf(iJ3).length() + 51);
                    sb.append("Unsupported base duration index in DTS UHD header: ");
                    sb.append(iJ3);
                    throw C2817a9.b(sb.toString(), null);
                }
                i10 = 384;
            }
            int iJ4 = c4436n10I.j(3) + 1;
            int iJ5 = c4436n10I.j(2);
            if (iJ5 == 0) {
                i11 = 32000;
            } else if (iJ5 == 1) {
                i11 = 44100;
            } else {
                if (iJ5 != 2) {
                    StringBuilder sb2 = new StringBuilder(String.valueOf(iJ5).length() + 48);
                    sb2.append("Unsupported clock rate index in DTS UHD header: ");
                    sb2.append(iJ5);
                    throw C2817a9.b(sb2.toString(), null);
                }
                i11 = 48000;
            }
            if (c4436n10I.i()) {
                c4436n10I.h(36);
            }
            iJ = (1 << c4436n10I.j(2)) * i11;
            jP = AbstractC4634ob0.P(i10 * iJ4, 1000000L, i11, RoundingMode.DOWN);
        }
        int i14 = iJ;
        long j10 = jP;
        int iH2 = 0;
        for (char c11 = 0; c11 < c10; c11 = 1) {
            iH2 += h(c4436n10I, f19178f, true);
        }
        for (int i15 = 0; i15 <= 0; i15++) {
            if (c10 != 0) {
                atomicInteger2 = atomicInteger;
                atomicInteger2.set(h(c4436n10I, f19179g, true));
            } else {
                atomicInteger2 = atomicInteger;
            }
            iH2 += atomicInteger2.get() != 0 ? h(c4436n10I, f19180h, true) : 0;
        }
        return new G1("audio/vnd.dts.uhd;profile=p2", 2, i14, i12 + iH2, j10, 0, null);
    }

    public static int g(byte[] bArr) {
        C4436n10 c4436n10I = i(bArr);
        c4436n10I.h(32);
        return h(c4436n10I, f19181i, true) + 1;
    }

    private static int h(C4436n10 c4436n10, int[] iArr, boolean z9) {
        int i10 = 0;
        for (int i11 = 0; i11 < 3 && c4436n10.i(); i11++) {
            i10++;
        }
        int i12 = 0;
        for (int i13 = 0; i13 < i10; i13++) {
            i12 += 1 << iArr[i13];
        }
        return i12 + c4436n10.j(iArr[i10]);
    }

    private static C4436n10 i(byte[] bArr) {
        byte b10 = bArr[0];
        if (b10 == 127 || b10 == 100 || b10 == 64 || b10 == 113) {
            return new C4436n10(bArr, bArr.length);
        }
        byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
        byte b11 = bArrCopyOf[0];
        if (b11 == -2 || b11 == -1 || b11 == 37 || b11 == -14 || b11 == -24) {
            for (int i10 = 0; i10 < bArrCopyOf.length - 1; i10 += 2) {
                byte b12 = bArrCopyOf[i10];
                int i11 = i10 + 1;
                bArrCopyOf[i10] = bArrCopyOf[i11];
                bArrCopyOf[i11] = b12;
            }
        }
        int length = bArrCopyOf.length;
        C4436n10 c4436n10 = new C4436n10(bArrCopyOf, length);
        if (bArrCopyOf[0] == 31) {
            C4436n10 c4436n11 = new C4436n10(bArrCopyOf, length);
            while (c4436n11.c() >= 16) {
                c4436n11.h(2);
                c4436n10.p(c4436n11.j(14), 14);
            }
        }
        c4436n10.b(bArrCopyOf, bArrCopyOf.length);
        return c4436n10;
    }
}
