package I8;

import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
final class J0 extends X {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final p169q8.b f1726d;

    public J0(CoroutineContext coroutineContext, Function2 function2) {
        super(coroutineContext, false);
        this.f1726d = p179r8.b.a(function2, this, this);
    }

    @Override // I8.H0
    protected void w0() throws Throwable {
        O8.a.c(this.f1726d, this);
    }
}
