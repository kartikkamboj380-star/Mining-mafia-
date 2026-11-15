package P5;

import p176r5.C7094k;

/* JADX INFO: loaded from: classes2.dex */
public abstract class q implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C7094k f4702a;

    q() {
        this.f4702a = null;
    }

    protected abstract void a();

    final C7094k b() {
        return this.f4702a;
    }

    public final void c(Exception exc) {
        C7094k c7094k = this.f4702a;
        if (c7094k != null) {
            c7094k.d(exc);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            a();
        } catch (Exception e10) {
            c(e10);
        }
    }

    public q(C7094k c7094k) {
        this.f4702a = c7094k;
    }
}
