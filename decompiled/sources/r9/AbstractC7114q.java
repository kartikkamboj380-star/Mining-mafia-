package r9;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: r9.q, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC7114q implements a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a0 f48495a;

    public AbstractC7114q(a0 delegate) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.f48495a = delegate;
    }

    @Override // r9.a0
    public void W0(C7105h source, long j10) {
        Intrinsics.checkNotNullParameter(source, "source");
        this.f48495a.W0(source, j10);
    }

    @Override // r9.a0, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f48495a.close();
    }

    @Override // r9.a0, java.io.Flushable
    public void flush() {
        this.f48495a.flush();
    }

    @Override // r9.a0
    public d0 i() {
        return this.f48495a.i();
    }

    public String toString() {
        return getClass().getSimpleName() + '(' + this.f48495a + ')';
    }
}
