package M8;

import L8.InterfaceC0805f;
import kotlin.Unit;

/* JADX INFO: loaded from: classes3.dex */
public final class y implements InterfaceC0805f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final K8.y f3619a;

    public y(K8.y yVar) {
        this.f3619a = yVar;
    }

    @Override // L8.InterfaceC0805f
    public Object emit(Object obj, p169q8.b bVar) {
        Object objK = this.f3619a.k(obj, bVar);
        return objK == p179r8.b.e() ? objK : Unit.f45918a;
    }
}
