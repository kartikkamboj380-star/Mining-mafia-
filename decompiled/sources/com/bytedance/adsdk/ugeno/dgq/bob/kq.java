package com.bytedance.adsdk.ugeno.dgq.bob;

import android.content.Context;
import android.text.TextUtils;
import android.widget.ImageView;
import com.bytedance.adsdk.ugeno.dgq.fou.bob;

/* JADX INFO: loaded from: classes.dex */
public abstract class kq extends bob {
    private int iaf;

    public kq(Context context) {
        super(context);
        this.iaf = -16777216;
    }

    private String mxq(String str) {
        String strSuf = suf(str);
        return TextUtils.isEmpty(strSuf) ? "" : "local://".concat(String.valueOf(strSuf));
    }

    @Override // com.bytedance.adsdk.ugeno.dgq.fou.bob
    protected String bob() {
        return "drawable";
    }

    @Override // com.bytedance.adsdk.ugeno.dgq.fou.bob, com.bytedance.adsdk.ugeno.oq.bob
    public void kq(String str, String str2) {
        super.kq(str, str2);
        str.getClass();
        if (str.equals("textColor")) {
            this.iaf = com.bytedance.adsdk.ugeno.rjo.kq.kq(str2);
        }
    }

    @Override // com.bytedance.adsdk.ugeno.dgq.fou.bob, com.bytedance.adsdk.ugeno.oq.bob
    public void oq() {
        ((bob) this).kq = mxq(((bob) this).kq);
        super.oq();
        ((com.bytedance.adsdk.ugeno.dgq.fou.kq) this.csi).setColorFilter(this.iaf);
        ((com.bytedance.adsdk.ugeno.dgq.fou.kq) this.csi).setScaleType(ImageView.ScaleType.FIT_CENTER);
    }

    public abstract String suf(String str);
}
