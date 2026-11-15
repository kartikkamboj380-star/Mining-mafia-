package U0;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public interface b {
    Executor a();

    a b();

    default void c(Runnable runnable) {
        b().execute(runnable);
    }
}
