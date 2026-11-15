package U6;

import S6.h;
import X6.l;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends InputStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InputStream f6045a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final h f6046b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final l f6047c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f6049e;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f6048d = -1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long f6050f = -1;

    public a(InputStream inputStream, h hVar, l lVar) {
        this.f6047c = lVar;
        this.f6045a = inputStream;
        this.f6046b = hVar;
        this.f6049e = hVar.e();
    }

    private void a(long j10) {
        long j11 = this.f6048d;
        if (j11 == -1) {
            this.f6048d = j10;
        } else {
            this.f6048d = j11 + j10;
        }
    }

    @Override // java.io.InputStream
    public int available() throws IOException {
        try {
            return this.f6045a.available();
        } catch (IOException e10) {
            this.f6046b.u(this.f6047c.c());
            d.d(this.f6046b);
            throw e10;
        }
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        long jC = this.f6047c.c();
        if (this.f6050f == -1) {
            this.f6050f = jC;
        }
        try {
            this.f6045a.close();
            long j10 = this.f6048d;
            if (j10 != -1) {
                this.f6046b.s(j10);
            }
            long j11 = this.f6049e;
            if (j11 != -1) {
                this.f6046b.v(j11);
            }
            this.f6046b.u(this.f6050f);
            this.f6046b.b();
        } catch (IOException e10) {
            this.f6046b.u(this.f6047c.c());
            d.d(this.f6046b);
            throw e10;
        }
    }

    @Override // java.io.InputStream
    public void mark(int i10) {
        this.f6045a.mark(i10);
    }

    @Override // java.io.InputStream
    public boolean markSupported() {
        return this.f6045a.markSupported();
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        try {
            int i10 = this.f6045a.read();
            long jC = this.f6047c.c();
            if (this.f6049e == -1) {
                this.f6049e = jC;
            }
            if (i10 != -1 || this.f6050f != -1) {
                a(1L);
                this.f6046b.s(this.f6048d);
                return i10;
            }
            this.f6050f = jC;
            this.f6046b.u(jC);
            this.f6046b.b();
            return i10;
        } catch (IOException e10) {
            this.f6046b.u(this.f6047c.c());
            d.d(this.f6046b);
            throw e10;
        }
    }

    @Override // java.io.InputStream
    public void reset() throws IOException {
        try {
            this.f6045a.reset();
        } catch (IOException e10) {
            this.f6046b.u(this.f6047c.c());
            d.d(this.f6046b);
            throw e10;
        }
    }

    @Override // java.io.InputStream
    public long skip(long j10) throws IOException {
        try {
            long jSkip = this.f6045a.skip(j10);
            long jC = this.f6047c.c();
            if (this.f6049e == -1) {
                this.f6049e = jC;
            }
            if (jSkip == 0 && j10 != 0 && this.f6050f == -1) {
                this.f6050f = jC;
                this.f6046b.u(jC);
                return jSkip;
            }
            a(jSkip);
            this.f6046b.s(this.f6048d);
            return jSkip;
        } catch (IOException e10) {
            this.f6046b.u(this.f6047c.c());
            d.d(this.f6046b);
            throw e10;
        }
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i10, int i11) throws IOException {
        try {
            int i12 = this.f6045a.read(bArr, i10, i11);
            long jC = this.f6047c.c();
            if (this.f6049e == -1) {
                this.f6049e = jC;
            }
            if (i12 == -1 && this.f6050f == -1) {
                this.f6050f = jC;
                this.f6046b.u(jC);
                this.f6046b.b();
                return i12;
            }
            a(i12);
            this.f6046b.s(this.f6048d);
            return i12;
        } catch (IOException e10) {
            this.f6046b.u(this.f6047c.c());
            d.d(this.f6046b);
            throw e10;
        }
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) throws IOException {
        try {
            int i10 = this.f6045a.read(bArr);
            long jC = this.f6047c.c();
            if (this.f6049e == -1) {
                this.f6049e = jC;
            }
            if (i10 == -1 && this.f6050f == -1) {
                this.f6050f = jC;
                this.f6046b.u(jC);
                this.f6046b.b();
                return i10;
            }
            a(i10);
            this.f6046b.s(this.f6048d);
            return i10;
        } catch (IOException e10) {
            this.f6046b.u(this.f6047c.c());
            d.d(this.f6046b);
            throw e10;
        }
    }
}
