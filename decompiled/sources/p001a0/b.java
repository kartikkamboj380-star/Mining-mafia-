package p001a0;

import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AtomicBoolean f7235a;

    public b(boolean z9) {
        this.f7235a = new AtomicBoolean(z9);
    }

    public final boolean a() {
        return this.f7235a.get();
    }

    public final void b(boolean z9) {
        this.f7235a.set(z9);
    }
}
