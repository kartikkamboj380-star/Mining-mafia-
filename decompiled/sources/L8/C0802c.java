package L8;

import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: L8.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
class C0802c extends M8.e {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Function2 f3243d;

    public /* synthetic */ C0802c(Function2 function2, CoroutineContext coroutineContext, int i10, K8.a aVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(function2, (i11 & 2) != 0 ? kotlin.coroutines.e.f45956a : coroutineContext, (i11 & 4) != 0 ? -2 : i10, (i11 & 8) != 0 ? K8.a.SUSPEND : aVar);
    }

    static /* synthetic */ Object n(C0802c c0802c, K8.v vVar, p169q8.b bVar) {
        Object objInvoke = c0802c.f3243d.invoke(vVar, bVar);
        return objInvoke == p179r8.b.e() ? objInvoke : Unit.f45918a;
    }

    @Override // M8.e
    protected Object e(K8.v vVar, p169q8.b bVar) {
        return n(this, vVar, bVar);
    }

    @Override // M8.e
    protected M8.e f(CoroutineContext coroutineContext, int i10, K8.a aVar) {
        return new C0802c(this.f3243d, coroutineContext, i10, aVar);
    }

    @Override // M8.e
    public String toString() {
        return "block[" + this.f3243d + "] -> " + super.toString();
    }

    public C0802c(Function2 function2, CoroutineContext coroutineContext, int i10, K8.a aVar) {
        super(coroutineContext, i10, aVar);
        this.f3243d = function2;
    }
}
