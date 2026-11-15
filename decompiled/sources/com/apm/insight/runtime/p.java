package com.apm.insight.runtime;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

/* JADX INFO: loaded from: classes.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final HandlerThread f13237a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private volatile Handler f13240d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Queue<c> f13238b = new ConcurrentLinkedQueue();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Queue<Message> f13239c = new ConcurrentLinkedQueue();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Object f13241e = new Object();

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            while (!p.this.f13239c.isEmpty()) {
                if (p.this.f13240d != null) {
                    try {
                        p.this.f13240d.sendMessageAtFrontOfQueue((Message) p.this.f13239c.poll());
                    } catch (Throwable unused) {
                    }
                }
            }
            while (!p.this.f13238b.isEmpty()) {
                c cVar = (c) p.this.f13238b.poll();
                if (p.this.f13240d != null) {
                    try {
                        p.this.f13240d.sendMessageAtTime(cVar.f13246a, cVar.f13247b);
                    } catch (Throwable unused2) {
                    }
                }
            }
        }
    }

    class b extends HandlerThread {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private volatile int f13243a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private volatile boolean f13244b;

        b(String str) {
            super(str);
            this.f13243a = 0;
            this.f13244b = false;
        }

        /* JADX INFO: Infinite loop detected, blocks: 19, insns: 0 */
        @Override // android.os.HandlerThread
        protected final void onLooperPrepared() {
            super.onLooperPrepared();
            synchronized (p.this.f13241e) {
                try {
                    p.this.f13240d = new Handler();
                } catch (Throwable th) {
                    throw th;
                }
            }
            p.this.f13240d.post(p.this.new a());
            while (true) {
                try {
                    Looper.loop();
                } catch (Throwable th2) {
                    try {
                        com.apm.insight.b.f.a(com.apm.insight.e.g()).a().c();
                        if (this.f13243a < 5) {
                            com.apm.insight.c.a();
                            j.a(th2, "NPTH_CATCH");
                        } else if (!this.f13244b) {
                            this.f13244b = true;
                            com.apm.insight.c.a();
                            j.a(new RuntimeException(), "NPTH_ERR_MAX");
                        }
                        this.f13243a++;
                    } catch (Throwable unused) {
                    }
                }
            }
        }
    }

    static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Message f13246a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        long f13247b;

        c(Message message, long j10) {
            this.f13246a = message;
            this.f13247b = j10;
        }
    }

    static {
        new Object() { // from class: com.apm.insight.runtime.p.1
        };
        new Object() { // from class: com.apm.insight.runtime.p.2
        };
    }

    public p(String str) {
        this.f13237a = new b(str);
    }

    public final void b() {
        this.f13237a.start();
    }

    public final HandlerThread c() {
        return this.f13237a;
    }

    private Message b(Runnable runnable) {
        return Message.obtain(this.f13240d, runnable);
    }

    public final Handler a() {
        return this.f13240d;
    }

    private boolean b(Message message, long j10) {
        if (this.f13240d == null) {
            synchronized (this.f13241e) {
                try {
                    if (this.f13240d == null) {
                        this.f13238b.add(new c(message, j10));
                        return true;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        try {
            return this.f13240d.sendMessageAtTime(message, j10);
        } catch (Throwable unused) {
            return true;
        }
    }

    public final boolean a(Runnable runnable) {
        return a(b(runnable), 0L);
    }

    public final boolean a(Runnable runnable, long j10) {
        return a(b(runnable), j10);
    }

    private boolean a(Message message, long j10) {
        if (j10 < 0) {
            j10 = 0;
        }
        return b(message, SystemClock.uptimeMillis() + j10);
    }
}
