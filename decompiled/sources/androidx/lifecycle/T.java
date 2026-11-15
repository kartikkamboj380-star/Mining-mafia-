package androidx.lifecycle;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public abstract class T {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p131n0.f f10188a = new p131n0.f();

    public final void a(String key, AutoCloseable closeable) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(closeable, "closeable");
        p131n0.f fVar = this.f10188a;
        if (fVar != null) {
            fVar.d(key, closeable);
        }
    }

    public final void b() {
        p131n0.f fVar = this.f10188a;
        if (fVar != null) {
            fVar.e();
        }
        d();
    }

    public final AutoCloseable c(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        p131n0.f fVar = this.f10188a;
        if (fVar != null) {
            return fVar.g(key);
        }
        return null;
    }

    protected void d() {
    }
}
