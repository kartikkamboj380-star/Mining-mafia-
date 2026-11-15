package com.google.android.gms.internal.ads;

import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.RunnableFuture;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Rw0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC2374Rw0 extends AbstractExecutorService implements InterfaceExecutorServiceC1805Gx0, AutoCloseable {
    @Override // java.lang.AutoCloseable
    public /* synthetic */ void close() {
        p131n0.d.a(this);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceExecutorServiceC1805Gx0
    public final com.google.common.util.concurrent.p e0(Callable callable) {
        return (com.google.common.util.concurrent.p) super.submit(callable);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceExecutorServiceC1805Gx0
    public final com.google.common.util.concurrent.p j0(Runnable runnable) {
        return (com.google.common.util.concurrent.p) super.submit(runnable);
    }

    @Override // java.util.concurrent.AbstractExecutorService
    protected final RunnableFuture newTaskFor(Runnable runnable, Object obj) {
        return RunnableFutureC2688Xx0.C(runnable, obj);
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public final /* synthetic */ Future submit(Runnable runnable) {
        return (com.google.common.util.concurrent.p) super.submit(runnable);
    }

    @Override // java.util.concurrent.AbstractExecutorService
    protected final RunnableFuture newTaskFor(Callable callable) {
        return new RunnableFutureC2688Xx0(callable);
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public final /* synthetic */ Future submit(Runnable runnable, Object obj) {
        return (com.google.common.util.concurrent.p) super.submit(runnable, obj);
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public final /* synthetic */ Future submit(Callable callable) {
        return (com.google.common.util.concurrent.p) super.submit(callable);
    }
}
