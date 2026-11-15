package com.bytedance.sdk.component.adexpress.rhi;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.text.TextUtils;
import android.view.animation.LinearInterpolator;
import android.widget.ImageView;
import android.widget.TextView;

/* JADX INFO: loaded from: classes.dex */
public class syt extends jhe {
    private ImageView bob;
    private int csi;
    private ImageView fou;
    private TextView kq;
    private ImageView oq;
    private AnimatorSet rhi;

    public syt(Context context) {
        super(context);
        this.rhi = new AnimatorSet();
        oq(context);
    }

    private void fou() {
        ObjectAnimator objectAnimatorOfInt = ObjectAnimator.ofInt(this, "alphaColor", 0, 60);
        objectAnimatorOfInt.setInterpolator(new LinearInterpolator());
        objectAnimatorOfInt.setDuration(2000L);
        objectAnimatorOfInt.setRepeatCount(-1);
        objectAnimatorOfInt.start();
    }

    private void oq(Context context) {
        addView(com.bytedance.sdk.component.adexpress.bob.kq.oq(context));
        this.oq = (ImageView) findViewById(2097610751);
        this.bob = (ImageView) findViewById(2097610750);
        this.fou = (ImageView) findViewById(2097610749);
        this.kq = (TextView) findViewById(2097610748);
    }

    public float getAlphaColor() {
        return this.csi;
    }

    @Override // com.bytedance.sdk.component.adexpress.rhi.jhe
    protected void kq(Context context) {
    }

    public void setAlphaColor(int i10) {
        if (i10 < 0 || i10 > 60) {
            return;
        }
        int i11 = i10 + 195;
        ImageView imageView = this.fou;
        int iRgb = Color.rgb(i11, i11, i11);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        imageView.setColorFilter(iRgb, mode);
        int i12 = ((i10 + 20) % 60) + 195;
        this.bob.setColorFilter(Color.rgb(i12, i12, i12), mode);
        int i13 = ((i10 + 40) % 60) + 195;
        this.oq.setColorFilter(Color.rgb(i13, i13, i13), mode);
    }

    public void setButtonText(String str) {
        if (this.kq == null || TextUtils.isEmpty(str)) {
            return;
        }
        this.kq.setText(str);
    }

    @Override // com.bytedance.sdk.component.adexpress.rhi.jhe
    public void kq() {
        fou();
    }

    @Override // com.bytedance.sdk.component.adexpress.rhi.jhe
    public void oq() {
        this.rhi.cancel();
    }
}
