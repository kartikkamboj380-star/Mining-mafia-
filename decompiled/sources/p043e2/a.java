package p043e2;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes.dex */
public class a extends FilterInputStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f43262a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f43263b;

    public a(InputStream inputStream, int i10) {
        super(inputStream);
        inputStream.getClass();
        if (i10 < 0) {
            throw new IllegalArgumentException("limit must be >= 0");
        }
        this.f43262a = i10;
        this.f43263b = -1;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int available() {
        return Math.min(((FilterInputStream) this).in.available(), this.f43262a);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public void mark(int i10) {
        if (((FilterInputStream) this).in.markSupported()) {
            ((FilterInputStream) this).in.mark(i10);
            this.f43263b = this.f43262a;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read() throws IOException {
        if (this.f43262a == 0) {
            return -1;
        }
        int i10 = ((FilterInputStream) this).in.read();
        if (i10 != -1) {
            this.f43262a--;
        }
        return i10;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public void reset() throws IOException {
        if (!((FilterInputStream) this).in.markSupported()) {
            throw new IOException("mark is not supported");
        }
        if (this.f43263b == -1) {
            throw new IOException("mark not set");
        }
        ((FilterInputStream) this).in.reset();
        this.f43262a = this.f43263b;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public long skip(long j10) throws IOException {
        long jSkip = ((FilterInputStream) this).in.skip(Math.min(j10, this.f43262a));
        this.f43262a = (int) (((long) this.f43262a) - jSkip);
        return jSkip;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr, int i10, int i11) throws IOException {
        int i12 = this.f43262a;
        if (i12 == 0) {
            return -1;
        }
        int i13 = ((FilterInputStream) this).in.read(bArr, i10, Math.min(i11, i12));
        if (i13 > 0) {
            this.f43262a -= i13;
        }
        return i13;
    }
}
