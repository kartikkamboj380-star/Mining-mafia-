package M8;

import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class l implements CoroutineContext {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final /* synthetic */ CoroutineContext f3603a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Throwable f3604b;

    public l(Throwable th, CoroutineContext coroutineContext) {
        this.f3603a = coroutineContext;
        this.f3604b = th;
    }

    @Override // kotlin.coroutines.CoroutineContext
    public Object fold(Object obj, Function2 function2) {
        return this.f3603a.fold(obj, function2);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public CoroutineContext.Element get(CoroutineContext.b bVar) {
        return this.f3603a.get(bVar);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public CoroutineContext minusKey(CoroutineContext.b bVar) {
        return this.f3603a.minusKey(bVar);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public CoroutineContext plus(CoroutineContext coroutineContext) {
        return this.f3603a.plus(coroutineContext);
    }
}
