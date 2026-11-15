package com.bytedance.sdk.component.adexpress.fou;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;

/* JADX INFO: loaded from: classes.dex */
public class bob {
    public static Drawable kq(Context context, com.bytedance.sdk.component.adexpress.dynamic.fou.rjo rjoVar) {
        if (context == null || rjoVar == null) {
            return null;
        }
        return kq(context, (int) rjo.kq(context, rjoVar.sns()), rjoVar.mxq(), rjoVar.rs());
    }

    public static Drawable kq(Context context, int i10, int i11, int i12) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(1);
        if (context != null) {
            gradientDrawable.setStroke(i10, i11);
        }
        gradientDrawable.setColor(i12);
        return gradientDrawable;
    }
}
