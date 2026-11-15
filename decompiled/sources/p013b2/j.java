package p013b2;

import Y1.k;
import java.io.InputStream;

/* JADX INFO: loaded from: classes.dex */
public class j extends InputStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final h f11587a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f11588b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    int f11589c;

    public j(h hVar) {
        k.b(Boolean.valueOf(!hVar.isClosed()));
        this.f11587a = (h) k.g(hVar);
        this.f11588b = 0;
        this.f11589c = 0;
    }

    @Override // java.io.InputStream
    public int available() {
        return this.f11587a.size() - this.f11588b;
    }

    @Override // java.io.InputStream
    public void mark(int i10) {
        this.f11589c = this.f11588b;
    }

    @Override // java.io.InputStream
    public boolean markSupported() {
        return true;
    }

    @Override // java.io.InputStream
    public int read() {
        if (available() <= 0) {
            return -1;
        }
        h hVar = this.f11587a;
        int i10 = this.f11588b;
        this.f11588b = i10 + 1;
        return hVar.k(i10) & 255;
    }

    @Override // java.io.InputStream
    public void reset() {
        this.f11588b = this.f11589c;
    }

    @Override // java.io.InputStream
    public long skip(long j10) {
        k.b(Boolean.valueOf(j10 >= 0));
        int iMin = Math.min((int) j10, available());
        this.f11588b += iMin;
        return iMin;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i10, int i11) {
        if (i10 >= 0 && i11 >= 0 && i10 + i11 <= bArr.length) {
            int iAvailable = available();
            if (iAvailable <= 0) {
                return -1;
            }
            if (i11 <= 0) {
                return 0;
            }
            int iMin = Math.min(iAvailable, i11);
            this.f11587a.b(this.f11588b, bArr, i10, iMin);
            this.f11588b += iMin;
            return iMin;
        }
        throw new ArrayIndexOutOfBoundsException("length=" + bArr.length + "; regionStart=" + i10 + "; regionLength=" + i11);
    }
}
