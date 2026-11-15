package N8;

import java.util.Iterator;
import kotlin.coroutines.CoroutineContext;

/* JADX INFO: renamed from: N8.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC0829f {
    public static final void a(CoroutineContext coroutineContext, Throwable th) {
        Iterator it = AbstractC0828e.a().iterator();
        while (it.hasNext()) {
            try {
                ((I8.L) it.next()).handleException(coroutineContext, th);
            } catch (Throwable th2) {
                AbstractC0828e.b(I8.M.b(th, th2));
            }
        }
        try {
            p129m8.a.a(th, new C0830g(coroutineContext));
        } catch (Throwable unused) {
        }
        AbstractC0828e.b(th);
    }
}
