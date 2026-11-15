package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.q1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C4813q1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f32538a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f32539b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f32540c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f32541d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f32542e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long f32543f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private long f32544g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f32545h;

    protected C4813q1(long j10, long j11, long j12, long j13, long j14, long j15, long j16) {
        this.f32538a = j10;
        this.f32539b = j11;
        this.f32542e = j13;
        this.f32543f = j14;
        this.f32544g = j15;
        this.f32540c = j16;
        this.f32545h = a(j11, 0L, j13, j14, j15, j16);
    }

    protected static long a(long j10, long j11, long j12, long j13, long j14, long j15) {
        if (j13 + 1 >= j14 || 1 + j11 >= j12) {
            return j13;
        }
        long j16 = (long) ((j10 - j11) * ((j14 - j13) / (j12 - j11)));
        String str = AbstractC4634ob0.f32117a;
        return Math.max(j13, Math.min(((j13 + j16) - j15) - (j16 / 20), j14 - 1));
    }

    private final void i() {
        this.f32545h = a(this.f32539b, this.f32541d, this.f32542e, this.f32543f, this.f32544g, this.f32540c);
    }

    final /* synthetic */ long b() {
        return this.f32543f;
    }

    final /* synthetic */ long c() {
        return this.f32544g;
    }

    final /* synthetic */ long d() {
        return this.f32539b;
    }

    final /* synthetic */ long e() {
        return this.f32538a;
    }

    final /* synthetic */ void f(long j10, long j11) {
        this.f32541d = j10;
        this.f32543f = j11;
        i();
    }

    final /* synthetic */ void g(long j10, long j11) {
        this.f32542e = j10;
        this.f32544g = j11;
        i();
    }

    final /* synthetic */ long h() {
        return this.f32545h;
    }
}
