package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.ll0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C4276ll0 implements InterfaceC4024jl0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Executor f31347a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Queue f31348b = new PriorityQueue();

    public C4276ll0(Executor executor, C4148kk0 c4148kk0) {
        this.f31347a = executor;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4024jl0
    public final void a(Runnable runnable, long j10) {
        if (j10 <= 0) {
            this.f31347a.execute(runnable);
            return;
        }
        C4528nl0 c4528nl0 = new C4528nl0(runnable, System.currentTimeMillis() + j10);
        Queue queue = this.f31348b;
        synchronized (queue) {
            queue.add(c4528nl0);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4024jl0
    public final void zzb() {
        Queue queue = this.f31348b;
        synchronized (queue) {
            try {
                if (queue.isEmpty()) {
                    return;
                }
                PriorityQueue priorityQueue = new PriorityQueue();
                long jCurrentTimeMillis = System.currentTimeMillis();
                for (C4528nl0 c4528nl0 = (C4528nl0) queue.peek(); c4528nl0 != null && c4528nl0.f31882b <= jCurrentTimeMillis; c4528nl0 = (C4528nl0) queue.peek()) {
                    priorityQueue.add(c4528nl0);
                }
                Iterator it = priorityQueue.iterator();
                while (it.hasNext()) {
                    try {
                        this.f31347a.execute(((C4528nl0) it.next()).f31881a);
                    } catch (RuntimeException unused) {
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
