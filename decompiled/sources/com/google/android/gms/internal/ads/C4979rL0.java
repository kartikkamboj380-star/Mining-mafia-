package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.util.Arrays;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.rL0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C4979rL0 extends AbstractC4854qL0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final byte[] f32880c;

    C4979rL0(byte[] bArr) {
        super(null);
        bArr.getClass();
        this.f32880c = bArr;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4854qL0
    final boolean E(AbstractC5231tL0 abstractC5231tL0, int i10, int i11) {
        if (i11 > abstractC5231tL0.j()) {
            byte[] bArr = this.f32880c;
            int length = String.valueOf(i11).length();
            int length2 = bArr.length;
            StringBuilder sb = new StringBuilder(length + 18 + String.valueOf(length2).length());
            sb.append("Length too large: ");
            sb.append(i11);
            sb.append(length2);
            throw new IllegalArgumentException(sb.toString());
        }
        int i12 = i10 + i11;
        if (i12 <= abstractC5231tL0.j()) {
            if (abstractC5231tL0 instanceof C4979rL0) {
                return AbstractC5231tL0.e(this.f32880c, 0, ((C4979rL0) abstractC5231tL0).f32880c, i10, i11);
            }
            if (!(abstractC5231tL0 instanceof C4476nL0)) {
                return abstractC5231tL0.k(i10, i12).equals(k(0, i11));
            }
            C4476nL0 c4476nL0 = (C4476nL0) abstractC5231tL0;
            return AbstractC5231tL0.e(this.f32880c, 0, c4476nL0.F(), c4476nL0.H() + i10, i11);
        }
        int iJ = abstractC5231tL0.j();
        int length3 = String.valueOf(i10).length();
        StringBuilder sb2 = new StringBuilder(length3 + 24 + String.valueOf(i11).length() + 2 + String.valueOf(iJ).length());
        sb2.append("Ran off end of other: ");
        sb2.append(i10);
        sb2.append(", ");
        sb2.append(i11);
        sb2.append(", ");
        sb2.append(iJ);
        throw new IllegalArgumentException(sb2.toString());
    }

    final /* synthetic */ byte[] F() {
        return this.f32880c;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC5231tL0
    public final byte g(int i10) {
        return this.f32880c[i10];
    }

    @Override // com.google.android.gms.internal.ads.AbstractC5231tL0
    final byte i(int i10) {
        return this.f32880c[i10];
    }

    @Override // com.google.android.gms.internal.ads.AbstractC5231tL0
    public final int j() {
        return this.f32880c.length;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC5231tL0
    public final AbstractC5231tL0 k(int i10, int i11) {
        byte[] bArr = this.f32880c;
        int iD = AbstractC5231tL0.d(i10, i11, bArr.length);
        return iD == 0 ? AbstractC5231tL0.f33386b : new C4476nL0(bArr, i10, iD);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC5231tL0
    protected final void l(byte[] bArr, int i10, int i11, int i12) {
        System.arraycopy(this.f32880c, i10, bArr, i11, i12);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC5231tL0
    public final ByteBuffer m() {
        return ByteBuffer.wrap(this.f32880c).asReadOnlyBuffer();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC5231tL0
    final void o(AbstractC4098kL0 abstractC4098kL0) {
        byte[] bArr = this.f32880c;
        abstractC4098kL0.a(bArr, 0, bArr.length);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC5231tL0
    protected final boolean p(AbstractC5231tL0 abstractC5231tL0) {
        if (abstractC5231tL0 instanceof C4979rL0) {
            return Arrays.equals(this.f32880c, ((C4979rL0) abstractC5231tL0).f32880c);
        }
        return abstractC5231tL0 instanceof C4476nL0 ? E(abstractC5231tL0, 0, this.f32880c.length) : abstractC5231tL0.p(this);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC5231tL0
    protected final int r(int i10, int i11, int i12) {
        return AbstractC3346eM0.c(i10, this.f32880c, i11, i12);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC5231tL0
    public final AbstractC5609wL0 s() {
        byte[] bArr = this.f32880c;
        return AbstractC5609wL0.e(bArr, 0, bArr.length, true);
    }
}
