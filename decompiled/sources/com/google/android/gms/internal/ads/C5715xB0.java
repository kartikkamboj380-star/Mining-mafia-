package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.xB0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5715xB0 extends AbstractC5337uB0 {
    public C5715xB0(byte[] bArr, int i10) {
        super(bArr, i10);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC5337uB0
    final int[] a(int[] iArr, int i10) {
        int length = iArr.length;
        if (length != 6) {
            throw new IllegalArgumentException(String.format("XChaCha20 uses 192-bit nonces, but got a %d-bit nonce", Integer.valueOf(length * 32)));
        }
        int[] iArr2 = new int[16];
        AbstractC5085sB0.a(iArr2, AbstractC5085sB0.e(this.f33746a, iArr));
        iArr2[12] = i10;
        iArr2[13] = 0;
        iArr2[14] = iArr[4];
        iArr2[15] = iArr[5];
        return iArr2;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC5337uB0
    final int b() {
        return 24;
    }
}
