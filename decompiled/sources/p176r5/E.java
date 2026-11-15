package p176r5;

import com.google.android.gms.tasks.Task;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
final class E implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ Task f48279a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ F f48280b;

    E(F f10, Task task) {
        this.f48279a = task;
        Objects.requireNonNull(f10);
        this.f48280b = f10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            Task taskThen = this.f48280b.c().then(this.f48279a.getResult());
            if (taskThen == null) {
                this.f48280b.onFailure(new NullPointerException("Continuation returned null"));
                return;
            }
            F f10 = this.f48280b;
            Executor executor = AbstractC7095l.f48301b;
            taskThen.f(executor, f10);
            taskThen.d(executor, f10);
            taskThen.a(executor, f10);
        } catch (CancellationException unused) {
            this.f48280b.a();
        } catch (C7092i e10) {
            if (e10.getCause() instanceof Exception) {
                this.f48280b.onFailure((Exception) e10.getCause());
            } else {
                this.f48280b.onFailure(e10);
            }
        } catch (Exception e11) {
            this.f48280b.onFailure(e11);
        }
    }
}
