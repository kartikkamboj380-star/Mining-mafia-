package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.annotation.SuppressLint;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;

/* JADX INFO: loaded from: classes.dex */
public class mq extends rjo implements com.bytedance.sdk.component.adexpress.dynamic.bob {
    private int fax;
    private int[] kq;
    private int oq;

    public mq(Context context, DynamicRootView dynamicRootView, com.bytedance.sdk.component.adexpress.dynamic.fou.syt sytVar) {
        super(context, dynamicRootView, sytVar);
        dynamicRootView.setTimeOutListener(this);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.rjo, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.rhi, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.wf
    public boolean dgq() {
        super.dgq();
        ((TextView) this.nze).setText("");
        return true;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.bob
    @SuppressLint({"SetTextI18n"})
    public void kq(CharSequence charSequence, boolean z9, int i10, boolean z10) {
        String strKq = com.bytedance.sdk.component.utils.uml.kq(com.bytedance.sdk.component.adexpress.fou.kq(), "tt_reward_screen_skip_tx");
        if (i10 == 0) {
            this.nze.setVisibility(0);
            ((TextView) this.nze).setText("| ".concat(String.valueOf(strKq)));
            this.nze.measure(-2, -2);
            this.kq = new int[]{this.nze.getMeasuredWidth() + 1, this.nze.getMeasuredHeight()};
            View view = this.nze;
            int[] iArr = this.kq;
            view.setLayoutParams(new FrameLayout.LayoutParams(iArr[0], iArr[1]));
            ((TextView) this.nze).setGravity(17);
            ((TextView) this.nze).setIncludeFontPadding(false);
            kq();
            this.nze.setPadding(this.vvw.bob(), this.oq, this.vvw.fou(), this.fax);
        }
        requestLayout();
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        if (TextUtils.isEmpty(((TextView) this.nze).getText())) {
            setMeasuredDimension(0, this.syt);
        } else {
            setMeasuredDimension(this.rjo, this.syt);
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.csi
    public void rhi() {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(this.rjo, this.syt);
        layoutParams.gravity = 8388629;
        layoutParams.setMarginStart(layoutParams.leftMargin);
        layoutParams.setMarginEnd(layoutParams.rightMargin);
        setLayoutParams(layoutParams);
    }

    private void kq() {
        int iKq = (int) com.bytedance.sdk.component.adexpress.fou.rjo.kq(this.ubx, this.vvw.csi());
        this.oq = ((this.syt - iKq) / 2) - this.vvw.kq();
        this.fax = 0;
    }
}
