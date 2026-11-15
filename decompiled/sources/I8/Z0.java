package I8;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: loaded from: classes3.dex */
final class Z0 extends G0 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f1752g = AtomicIntegerFieldUpdater.newUpdater(Z0.class, "_state$volatile");
    private volatile /* synthetic */ int _state$volatile;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Thread f1753e = Thread.currentThread();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private InterfaceC0670g0 f1754f;

    private final Void A(int i10) {
        throw new IllegalStateException(("Illegal state " + i10).toString());
    }

    public final void B(B0 b10) {
        int i10;
        this.f1754f = F0.j(b10, false, this, 1, null);
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f1752g;
        do {
            i10 = atomicIntegerFieldUpdater.get(this);
            if (i10 != 0) {
                if (i10 == 2 || i10 == 3) {
                    return;
                }
                A(i10);
                throw new p129m8.d();
            }
        } while (!f1752g.compareAndSet(this, i10, 0));
    }

    @Override // I8.G0
    public boolean v() {
        return true;
    }

    @Override // I8.G0
    public void w(Throwable th) {
        int i10;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f1752g;
        do {
            i10 = atomicIntegerFieldUpdater.get(this);
            if (i10 != 0) {
                if (i10 == 1 || i10 == 2 || i10 == 3) {
                    return;
                }
                A(i10);
                throw new p129m8.d();
            }
        } while (!f1752g.compareAndSet(this, i10, 2));
        this.f1753e.interrupt();
        f1752g.set(this, 3);
    }

    public final void y() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f1752g;
        while (true) {
            int i10 = atomicIntegerFieldUpdater.get(this);
            if (i10 != 0) {
                if (i10 != 2) {
                    if (i10 == 3) {
                        Thread.interrupted();
                        return;
                    } else {
                        A(i10);
                        throw new p129m8.d();
                    }
                }
            } else if (f1752g.compareAndSet(this, i10, 1)) {
                InterfaceC0670g0 interfaceC0670g0 = this.f1754f;
                if (interfaceC0670g0 != null) {
                    interfaceC0670g0.c();
                    return;
                }
                return;
            }
        }
    }
}
