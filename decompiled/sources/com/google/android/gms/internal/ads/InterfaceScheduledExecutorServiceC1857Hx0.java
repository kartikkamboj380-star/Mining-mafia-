package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Hx0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public interface InterfaceScheduledExecutorServiceC1857Hx0 extends ScheduledExecutorService, InterfaceExecutorServiceC1805Gx0, AutoCloseable {
    InterfaceScheduledFutureC1753Fx0 H0(Callable callable, long j10, TimeUnit timeUnit);
}
