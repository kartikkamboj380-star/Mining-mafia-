package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.security.MessageDigest;

/* JADX INFO: loaded from: classes2.dex */
final class X7 implements Y7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ByteBuffer f25149a;

    public X7(ByteBuffer byteBuffer) {
        this.f25149a = byteBuffer.slice();
    }

    @Override // com.google.android.gms.internal.ads.Y7
    public final void a(MessageDigest[] messageDigestArr, long j10, int i10) {
        ByteBuffer byteBufferSlice;
        ByteBuffer byteBuffer = this.f25149a;
        synchronized (byteBuffer) {
            int i11 = (int) j10;
            byteBuffer.position(i11);
            byteBuffer.limit(i11 + i10);
            byteBufferSlice = byteBuffer.slice();
        }
        for (MessageDigest messageDigest : messageDigestArr) {
            byteBufferSlice.position(0);
            messageDigest.update(byteBufferSlice);
        }
    }

    @Override // com.google.android.gms.internal.ads.Y7
    public final long zza() {
        return this.f25149a.capacity();
    }
}
