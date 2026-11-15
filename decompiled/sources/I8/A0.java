package I8;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
final class A0 extends G0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Function1 f1693e;

    public A0(Function1 function1) {
        this.f1693e = function1;
    }

    @Override // I8.G0
    public boolean v() {
        return false;
    }

    @Override // I8.G0
    public void w(Throwable th) {
        this.f1693e.invoke(th);
    }
}
