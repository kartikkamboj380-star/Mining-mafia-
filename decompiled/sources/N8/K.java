package N8;

import I8.X0;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public abstract class K {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final D f3682a = new D("NO_THREAD_ELEMENTS");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Function2 f3683b = new Function2() { // from class: N8.H
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return K.d(obj, (CoroutineContext.Element) obj2);
        }
    };

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Function2 f3684c = new Function2() { // from class: N8.I
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return K.e((X0) obj, (CoroutineContext.Element) obj2);
        }
    };

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Function2 f3685d = new Function2() { // from class: N8.J
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return K.h((O) obj, (CoroutineContext.Element) obj2);
        }
    };

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object d(Object obj, CoroutineContext.Element element) {
        if (!(element instanceof X0)) {
            return obj;
        }
        Integer num = obj instanceof Integer ? (Integer) obj : null;
        int iIntValue = num != null ? num.intValue() : 1;
        return iIntValue == 0 ? element : Integer.valueOf(iIntValue + 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final X0 e(X0 x10, CoroutineContext.Element element) {
        if (x10 != null) {
            return x10;
        }
        if (element instanceof X0) {
            return (X0) element;
        }
        return null;
    }

    public static final void f(CoroutineContext coroutineContext, Object obj) {
        if (obj == f3682a) {
            return;
        }
        if (obj instanceof O) {
            ((O) obj).b(coroutineContext);
            return;
        }
        Object objFold = coroutineContext.fold(null, f3684c);
        Intrinsics.d(objFold, "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
        ((X0) objFold).V(coroutineContext, obj);
    }

    public static final Object g(CoroutineContext coroutineContext) {
        Object objFold = coroutineContext.fold(0, f3683b);
        Intrinsics.c(objFold);
        return objFold;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final O h(O o10, CoroutineContext.Element element) {
        if (element instanceof X0) {
            X0 x10 = (X0) element;
            o10.a(x10, x10.g1(o10.f3688a));
        }
        return o10;
    }

    public static final Object i(CoroutineContext coroutineContext, Object obj) {
        if (obj == null) {
            obj = g(coroutineContext);
        }
        if (obj == 0) {
            return f3682a;
        }
        if (obj instanceof Integer) {
            return coroutineContext.fold(new O(coroutineContext, ((Number) obj).intValue()), f3685d);
        }
        Intrinsics.d(obj, "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
        return ((X0) obj).g1(coroutineContext);
    }
}
