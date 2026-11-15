package com.bytedance.sdk.openadsdk.utils;

import android.app.Activity;
import android.content.res.Resources;
import android.graphics.BitmapFactory;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.Base64;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes.dex */
public class fou {

    private static class kq implements View.OnLayoutChangeListener {
        private int bob;
        private final Drawable kq;
        private int oq;

        public kq(Drawable drawable) {
            this.kq = drawable;
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
            int i18 = i12 - i10;
            int i19 = i13 - i11;
            if (i18 == this.oq && i19 == this.bob) {
                return;
            }
            this.oq = i18;
            this.bob = i19;
            this.kq.setBounds(0, 0, i18, i19);
        }
    }

    public static void kq(ViewGroup viewGroup, com.bytedance.sdk.openadsdk.core.model.uml umlVar) {
        if (viewGroup == null || umlVar == null || TextUtils.isEmpty(umlVar.ha())) {
            return;
        }
        try {
            int i10 = mxq.tqu;
            if (viewGroup.getTag(i10) != null) {
                return;
            }
            viewGroup.setTag(i10, Integer.valueOf(i10));
            Drawable drawableKq = kq(viewGroup.getResources(), umlVar);
            if (drawableKq == null) {
                return;
            }
            viewGroup.setForeground(drawableKq);
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.fax.bob("add overlay fail", th.getMessage());
        }
    }

    public static void kq(Activity activity, com.bytedance.sdk.openadsdk.core.model.uml umlVar) {
        if (activity == null || umlVar == null || TextUtils.isEmpty(umlVar.ha())) {
            return;
        }
        try {
            View decorView = activity.getWindow().getDecorView();
            int i10 = mxq.tqu;
            if (decorView.getTag(i10) != null) {
                return;
            }
            activity.getWindow().getDecorView().setTag(i10, Integer.valueOf(i10));
            Drawable drawableKq = kq(activity.getResources(), umlVar);
            if (drawableKq == null) {
                return;
            }
            activity.getWindow().getDecorView().setForeground(drawableKq);
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.fax.bob("add overlay fail", th.getMessage());
        }
    }

    private static Drawable kq(Resources resources, com.bytedance.sdk.openadsdk.core.model.uml umlVar) {
        try {
            String strHa = umlVar.ha();
            if (TextUtils.isEmpty(strHa)) {
                return null;
            }
            byte[] bArrDecode = Base64.decode(strHa, 0);
            BitmapDrawable bitmapDrawable = new BitmapDrawable(resources, BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length));
            Shader.TileMode tileMode = Shader.TileMode.REPEAT;
            bitmapDrawable.setTileModeXY(tileMode, tileMode);
            bitmapDrawable.setTargetDensity(resources.getDisplayMetrics());
            return bitmapDrawable;
        } catch (Throwable unused) {
            return null;
        }
    }
}
