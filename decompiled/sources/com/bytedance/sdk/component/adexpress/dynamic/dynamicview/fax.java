package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.content.Context;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;

/* JADX INFO: loaded from: classes.dex */
public class fax extends rjo implements com.bytedance.sdk.component.adexpress.dynamic.bob {
    public fax(Context context, DynamicRootView dynamicRootView, com.bytedance.sdk.component.adexpress.dynamic.fou.syt sytVar) {
        super(context, dynamicRootView, sytVar);
        dynamicRootView.setTimeOutListener(this);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.rjo, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.rhi
    protected FrameLayout.LayoutParams getWidgetLayoutParams() {
        return new FrameLayout.LayoutParams(-2, -2);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.bob
    public void kq(CharSequence charSequence, boolean z9, int i10, boolean z10) {
        if (i10 != 0) {
            ((TextView) this.nze).setText(" | " + String.format(com.bytedance.sdk.component.utils.uml.kq(com.bytedance.sdk.component.adexpress.fou.kq(), "tt_reward_full_skip_count_down"), Integer.valueOf(i10)));
        } else if (getParent() != null) {
            ((ViewGroup) getParent()).removeView(this);
        }
        requestLayout();
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        if (TextUtils.isEmpty(((TextView) this.nze).getText())) {
            setMeasuredDimension(0, this.syt);
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.csi
    public void rhi() {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(this.rjo, this.syt);
        int i10 = this.dgq;
        layoutParams.leftMargin = i10;
        layoutParams.gravity = 16;
        layoutParams.setMarginStart(i10);
        layoutParams.setMarginEnd(layoutParams.rightMargin);
        setLayoutParams(layoutParams);
    }
}
