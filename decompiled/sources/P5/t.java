package P5;

import p176r5.C7094k;

/* JADX INFO: loaded from: classes2.dex */
final class t extends q {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ C7094k f4706b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ q f4707c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ A f4708d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    t(A a10, C7094k c7094k, C7094k c7094k2, q qVar) {
        super(c7094k);
        this.f4708d = a10;
        this.f4706b = c7094k2;
        this.f4707c = qVar;
    }

    @Override // P5.q
    public final void a() {
        synchronized (this.f4708d.f4676f) {
            try {
                A.n(this.f4708d, this.f4706b);
                if (this.f4708d.f4681k.getAndIncrement() > 0) {
                    this.f4708d.f4672b.c("Already connected to the service.", new Object[0]);
                }
                A.p(this.f4708d, this.f4707c);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
