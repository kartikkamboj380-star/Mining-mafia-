package I8;

import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class U extends AbstractC0680l0 implements Runnable {

    @Nullable
    private static volatile Thread _thread;
    private static volatile int debugStatus;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final U f1746h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final long f1747i;

    static {
        Long l10;
        U u10 = new U();
        f1746h = u10;
        AbstractC0678k0.w1(u10, false, 1, null);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        try {
            l10 = Long.getLong("kotlinx.coroutines.DefaultExecutor.keepAlive", 1000L);
        } catch (SecurityException unused) {
            l10 = 1000L;
        }
        f1747i = timeUnit.toNanos(l10.longValue());
    }

    private U() {
    }

    private final synchronized void W1() {
        if (Z1()) {
            debugStatus = 3;
            Q1();
            Intrinsics.d(this, "null cannot be cast to non-null type java.lang.Object");
            notifyAll();
        }
    }

    private final synchronized Thread X1() {
        Thread thread;
        thread = _thread;
        if (thread == null) {
            thread = new Thread(this, "kotlinx.coroutines.DefaultExecutor");
            _thread = thread;
            thread.setContextClassLoader(f1746h.getClass().getClassLoader());
            thread.setDaemon(true);
            thread.start();
        }
        return thread;
    }

    private final boolean Y1() {
        return debugStatus == 4;
    }

    private final boolean Z1() {
        int i10 = debugStatus;
        return i10 == 2 || i10 == 3;
    }

    private final synchronized boolean a2() {
        if (Z1()) {
            return false;
        }
        debugStatus = 1;
        Intrinsics.d(this, "null cannot be cast to non-null type java.lang.Object");
        notifyAll();
        return true;
    }

    private final void b2() {
        throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
    }

    @Override // I8.AbstractC0682m0
    protected Thread C1() {
        Thread thread = _thread;
        return thread == null ? X1() : thread;
    }

    @Override // I8.AbstractC0682m0
    protected void D1(long j10, AbstractC0680l0.c cVar) {
        b2();
    }

    @Override // I8.AbstractC0680l0
    public void I1(Runnable runnable) {
        if (Y1()) {
            b2();
        }
        super.I1(runnable);
    }

    @Override // I8.AbstractC0680l0, I8.Y
    public InterfaceC0670g0 R(long j10, Runnable runnable, CoroutineContext coroutineContext) {
        return T1(j10, runnable);
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean zO1;
        Y0.f1750a.d(this);
        AbstractC0661c.a();
        try {
            if (!a2()) {
                if (zO1) {
                    return;
                } else {
                    return;
                }
            }
            long j10 = Long.MAX_VALUE;
            while (true) {
                Thread.interrupted();
                long jZ1 = z1();
                if (jZ1 == Long.MAX_VALUE) {
                    AbstractC0661c.a();
                    long jNanoTime = System.nanoTime();
                    if (j10 == Long.MAX_VALUE) {
                        j10 = f1747i + jNanoTime;
                    }
                    long j11 = j10 - jNanoTime;
                    if (j11 <= 0) {
                        if (zO1) {
                            return;
                        } else {
                            return;
                        }
                    }
                    jZ1 = kotlin.ranges.b.h(jZ1, j11);
                } else {
                    j10 = Long.MAX_VALUE;
                }
                if (jZ1 > 0) {
                    if (Z1()) {
                        if (zO1) {
                            return;
                        } else {
                            return;
                        }
                    } else {
                        AbstractC0661c.a();
                        LockSupport.parkNanos(this, jZ1);
                    }
                }
            }
        } finally {
            _thread = null;
            W1();
            AbstractC0661c.a();
            if (!O1()) {
                C1();
            }
        }
    }

    @Override // I8.AbstractC0680l0, I8.AbstractC0678k0
    public void shutdown() {
        debugStatus = 4;
        super.shutdown();
    }

    @Override // I8.K
    public String toString() {
        return "DefaultExecutor";
    }
}
