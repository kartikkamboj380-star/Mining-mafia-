package L8;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
final class A extends AbstractC0800a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Function2 f3163a;

    public A(Function2 function2) {
        this.f3163a = function2;
    }

    @Override // L8.AbstractC0800a
    public Object b(InterfaceC0805f interfaceC0805f, p169q8.b bVar) {
        Object objInvoke = this.f3163a.invoke(interfaceC0805f, bVar);
        return objInvoke == p179r8.b.e() ? objInvoke : Unit.f45918a;
    }
}
