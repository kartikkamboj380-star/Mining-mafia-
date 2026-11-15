package P5;

/* JADX INFO: loaded from: classes2.dex */
final class u extends q {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ A f4709b;

    u(A a10) {
        this.f4709b = a10;
    }

    @Override // P5.q
    public final void a() {
        synchronized (this.f4709b.f4676f) {
            try {
                if (this.f4709b.f4681k.get() > 0 && this.f4709b.f4681k.decrementAndGet() > 0) {
                    this.f4709b.f4672b.c("Leaving the connection open for other ongoing calls.", new Object[0]);
                    return;
                }
                A a10 = this.f4709b;
                if (a10.f4683m != null) {
                    a10.f4672b.c("Unbind from service.", new Object[0]);
                    A a11 = this.f4709b;
                    a11.f4671a.unbindService(a11.f4682l);
                    this.f4709b.f4677g = false;
                    this.f4709b.f4683m = null;
                    this.f4709b.f4682l = null;
                }
                this.f4709b.w();
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
