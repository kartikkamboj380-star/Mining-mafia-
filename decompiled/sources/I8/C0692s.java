package I8;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: renamed from: I8.s, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0692s extends C {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f1814c = AtomicIntegerFieldUpdater.newUpdater(C0692s.class, "_resumed$volatile");
    private volatile /* synthetic */ int _resumed$volatile;

    public C0692s(p169q8.b bVar, Throwable th, boolean z9) {
        if (th == null) {
            th = new CancellationException("Continuation " + bVar + " was cancelled normally");
        }
        super(th, z9);
        this._resumed$volatile = 0;
    }

    public final boolean e() {
        return f1814c.compareAndSet(this, 0, 1);
    }
}
