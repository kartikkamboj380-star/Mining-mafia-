package com.bytedance.sdk.component.oq.kq.oq;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
final class rjo extends fou {
    final transient byte[][] rjo;
    final transient int[] syt;

    rjo(kq kqVar, int i10) {
        super(null);
        dgq.kq(kqVar.oq, 0L, i10);
        csi csiVar = kqVar.kq;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        while (i12 < i10) {
            int i14 = csiVar.bob;
            int i15 = csiVar.oq;
            if (i14 == i15) {
                throw new AssertionError("s.limit == s.pos");
            }
            i12 += i14 - i15;
            i13++;
            csiVar = csiVar.rhi;
        }
        this.rjo = new byte[i13][];
        this.syt = new int[i13 * 2];
        csi csiVar2 = kqVar.kq;
        int i16 = 0;
        while (i11 < i10) {
            byte[][] bArr = this.rjo;
            bArr[i16] = csiVar2.kq;
            int i17 = csiVar2.bob;
            int i18 = csiVar2.oq;
            i11 += i17 - i18;
            if (i11 > i10) {
                i11 = i10;
            }
            int[] iArr = this.syt;
            iArr[i16] = i11;
            iArr[bArr.length + i16] = i18;
            csiVar2.fou = true;
            i16++;
            csiVar2 = csiVar2.rhi;
        }
    }

    private fou csi() {
        return new fou(fou());
    }

    @Override // com.bytedance.sdk.component.oq.kq.oq.fou
    public int bob() {
        return this.syt[this.rjo.length - 1];
    }

    @Override // com.bytedance.sdk.component.oq.kq.oq.fou
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof fou) {
            fou fouVar = (fou) obj;
            if (fouVar.bob() == bob() && kq(0, fouVar, 0, bob())) {
                return true;
            }
        }
        return false;
    }

    @Override // com.bytedance.sdk.component.oq.kq.oq.fou
    public byte[] fou() {
        int[] iArr = this.syt;
        byte[][] bArr = this.rjo;
        byte[] bArr2 = new byte[iArr[bArr.length - 1]];
        int length = bArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            int[] iArr2 = this.syt;
            int i12 = iArr2[length + i10];
            int i13 = iArr2[i10];
            System.arraycopy(this.rjo[i10], i12, bArr2, i11, i13 - i11);
            i10++;
            i11 = i13;
        }
        return bArr2;
    }

    @Override // com.bytedance.sdk.component.oq.kq.oq.fou
    public int hashCode() {
        int i10 = this.csi;
        if (i10 != 0) {
            return i10;
        }
        int length = this.rjo.length;
        int i11 = 0;
        int i12 = 1;
        int i13 = 0;
        while (i11 < length) {
            byte[] bArr = this.rjo[i11];
            int[] iArr = this.syt;
            int i14 = iArr[length + i11];
            int i15 = iArr[i11];
            int i16 = (i15 - i13) + i14;
            while (i14 < i16) {
                i12 = (i12 * 31) + bArr[i14];
                i14++;
            }
            i11++;
            i13 = i15;
        }
        this.csi = i12;
        return i12;
    }

    @Override // com.bytedance.sdk.component.oq.kq.oq.fou
    public String kq() {
        return csi().kq();
    }

    @Override // com.bytedance.sdk.component.oq.kq.oq.fou
    public String oq() {
        return csi().oq();
    }

    @Override // com.bytedance.sdk.component.oq.kq.oq.fou
    public String toString() {
        return csi().toString();
    }

    private int oq(int i10) {
        int iBinarySearch = Arrays.binarySearch(this.syt, 0, this.rjo.length, i10 + 1);
        return iBinarySearch >= 0 ? iBinarySearch : ~iBinarySearch;
    }

    @Override // com.bytedance.sdk.component.oq.kq.oq.fou
    public fou kq(int i10, int i11) {
        return csi().kq(i10, i11);
    }

    @Override // com.bytedance.sdk.component.oq.kq.oq.fou
    public byte kq(int i10) {
        dgq.kq(this.syt[this.rjo.length - 1], i10, 1L);
        int iOq = oq(i10);
        int i11 = iOq == 0 ? 0 : this.syt[iOq - 1];
        int[] iArr = this.syt;
        byte[][] bArr = this.rjo;
        return bArr[iOq][(i10 - i11) + iArr[bArr.length + iOq]];
    }

    @Override // com.bytedance.sdk.component.oq.kq.oq.fou
    public boolean kq(int i10, fou fouVar, int i11, int i12) {
        if (i10 < 0 || i10 > bob() - i12) {
            return false;
        }
        int iOq = oq(i10);
        while (i12 > 0) {
            int i13 = iOq == 0 ? 0 : this.syt[iOq - 1];
            int iMin = Math.min(i12, ((this.syt[iOq] - i13) + i13) - i10);
            int[] iArr = this.syt;
            byte[][] bArr = this.rjo;
            if (!fouVar.kq(i11, bArr[iOq], (i10 - i13) + iArr[bArr.length + iOq], iMin)) {
                return false;
            }
            i10 += iMin;
            i11 += iMin;
            i12 -= iMin;
            iOq++;
        }
        return true;
    }

    @Override // com.bytedance.sdk.component.oq.kq.oq.fou
    public boolean kq(int i10, byte[] bArr, int i11, int i12) {
        if (i10 < 0 || i10 > bob() - i12 || i11 < 0 || i11 > bArr.length - i12) {
            return false;
        }
        int iOq = oq(i10);
        while (i12 > 0) {
            int i13 = iOq == 0 ? 0 : this.syt[iOq - 1];
            int iMin = Math.min(i12, ((this.syt[iOq] - i13) + i13) - i10);
            int[] iArr = this.syt;
            byte[][] bArr2 = this.rjo;
            if (!dgq.kq(bArr2[iOq], (i10 - i13) + iArr[bArr2.length + iOq], bArr, i11, iMin)) {
                return false;
            }
            i10 += iMin;
            i11 += iMin;
            i12 -= iMin;
            iOq++;
        }
        return true;
    }
}
