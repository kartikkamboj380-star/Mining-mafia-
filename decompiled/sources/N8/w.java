package N8;

import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public abstract class w {
    public static final void a(Function1 function1, Object obj, CoroutineContext coroutineContext) {
        P pB = b(function1, obj, null);
        if (pB != null) {
            I8.M.a(coroutineContext, pB);
        }
    }

    public static final P b(Function1 function1, Object obj, P p10) {
        try {
            function1.invoke(obj);
            return p10;
        } catch (Throwable th) {
            if (p10 != null && p10.getCause() != th) {
                p129m8.a.a(p10, th);
                return p10;
            }
            return new P("Exception in undelivered element handler for " + obj, th);
        }
    }

    public static /* synthetic */ P c(Function1 function1, Object obj, P p10, int i10, Object obj2) {
        if ((i10 & 2) != 0) {
            p10 = null;
        }
        return b(function1, obj, p10);
    }
}
