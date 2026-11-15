package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Ux0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C2532Ux0 extends AbstractC4552nx0 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private com.google.common.util.concurrent.p f24139h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private ScheduledFuture f24140i;

    private C2532Ux0(com.google.common.util.concurrent.p pVar) {
        pVar.getClass();
        this.f24139h = pVar;
    }

    static com.google.common.util.concurrent.p C(com.google.common.util.concurrent.p pVar, long j10, TimeUnit timeUnit, ScheduledExecutorService scheduledExecutorService) {
        C2532Ux0 c2532Ux0 = new C2532Ux0(pVar);
        RunnableC2428Sx0 runnableC2428Sx0 = new RunnableC2428Sx0(c2532Ux0);
        c2532Ux0.f24140i = scheduledExecutorService.schedule(runnableC2428Sx0, j10, timeUnit);
        pVar.e(runnableC2428Sx0, EnumC4300lx0.INSTANCE);
        return c2532Ux0;
    }

    final /* synthetic */ com.google.common.util.concurrent.p D() {
        return this.f24139h;
    }

    final /* synthetic */ ScheduledFuture E() {
        return this.f24140i;
    }

    final /* synthetic */ void F(ScheduledFuture scheduledFuture) {
        this.f24140i = null;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1907Iw0
    protected final void m() {
        v(this.f24139h);
        ScheduledFuture scheduledFuture = this.f24140i;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
        this.f24139h = null;
        this.f24140i = null;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1907Iw0
    protected final String n() {
        com.google.common.util.concurrent.p pVar = this.f24139h;
        ScheduledFuture scheduledFuture = this.f24140i;
        if (pVar == null) {
            return null;
        }
        String string = pVar.toString();
        StringBuilder sb = new StringBuilder(string.length() + 14);
        sb.append("inputFuture=[");
        sb.append(string);
        sb.append("]");
        String string2 = sb.toString();
        if (scheduledFuture == null) {
            return string2;
        }
        long delay = scheduledFuture.getDelay(TimeUnit.MILLISECONDS);
        if (delay <= 0) {
            return string2;
        }
        StringBuilder sb2 = new StringBuilder(string2.length() + 19 + String.valueOf(delay).length() + 4);
        sb2.append(string2);
        sb2.append(", remaining delay=[");
        sb2.append(delay);
        sb2.append(" ms]");
        return sb2.toString();
    }
}
