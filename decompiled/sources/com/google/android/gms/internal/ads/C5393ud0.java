package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.ud0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5393ud0 implements com.google.common.util.concurrent.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f33857a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f33858b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.google.common.util.concurrent.p f33859c;

    public C5393ud0(Object obj, String str, com.google.common.util.concurrent.p pVar) {
        this.f33857a = obj;
        this.f33858b = str;
        this.f33859c = pVar;
    }

    public final Object a() {
        return this.f33857a;
    }

    public final String b() {
        return this.f33858b;
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z9) {
        return this.f33859c.cancel(z9);
    }

    @Override // com.google.common.util.concurrent.p
    public final void e(Runnable runnable, Executor executor) {
        this.f33859c.e(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        return this.f33859c.get();
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f33859c.isCancelled();
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.f33859c.isDone();
    }

    public final String toString() {
        int iIdentityHashCode = System.identityHashCode(this);
        String str = this.f33858b;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 1 + String.valueOf(iIdentityHashCode).length());
        sb.append(str);
        sb.append("@");
        sb.append(iIdentityHashCode);
        return sb.toString();
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j10, TimeUnit timeUnit) {
        return this.f33859c.get(j10, timeUnit);
    }
}
