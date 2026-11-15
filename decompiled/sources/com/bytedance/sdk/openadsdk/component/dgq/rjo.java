package com.bytedance.sdk.openadsdk.component.dgq;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import com.bytedance.sdk.component.utils.uml;
import com.bytedance.sdk.openadsdk.core.sns;
import com.bytedance.sdk.openadsdk.utils.bss;

/* JADX INFO: loaded from: classes.dex */
public class rjo extends com.bytedance.sdk.openadsdk.core.rhi.rjo {
    private final com.bytedance.sdk.openadsdk.core.rhi.syt bob;
    private final com.bytedance.sdk.openadsdk.core.rhi.fou kq;
    private final com.bytedance.sdk.openadsdk.core.rhi.fou oq;

    public rjo(@NonNull Context context) {
        super(context);
        setLayoutParams(new RelativeLayout.LayoutParams(-1, -2));
        int iOq = bss.oq(context, 12.0f);
        int iOq2 = bss.oq(context, 16.0f);
        int iOq3 = bss.oq(context, 20.0f);
        int iOq4 = bss.oq(context, 24.0f);
        int iOq5 = bss.oq(context, 28.0f);
        com.bytedance.sdk.openadsdk.core.rhi.fou fouVar = new com.bytedance.sdk.openadsdk.core.rhi.fou(context);
        this.kq = fouVar;
        fouVar.setId(520093713);
        int iOq6 = bss.oq(getContext(), 5.0f);
        fouVar.setPadding(iOq6, iOq6, iOq6, iOq6);
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        fouVar.setScaleType(scaleType);
        fouVar.setBackground(com.bytedance.sdk.openadsdk.core.widget.fou.kq());
        fouVar.setImageResource(uml.fou(sns.kq(), "tt_reward_full_feedback"));
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(iOq5, iOq5);
        layoutParams.topMargin = iOq3;
        layoutParams.leftMargin = iOq2;
        layoutParams.setMarginStart(iOq2);
        fouVar.setLayoutParams(layoutParams);
        com.bytedance.sdk.openadsdk.core.rhi.fou fouVar2 = new com.bytedance.sdk.openadsdk.core.rhi.fou(context);
        this.oq = fouVar2;
        fouVar2.setId(520093714);
        fouVar2.setPadding(iOq6, iOq6, iOq6, iOq6);
        fouVar2.setScaleType(scaleType);
        fouVar2.setBackground(com.bytedance.sdk.openadsdk.core.widget.fou.kq());
        fouVar2.setImageResource(uml.fou(sns.kq(), "tt_close_btn"));
        if (fouVar2.getDrawable() != null) {
            fouVar2.getDrawable().setAutoMirrored(true);
        }
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(iOq5, iOq5);
        layoutParams2.topMargin = iOq3;
        layoutParams2.rightMargin = iOq2;
        layoutParams2.setMarginEnd(iOq2);
        layoutParams2.addRule(11);
        layoutParams2.addRule(21);
        fouVar2.setLayoutParams(layoutParams2);
        fouVar2.setVisibility(4);
        com.bytedance.sdk.openadsdk.core.rhi.syt sytVar = new com.bytedance.sdk.openadsdk.core.rhi.syt(context);
        this.bob = sytVar;
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-2, iOq4);
        layoutParams3.topMargin = iOq3;
        layoutParams3.rightMargin = iOq2;
        layoutParams3.addRule(11);
        layoutParams3.setMarginEnd(iOq2);
        layoutParams3.addRule(21);
        sytVar.setLayoutParams(layoutParams3);
        sytVar.setBackground(com.bytedance.sdk.openadsdk.core.widget.fou.oq());
        sytVar.setGravity(17);
        sytVar.setPadding(iOq, 0, iOq, 0);
        sytVar.setTextColor(-1);
        sytVar.setTextSize(1, 14.0f);
        sytVar.setVisibility(4);
        addView(fouVar);
        addView(sytVar);
        addView(fouVar2);
    }

    public com.bytedance.sdk.openadsdk.core.rhi.syt getTopCountDown() {
        return this.bob;
    }

    public View getTopDislike() {
        return this.kq;
    }

    public com.bytedance.sdk.openadsdk.core.rhi.fou getTopSkip() {
        return this.oq;
    }
}
