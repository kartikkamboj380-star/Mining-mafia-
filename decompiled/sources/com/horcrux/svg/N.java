package com.horcrux.svg;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
class N {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static ArrayList f41381d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static int f41382e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static L f41383f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static L f41384g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static L f41385h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static L f41386i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static boolean f41387j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    O f41388a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    L f41389b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    double f41390c;

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f41391a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f41392b;

        static {
            int[] iArr = new int[EnumC6775g.values().length];
            f41392b = iArr;
            try {
                iArr[EnumC6775g.kCGPathElementAddCurveToPoint.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f41392b[EnumC6775g.kCGPathElementAddQuadCurveToPoint.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f41392b[EnumC6775g.kCGPathElementMoveToPoint.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f41392b[EnumC6775g.kCGPathElementAddLineToPoint.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f41392b[EnumC6775g.kCGPathElementCloseSubpath.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            int[] iArr2 = new int[O.values().length];
            f41391a = iArr2;
            try {
                iArr2[O.kStartMarker.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f41391a[O.kMidMarker.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f41391a[O.kEndMarker.ordinal()] = 3;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    private N(O o10, L l10, double d10) {
        this.f41388a = o10;
        this.f41389b = l10;
        this.f41390c = d10;
    }

    private static double a(double d10, double d11) {
        if (Math.abs(d10 - d11) > 180.0d) {
            d10 += 360.0d;
        }
        return (d10 + d11) / 2.0d;
    }

    private static void b(S s10, L l10, L l11, L l12) {
        s10.f41415a = k(l11, l10);
        s10.f41416b = k(l12, l11);
        if (i(s10.f41415a)) {
            s10.f41415a = s10.f41416b;
        } else if (i(s10.f41416b)) {
            s10.f41416b = s10.f41415a;
        }
    }

    private static double c(O o10) {
        double dJ = j(f(f41385h));
        double dJ2 = j(f(f41386i));
        int i10 = a.f41391a[o10.ordinal()];
        if (i10 == 1) {
            return f41387j ? dJ2 + 180.0d : dJ2;
        }
        if (i10 == 2) {
            return a(dJ, dJ2);
        }
        if (i10 != 3) {
            return 0.0d;
        }
        return dJ;
    }

    private static S d(H h10) {
        S s10 = new S();
        L[] lArr = h10.f41349b;
        int i10 = a.f41392b[h10.f41348a.ordinal()];
        if (i10 == 1) {
            s10.f41417c = lArr[2];
            s10.f41415a = k(lArr[0], f41383f);
            s10.f41416b = k(lArr[2], lArr[1]);
            if (i(s10.f41415a)) {
                b(s10, lArr[0], lArr[1], lArr[2]);
                return s10;
            }
            if (i(s10.f41416b)) {
                b(s10, f41383f, lArr[0], lArr[1]);
            }
        } else {
            if (i10 == 2) {
                L l10 = lArr[1];
                s10.f41417c = l10;
                b(s10, f41383f, lArr[0], l10);
                return s10;
            }
            if (i10 == 3 || i10 == 4) {
                L l11 = lArr[0];
                s10.f41417c = l11;
                s10.f41415a = k(l11, f41383f);
                s10.f41416b = k(s10.f41417c, f41383f);
                return s10;
            }
            if (i10 == 5) {
                L l12 = f41384g;
                s10.f41417c = l12;
                s10.f41415a = k(l12, f41383f);
                s10.f41416b = k(s10.f41417c, f41383f);
                return s10;
            }
        }
        return s10;
    }

    private static void e() {
        O o10 = O.kEndMarker;
        f41381d.add(new N(o10, f41383f, c(o10)));
    }

    private static double f(L l10) {
        return Math.atan2(l10.f41379b, l10.f41378a);
    }

    private static void g(H h10) {
        S sD = d(h10);
        f41386i = sD.f41415a;
        int i10 = f41382e;
        if (i10 > 0) {
            O o10 = i10 == 1 ? O.kStartMarker : O.kMidMarker;
            f41381d.add(new N(o10, f41383f, c(o10)));
        }
        f41385h = sD.f41416b;
        f41383f = sD.f41417c;
        EnumC6775g enumC6775g = h10.f41348a;
        if (enumC6775g == EnumC6775g.kCGPathElementMoveToPoint) {
            f41384g = h10.f41349b[0];
        } else if (enumC6775g == EnumC6775g.kCGPathElementCloseSubpath) {
            f41384g = new L(0.0d, 0.0d);
        }
        f41382e++;
    }

    static ArrayList h(ArrayList arrayList) {
        f41381d = new ArrayList();
        int i10 = 0;
        f41382e = 0;
        f41383f = new L(0.0d, 0.0d);
        f41384g = new L(0.0d, 0.0d);
        int size = arrayList.size();
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            g((H) obj);
        }
        e();
        return f41381d;
    }

    private static boolean i(L l10) {
        return l10.f41378a == 0.0d && l10.f41379b == 0.0d;
    }

    private static double j(double d10) {
        return d10 * 57.29577951308232d;
    }

    private static L k(L l10, L l11) {
        return new L(l11.f41378a - l10.f41378a, l11.f41379b - l10.f41379b);
    }
}
