package com.bytedance.sdk.openadsdk.core.ubx.oq.kq;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.text.TextUtils;
import com.bytedance.adsdk.ugeno.oq.bob;
import com.bytedance.sdk.openadsdk.utils.bss;
import com.unity3d.services.UnityAdsConstants;

/* JADX INFO: loaded from: classes.dex */
public class oq extends bob<kq> {
    private int et;
    private int iaf;
    private int jwr;
    private int kq;
    private float oz;
    private int rxz;
    private com.bytedance.sdk.openadsdk.core.ubx.oq zp;

    public oq(Context context) {
        super(context);
        this.et = -1;
        this.jwr = -1;
        kq(context);
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
        com.bytedance.adsdk.ugeno.dgq.rhi.kq kqVarKq = ((kq) this.csi).kq();
        if (kqVarKq != null) {
            this.zp.kq(kqVarKq);
            ((kq) this.csi).kq(kqVarKq);
        }
        ((kq) this.csi).kq(this.kq, this.et, this.jwr, this.rxz, this.iaf, this.oz);
    }

    private void kq(Context context) {
        this.zp = new com.bytedance.sdk.openadsdk.core.ubx.oq(context, true);
    }

    @Override // com.bytedance.adsdk.ugeno.oq.bob
    public void kq(String str, String str2) {
        super.kq(str, str2);
        str.getClass();
        switch (str) {
            case "barWidth":
                this.rxz = bss.oq(this.oq, com.bytedance.adsdk.ugeno.rjo.bob.kq(str2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT));
                break;
            case "bottomBackgroundColor":
                if (!TextUtils.isEmpty(str2)) {
                    this.jwr = Color.parseColor(str2);
                    break;
                }
                break;
            case "shadowColor":
            case "shadowOffsetX":
            case "shadowOffsetY":
            case "textAlign":
            case "textColor":
            case "textStyle":
            case "shadowBlur":
            case "textSize":
            case "textDecoration":
            case "fontWeight":
            case "lineHeight":
            case "text":
            case "lines":
            case "ellipsis":
            case "maxLines":
            case "letterSpacing":
                this.zp.kq(str, str2);
                break;
            case "topBackgroundColor":
                if (!TextUtils.isEmpty(str2)) {
                    this.et = Color.parseColor(str2);
                    break;
                }
                break;
            case "barHeight":
                this.iaf = bss.oq(this.oq, com.bytedance.adsdk.ugeno.rjo.bob.kq(str2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT));
                break;
            case "barRadius":
                this.oz = bss.oq(this.oq, com.bytedance.adsdk.ugeno.rjo.bob.kq(str2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT));
                break;
            case "downtime":
                this.kq = com.bytedance.adsdk.ugeno.rjo.bob.kq(str2, 0);
                break;
        }
    }

    @Override // com.bytedance.adsdk.ugeno.oq.bob, com.bytedance.adsdk.ugeno.fou
    public void kq(Canvas canvas) {
        super.kq(canvas);
    }
}
