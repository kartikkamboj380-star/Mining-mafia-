package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.qe, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C4891qe {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f32695a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f32696b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f32697c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f32698d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f32699e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f32700f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public C1480Ar f32701g = C1480Ar.f17414e;

    static {
        String str = AbstractC4634ob0.f32117a;
        Integer.toString(0, 36);
        Integer.toString(1, 36);
        Integer.toString(2, 36);
        Integer.toString(3, 36);
        Integer.toString(4, 36);
    }

    public final C4891qe a(Object obj, Object obj2, int i10, long j10, long j11, C1480Ar c1480Ar, boolean z9) {
        this.f32695a = obj;
        this.f32696b = obj2;
        this.f32697c = i10;
        this.f32698d = j10;
        this.f32699e = 0L;
        this.f32701g = c1480Ar;
        this.f32700f = z9;
        return this;
    }

    public final int b() {
        int i10 = this.f32701g.f17416a;
        return 0;
    }

    public final long c(int i10) {
        long j10 = this.f32701g.a(i10).f26367a;
        return 0L;
    }

    public final int d(int i10) {
        return this.f32701g.a(i10).a(-1);
    }

    public final int e(long j10) {
        this.f32701g.b(-1);
        return -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C4891qe.class.equals(obj.getClass())) {
            C4891qe c4891qe = (C4891qe) obj;
            if (Objects.equals(this.f32695a, c4891qe.f32695a) && Objects.equals(this.f32696b, c4891qe.f32696b) && this.f32697c == c4891qe.f32697c && this.f32698d == c4891qe.f32698d && this.f32700f == c4891qe.f32700f && Objects.equals(this.f32701g, c4891qe.f32701g)) {
                return true;
            }
        }
        return false;
    }

    public final int f(long j10) {
        return -1;
    }

    public final int g(int i10) {
        return this.f32701g.a(i10).f26368b;
    }

    public final long h(int i10, int i11) {
        C2797a c2797aA = this.f32701g.a(i10);
        if (c2797aA.f26368b != -1) {
            return c2797aA.f26372f[i11];
        }
        return -9223372036854775807L;
    }

    public final int hashCode() {
        Object obj = this.f32695a;
        int iHashCode = obj == null ? 0 : obj.hashCode();
        Object obj2 = this.f32696b;
        int iHashCode2 = ((((iHashCode + 217) * 31) + (obj2 != null ? obj2.hashCode() : 0)) * 31) + this.f32697c;
        long j10 = this.f32698d;
        return (((((iHashCode2 * 31) + ((int) (j10 ^ (j10 >>> 32)))) * 961) + (this.f32700f ? 1 : 0)) * 31) + this.f32701g.hashCode();
    }

    public final boolean i(int i10) {
        b();
        if (i10 != -1) {
            return false;
        }
        this.f32701g.b(-1);
        return false;
    }

    public final long j() {
        long j10 = this.f32701g.f17417b;
        return 0L;
    }

    public final boolean k(int i10) {
        boolean z9 = this.f32701g.a(i10).f26376j;
        return false;
    }
}
