package com.google.common.util.concurrent;

import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public abstract class g extends Y5.g implements Future {
    protected g() {
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z9) {
        return d().cancel(z9);
    }

    protected abstract Future d();

    @Override // java.util.concurrent.Future
    public Object get() {
        return d().get();
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return d().isCancelled();
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        return d().isDone();
    }

    @Override // java.util.concurrent.Future
    public Object get(long j10, TimeUnit timeUnit) {
        return d().get(j10, timeUnit);
    }
}
