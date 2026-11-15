package V5;

import p176r5.C7094k;

/* JADX INFO: loaded from: classes2.dex */
final class I extends F {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ C7094k f6094b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ F f6095c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ C0969f f6096d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    I(C0969f c0969f, C7094k c7094k, C7094k c7094k2, F f10) {
        super(c7094k);
        this.f6096d = c0969f;
        this.f6094b = c7094k2;
        this.f6095c = f10;
    }

    @Override // V5.F
    public final void b() {
        synchronized (this.f6096d.f6110f) {
            try {
                C0969f.o(this.f6096d, this.f6094b);
                if (this.f6096d.f6116l.getAndIncrement() > 0) {
                    this.f6096d.f6106b.c("Already connected to the service.", new Object[0]);
                }
                C0969f.q(this.f6096d, this.f6095c);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
