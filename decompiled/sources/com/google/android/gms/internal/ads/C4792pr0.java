package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.pr0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C4792pr0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC1781Gl0 f32484a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AtomicBoolean f32485b = new AtomicBoolean(false);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f32486c = -1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f32487d = -1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Throwable f32488e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f32489f;

    C4792pr0(int i10, C4148kk0 c4148kk0, InterfaceC1781Gl0 interfaceC1781Gl0) {
        this.f32489f = i10;
        this.f32484a = interfaceC1781Gl0;
    }

    public final void a() {
        if (this.f32485b.get()) {
            throw new IllegalStateException("Finished trace.");
        }
        this.f32486c = SystemClock.uptimeMillis();
    }

    public final void b(Throwable th) {
        if (this.f32485b.get()) {
            throw new IllegalStateException("Finished trace.");
        }
        this.f32488e = th;
    }

    public final void c() {
        AtomicBoolean atomicBoolean = this.f32485b;
        if (atomicBoolean.getAndSet(true)) {
            throw new IllegalStateException("Finished trace.");
        }
        this.f32487d = SystemClock.uptimeMillis();
        this.f32484a.b(this.f32489f - 1, atomicBoolean.get() ? this.f32487d - this.f32486c : -1L, this.f32488e, null);
    }
}
