package I8;

import java.util.concurrent.Future;

/* JADX INFO: renamed from: I8.f0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C0668f0 implements InterfaceC0670g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Future f1780a;

    public C0668f0(Future future) {
        this.f1780a = future;
    }

    @Override // I8.InterfaceC0670g0
    public void c() {
        this.f1780a.cancel(false);
    }

    public String toString() {
        return "DisposableFutureHandle[" + this.f1780a + ']';
    }
}
