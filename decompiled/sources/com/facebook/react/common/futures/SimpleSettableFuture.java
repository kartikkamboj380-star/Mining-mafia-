package com.facebook.react.common.futures;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class SimpleSettableFuture implements Future {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final CountDownLatch f14528a = new CountDownLatch(1);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Object f14529b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Exception f14530c;

    private final void a() {
        if (this.f14528a.getCount() == 0) {
            throw new RuntimeException("Result has already been set!");
        }
    }

    public final Object b() {
        try {
            return get();
        } catch (InterruptedException e10) {
            throw new RuntimeException(e10);
        } catch (ExecutionException e11) {
            throw new RuntimeException(e11);
        }
    }

    public final void c(Object obj) {
        a();
        this.f14529b = obj;
        this.f14528a.countDown();
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z9) {
        throw new UnsupportedOperationException();
    }

    public final void d(Exception exception) {
        Intrinsics.checkNotNullParameter(exception, "exception");
        a();
        this.f14530c = exception;
        this.f14528a.countDown();
    }

    @Override // java.util.concurrent.Future
    public Object get() throws ExecutionException, InterruptedException {
        this.f14528a.await();
        if (this.f14530c == null) {
            return this.f14529b;
        }
        throw new ExecutionException(this.f14530c);
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return false;
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        return this.f14528a.getCount() == 0;
    }

    @Override // java.util.concurrent.Future
    public Object get(long j10, TimeUnit unit) throws ExecutionException, TimeoutException {
        Intrinsics.checkNotNullParameter(unit, "unit");
        if (this.f14528a.await(j10, unit)) {
            if (this.f14530c == null) {
                return this.f14529b;
            }
            throw new ExecutionException(this.f14530c);
        }
        throw new TimeoutException("Timed out waiting for result");
    }
}
