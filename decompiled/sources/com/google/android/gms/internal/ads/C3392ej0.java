package com.google.android.gms.internal.ads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.ej0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C3392ej0 implements InterfaceC3267dj0 {
    /* synthetic */ C3392ej0(byte[] bArr) {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3267dj0
    public final ExecutorService a(ThreadFactory threadFactory, int i10) {
        return c(1, threadFactory, 1);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3267dj0
    public final ExecutorService b(int i10) {
        return c(1, Executors.defaultThreadFactory(), 2);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3267dj0
    public final ExecutorService c(int i10, ThreadFactory threadFactory, int i11) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(i10, i10, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), threadFactory);
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        return Executors.unconfigurableExecutorService(threadPoolExecutor);
    }
}
