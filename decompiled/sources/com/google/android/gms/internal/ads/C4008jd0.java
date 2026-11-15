package com.google.android.gms.internal.ads;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.jd0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C4008jd0 implements InterfaceC3732hQ0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC4864qQ0 f30513a;

    private C4008jd0(InterfaceC4864qQ0 interfaceC4864qQ0) {
        this.f30513a = interfaceC4864qQ0;
    }

    public static C4008jd0 a(InterfaceC4864qQ0 interfaceC4864qQ0) {
        return new C4008jd0(interfaceC4864qQ0);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5493vQ0
    public final /* bridge */ /* synthetic */ Object zzb() {
        ThreadFactory threadFactory = (ThreadFactory) this.f30513a.zzb();
        AbstractC3518fj0.a();
        ScheduledExecutorService scheduledExecutorServiceUnconfigurableScheduledExecutorService = Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1, threadFactory));
        AbstractC4738pQ0.b(scheduledExecutorServiceUnconfigurableScheduledExecutorService);
        return scheduledExecutorServiceUnconfigurableScheduledExecutorService;
    }
}
