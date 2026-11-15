package L8;

import kotlin.coroutines.CoroutineContext;

/* JADX INFO: loaded from: classes3.dex */
public abstract class M {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final N8.D f3218a = new N8.D("NONE");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final N8.D f3219b = new N8.D("PENDING");

    public static final x a(Object obj) {
        if (obj == null) {
            obj = M8.s.f3608a;
        }
        return new L(obj);
    }

    public static final InterfaceC0804e d(K k10, CoroutineContext coroutineContext, int i10, K8.a aVar) {
        return (((i10 < 0 || i10 >= 2) && i10 != -2) || aVar != K8.a.DROP_OLDEST) ? D.e(k10, coroutineContext, i10, aVar) : k10;
    }
}
