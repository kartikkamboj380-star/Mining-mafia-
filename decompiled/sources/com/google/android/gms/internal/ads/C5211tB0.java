package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.tB0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5211tB0 extends AbstractC5337uB0 {
    public C5211tB0(byte[] bArr, int i10) {
        super(bArr, i10);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC5337uB0
    public final int[] a(int[] iArr, int i10) {
        int length = iArr.length;
        if (length != 3) {
            throw new IllegalArgumentException(String.format("ChaCha20 uses 96-bit nonces, but got a %d-bit nonce", Integer.valueOf(length * 32)));
        }
        int[] iArr2 = new int[16];
        AbstractC5085sB0.a(iArr2, this.f33746a);
        iArr2[12] = i10;
        System.arraycopy(iArr, 0, iArr2, 13, 3);
        return iArr2;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC5337uB0
    public final int b() {
        return 12;
    }
}
