package com.google.android.gms.internal.ads;

import java.util.concurrent.Delayed;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Mx0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C2116Mx0 extends AbstractC5055rx0 implements InterfaceScheduledFutureC1753Fx0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ScheduledFuture f20962b;

    C2116Mx0(com.google.common.util.concurrent.p pVar, ScheduledFuture scheduledFuture) {
        super(pVar);
        this.f20962b = scheduledFuture;
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z9) {
        boolean zCancel = i().cancel(z9);
        if (zCancel) {
            this.f20962b.cancel(z9);
        }
        return zCancel;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Delayed delayed) {
        return this.f20962b.compareTo(delayed);
    }

    @Override // java.util.concurrent.Delayed
    public final long getDelay(TimeUnit timeUnit) {
        return this.f20962b.getDelay(timeUnit);
    }
}
