package com.facebook.imagepipeline.memory;

import R2.w;
import R2.x;
import Y1.k;
import android.util.Log;
import java.io.Closeable;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
@Y1.d
public class NativeMemoryChunk implements w, Closeable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f13932a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f13933b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f13934c;

    static {
        p035d4.a.d("imagepipeline");
    }

    public NativeMemoryChunk(int i10) {
        k.b(Boolean.valueOf(i10 > 0));
        this.f13933b = i10;
        this.f13932a = nativeAllocate(i10);
        this.f13934c = false;
    }

    private void c(int i10, w wVar, int i11, int i12) {
        if (!(wVar instanceof NativeMemoryChunk)) {
            throw new IllegalArgumentException("Cannot copy two incompatible MemoryChunks");
        }
        k.i(!isClosed());
        k.i(!wVar.isClosed());
        x.b(i10, wVar.a(), i11, i12, this.f13933b);
        nativeMemcpy(wVar.G() + ((long) i11), this.f13932a + ((long) i10), i12);
    }

    @Y1.d
    private static native long nativeAllocate(int i10);

    @Y1.d
    private static native void nativeCopyFromByteArray(long j10, byte[] bArr, int i10, int i11);

    @Y1.d
    private static native void nativeCopyToByteArray(long j10, byte[] bArr, int i10, int i11);

    @Y1.d
    private static native void nativeFree(long j10);

    @Y1.d
    private static native void nativeMemcpy(long j10, long j11, int i10);

    @Y1.d
    private static native byte nativeReadByte(long j10);

    @Override // R2.w
    public long G() {
        return this.f13932a;
    }

    @Override // R2.w
    public int a() {
        return this.f13933b;
    }

    @Override // R2.w
    public synchronized int b(int i10, byte[] bArr, int i11, int i12) {
        int iA;
        k.g(bArr);
        k.i(!isClosed());
        iA = x.a(i10, i12, this.f13933b);
        x.b(i10, bArr.length, i11, iA, this.f13933b);
        nativeCopyToByteArray(this.f13932a + ((long) i10), bArr, i11, iA);
        return iA;
    }

    @Override // R2.w, java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        if (!this.f13934c) {
            this.f13934c = true;
            nativeFree(this.f13932a);
        }
    }

    protected void finalize() throws Throwable {
        if (isClosed()) {
            return;
        }
        Log.w("NativeMemoryChunk", "finalize: Chunk " + Integer.toHexString(System.identityHashCode(this)) + " still active. ");
        try {
            close();
        } finally {
            super.finalize();
        }
    }

    @Override // R2.w
    public synchronized boolean isClosed() {
        return this.f13934c;
    }

    @Override // R2.w
    public synchronized byte k(int i10) {
        boolean z9 = true;
        k.i(!isClosed());
        k.b(Boolean.valueOf(i10 >= 0));
        if (i10 >= this.f13933b) {
            z9 = false;
        }
        k.b(Boolean.valueOf(z9));
        return nativeReadByte(this.f13932a + ((long) i10));
    }

    @Override // R2.w
    public long n() {
        return this.f13932a;
    }

    @Override // R2.w
    public synchronized int v(int i10, byte[] bArr, int i11, int i12) {
        int iA;
        k.g(bArr);
        k.i(!isClosed());
        iA = x.a(i10, i12, this.f13933b);
        x.b(i10, bArr.length, i11, iA, this.f13933b);
        nativeCopyFromByteArray(this.f13932a + ((long) i10), bArr, i11, iA);
        return iA;
    }

    @Override // R2.w
    public void w(int i10, w wVar, int i11, int i12) {
        k.g(wVar);
        if (wVar.n() == n()) {
            Log.w("NativeMemoryChunk", "Copying from NativeMemoryChunk " + Integer.toHexString(System.identityHashCode(this)) + " to NativeMemoryChunk " + Integer.toHexString(System.identityHashCode(wVar)) + " which share the same address " + Long.toHexString(this.f13932a));
            k.b(Boolean.FALSE);
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
        return null;
    }

    public NativeMemoryChunk() {
        this.f13933b = 0;
        this.f13932a = 0L;
        this.f13934c = true;
    }
}
