package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import com.unity3d.services.UnityAdsConstants;

/* JADX INFO: loaded from: classes2.dex */
public final class BQ0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f17584a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f17585b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f17586c = -9223372036854775807L;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f17587d = -9223372036854775807L;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long f17589f = -9223372036854775807L;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private long f17590g = -9223372036854775807L;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private float f17593j = 0.97f;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private float f17592i = 1.03f;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private float f17594k = 1.0f;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private long f17595l = -9223372036854775807L;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f17588e = -9223372036854775807L;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f17591h = -9223372036854775807L;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private long f17596m = -9223372036854775807L;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private long f17597n = -9223372036854775807L;

    /* synthetic */ BQ0(float f10, float f11, long j10, float f12, long j11, long j12, float f13, byte[] bArr) {
        this.f17584a = j11;
        this.f17585b = j12;
    }

    private final void f() {
        long j10;
        long j11 = this.f17586c;
        if (j11 != -9223372036854775807L) {
            j10 = this.f17587d;
            if (j10 == -9223372036854775807L) {
                long j12 = this.f17589f;
                if (j12 != -9223372036854775807L && j11 < j12) {
                    j11 = j12;
                }
                j10 = this.f17590g;
                if (j10 == -9223372036854775807L || j11 <= j10) {
                    j10 = j11;
                }
            }
        } else {
            j10 = -9223372036854775807L;
        }
        if (this.f17588e == j10) {
            return;
        }
        this.f17588e = j10;
        this.f17591h = j10;
        this.f17596m = -9223372036854775807L;
        this.f17597n = -9223372036854775807L;
        this.f17595l = -9223372036854775807L;
    }

    private static long g(long j10, long j11, float f10) {
        return (long) ((j10 * 0.999f) + (j11 * 9.999871E-4f));
    }

    public final void a(N1 n10) {
        long j10 = n10.f21003a;
        this.f17586c = AbstractC4634ob0.M(-9223372036854775807L);
        this.f17589f = AbstractC4634ob0.M(-9223372036854775807L);
        this.f17590g = AbstractC4634ob0.M(-9223372036854775807L);
        this.f17593j = 0.97f;
        this.f17592i = 1.03f;
        f();
    }

    public final void b(long j10) {
        this.f17587d = j10;
        f();
    }

    public final void c() {
        long j10 = this.f17591h;
        if (j10 == -9223372036854775807L) {
            return;
        }
        long j11 = j10 + this.f17585b;
        this.f17591h = j11;
        long j12 = this.f17590g;
        if (j12 != -9223372036854775807L && j11 > j12) {
            this.f17591h = j12;
        }
        this.f17595l = -9223372036854775807L;
    }

    public final float d(long j10, long j11) {
        long j12;
        if (this.f17586c == -9223372036854775807L) {
            return 1.0f;
        }
        long j13 = j10 - j11;
        long j14 = this.f17596m;
        if (j14 == -9223372036854775807L) {
            this.f17596m = j13;
            this.f17597n = 0L;
        } else {
            long jMax = Math.max(j13, g(j14, j13, 0.999f));
            this.f17596m = jMax;
            this.f17597n = g(this.f17597n, Math.abs(j13 - jMax), 0.999f);
        }
        if (this.f17595l != -9223372036854775807L && SystemClock.elapsedRealtime() - this.f17595l < 1000) {
            return this.f17594k;
        }
        this.f17595l = SystemClock.elapsedRealtime();
        long j15 = this.f17596m + (this.f17597n * 3);
        if (this.f17591h > j15) {
            float fM = AbstractC4634ob0.M(1000L);
            long[] jArr = {j15, this.f17588e, this.f17591h - (((long) ((this.f17594k - 1.0f) * fM)) + ((long) ((this.f17592i - 1.0f) * fM)))};
            j12 = jArr[0];
            for (int i10 = 1; i10 < 3; i10++) {
                long j16 = jArr[i10];
                if (j16 > j12) {
                    j12 = j16;
                }
            }
            this.f17591h = j12;
        } else {
            long jMax2 = j10 - ((long) (Math.max(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, this.f17594k - 1.0f) / 1.0E-7f));
            long j17 = this.f17591h;
            String str = AbstractC4634ob0.f32117a;
            long jMax3 = Math.max(j17, Math.min(jMax2, j15));
            this.f17591h = jMax3;
            long j18 = this.f17590g;
            if (j18 == -9223372036854775807L || jMax3 <= j18) {
                j12 = jMax3;
            } else {
                this.f17591h = j18;
                j12 = j18;
            }
        }
        long j19 = j10 - j12;
        if (Math.abs(j19) < this.f17584a) {
            this.f17594k = 1.0f;
            return 1.0f;
        }
        float fMax = Math.max(this.f17593j, Math.min((j19 * 1.0E-7f) + 1.0f, this.f17592i));
        this.f17594k = fMax;
        return fMax;
    }

    public final long e() {
        return this.f17591h;
    }
}
