package r9;

import java.io.IOException;
import java.io.InputStream;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: r9.v, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
class C7118v implements c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InputStream f48507a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final d0 f48508b;

    public C7118v(InputStream input, d0 timeout) {
        Intrinsics.checkNotNullParameter(input, "input");
        Intrinsics.checkNotNullParameter(timeout, "timeout");
        this.f48507a = input;
        this.f48508b = timeout;
    }

    @Override // r9.c0, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f48507a.close();
    }

    @Override // r9.c0
    public d0 i() {
        return this.f48508b;
    }

    @Override // r9.c0
    public long s(C7105h sink, long j10) throws IOException {
        Intrinsics.checkNotNullParameter(sink, "sink");
        if (j10 == 0) {
            return 0L;
        }
        if (j10 < 0) {
            throw new IllegalArgumentException(("byteCount < 0: " + j10).toString());
        }
        try {
            this.f48508b.f();
            X xQ1 = sink.q1(1);
            int i10 = this.f48507a.read(xQ1.f48409a, xQ1.f48411c, (int) Math.min(j10, 8192 - xQ1.f48411c));
            if (i10 != -1) {
                xQ1.f48411c += i10;
                long j11 = i10;
                sink.n1(sink.size() + j11);
                return j11;
            }
            if (xQ1.f48410b != xQ1.f48411c) {
                return -1L;
            }
            sink.f48456a = xQ1.b();
            Y.b(xQ1);
            return -1L;
        } catch (AssertionError e10) {
            if (L.e(e10)) {
                throw new IOException(e10);
            }
            throw e10;
        }
    }

    public String toString() {
        return "source(" + this.f48507a + ')';
    }
}
