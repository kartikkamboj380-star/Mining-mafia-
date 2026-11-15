package r9;

import java.io.IOException;
import java.io.OutputStream;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
final class Q implements a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final OutputStream f48389a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final d0 f48390b;

    public Q(OutputStream out, d0 timeout) {
        Intrinsics.checkNotNullParameter(out, "out");
        Intrinsics.checkNotNullParameter(timeout, "timeout");
        this.f48389a = out;
        this.f48390b = timeout;
    }

    @Override // r9.a0
    public void W0(C7105h source, long j10) throws IOException {
        Intrinsics.checkNotNullParameter(source, "source");
        AbstractC7102e.b(source.size(), 0L, j10);
        while (j10 > 0) {
            this.f48390b.f();
            X x10 = source.f48456a;
            Intrinsics.c(x10);
            int iMin = (int) Math.min(j10, x10.f48411c - x10.f48410b);
            this.f48389a.write(x10.f48409a, x10.f48410b, iMin);
            x10.f48410b += iMin;
            long j11 = iMin;
            j10 -= j11;
            source.n1(source.size() - j11);
            if (x10.f48410b == x10.f48411c) {
                source.f48456a = x10.b();
                Y.b(x10);
            }
        }
    }

    @Override // r9.a0, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f48389a.close();
    }

    @Override // r9.a0, java.io.Flushable
    public void flush() throws IOException {
        this.f48389a.flush();
    }

    @Override // r9.a0
    public d0 i() {
        return this.f48390b;
    }

    public String toString() {
        return "sink(" + this.f48389a + ')';
    }
}
