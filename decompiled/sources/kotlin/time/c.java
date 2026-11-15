package kotlin.time;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public abstract class c {
    /* JADX INFO: Access modifiers changed from: private */
    public static final long h(long j10, int i10) {
        return b.k((j10 << 1) + ((long) i10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long i(long j10) {
        return b.k((j10 << 1) + 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long j(long j10) {
        return (-4611686018426L > j10 || j10 >= 4611686018427L) ? i(kotlin.ranges.b.k(j10, -4611686018427387903L, 4611686018427387903L)) : k(m(j10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long k(long j10) {
        return b.k(j10 << 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long l(long j10) {
        return (-4611686018426999999L > j10 || j10 >= 4611686018427000000L) ? i(n(j10)) : k(j10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long m(long j10) {
        return j10 * ((long) 1000000);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long n(long j10) {
        return j10 / ((long) 1000000);
    }

    public static final long o(double d10, H8.b unit) {
        Intrinsics.checkNotNullParameter(unit, "unit");
        double dA = d.a(d10, unit, H8.b.NANOSECONDS);
        if (Double.isNaN(dA)) {
            throw new IllegalArgumentException("Duration value cannot be NaN.");
        }
        long jD = B8.a.d(dA);
        return (-4611686018426999999L > jD || jD >= 4611686018427000000L) ? j(B8.a.d(d.a(d10, unit, H8.b.MILLISECONDS))) : k(jD);
    }

    public static final long p(int i10, H8.b unit) {
        Intrinsics.checkNotNullParameter(unit, "unit");
        return unit.compareTo(H8.b.SECONDS) <= 0 ? k(d.c(i10, unit, H8.b.NANOSECONDS)) : q(i10, unit);
    }

    public static final long q(long j10, H8.b unit) {
        Intrinsics.checkNotNullParameter(unit, "unit");
        H8.b bVar = H8.b.NANOSECONDS;
        long jC = d.c(4611686018426999999L, bVar, unit);
        return ((-jC) > j10 || j10 > jC) ? i(kotlin.ranges.b.k(d.b(j10, unit, H8.b.MILLISECONDS), -4611686018427387903L, 4611686018427387903L)) : k(d.c(j10, unit, bVar));
    }
}
