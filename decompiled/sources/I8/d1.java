package I8;

import kotlin.coroutines.CoroutineContext;

/* JADX INFO: loaded from: classes3.dex */
public final class d1 extends K {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final d1 f1767b = new d1();

    private d1() {
    }

    @Override // I8.K
    public void l1(CoroutineContext coroutineContext, Runnable runnable) {
        h1 h1Var = (h1) coroutineContext.get(h1.f1786b);
        if (h1Var == null) {
            throw new UnsupportedOperationException("Dispatchers.Unconfined.dispatch function can only be used by the yield function. If you wrap Unconfined dispatcher in your code, make sure you properly delegate isDispatchNeeded and dispatch calls.");
        }
        h1Var.f1787a = true;
    }

    @Override // I8.K
    public boolean n1(CoroutineContext coroutineContext) {
        return false;
    }

    @Override // I8.K
    public K o1(int i10, String str) {
        throw new UnsupportedOperationException("limitedParallelism is not supported for Dispatchers.Unconfined");
    }

    @Override // I8.K
    public String toString() {
        return "Dispatchers.Unconfined";
    }
}
