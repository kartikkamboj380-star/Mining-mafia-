package p176r5;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
final class o implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final CountDownLatch f48303a = new CountDownLatch(1);

    /* synthetic */ o(byte[] bArr) {
    }

    @Override // p176r5.InterfaceC7088e
    public final void a() {
        this.f48303a.countDown();
    }

    public final void b() throws InterruptedException {
        this.f48303a.await();
    }

    public final boolean c(long j10, TimeUnit timeUnit) {
        return this.f48303a.await(j10, timeUnit);
    }

    @Override // p176r5.InterfaceC7089f
    public final void onFailure(Exception exc) {
        this.f48303a.countDown();
    }

    @Override // p176r5.InterfaceC7090g
    public final void onSuccess(Object obj) {
        this.f48303a.countDown();
    }
}
