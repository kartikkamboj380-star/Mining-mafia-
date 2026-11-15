package I8;

import N8.AbstractC0829f;
import kotlin.coroutines.CoroutineContext;

/* JADX INFO: loaded from: classes3.dex */
public abstract class M {
    public static final void a(CoroutineContext coroutineContext, Throwable th) {
        try {
            L l10 = (L) coroutineContext.get(L.f1729n);
            if (l10 != null) {
                l10.handleException(coroutineContext, th);
            } else {
                AbstractC0829f.a(coroutineContext, th);
            }
        } catch (Throwable th2) {
            AbstractC0829f.a(coroutineContext, b(th, th2));
        }
    }

    public static final Throwable b(Throwable th, Throwable th2) {
        if (th == th2) {
            return th;
        }
        RuntimeException runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
        p129m8.a.a(runtimeException, th);
        return runtimeException;
    }
}
