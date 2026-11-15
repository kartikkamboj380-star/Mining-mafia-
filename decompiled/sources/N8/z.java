package N8;

import I8.AbstractC0657a;
import kotlin.coroutines.CoroutineContext;

/* JADX INFO: loaded from: classes3.dex */
public class z extends AbstractC0657a implements kotlin.coroutines.jvm.internal.e {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final p169q8.b f3734d;

    public z(CoroutineContext coroutineContext, p169q8.b bVar) {
        super(coroutineContext, true, true);
        this.f3734d = bVar;
    }

    @Override // I8.AbstractC0657a
    protected void L0(Object obj) {
        p169q8.b bVar = this.f3734d;
        bVar.resumeWith(I8.E.a(obj, bVar));
    }

    @Override // kotlin.coroutines.jvm.internal.e
    public final kotlin.coroutines.jvm.internal.e getCallerFrame() {
        p169q8.b bVar = this.f3734d;
        if (bVar instanceof kotlin.coroutines.jvm.internal.e) {
            return (kotlin.coroutines.jvm.internal.e) bVar;
        }
        return null;
    }

    @Override // I8.H0
    protected final boolean k0() {
        return true;
    }

    @Override // I8.H0
    protected void z(Object obj) {
        AbstractC0832i.b(p179r8.b.c(this.f3734d), I8.E.a(obj, this.f3734d));
    }
}
