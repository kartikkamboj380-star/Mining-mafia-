package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.security.MessageDigest;

/* JADX INFO: loaded from: classes2.dex */
final class Z7 implements Y7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final FileChannel f26117a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f26118b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f26119c;

    public Z7(FileChannel fileChannel, long j10, long j11) {
        this.f26117a = fileChannel;
        this.f26118b = j10;
        this.f26119c = j11;
    }

    @Override // com.google.android.gms.internal.ads.Y7
    public final void a(MessageDigest[] messageDigestArr, long j10, int i10) throws IOException {
        MappedByteBuffer map = this.f26117a.map(FileChannel.MapMode.READ_ONLY, this.f26118b + j10, i10);
        map.load();
        for (MessageDigest messageDigest : messageDigestArr) {
            map.position(0);
            messageDigest.update(map);
        }
    }

    @Override // com.google.android.gms.internal.ads.Y7
    public final long zza() {
        return this.f26119c;
    }
}
