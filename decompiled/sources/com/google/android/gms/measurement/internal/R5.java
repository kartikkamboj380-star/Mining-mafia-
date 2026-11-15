package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;

/* JADX INFO: loaded from: classes2.dex */
final class R5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Clock f37708a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f37709b;

    public R5(Clock clock) {
        Preconditions.checkNotNull(clock);
        this.f37708a = clock;
    }

    public final void a() {
        this.f37709b = this.f37708a.elapsedRealtime();
    }

    public final void b() {
        this.f37709b = 0L;
    }

    public final boolean c(long j10) {
        return this.f37709b == 0 || this.f37708a.elapsedRealtime() - this.f37709b >= 3600000;
    }
}
