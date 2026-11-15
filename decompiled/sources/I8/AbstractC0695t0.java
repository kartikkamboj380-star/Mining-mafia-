package I8;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* JADX INFO: renamed from: I8.t0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC0695t0 {
    public static final Executor a(K k10) {
        Executor executorQ1;
        AbstractC0691r0 abstractC0691r0 = k10 instanceof AbstractC0691r0 ? (AbstractC0691r0) k10 : null;
        return (abstractC0691r0 == null || (executorQ1 = abstractC0691r0.q1()) == null) ? new ExecutorC0664d0(k10) : executorQ1;
    }

    public static final K b(Executor executor) {
        K k10;
        ExecutorC0664d0 executorC0664d0 = executor instanceof ExecutorC0664d0 ? (ExecutorC0664d0) executor : null;
        return (executorC0664d0 == null || (k10 = executorC0664d0.f1766a) == null) ? new C0693s0(executor) : k10;
    }

    public static final AbstractC0691r0 c(ExecutorService executorService) {
        return new C0693s0(executorService);
    }
}
