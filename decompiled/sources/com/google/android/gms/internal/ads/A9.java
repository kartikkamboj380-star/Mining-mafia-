package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class A9 implements InterfaceC5962z9 {
    @Override // com.google.android.gms.internal.ads.InterfaceC5962z9
    public final byte a(M9 m10, int i10) {
        return m10.b(i10);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5962z9
    public final M9 b(M9 m10, int i10, int i11) {
        byte[] bArr;
        int length;
        if (i10 < 0 || i10 > i11 || i11 > (length = (bArr = m10.f20778a).length) || i10 > i11 || i11 > length) {
            throw new IndexOutOfBoundsException();
        }
        return new M9(M9.h(bArr, i10, i11 - i10));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5962z9
    public final InterfaceC5962z9 zzc() {
        return new A9();
    }
}
