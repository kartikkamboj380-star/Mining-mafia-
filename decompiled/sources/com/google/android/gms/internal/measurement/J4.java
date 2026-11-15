package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes2.dex */
class J4 extends I4 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected final byte[] f36311c;

    J4(byte[] bArr) {
        super(null);
        bArr.getClass();
        this.f36311c = bArr;
    }

    @Override // com.google.android.gms.internal.measurement.K4
    public byte a(int i10) {
        return this.f36311c[i10];
    }

    @Override // com.google.android.gms.internal.measurement.K4
    byte b(int i10) {
        return this.f36311c[i10];
    }

    @Override // com.google.android.gms.internal.measurement.K4
    public int d() {
        return this.f36311c.length;
    }

    @Override // com.google.android.gms.internal.measurement.K4
    public final K4 e(int i10, int i11) {
        int iL = K4.l(0, i11, d());
        return iL == 0 ? K4.f36323b : new F4(this.f36311c, 0, iL);
    }

    @Override // com.google.android.gms.internal.measurement.K4
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof K4) || d() != ((K4) obj).d()) {
            return false;
        }
        if (d() == 0) {
            return true;
        }
        if (!(obj instanceof J4)) {
            return obj.equals(this);
        }
        J4 j10 = (J4) obj;
        int iK = k();
        int iK2 = j10.k();
        if (iK != 0 && iK2 != 0 && iK != iK2) {
            return false;
        }
        int iD = d();
        if (iD > j10.d()) {
            int iD2 = d();
            StringBuilder sb = new StringBuilder(String.valueOf(iD).length() + 18 + String.valueOf(iD2).length());
            sb.append("Length too large: ");
            sb.append(iD);
            sb.append(iD2);
            throw new IllegalArgumentException(sb.toString());
        }
        if (iD > j10.d()) {
            int iD3 = j10.d();
            StringBuilder sb2 = new StringBuilder(String.valueOf(iD).length() + 27 + String.valueOf(iD3).length());
            sb2.append("Ran off end of other: 0, ");
            sb2.append(iD);
            sb2.append(", ");
            sb2.append(iD3);
            throw new IllegalArgumentException(sb2.toString());
        }
        byte[] bArr = this.f36311c;
        byte[] bArr2 = j10.f36311c;
        j10.m();
        int i10 = 0;
        int i11 = 0;
        while (i10 < iD) {
            if (bArr[i10] != bArr2[i11]) {
                return false;
            }
            i10++;
            i11++;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.K4
    final void g(B4 b10) {
        ((N4) b10).F(this.f36311c, 0, d());
    }

    @Override // com.google.android.gms.internal.measurement.K4
    protected final int i(int i10, int i11, int i12) {
        return AbstractC6268m5.c(i10, this.f36311c, 0, i12);
    }

    protected int m() {
        return 0;
    }
}
