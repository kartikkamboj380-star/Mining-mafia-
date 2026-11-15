package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.nL0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C4476nL0 extends AbstractC4854qL0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final byte[] f31777c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f31778d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f31779e;

    C4476nL0(byte[] bArr, int i10, int i11) {
        super(null);
        AbstractC5231tL0.d(i10, i10 + i11, bArr.length);
        this.f31777c = bArr;
        this.f31778d = i10;
        this.f31779e = i11;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4854qL0
    final boolean E(AbstractC5231tL0 abstractC5231tL0, int i10, int i11) {
        if (i11 > abstractC5231tL0.j()) {
            int i12 = this.f31779e;
            StringBuilder sb = new StringBuilder(String.valueOf(i11).length() + 18 + String.valueOf(i12).length());
            sb.append("Length too large: ");
            sb.append(i11);
            sb.append(i12);
            throw new IllegalArgumentException(sb.toString());
        }
        int i13 = i10 + i11;
        if (i13 <= abstractC5231tL0.j()) {
            if (abstractC5231tL0 instanceof C4979rL0) {
                return AbstractC5231tL0.e(this.f31777c, this.f31778d, ((C4979rL0) abstractC5231tL0).F(), i10, i11);
            }
            if (abstractC5231tL0 instanceof C4476nL0) {
                C4476nL0 c4476nL0 = (C4476nL0) abstractC5231tL0;
                return AbstractC5231tL0.e(this.f31777c, this.f31778d, c4476nL0.f31777c, c4476nL0.f31778d + i10, i11);
            }
            AbstractC5231tL0 abstractC5231tL0K = abstractC5231tL0.k(i10, i13);
            int i14 = this.f31778d;
            return abstractC5231tL0K.equals(k(i14, i11 + i14));
        }
        int iJ = abstractC5231tL0.j();
        int length = String.valueOf(i10).length();
        StringBuilder sb2 = new StringBuilder(length + 24 + String.valueOf(i11).length() + 2 + String.valueOf(iJ).length());
        sb2.append("Ran off end of other: ");
        sb2.append(i10);
        sb2.append(", ");
        sb2.append(i11);
        sb2.append(", ");
        sb2.append(iJ);
        throw new IllegalArgumentException(sb2.toString());
    }

    final /* synthetic */ byte[] F() {
        return this.f31777c;
    }

    final /* synthetic */ int H() {
        return this.f31778d;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC5231tL0
    public final byte g(int i10) {
        AbstractC5231tL0.b(i10, this.f31779e);
        return this.f31777c[this.f31778d + i10];
    }

    @Override // com.google.android.gms.internal.ads.AbstractC5231tL0
    final byte i(int i10) {
        return this.f31777c[this.f31778d + i10];
    }

    @Override // com.google.android.gms.internal.ads.AbstractC5231tL0
    public final int j() {
        return this.f31779e;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC5231tL0
    public final AbstractC5231tL0 k(int i10, int i11) {
        int iD = AbstractC5231tL0.d(i10, i11, this.f31779e);
        return iD == 0 ? AbstractC5231tL0.f33386b : new C4476nL0(this.f31777c, this.f31778d + i10, iD);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC5231tL0
    protected final void l(byte[] bArr, int i10, int i11, int i12) {
        System.arraycopy(this.f31777c, this.f31778d + i10, bArr, i11, i12);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC5231tL0
    public final ByteBuffer m() {
        return ByteBuffer.wrap(this.f31777c, this.f31778d, this.f31779e).asReadOnlyBuffer();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC5231tL0
    final void o(AbstractC4098kL0 abstractC4098kL0) {
        abstractC4098kL0.a(this.f31777c, this.f31778d, this.f31779e);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC5231tL0
    protected final boolean p(AbstractC5231tL0 abstractC5231tL0) {
        return ((abstractC5231tL0 instanceof C4979rL0) || (abstractC5231tL0 instanceof C4476nL0)) ? E(abstractC5231tL0, 0, this.f31779e) : abstractC5231tL0.p(this);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC5231tL0
    protected final int r(int i10, int i11, int i12) {
        return AbstractC3346eM0.c(i10, this.f31777c, this.f31778d + i11, i12);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC5231tL0
    public final AbstractC5609wL0 s() {
        return AbstractC5609wL0.e(this.f31777c, this.f31778d, this.f31779e, true);
    }
}
