package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.px0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C4804px0 extends AbstractC4678ox0 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final com.google.common.util.concurrent.p f32522h;

    C4804px0(com.google.common.util.concurrent.p pVar) {
        pVar.getClass();
        this.f32522h = pVar;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1907Iw0, java.util.concurrent.Future
    public final boolean cancel(boolean z9) {
        return this.f32522h.cancel(z9);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1907Iw0, com.google.common.util.concurrent.p
    public final void e(Runnable runnable, Executor executor) {
        this.f32522h.e(runnable, executor);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1907Iw0, java.util.concurrent.Future
    public final Object get() {
        return this.f32522h.get();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1907Iw0, java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f32522h.isCancelled();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1907Iw0, java.util.concurrent.Future
    public final boolean isDone() {
        return this.f32522h.isDone();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1907Iw0
    public final String toString() {
        return this.f32522h.toString();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1907Iw0, java.util.concurrent.Future
    public final Object get(long j10, TimeUnit timeUnit) {
        return this.f32522h.get(j10, timeUnit);
    }
}
