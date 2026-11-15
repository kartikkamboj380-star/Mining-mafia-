package com.google.common.util.concurrent;

import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;

/* JADX INFO: loaded from: classes2.dex */
class m implements p {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final p f39939b = new m(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final o f39940c = new o(m.class);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f39941a;

    m(Object obj) {
        this.f39941a = obj;
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z9) {
        return false;
    }

    @Override // com.google.common.util.concurrent.p
    public void e(Runnable runnable, Executor executor) {
        X5.j.i(runnable, "Runnable was null.");
        X5.j.i(executor, "Executor was null.");
        try {
            executor.execute(runnable);
        } catch (Exception e10) {
            f39940c.a().log(Level.SEVERE, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e10);
        }
    }

    @Override // java.util.concurrent.Future
    public Object get() {
        return this.f39941a;
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return false;
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        return true;
    }

    public String toString() {
        return super.toString() + "[status=SUCCESS, result=[" + this.f39941a + "]]";
    }

    @Override // java.util.concurrent.Future
    public Object get(long j10, TimeUnit timeUnit) {
        X5.j.h(timeUnit);
        return get();
    }
}
