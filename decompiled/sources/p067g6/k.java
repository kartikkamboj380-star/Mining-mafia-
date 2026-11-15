package p067g6;

import com.google.android.gms.common.internal.Preconditions;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes2.dex */
final class k implements Executor {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final Logger f44404f = Logger.getLogger(k.class.getName());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Executor f44405a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Deque f44406b = new ArrayDeque();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private c f44407c = c.IDLE;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f44408d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final b f44409e = new b(this, null);

    class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Runnable f44410a;

        a(Runnable runnable) {
            this.f44410a = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f44410a.run();
        }

        public String toString() {
            return this.f44410a.toString();
        }
    }

    private final class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Runnable f44412a;

        private b() {
        }

        /* JADX WARN: Code duplicated, block: B:46:0x003d A[SYNTHETIC] */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x0045, code lost:
        
            if (r1 == false) goto L50;
         */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x004e, code lost:
        
            r1 = r1 | java.lang.Thread.interrupted();
         */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x0050, code lost:
        
            r8.f44412a.run();
         */
        /* JADX WARN: Code restructure failed: missing block: B:29:0x005a, code lost:
        
            r0 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:31:0x005c, code lost:
        
            r3 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:32:0x005d, code lost:
        
            p067g6.k.f44404f.log(java.util.logging.Level.SEVERE, "Exception while executing runnable " + r8.f44412a, (java.lang.Throwable) r3);
         */
        /* JADX WARN: Code restructure failed: missing block: B:34:0x007a, code lost:
        
            r8.f44412a = null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:35:0x007c, code lost:
        
            throw r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:50:?, code lost:
        
            return;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private void a() {
            /*
                r8 = this;
                r0 = 0
                r1 = r0
            L2:
                g6.k r2 = p067g6.k.this     // Catch: java.lang.Throwable -> L58
                java.util.Deque r2 = p067g6.k.a(r2)     // Catch: java.lang.Throwable -> L58
                monitor-enter(r2)     // Catch: java.lang.Throwable -> L58
                if (r0 != 0) goto L2d
                g6.k r0 = p067g6.k.this     // Catch: java.lang.Throwable -> L20
                g6.k$c r0 = p067g6.k.b(r0)     // Catch: java.lang.Throwable -> L20
                g6.k$c r3 = g6.k.c.RUNNING     // Catch: java.lang.Throwable -> L20
                if (r0 != r3) goto L22
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L20
                if (r1 == 0) goto L48
            L18:
                java.lang.Thread r0 = java.lang.Thread.currentThread()
                r0.interrupt()
                goto L48
            L20:
                r0 = move-exception
                goto L7d
            L22:
                g6.k r0 = p067g6.k.this     // Catch: java.lang.Throwable -> L20
                p067g6.k.d(r0)     // Catch: java.lang.Throwable -> L20
                g6.k r0 = p067g6.k.this     // Catch: java.lang.Throwable -> L20
                p067g6.k.c(r0, r3)     // Catch: java.lang.Throwable -> L20
                r0 = 1
            L2d:
                g6.k r3 = p067g6.k.this     // Catch: java.lang.Throwable -> L20
                java.util.Deque r3 = p067g6.k.a(r3)     // Catch: java.lang.Throwable -> L20
                java.lang.Object r3 = r3.poll()     // Catch: java.lang.Throwable -> L20
                java.lang.Runnable r3 = (java.lang.Runnable) r3     // Catch: java.lang.Throwable -> L20
                r8.f44412a = r3     // Catch: java.lang.Throwable -> L20
                if (r3 != 0) goto L49
                g6.k r0 = p067g6.k.this     // Catch: java.lang.Throwable -> L20
                g6.k$c r3 = g6.k.c.IDLE     // Catch: java.lang.Throwable -> L20
                p067g6.k.c(r0, r3)     // Catch: java.lang.Throwable -> L20
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L20
                if (r1 == 0) goto L48
                goto L18
            L48:
                return
            L49:
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L20
                boolean r2 = java.lang.Thread.interrupted()     // Catch: java.lang.Throwable -> L58
                r1 = r1 | r2
                r2 = 0
                java.lang.Runnable r3 = r8.f44412a     // Catch: java.lang.Throwable -> L5a java.lang.RuntimeException -> L5c
                r3.run()     // Catch: java.lang.Throwable -> L5a java.lang.RuntimeException -> L5c
            L55:
                r8.f44412a = r2     // Catch: java.lang.Throwable -> L58
                goto L2
            L58:
                r0 = move-exception
                goto L7f
            L5a:
                r0 = move-exception
                goto L7a
            L5c:
                r3 = move-exception
                java.util.logging.Logger r4 = p067g6.k.e()     // Catch: java.lang.Throwable -> L5a
                java.util.logging.Level r5 = java.util.logging.Level.SEVERE     // Catch: java.lang.Throwable -> L5a
                java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L5a
                r6.<init>()     // Catch: java.lang.Throwable -> L5a
                java.lang.String r7 = "Exception while executing runnable "
                r6.append(r7)     // Catch: java.lang.Throwable -> L5a
                java.lang.Runnable r7 = r8.f44412a     // Catch: java.lang.Throwable -> L5a
                r6.append(r7)     // Catch: java.lang.Throwable -> L5a
                java.lang.String r6 = r6.toString()     // Catch: java.lang.Throwable -> L5a
                r4.log(r5, r6, r3)     // Catch: java.lang.Throwable -> L5a
                goto L55
            L7a:
                r8.f44412a = r2     // Catch: java.lang.Throwable -> L58
                throw r0     // Catch: java.lang.Throwable -> L58
            L7d:
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L20
                throw r0     // Catch: java.lang.Throwable -> L58
            L7f:
                if (r1 == 0) goto L88
                java.lang.Thread r1 = java.lang.Thread.currentThread()
                r1.interrupt()
            L88:
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: g6.k.b.a():void");
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                a();
            } catch (Error e10) {
                synchronized (k.this.f44406b) {
                    k.this.f44407c = c.IDLE;
                    throw e10;
                }
            }
        }

        public String toString() {
            Runnable runnable = this.f44412a;
            if (runnable != null) {
                return "SequentialExecutorWorker{running=" + runnable + "}";
            }
            return "SequentialExecutorWorker{state=" + k.this.f44407c + "}";
        }

        /* synthetic */ b(k kVar, a aVar) {
            this();
        }
    }

    enum c {
        IDLE,
        QUEUING,
        QUEUED,
        RUNNING
    }

    k(Executor executor) {
        this.f44405a = (Executor) Preconditions.checkNotNull(executor);
    }

    static /* synthetic */ long d(k kVar) {
        long j10 = kVar.f44408d;
        kVar.f44408d = 1 + j10;
        return j10;
    }

    /* JADX WARN: Code duplicated, block: B:43:0x0061  */
    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        c cVar;
        boolean z9;
        Preconditions.checkNotNull(runnable);
        synchronized (this.f44406b) {
            c cVar2 = this.f44407c;
            if (cVar2 != c.RUNNING && cVar2 != (cVar = c.QUEUED)) {
                long j10 = this.f44408d;
                a aVar = new a(runnable);
                this.f44406b.add(aVar);
                c cVar3 = c.QUEUING;
                this.f44407c = cVar3;
                try {
                    this.f44405a.execute(this.f44409e);
                    if (this.f44407c != cVar3) {
                        return;
                    }
                    synchronized (this.f44406b) {
                        try {
                            if (this.f44408d == j10 && this.f44407c == cVar3) {
                                this.f44407c = cVar;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    return;
                } catch (Error | RuntimeException e10) {
                    synchronized (this.f44406b) {
                        try {
                            c cVar4 = this.f44407c;
                            if (cVar4 != c.IDLE && cVar4 != c.QUEUING) {
                                z9 = false;
                            } else if (this.f44406b.removeLastOccurrence(aVar)) {
                                z9 = true;
                            } else {
                                z9 = false;
                            }
                            if (!(e10 instanceof RejectedExecutionException) || z9) {
                                throw e10;
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                    return;
                }
            }
            this.f44406b.add(runnable);
        }
    }

    public String toString() {
        return "SequentialExecutor@" + System.identityHashCode(this) + "{" + this.f44405a + "}";
    }
}
