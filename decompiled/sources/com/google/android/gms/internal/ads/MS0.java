package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class MS0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final MS0 f20836c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final MS0 f20837d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final MS0 f20838e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f20839a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f20840b;

    static {
        MS0 ms0 = new MS0(0L, 0L);
        f20836c = ms0;
        new MS0(Long.MAX_VALUE, Long.MAX_VALUE);
        f20837d = new MS0(Long.MAX_VALUE, 0L);
        new MS0(0L, Long.MAX_VALUE);
        f20838e = ms0;
    }

    public MS0(long j10, long j11) {
        AbstractC2418Ss0.a(j10 >= 0);
        AbstractC2418Ss0.a(j11 >= 0);
        this.f20839a = j10;
        this.f20840b = j11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && MS0.class == obj.getClass()) {
            MS0 ms0 = (MS0) obj;
            if (this.f20839a == ms0.f20839a && this.f20840b == ms0.f20840b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.f20839a) * 31) + ((int) this.f20840b);
    }
}
