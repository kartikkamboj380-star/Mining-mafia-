package p176r5;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.tasks.Task;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class A implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ Task f48269a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ B f48270b;

    A(B b10, Task task) {
        this.f48269a = task;
        Objects.requireNonNull(b10);
        this.f48270b = b10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        B b10 = this.f48270b;
        synchronized (b10.a()) {
            try {
                if (b10.c() != null) {
                    b10.c().onFailure((Exception) Preconditions.checkNotNull(this.f48269a.getException()));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
