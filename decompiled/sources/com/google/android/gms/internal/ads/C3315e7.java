package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.e7, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C3315e7 extends AbstractC5316u1 {
    public C3315e7(L90 l90, long j10, long j11) {
        super(new C4687p1(), new C3190d7(l90, null), j10, 0L, j10 + 1, 0L, j11, 188L, 1000);
    }

    static /* synthetic */ int h(byte[] bArr, int i10) {
        return (bArr[i10 + 3] & 255) | ((bArr[i10] & 255) << 24) | ((bArr[i10 + 1] & 255) << 16) | ((bArr[i10 + 2] & 255) << 8);
    }
}
