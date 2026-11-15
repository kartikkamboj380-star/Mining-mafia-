package com.google.android.gms.internal.ads;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.ol0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C4654ol0 implements InterfaceC4024jl0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ScheduledExecutorService f32191a = Executors.newSingleThreadScheduledExecutor();

    C4654ol0() {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4024jl0
    public final void a(Runnable runnable, long j10) {
        this.f32191a.schedule(runnable, j10, TimeUnit.MILLISECONDS);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4024jl0
    public final void zzb() {
    }
}
