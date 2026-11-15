package r9;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class V implements InterfaceC7106i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a0 f48400a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C7105h f48401b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f48402c;

    public V(a0 sink) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        this.f48400a = sink;
        this.f48401b = new C7105h();
    }

    @Override // r9.InterfaceC7106i
    public InterfaceC7106i F(C7108k byteString) {
        Intrinsics.checkNotNullParameter(byteString, "byteString");
        if (this.f48402c) {
            throw new IllegalStateException("closed");
        }
        this.f48401b.F(byteString);
        return z();
    }

    @Override // r9.InterfaceC7106i
    public InterfaceC7106i I(String string) {
        Intrinsics.checkNotNullParameter(string, "string");
        if (this.f48402c) {
            throw new IllegalStateException("closed");
        }
        this.f48401b.I(string);
        return z();
    }

    @Override // r9.InterfaceC7106i
    public InterfaceC7106i N0(long j10) {
        if (this.f48402c) {
            throw new IllegalStateException("closed");
        }
        this.f48401b.N0(j10);
        return z();
    }

    @Override // r9.a0
    public void W0(C7105h source, long j10) {
        Intrinsics.checkNotNullParameter(source, "source");
        if (this.f48402c) {
            throw new IllegalStateException("closed");
        }
        this.f48401b.W0(source, j10);
        z();
    }

    @Override // r9.a0, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws Throwable {
        if (this.f48402c) {
            return;
        }
        if (this.f48401b.size() > 0) {
            a0 a0Var = this.f48400a;
            C7105h c7105h = this.f48401b;
            a0Var.W0(c7105h, c7105h.size());
        }
        th = null;
        try {
            this.f48400a.close();
        } catch (Throwable th) {
            if (th == null) {
                th = th;
            }
        }
        this.f48402c = true;
        if (th != null) {
            throw th;
        }
    }

    @Override // r9.InterfaceC7106i, r9.a0, java.io.Flushable
    public void flush() {
        if (this.f48402c) {
            throw new IllegalStateException("closed");
        }
        if (this.f48401b.size() > 0) {
            a0 a0Var = this.f48400a;
            C7105h c7105h = this.f48401b;
            a0Var.W0(c7105h, c7105h.size());
        }
        this.f48400a.flush();
    }

    @Override // r9.InterfaceC7106i
    public C7105h g() {
        return this.f48401b;
    }

    @Override // r9.InterfaceC7106i
    public OutputStream h1() {
        return new a();
    }

    @Override // r9.a0
    public d0 i() {
        return this.f48400a.i();
    }

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
        return !this.f48402c;
    }

    @Override // r9.InterfaceC7106i
    public InterfaceC7106i k0(long j10) {
        if (this.f48402c) {
            throw new IllegalStateException("closed");
        }
        this.f48401b.k0(j10);
        return z();
    }

    @Override // r9.InterfaceC7106i
    public InterfaceC7106i q() {
        if (this.f48402c) {
            throw new IllegalStateException("closed");
        }
        long size = this.f48401b.size();
        if (size > 0) {
            this.f48400a.W0(this.f48401b, size);
        }
        return this;
    }

    public String toString() {
        return "buffer(" + this.f48400a + ')';
    }

    @Override // r9.InterfaceC7106i
    public long w0(c0 source) {
        Intrinsics.checkNotNullParameter(source, "source");
        long j10 = 0;
        while (true) {
            long jS = source.s(this.f48401b, 8192L);
            if (jS == -1) {
                return j10;
            }
            j10 += jS;
            z();
        }
    }

    @Override // java.nio.channels.WritableByteChannel
    public int write(ByteBuffer source) {
        Intrinsics.checkNotNullParameter(source, "source");
        if (this.f48402c) {
            throw new IllegalStateException("closed");
        }
        int iWrite = this.f48401b.write(source);
        z();
        return iWrite;
    }

    @Override // r9.InterfaceC7106i
    public InterfaceC7106i writeByte(int i10) {
        if (this.f48402c) {
            throw new IllegalStateException("closed");
        }
        this.f48401b.writeByte(i10);
        return z();
    }

    @Override // r9.InterfaceC7106i
    public InterfaceC7106i writeInt(int i10) {
        if (this.f48402c) {
            throw new IllegalStateException("closed");
        }
        this.f48401b.writeInt(i10);
        return z();
    }

    @Override // r9.InterfaceC7106i
    public InterfaceC7106i writeShort(int i10) {
        if (this.f48402c) {
            throw new IllegalStateException("closed");
        }
        this.f48401b.writeShort(i10);
        return z();
    }

    @Override // r9.InterfaceC7106i
    public InterfaceC7106i z() {
        if (this.f48402c) {
            throw new IllegalStateException("closed");
        }
        long jW = this.f48401b.w();
        if (jW > 0) {
            this.f48400a.W0(this.f48401b, jW);
        }
        return this;
    }

    public static final class a extends OutputStream {
        a() {
        }

        @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws Throwable {
            V.this.close();
        }

        @Override // java.io.OutputStream, java.io.Flushable
        public void flush() {
            V v10 = V.this;
            if (v10.f48402c) {
                return;
            }
            v10.flush();
        }

        public String toString() {
            return V.this + ".outputStream()";
        }

        @Override // java.io.OutputStream
        public void write(int i10) throws IOException {
            V v10 = V.this;
            if (v10.f48402c) {
                throw new IOException("closed");
            }
            v10.f48401b.writeByte((byte) i10);
            V.this.z();
        }

        @Override // java.io.OutputStream
        public void write(byte[] data, int i10, int i11) throws IOException {
            Intrinsics.checkNotNullParameter(data, "data");
            V v10 = V.this;
            if (!v10.f48402c) {
                v10.f48401b.write(data, i10, i11);
                V.this.z();
                return;
            }
            throw new IOException("closed");
        }
    }

    @Override // r9.InterfaceC7106i
    public InterfaceC7106i write(byte[] source) {
        Intrinsics.checkNotNullParameter(source, "source");
        if (!this.f48402c) {
            this.f48401b.write(source);
            return z();
        }
        throw new IllegalStateException("closed");
    }

    @Override // r9.InterfaceC7106i
    public InterfaceC7106i write(byte[] source, int i10, int i11) {
        Intrinsics.checkNotNullParameter(source, "source");
        if (!this.f48402c) {
            this.f48401b.write(source, i10, i11);
            return z();
        }
        throw new IllegalStateException("closed");
    }
}
