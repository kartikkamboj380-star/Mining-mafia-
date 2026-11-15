package g9;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f44435a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f44436b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private d f44437c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f44438d;

    public a(String name, boolean z9) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.f44435a = name;
        this.f44436b = z9;
        this.f44438d = -1L;
    }

    public final boolean a() {
        return this.f44436b;
    }

    public final String b() {
        return this.f44435a;
    }

    public final long c() {
        return this.f44438d;
    }

    public final d d() {
        return this.f44437c;
    }

    public final void e(d queue) {
        Intrinsics.checkNotNullParameter(queue, "queue");
        d dVar = this.f44437c;
        if (dVar == queue) {
            return;
        }
        if (dVar != null) {
            throw new IllegalStateException("task is in multiple queues");
        }
        this.f44437c = queue;
    }

    public abstract long f();

    public final void g(long j10) {
        this.f44438d = j10;
    }

    public String toString() {
        return this.f44435a;
    }

    public /* synthetic */ a(String str, boolean z9, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i10 & 2) != 0 ? true : z9);
    }
}
