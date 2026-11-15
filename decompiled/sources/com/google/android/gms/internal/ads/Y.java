package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
final class Y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long f25427a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f25428b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f25429c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f25430d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f25431e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long f25432f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final boolean[] f25433g = new boolean[15];

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f25434h;

    public final void a() {
        this.f25430d = 0L;
        this.f25431e = 0L;
        this.f25432f = 0L;
        this.f25434h = 0;
        Arrays.fill(this.f25433g, false);
    }

    public final boolean b() {
        return this.f25430d > 15 && this.f25434h == 0;
    }

    public final boolean c() {
        long j10 = this.f25430d;
        if (j10 == 0) {
            return false;
        }
        return this.f25433g[(int) ((j10 - 1) % 15)];
    }

    public final long d() {
        return this.f25432f;
    }

    public final long e() {
        long j10 = this.f25431e;
        if (j10 == 0) {
            return 0L;
        }
        return this.f25432f / j10;
    }

    public final void f(long j10) {
        long j11 = this.f25430d;
        if (j11 == 0) {
            this.f25427a = j10;
        } else if (j11 == 1) {
            long j12 = j10 - this.f25427a;
            this.f25428b = j12;
            this.f25432f = j12;
            this.f25431e = 1L;
        } else {
            long j13 = j10 - this.f25429c;
            int i10 = (int) (j11 % 15);
            if (Math.abs(j13 - this.f25428b) <= 1000000) {
                this.f25431e++;
                this.f25432f += j13;
                boolean[] zArr = this.f25433g;
                if (zArr[i10]) {
                    zArr[i10] = false;
                    this.f25434h--;
                }
            } else {
                boolean[] zArr2 = this.f25433g;
                if (!zArr2[i10]) {
                    zArr2[i10] = true;
                    this.f25434h++;
                }
            }
        }
        this.f25430d++;
        this.f25429c = j10;
    }
}
