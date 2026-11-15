package W1;

import android.os.Handler;
import android.os.Looper;

/* JADX INFO: loaded from: classes.dex */
public class f extends b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static f f6547b;

    private f() {
        super(new Handler(Looper.getMainLooper()));
    }

    public static f x() {
        if (f6547b == null) {
            f6547b = new f();
        }
        return f6547b;
    }

    @Override // W1.b, java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        if (a()) {
            runnable.run();
        } else {
            super.execute(runnable);
        }
    }
}
