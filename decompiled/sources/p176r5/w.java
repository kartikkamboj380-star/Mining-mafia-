package p176r5;

import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class w implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ x f48323a;

    w(x xVar) {
        Objects.requireNonNull(xVar);
        this.f48323a = xVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        x xVar = this.f48323a;
        synchronized (xVar.a()) {
            try {
                if (xVar.c() != null) {
                    xVar.c().a();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
