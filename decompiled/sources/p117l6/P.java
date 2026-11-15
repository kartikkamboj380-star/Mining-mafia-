package p117l6;

import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes3.dex */
public final class P {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AtomicInteger f46126a = new AtomicInteger();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AtomicInteger f46127b = new AtomicInteger();

    public void a() {
        this.f46127b.getAndIncrement();
    }

    public void b() {
        this.f46126a.getAndIncrement();
    }

    public void c() {
        this.f46127b.set(0);
    }
}
