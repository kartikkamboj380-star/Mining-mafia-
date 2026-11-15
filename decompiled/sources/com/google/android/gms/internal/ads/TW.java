package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class TW {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long f23525a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f23526b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f23527c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f23528d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f23529e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Object f23530f = new Object();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Object f23531g = new Object();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Object f23532h = new Object();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Object f23533i = new Object();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final Object f23534j = new Object();

    public final synchronized void a(long j10) {
        synchronized (this.f23530f) {
            this.f23525a = j10;
        }
    }

    public final synchronized long b() {
        long j10;
        synchronized (this.f23530f) {
            j10 = this.f23525a;
        }
        return j10;
    }

    public final void c(int i10) {
        synchronized (this.f23531g) {
            this.f23526b = i10;
        }
    }

    public final int d() {
        int i10;
        synchronized (this.f23531g) {
            i10 = this.f23526b;
        }
        return i10;
    }

    public final void e(long j10) {
        synchronized (this.f23532h) {
            this.f23527c = j10;
        }
    }

    public final long f() {
        long j10;
        synchronized (this.f23532h) {
            j10 = this.f23527c;
        }
        return j10;
    }

    public final synchronized void g(long j10) {
        synchronized (this.f23533i) {
            this.f23528d = j10;
        }
    }

    public final synchronized long h() {
        long j10;
        synchronized (this.f23533i) {
            j10 = this.f23528d;
        }
        return j10;
    }

    public final synchronized void i(long j10) {
        synchronized (this.f23534j) {
            this.f23529e = j10;
        }
    }

    public final synchronized long j() {
        long j10;
        synchronized (this.f23534j) {
            j10 = this.f23529e;
        }
        return j10;
    }
}
