package p176r5;

import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes2.dex */
final class M implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ L f48295a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ Callable f48296b;

    M(L l10, Callable callable) {
        this.f48295a = l10;
        this.f48296b = callable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.f48295a.q(this.f48296b.call());
        } catch (Exception e10) {
            this.f48295a.s(e10);
        } catch (Throwable th) {
            this.f48295a.s(new RuntimeException(th));
        }
    }
}
