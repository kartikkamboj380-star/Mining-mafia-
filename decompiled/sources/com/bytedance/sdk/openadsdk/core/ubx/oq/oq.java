package com.bytedance.sdk.openadsdk.core.ubx.oq;

import android.content.Context;
import android.text.TextUtils;
import com.unity3d.services.UnityAdsConstants;

/* JADX INFO: loaded from: classes.dex */
public class oq extends com.bytedance.adsdk.ugeno.dgq.rhi.oq {
    private String jwr;
    private String rxz;

    public oq(Context context) {
        super(context);
    }

    @Override // com.bytedance.adsdk.ugeno.dgq.rhi.oq, com.bytedance.adsdk.ugeno.oq.bob
    public void kq(String str, String str2) {
        super.kq(str, str2);
        str.getClass();
        if (str.equals("before")) {
            this.jwr = str2;
        } else if (str.equals("after")) {
            this.rxz = str2;
        }
    }

    @Override // com.bytedance.adsdk.ugeno.dgq.rhi.oq, com.bytedance.adsdk.ugeno.oq.bob
    public void oq() {
        super.oq();
        if (TextUtils.isEmpty(this.rxz) || TextUtils.equals(this.rxz, "null")) {
            this.rxz = "";
        }
        if (TextUtils.isEmpty(this.jwr) || TextUtils.equals(this.jwr, "null")) {
            this.jwr = "";
        }
        String str = this.jwr + this.rxz;
        ((com.bytedance.adsdk.ugeno.dgq.rhi.oq) this).kq = str;
        ((com.bytedance.adsdk.ugeno.dgq.rhi.kq) this.csi).setText(str);
        ((com.bytedance.adsdk.ugeno.dgq.rhi.kq) this.csi).setGravity(17);
    }

    @Override // com.bytedance.adsdk.ugeno.dgq.rhi.oq
    public void suf(String str) {
        if (TextUtils.isEmpty(str) || TextUtils.equals(str, "null")) {
            str = "";
        }
        if (TextUtils.isEmpty(this.rxz) || TextUtils.equals(this.rxz, "null")) {
            this.rxz = "";
        }
        if (TextUtils.isEmpty(this.jwr) || TextUtils.equals(this.jwr, "null")) {
            this.jwr = "";
        }
        String str2 = this.jwr + str + this.rxz;
        ((com.bytedance.adsdk.ugeno.dgq.rhi.oq) this).kq = str2;
        ((com.bytedance.adsdk.ugeno.dgq.rhi.kq) this.csi).setText(str2);
        try {
            float f10 = this.ktb ? this.ibd : this.ebt;
            float f11 = this.wf ? this.rs : this.ebt;
            float fMeasureText = ((com.bytedance.adsdk.ugeno.dgq.rhi.kq) this.csi).getPaint().measureText(((com.bytedance.adsdk.ugeno.dgq.rhi.oq) this).kq);
            if (fMeasureText >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                csi((int) (f10 + fMeasureText + f11));
            }
        } catch (Throwable unused) {
        }
    }
}
