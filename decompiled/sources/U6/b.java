package U6;

import S6.h;
import X6.l;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes3.dex */
public final class b extends OutputStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final OutputStream f6051a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final l f6052b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    h f6053c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    long f6054d = -1;

    public b(OutputStream outputStream, h hVar, l lVar) {
        this.f6051a = outputStream;
        this.f6053c = hVar;
        this.f6052b = lVar;
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        long j10 = this.f6054d;
        if (j10 != -1) {
            this.f6053c.p(j10);
        }
        this.f6053c.t(this.f6052b.c());
        try {
            this.f6051a.close();
        } catch (IOException e10) {
            this.f6053c.u(this.f6052b.c());
            d.d(this.f6053c);
            throw e10;
        }
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public void flush() throws IOException {
        try {
            this.f6051a.flush();
        } catch (IOException e10) {
            this.f6053c.u(this.f6052b.c());
            d.d(this.f6053c);
            throw e10;
        }
    }

    @Override // java.io.OutputStream
    public void write(int i10) throws IOException {
        try {
            this.f6051a.write(i10);
            long j10 = this.f6054d + 1;
            this.f6054d = j10;
            this.f6053c.p(j10);
        } catch (IOException e10) {
            this.f6053c.u(this.f6052b.c());
            d.d(this.f6053c);
            throw e10;
        }
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr) throws IOException {
        try {
            this.f6051a.write(bArr);
            long length = this.f6054d + ((long) bArr.length);
            this.f6054d = length;
            this.f6053c.p(length);
        } catch (IOException e10) {
            this.f6053c.u(this.f6052b.c());
            d.d(this.f6053c);
            throw e10;
        }
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i10, int i11) throws IOException {
        try {
            this.f6051a.write(bArr, i10, i11);
            long j10 = this.f6054d + ((long) i11);
            this.f6054d = j10;
            this.f6053c.p(j10);
        } catch (IOException e10) {
            this.f6053c.u(this.f6052b.c());
            d.d(this.f6053c);
            throw e10;
        }
    }
}
