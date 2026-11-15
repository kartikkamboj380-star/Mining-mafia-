package com.horcrux.svg;

import android.graphics.Path;
import android.graphics.RectF;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
abstract class I {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static float f41350a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f41351b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static int f41352c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static String f41353d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static Path f41354e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    static ArrayList f41355f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static float f41356g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static float f41357h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static float f41358i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static float f41359j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static float f41360k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static float f41361l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static boolean f41362m;

    private static void A(float f10, float f11, float f12, float f13) {
        float f14 = (f41356g * 2.0f) - f41358i;
        float f15 = (f41357h * 2.0f) - f41359j;
        f41358i = f10;
        f41359j = f11;
        e(f14, f15, f10, f11, f12, f13);
    }

    private static void B(float f10, float f11) {
        C(f10 + f41356g, f11 + f41357h);
    }

    private static void C(float f10, float f11) {
        u((f41356g * 2.0f) - f41358i, (f41357h * 2.0f) - f41359j, f10, f11);
    }

    private static void a(float f10, float f11, float f12, boolean z9, boolean z10, float f13, float f14) {
        b(f10, f11, f12, z9, z10, f13 + f41356g, f14 + f41357h);
    }

    private static void b(float f10, float f11, float f12, boolean z9, boolean z10, float f13, float f14) {
        float f15;
        float f16;
        float f17;
        float f18;
        float f19 = f41356g;
        float f20 = f41357h;
        if (f11 == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            f15 = f10 == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? f14 - f20 : f10;
        } else {
            f15 = f11;
        }
        float fAbs = Math.abs(f15);
        float fAbs2 = Math.abs(f10 == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? f13 - f19 : f10);
        if (fAbs2 == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || fAbs == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || (f13 == f19 && f14 == f20)) {
            l(f13, f14);
            return;
        }
        float radians = (float) Math.toRadians(f12);
        double d10 = radians;
        float fCos = (float) Math.cos(d10);
        float fSin = (float) Math.sin(d10);
        float f21 = f13 - f19;
        float f22 = f14 - f20;
        float f23 = ((fCos * f21) / 2.0f) + ((fSin * f22) / 2.0f);
        float f24 = -fSin;
        float f25 = ((f24 * f21) / 2.0f) + ((fCos * f22) / 2.0f);
        float f26 = fAbs2 * fAbs2;
        float f27 = f26 * fAbs * fAbs;
        float f28 = fAbs * fAbs * f23 * f23;
        float f29 = f26 * f25 * f25;
        float f30 = (f27 - f29) - f28;
        if (f30 < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            float fSqrt = (float) Math.sqrt(1.0f - (f30 / f27));
            fAbs2 *= fSqrt;
            f18 = fAbs * fSqrt;
            f17 = f21 / 2.0f;
            f16 = f22 / 2.0f;
        } else {
            float fSqrt2 = (float) Math.sqrt(f30 / (f29 + f28));
            if (z9 == z10) {
                fSqrt2 = -fSqrt2;
            }
            float f31 = (((-fSqrt2) * f25) * fAbs2) / fAbs;
            float f32 = ((fSqrt2 * f23) * fAbs) / fAbs2;
            f16 = (f22 / 2.0f) + (f31 * fSin) + (f32 * fCos);
            f17 = ((fCos * f31) - (fSin * f32)) + (f21 / 2.0f);
            f18 = fAbs;
        }
        float f33 = fCos / fAbs2;
        float f34 = fSin / fAbs2;
        float f35 = f24 / f18;
        float f36 = fCos / f18;
        float f37 = -f17;
        float f38 = -f16;
        float f39 = f17;
        float fAtan2 = (float) Math.atan2((f35 * f37) + (f36 * f38), (f37 * f33) + (f34 * f38));
        float f40 = f21 - f39;
        float f41 = f22 - f16;
        float fAtan3 = (float) Math.atan2((f35 * f40) + (f36 * f41), (f33 * f40) + (f34 * f41));
        float f42 = f39 + f19;
        float f43 = f16 + f20;
        float f44 = f21 + f19;
        float f45 = f22 + f20;
        w();
        f41358i = f44;
        f41356g = f44;
        f41359j = f45;
        f41357h = f45;
        if (fAbs2 != f18 || radians != 0) {
            c(f42, f43, fAbs2, f18, fAtan2, fAtan3, z10, radians);
            return;
        }
        float degrees = (float) Math.toDegrees(fAtan2);
        float fAbs3 = Math.abs((degrees - ((float) Math.toDegrees(fAtan3))) % 360.0f);
        if (!z9 ? fAbs3 > 180.0f : fAbs3 < 180.0f) {
            fAbs3 = 360.0f - fAbs3;
        }
        if (!z10) {
            fAbs3 = -fAbs3;
        }
        float f46 = f41350a;
        f41354e.arcTo(new RectF((f42 - fAbs2) * f46, (f43 - fAbs2) * f46, (f42 + fAbs2) * f46, (f43 + fAbs2) * f46), degrees, fAbs3);
        f41355f.add(new H(EnumC6775g.kCGPathElementAddCurveToPoint, new L[]{new L(f44, f45)}));
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0067 A[LOOP:0: B:12:0x0065->B:13:0x0067, LOOP_END] */
    private static void c(float f10, float f11, float f12, float f13, float f14, float f15, boolean z9, float f16) {
        double d10;
        int iCeil;
        float f17;
        float fTan;
        float fCos;
        float fSin;
        int i10;
        float f18 = f14;
        double d11 = f16;
        float fCos2 = (float) Math.cos(d11);
        float fSin2 = (float) Math.sin(d11);
        float f19 = fCos2 * f12;
        float f20 = (-fSin2) * f13;
        float f21 = fSin2 * f12;
        float f22 = fCos2 * f13;
        float f23 = f15 - f18;
        if (f23 >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || !z9) {
            if (f23 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && !z9) {
                d10 = ((double) f23) - 6.283185307179586d;
            }
            iCeil = (int) Math.ceil(Math.abs(v(((double) f23) / 1.5707963267948966d)));
            f17 = f23 / iCeil;
            fTan = (float) (Math.tan(f17 / 4.0f) * 1.3333333333333333d);
            double d12 = f18;
            fCos = (float) Math.cos(d12);
            fSin = (float) Math.sin(d12);
            i10 = 0;
            while (i10 < iCeil) {
                float f24 = fCos - (fTan * fSin);
                float f25 = fSin + (fCos * fTan);
                float f26 = f18 + f17;
                double d13 = f26;
                float fCos3 = (float) Math.cos(d13);
                float fSin3 = (float) Math.sin(d13);
                float f27 = (fTan * fSin3) + fCos3;
                float f28 = fSin3 - (fTan * fCos3);
                float f29 = f10 + (f19 * f24) + (f20 * f25);
                float f30 = f11 + (f24 * f21) + (f25 * f22);
                float f31 = f10 + (f19 * f27) + (f20 * f28);
                float f32 = f11 + (f27 * f21) + (f28 * f22);
                float f33 = f10 + (f19 * fCos3) + (f20 * fSin3);
                float f34 = f11 + (f21 * fCos3) + (f22 * fSin3);
                Path path = f41354e;
                float f35 = f41350a;
                path.cubicTo(f29 * f35, f30 * f35, f31 * f35, f32 * f35, f33 * f35, f35 * f34);
                float f36 = f17;
                f41355f.add(new H(EnumC6775g.kCGPathElementAddCurveToPoint, new L[]{new L(f29, f30), new L(f31, f32), new L(f33, f34)}));
                i10++;
                f18 = f26;
                f22 = f22;
                f17 = f36;
                f21 = f21;
                fSin = fSin3;
                f19 = f19;
                f20 = f20;
                iCeil = iCeil;
                fCos = fCos3;
            }
        }
        d10 = ((double) f23) + 6.283185307179586d;
        f23 = (float) d10;
        iCeil = (int) Math.ceil(Math.abs(v(((double) f23) / 1.5707963267948966d)));
        f17 = f23 / iCeil;
        fTan = (float) (Math.tan(f17 / 4.0f) * 1.3333333333333333d);
        double d14 = f18;
        fCos = (float) Math.cos(d14);
        fSin = (float) Math.sin(d14);
        i10 = 0;
        while (i10 < iCeil) {
            float f210 = fCos - (fTan * fSin);
            float f211 = fSin + (fCos * fTan);
            float f212 = f18 + f17;
            double d15 = f212;
            float fCos4 = (float) Math.cos(d15);
            float fSin4 = (float) Math.sin(d15);
            float f213 = (fTan * fSin4) + fCos4;
            float f214 = fSin4 - (fTan * fCos4);
            float f215 = f10 + (f19 * f210) + (f20 * f211);
            float f37 = f11 + (f210 * f21) + (f211 * f22);
            float f38 = f10 + (f19 * f213) + (f20 * f214);
            float f39 = f11 + (f213 * f21) + (f214 * f22);
            float f310 = f10 + (f19 * fCos4) + (f20 * fSin4);
            float f311 = f11 + (f21 * fCos4) + (f22 * fSin4);
            Path path2 = f41354e;
            float f312 = f41350a;
            path2.cubicTo(f215 * f312, f37 * f312, f38 * f312, f39 * f312, f310 * f312, f312 * f311);
            float f313 = f17;
            f41355f.add(new H(EnumC6775g.kCGPathElementAddCurveToPoint, new L[]{new L(f215, f37), new L(f38, f39), new L(f310, f311)}));
            i10++;
            f18 = f212;
            f22 = f22;
            f17 = f313;
            f21 = f21;
            fSin = fSin4;
            f19 = f19;
            f20 = f20;
            iCeil = iCeil;
            fCos = fCos4;
        }
    }

    private static void d() {
        if (f41362m) {
            f41356g = f41360k;
            f41357h = f41361l;
            f41362m = false;
            f41354e.close();
            f41355f.add(new H(EnumC6775g.kCGPathElementCloseSubpath, new L[]{new L(f41356g, f41357h)}));
        }
    }

    private static void e(float f10, float f11, float f12, float f13, float f14, float f15) {
        w();
        f41356g = f14;
        f41357h = f15;
        Path path = f41354e;
        float f16 = f41350a;
        path.cubicTo(f10 * f16, f11 * f16, f12 * f16, f13 * f16, f14 * f16, f16 * f15);
        f41355f.add(new H(EnumC6775g.kCGPathElementAddCurveToPoint, new L[]{new L(f10, f11), new L(f12, f13), new L(f14, f15)}));
    }

    private static void f(float f10, float f11, float f12, float f13, float f14, float f15) {
        float f16 = f41356g;
        float f17 = f41357h;
        g(f10 + f16, f11 + f17, f12 + f16, f13 + f17, f14 + f16, f15 + f17);
    }

    private static void g(float f10, float f11, float f12, float f13, float f14, float f15) {
        f41358i = f12;
        f41359j = f13;
        e(f10, f11, f12, f13, f14, f15);
    }

    private static boolean h(char c10) {
        return Character.isUpperCase(c10);
    }

    private static boolean i(char c10) {
        switch (c10) {
            case 'A':
            case 'C':
            case 'H':
            case 'L':
            case 'M':
            case 'Q':
            case 'S':
            case 'T':
            case 'V':
            case 'Z':
            case 'a':
            case 'c':
            case 'h':
            case 'l':
            case 'm':
            case 'q':
            case 's':
            case 't':
            case 'v':
            case 'z':
                return true;
            default:
                return false;
        }
    }

    private static boolean j(char c10) {
        return (c10 >= '0' && c10 <= '9') || c10 == '.' || c10 == '-' || c10 == '+';
    }

    private static void k(float f10, float f11) {
        l(f10 + f41356g, f11 + f41357h);
    }

    private static void l(float f10, float f11) {
        w();
        f41356g = f10;
        f41358i = f10;
        f41357h = f11;
        f41359j = f11;
        Path path = f41354e;
        float f12 = f41350a;
        path.lineTo(f10 * f12, f12 * f11);
        f41355f.add(new H(EnumC6775g.kCGPathElementAddLineToPoint, new L[]{new L(f10, f11)}));
    }

    private static void m(float f10, float f11) {
        n(f10 + f41356g, f11 + f41357h);
    }

    private static void n(float f10, float f11) {
        f41356g = f10;
        f41358i = f10;
        f41360k = f10;
        f41357h = f11;
        f41359j = f11;
        f41361l = f11;
        Path path = f41354e;
        float f12 = f41350a;
        path.moveTo(f10 * f12, f12 * f11);
        f41355f.add(new H(EnumC6775g.kCGPathElementMoveToPoint, new L[]{new L(f10, f11)}));
    }

    static Path o(String str) {
        f41355f = new ArrayList();
        Path path = new Path();
        f41354e = path;
        if (str == null) {
            return path;
        }
        f41352c = str.length();
        f41353d = str;
        f41351b = 0;
        f41356g = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        f41357h = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        f41358i = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        f41359j = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        f41360k = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        f41361l = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        f41362m = false;
        char c10 = ' ';
        while (f41351b < f41352c) {
            y();
            int i10 = f41351b;
            if (i10 >= f41352c) {
                return f41354e;
            }
            boolean z9 = true;
            boolean z10 = c10 != ' ';
            char cCharAt = f41353d.charAt(i10);
            if (!z10 && cCharAt != 'M' && cCharAt != 'm') {
                throw new IllegalArgumentException(String.format("Unexpected character '%c' (i=%d, s=%s)", Character.valueOf(cCharAt), Integer.valueOf(f41351b), f41353d));
            }
            if (i(cCharAt)) {
                f41351b++;
                z9 = false;
                c10 = cCharAt;
            } else {
                if (!j(cCharAt) || !z10) {
                    throw new IllegalArgumentException(String.format("Unexpected character '%c' (i=%d, s=%s)", Character.valueOf(cCharAt), Integer.valueOf(f41351b), f41353d));
                }
                if (c10 == 'Z' || c10 == 'z') {
                    throw new IllegalArgumentException(String.format("Unexpected number after 'z' (s=%s)", f41353d));
                }
                if (c10 == 'M' || c10 == 'm') {
                    c10 = h(c10) ? 'L' : 'l';
                } else {
                    z9 = false;
                }
            }
            boolean zH = h(c10);
            switch (c10) {
                case 'A':
                    b(q(), q(), q(), p(), p(), q(), q());
                    break;
                case 'C':
                    g(q(), q(), q(), q(), q(), q());
                    break;
                case 'H':
                    l(q(), f41357h);
                    break;
                case 'L':
                    l(q(), q());
                    break;
                case 'M':
                    n(q(), q());
                    break;
                case 'Q':
                    u(q(), q(), q(), q());
                    break;
                case 'S':
                    A(q(), q(), q(), q());
                    break;
                case 'T':
                    C(q(), q());
                    break;
                case 'V':
                    l(f41356g, q());
                    break;
                case 'Z':
                case 'z':
                    d();
                    break;
                case 'a':
                    a(q(), q(), q(), p(), p(), q(), q());
                    break;
                case 'c':
                    f(q(), q(), q(), q(), q(), q());
                    break;
                case 'h':
                    k(q(), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                    break;
                case 'l':
                    k(q(), q());
                    break;
                case 'm':
                    m(q(), q());
                    break;
                case 'q':
                    t(q(), q(), q(), q());
                    break;
                case 's':
                    z(q(), q(), q(), q());
                    break;
                case 't':
                    B(q(), q());
                    break;
                case 'v':
                    k(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, q());
                    break;
                default:
                    throw new IllegalArgumentException(String.format("Unexpected comand '%c' (s=%s)", Character.valueOf(c10), f41353d));
            }
            if (z9) {
                c10 = zH ? 'M' : 'm';
            }
        }
        return f41354e;
    }

    private static boolean p() {
        y();
        char cCharAt = f41353d.charAt(f41351b);
        if (cCharAt != '0' && cCharAt != '1') {
            throw new Error(String.format("Unexpected flag '%c' (i=%d, s=%s)", Character.valueOf(cCharAt), Integer.valueOf(f41351b), f41353d));
        }
        int i10 = f41351b + 1;
        f41351b = i10;
        if (i10 < f41352c && f41353d.charAt(i10) == ',') {
            f41351b++;
        }
        y();
        return cCharAt == '1';
    }

    private static float q() {
        if (f41351b == f41352c) {
            throw new Error(String.format("Unexpected end (s=%s)", f41353d));
        }
        float fS = s();
        y();
        r();
        return fS;
    }

    private static void r() {
        int i10 = f41351b;
        if (i10 >= f41352c || f41353d.charAt(i10) != ',') {
            return;
        }
        f41351b++;
    }

    private static float s() {
        char cCharAt;
        y();
        int i10 = f41351b;
        if (i10 == f41352c) {
            throw new Error(String.format("Unexpected end (s=%s)", f41353d));
        }
        char cCharAt2 = f41353d.charAt(i10);
        if (cCharAt2 == '-' || cCharAt2 == '+') {
            int i11 = f41351b + 1;
            f41351b = i11;
            cCharAt2 = f41353d.charAt(i11);
        }
        if (cCharAt2 >= '0' && cCharAt2 <= '9') {
            x();
            int i12 = f41351b;
            if (i12 < f41352c) {
                cCharAt2 = f41353d.charAt(i12);
            }
        } else if (cCharAt2 != '.') {
            throw new IllegalArgumentException(String.format("Invalid number formating character '%c' (i=%d, s=%s)", Character.valueOf(cCharAt2), Integer.valueOf(f41351b), f41353d));
        }
        if (cCharAt2 == '.') {
            f41351b++;
            x();
            int i13 = f41351b;
            if (i13 < f41352c) {
                cCharAt2 = f41353d.charAt(i13);
            }
        }
        if (cCharAt2 == 'e' || cCharAt2 == 'E') {
            int i14 = f41351b;
            if (i14 + 1 < f41352c && (cCharAt = f41353d.charAt(i14 + 1)) != 'm' && cCharAt != 'x') {
                int i15 = f41351b + 1;
                f41351b = i15;
                char cCharAt3 = f41353d.charAt(i15);
                if (cCharAt3 == '+' || cCharAt3 == '-') {
                    f41351b++;
                    x();
                } else {
                    if (cCharAt3 < '0' || cCharAt3 > '9') {
                        throw new IllegalArgumentException(String.format("Invalid number formating character '%c' (i=%d, s=%s)", Character.valueOf(cCharAt3), Integer.valueOf(f41351b), f41353d));
                    }
                    x();
                }
            }
        }
        String strSubstring = f41353d.substring(i10, f41351b);
        float f10 = Float.parseFloat(strSubstring);
        if (Float.isInfinite(f10) || Float.isNaN(f10)) {
            throw new IllegalArgumentException(String.format("Invalid number '%s' (start=%d, i=%d, s=%s)", strSubstring, Integer.valueOf(i10), Integer.valueOf(f41351b), f41353d));
        }
        return f10;
    }

    private static void t(float f10, float f11, float f12, float f13) {
        float f14 = f41356g;
        float f15 = f41357h;
        u(f10 + f14, f11 + f15, f12 + f14, f13 + f15);
    }

    private static void u(float f10, float f11, float f12, float f13) {
        f41358i = f10;
        f41359j = f11;
        float f14 = f10 * 2.0f;
        float f15 = f11 * 2.0f;
        e((f41356g + f14) / 3.0f, (f41357h + f15) / 3.0f, (f12 + f14) / 3.0f, (f13 + f15) / 3.0f, f12, f13);
    }

    private static double v(double d10) {
        double dPow = Math.pow(10.0d, 4.0d);
        return Math.round(d10 * dPow) / dPow;
    }

    private static void w() {
        if (f41362m) {
            return;
        }
        f41360k = f41356g;
        f41361l = f41357h;
        f41362m = true;
    }

    private static void x() {
        while (true) {
            int i10 = f41351b;
            if (i10 >= f41352c || !Character.isDigit(f41353d.charAt(i10))) {
                return;
            } else {
                f41351b++;
            }
        }
    }

    private static void y() {
        while (true) {
            int i10 = f41351b;
            if (i10 >= f41352c || !Character.isWhitespace(f41353d.charAt(i10))) {
                return;
            } else {
                f41351b++;
            }
        }
    }

    private static void z(float f10, float f11, float f12, float f13) {
        float f14 = f41356g;
        float f15 = f41357h;
        A(f10 + f14, f11 + f15, f12 + f14, f13 + f15);
    }
}
