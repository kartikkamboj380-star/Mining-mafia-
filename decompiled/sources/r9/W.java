package r9;

import com.google.android.gms.common.api.Api;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.CharsKt;

/* JADX INFO: loaded from: classes3.dex */
public final class W implements InterfaceC7107j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c0 f48404a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C7105h f48405b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f48406c;

    public W(c0 source) {
        Intrinsics.checkNotNullParameter(source, "source");
        this.f48404a = source;
        this.f48405b = new C7105h();
    }

    @Override // r9.InterfaceC7107j
    public String A(long j10) throws EOFException {
        if (j10 < 0) {
            throw new IllegalArgumentException(("limit < 0: " + j10).toString());
        }
        long j11 = j10 == Long.MAX_VALUE ? Long.MAX_VALUE : j10 + 1;
        long jY = y((byte) 10, 0L, j11);
        if (jY != -1) {
            return s9.a.d(this.f48405b, jY);
        }
        if (j11 < Long.MAX_VALUE && P(j11) && this.f48405b.V(j11 - 1) == 13 && P(j11 + 1) && this.f48405b.V(j11) == 10) {
            return s9.a.d(this.f48405b, j11);
        }
        C7105h c7105h = new C7105h();
        C7105h c7105h2 = this.f48405b;
        c7105h2.G(c7105h, 0L, Math.min(32, c7105h2.size()));
        throw new EOFException("\\n not found: limit=" + Math.min(this.f48405b.size(), j10) + " content=" + c7105h.l1().n() + (char) 8230);
    }

    @Override // r9.InterfaceC7107j
    public String L0(Charset charset) {
        Intrinsics.checkNotNullParameter(charset, "charset");
        this.f48405b.w0(this.f48404a);
        return this.f48405b.L0(charset);
    }

    @Override // r9.InterfaceC7107j
    public void O(C7105h sink, long j10) throws EOFException {
        Intrinsics.checkNotNullParameter(sink, "sink");
        try {
            i0(j10);
            this.f48405b.O(sink, j10);
        } catch (EOFException e10) {
            sink.w0(this.f48405b);
            throw e10;
        }
    }

    @Override // r9.InterfaceC7107j
    public boolean P(long j10) {
        if (j10 < 0) {
            throw new IllegalArgumentException(("byteCount < 0: " + j10).toString());
        }
        if (this.f48406c) {
            throw new IllegalStateException("closed");
        }
        while (this.f48405b.size() < j10) {
            if (this.f48404a.s(this.f48405b, 8192L) == -1) {
                return false;
            }
        }
        return true;
    }

    @Override // r9.InterfaceC7107j
    public String U() {
        return A(Long.MAX_VALUE);
    }

    @Override // r9.InterfaceC7107j
    public int U0() throws EOFException {
        i0(4L);
        return this.f48405b.U0();
    }

    @Override // r9.InterfaceC7107j
    public String Y0() {
        this.f48405b.w0(this.f48404a);
        return this.f48405b.Y0();
    }

    @Override // r9.InterfaceC7107j
    public byte[] Z(long j10) throws EOFException {
        i0(j10);
        return this.f48405b.Z(j10);
    }

    public long a(byte b10) {
        return y(b10, 0L, Long.MAX_VALUE);
    }

    @Override // r9.InterfaceC7107j
    public short b0() throws EOFException {
        i0(2L);
        return this.f48405b.b0();
    }

    public boolean c(long j10, C7108k bytes, int i10, int i11) {
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        if (this.f48406c) {
            throw new IllegalStateException("closed");
        }
        if (j10 < 0 || i10 < 0 || i11 < 0 || bytes.E() - i10 < i11) {
            return false;
        }
        for (int i12 = 0; i12 < i11; i12++) {
            long j11 = ((long) i12) + j10;
            if (!P(1 + j11) || this.f48405b.V(j11) != bytes.i(i10 + i12)) {
                return false;
            }
        }
        return true;
    }

    @Override // r9.InterfaceC7107j
    public int c0(P options) throws EOFException {
        Intrinsics.checkNotNullParameter(options, "options");
        if (this.f48406c) {
            throw new IllegalStateException("closed");
        }
        do {
            int iE = s9.a.e(this.f48405b, options, true);
            if (iE != -2) {
                if (iE == -1) {
                    return -1;
                }
                this.f48405b.skip(options.j()[iE].E());
                return iE;
            }
        } while (this.f48404a.s(this.f48405b, 8192L) != -1);
        return -1;
    }

    @Override // r9.c0, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws EOFException {
        if (this.f48406c) {
            return;
        }
        this.f48406c = true;
        this.f48404a.close();
        this.f48405b.h();
    }

    @Override // r9.InterfaceC7107j
    public long d0() throws EOFException {
        i0(8L);
        return this.f48405b.d0();
    }

    @Override // r9.InterfaceC7107j
    public C7105h g() {
        return this.f48405b;
    }

    @Override // r9.c0
    public d0 i() {
        return this.f48404a.i();
    }

    @Override // r9.InterfaceC7107j
    public void i0(long j10) throws EOFException {
        if (!P(j10)) {
            throw new EOFException();
        }
    }

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
        return !this.f48406c;
    }

    @Override // r9.InterfaceC7107j
    public long j1() throws EOFException {
        i0(1L);
        int i10 = 0;
        while (true) {
            int i11 = i10 + 1;
            if (!P(i11)) {
                break;
            }
            byte bV = this.f48405b.V(i10);
            if ((bV < 48 || bV > 57) && ((bV < 97 || bV > 102) && (bV < 65 || bV > 70))) {
                if (i10 != 0) {
                    break;
                }
                StringBuilder sb = new StringBuilder();
                sb.append("Expected leading [0-9a-fA-F] character but was 0x");
                String string = Integer.toString(bV, CharsKt.checkRadix(16));
                Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                sb.append(string);
                throw new NumberFormatException(sb.toString());
            }
            i10 = i11;
        }
        return this.f48405b.j1();
    }

    @Override // r9.InterfaceC7107j
    public InputStream k1() {
        return new a();
    }

    @Override // r9.InterfaceC7107j
    public boolean m0(long j10, C7108k bytes) {
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        return c(j10, bytes, 0, bytes.E());
    }

    @Override // r9.InterfaceC7107j
    public String o0(long j10) throws EOFException {
        i0(j10);
        return this.f48405b.o0(j10);
    }

    @Override // r9.InterfaceC7107j
    public InterfaceC7107j peek() {
        return L.d(new U(this));
    }

    @Override // r9.InterfaceC7107j
    public C7108k q0(long j10) throws EOFException {
        i0(j10);
        return this.f48405b.q0(j10);
    }

    @Override // java.nio.channels.ReadableByteChannel
    public int read(ByteBuffer sink) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        if (this.f48405b.size() == 0 && this.f48404a.s(this.f48405b, 8192L) == -1) {
            return -1;
        }
        return this.f48405b.read(sink);
    }

    @Override // r9.InterfaceC7107j
    public byte readByte() throws EOFException {
        i0(1L);
        return this.f48405b.readByte();
    }

    @Override // r9.InterfaceC7107j
    public void readFully(byte[] sink) throws EOFException {
        Intrinsics.checkNotNullParameter(sink, "sink");
        try {
            i0(sink.length);
            this.f48405b.readFully(sink);
        } catch (EOFException e10) {
            int i10 = 0;
            while (this.f48405b.size() > 0) {
                C7105h c7105h = this.f48405b;
                int i11 = c7105h.read(sink, i10, (int) c7105h.size());
                if (i11 == -1) {
                    throw new AssertionError();
                }
                i10 += i11;
            }
            throw e10;
        }
    }

    @Override // r9.InterfaceC7107j
    public int readInt() throws EOFException {
        i0(4L);
        return this.f48405b.readInt();
    }

    @Override // r9.InterfaceC7107j
    public long readLong() throws EOFException {
        i0(8L);
        return this.f48405b.readLong();
    }

    @Override // r9.InterfaceC7107j
    public short readShort() throws EOFException {
        i0(2L);
        return this.f48405b.readShort();
    }

    @Override // r9.c0
    public long s(C7105h sink, long j10) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        if (j10 < 0) {
            throw new IllegalArgumentException(("byteCount < 0: " + j10).toString());
        }
        if (this.f48406c) {
            throw new IllegalStateException("closed");
        }
        if (this.f48405b.size() == 0) {
            if (j10 == 0) {
                return 0L;
            }
            if (this.f48404a.s(this.f48405b, 8192L) == -1) {
                return -1L;
            }
        }
        return this.f48405b.s(sink, Math.min(j10, this.f48405b.size()));
    }

    @Override // r9.InterfaceC7107j
    public long s0(a0 sink) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        long j10 = 0;
        while (this.f48404a.s(this.f48405b, 8192L) != -1) {
            long jW = this.f48405b.w();
            if (jW > 0) {
                j10 += jW;
                sink.W0(this.f48405b, jW);
            }
        }
        if (this.f48405b.size() <= 0) {
            return j10;
        }
        long size = j10 + this.f48405b.size();
        C7105h c7105h = this.f48405b;
        sink.W0(c7105h, c7105h.size());
        return size;
    }

    @Override // r9.InterfaceC7107j
    public void skip(long j10) throws EOFException {
        if (this.f48406c) {
            throw new IllegalStateException("closed");
        }
        while (j10 > 0) {
            if (this.f48405b.size() == 0 && this.f48404a.s(this.f48405b, 8192L) == -1) {
                throw new EOFException();
            }
            long jMin = Math.min(j10, this.f48405b.size());
            this.f48405b.skip(jMin);
            j10 -= jMin;
        }
    }

    public String toString() {
        return "buffer(" + this.f48404a + ')';
    }

    @Override // r9.InterfaceC7107j
    public byte[] u0() {
        this.f48405b.w0(this.f48404a);
        return this.f48405b.u0();
    }

    @Override // r9.InterfaceC7107j
    public boolean x0() {
        if (this.f48406c) {
            throw new IllegalStateException("closed");
        }
        return this.f48405b.x0() && this.f48404a.s(this.f48405b, 8192L) == -1;
    }

    @Override // r9.InterfaceC7107j
    public long y(byte b10, long j10, long j11) {
        if (this.f48406c) {
            throw new IllegalStateException("closed");
        }
        if (0 > j10 || j10 > j11) {
            throw new IllegalArgumentException(("fromIndex=" + j10 + " toIndex=" + j11).toString());
        }
        long jMax = j10;
        while (jMax < j11) {
            byte b11 = b10;
            long j12 = j11;
            long jY = this.f48405b.y(b11, jMax, j12);
            if (jY != -1) {
                return jY;
            }
            long size = this.f48405b.size();
            if (size >= j12 || this.f48404a.s(this.f48405b, 8192L) == -1) {
                break;
            }
            jMax = Math.max(jMax, size);
            b10 = b11;
            j11 = j12;
        }
        return -1L;
    }

    @Override // r9.InterfaceC7107j
    public long z0() throws EOFException {
        i0(1L);
        long j10 = 0;
        while (true) {
            long j11 = j10 + 1;
            if (!P(j11)) {
                break;
            }
            byte bV = this.f48405b.V(j10);
            if ((bV < 48 || bV > 57) && !(j10 == 0 && bV == 45)) {
                if (j10 != 0) {
                    break;
                }
                StringBuilder sb = new StringBuilder();
                sb.append("Expected a digit or '-' but was 0x");
                String string = Integer.toString(bV, CharsKt.checkRadix(16));
                Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                sb.append(string);
                throw new NumberFormatException(sb.toString());
            }
            j10 = j11;
        }
        return this.f48405b.z0();
    }

    public static final class a extends InputStream {
        a() {
        }

        @Override // java.io.InputStream
        public int available() throws IOException {
            W w10 = W.this;
            if (w10.f48406c) {
                throw new IOException("closed");
            }
            return (int) Math.min(w10.f48405b.size(), Api.BaseClientBuilder.API_PRIORITY_OTHER);
        }

        @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws EOFException {
            W.this.close();
        }

        @Override // java.io.InputStream
        public int read() throws IOException {
            W w10 = W.this;
            if (w10.f48406c) {
                throw new IOException("closed");
            }
            if (w10.f48405b.size() == 0) {
                W w11 = W.this;
                if (w11.f48404a.s(w11.f48405b, 8192L) == -1) {
                    return -1;
                }
            }
            return W.this.f48405b.readByte() & 255;
        }

        public String toString() {
            return W.this + ".inputStream()";
        }

        @Override // java.io.InputStream
        public int read(byte[] data, int i10, int i11) throws IOException {
            Intrinsics.checkNotNullParameter(data, "data");
            if (!W.this.f48406c) {
                AbstractC7102e.b(data.length, i10, i11);
                if (W.this.f48405b.size() == 0) {
                    W w10 = W.this;
                    if (w10.f48404a.s(w10.f48405b, 8192L) == -1) {
                        return -1;
                    }
                }
                return W.this.f48405b.read(data, i10, i11);
            }
            throw new IOException("closed");
        }
    }
}
