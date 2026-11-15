package com.bytedance.adsdk.oq.bob.oq;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public class fou {
    private final float[] kq;
    private final int[] oq;

    public fou(float[] fArr, int[] iArr) {
        this.kq = fArr;
        this.oq = iArr;
    }

    public int bob() {
        return this.oq.length;
    }

    public float[] kq() {
        return this.kq;
    }

    public int[] oq() {
        return this.oq;
    }

    public void kq(fou fouVar, fou fouVar2, float f10) {
        if (fouVar.oq.length == fouVar2.oq.length) {
            for (int i10 = 0; i10 < fouVar.oq.length; i10++) {
                this.kq[i10] = com.bytedance.adsdk.oq.rhi.csi.kq(fouVar.kq[i10], fouVar2.kq[i10], f10);
                this.oq[i10] = com.bytedance.adsdk.oq.rhi.oq.kq(f10, fouVar.oq[i10], fouVar2.oq[i10]);
            }
            return;
        }
        throw new IllegalArgumentException("Cannot interpolate between gradients. Lengths vary (" + fouVar.oq.length + " vs " + fouVar2.oq.length + ")");
    }

    public fou kq(float[] fArr) {
        int[] iArr = new int[fArr.length];
        for (int i10 = 0; i10 < fArr.length; i10++) {
            iArr[i10] = kq(fArr[i10]);
        }
        return new fou(fArr, iArr);
    }

    private int kq(float f10) {
        int iBinarySearch = Arrays.binarySearch(this.kq, f10);
        if (iBinarySearch >= 0) {
            return this.oq[iBinarySearch];
        }
        int i10 = -(iBinarySearch + 1);
        if (i10 == 0) {
            return this.oq[0];
        }
        int[] iArr = this.oq;
        if (i10 == iArr.length - 1) {
            return iArr[iArr.length - 1];
        }
        float[] fArr = this.kq;
        int i11 = i10 - 1;
        float f11 = fArr[i11];
        return com.bytedance.adsdk.oq.rhi.oq.kq((f10 - f11) / (fArr[i10] - f11), iArr[i11], iArr[i10]);
    }
}
