package R2;

import android.util.Log;
import java.io.Closeable;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public class m implements w, Closeable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ByteBuffer f5150a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f5151b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f5152c = System.identityHashCode(this);

    public m(int i10) {
        this.f5150a = ByteBuffer.allocateDirect(i10);
        this.f5151b = i10;
    }

    private void c(int i10, w wVar, int i11, int i12) {
        if (!(wVar instanceof m)) {
            throw new IllegalArgumentException("Cannot copy two incompatible MemoryChunks");
        }
        Y1.k.i(!isClosed());
        Y1.k.i(!wVar.isClosed());
        Y1.k.g(this.f5150a);
        x.b(i10, wVar.a(), i11, i12, this.f5151b);
        this.f5150a.position(i10);
        ByteBuffer byteBuffer = (ByteBuffer) Y1.k.g(wVar.x());
        byteBuffer.position(i11);
        byte[] bArr = new byte[i12];
        this.f5150a.get(bArr, 0, i12);
        byteBuffer.put(bArr, 0, i12);
    }

    @Override // R2.w
    public long G() {
        throw new UnsupportedOperationException("Cannot get the pointer of a BufferMemoryChunk");
    }

    @Override // R2.w
    public int a() {
        return this.f5151b;
    }

    @Override // R2.w
    public synchronized int b(int i10, byte[] bArr, int i11, int i12) {
        int iA;
        Y1.k.g(bArr);
        Y1.k.i(!isClosed());
        Y1.k.g(this.f5150a);
        iA = x.a(i10, i12, this.f5151b);
        x.b(i10, bArr.length, i11, iA, this.f5151b);
        this.f5150a.position(i10);
        this.f5150a.get(bArr, i11, iA);
        return iA;
    }

    @Override // R2.w, java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        this.f5150a = null;
    }

    @Override // R2.w
    public synchronized boolean isClosed() {
        return this.f5150a == null;
    }

    @Override // R2.w
    public synchronized byte k(int i10) {
        boolean z9 = true;
        Y1.k.i(!isClosed());
        Y1.k.b(Boolean.valueOf(i10 >= 0));
        if (i10 >= this.f5151b) {
            z9 = false;
        }
        Y1.k.b(Boolean.valueOf(z9));
        Y1.k.g(this.f5150a);
        return this.f5150a.get(i10);
    }

    @Override // R2.w
    public long n() {
        return this.f5152c;
    }

    @Override // R2.w
    public synchronized int v(int i10, byte[] bArr, int i11, int i12) {
        int iA;
        Y1.k.g(bArr);
        Y1.k.i(!isClosed());
        Y1.k.g(this.f5150a);
        iA = x.a(i10, i12, this.f5151b);
        x.b(i10, bArr.length, i11, iA, this.f5151b);
        this.f5150a.position(i10);
        this.f5150a.put(bArr, i11, iA);
        return iA;
    }

    @Override // R2.w
    public void w(int i10, w wVar, int i11, int i12) {
        Y1.k.g(wVar);
        if (wVar.n() == n()) {
            Log.w("BufferMemoryChunk", "Copying from BufferMemoryChunk " + Long.toHexString(n()) + " to BufferMemoryChunk " + Long.toHexString(wVar.n()) + " which are the same ");
            Y1.k.b(Boolean.FALSE);
        }
        if (wVar.n() < n()) {
            synchronized (wVar) {
                synchronized (this) {
                    c(i10, wVar, i11, i12);
                }
            }
        } else {
            synchronized (this) {
                synchronized (wVar) {
                    c(i10, wVar, i11, i12);
                }
            }
        }
    }

    @Override // R2.w
    public synchronized ByteBuffer x() {
        return this.f5150a;
    }
}
