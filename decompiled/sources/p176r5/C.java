package p176r5;

import com.google.android.gms.tasks.Task;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class C implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ Task f48274a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ D f48275b;

    C(D d10, Task task) {
        this.f48274a = task;
        Objects.requireNonNull(d10);
        this.f48275b = d10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        D d10 = this.f48275b;
        synchronized (d10.a()) {
            try {
                if (d10.c() != null) {
                    d10.c().onSuccess(this.f48274a.getResult());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
