package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.aN0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
abstract class AbstractC2846aN0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static volatile int f26493a = 100;

    AbstractC2846aN0() {
    }

    abstract void a(Object obj, int i10, long j10);

    abstract void b(Object obj, int i10, int i11);

    abstract void c(Object obj, int i10, long j10);

    abstract void d(Object obj, int i10, AbstractC5231tL0 abstractC5231tL0);

    abstract void e(Object obj, int i10, Object obj2);

    abstract Object f();

    abstract Object g(Object obj);

    abstract Object h(Object obj);

    abstract void i(Object obj, Object obj2);

    abstract void j(Object obj);

    final boolean k(Object obj, KM0 km0, int i10) throws C3598gM0 {
        int iZzc = km0.zzc();
        int i11 = iZzc >>> 3;
        int i12 = iZzc & 7;
        if (i12 == 0) {
            a(obj, i11, km0.c());
            return true;
        }
        if (i12 == 1) {
            c(obj, i11, km0.d());
            return true;
        }
        if (i12 == 2) {
            d(obj, i11, km0.a());
            return true;
        }
        if (i12 != 3) {
            if (i12 == 4) {
                if (i10 != 0) {
                    return false;
                }
                throw new C3598gM0("Protocol message end-group tag did not match expected tag.");
            }
            if (i12 != 5) {
                throw new C3472fM0("Protocol message tag had invalid wire type.");
            }
            b(obj, i11, km0.zzk());
            return true;
        }
        Object objF = f();
        int i13 = i11 << 3;
        int i14 = i10 + 1;
        if (i14 >= f26493a) {
            throw new C3598gM0("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        while (km0.zzb() != Integer.MAX_VALUE && k(objF, km0, i14)) {
        }
        if ((i13 | 4) != km0.zzc()) {
            throw new C3598gM0("Protocol message end-group tag did not match expected tag.");
        }
        e(obj, i11, g(objF));
        return true;
    }
}
