package L8;

import I8.B0;
import kotlin.coroutines.CoroutineContext;

/* JADX INFO: loaded from: classes3.dex */
final class z implements K, InterfaceC0804e, M8.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final /* synthetic */ K f3415a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final B0 f3416b;

    public z(K k10, B0 b10) {
        this.f3415a = k10;
        this.f3416b = b10;
    }

    @Override // M8.p
    public InterfaceC0804e a(CoroutineContext coroutineContext, int i10, K8.a aVar) {
        return M.d(this, coroutineContext, i10, aVar);
    }

    @Override // L8.B, L8.InterfaceC0804e
    public Object collect(InterfaceC0805f interfaceC0805f, p169q8.b bVar) {
        return this.f3415a.collect(interfaceC0805f, bVar);
    }

    @Override // L8.K
    public Object getValue() {
        return this.f3415a.getValue();
    }
}
