package com.google.android.gms.internal.auth;

import java.nio.charset.Charset;

/* JADX INFO: renamed from: com.google.android.gms.internal.auth.n0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
class C6108n0 extends AbstractC6105m0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected final byte[] f36126e;

    C6108n0(byte[] bArr) {
        bArr.getClass();
        this.f36126e = bArr;
    }

    @Override // com.google.android.gms.internal.auth.AbstractC6117q0
    public byte a(int i10) {
        return this.f36126e[i10];
    }

    @Override // com.google.android.gms.internal.auth.AbstractC6117q0
    byte b(int i10) {
        return this.f36126e[i10];
    }

    @Override // com.google.android.gms.internal.auth.AbstractC6117q0
    public int d() {
        return this.f36126e.length;
    }

    @Override // com.google.android.gms.internal.auth.AbstractC6117q0
    protected final int e(int i10, int i11, int i12) {
        return G0.b(i10, this.f36126e, 0, i12);
    }

    @Override // com.google.android.gms.internal.auth.AbstractC6117q0
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC6117q0) || d() != ((AbstractC6117q0) obj).d()) {
            return false;
        }
        if (d() == 0) {
            return true;
        }
        if (!(obj instanceof C6108n0)) {
            return obj.equals(this);
        }
        C6108n0 c6108n0 = (C6108n0) obj;
        int iL = l();
        int iL2 = c6108n0.l();
        if (iL != 0 && iL2 != 0 && iL != iL2) {
            return false;
        }
        int iD = d();
        if (iD > c6108n0.d()) {
            throw new IllegalArgumentException("Length too large: " + iD + d());
        }
        if (iD > c6108n0.d()) {
            throw new IllegalArgumentException("Ran off end of other: 0, " + iD + ", " + c6108n0.d());
        }
        byte[] bArr = this.f36126e;
        byte[] bArr2 = c6108n0.f36126e;
        c6108n0.p();
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

    @Override // com.google.android.gms.internal.auth.AbstractC6117q0
    public final AbstractC6117q0 g(int i10, int i11) {
        int iK = AbstractC6117q0.k(0, i11, d());
        return iK == 0 ? AbstractC6117q0.f36138b : new C6096j0(this.f36126e, 0, iK);
    }

    @Override // com.google.android.gms.internal.auth.AbstractC6117q0
    protected final String i(Charset charset) {
        return new String(this.f36126e, 0, d(), charset);
    }

    @Override // com.google.android.gms.internal.auth.AbstractC6117q0
    public final boolean j() {
        return E1.c(this.f36126e, 0, d());
    }

    protected int p() {
        return 0;
    }
}
