package androidx.work;

import I8.InterfaceC0683n;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes.dex */
public final class n implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ InterfaceC0683n f11408a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ com.google.common.util.concurrent.p f11409b;

    public n(InterfaceC0683n interfaceC0683n, com.google.common.util.concurrent.p pVar) {
        this.f11408a = interfaceC0683n;
        this.f11409b = pVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            InterfaceC0683n interfaceC0683n = this.f11408a;
            m8.m.a aVar = p129m8.m.f46450b;
            interfaceC0683n.resumeWith(p129m8.m.b(this.f11409b.get()));
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                cause = th;
            }
            if (th instanceof CancellationException) {
                this.f11408a.j(cause);
                return;
            }
            InterfaceC0683n interfaceC0683n2 = this.f11408a;
            m8.m.a aVar2 = p129m8.m.f46450b;
            interfaceC0683n2.resumeWith(p129m8.m.b(p129m8.n.a(cause)));
        }
    }
}
