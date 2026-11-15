package com.google.android.gms.internal.ads;

import android.util.Range;
import com.unity3d.services.UnityAdsConstants;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.z0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C5943z0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long f35597a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f35598b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private double f35599c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Range f35600d;

    public C5943z0(float f10) {
        Range range = new Range(Double.valueOf(0.0d), Double.valueOf(1.0d));
        this.f35600d = range;
        this.f35599c = ((Double) range.getUpper()).doubleValue();
        this.f35597a = -9223372036854775807L;
        this.f35598b = -9223372036854775807L;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0031  */
    public final void a(long j10, long j11) {
        double dDoubleValue;
        AbstractC2418Ss0.a(j10 != -9223372036854775807L);
        AbstractC2418Ss0.a(j11 != -9223372036854775807L);
        long j12 = this.f35597a;
        if (j12 != -9223372036854775807L) {
            long j13 = this.f35598b;
            if (j13 == -9223372036854775807L || j10 == j12) {
                dDoubleValue = ((Double) this.f35600d.getUpper()).doubleValue();
            } else {
                dDoubleValue = (j11 - j13) / (j10 - j12);
            }
        } else {
            dDoubleValue = ((Double) this.f35600d.getUpper()).doubleValue();
        }
        this.f35599c = (this.f35599c * 0.800000011920929d) + (((Double) this.f35600d.clamp(Double.valueOf(dDoubleValue))).doubleValue() * 0.20000000298023224d);
        this.f35597a = j10;
        this.f35598b = j11;
    }

    public final long b(long j10) {
        long j11 = this.f35597a;
        if (j11 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return (long) (this.f35598b + ((j10 - j11) * this.f35599c));
    }

    public final void c(float f10) {
        AbstractC2418Ss0.a(f10 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        this.f35600d = new Range(Double.valueOf(0.0d), Double.valueOf(1.0d / ((double) f10)));
        d();
    }

    public final void d() {
        this.f35599c = ((Double) this.f35600d.getUpper()).doubleValue();
        this.f35597a = -9223372036854775807L;
        this.f35598b = -9223372036854775807L;
    }
}
