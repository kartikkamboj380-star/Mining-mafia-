package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.LockSupport;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Dx0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
abstract class AbstractRunnableC1649Dx0 extends AtomicReference implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Runnable f18317a = new RunnableC1597Cx0(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Runnable f18318b = new RunnableC1597Cx0(null);

    AbstractRunnableC1649Dx0() {
    }

    private final void b(Thread thread) {
        Runnable runnable = (Runnable) get();
        RunnableC1545Bx0 runnableC1545Bx0 = null;
        boolean z9 = false;
        int i10 = 0;
        while (true) {
            if (!(runnable instanceof RunnableC1545Bx0)) {
                if (runnable != f18318b) {
                    break;
                }
            } else {
                runnableC1545Bx0 = (RunnableC1545Bx0) runnable;
            }
            i10++;
            if (i10 > 1000) {
                Runnable runnable2 = f18318b;
                if (runnable == runnable2 || compareAndSet(runnable, runnable2)) {
                    z9 = Thread.interrupted() || z9;
                    LockSupport.park(runnableC1545Bx0);
                }
            } else {
                Thread.yield();
            }
            runnable = (Runnable) get();
        }
        if (z9) {
            thread.interrupt();
        }
    }

    abstract Object a();

    abstract String c();

    abstract boolean d();

    abstract void e(Object obj);

    abstract void f(Throwable th);

    final void g() {
        Runnable runnable = (Runnable) get();
        if (runnable instanceof Thread) {
            RunnableC1545Bx0 runnableC1545Bx0 = new RunnableC1545Bx0(this, null);
            runnableC1545Bx0.a(Thread.currentThread());
            if (compareAndSet(runnable, runnableC1545Bx0)) {
                try {
                    ((Thread) runnable).interrupt();
                    if (((Runnable) getAndSet(f18317a)) == f18318b) {
                    }
                } finally {
                    if (((Runnable) getAndSet(f18317a)) == f18318b) {
                        LockSupport.unpark((Thread) runnable);
                    }
                }
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        Thread threadCurrentThread = Thread.currentThread();
        Object objA = null;
        if (compareAndSet(null, threadCurrentThread)) {
            boolean zD = d();
            if (!zD) {
                try {
                    objA = a();
                } catch (Throwable th) {
                    try {
                        AbstractC2324Qx0.a(th);
                        if (!compareAndSet(threadCurrentThread, f18317a)) {
                            b(threadCurrentThread);
                        }
                        f(th);
                        return;
                    } catch (Throwable th2) {
                        if (!compareAndSet(threadCurrentThread, f18317a)) {
                            b(threadCurrentThread);
                        }
                        e(null);
                        throw th2;
                    }
                }
            }
            if (!compareAndSet(threadCurrentThread, f18317a)) {
                b(threadCurrentThread);
            }
            if (zD) {
                return;
            }
            e(objA);
        }
    }

    @Override // java.util.concurrent.atomic.AtomicReference
    public final String toString() {
        String string;
        Runnable runnable = (Runnable) get();
        if (runnable == f18317a) {
            string = "running=[DONE]";
        } else if (runnable instanceof RunnableC1545Bx0) {
            string = "running=[INTERRUPTED]";
        } else if (runnable instanceof Thread) {
            String name = ((Thread) runnable).getName();
            StringBuilder sb = new StringBuilder(String.valueOf(name).length() + 21);
            sb.append("running=[RUNNING ON ");
            sb.append(name);
            sb.append("]");
            string = sb.toString();
        } else {
            string = "running=[NOT STARTED YET]";
        }
        String strC = c();
        StringBuilder sb2 = new StringBuilder(string.length() + 2 + String.valueOf(strC).length());
        sb2.append(string);
        sb2.append(", ");
        sb2.append(strC);
        return sb2.toString();
    }
}
