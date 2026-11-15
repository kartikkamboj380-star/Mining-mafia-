package com.google.android.gms.internal.ads;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.util.SparseArray;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.google.protobuf.DescriptorProtos;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class K5 implements InterfaceC5828y5 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final byte[] f20058h = {0, 7, 8, 15};

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final byte[] f20059i = {0, 119, -120, -1};

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final byte[] f20060j = {0, 17, 34, 51, 68, 85, 102, 119, -120, -103, -86, -69, -52, -35, -18, -1};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Paint f20061a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Paint f20062b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Canvas f20063c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final D5 f20064d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final C5 f20065e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final J5 f20066f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Bitmap f20067g;

    public K5(List list) {
        P10 p10 = new P10((byte[]) list.get(0));
        int iS = p10.S();
        int iS2 = p10.S();
        Paint paint = new Paint();
        this.f20061a = paint;
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
        paint.setPathEffect(null);
        Paint paint2 = new Paint();
        this.f20062b = paint2;
        paint2.setStyle(Paint.Style.FILL);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OVER));
        paint2.setPathEffect(null);
        this.f20063c = new Canvas();
        this.f20064d = new D5(719, 575, 0, 719, 0, 575);
        this.f20065e = new C5(0, d(), e(), f());
        this.f20066f = new J5(iS, iS2);
    }

    private static C5 b(C4436n10 c4436n10, int i10) {
        int[] iArr;
        int iJ;
        int iJ2;
        int iJ3;
        int iJ4;
        int i11 = 8;
        int iJ5 = c4436n10.j(8);
        c4436n10.h(8);
        int[] iArrD = d();
        int[] iArrE = e();
        int[] iArrF = f();
        int i12 = i10 - 2;
        while (i12 > 0) {
            int iJ6 = c4436n10.j(i11);
            int iJ7 = c4436n10.j(i11);
            if ((iJ7 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) != 0) {
                iArr = iArrD;
            } else {
                iArr = (iJ7 & 64) != 0 ? iArrE : iArrF;
            }
            if ((iJ7 & 1) != 0) {
                iJ3 = c4436n10.j(i11);
                iJ4 = c4436n10.j(i11);
                iJ = c4436n10.j(i11);
                iJ2 = c4436n10.j(i11);
                i12 -= 6;
            } else {
                int iJ8 = c4436n10.j(6) << 2;
                int iJ9 = c4436n10.j(4) << 4;
                i12 -= 4;
                iJ = c4436n10.j(4) << 4;
                iJ2 = c4436n10.j(2) << 6;
                iJ3 = iJ8;
                iJ4 = iJ9;
            }
            if (iJ3 == 0) {
                iJ2 = 255;
            }
            if (iJ3 == 0) {
                iJ = 0;
            }
            if (iJ3 == 0) {
                iJ4 = 0;
            }
            double d10 = iJ3;
            String str = AbstractC4634ob0.f32117a;
            double d11 = iJ4 - 128;
            double d12 = iJ - 128;
            iArr[iJ6] = g((byte) (255 - (iJ2 & 255)), Math.max(0, Math.min((int) (d10 + (1.402d * d11)), 255)), Math.max(0, Math.min((int) ((d10 - (0.34414d * d12)) - (d11 * 0.71414d)), 255)), Math.max(0, Math.min((int) (d10 + (d12 * 1.772d)), 255)));
            iJ5 = iJ5;
            i11 = 8;
        }
        return new C5(iJ5, iArrD, iArrE, iArrF);
    }

    private static E5 c(C4436n10 c4436n10) {
        byte[] bArr;
        int iJ = c4436n10.j(16);
        c4436n10.h(4);
        int iJ2 = c4436n10.j(2);
        boolean zI = c4436n10.i();
        c4436n10.h(1);
        byte[] bArr2 = AbstractC4634ob0.f32118b;
        if (iJ2 != 1) {
            if (iJ2 == 0) {
                int iJ3 = c4436n10.j(16);
                int iJ4 = c4436n10.j(16);
                if (iJ3 > 0) {
                    bArr2 = new byte[iJ3];
                    c4436n10.n(bArr2, 0, iJ3);
                }
                if (iJ4 > 0) {
                    bArr = new byte[iJ4];
                    c4436n10.n(bArr, 0, iJ4);
                }
            }
            return new E5(iJ, zI, bArr2, bArr);
        }
        c4436n10.h(c4436n10.j(8) * 16);
        bArr = bArr2;
        return new E5(iJ, zI, bArr2, bArr);
    }

    private static int[] d() {
        return new int[]{0, -1, -16777216, -8421505};
    }

    private static int[] e() {
        int[] iArr = new int[16];
        iArr[0] = 0;
        for (int i10 = 1; i10 < 16; i10++) {
            int i11 = i10 & 4;
            int i12 = i10 & 2;
            int i13 = i10 & 1;
            if (i10 < 8) {
                iArr[i10] = g(255, 1 != i13 ? 0 : 255, i12 != 0 ? 255 : 0, i11 != 0 ? 255 : 0);
            } else {
                iArr[i10] = g(255, 1 != i13 ? 0 : 127, i12 != 0 ? 127 : 0, i11 == 0 ? 0 : 127);
            }
        }
        return iArr;
    }

    private static int[] f() {
        int[] iArr = new int[IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER];
        iArr[0] = 0;
        for (int i10 = 0; i10 < 256; i10++) {
            if (i10 < 8) {
                iArr[i10] = g(63, 1 != (i10 & 1) ? 0 : 255, (i10 & 2) != 0 ? 255 : 0, (i10 & 4) == 0 ? 0 : 255);
            } else {
                int i11 = i10 & 136;
                if (i11 == 0) {
                    iArr[i10] = g(255, (1 != (i10 & 1) ? 0 : 85) + ((i10 & 16) != 0 ? 170 : 0), ((i10 & 2) != 0 ? 85 : 0) + ((i10 & 32) != 0 ? 170 : 0), ((i10 & 4) == 0 ? 0 : 85) + ((i10 & 64) == 0 ? 0 : 170));
                } else if (i11 == 8) {
                    iArr[i10] = g(127, (1 != (i10 & 1) ? 0 : 85) + ((i10 & 16) != 0 ? 170 : 0), ((i10 & 2) != 0 ? 85 : 0) + ((i10 & 32) != 0 ? 170 : 0), ((i10 & 4) == 0 ? 0 : 85) + ((i10 & 64) == 0 ? 0 : 170));
                } else if (i11 == 128) {
                    iArr[i10] = g(255, (1 != (i10 & 1) ? 0 : 43) + 127 + ((i10 & 16) != 0 ? 85 : 0), ((i10 & 2) != 0 ? 43 : 0) + 127 + ((i10 & 32) != 0 ? 85 : 0), ((i10 & 4) == 0 ? 0 : 43) + 127 + ((i10 & 64) == 0 ? 0 : 85));
                } else if (i11 == 136) {
                    iArr[i10] = g(255, (1 != (i10 & 1) ? 0 : 43) + ((i10 & 16) != 0 ? 85 : 0), ((i10 & 2) != 0 ? 43 : 0) + ((i10 & 32) != 0 ? 85 : 0), ((i10 & 4) == 0 ? 0 : 43) + ((i10 & 64) == 0 ? 0 : 85));
                }
            }
        }
        return iArr;
    }

    private static int g(int i10, int i11, int i12, int i13) {
        return (i10 << 24) | (i11 << 16) | (i12 << 8) | i13;
    }

    /* JADX WARN: Code duplicated, block: B:112:0x01d0 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:117:0x01f3  */
    /* JADX WARN: Code duplicated, block: B:122:0x0201 A[LOOP:3: B:89:0x0163->B:122:0x0201, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:144:0x01fa A[SYNTHETIC] */
    private static void h(byte[] bArr, int[] iArr, int i10, int i11, int i12, Paint paint, Canvas canvas) {
        byte[] bArr2;
        byte[] bArr3;
        char c10;
        int iJ;
        int iJ2;
        int iJ3;
        int i13;
        int iJ4;
        int iJ5;
        int i14;
        int i15;
        int iJ6;
        int i16;
        Paint paint2 = paint;
        C4436n10 c4436n10 = new C4436n10(bArr, bArr.length);
        int i17 = i11;
        int i18 = i12;
        byte[] bArrI = null;
        byte[] bArrI2 = null;
        byte[] bArrI3 = null;
        while (c4436n10.c() != 0) {
            int iJ7 = c4436n10.j(8);
            if (iJ7 != 240) {
                int i19 = 4;
                int i20 = 1;
                int i21 = 2;
                switch (iJ7) {
                    case 16:
                        int i22 = 1;
                        if (i10 == 3) {
                            if (bArrI == null) {
                                bArr3 = f20059i;
                                bArr2 = bArr3;
                            } else {
                                bArr2 = bArrI;
                            }
                        } else if (i10 != 2) {
                            bArr2 = null;
                        } else if (bArrI3 == null) {
                            bArr3 = f20058h;
                            bArr2 = bArr3;
                        } else {
                            bArr2 = bArrI3;
                        }
                        int i23 = 0;
                        while (true) {
                            int iJ8 = c4436n10.j(2);
                            if (iJ8 != 0) {
                                iJ2 = i22;
                                iJ = iJ8;
                            } else {
                                if (c4436n10.i()) {
                                    iJ3 = c4436n10.j(3) + 3;
                                    iJ = c4436n10.j(2);
                                } else {
                                    if (c4436n10.i()) {
                                        iJ2 = i22;
                                        iJ = 0;
                                    } else {
                                        int iJ9 = c4436n10.j(2);
                                        if (iJ9 == 0) {
                                            c10 = 4;
                                            i23 = i22;
                                            iJ = 0;
                                            iJ2 = 0;
                                        } else if (iJ9 == i22) {
                                            c10 = 4;
                                            i23 = i23;
                                            iJ2 = 2;
                                            iJ = 0;
                                        } else if (iJ9 == 2) {
                                            c10 = 4;
                                            i23 = i23;
                                            iJ2 = c4436n10.j(4) + 12;
                                            iJ = c4436n10.j(2);
                                        } else if (iJ9 != 3) {
                                            iJ = 0;
                                            iJ2 = 0;
                                        } else {
                                            iJ3 = c4436n10.j(8) + 29;
                                            iJ = c4436n10.j(2);
                                        }
                                        if (iJ2 == 0 && paint2 != null) {
                                            int i24 = i18 + 1;
                                            float f10 = i18;
                                            if (bArr2 != 0) {
                                                iJ = bArr2[iJ];
                                            }
                                            paint2.setColor(iArr[iJ]);
                                            canvas.drawRect(i17, f10, i17 + iJ2, i24, paint2);
                                        }
                                        i17 += iJ2;
                                        if (i23 != 0) {
                                            c4436n10.m();
                                        } else {
                                            paint2 = paint;
                                            i23 = i23;
                                            i22 = 1;
                                        }
                                    }
                                    c10 = 4;
                                    if (iJ2 == 0) {
                                    }
                                    i17 += iJ2;
                                    if (i23 != 0) {
                                        c4436n10.m();
                                    } else {
                                        paint2 = paint;
                                        i23 = i23;
                                        i22 = 1;
                                    }
                                }
                                iJ2 = iJ3;
                            }
                            c10 = 4;
                            if (iJ2 == 0) {
                            }
                            i17 += iJ2;
                            if (i23 != 0) {
                                c4436n10.m();
                            } else {
                                paint2 = paint;
                                i23 = i23;
                                i22 = 1;
                            }
                            break;
                        }
                        break;
                    case 17:
                        byte[] bArr4 = i10 == 3 ? bArrI2 == null ? f20060j : bArrI2 : null;
                        boolean z9 = false;
                        while (true) {
                            int iJ10 = c4436n10.j(i19);
                            if (iJ10 != 0) {
                                i13 = 1;
                                z9 = z9;
                            } else if (c4436n10.i()) {
                                if (c4436n10.i()) {
                                    int iJ11 = c4436n10.j(i21);
                                    if (iJ11 == 0) {
                                        i13 = 1;
                                    } else if (iJ11 == 1) {
                                        i13 = i21;
                                    } else if (iJ11 == i21) {
                                        iJ4 = c4436n10.j(i19) + 9;
                                        iJ5 = c4436n10.j(i19);
                                    } else if (iJ11 != 3) {
                                        z9 = z9;
                                        iJ10 = 0;
                                        i13 = 0;
                                    } else {
                                        iJ4 = c4436n10.j(8) + 25;
                                        iJ5 = c4436n10.j(i19);
                                    }
                                    iJ10 = 0;
                                } else {
                                    iJ4 = c4436n10.j(i21) + i19;
                                    iJ5 = c4436n10.j(i19);
                                }
                                i13 = iJ4;
                                z9 = z9;
                                iJ10 = iJ5;
                            } else {
                                int iJ12 = c4436n10.j(3);
                                if (iJ12 != 0) {
                                    i13 = iJ12 + 2;
                                    iJ10 = 0;
                                } else {
                                    z9 = true;
                                    iJ10 = 0;
                                    i13 = 0;
                                }
                            }
                            if (i13 == 0 || paint2 == null) {
                                i14 = i21;
                            } else {
                                int i25 = i18 + 1;
                                float f11 = i18;
                                if (bArr4 != 0) {
                                    iJ10 = bArr4[iJ10];
                                }
                                paint2.setColor(iArr[iJ10]);
                                i14 = 2;
                                canvas.drawRect(i17, f11, i17 + i13, i25, paint2);
                            }
                            i17 += i13;
                            if (z9) {
                                c4436n10.m();
                                continue;
                            } else {
                                i21 = i14;
                                z9 = z9;
                                i19 = 4;
                            }
                            break;
                        }
                        break;
                    case 18:
                        int i26 = i17;
                        int i27 = 0;
                        while (true) {
                            int iJ13 = c4436n10.j(8);
                            if (iJ13 != 0) {
                                i15 = i27;
                                iJ6 = i20;
                            } else if (c4436n10.i()) {
                                i15 = i27;
                                iJ6 = c4436n10.j(7);
                                iJ13 = c4436n10.j(8);
                            } else {
                                int iJ14 = c4436n10.j(7);
                                if (iJ14 != 0) {
                                    i15 = i27;
                                    iJ6 = iJ14;
                                    iJ13 = 0;
                                } else {
                                    i15 = i20;
                                    iJ13 = 0;
                                    iJ6 = 0;
                                }
                            }
                            if (iJ6 == 0 || paint2 == null) {
                                i16 = i20;
                            } else {
                                paint2.setColor(iArr[iJ13]);
                                i16 = i20;
                                canvas.drawRect(i26, i18, i26 + iJ6, i18 + 1, paint2);
                            }
                            i26 += iJ6;
                            if (i15 != 0) {
                                i17 = i26;
                                continue;
                            } else {
                                i20 = i16;
                                i27 = i15;
                            }
                            break;
                        }
                        break;
                    default:
                        switch (iJ7) {
                            case IntBufferBatchMountItem.INSTRUCTION_UPDATE_PROPS /* 32 */:
                                bArrI3 = i(4, 4, c4436n10);
                                break;
                            case 33:
                                bArrI = i(4, 8, c4436n10);
                                break;
                            case DescriptorProtos.MethodOptions.IDEMPOTENCY_LEVEL_FIELD_NUMBER /* 34 */:
                                bArrI2 = i(16, 8, c4436n10);
                                break;
                            default:
                                continue;
                        }
                        break;
                }
            } else {
                i18 += 2;
                i17 = i11;
            }
            paint2 = paint;
        }
    }

    private static byte[] i(int i10, int i11, C4436n10 c4436n10) {
        byte[] bArr = new byte[i10];
        for (int i12 = 0; i12 < i10; i12++) {
            bArr[i12] = (byte) c4436n10.j(i11);
        }
        return bArr;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5828y5
    public final void a(byte[] bArr, int i10, int i11, C5702x5 c5702x5, InterfaceC3977jO interfaceC3977jO) {
        boolean z9;
        C4695p5 c4695p5;
        Canvas canvas;
        char c10;
        char c11;
        char c12;
        int i12;
        Canvas canvas2;
        int i13;
        H5 h10;
        int iJ;
        int iJ2;
        int iJ3;
        int iJ4;
        int i14;
        int iJ5;
        C4436n10 c4436n10 = new C4436n10(bArr, i10 + i11);
        c4436n10.f(i10);
        while (true) {
            z9 = true;
            if (c4436n10.c() >= 48 && c4436n10.j(8) == 15) {
                J5 j10 = this.f20066f;
                int iJ6 = c4436n10.j(8);
                int iJ7 = c4436n10.j(16);
                int iJ8 = c4436n10.j(16);
                int iE = c4436n10.e() + iJ8;
                if (iJ8 * 8 > c4436n10.c()) {
                    YU.c("DvbParser", "Data field length exceeds limit");
                    c4436n10.h(c4436n10.c());
                } else {
                    switch (iJ6) {
                        case 16:
                            if (iJ7 == j10.f19746a) {
                                F5 f10 = j10.f19754i;
                                int iJ9 = c4436n10.j(8);
                                int iJ10 = c4436n10.j(4);
                                int iJ11 = c4436n10.j(2);
                                c4436n10.h(2);
                                SparseArray sparseArray = new SparseArray();
                                for (int i15 = iJ8 - 2; i15 > 0; i15 -= 6) {
                                    int iJ12 = c4436n10.j(8);
                                    c4436n10.h(8);
                                    sparseArray.put(iJ12, new G5(c4436n10.j(16), c4436n10.j(16)));
                                }
                                F5 f11 = new F5(iJ9, iJ10, iJ11, sparseArray);
                                if (f11.f18671b != 0) {
                                    j10.f19754i = f11;
                                    j10.f19748c.clear();
                                    j10.f19749d.clear();
                                    j10.f19750e.clear();
                                } else if (f10 != null) {
                                    if (f10.f18670a != f11.f18670a) {
                                        j10.f19754i = f11;
                                    }
                                }
                            }
                            break;
                        case 17:
                            F5 f12 = j10.f19754i;
                            if (iJ7 == j10.f19746a && f12 != null) {
                                int iJ13 = c4436n10.j(8);
                                c4436n10.h(4);
                                boolean zI = c4436n10.i();
                                c4436n10.h(3);
                                int iJ14 = c4436n10.j(16);
                                int iJ15 = c4436n10.j(16);
                                int iJ16 = c4436n10.j(3);
                                int iJ17 = c4436n10.j(3);
                                c4436n10.h(2);
                                int iJ18 = c4436n10.j(8);
                                int iJ19 = c4436n10.j(8);
                                int iJ20 = c4436n10.j(4);
                                int iJ21 = c4436n10.j(2);
                                c4436n10.h(2);
                                int i16 = iJ8 - 10;
                                SparseArray sparseArray2 = new SparseArray();
                                while (i16 > 0) {
                                    int iJ22 = c4436n10.j(16);
                                    int iJ23 = c4436n10.j(2);
                                    int iJ24 = c4436n10.j(2);
                                    int iJ25 = c4436n10.j(12);
                                    c4436n10.h(4);
                                    int iJ26 = c4436n10.j(12);
                                    int i17 = i16 - 6;
                                    if (iJ23 == 1) {
                                        i16 -= 8;
                                        iJ = c4436n10.j(8);
                                        iJ2 = c4436n10.j(8);
                                    } else if (iJ23 == 2) {
                                        iJ23 = 2;
                                        i16 -= 8;
                                        iJ = c4436n10.j(8);
                                        iJ2 = c4436n10.j(8);
                                    } else {
                                        i16 = i17;
                                        iJ = 0;
                                        iJ2 = 0;
                                    }
                                    sparseArray2.put(iJ22, new I5(iJ23, iJ24, iJ25, iJ26, iJ, iJ2));
                                }
                                H5 h11 = new H5(iJ13, zI, iJ14, iJ15, iJ16, iJ17, iJ18, iJ19, iJ20, iJ21, sparseArray2);
                                if (f12.f18671b == 0 && (h10 = (H5) j10.f19748c.get(h11.f19195a)) != null) {
                                    int i18 = 0;
                                    while (true) {
                                        SparseArray sparseArray3 = h10.f19204j;
                                        if (i18 < sparseArray3.size()) {
                                            h11.f19204j.put(sparseArray3.keyAt(i18), (I5) sparseArray3.valueAt(i18));
                                            i18++;
                                        }
                                    }
                                }
                                j10.f19748c.put(h11.f19195a, h11);
                            }
                            break;
                        case 18:
                            if (iJ7 == j10.f19746a) {
                                C5 c5B = b(c4436n10, iJ8);
                                j10.f19749d.put(c5B.f17781a, c5B);
                            } else if (iJ7 == j10.f19747b) {
                                C5 c5B2 = b(c4436n10, iJ8);
                                j10.f19751f.put(c5B2.f17781a, c5B2);
                            }
                            break;
                        case 19:
                            if (iJ7 == j10.f19746a) {
                                E5 e5C = c(c4436n10);
                                j10.f19750e.put(e5C.f18379a, e5C);
                            } else if (iJ7 == j10.f19747b) {
                                E5 e5C2 = c(c4436n10);
                                j10.f19752g.put(e5C2.f18379a, e5C2);
                            }
                            break;
                        case 20:
                            if (iJ7 == j10.f19746a) {
                                c4436n10.h(4);
                                boolean zI2 = c4436n10.i();
                                c4436n10.h(3);
                                int iJ27 = c4436n10.j(16);
                                int iJ28 = c4436n10.j(16);
                                if (zI2) {
                                    int iJ29 = c4436n10.j(16);
                                    iJ3 = c4436n10.j(16);
                                    iJ5 = c4436n10.j(16);
                                    iJ4 = c4436n10.j(16);
                                    i14 = iJ29;
                                } else {
                                    iJ3 = iJ27;
                                    iJ4 = iJ28;
                                    i14 = 0;
                                    iJ5 = 0;
                                }
                                j10.f19753h = new D5(iJ27, iJ28, i14, iJ3, iJ5, iJ4);
                            }
                            break;
                    }
                    c4436n10.o(iE - c4436n10.e());
                }
            }
        }
        J5 j11 = this.f20066f;
        F5 f13 = j11.f19754i;
        if (f13 == null) {
            c4695p5 = new C4695p5(AbstractC5931yu0.l(), -9223372036854775807L, -9223372036854775807L);
        } else {
            D5 d10 = j11.f19753h;
            if (d10 == null) {
                d10 = this.f20064d;
            }
            Bitmap bitmap = this.f20067g;
            if (bitmap == null || d10.f18069a + 1 != bitmap.getWidth() || d10.f18070b + 1 != this.f20067g.getHeight()) {
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(d10.f18069a + 1, d10.f18070b + 1, Bitmap.Config.ARGB_8888);
                this.f20067g = bitmapCreateBitmap;
                this.f20063c.setBitmap(bitmapCreateBitmap);
            }
            ArrayList arrayList = new ArrayList();
            SparseArray sparseArray4 = f13.f18672c;
            int i19 = 0;
            while (i19 < sparseArray4.size()) {
                Canvas canvas3 = this.f20063c;
                canvas3.save();
                G5 g10 = (G5) sparseArray4.valueAt(i19);
                H5 h12 = (H5) j11.f19748c.get(sparseArray4.keyAt(i19));
                int i20 = g10.f18911a + d10.f18071c;
                int i21 = g10.f18912b + d10.f18073e;
                int i22 = h12.f19197c;
                int i23 = i20 + i22;
                boolean z10 = z9;
                int iMin = Math.min(i23, d10.f18072d);
                int i24 = h12.f19198d;
                int i25 = i21 + i24;
                canvas3.clipRect(i20, i21, iMin, Math.min(i25, d10.f18074f));
                int i26 = h12.f19200f;
                C5 c13 = (C5) j11.f19749d.get(i26);
                if (c13 == null && (c13 = (C5) j11.f19751f.get(i26)) == null) {
                    c13 = this.f20065e;
                }
                SparseArray sparseArray5 = h12.f19204j;
                SparseArray sparseArray6 = sparseArray4;
                int i27 = i19;
                int i28 = 0;
                while (i28 < sparseArray5.size()) {
                    int iKeyAt = sparseArray5.keyAt(i28);
                    int i29 = i28;
                    I5 i30 = (I5) sparseArray5.valueAt(i28);
                    SparseArray sparseArray7 = sparseArray5;
                    E5 e10 = (E5) j11.f19750e.get(iKeyAt);
                    if (e10 == null) {
                        e10 = (E5) j11.f19752g.get(iKeyAt);
                    }
                    if (e10 != null) {
                        Paint paint = e10.f18380b ? null : this.f20061a;
                        int i31 = h12.f19199e;
                        int i32 = i30.f19477a + i20;
                        int i33 = i21 + i30.f19478b;
                        canvas2 = canvas3;
                        int[] iArr = i31 == 3 ? c13.f17784d : i31 == 2 ? c13.f17783c : c13.f17782b;
                        i13 = i23;
                        h(e10.f18381c, iArr, i31, i32, i33, paint, canvas2);
                        h(e10.f18382d, iArr, i31, i32, i33 + 1, paint, canvas2);
                    } else {
                        canvas2 = canvas3;
                        i13 = i23;
                    }
                    i20 = i20;
                    i23 = i13;
                    i28 = i29 + 1;
                    i22 = i22;
                    canvas3 = canvas2;
                    sparseArray5 = sparseArray7;
                    j11 = j11;
                }
                J5 j12 = j11;
                Canvas canvas4 = canvas3;
                int i34 = i20;
                int i35 = i22;
                int i36 = i23;
                float f14 = i21;
                float f15 = i34;
                if (h12.f19196b) {
                    int i37 = h12.f19199e;
                    if (i37 == 3) {
                        i12 = c13.f17784d[h12.f19201g];
                        c12 = 2;
                    } else {
                        c12 = 2;
                        i12 = i37 == 2 ? c13.f17783c[h12.f19202h] : c13.f17782b[h12.f19203i];
                    }
                    Paint paint2 = this.f20062b;
                    paint2.setColor(i12);
                    float f16 = i36;
                    c11 = c12;
                    c10 = 3;
                    canvas = canvas4;
                    canvas.drawRect(f15, f14, f16, i25, paint2);
                } else {
                    canvas = canvas4;
                    c10 = 3;
                    c11 = 2;
                }
                C3955jD c3955jD = new C3955jD();
                c3955jD.c(Bitmap.createBitmap(this.f20067g, i34, i21, i35, i24));
                float f17 = d10.f18069a;
                c3955jD.i(f15 / f17);
                c3955jD.j(0);
                float f18 = d10.f18070b;
                c3955jD.f(f14 / f18, 0);
                c3955jD.g(0);
                c3955jD.m(i35 / f17);
                c3955jD.n(i24 / f18);
                arrayList.add(c3955jD.r());
                canvas.drawColor(0, PorterDuff.Mode.CLEAR);
                canvas.restore();
                i19 = i27 + 1;
                z9 = z10;
                j11 = j12;
                sparseArray4 = sparseArray6;
            }
            c4695p5 = new C4695p5(arrayList, -9223372036854775807L, -9223372036854775807L);
        }
        interfaceC3977jO.zza(c4695p5);
    }
}
