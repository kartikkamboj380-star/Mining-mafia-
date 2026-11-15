package U0;

import T0.t;
import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public class c implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final t f5835a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final Handler f5836b = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Executor f5837c = new a();

    class a implements Executor {
        a() {
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            c.this.f5836b.post(runnable);
        }
    }

    public c(Executor executor) {
        this.f5835a = new t(executor);
    }

    @Override // U0.b
    public Executor a() {
        return this.f5837c;
    }

    @Override // U0.b
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public t b() {
        return this.f5835a;
    }
}
