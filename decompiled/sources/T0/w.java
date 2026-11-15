package T0;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public class w implements Executor {
    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        runnable.run();
    }
}
