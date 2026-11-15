package P8;

import I8.AbstractC0691r0;
import I8.K;
import N8.E;
import N8.G;
import java.util.concurrent.Executor;
import kotlin.coroutines.CoroutineContext;

/* JADX INFO: loaded from: classes3.dex */
public final class b extends AbstractC0691r0 implements Executor {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final b f4757c = new b();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final K f4758d = K.p1(k.f4775b, G.e("kotlinx.coroutines.io.parallelism", kotlin.ranges.b.c(64, E.a()), 0, 0, 12, null), null, 2, null);

    private b() {
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        throw new IllegalStateException("Cannot be invoked on Dispatchers.IO");
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        l1(kotlin.coroutines.e.f45956a, runnable);
    }

    @Override // I8.K
    public void l1(CoroutineContext coroutineContext, Runnable runnable) {
        f4758d.l1(coroutineContext, runnable);
    }

    @Override // I8.K
    public void m1(CoroutineContext coroutineContext, Runnable runnable) {
        f4758d.m1(coroutineContext, runnable);
    }

    @Override // I8.K
    public K o1(int i10, String str) {
        return k.f4775b.o1(i10, str);
    }

    @Override // I8.K
    public String toString() {
        return "Dispatchers.IO";
    }

    @Override // I8.AbstractC0691r0
    public Executor q1() {
        return this;
    }
}
