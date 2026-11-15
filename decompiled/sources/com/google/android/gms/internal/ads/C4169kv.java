package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.kv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C4169kv implements SP0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ByteBuffer f30898a;

    C4169kv(ByteBuffer byteBuffer) {
        this.f30898a = byteBuffer.duplicate();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // com.google.android.gms.internal.ads.SP0
    public final ByteBuffer d(long j10, long j11) {
        ByteBuffer byteBuffer = this.f30898a;
        int iPosition = byteBuffer.position();
        byteBuffer.position((int) j10);
        ByteBuffer byteBufferSlice = byteBuffer.slice();
        byteBufferSlice.limit((int) j11);
        byteBuffer.position(iPosition);
        return byteBufferSlice;
    }

    @Override // com.google.android.gms.internal.ads.SP0
    public final int d1(ByteBuffer byteBuffer) {
        ByteBuffer byteBuffer2 = this.f30898a;
        if (byteBuffer2.remaining() == 0 && byteBuffer.remaining() > 0) {
            return -1;
        }
        int iMin = Math.min(byteBuffer.remaining(), byteBuffer2.remaining());
        byte[] bArr = new byte[iMin];
        byteBuffer2.get(bArr);
        byteBuffer.put(bArr);
        return iMin;
    }

    @Override // com.google.android.gms.internal.ads.SP0
    public final void f(long j10) {
        this.f30898a.position((int) j10);
    }

    @Override // com.google.android.gms.internal.ads.SP0
    public final long zzb() {
        return this.f30898a.limit();
    }

    @Override // com.google.android.gms.internal.ads.SP0
    public final long zzc() {
        return this.f30898a.position();
    }
}
