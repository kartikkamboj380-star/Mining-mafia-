package I8;

import java.util.concurrent.Future;

/* JADX INFO: renamed from: I8.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C0679l implements InterfaceC0681m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Future f1793a;

    public C0679l(Future future) {
        this.f1793a = future;
    }

    @Override // I8.InterfaceC0681m
    public void a(Throwable th) {
        this.f1793a.cancel(false);
    }

    public String toString() {
        return "CancelFutureOnCancel[" + this.f1793a + ']';
    }
}
