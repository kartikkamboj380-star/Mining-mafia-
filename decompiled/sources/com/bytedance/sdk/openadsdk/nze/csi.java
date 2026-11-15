package com.bytedance.sdk.openadsdk.nze;

import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.bytedance.sdk.component.utils.uml;
import com.bytedance.sdk.openadsdk.core.rhi.rjo;
import com.bytedance.sdk.openadsdk.core.rhi.syt;
import com.bytedance.sdk.openadsdk.utils.bss;
import com.bytedance.sdk.openadsdk.utils.mxq;

/* JADX INFO: loaded from: classes.dex */
public class csi extends rjo {
    public csi(Context context) {
        this(context, null);
    }

    private void kq(Context context) {
        setId(mxq.be);
        setBackgroundColor(Color.parseColor("#00000000"));
        setGravity(16);
        setVisibility(8);
        syt sytVar = new syt(context);
        int i10 = mxq.jqv;
        sytVar.setId(i10);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(14);
        sytVar.setLayoutParams(layoutParams);
        sytVar.setIncludeFontPadding(false);
        sytVar.setText(uml.kq(context, "tt_video_without_wifi_tips"));
        sytVar.setTextColor(Color.parseColor("#cacaca"));
        sytVar.setTextSize(2, 14.0f);
        addView(sytVar);
        rjo rjoVar = new rjo(context);
        rjoVar.setId(mxq.iy);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams2.addRule(3, i10);
        layoutParams2.addRule(13);
        rjoVar.setLayoutParams(layoutParams2);
        addView(rjoVar);
        com.bytedance.sdk.openadsdk.core.rhi.fou fouVar = new com.bytedance.sdk.openadsdk.core.rhi.fou(context);
        fouVar.setId(mxq.dra);
        int iOq = bss.oq(context, 44.0f);
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(iOq, iOq);
        layoutParams3.addRule(15);
        fouVar.setLayoutParams(layoutParams3);
        fouVar.setImageDrawable(uml.bob(context, "tt_new_play_video"));
        fouVar.setScaleType(ImageView.ScaleType.FIT_XY);
        rjoVar.addView(fouVar);
    }

    public csi(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public csi(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        kq(context);
    }
}
