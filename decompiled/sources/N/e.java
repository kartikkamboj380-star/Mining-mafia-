package N;

import androidx.core.util.Pools$SimplePool;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public class e extends Pools$SimplePool {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Object f3624c;

    public e(int i10) {
        super(i10);
        this.f3624c = new Object();
    }

    @Override // androidx.core.util.Pools$SimplePool, N.d
    public boolean a(Object instance) {
        boolean zA;
        Intrinsics.checkNotNullParameter(instance, "instance");
        synchronized (this.f3624c) {
            zA = super.a(instance);
        }
        return zA;
    }

    @Override // androidx.core.util.Pools$SimplePool, N.d
    public Object b() {
        Object objB;
        synchronized (this.f3624c) {
            objB = super.b();
        }
        return objB;
    }
}
