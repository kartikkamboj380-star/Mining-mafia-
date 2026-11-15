package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public final class LB implements InterfaceC2233Pe {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ScheduledExecutorService f20407a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Clock f20408b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ScheduledFuture f20409c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f20410d = -1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f20411e = -1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Runnable f20412f = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f20413g = false;

    public LB(ScheduledExecutorService scheduledExecutorService, Clock clock) {
        this.f20407a = scheduledExecutorService;
        this.f20408b = clock;
        G4.t.k().b(this);
    }

    public final synchronized void a(int i10, Runnable runnable) {
        this.f20412f = runnable;
        long j10 = i10;
        this.f20410d = this.f20408b.elapsedRealtime() + j10;
        this.f20409c = this.f20407a.schedule(runnable, j10, TimeUnit.MILLISECONDS);
    }

    final synchronized void b() {
        try {
            if (this.f20413g) {
                return;
            }
            ScheduledFuture scheduledFuture = this.f20409c;
            if (scheduledFuture == null || scheduledFuture.isDone()) {
                this.f20411e = -1L;
            } else {
                this.f20409c.cancel(true);
                this.f20411e = this.f20410d - this.f20408b.elapsedRealtime();
            }
            this.f20413g = true;
        } catch (Throwable th) {
            throw th;
        }
    }

    final synchronized void c() {
        ScheduledFuture scheduledFuture;
        try {
            if (this.f20413g) {
                if (this.f20411e > 0 && (scheduledFuture = this.f20409c) != null && scheduledFuture.isCancelled()) {
                    this.f20409c = this.f20407a.schedule(this.f20412f, this.f20411e, TimeUnit.MILLISECONDS);
                }
                this.f20413g = false;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2233Pe
    public final void h0(boolean z9) {
        if (z9) {
            c();
        } else {
            b();
        }
    }
}
