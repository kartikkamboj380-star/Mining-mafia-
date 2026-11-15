package r9;

import java.io.EOFException;
import java.io.IOException;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: r9.u, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C7117u implements c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC7107j f48503a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Inflater f48504b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f48505c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f48506d;

    public C7117u(InterfaceC7107j source, Inflater inflater) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        this.f48503a = source;
        this.f48504b = inflater;
    }

    private final void h() {
        int i10 = this.f48505c;
        if (i10 == 0) {
            return;
        }
        int remaining = i10 - this.f48504b.getRemaining();
        this.f48505c -= remaining;
        this.f48503a.skip(remaining);
    }

    public final long a(C7105h sink, long j10) throws IOException {
        Intrinsics.checkNotNullParameter(sink, "sink");
        if (j10 < 0) {
            throw new IllegalArgumentException(("byteCount < 0: " + j10).toString());
        }
        if (this.f48506d) {
            throw new IllegalStateException("closed");
        }
        if (j10 == 0) {
            return 0L;
        }
        try {
            X xQ1 = sink.q1(1);
            int iMin = (int) Math.min(j10, 8192 - xQ1.f48411c);
            c();
            int iInflate = this.f48504b.inflate(xQ1.f48409a, xQ1.f48411c, iMin);
            h();
            if (iInflate > 0) {
                xQ1.f48411c += iInflate;
                long j11 = iInflate;
                sink.n1(sink.size() + j11);
                return j11;
            }
            if (xQ1.f48410b == xQ1.f48411c) {
                sink.f48456a = xQ1.b();
                Y.b(xQ1);
            }
            return 0L;
        } catch (DataFormatException e10) {
            throw new IOException(e10);
        }
    }

    public final boolean c() {
        if (!this.f48504b.needsInput()) {
            return false;
        }
        if (this.f48503a.x0()) {
            return true;
        }
        X x10 = this.f48503a.g().f48456a;
        Intrinsics.c(x10);
        int i10 = x10.f48411c;
        int i11 = x10.f48410b;
        int i12 = i10 - i11;
        this.f48505c = i12;
        this.f48504b.setInput(x10.f48409a, i11, i12);
        return false;
    }

    @Override // r9.c0, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.f48506d) {
            return;
        }
        this.f48504b.end();
        this.f48506d = true;
        this.f48503a.close();
    }

    @Override // r9.c0
    public d0 i() {
        return this.f48503a.i();
    }

    @Override // r9.c0
    public long s(C7105h sink, long j10) throws IOException {
        Intrinsics.checkNotNullParameter(sink, "sink");
        do {
            long jA = a(sink, j10);
            if (jA > 0) {
                return jA;
            }
            if (this.f48504b.finished() || this.f48504b.needsDictionary()) {
                return -1L;
            }
        } while (!this.f48503a.x0());
        throw new EOFException("source exhausted prematurely");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C7117u(c0 source, Inflater inflater) {
        this(L.d(source), inflater);
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(inflater, "inflater");
    }
}
