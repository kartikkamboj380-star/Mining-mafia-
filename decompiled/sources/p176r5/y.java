package p176r5;

import com.google.android.gms.tasks.Task;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class y implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ Task f48327a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ z f48328b;

    y(z zVar, Task task) {
        this.f48327a = task;
        Objects.requireNonNull(zVar);
        this.f48328b = zVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        z zVar = this.f48328b;
        synchronized (zVar.a()) {
            try {
                if (zVar.c() != null) {
                    zVar.c().onComplete(this.f48327a);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
