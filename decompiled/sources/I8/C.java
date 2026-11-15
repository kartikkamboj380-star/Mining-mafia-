package I8;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes3.dex */
public class C {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f1701b = AtomicIntegerFieldUpdater.newUpdater(C.class, "_handled$volatile");
    private volatile /* synthetic */ int _handled$volatile;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Throwable f1702a;

    public C(Throwable th, boolean z9) {
        this.f1702a = th;
        this._handled$volatile = z9 ? 1 : 0;
    }

    public final boolean a() {
        return f1701b.get(this) != 0;
    }

    public final boolean c() {
        return f1701b.compareAndSet(this, 0, 1);
    }

    public String toString() {
        return T.a(this) + '[' + this.f1702a + ']';
    }

    public /* synthetic */ C(Throwable th, boolean z9, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(th, (i10 & 2) != 0 ? false : z9);
    }
}
