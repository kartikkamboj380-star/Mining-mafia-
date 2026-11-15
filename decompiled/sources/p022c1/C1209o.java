package p022c1;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: renamed from: c1.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
final class C1209o extends InputStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InputStream f11781a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f11782b = 1073741824;

    public C1209o(InputStream inputStream) {
        this.f11781a = inputStream;
    }

    private final int a(int i10) {
        if (i10 == -1) {
            this.f11782b = 0;
        }
        return i10;
    }

    @Override // java.io.InputStream
    public int available() {
        return this.f11782b;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f11781a.close();
    }

    @Override // java.io.InputStream
    public int read() {
        return a(this.f11781a.read());
    }

    @Override // java.io.InputStream
    public long skip(long j10) {
        return this.f11781a.skip(j10);
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) {
        return a(this.f11781a.read(bArr));
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i10, int i11) {
        return a(this.f11781a.read(bArr, i10, i11));
    }
}
