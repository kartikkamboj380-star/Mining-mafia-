package com.bytedance.adsdk.ugeno.dgq.csi;

import android.content.Context;
import android.graphics.Color;
import com.bytedance.adsdk.ugeno.oq.bob;
import com.unity3d.services.UnityAdsConstants;

/* JADX INFO: loaded from: classes.dex */
public class oq extends bob<kq> {
    private static final int oz = Color.parseColor("#FFC642");
    private static final int zp = Color.parseColor("#e3e3e4");
    private int et;
    private float iaf;
    private float jwr;
    private int kq;
    private float rxz;

    public oq(Context context) {
        super(context);
        this.kq = oz;
        this.et = zp;
        this.jwr = 4.0f;
        this.rxz = 20.0f;
    }

    @Override // com.bytedance.adsdk.ugeno.oq.bob
    /* JADX INFO: renamed from: bob, reason: merged with bridge method [inline-methods] */
    public kq kq() {
        kq kqVar = new kq(this.oq);
        kqVar.kq(this);
        return kqVar;
    }

    @Override // com.bytedance.adsdk.ugeno.oq.bob
    public void oq() {
        super.oq();
        if (zfx()) {
            ((kq) this.csi).kq(this.jwr, this.kq, this.et, this.rxz, (int) this.iaf);
        } else {
            ((kq) this.csi).kq(this.jwr, this.kq, this.et, this.rxz, 5);
        }
    }

    @Override // com.bytedance.adsdk.ugeno.oq.bob
    public void kq(String str, String str2) {
        super.kq(str, str2);
        str.getClass();
        switch (str) {
            case "highLightColor":
            case "highlightColor":
                this.kq = com.bytedance.adsdk.ugeno.rjo.kq.kq(str2);
                break;
            case "lowLightColor":
            case "lowlightColor":
                this.et = com.bytedance.adsdk.ugeno.rjo.kq.kq(str2, zp);
                break;
            case "gap":
                this.iaf = com.bytedance.adsdk.ugeno.rjo.bob.kq(str2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                break;
            case "size":
                this.rxz = com.bytedance.adsdk.ugeno.rjo.bob.kq(str2, 20.0f);
                break;
            case "score":
                this.jwr = com.bytedance.adsdk.ugeno.rjo.bob.kq(str2, 4.0f);
                break;
        }
    }
}
