package V5;

import p176r5.C7094k;

/* JADX INFO: loaded from: classes2.dex */
public abstract class F implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C7094k f6090a;

    F() {
        this.f6090a = null;
    }

    public void a(Exception exc) {
        C7094k c7094k = this.f6090a;
        if (c7094k != null) {
            c7094k.d(exc);
        }
    }

    protected abstract void b();

    final C7094k c() {
        return this.f6090a;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            b();
        } catch (Exception e10) {
            a(e10);
        }
    }

    public F(C7094k c7094k) {
        this.f6090a = c7094k;
    }
}
