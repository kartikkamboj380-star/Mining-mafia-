package com.google.android.gms.internal.ads;

import java.util.Locale;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class M3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f20730a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f20731b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f20732c;

    public M3(long j10, long j11, int i10) {
        AbstractC2418Ss0.a(j10 < j11);
        this.f20730a = j10;
        this.f20731b = j11;
        this.f20732c = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && M3.class == obj.getClass()) {
            M3 m10 = (M3) obj;
            if (this.f20730a == m10.f20730a && this.f20731b == m10.f20731b && this.f20732c == m10.f20732c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.f20730a), Long.valueOf(this.f20731b), Integer.valueOf(this.f20732c));
    }

    public final String toString() {
        Object[] objArr = {Long.valueOf(this.f20730a), Long.valueOf(this.f20731b), Integer.valueOf(this.f20732c)};
        String str = AbstractC4634ob0.f32117a;
        return String.format(Locale.US, "Segment: startTimeMs=%d, endTimeMs=%d, speedDivisor=%d", objArr);
    }
}
