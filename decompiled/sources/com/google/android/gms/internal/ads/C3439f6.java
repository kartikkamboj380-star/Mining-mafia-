package com.google.android.gms.internal.ads;

import android.graphics.Bitmap;
import android.graphics.Rect;
import java.util.Arrays;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.f6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C3439f6 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f28176b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f28177c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int[] f28178d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f28179e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f28180f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Rect f28181g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int[] f28175a = new int[4];

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f28182h = -1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f28183i = -1;

    private static int e(int[] iArr, int i10) {
        if (i10 >= iArr.length) {
            i10 = 0;
        }
        return iArr[i10];
    }

    private static int f(int i10, int i11) {
        return (i10 & 16777215) | ((i11 * 17) << 24);
    }

    private final void g(C4436n10 c4436n10, boolean z9, Rect rect, int[] iArr) {
        int i10;
        int i11;
        int i12 = !z9 ? 1 : 0;
        int iWidth = rect.width();
        int i13 = i12 * iWidth;
        int iHeight = rect.height();
        while (true) {
            int i14 = 0;
            do {
                int i15 = 1;
                int iJ = 0;
                while (true) {
                    if (iJ >= i15 || i15 > 64) {
                        i10 = iJ & 3;
                        if (iJ >= 4) {
                            i11 = iJ >> 2;
                            break;
                        } else {
                            i11 = iWidth;
                            break;
                        }
                    }
                    if (c4436n10.c() < 4) {
                        i10 = -1;
                        i11 = 0;
                        break;
                    } else {
                        iJ = (iJ << 4) | c4436n10.j(4);
                        i15 <<= 2;
                    }
                }
                int iMin = Math.min(i11, iWidth - i14);
                if (iMin > 0) {
                    int i16 = i13 + iMin;
                    Arrays.fill(iArr, i13, i16, this.f28175a[i10]);
                    i14 += iMin;
                    i13 = i16;
                }
            } while (i14 < iWidth);
            i12 += 2;
            if (i12 >= iHeight) {
                return;
            }
            i13 = i12 * iWidth;
            c4436n10.m();
        }
    }

    public final void a(String str) {
        int i10;
        String strTrim = str.trim();
        String str2 = AbstractC4634ob0.f32117a;
        for (String str3 : strTrim.split("\\r?\\n", -1)) {
            if (str3.startsWith("palette: ")) {
                String[] strArrSplit = str3.substring(9).split(",", -1);
                this.f28178d = new int[strArrSplit.length];
                for (int i11 = 0; i11 < strArrSplit.length; i11++) {
                    int[] iArr = this.f28178d;
                    try {
                        i10 = Integer.parseInt(strArrSplit[i11].trim(), 16);
                    } catch (RuntimeException unused) {
                        i10 = 0;
                    }
                    iArr[i11] = i10;
                }
            } else if (str3.startsWith("size: ")) {
                String[] strArrSplit2 = str3.substring(6).trim().split("x", -1);
                if (strArrSplit2.length == 2) {
                    try {
                        this.f28179e = Integer.parseInt(strArrSplit2[0]);
                        this.f28180f = Integer.parseInt(strArrSplit2[1]);
                        this.f28176b = true;
                    } catch (RuntimeException e10) {
                        YU.d("VobsubParser", "Parsing IDX failed", e10);
                    }
                }
            }
        }
    }

    public final void b(P10 p10) {
        int[] iArr = this.f28178d;
        if (iArr == null || !this.f28176b) {
            return;
        }
        p10.J(p10.S() - 2);
        int iS = p10.S();
        while (p10.F() < iS && p10.C() > 0) {
            switch (p10.R()) {
                case 0:
                case 1:
                case 2:
                    break;
                case 3:
                    if (p10.C() < 2) {
                        return;
                    }
                    int iR = p10.R();
                    int iR2 = p10.R();
                    int[] iArr2 = this.f28175a;
                    iArr2[3] = e(iArr, iR >> 4);
                    iArr2[2] = e(iArr, iR & 15);
                    iArr2[1] = e(iArr, iR2 >> 4);
                    iArr2[0] = e(iArr, iR2 & 15);
                    this.f28177c = true;
                    break;
                case 4:
                    if (p10.C() < 2 || !this.f28177c) {
                        return;
                    }
                    int iR3 = p10.R();
                    int iR4 = p10.R();
                    int[] iArr3 = this.f28175a;
                    iArr3[3] = f(iArr3[3], iR3 >> 4);
                    iArr3[2] = f(iArr3[2], iR3 & 15);
                    iArr3[1] = f(iArr3[1], iR4 >> 4);
                    iArr3[0] = f(iArr3[0], iR4 & 15);
                    break;
                case 5:
                    if (p10.C() < 6) {
                        return;
                    }
                    int iR5 = p10.R();
                    int iR6 = p10.R();
                    int i10 = iR6 >> 4;
                    int iR7 = ((iR6 & 15) << 8) | p10.R();
                    int iR8 = p10.R();
                    int iR9 = p10.R();
                    this.f28181g = new Rect((iR5 << 4) | i10, (iR8 << 4) | (iR9 >> 4), iR7 + 1, (((iR9 & 15) << 8) | p10.R()) + 1);
                    break;
                case 6:
                    if (p10.C() < 4) {
                        return;
                    }
                    this.f28182h = p10.S();
                    this.f28183i = p10.S();
                    break;
                default:
                    return;
            }
        }
    }

    public final KD c(P10 p10) {
        Rect rect;
        if (this.f28178d == null || !this.f28176b || !this.f28177c || (rect = this.f28181g) == null || this.f28182h == -1 || this.f28183i == -1 || rect.width() < 2 || this.f28181g.height() < 2) {
            return null;
        }
        Rect rect2 = this.f28181g;
        int[] iArr = new int[rect2.width() * rect2.height()];
        C4436n10 c4436n10 = new C4436n10();
        p10.G(this.f28182h);
        c4436n10.a(p10);
        g(c4436n10, true, rect2, iArr);
        p10.G(this.f28183i);
        c4436n10.a(p10);
        g(c4436n10, false, rect2, iArr);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iArr, rect2.width(), rect2.height(), Bitmap.Config.ARGB_8888);
        C3955jD c3955jD = new C3955jD();
        c3955jD.c(bitmapCreateBitmap);
        c3955jD.i(rect2.left / this.f28179e);
        c3955jD.j(0);
        c3955jD.f(rect2.top / this.f28180f, 0);
        c3955jD.g(0);
        c3955jD.m(rect2.width() / this.f28179e);
        c3955jD.n(rect2.height() / this.f28180f);
        return c3955jD.r();
    }

    public final void d() {
        this.f28177c = false;
        this.f28181g = null;
        this.f28182h = -1;
        this.f28183i = -1;
    }
}
