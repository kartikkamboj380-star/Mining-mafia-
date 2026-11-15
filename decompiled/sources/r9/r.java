package r9;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public abstract class r implements c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final c0 f48496a;

    public r(c0 delegate) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.f48496a = delegate;
    }

    public final c0 a() {
        return this.f48496a;
    }

    @Override // r9.c0, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f48496a.close();
    }

    @Override // r9.c0
    public d0 i() {
        return this.f48496a.i();
    }

    @Override // r9.c0
    public long s(C7105h sink, long j10) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        return this.f48496a.s(sink, j10);
    }

    public String toString() {
        return getClass().getSimpleName() + '(' + this.f48496a + ')';
    }
}
