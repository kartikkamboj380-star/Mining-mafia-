package com.bytedance.adsdk.oq.bob.kq;

import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class bob extends suf<com.bytedance.adsdk.oq.bob.oq.fou, com.bytedance.adsdk.oq.bob.oq.fou> {
    public bob(List<com.bytedance.adsdk.oq.rjo.kq<com.bytedance.adsdk.oq.bob.oq.fou>> list) {
        super(kq(list));
    }

    private static List<com.bytedance.adsdk.oq.rjo.kq<com.bytedance.adsdk.oq.bob.oq.fou>> kq(List<com.bytedance.adsdk.oq.rjo.kq<com.bytedance.adsdk.oq.bob.oq.fou>> list) {
        for (int i10 = 0; i10 < list.size(); i10++) {
            list.set(i10, kq(list.get(i10)));
        }
        return list;
    }

    @Override // com.bytedance.adsdk.oq.bob.kq.suf, com.bytedance.adsdk.oq.bob.kq.wki
    public /* bridge */ /* synthetic */ List bob() {
        return super.bob();
    }

    @Override // com.bytedance.adsdk.oq.bob.kq.suf, com.bytedance.adsdk.oq.bob.kq.wki
    public /* bridge */ /* synthetic */ boolean oq() {
        return super.oq();
    }

    @Override // com.bytedance.adsdk.oq.bob.kq.suf
    public /* bridge */ /* synthetic */ String toString() {
        return super.toString();
    }

    private static com.bytedance.adsdk.oq.rjo.kq<com.bytedance.adsdk.oq.bob.oq.fou> kq(com.bytedance.adsdk.oq.rjo.kq<com.bytedance.adsdk.oq.bob.oq.fou> kqVar) {
        com.bytedance.adsdk.oq.bob.oq.fou fouVar = kqVar.kq;
        com.bytedance.adsdk.oq.bob.oq.fou fouVar2 = kqVar.oq;
        if (fouVar == null || fouVar2 == null || fouVar.kq().length == fouVar2.kq().length) {
            return kqVar;
        }
        float[] fArrKq = kq(fouVar.kq(), fouVar2.kq());
        return kqVar.kq(fouVar.kq(fArrKq), fouVar2.kq(fArrKq));
    }

    static float[] kq(float[] fArr, float[] fArr2) {
        int length = fArr.length + fArr2.length;
        float[] fArr3 = new float[length];
        System.arraycopy(fArr, 0, fArr3, 0, fArr.length);
        System.arraycopy(fArr2, 0, fArr3, fArr.length, fArr2.length);
        Arrays.sort(fArr3);
        float f10 = Float.NaN;
        int i10 = 0;
        for (int i11 = 0; i11 < length; i11++) {
            float f11 = fArr3[i11];
            if (f11 != f10) {
                fArr3[i10] = f11;
                i10++;
                f10 = fArr3[i11];
            }
        }
        return Arrays.copyOfRange(fArr3, 0, i10);
    }

    @Override // com.bytedance.adsdk.oq.bob.kq.wki
    public com.bytedance.adsdk.oq.kq.oq.kq<com.bytedance.adsdk.oq.bob.oq.fou, com.bytedance.adsdk.oq.bob.oq.fou> kq() {
        return new com.bytedance.adsdk.oq.kq.oq.csi(this.kq);
    }
}
