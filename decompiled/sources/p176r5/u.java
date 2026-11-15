package p176r5;

import com.google.android.gms.tasks.Task;
import java.util.Objects;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
final class u implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ Task f48318a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ v f48319b;

    u(v vVar, Task task) {
        this.f48318a = task;
        Objects.requireNonNull(vVar);
        this.f48319b = vVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            Task task = (Task) this.f48319b.c().a(this.f48318a);
            if (task == null) {
                this.f48319b.onFailure(new NullPointerException("Continuation returned null"));
                return;
            }
            v vVar = this.f48319b;
            Executor executor = AbstractC7095l.f48301b;
            task.f(executor, vVar);
            task.d(executor, vVar);
            task.a(executor, vVar);
        } catch (C7092i e10) {
            if (!(e10.getCause() instanceof Exception)) {
                this.f48319b.d().s(e10);
                return;
            }
            v vVar2 = this.f48319b;
            vVar2.d().s((Exception) e10.getCause());
        } catch (Exception e11) {
            this.f48319b.d().s(e11);
        }
    }
}
