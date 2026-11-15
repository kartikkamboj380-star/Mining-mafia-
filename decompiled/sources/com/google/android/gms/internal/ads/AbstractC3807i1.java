package com.google.android.gms.internal.ads;

import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import java.nio.ByteBuffer;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.i1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC3807i1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int[] f29228a = {1, 2, 3, 6};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int[] f29229b = {48000, 44100, 32000};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int[] f29230c = {24000, 22050, 16000};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int[] f29231d = {2, 1, 2, 3, 3, 4, 4, 5};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int[] f29232e = {32, 40, 48, 56, 64, 80, 96, 112, IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT, 160, 192, 224, IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER, 320, 384, 448, IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING, 576, 640};

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final int[] f29233f = {69, 87, 104, 121, 139, 174, 208, 243, 278, 348, TTAdConstant.DOWNLOAD_URL_AND_PACKAGE_NAME, 487, 557, 696, 835, 975, 1114, 1253, 1393};

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f29234g = 0;

    public static JY0 a(P10 p10, String str, String str2, IV0 iv0) {
        C4436n10 c4436n10 = new C4436n10();
        c4436n10.a(p10);
        int i10 = f29229b[c4436n10.j(2)];
        c4436n10.h(8);
        int i11 = f29231d[c4436n10.j(3)];
        if (c4436n10.j(1) != 0) {
            i11++;
        }
        int i12 = f29232e[c4436n10.j(5)] * 1000;
        c4436n10.m();
        p10.G(c4436n10.e());
        C5507vX0 c5507vX0 = new C5507vX0();
        c5507vX0.A(str);
        c5507vX0.l0("audio/ac3");
        c5507vX0.e(i11);
        c5507vX0.f(i10);
        c5507vX0.p0(iv0);
        c5507vX0.d0(str2);
        c5507vX0.g0(i12);
        c5507vX0.h0(i12);
        return c5507vX0.m();
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0062  */
    public static JY0 b(P10 p10, String str, String str2, IV0 iv0) {
        String str3;
        C4436n10 c4436n10 = new C4436n10();
        c4436n10.a(p10);
        int iJ = c4436n10.j(13) * 1000;
        c4436n10.h(3);
        int i10 = f29229b[c4436n10.j(2)];
        c4436n10.h(10);
        int i11 = f29231d[c4436n10.j(3)];
        if (c4436n10.j(1) != 0) {
            i11++;
        }
        c4436n10.h(3);
        int iJ2 = c4436n10.j(4);
        c4436n10.h(1);
        if (iJ2 > 0) {
            c4436n10.h(6);
            if (c4436n10.j(1) != 0) {
                i11 += 2;
            }
            c4436n10.h(1);
        }
        if (c4436n10.c() > 7) {
            c4436n10.h(7);
            if (c4436n10.j(1) != 0) {
                str3 = "audio/eac3-joc";
            } else {
                str3 = "audio/eac3";
            }
        } else {
            str3 = "audio/eac3";
        }
        c4436n10.m();
        p10.G(c4436n10.e());
        C5507vX0 c5507vX0 = new C5507vX0();
        c5507vX0.A(str);
        c5507vX0.l0(str3);
        c5507vX0.e(i11);
        c5507vX0.f(i10);
        c5507vX0.p0(iv0);
        c5507vX0.d0(str2);
        c5507vX0.h0(iJ);
        return c5507vX0.m();
    }

    public static C3681h1 c(C4436n10 c4436n10) {
        int iF;
        int i10;
        int i11;
        int i12;
        String str;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int iD = c4436n10.d();
        c4436n10.h(40);
        int iJ = c4436n10.j(5);
        c4436n10.f(iD);
        int i18 = -1;
        if (iJ > 10) {
            c4436n10.h(16);
            int iJ2 = c4436n10.j(2);
            if (iJ2 == 0) {
                i18 = 0;
            } else if (iJ2 == 1) {
                i18 = 1;
            } else if (iJ2 == 2) {
                i18 = 2;
            }
            c4436n10.h(3);
            int iJ3 = c4436n10.j(11) + 1;
            int iJ4 = c4436n10.j(2);
            if (iJ4 == 3) {
                i10 = f29230c[c4436n10.j(2)];
                i15 = 6;
                i14 = 3;
            } else {
                int iJ5 = c4436n10.j(2);
                int i19 = f29228a[iJ5];
                i14 = iJ5;
                i10 = f29229b[iJ4];
                i15 = i19;
            }
            iF = iJ3 + iJ3;
            int i20 = (iF * i10) / (i15 * 32);
            int iJ6 = c4436n10.j(3);
            boolean zI = c4436n10.i();
            i11 = f29231d[iJ6] + (zI ? 1 : 0);
            c4436n10.h(10);
            if (c4436n10.i()) {
                c4436n10.h(8);
            }
            if (iJ6 == 0) {
                c4436n10.h(5);
                if (c4436n10.i()) {
                    c4436n10.h(8);
                }
                i16 = 0;
                iJ6 = 0;
            } else {
                i16 = iJ6;
            }
            if (i18 == 1) {
                if (c4436n10.i()) {
                    c4436n10.h(16);
                }
                i17 = 1;
            } else {
                i17 = i18;
            }
            if (c4436n10.i()) {
                if (i16 > 2) {
                    c4436n10.h(2);
                }
                if ((i16 & 1) != 0 && i16 > 2) {
                    c4436n10.h(6);
                }
                if ((i16 & 4) != 0) {
                    c4436n10.h(6);
                }
                if (zI && c4436n10.i()) {
                    c4436n10.h(5);
                }
                if (i17 == 0) {
                    if (c4436n10.i()) {
                        c4436n10.h(6);
                    }
                    if (i16 == 0 && c4436n10.i()) {
                        c4436n10.h(6);
                    }
                    if (c4436n10.i()) {
                        c4436n10.h(6);
                    }
                    int iJ7 = c4436n10.j(2);
                    if (iJ7 == 1) {
                        c4436n10.h(5);
                    } else if (iJ7 == 2) {
                        c4436n10.h(12);
                    } else if (iJ7 == 3) {
                        int iJ8 = c4436n10.j(5);
                        if (c4436n10.i()) {
                            c4436n10.h(5);
                            if (c4436n10.i()) {
                                c4436n10.h(4);
                            }
                            if (c4436n10.i()) {
                                c4436n10.h(4);
                            }
                            if (c4436n10.i()) {
                                c4436n10.h(4);
                            }
                            if (c4436n10.i()) {
                                c4436n10.h(4);
                            }
                            if (c4436n10.i()) {
                                c4436n10.h(4);
                            }
                            if (c4436n10.i()) {
                                c4436n10.h(4);
                            }
                            if (c4436n10.i()) {
                                c4436n10.h(4);
                            }
                            if (c4436n10.i()) {
                                if (c4436n10.i()) {
                                    c4436n10.h(4);
                                }
                                if (c4436n10.i()) {
                                    c4436n10.h(4);
                                }
                            }
                        }
                        if (c4436n10.i()) {
                            c4436n10.h(5);
                            if (c4436n10.i()) {
                                c4436n10.h(7);
                                if (c4436n10.i()) {
                                    c4436n10.h(8);
                                }
                            }
                        }
                        c4436n10.h((iJ8 + 2) * 8);
                        c4436n10.m();
                    }
                    if (i16 < 2) {
                        if (c4436n10.i()) {
                            c4436n10.h(14);
                        }
                        if (iJ6 == 0 && c4436n10.i()) {
                            c4436n10.h(14);
                        }
                    }
                    if (!c4436n10.i()) {
                        i17 = 0;
                    } else if (i14 == 0) {
                        c4436n10.h(5);
                        i17 = 0;
                        i14 = 0;
                    } else {
                        for (int i21 = 0; i21 < i15; i21++) {
                            if (c4436n10.i()) {
                                c4436n10.h(5);
                            }
                        }
                        i17 = 0;
                    }
                }
            }
            if (c4436n10.i()) {
                c4436n10.h(5);
                if (i16 == 2) {
                    c4436n10.h(4);
                    i16 = 2;
                }
                if (i16 >= 6) {
                    c4436n10.h(2);
                }
                if (c4436n10.i()) {
                    c4436n10.h(8);
                }
                if (i16 == 0 && c4436n10.i()) {
                    c4436n10.h(8);
                }
                if (iJ4 < 3) {
                    c4436n10.g();
                }
            }
            if (i17 == 0 && i14 != 3) {
                c4436n10.g();
            }
            if (i17 == 2 && (i14 == 3 || c4436n10.i())) {
                c4436n10.h(6);
            }
            String str2 = (c4436n10.i() && c4436n10.j(6) == 1 && c4436n10.j(8) == 1) ? "audio/eac3-joc" : "audio/eac3";
            i12 = i15 * IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER;
            str = str2;
            i13 = i20;
        } else {
            c4436n10.h(32);
            int iJ9 = c4436n10.j(2);
            String str3 = iJ9 == 3 ? null : "audio/ac3";
            int iJ10 = c4436n10.j(6);
            int i22 = f29232e[iJ10 / 2] * 1000;
            iF = f(iJ9, iJ10);
            c4436n10.h(8);
            int iJ11 = c4436n10.j(3);
            if ((iJ11 & 1) != 0 && iJ11 != 1) {
                c4436n10.h(2);
            }
            if ((iJ11 & 4) != 0) {
                c4436n10.h(2);
            }
            if (iJ11 == 2) {
                c4436n10.h(2);
            }
            i10 = iJ9 < 3 ? f29229b[iJ9] : -1;
            i11 = f29231d[iJ11] + (c4436n10.i() ? 1 : 0);
            i12 = 1536;
            str = str3;
            i13 = i22;
        }
        return new C3681h1(str, i18, i11, i10, iF, i12, i13, null);
    }

    public static int d(byte[] bArr) {
        if (bArr.length < 6) {
            return -1;
        }
        if (((bArr[5] & 248) >> 3) <= 10) {
            byte b10 = bArr[4];
            return f((b10 & 192) >> 6, b10 & 63);
        }
        int i10 = bArr[2] & 7;
        int i11 = ((bArr[3] & 255) | (i10 << 8)) + 1;
        return i11 + i11;
    }

    public static int e(ByteBuffer byteBuffer) {
        if (((byteBuffer.get(byteBuffer.position() + 5) & 248) >> 3) > 10) {
            return f29228a[((byteBuffer.get(byteBuffer.position() + 4) & 192) >> 6) != 3 ? (byteBuffer.get(byteBuffer.position() + 4) & 48) >> 4 : 3] * IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER;
        }
        return 1536;
    }

    private static int f(int i10, int i11) {
        int i12;
        if (i10 < 0 || i10 >= 3 || i11 < 0 || (i12 = i11 >> 1) >= 19) {
            return -1;
        }
        int i13 = f29229b[i10];
        if (i13 == 44100) {
            int i14 = f29233f[i12] + (i11 & 1);
            return i14 + i14;
        }
        int i15 = f29232e[i12];
        return i13 == 32000 ? i15 * 6 : i15 * 4;
    }
}
