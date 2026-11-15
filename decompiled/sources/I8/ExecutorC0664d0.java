package I8;

import java.util.concurrent.Executor;

/* JADX INFO: renamed from: I8.d0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class ExecutorC0664d0 implements Executor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final K f1766a;

    public ExecutorC0664d0(K k10) {
        this.f1766a = k10;
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        K k10 = this.f1766a;
        kotlin.coroutines.e eVar = kotlin.coroutines.e.f45956a;
        if (k10.n1(eVar)) {
            this.f1766a.l1(eVar, runnable);
        } else {
            runnable.run();
        }
    }

    public String toString() {
        return this.f1766a.toString();
    }
}
