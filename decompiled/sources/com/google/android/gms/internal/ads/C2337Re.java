package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.Objects;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Re, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2337Re {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final Object f22865o = new Object();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final C4819q4 f22866p;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f22868b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f22870d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f22871e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f22872f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f22873g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f22874h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public N1 f22875i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f22876j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f22877k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f22878l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f22879m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f22880n;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f22867a = f22865o;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public C4819q4 f22869c = f22866p;

    static {
        M01 m01 = new M01();
        m01.a("androidx.media3.common.Timeline");
        m01.b(Uri.EMPTY);
        f22866p = m01.c();
        String str = AbstractC4634ob0.f32117a;
        Integer.toString(1, 36);
        Integer.toString(2, 36);
        Integer.toString(3, 36);
        Integer.toString(4, 36);
        Integer.toString(5, 36);
        Integer.toString(6, 36);
        Integer.toString(7, 36);
        Integer.toString(8, 36);
        Integer.toString(9, 36);
        Integer.toString(10, 36);
        Integer.toString(11, 36);
        Integer.toString(12, 36);
        Integer.toString(13, 36);
    }

    public final C2337Re a(Object obj, C4819q4 c4819q4, Object obj2, long j10, long j11, long j12, boolean z9, boolean z10, N1 n10, long j13, long j14, int i10, int i11, long j15) {
        this.f22867a = obj;
        if (c4819q4 == null) {
            c4819q4 = f22866p;
        }
        this.f22869c = c4819q4;
        this.f22868b = null;
        this.f22870d = -9223372036854775807L;
        this.f22871e = -9223372036854775807L;
        this.f22872f = -9223372036854775807L;
        this.f22873g = z9;
        this.f22874h = z10;
        this.f22875i = n10;
        this.f22877k = 0L;
        this.f22878l = j14;
        this.f22879m = 0;
        this.f22880n = 0;
        this.f22876j = false;
        return this;
    }

    public final boolean b() {
        return this.f22875i != null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C2337Re.class.equals(obj.getClass())) {
            C2337Re c2337Re = (C2337Re) obj;
            if (Objects.equals(this.f22867a, c2337Re.f22867a) && Objects.equals(this.f22869c, c2337Re.f22869c) && Objects.equals(this.f22875i, c2337Re.f22875i) && this.f22870d == c2337Re.f22870d && this.f22871e == c2337Re.f22871e && this.f22872f == c2337Re.f22872f && this.f22873g == c2337Re.f22873g && this.f22874h == c2337Re.f22874h && this.f22876j == c2337Re.f22876j && this.f22878l == c2337Re.f22878l && this.f22879m == c2337Re.f22879m && this.f22880n == c2337Re.f22880n) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = ((this.f22867a.hashCode() + 217) * 31) + this.f22869c.hashCode();
        N1 n10 = this.f22875i;
        int iHashCode2 = ((iHashCode * 961) + (n10 == null ? 0 : n10.hashCode())) * 31;
        long j10 = this.f22870d;
        int i10 = (iHashCode2 + ((int) (j10 ^ (j10 >>> 32)))) * 31;
        long j11 = this.f22871e;
        int i11 = (i10 + ((int) (j11 ^ (j11 >>> 32)))) * 31;
        long j12 = this.f22872f;
        int i12 = ((((((i11 + ((int) (j12 ^ (j12 >>> 32)))) * 31) + (this.f22873g ? 1 : 0)) * 31) + (this.f22874h ? 1 : 0)) * 31) + (this.f22876j ? 1 : 0);
        long j13 = this.f22878l;
        return ((((((i12 * 961) + ((int) (j13 ^ (j13 >>> 32)))) * 31) + this.f22879m) * 31) + this.f22880n) * 31;
    }
}
