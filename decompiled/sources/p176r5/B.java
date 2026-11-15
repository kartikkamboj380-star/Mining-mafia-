package p176r5;

import com.google.android.gms.tasks.Task;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
final class B implements G {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Executor f48271a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object f48272b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private InterfaceC7089f f48273c;

    public B(Executor executor, InterfaceC7089f interfaceC7089f) {
        this.f48271a = executor;
        this.f48273c = interfaceC7089f;
    }

    final /* synthetic */ Object a() {
        return this.f48272b;
    }

    @Override // p176r5.G
    public final void b(Task task) {
        if (task.isSuccessful() || task.m()) {
            return;
        }
        synchronized (this.f48272b) {
            try {
                if (this.f48273c == null) {
                    return;
                }
                this.f48271a.execute(new A(this, task));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    final /* synthetic */ InterfaceC7089f c() {
        return this.f48273c;
    }
}
