package M8;

import kotlin.coroutines.CoroutineContext;

/* JADX INFO: loaded from: classes3.dex */
final class z implements p169q8.b, kotlin.coroutines.jvm.internal.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p169q8.b f3620a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final CoroutineContext f3621b;

    public z(p169q8.b bVar, CoroutineContext coroutineContext) {
        this.f3620a = bVar;
        this.f3621b = coroutineContext;
    }

    @Override // kotlin.coroutines.jvm.internal.e
    public kotlin.coroutines.jvm.internal.e getCallerFrame() {
        p169q8.b bVar = this.f3620a;
        if (bVar instanceof kotlin.coroutines.jvm.internal.e) {
            return (kotlin.coroutines.jvm.internal.e) bVar;
        }
        return null;
    }

    @Override // p169q8.b
    public CoroutineContext getContext() {
        return this.f3621b;
    }

    @Override // p169q8.b
    public void resumeWith(Object obj) {
        this.f3620a.resumeWith(obj);
    }
}
