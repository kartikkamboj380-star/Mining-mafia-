package com.google.android.gms.internal.ads;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.ux0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class RunnableC5433ux0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final Future f33953a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final InterfaceC5307tx0 f33954b;

    RunnableC5433ux0(Future future, InterfaceC5307tx0 interfaceC5307tx0) {
        this.f33953a = future;
        this.f33954b = interfaceC5307tx0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        Throwable thA;
        Future future = this.f33953a;
        if ((future instanceof AbstractC2920ay0) && (thA = AbstractC3045by0.a((AbstractC2920ay0) future)) != null) {
            this.f33954b.a(thA);
            return;
        }
        try {
            this.f33954b.zzb(AbstractC5685wx0.s(future));
        } catch (ExecutionException e10) {
            this.f33954b.a(e10.getCause());
        } catch (Throwable th) {
            this.f33954b.a(th);
        }
    }

    public final String toString() {
        C2158Ns0 c2158Ns0B = AbstractC2210Os0.b(this);
        c2158Ns0B.a(this.f33954b);
        return c2158Ns0B.toString();
    }
}
