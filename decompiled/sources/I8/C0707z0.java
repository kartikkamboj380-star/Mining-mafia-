package I8;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: I8.z0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C0707z0 extends G0 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f1824f = AtomicIntegerFieldUpdater.newUpdater(C0707z0.class, "_invoked$volatile");
    private volatile /* synthetic */ int _invoked$volatile = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Function1 f1825e;

    public C0707z0(Function1 function1) {
        this.f1825e = function1;
    }

    @Override // I8.G0
    public boolean v() {
        return true;
    }

    @Override // I8.G0
    public void w(Throwable th) {
        if (f1824f.compareAndSet(this, 0, 1)) {
            this.f1825e.invoke(th);
        }
    }
}
