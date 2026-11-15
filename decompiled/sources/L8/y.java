package L8;

import I8.B0;
import kotlin.coroutines.CoroutineContext;

/* JADX INFO: loaded from: classes3.dex */
final class y implements B, InterfaceC0804e, M8.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final /* synthetic */ B f3413a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final B0 f3414b;

    public y(B b10, B0 b11) {
        this.f3413a = b10;
        this.f3414b = b11;
    }

    @Override // M8.p
    public InterfaceC0804e a(CoroutineContext coroutineContext, int i10, K8.a aVar) {
        return D.e(this, coroutineContext, i10, aVar);
    }

    @Override // L8.B, L8.InterfaceC0804e
    public Object collect(InterfaceC0805f interfaceC0805f, p169q8.b bVar) {
        return this.f3413a.collect(interfaceC0805f, bVar);
    }
}
