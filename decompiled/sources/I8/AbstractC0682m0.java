package I8;

import java.util.concurrent.locks.LockSupport;

/* JADX INFO: renamed from: I8.m0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC0682m0 extends AbstractC0678k0 {
    protected abstract Thread C1();

    protected void D1(long j10, AbstractC0680l0.c cVar) {
        U.f1746h.R1(j10, cVar);
    }

    protected final void E1() {
        Thread threadC1 = C1();
        if (Thread.currentThread() != threadC1) {
            AbstractC0661c.a();
            LockSupport.unpark(threadC1);
        }
    }
}
