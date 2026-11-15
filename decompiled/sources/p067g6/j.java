package p067g6;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public abstract class j {

    private enum a implements Executor {
        INSTANCE;

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            runnable.run();
        }
    }

    public static Executor a() {
        return a.INSTANCE;
    }

    public static Executor b(Executor executor) {
        return new k(executor);
    }
}
