package com.google.android.gms.internal.play_billing;

/* JADX INFO: loaded from: classes2.dex */
final class J extends N {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f37091f;

    J(byte[] bArr, int i10, int i11) {
        super(bArr);
        Q.l(0, i11, bArr.length);
        this.f37091f = i11;
    }

    @Override // com.google.android.gms.internal.play_billing.N, com.google.android.gms.internal.play_billing.Q
    public final byte a(int i10) {
        int i11 = this.f37091f;
        if (((i11 - (i10 + 1)) | i10) >= 0) {
            return this.f37097e[i10];
        }
        if (i10 < 0) {
            throw new ArrayIndexOutOfBoundsException("Index < 0: " + i10);
        }
        throw new ArrayIndexOutOfBoundsException("Index > length: " + i10 + ", " + i11);
    }

    @Override // com.google.android.gms.internal.play_billing.N, com.google.android.gms.internal.play_billing.Q
    final byte b(int i10) {
        return this.f37097e[i10];
    }

    @Override // com.google.android.gms.internal.play_billing.N, com.google.android.gms.internal.play_billing.Q
    public final int d() {
        return this.f37091f;
    }

    @Override // com.google.android.gms.internal.play_billing.N
    protected final int q() {
        return 0;
    }
}
