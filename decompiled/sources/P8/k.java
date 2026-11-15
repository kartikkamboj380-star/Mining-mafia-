package P8;

import I8.K;
import N8.AbstractC0835l;
import kotlin.coroutines.CoroutineContext;

/* JADX INFO: loaded from: classes3.dex */
final class k extends K {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final k f4775b = new k();

    private k() {
    }

    @Override // I8.K
    public void l1(CoroutineContext coroutineContext, Runnable runnable) {
        c.f4759h.s1(runnable, true, false);
    }

    @Override // I8.K
    public void m1(CoroutineContext coroutineContext, Runnable runnable) {
        c.f4759h.s1(runnable, true, true);
    }

    @Override // I8.K
    public K o1(int i10, String str) {
        AbstractC0835l.a(i10);
        return i10 >= j.f4772d ? AbstractC0835l.b(this, str) : super.o1(i10, str);
    }

    @Override // I8.K
    public String toString() {
        return "Dispatchers.IO";
    }
}
