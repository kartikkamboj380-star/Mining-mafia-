package p176r5;

import com.google.android.gms.tasks.Task;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
final class D implements G {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Executor f48276a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object f48277b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private InterfaceC7090g f48278c;

    public D(Executor executor, InterfaceC7090g interfaceC7090g) {
        this.f48276a = executor;
        this.f48278c = interfaceC7090g;
    }

    final /* synthetic */ Object a() {
        return this.f48277b;
    }

    @Override // p176r5.G
    public final void b(Task task) {
        if (task.isSuccessful()) {
            synchronized (this.f48277b) {
                try {
                    if (this.f48278c == null) {
                        return;
                    }
                    this.f48276a.execute(new C(this, task));
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    final /* synthetic */ InterfaceC7090g c() {
        return this.f48278c;
    }
}
