package com.google.android.gms.internal.play_billing;

import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes2.dex */
class N extends M {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected final byte[] f37097e;

    N(byte[] bArr) {
        super(null);
        bArr.getClass();
        this.f37097e = bArr;
    }

    @Override // com.google.android.gms.internal.play_billing.Q
    public byte a(int i10) {
        return this.f37097e[i10];
    }

    @Override // com.google.android.gms.internal.play_billing.Q
    byte b(int i10) {
        return this.f37097e[i10];
    }

    @Override // com.google.android.gms.internal.play_billing.Q
    public int d() {
        return this.f37097e.length;
    }

    @Override // com.google.android.gms.internal.play_billing.Q
    protected final int e(int i10, int i11, int i12) {
        return AbstractC6480y0.b(i10, this.f37097e, 0, i12);
    }

    @Override // com.google.android.gms.internal.play_billing.Q
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Q) || d() != ((Q) obj).d()) {
            return false;
        }
        if (d() == 0) {
            return true;
        }
        if (!(obj instanceof N)) {
            return obj.equals(this);
        }
        N n10 = (N) obj;
        int iM = m();
        int iM2 = n10.m();
        if (iM != 0 && iM2 != 0 && iM != iM2) {
            return false;
        }
        int iD = d();
        if (iD > n10.d()) {
            throw new IllegalArgumentException("Length too large: " + iD + d());
        }
        if (iD > n10.d()) {
            throw new IllegalArgumentException("Ran off end of other: 0, " + iD + ", " + n10.d());
        }
        byte[] bArr = this.f37097e;
        byte[] bArr2 = n10.f37097e;
        n10.q();
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

    @Override // com.google.android.gms.internal.play_billing.Q
    public final Q g(int i10, int i11) {
        int iL = Q.l(0, i11, d());
        return iL == 0 ? Q.f37133b : new J(this.f37097e, 0, iL);
    }

    @Override // com.google.android.gms.internal.play_billing.Q
    protected final String i(Charset charset) {
        return new String(this.f37097e, 0, d(), charset);
    }

    @Override // com.google.android.gms.internal.play_billing.Q
    final void j(F f10) {
        ((W) f10).A(this.f37097e, 0, d());
    }

    @Override // com.google.android.gms.internal.play_billing.Q
    public final boolean k() {
        return M1.e(this.f37097e, 0, d());
    }

    protected int q() {
        return 0;
    }
}
