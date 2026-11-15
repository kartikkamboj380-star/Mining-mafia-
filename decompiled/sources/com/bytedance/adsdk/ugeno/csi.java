package com.bytedance.adsdk.ugeno;

import android.content.Context;
import com.bytedance.adsdk.ugeno.fou.nn;
import com.bytedance.adsdk.ugeno.fou.syt;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class csi {
    private static volatile csi kq;
    private com.bytedance.adsdk.ugeno.core.bob bob;
    private com.bytedance.adsdk.ugeno.bob.kq csi;
    private kq fou;
    private List<com.bytedance.adsdk.ugeno.core.oq> oq;
    private com.bytedance.adsdk.ugeno.core.oq.fou rhi;
    private com.bytedance.adsdk.ugeno.core.kq.kq rjo;

    private csi() {
    }

    public static csi kq() {
        if (kq == null) {
            synchronized (csi.class) {
                try {
                    if (kq == null) {
                        kq = new csi();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return kq;
    }

    private void rhi() {
        ArrayList arrayList = new ArrayList();
        this.oq = arrayList;
        com.bytedance.adsdk.ugeno.core.bob bobVar = this.bob;
        if (bobVar != null) {
            arrayList.addAll(bobVar.kq());
        }
        com.bytedance.adsdk.ugeno.core.fou.kq(this.oq);
    }

    public com.bytedance.adsdk.ugeno.bob.kq bob() {
        return this.csi;
    }

    public com.bytedance.adsdk.ugeno.core.kq.kq csi() {
        return this.rjo;
    }

    public com.bytedance.adsdk.ugeno.core.oq.fou fou() {
        return this.rhi;
    }

    public kq oq() {
        return this.fou;
    }

    public void kq(Context context, com.bytedance.adsdk.ugeno.core.bob bobVar, kq kqVar) {
        this.bob = bobVar;
        this.fou = kqVar;
        rhi();
    }

    public void kq(com.bytedance.adsdk.ugeno.bob.kq kqVar) {
        this.csi = kqVar;
    }

    public void kq(syt sytVar) {
        ArrayList arrayList = new ArrayList(new com.bytedance.adsdk.ugeno.fou.kq().kq());
        if (sytVar != null) {
            arrayList.addAll(sytVar.kq());
        }
        nn.kq(arrayList);
    }

    public void kq(com.bytedance.adsdk.ugeno.fou.bob bobVar) {
        ArrayList arrayList = new ArrayList(new com.bytedance.adsdk.ugeno.fou.csi().kq());
        if (bobVar != null) {
            arrayList.addAll(bobVar.kq());
        }
        com.bytedance.adsdk.ugeno.fou.fou.kq(arrayList);
    }
}
