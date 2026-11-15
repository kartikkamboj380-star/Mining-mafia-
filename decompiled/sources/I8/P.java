package I8;

import N8.C0827d;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public abstract class P {
    public static final O a(CoroutineContext coroutineContext) {
        if (coroutineContext.get(B0.f1699o) == null) {
            coroutineContext = coroutineContext.plus(F0.b(null, 1, null));
        }
        return new C0827d(coroutineContext);
    }

    public static final O b() {
        return new C0827d(W0.b(null, 1, null).plus(C0666e0.c()));
    }

    public static final void c(O o10, CancellationException cancellationException) {
        B0 b10 = (B0) o10.getCoroutineContext().get(B0.f1699o);
        if (b10 != null) {
            b10.c(cancellationException);
            return;
        }
        throw new IllegalStateException(("Scope cannot be cancelled because it does not have a job: " + o10).toString());
    }

    public static /* synthetic */ void d(O o10, CancellationException cancellationException, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            cancellationException = null;
        }
        c(o10, cancellationException);
    }

    public static final Object e(Function2 function2, p169q8.b bVar) {
        N8.z zVar = new N8.z(bVar.getContext(), bVar);
        Object objB = O8.b.b(zVar, zVar, function2);
        if (objB == p179r8.b.e()) {
            kotlin.coroutines.jvm.internal.h.c(bVar);
        }
        return objB;
    }

    public static final void f(O o10) {
        E0.g(o10.getCoroutineContext());
    }

    public static final boolean g(O o10) {
        B0 b10 = (B0) o10.getCoroutineContext().get(B0.f1699o);
        if (b10 != null) {
            return b10.isActive();
        }
        return true;
    }

    public static final O h(O o10, CoroutineContext coroutineContext) {
        return new C0827d(o10.getCoroutineContext().plus(coroutineContext));
    }
}
