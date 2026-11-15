package M8;

import kotlin.coroutines.CoroutineContext;

/* JADX INFO: loaded from: classes3.dex */
final class m extends N8.z {
    public m(CoroutineContext coroutineContext, p169q8.b bVar) {
        super(coroutineContext, bVar);
    }

    @Override // I8.H0
    public boolean J(Throwable th) {
        if (th instanceof j) {
            return true;
        }
        return D(th);
    }
}
