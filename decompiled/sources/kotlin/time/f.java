package kotlin.time;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public abstract class f {
    private static final long a(long j10) {
        return j10 < 0 ? b.f46051b.b() : b.f46051b.a();
    }

    public static final long b(long j10, long j11, H8.b unit) {
        Intrinsics.checkNotNullParameter(unit, "unit");
        return (1 | (j11 - 1)) == Long.MAX_VALUE ? b.L(a(j11)) : c(j10, j11, unit);
    }

    private static final long c(long j10, long j11, H8.b bVar) {
        long j12 = j10 - j11;
        if (((j12 ^ j10) & (~(j12 ^ j11))) >= 0) {
            return c.q(j12, bVar);
        }
        H8.b bVar2 = H8.b.MILLISECONDS;
        if (bVar.compareTo(bVar2) >= 0) {
            return b.L(a(j12));
        }
        long jB = d.b(1L, bVar2, bVar);
        long j13 = (j10 / jB) - (j11 / jB);
        long j14 = (j10 % jB) - (j11 % jB);
        b.a aVar = b.f46051b;
        return b.H(c.q(j13, bVar2), c.q(j14, bVar));
    }

    public static final long d(long j10, long j11, H8.b unit) {
        Intrinsics.checkNotNullParameter(unit, "unit");
        if (((j11 - 1) | 1) == Long.MAX_VALUE) {
            return j10 == j11 ? b.f46051b.c() : b.L(a(j11));
        }
        return (1 | (j10 - 1)) == Long.MAX_VALUE ? a(j10) : c(j10, j11, unit);
    }
}
