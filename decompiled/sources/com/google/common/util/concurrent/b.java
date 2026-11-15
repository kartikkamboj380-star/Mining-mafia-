package com.google.common.util.concurrent;

import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.Callable;
import java.util.concurrent.RunnableFuture;

/* JADX INFO: loaded from: classes2.dex */
public abstract class b extends AbstractExecutorService implements r, AutoCloseable {
    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public p submit(Runnable runnable) {
        return (p) super.submit(runnable);
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public p submit(Runnable runnable, Object obj) {
        return (p) super.submit(runnable, obj);
    }

    @Override // java.lang.AutoCloseable
    public /* synthetic */ void close() {
        p131n0.d.a(this);
    }

    @Override // java.util.concurrent.AbstractExecutorService
    protected final RunnableFuture newTaskFor(Runnable runnable, Object obj) {
        return x.G(runnable, obj);
    }

    @Override // java.util.concurrent.AbstractExecutorService
    protected final RunnableFuture newTaskFor(Callable callable) {
        return x.H(callable);
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public p submit(Callable callable) {
        return (p) super.submit(callable);
    }
}
