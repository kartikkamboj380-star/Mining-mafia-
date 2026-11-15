package R2;

import android.os.SharedMemory;
import android.system.ErrnoException;
import android.util.Log;
import java.io.Closeable;
import java.nio.ByteBuffer;

/* JADX INFO: renamed from: R2.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0956f implements w, Closeable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private SharedMemory f5129a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ByteBuffer f5130b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f5131c;

    public C0956f(int i10) {
        Y1.k.b(Boolean.valueOf(i10 > 0));
        try {
            SharedMemory sharedMemoryCreate = SharedMemory.create("AshmemMemoryChunk", i10);
            this.f5129a = sharedMemoryCreate;
            this.f5130b = sharedMemoryCreate.mapReadWrite();
            this.f5131c = System.identityHashCode(this);
        } catch (ErrnoException e10) {
            throw new RuntimeException("Fail to create AshmemMemory", e10);
        }
    }

    private void c(int i10, w wVar, int i11, int i12) {
        if (!(wVar instanceof C0956f)) {
            throw new IllegalArgumentException("Cannot copy two incompatible MemoryChunks");
        }
        Y1.k.i(!isClosed());
        Y1.k.i(!wVar.isClosed());
        Y1.k.g(this.f5130b);
        Y1.k.g(wVar.x());
        x.b(i10, wVar.a(), i11, i12, a());
        this.f5130b.position(i10);
        wVar.x().position(i11);
        byte[] bArr = new byte[i12];
        this.f5130b.get(bArr, 0, i12);
        wVar.x().put(bArr, 0, i12);
    }

    @Override // R2.w
    public long G() {
        throw new UnsupportedOperationException("Cannot get the pointer of an  AshmemMemoryChunk");
    }

    @Override // R2.w
    public int a() {
        Y1.k.g(this.f5129a);
        return this.f5129a.getSize();
    }

    @Override // R2.w
    public synchronized int b(int i10, byte[] bArr, int i11, int i12) {
        int iA;
        Y1.k.g(bArr);
        Y1.k.g(this.f5130b);
        iA = x.a(i10, i12, a());
        x.b(i10, bArr.length, i11, iA, a());
        this.f5130b.position(i10);
        this.f5130b.get(bArr, i11, iA);
        return iA;
    }

    @Override // R2.w, java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        try {
            if (!isClosed()) {
                SharedMemory sharedMemory = this.f5129a;
                if (sharedMemory != null) {
                    sharedMemory.close();
                }
                ByteBuffer byteBuffer = this.f5130b;
                if (byteBuffer != null) {
                    SharedMemory.unmap(byteBuffer);
                }
                this.f5130b = null;
                this.f5129a = null;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // R2.w
    public synchronized boolean isClosed() {
        return this.f5130b == null || this.f5129a == null;
    }

    @Override // R2.w
    public synchronized byte k(int i10) {
        boolean z9 = true;
        Y1.k.i(!isClosed());
        Y1.k.b(Boolean.valueOf(i10 >= 0));
        if (i10 >= a()) {
            z9 = false;
        }
        Y1.k.b(Boolean.valueOf(z9));
        Y1.k.g(this.f5130b);
        return this.f5130b.get(i10);
    }

    @Override // R2.w
    public long n() {
        return this.f5131c;
    }

    @Override // R2.w
    public synchronized int v(int i10, byte[] bArr, int i11, int i12) {
        int iA;
        Y1.k.g(bArr);
        Y1.k.g(this.f5130b);
        iA = x.a(i10, i12, a());
        x.b(i10, bArr.length, i11, iA, a());
        this.f5130b.position(i10);
        this.f5130b.put(bArr, i11, iA);
        return iA;
    }

    @Override // R2.w
    public void w(int i10, w wVar, int i11, int i12) {
        Y1.k.g(wVar);
        if (wVar.n() == n()) {
            Log.w("AshmemMemoryChunk", "Copying from AshmemMemoryChunk " + Long.toHexString(n()) + " to AshmemMemoryChunk " + Long.toHexString(wVar.n()) + " which are the same ");
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
    public ByteBuffer x() {
        return this.f5130b;
    }
}
