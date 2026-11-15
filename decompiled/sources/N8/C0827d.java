package N8;

import kotlin.coroutines.CoroutineContext;

/* JADX INFO: renamed from: N8.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0827d implements I8.O {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final CoroutineContext f3695a;

    public C0827d(CoroutineContext coroutineContext) {
        this.f3695a = coroutineContext;
    }

    @Override // I8.O
    public CoroutineContext getCoroutineContext() {
        return this.f3695a;
    }

    public String toString() {
        return "CoroutineScope(coroutineContext=" + getCoroutineContext() + ')';
    }
}
