package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes2.dex */
final class F4 extends J4 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f36273d;

    F4(byte[] bArr, int i10, int i11) {
        super(bArr);
        K4.l(0, i11, bArr.length);
        this.f36273d = i11;
    }

    @Override // com.google.android.gms.internal.measurement.J4, com.google.android.gms.internal.measurement.K4
    public final byte a(int i10) {
        int i11 = this.f36273d;
        if (((i11 - (i10 + 1)) | i10) >= 0) {
            return this.f36311c[i10];
        }
        if (i10 < 0) {
            StringBuilder sb = new StringBuilder(String.valueOf(i10).length() + 11);
            sb.append("Index < 0: ");
            sb.append(i10);
            throw new ArrayIndexOutOfBoundsException(sb.toString());
        }
        StringBuilder sb2 = new StringBuilder(String.valueOf(i10).length() + 18 + String.valueOf(i11).length());
        sb2.append("Index > length: ");
        sb2.append(i10);
        sb2.append(", ");
        sb2.append(i11);
        throw new ArrayIndexOutOfBoundsException(sb2.toString());
    }

    @Override // com.google.android.gms.internal.measurement.J4, com.google.android.gms.internal.measurement.K4
    final byte b(int i10) {
        return this.f36311c[i10];
    }

    @Override // com.google.android.gms.internal.measurement.J4, com.google.android.gms.internal.measurement.K4
    public final int d() {
        return this.f36273d;
    }

    @Override // com.google.android.gms.internal.measurement.J4
    protected final int m() {
        return 0;
    }
}
