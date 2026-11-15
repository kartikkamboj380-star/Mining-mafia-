package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Lq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C2050Lq implements Thread.UncaughtExceptionHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ Thread.UncaughtExceptionHandler f20674a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ C2205Oq f20675b;

    C2050Lq(C2205Oq c2205Oq, Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        this.f20674a = uncaughtExceptionHandler;
        Objects.requireNonNull(c2205Oq);
        this.f20675b = c2205Oq;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread thread, Throwable th) {
        try {
            try {
                this.f20675b.i(thread, th);
            } finally {
                Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.f20674a;
                if (uncaughtExceptionHandler != null) {
                    uncaughtExceptionHandler.uncaughtException(thread, th);
                }
            }
        } catch (Throwable unused) {
            L4.p.c("AdMob exception reporter failed reporting the exception.");
        }
        if (this.f20674a != null) {
        }
    }
}
