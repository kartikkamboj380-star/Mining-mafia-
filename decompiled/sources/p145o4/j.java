package p145o4;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes2.dex */
abstract class j {
    static Executor a() {
        return new n(Executors.newSingleThreadExecutor());
    }
}
