package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Sx0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class RunnableC2428Sx0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    C2532Ux0 f23345a;

    RunnableC2428Sx0(C2532Ux0 c2532Ux0) {
        this.f23345a = c2532Ux0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.google.common.util.concurrent.p pVarD;
        C2532Ux0 c2532Ux0 = this.f23345a;
        if (c2532Ux0 == null || (pVarD = c2532Ux0.D()) == null) {
            return;
        }
        this.f23345a = null;
        if (pVarD.isDone()) {
            c2532Ux0.u(pVarD);
            return;
        }
        try {
            ScheduledFuture scheduledFutureE = c2532Ux0.E();
            c2532Ux0.F(null);
            String string = "Timed out";
            if (scheduledFutureE != null) {
                try {
                    long jAbs = Math.abs(scheduledFutureE.getDelay(TimeUnit.MILLISECONDS));
                    if (jAbs > 10) {
                        StringBuilder sb = new StringBuilder(String.valueOf(jAbs).length() + 55);
                        sb.append("Timed out");
                        sb.append(" (timeout delayed by ");
                        sb.append(jAbs);
                        sb.append(" ms after scheduled time)");
                        string = sb.toString();
                    }
                } catch (Throwable th) {
                    c2532Ux0.l(new C2480Tx0(string, null));
                    throw th;
                }
            }
            String string2 = pVarD.toString();
            StringBuilder sb2 = new StringBuilder(string.length() + 2 + string2.length());
            sb2.append(string);
            sb2.append(": ");
            sb2.append(string2);
            c2532Ux0.l(new C2480Tx0(sb2.toString(), null));
            pVarD.cancel(true);
        } catch (Throwable th2) {
            pVarD.cancel(true);
            throw th2;
        }
    }
}
