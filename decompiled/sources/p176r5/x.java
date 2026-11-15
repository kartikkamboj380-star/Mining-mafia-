package p176r5;

import com.google.android.gms.tasks.Task;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
final class x implements G {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Executor f48324a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object f48325b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private InterfaceC7088e f48326c;

    public x(Executor executor, InterfaceC7088e interfaceC7088e) {
        this.f48324a = executor;
        this.f48326c = interfaceC7088e;
    }

    final /* synthetic */ Object a() {
        return this.f48325b;
    }

    @Override // p176r5.G
    public final void b(Task task) {
        if (task.m()) {
            synchronized (this.f48325b) {
                try {
                    if (this.f48326c == null) {
                        return;
                    }
                    this.f48324a.execute(new w(this));
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    final /* synthetic */ InterfaceC7088e c() {
        return this.f48326c;
    }
}
