package p176r5;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
final class J implements Executor {
    J() {
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.run();
    }
}
