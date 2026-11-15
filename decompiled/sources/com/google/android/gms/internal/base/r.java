package com.google.android.gms.internal.base;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
final class r implements p {
    /* synthetic */ r(q qVar) {
    }

    @Override // com.google.android.gms.internal.base.p
    public final ExecutorService a(int i10, ThreadFactory threadFactory, int i11) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(i10, i10, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), threadFactory);
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        return Executors.unconfigurableExecutorService(threadPoolExecutor);
    }

    @Override // com.google.android.gms.internal.base.p
    public final ExecutorService b(int i10, int i11) {
        return a(4, Executors.defaultThreadFactory(), 2);
    }

    @Override // com.google.android.gms.internal.base.p
    public final ExecutorService c(ThreadFactory threadFactory, int i10) {
        return a(1, threadFactory, 1);
    }
}
