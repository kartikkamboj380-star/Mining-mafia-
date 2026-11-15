package p176r5;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
final class z implements G {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Executor f48329a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object f48330b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private OnCompleteListener f48331c;

    public z(Executor executor, OnCompleteListener onCompleteListener) {
        this.f48329a = executor;
        this.f48331c = onCompleteListener;
    }

    final /* synthetic */ Object a() {
        return this.f48330b;
    }

    @Override // p176r5.G
    public final void b(Task task) {
        synchronized (this.f48330b) {
            try {
                if (this.f48331c == null) {
                    return;
                }
                this.f48329a.execute(new y(this, task));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    final /* synthetic */ OnCompleteListener c() {
        return this.f48331c;
    }
}
