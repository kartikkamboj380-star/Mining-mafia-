package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.jN0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
abstract class AbstractC3976jN0 {
    AbstractC3976jN0() {
    }

    protected static final int c(String str, byte[] bArr, int i10, int i11) {
        byte[] bytes = str.getBytes(AbstractC3346eM0.f27765a);
        int length = bytes.length;
        if (length - i10 > i11) {
            throw new ArrayIndexOutOfBoundsException("Not enough space in output buffer to encode UTF-8 string");
        }
        System.arraycopy(bytes, 0, bArr, i10, length);
        return i10 + length;
    }

    final boolean a(byte[] bArr, int i10, int i11) {
        return b(0, bArr, i10, i11) == 0;
    }

    protected abstract int b(int i10, byte[] bArr, int i11, int i12);
}
