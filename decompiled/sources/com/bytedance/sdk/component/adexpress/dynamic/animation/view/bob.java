package com.bytedance.sdk.component.adexpress.dynamic.animation.view;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.Shader;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.ubx;
import com.bytedance.sdk.component.adexpress.dynamic.fou.rjo;
import com.unity3d.services.UnityAdsConstants;

/* JADX INFO: loaded from: classes.dex */
public class bob {
    private int csi;
    private int fou;
    Paint kq;
    private int rhi;
    Path oq = new Path();
    Path bob = new Path();

    public bob() {
        Paint paint = new Paint();
        this.kq = paint;
        paint.setAntiAlias(true);
    }

    public void kq(Canvas canvas, IAnimation iAnimation, View view) {
        int iIntValue;
        String str;
        float[] fArrOq;
        int iIntValue2 = 0;
        if (iAnimation.getRippleValue() != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            if (com.bytedance.sdk.component.adexpress.kq.kq.kq.kq().bob() != null) {
                try {
                    str = (String) view.getTag(2097610712);
                    try {
                        fArrOq = rjo.oq(str);
                    } catch (Exception unused) {
                        fArrOq = null;
                    }
                } catch (Exception unused2) {
                    str = "";
                }
                if (str.startsWith("#")) {
                    this.kq.setColor(Color.parseColor(str));
                    this.kq.setAlpha(90);
                } else if (fArrOq != null) {
                    this.kq.setColor(com.bytedance.sdk.component.adexpress.fou.rjo.kq(fArrOq[3] * (1.0f - iAnimation.getRippleValue()), fArrOq[0] / 256.0f, fArrOq[1] / 256.0f, fArrOq[2] / 256.0f));
                }
            }
            ((ViewGroup) view.getParent()).setClipChildren(true);
            int i10 = this.fou;
            int i11 = this.csi;
            canvas.drawCircle(i10, i11, Math.min(i10, i11) * 2 * iAnimation.getRippleValue(), this.kq);
        }
        if (iAnimation.getShineValue() != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            if (view.getParent() != null) {
                ((ViewGroup) view.getParent()).setClipChildren(true);
            }
            if (view.getParent().getParent() != null) {
                ((ViewGroup) view.getParent().getParent()).setClipChildren(true);
            }
            this.oq.reset();
            try {
                iIntValue = ((Integer) view.getTag(2097610711)).intValue();
            } catch (Exception unused3) {
                iIntValue = 0;
            }
            if (iIntValue >= 0) {
                int shineValue = ((int) ((((this.fou * 4) + (iIntValue * 2)) + (this.csi * 2)) * iAnimation.getShineValue())) - ((this.csi * 2) + iIntValue);
                float f10 = shineValue;
                int i12 = this.csi;
                this.kq.setShader(new LinearGradient(f10, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, ((iIntValue + i12) / 2) + shineValue, i12 / 2, new int[]{Color.parseColor("#20ffffff"), Color.parseColor("#60ffffff"), Color.parseColor("#65ffffff")}, (float[]) null, Shader.TileMode.MIRROR));
                this.kq.setStrokeWidth(this.fou * 2);
                Path path = this.bob;
                if (path != null) {
                    canvas.clipPath(path, Region.Op.INTERSECT);
                }
                int i13 = shineValue + iIntValue;
                int i14 = this.csi;
                canvas.drawLine(f10, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, i13 + i14, i14, this.kq);
            }
        }
        if (iAnimation.getMarqueeValue() != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            try {
                iIntValue2 = ((Integer) view.getTag(2097610709)).intValue();
            } catch (Exception unused4) {
            }
            if (iIntValue2 >= 0) {
                this.oq.reset();
                this.oq.moveTo(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                this.oq.lineTo(this.fou * 2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                this.oq.lineTo(this.fou * 2, this.csi * 2);
                this.oq.lineTo(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, this.csi * 2);
                this.oq.lineTo(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                this.kq.setShader(new LinearGradient(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, this.fou * 2, this.csi * 2, new int[]{(int) (iAnimation.getMarqueeValue() * (-65536.0f)), (int) ((1.0f - iAnimation.getMarqueeValue()) * (-65536.0f))}, (float[]) null, Shader.TileMode.CLAMP));
                this.kq.setColor(-65536);
                this.kq.setStyle(Paint.Style.STROKE);
                this.kq.setStrokeWidth(iIntValue2);
                canvas.drawPath(this.oq, this.kq);
            }
        }
    }

    public void kq(View view, float f10) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        int i10 = this.rhi;
        int i11 = (int) (i10 * f10);
        layoutParams.width = i11;
        view.setTranslationX((i10 - i11) / 2);
        if (view instanceof ubx) {
            int i12 = 0;
            while (true) {
                ViewGroup viewGroup = (ViewGroup) view;
                if (i12 >= viewGroup.getChildCount()) {
                    break;
                }
                viewGroup.getChildAt(i12).setTranslationX((-(this.rhi - layoutParams.width)) / 2);
                i12++;
            }
        }
        view.setLayoutParams(layoutParams);
    }

    public void kq(View view, int i10, int i11) {
        String str;
        this.fou = i10 / 2;
        this.csi = i11 / 2;
        if (this.rhi == 0 && view.getLayoutParams().width > 0) {
            this.rhi = view.getLayoutParams().width;
        }
        try {
            str = (String) view.getTag(2097610710);
            try {
                this.bob.addRoundRect(new RectF(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, i10, i11), i11 / 2, i11 / 2, Path.Direction.CW);
            } catch (Exception unused) {
            }
        } catch (Exception unused2) {
            str = "";
        }
        if ("right".equals(str)) {
            view.setPivotX(this.fou * 2);
            view.setPivotY(this.csi);
        } else if ("left".equals(str)) {
            view.setPivotX(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            view.setPivotY(this.csi);
        } else {
            view.setPivotX(this.fou);
            view.setPivotY(this.csi);
        }
    }
}
