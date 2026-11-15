package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.i40, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C3814i40 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.google.common.util.concurrent.p f29252a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f29253b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Clock f29254c;

    public C3814i40(com.google.common.util.concurrent.p pVar, long j10, Clock clock) {
        this.f29252a = pVar;
        this.f29254c = clock;
        this.f29253b = clock.elapsedRealtime() + j10;
    }

    public final boolean a() {
        return this.f29253b < this.f29254c.elapsedRealtime();
    }
}
