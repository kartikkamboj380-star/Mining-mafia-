package p013b2;

import Y1.k;
import Z1.a;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes.dex */
public class g extends InputStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InputStream f11581a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final byte[] f11582b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final p023c2.g f11583c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f11584d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f11585e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f11586f = false;

    public g(InputStream inputStream, byte[] bArr, p023c2.g gVar) {
        this.f11581a = (InputStream) k.g(inputStream);
        this.f11582b = (byte[]) k.g(bArr);
        this.f11583c = (p023c2.g) k.g(gVar);
    }

    private boolean a() throws IOException {
        if (this.f11585e < this.f11584d) {
            return true;
        }
        int i10 = this.f11581a.read(this.f11582b);
        if (i10 <= 0) {
            return false;
        }
        this.f11584d = i10;
        this.f11585e = 0;
        return true;
    }

    private void c() throws IOException {
        if (this.f11586f) {
            throw new IOException("stream already closed");
        }
    }

    @Override // java.io.InputStream
    public int available() throws IOException {
        k.i(this.f11585e <= this.f11584d);
        c();
        return (this.f11584d - this.f11585e) + this.f11581a.available();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (this.f11586f) {
            return;
        }
        this.f11586f = true;
        this.f11583c.a(this.f11582b);
        super.close();
    }

    protected void finalize() throws Throwable {
        if (!this.f11586f) {
            a.m("PooledByteInputStream", "Finalized without closing");
            close();
        }
        super.finalize();
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        k.i(this.f11585e <= this.f11584d);
        c();
        if (!a()) {
            return -1;
        }
        byte[] bArr = this.f11582b;
        int i10 = this.f11585e;
        this.f11585e = i10 + 1;
        return bArr[i10] & 255;
    }

    @Override // java.io.InputStream
    public long skip(long j10) throws IOException {
        k.i(this.f11585e <= this.f11584d);
        c();
        int i10 = this.f11584d;
        int i11 = this.f11585e;
        long j11 = i10 - i11;
        if (j11 >= j10) {
            this.f11585e = (int) (((long) i11) + j10);
            return j10;
        }
        this.f11585e = i10;
        return j11 + this.f11581a.skip(j10 - j11);
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i10, int i11) throws IOException {
        k.i(this.f11585e <= this.f11584d);
        c();
        if (!a()) {
            return -1;
        }
        int iMin = Math.min(this.f11584d - this.f11585e, i11);
        System.arraycopy(this.f11582b, this.f11585e, bArr, i10, iMin);
        this.f11585e += iMin;
        return iMin;
    }
}
