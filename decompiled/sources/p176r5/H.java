package p176r5;

import com.google.android.gms.tasks.Task;
import java.util.ArrayDeque;
import java.util.Queue;

/* JADX INFO: loaded from: classes2.dex */
final class H {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f48284a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Queue f48285b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f48286c;

    H() {
    }

    public final void a(G g10) {
        synchronized (this.f48284a) {
            try {
                if (this.f48285b == null) {
                    this.f48285b = new ArrayDeque();
                }
                this.f48285b.add(g10);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b(Task task) {
        G g10;
        synchronized (this.f48284a) {
            if (this.f48285b != null && !this.f48286c) {
                this.f48286c = true;
                while (true) {
                    synchronized (this.f48284a) {
                        try {
                            g10 = (G) this.f48285b.poll();
                            if (g10 == null) {
                                this.f48286c = false;
                                return;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    g10.b(task);
                }
            }
        }
    }
}
