package com.google.android.gms.internal.ads;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;
import java.util.Random;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.xf0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5775xf0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f34978a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f34979b;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Clock f34983f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private long f34984g;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f34981d = 5;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f34982e = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Random f34985h = new Random();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f34980c = 0;

    public C5775xf0(long j10, double d10, long j11, double d11, Clock clock) {
        this.f34978a = j10;
        this.f34979b = j11;
        this.f34983f = clock;
        a();
    }

    public final void a() {
        this.f34984g = this.f34978a;
        this.f34980c = 0L;
        this.f34982e = 0L;
    }

    public final long b() {
        double d10 = this.f34984g;
        double d11 = 0.2d * d10;
        long j10 = (long) (d10 + d11);
        long j11 = (long) (d10 - d11);
        return j11 + ((long) (this.f34985h.nextDouble() * ((j10 - j11) + 1)));
    }

    public final void c() {
        this.f34982e = this.f34983f.currentTimeMillis() + b();
        double d10 = this.f34984g;
        this.f34984g = Math.min((long) (d10 + d10), this.f34979b);
        this.f34980c++;
    }

    public final boolean d() {
        return this.f34983f.currentTimeMillis() < this.f34982e;
    }

    public final boolean e() {
        AbstractC2759Zh abstractC2759Zh = AbstractC3892ii.f29589J;
        return ((Integer) H4.B.c().d(abstractC2759Zh)).intValue() >= 0 && this.f34980c > Math.max(this.f34981d, (long) ((Integer) H4.B.c().d(abstractC2759Zh)).intValue()) && this.f34984g >= this.f34979b;
    }

    public final synchronized void f(int i10) {
        Preconditions.checkArgument(i10 > 0);
        this.f34981d = i10;
    }
}
