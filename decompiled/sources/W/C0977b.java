package W;

import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: W.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0977b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AtomicInteger f6215a;

    public C0977b(int i10) {
        this.f6215a = new AtomicInteger(i10);
    }

    public final int a() {
        return this.f6215a.decrementAndGet();
    }

    public final int b() {
        return this.f6215a.get();
    }

    public final int c() {
        return this.f6215a.getAndIncrement();
    }

    public final int d() {
        return this.f6215a.incrementAndGet();
    }
}
