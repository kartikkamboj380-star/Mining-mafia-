package I8;

import kotlin.coroutines.CoroutineContext;

/* JADX INFO: loaded from: classes3.dex */
class U0 extends AbstractC0657a {
    public U0(CoroutineContext coroutineContext, boolean z9) {
        super(coroutineContext, true, z9);
    }

    @Override // I8.H0
    protected boolean g0(Throwable th) {
        M.a(getContext(), th);
        return true;
    }
}
