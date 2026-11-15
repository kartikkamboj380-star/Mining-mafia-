package com.reactnativecommunity.asyncstorage;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes3.dex */
public class k implements Executor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ArrayDeque f42082a = new ArrayDeque();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Runnable f42083b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Executor f42084c;

    class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Runnable f42085a;

        a(Runnable runnable) {
            this.f42085a = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f42085a.run();
            } finally {
                k.this.a();
            }
        }
    }

    public k(Executor executor) {
        this.f42084c = executor;
    }

    synchronized void a() {
        Runnable runnable = (Runnable) this.f42082a.poll();
        this.f42083b = runnable;
        if (runnable != null) {
            this.f42084c.execute(runnable);
        }
    }

    @Override // java.util.concurrent.Executor
    public synchronized void execute(Runnable runnable) {
        this.f42082a.offer(new a(runnable));
        if (this.f42083b == null) {
            a();
        }
    }
}
