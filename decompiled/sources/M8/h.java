package M8;

import L8.InterfaceC0804e;
import L8.InterfaceC0805f;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes3.dex */
public final class h extends g {
    public /* synthetic */ h(InterfaceC0804e interfaceC0804e, CoroutineContext coroutineContext, int i10, K8.a aVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(interfaceC0804e, (i11 & 2) != 0 ? kotlin.coroutines.e.f45956a : coroutineContext, (i11 & 4) != 0 ? -3 : i10, (i11 & 8) != 0 ? K8.a.SUSPEND : aVar);
    }

    @Override // M8.e
    protected e f(CoroutineContext coroutineContext, int i10, K8.a aVar) {
        return new h(this.f3560d, coroutineContext, i10, aVar);
    }

    @Override // M8.e
    public InterfaceC0804e i() {
        return this.f3560d;
    }

    @Override // M8.g
    protected Object q(InterfaceC0805f interfaceC0805f, p169q8.b bVar) {
        Object objCollect = this.f3560d.collect(interfaceC0805f, bVar);
        return objCollect == p179r8.b.e() ? objCollect : Unit.f45918a;
    }

    public h(InterfaceC0804e interfaceC0804e, CoroutineContext coroutineContext, int i10, K8.a aVar) {
        super(interfaceC0804e, coroutineContext, i10, aVar);
    }
}
