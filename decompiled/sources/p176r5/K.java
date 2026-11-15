package p176r5;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
import p116l5.a;

/* JADX INFO: loaded from: classes2.dex */
final class K implements Executor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Handler f48288a = new a(Looper.getMainLooper());

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.f48288a.post(runnable);
    }
}
