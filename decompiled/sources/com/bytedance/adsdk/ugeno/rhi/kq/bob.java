package com.bytedance.adsdk.ugeno.rhi.kq;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;

/* JADX INFO: loaded from: classes.dex */
public class bob extends kq {
    public bob(Context context) {
        super(context);
    }

    @Override // com.bytedance.adsdk.ugeno.rhi.kq.kq
    public Drawable oq(int i10) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setColor(i10);
        return gradientDrawable;
    }
}
