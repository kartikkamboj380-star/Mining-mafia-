package com.bytedance.sdk.openadsdk.common;

import android.content.Context;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.bytedance.sdk.component.utils.uml;
import com.bytedance.sdk.openadsdk.utils.bss;

/* JADX INFO: loaded from: classes.dex */
public class nn extends RelativeLayout {
    public nn(Context context) {
        super(context);
        kq();
    }

    private void kq() {
        Context context = getContext();
        int iOq = bss.oq(context, 12.0f);
        setLayoutParams(new ViewGroup.LayoutParams(-1, bss.oq(context, 44.0f)));
        setBackgroundColor(-1);
        com.bytedance.sdk.openadsdk.core.rhi.fou fouVar = new com.bytedance.sdk.openadsdk.core.rhi.fou(context);
        fouVar.setId(520093720);
        fouVar.setClickable(true);
        fouVar.setFocusable(true);
        fouVar.setImageDrawable(com.bytedance.sdk.openadsdk.utils.ubx.kq(context, "tt_leftbackicon_selector"));
        int iOq2 = bss.oq(context, 24.0f);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(iOq2, iOq2);
        layoutParams.leftMargin = iOq;
        layoutParams.addRule(15);
        addView(fouVar, layoutParams);
        com.bytedance.sdk.openadsdk.core.rhi.fou fouVar2 = new com.bytedance.sdk.openadsdk.core.rhi.fou(context);
        fouVar2.setId(520093716);
        fouVar2.setClickable(true);
        fouVar2.setFocusable(true);
        fouVar2.setImageDrawable(com.bytedance.sdk.openadsdk.utils.ubx.kq(context, "tt_titlebar_close_seletor"));
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(iOq2, iOq2);
        layoutParams2.leftMargin = iOq;
        layoutParams2.addRule(15);
        layoutParams2.addRule(1, 520093720);
        addView(fouVar2, layoutParams2);
        com.bytedance.sdk.openadsdk.core.rhi.fou fouVar3 = new com.bytedance.sdk.openadsdk.core.rhi.fou(context);
        int i10 = com.bytedance.sdk.openadsdk.utils.mxq.jhy;
        fouVar3.setId(i10);
        fouVar3.setImageDrawable(uml.bob(context, "tt_ad_feedback_new"));
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(iOq2, iOq2);
        layoutParams3.addRule(11);
        layoutParams3.addRule(15);
        layoutParams3.rightMargin = iOq;
        addView(fouVar3, layoutParams3);
        com.bytedance.sdk.openadsdk.core.rhi.syt sytVar = new com.bytedance.sdk.openadsdk.core.rhi.syt(context);
        sytVar.setId(com.bytedance.sdk.openadsdk.utils.mxq.rul);
        sytVar.setSingleLine(true);
        sytVar.setEllipsize(TextUtils.TruncateAt.END);
        sytVar.setGravity(17);
        sytVar.setTextColor(-16777216);
        sytVar.setTextSize(1, 16.0f);
        RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(bss.oq(context, 240.0f), -2);
        layoutParams4.addRule(15);
        layoutParams4.addRule(1, 520093716);
        layoutParams4.addRule(0, i10);
        int iOq3 = bss.oq(context, 25.0f);
        layoutParams4.rightMargin = iOq3;
        layoutParams4.leftMargin = iOq3;
        addView(sytVar, layoutParams4);
    }
}
