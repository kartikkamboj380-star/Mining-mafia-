package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Ax0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C1493Ax0 implements com.google.common.util.concurrent.p {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final com.google.common.util.concurrent.p f17437b = new C1493Ax0(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final C1701Ex0 f17438c = new C1701Ex0(C1493Ax0.class);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f17439a;

    C1493Ax0(Object obj) {
        this.f17439a = obj;
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z9) {
        return false;
    }

    @Override // com.google.common.util.concurrent.p
    public final void e(Runnable runnable, Executor executor) {
        AbstractC2418Ss0.k(runnable, "Runnable was null.");
        AbstractC2418Ss0.k(executor, "Executor was null.");
        try {
            executor.execute(runnable);
        } catch (Exception e10) {
            Logger loggerA = f17438c.a();
            Level level = Level.SEVERE;
            String strValueOf = String.valueOf(runnable);
            String strValueOf2 = String.valueOf(executor);
            StringBuilder sb = new StringBuilder(strValueOf.length() + 57 + strValueOf2.length());
            sb.append("RuntimeException while executing runnable ");
            sb.append(strValueOf);
            sb.append(" with executor ");
            sb.append(strValueOf2);
            loggerA.logp(level, "com.google.common.util.concurrent.ImmediateFuture", "addListener", sb.toString(), (Throwable) e10);
        }
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        return this.f17439a;
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return false;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return true;
    }

    public final String toString() {
        Object obj = this.f17439a;
        String string = super.toString();
        String strValueOf = String.valueOf(obj);
        StringBuilder sb = new StringBuilder(String.valueOf(string).length() + 25 + strValueOf.length() + 2);
        sb.append(string);
        sb.append("[status=SUCCESS, result=[");
        sb.append(strValueOf);
        sb.append("]]");
        return sb.toString();
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j10, TimeUnit timeUnit) {
        timeUnit.getClass();
        return this.f17439a;
    }
}
