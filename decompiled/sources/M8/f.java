package M8;

import L8.InterfaceC0805f;
import N8.K;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.I;

/* JADX INFO: loaded from: classes3.dex */
public abstract class f {
    public static final Object b(CoroutineContext coroutineContext, Object obj, Object obj2, Function2 function2, p169q8.b bVar) {
        Object objI = K.i(coroutineContext, obj2);
        try {
            z zVar = new z(bVar, coroutineContext);
            Object objD = !(function2 instanceof kotlin.coroutines.jvm.internal.a) ? p179r8.b.d(function2, obj, zVar) : ((Function2) I.c(function2, 2)).invoke(obj, zVar);
            K.f(coroutineContext, objI);
            if (objD == p179r8.b.e()) {
                kotlin.coroutines.jvm.internal.h.c(bVar);
            }
            return objD;
        } catch (Throwable th) {
            K.f(coroutineContext, objI);
            throw th;
        }
    }

    public static /* synthetic */ Object c(CoroutineContext coroutineContext, Object obj, Object obj2, Function2 function2, p169q8.b bVar, int i10, Object obj3) {
        if ((i10 & 4) != 0) {
            obj2 = K.g(coroutineContext);
        }
        return b(coroutineContext, obj, obj2, function2, bVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC0805f d(InterfaceC0805f interfaceC0805f, CoroutineContext coroutineContext) {
        return ((interfaceC0805f instanceof y) || (interfaceC0805f instanceof r)) ? interfaceC0805f : new B(interfaceC0805f, coroutineContext);
    }
}
