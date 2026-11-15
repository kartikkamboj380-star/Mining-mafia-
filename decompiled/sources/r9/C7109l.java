package r9;

import java.io.IOException;
import java.util.zip.Deflater;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: r9.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C7109l implements a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC7106i f48472a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Deflater f48473b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f48474c;

    public C7109l(InterfaceC7106i sink, Deflater deflater) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        Intrinsics.checkNotNullParameter(deflater, "deflater");
        this.f48472a = sink;
        this.f48473b = deflater;
    }

    private final void a(boolean z9) throws IOException {
        X xQ1;
        int iDeflate;
        C7105h c7105hG = this.f48472a.g();
        while (true) {
            xQ1 = c7105hG.q1(1);
            if (z9) {
                try {
                    Deflater deflater = this.f48473b;
                    byte[] bArr = xQ1.f48409a;
                    int i10 = xQ1.f48411c;
                    iDeflate = deflater.deflate(bArr, i10, 8192 - i10, 2);
                } catch (NullPointerException e10) {
                    throw new IOException("Deflater already closed", e10);
                }
            } else {
                Deflater deflater2 = this.f48473b;
                byte[] bArr2 = xQ1.f48409a;
                int i11 = xQ1.f48411c;
                iDeflate = deflater2.deflate(bArr2, i11, 8192 - i11);
            }
            if (iDeflate > 0) {
                xQ1.f48411c += iDeflate;
                c7105hG.n1(c7105hG.size() + ((long) iDeflate));
                this.f48472a.z();
            } else if (this.f48473b.needsInput()) {
                break;
            }
        }
        if (xQ1.f48410b == xQ1.f48411c) {
            c7105hG.f48456a = xQ1.b();
            Y.b(xQ1);
        }
    }

    @Override // r9.a0
    public void W0(C7105h source, long j10) throws IOException {
        Intrinsics.checkNotNullParameter(source, "source");
        AbstractC7102e.b(source.size(), 0L, j10);
        while (j10 > 0) {
            X x10 = source.f48456a;
            Intrinsics.c(x10);
            int iMin = (int) Math.min(j10, x10.f48411c - x10.f48410b);
            this.f48473b.setInput(x10.f48409a, x10.f48410b, iMin);
            a(false);
            long j11 = iMin;
            source.n1(source.size() - j11);
            int i10 = x10.f48410b + iMin;
            x10.f48410b = i10;
            if (i10 == x10.f48411c) {
                source.f48456a = x10.b();
                Y.b(x10);
            }
            j10 -= j11;
        }
    }

    public final void c() throws IOException {
        this.f48473b.finish();
        a(false);
    }

    @Override // r9.a0, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws Throwable {
        if (this.f48474c) {
            return;
        }
        c();
        th = null;
        try {
            this.f48473b.end();
        } catch (Throwable th) {
            if (th == null) {
                th = th;
            }
        }
        try {
            this.f48472a.close();
        } catch (Throwable th2) {
            if (th == null) {
                th = th2;
            }
        }
        this.f48474c = true;
        if (th != null) {
            throw th;
        }
    }

    @Override // r9.a0, java.io.Flushable
    public void flush() throws IOException {
        a(true);
        this.f48472a.flush();
    }

    @Override // r9.a0
    public d0 i() {
        return this.f48472a.i();
    }

    public String toString() {
        return "DeflaterSink(" + this.f48472a + ')';
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C7109l(a0 sink, Deflater deflater) {
        this(L.c(sink), deflater);
        Intrinsics.checkNotNullParameter(sink, "sink");
        Intrinsics.checkNotNullParameter(deflater, "deflater");
    }
}
