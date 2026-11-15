package com.bytedance.adsdk.oq.kq.oq;

import android.graphics.Color;
import android.graphics.Paint;

/* JADX INFO: loaded from: classes.dex */
public class bob implements kq.InterfaceC0222kq {
    private final kq<Float, Float> bob;
    private final kq<Float, Float> csi;
    private final kq<Float, Float> fou;
    private final kq.InterfaceC0222kq kq;
    private final kq<Integer, Integer> oq;
    private final kq<Float, Float> rhi;
    private boolean rjo = true;

    public bob(kq.InterfaceC0222kq interfaceC0222kq, com.bytedance.adsdk.oq.bob.bob.kq kqVar, com.bytedance.adsdk.oq.csi.nn nnVar) {
        this.kq = interfaceC0222kq;
        kq<Integer, Integer> kqVarKq = nnVar.kq().kq();
        this.oq = kqVarKq;
        kqVarKq.kq(this);
        kqVar.kq(kqVarKq);
        kq<Float, Float> kqVarKq2 = nnVar.oq().kq();
        this.bob = kqVarKq2;
        kqVarKq2.kq(this);
        kqVar.kq(kqVarKq2);
        kq<Float, Float> kqVarKq3 = nnVar.bob().kq();
        this.fou = kqVarKq3;
        kqVarKq3.kq(this);
        kqVar.kq(kqVarKq3);
        kq<Float, Float> kqVarKq4 = nnVar.fou().kq();
        this.csi = kqVarKq4;
        kqVarKq4.kq(this);
        kqVar.kq(kqVarKq4);
        kq<Float, Float> kqVarKq5 = nnVar.csi().kq();
        this.rhi = kqVarKq5;
        kqVarKq5.kq(this);
        kqVar.kq(kqVarKq5);
    }

    @Override // com.bytedance.adsdk.oq.kq.oq.kq.InterfaceC0222kq
    public void kq() {
        this.rjo = true;
        this.kq.kq();
    }

    public void kq(Paint paint) {
        if (this.rjo) {
            this.rjo = false;
            double dFloatValue = ((double) this.fou.rjo().floatValue()) * 0.017453292519943295d;
            float fFloatValue = this.csi.rjo().floatValue();
            float fSin = ((float) Math.sin(dFloatValue)) * fFloatValue;
            float fCos = ((float) Math.cos(dFloatValue + 3.141592653589793d)) * fFloatValue;
            int iIntValue = this.oq.rjo().intValue();
            paint.setShadowLayer(this.rhi.rjo().floatValue(), fSin, fCos, Color.argb(Math.round(this.bob.rjo().floatValue()), Color.red(iIntValue), Color.green(iIntValue), Color.blue(iIntValue)));
        }
    }
}
