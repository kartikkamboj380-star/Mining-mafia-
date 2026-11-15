package com.bytedance.adsdk.ugeno.kq;

import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public class syt implements rjo {
    private float bob;
    private float csi;
    private float fou;
    private View kq;
    private float oq;
    private float rhi;

    public syt(View view) {
        this.kq = view;
    }

    public void bob(float f10) {
        View view = this.kq;
        if (view == null) {
            return;
        }
        this.fou = f10;
        view.postInvalidate();
    }

    public void csi(float f10) {
        this.rhi = f10;
        this.kq.postInvalidate();
    }

    public void fou(float f10) {
        this.csi = f10;
        this.kq.postInvalidate();
    }

    @Override // com.bytedance.adsdk.ugeno.kq.rjo
    public float getRipple() {
        return this.bob;
    }

    @Override // com.bytedance.adsdk.ugeno.kq.rjo
    public float getRubIn() {
        return this.rhi;
    }

    @Override // com.bytedance.adsdk.ugeno.kq.rjo
    public float getShine() {
        return this.fou;
    }

    @Override // com.bytedance.adsdk.ugeno.kq.rjo
    public float getStretch() {
        return this.csi;
    }

    public void kq(float f10) {
        View view = this.kq;
        if (view == null) {
            return;
        }
        this.oq = f10;
        Drawable background = view.getBackground();
        if (background instanceof GradientDrawable) {
            ((GradientDrawable) background).setCornerRadius(f10);
        }
    }

    public void oq(float f10) {
        View view = this.kq;
        if (view == null) {
            return;
        }
        this.bob = f10;
        view.postInvalidate();
    }

    public float kq() {
        return this.oq;
    }

    public void kq(int i10) {
        View view = this.kq;
        if (view == null) {
            return;
        }
        Drawable background = view.getBackground();
        if (background instanceof GradientDrawable) {
            ((GradientDrawable) background).setColor(i10);
        } else if (background instanceof ColorDrawable) {
            ((ColorDrawable) background.mutate()).setColor(i10);
        }
    }
}
