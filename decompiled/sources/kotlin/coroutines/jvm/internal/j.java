package kotlin.coroutines.jvm.internal;

import kotlin.coroutines.CoroutineContext;

/* JADX INFO: loaded from: classes3.dex */
public abstract class j extends a {
    public j(p169q8.b bVar) {
        super(bVar);
        if (bVar != null && bVar.getContext() != kotlin.coroutines.e.f45956a) {
            throw new IllegalArgumentException("Coroutines with restricted suspension must have EmptyCoroutineContext");
        }
    }

    @Override // p169q8.b
    public CoroutineContext getContext() {
        return kotlin.coroutines.e.f45956a;
    }
}
