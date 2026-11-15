package I8;

import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
final class K0 extends U0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final p169q8.b f1728d;

    public K0(CoroutineContext coroutineContext, Function2 function2) {
        super(coroutineContext, false);
        this.f1728d = p179r8.b.a(function2, this, this);
    }

    @Override // I8.H0
    protected void w0() throws Throwable {
        O8.a.c(this.f1728d, this);
    }
}
