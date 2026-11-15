package com.google.android.gms.internal.ads;

import java.math.RoundingMode;

/* JADX INFO: loaded from: classes2.dex */
public final class L90 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long f20401a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f20402b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f20403c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ThreadLocal f20404d = new ThreadLocal();

    public L90(long j10) {
        d(0L);
    }

    public static long i(long j10) {
        return AbstractC4634ob0.P(j10, 1000000L, 90000L, RoundingMode.DOWN);
    }

    public static long j(long j10) {
        return AbstractC4634ob0.P(j10, 90000L, 1000000L, RoundingMode.DOWN);
    }

    public final synchronized long a() {
        long j10 = this.f20401a;
        if (j10 == Long.MAX_VALUE || j10 == 9223372036854775806L) {
            return -9223372036854775807L;
        }
        return j10;
    }

    public final synchronized long b() {
        long j10;
        try {
            j10 = this.f20403c;
        } catch (Throwable th) {
            throw th;
        }
        return j10 != -9223372036854775807L ? j10 + this.f20402b : a();
    }

    public final synchronized long c() {
        return this.f20402b;
    }

    public final synchronized void d(long j10) {
        this.f20401a = j10;
        this.f20402b = j10 == Long.MAX_VALUE ? 0L : -9223372036854775807L;
        this.f20403c = -9223372036854775807L;
    }

    public final synchronized long e(long j10) {
        if (j10 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        try {
            long j11 = this.f20403c;
            if (j11 != -9223372036854775807L) {
                long j12 = j(j11);
                long j13 = (4294967296L + j12) / 8589934592L;
                long j14 = (((-1) + j13) * 8589934592L) + j10;
                j10 += j13 * 8589934592L;
                if (Math.abs(j14 - j12) < Math.abs(j10 - j12)) {
                    j10 = j14;
                }
            }
            return g(i(j10));
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized long f(long j10) {
        if (j10 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        try {
            long j11 = this.f20403c;
            if (j11 != -9223372036854775807L) {
                long j12 = j(j11);
                long j13 = j12 / 8589934592L;
                long j14 = (j13 * 8589934592L) + j10;
                j10 += (j13 + 1) * 8589934592L;
                if (j14 >= j12) {
                    j10 = j14;
                }
            }
            return g(i(j10));
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized long g(long j10) {
        if (j10 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        try {
            if (!h()) {
                long jLongValue = this.f20401a;
                if (jLongValue == 9223372036854775806L) {
                    Long l10 = (Long) this.f20404d.get();
                    if (l10 == null) {
                        throw null;
                    }
                    jLongValue = l10.longValue();
                }
                this.f20402b = jLongValue - j10;
                notifyAll();
            }
            this.f20403c = j10;
            return j10 + this.f20402b;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized boolean h() {
        return this.f20402b != -9223372036854775807L;
    }
}
