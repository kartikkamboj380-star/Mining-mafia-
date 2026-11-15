package V5;

/* JADX INFO: loaded from: classes2.dex */
final class J extends F {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ C0969f f6097b;

    J(C0969f c0969f) {
        this.f6097b = c0969f;
    }

    @Override // V5.F
    public final void b() {
        synchronized (this.f6097b.f6110f) {
            try {
                if (this.f6097b.f6116l.get() > 0 && this.f6097b.f6116l.decrementAndGet() > 0) {
                    this.f6097b.f6106b.c("Leaving the connection open for other ongoing calls.", new Object[0]);
                    return;
                }
                C0969f c0969f = this.f6097b;
                if (c0969f.f6118n != null) {
                    c0969f.f6106b.c("Unbind from service.", new Object[0]);
                    C0969f c0969f2 = this.f6097b;
                    c0969f2.f6105a.unbindService(c0969f2.f6117m);
                    this.f6097b.f6111g = false;
                    this.f6097b.f6118n = null;
                    this.f6097b.f6117m = null;
                }
                this.f6097b.x();
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
