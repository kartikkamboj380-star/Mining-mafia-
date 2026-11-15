package com.bytedance.sdk.openadsdk.core.ubx.oq.fou;

import android.content.Context;
import com.bytedance.adsdk.ugeno.rjo.syt;
import com.unity3d.services.UnityAdsConstants;

/* JADX INFO: loaded from: classes.dex */
public class bob extends com.bytedance.adsdk.ugeno.oq.bob<kq> {
    private int et;
    private float iaf;
    private int jwr;
    private String kq;
    private float rxz;

    public bob(Context context) {
        super(context);
        this.kq = "line";
        this.et = com.bytedance.adsdk.ugeno.rjo.kq.kq("#FFD813");
        this.jwr = com.bytedance.adsdk.ugeno.rjo.kq.kq("rgba(0, 0, 0, 0.5)");
        this.rxz = syt.kq(this.oq, 1.0f);
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
        ((kq) this.csi).kq(this.kq).kq(this.et).oq(this.jwr).oq(this.iaf).kq(this.rxz);
    }

    public void rjo(int i10) {
        ((kq) this.csi).setAnimationDuration(i10);
    }

    public void kq(int i10) {
        ((kq) this.csi).setProgress(i10);
    }

    @Override // com.bytedance.adsdk.ugeno.oq.bob
    public void kq(String str, String str2) {
        super.kq(str, str2);
        str.getClass();
        switch (str) {
            case "progressBackgroundColor":
                this.jwr = com.bytedance.adsdk.ugeno.rjo.kq.kq(str2);
                break;
            case "progressSize":
                this.rxz = syt.kq(this.oq, com.bytedance.adsdk.ugeno.rjo.bob.kq(str2, 1.0f));
                break;
            case "progressType":
                this.kq = str2;
                break;
            case "progressColor":
                this.et = com.bytedance.adsdk.ugeno.rjo.kq.kq(str2);
                break;
            case "barRadius":
                if (com.bytedance.adsdk.ugeno.rjo.bob.kq(str2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                    this.iaf = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                    break;
                } else {
                    this.iaf = syt.kq(this.oq, com.bytedance.adsdk.ugeno.rjo.bob.kq(str2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT));
                    break;
                }
                break;
        }
    }
}
