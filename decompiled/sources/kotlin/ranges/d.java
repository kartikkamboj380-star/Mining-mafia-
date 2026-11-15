package kotlin.ranges;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes3.dex */
public class d extends c {
    public static float b(float f10, float f11) {
        return f10 < f11 ? f11 : f10;
    }

    public static int c(int i10, int i11) {
        return i10 < i11 ? i11 : i10;
    }

    public static long d(long j10, long j11) {
        return j10 < j11 ? j11 : j10;
    }

    public static double e(double d10, double d11) {
        return d10 > d11 ? d11 : d10;
    }

    public static float f(float f10, float f11) {
        return f10 > f11 ? f11 : f10;
    }

    public static int g(int i10, int i11) {
        return i10 > i11 ? i11 : i10;
    }

    public static long h(long j10, long j11) {
        return j10 > j11 ? j11 : j10;
    }

    public static float i(float f10, float f11, float f12) {
        if (f11 <= f12) {
            if (f10 < f11) {
                return f11;
            }
            return f10 > f12 ? f12 : f10;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + f12 + " is less than minimum " + f11 + '.');
    }

    public static int j(int i10, int i11, int i12) {
        if (i11 <= i12) {
            if (i10 < i11) {
                return i11;
            }
            return i10 > i12 ? i12 : i10;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + i12 + " is less than minimum " + i11 + '.');
    }

    public static long k(long j10, long j11, long j12) {
        if (j11 <= j12) {
            if (j10 < j11) {
                return j11;
            }
            return j10 > j12 ? j12 : j10;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + j12 + " is less than minimum " + j11 + '.');
    }

    public static a l(int i10, int i11) {
        return a.f45995d.a(i10, i11, -1);
    }

    public static a m(a aVar, int i10) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        c.a(i10 > 0, Integer.valueOf(i10));
        a.C0464a c0464a = a.f45995d;
        int iA = aVar.a();
        int iB = aVar.b();
        if (aVar.e() <= 0) {
            i10 = -i10;
        }
        return c0464a.a(iA, iB, i10);
    }

    public static IntRange n(int i10, int i11) {
        return i11 <= Integer.MIN_VALUE ? IntRange.f45993e.a() : new IntRange(i10, i11 - 1);
    }
}
