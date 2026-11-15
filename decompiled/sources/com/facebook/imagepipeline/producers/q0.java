package com.facebook.imagepipeline.producers;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class q0 implements p0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Executor f14245a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f14246b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Deque f14247c;

    public q0(Executor executor) {
        Intrinsics.checkNotNullParameter(executor, "executor");
        this.f14245a = executor;
        this.f14247c = new ArrayDeque();
    }

    @Override // com.facebook.imagepipeline.producers.p0
    public synchronized void a(Runnable runnable) {
        Intrinsics.checkNotNullParameter(runnable, "runnable");
        this.f14247c.remove(runnable);
    }

    @Override // com.facebook.imagepipeline.producers.p0
    public synchronized void b(Runnable runnable) {
        try {
            Intrinsics.checkNotNullParameter(runnable, "runnable");
            if (this.f14246b) {
                this.f14247c.add(runnable);
            } else {
                this.f14245a.execute(runnable);
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
