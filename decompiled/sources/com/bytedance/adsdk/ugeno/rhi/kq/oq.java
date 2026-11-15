package com.bytedance.adsdk.ugeno.rhi.kq;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;

/* JADX INFO: loaded from: classes.dex */
public class oq extends kq {
    public oq(Context context) {
        super(context);
    }

    @Override // com.bytedance.adsdk.ugeno.rhi.kq.kq
    public Drawable oq(int i10) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(1);
        gradientDrawable.setColor(i10);
        return gradientDrawable;
    }
}
