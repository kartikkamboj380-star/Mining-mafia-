package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.qd0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C4890qd0 implements InterfaceC2233Pe {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ScheduledExecutorService f32691a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Executor f32692b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Map f32693c = new HashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f32694d = false;

    C4890qd0(ScheduledExecutorService scheduledExecutorService, Executor executor) {
        this.f32691a = scheduledExecutorService;
        this.f32692b = executor;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public final synchronized void b() {
        Map map = this.f32693c;
        ArrayList arrayList = new ArrayList(map.keySet());
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            ScheduledFuture scheduledFuture = (ScheduledFuture) arrayList.get(i10);
            C4764pd0 c4764pd0 = (C4764pd0) map.get(scheduledFuture);
            if (c4764pd0 != null && scheduledFuture != null && !scheduledFuture.isDone()) {
                scheduledFuture.cancel(false);
                map.remove(scheduledFuture);
                a(c4764pd0.f32438a, Math.max(0L, c4764pd0.f32439b - G4.t.o().currentTimeMillis()), TimeUnit.MILLISECONDS);
            }
        }
    }

    public final synchronized void a(Runnable runnable, long j10, TimeUnit timeUnit) {
        try {
            if (!this.f32694d) {
                G4.t.k().b(this);
                this.f32694d = true;
            }
            final C4764pd0 c4764pd0 = new C4764pd0(this, runnable, G4.t.o().currentTimeMillis() + timeUnit.toMillis(j10));
            ScheduledFuture<?> scheduledFutureSchedule = this.f32691a.schedule(new Runnable() { // from class: com.google.android.gms.internal.ads.nd0
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    C4764pd0 c4764pd1;
                    C4764pd0 c4764pd2 = c4764pd0;
                    C4890qd0 c4890qd0 = c4764pd2.f32441d;
                    synchronized (c4890qd0) {
                        try {
                            ScheduledFuture scheduledFuture = c4764pd2.f32440c;
                            c4764pd1 = scheduledFuture != null ? (C4764pd0) c4890qd0.d().remove(scheduledFuture) : null;
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    if (c4764pd1 != null) {
                        c4764pd2.f32441d.c().execute(c4764pd2.f32438a);
                    }
                }
            }, j10, timeUnit);
            c4764pd0.f32440c = scheduledFutureSchedule;
            this.f32693c.put(scheduledFutureSchedule, c4764pd0);
        } catch (Throwable th) {
            throw th;
        }
    }

    final /* synthetic */ Executor c() {
        return this.f32692b;
    }

    final /* synthetic */ Map d() {
        return this.f32693c;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2233Pe
    public final void h0(boolean z9) {
        if (z9) {
            this.f32692b.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.od0
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.f32151a.b();
                }
            });
        }
    }
}
