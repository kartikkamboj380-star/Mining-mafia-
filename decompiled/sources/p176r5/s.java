package p176r5;

import com.google.android.gms.tasks.Task;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class s implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ Task f48313a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ t f48314b;

    s(t tVar, Task task) {
        this.f48313a = task;
        Objects.requireNonNull(tVar);
        this.f48314b = tVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Task task = this.f48313a;
        if (task.m()) {
            this.f48314b.c().u();
            return;
        }
        try {
            this.f48314b.c().q(this.f48314b.a().a(task));
        } catch (C7092i e10) {
            if (!(e10.getCause() instanceof Exception)) {
                this.f48314b.c().s(e10);
                return;
            }
            t tVar = this.f48314b;
            tVar.c().s((Exception) e10.getCause());
        } catch (Exception e11) {
            this.f48314b.c().s(e11);
        }
    }
}
