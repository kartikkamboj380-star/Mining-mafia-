package p013b2;

import Y1.k;
import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes.dex */
public class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f11590a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final a f11591b;

    public l(a aVar) {
        this(aVar, 16384);
    }

    public long a(InputStream inputStream, OutputStream outputStream) {
        byte[] bArr = (byte[]) this.f11591b.get(this.f11590a);
        long j10 = 0;
        while (true) {
            try {
                int i10 = inputStream.read(bArr, 0, this.f11590a);
                if (i10 == -1) {
                    this.f11591b.a(bArr);
                    return j10;
                }
                outputStream.write(bArr, 0, i10);
                j10 += (long) i10;
            } catch (Throwable th) {
                this.f11591b.a(bArr);
                throw th;
            }
        }
    }

    public l(a aVar, int i10) {
        k.b(Boolean.valueOf(i10 > 0));
        this.f11590a = i10;
        this.f11591b = aVar;
    }
}
