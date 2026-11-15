package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Lf0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2029Lf0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f20578a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f20579b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Clock f20580c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f20581d = ((Long) H4.B.c().d(AbstractC3892ii.f29719W)).longValue() * 1000;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final double f20582e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f20583f;

    public C2029Lf0(Object obj, Clock clock, double d10, int i10) {
        this.f20578a = obj;
        this.f20580c = clock;
        this.f20579b = clock.currentTimeMillis();
        this.f20582e = d10;
        this.f20583f = i10;
    }

    public final Object a() {
        return this.f20578a;
    }

    public final boolean b() {
        return this.f20580c.currentTimeMillis() >= this.f20579b + this.f20581d;
    }

    public final long c() {
        return (this.f20581d + Math.min(Math.max(((Long) H4.B.c().d(AbstractC3892ii.f29549F)).longValue(), -900000L), 10000L)) - (this.f20580c.currentTimeMillis() - this.f20579b);
    }

    public final long d() {
        return this.f20579b;
    }

    public final double e() {
        return this.f20582e;
    }

    public final int f() {
        return this.f20583f;
    }
}
