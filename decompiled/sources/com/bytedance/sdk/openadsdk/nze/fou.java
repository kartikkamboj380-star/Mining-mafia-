package com.bytedance.sdk.openadsdk.nze;

import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.bytedance.sdk.openadsdk.core.rhi.rhi;
import com.bytedance.sdk.openadsdk.core.rhi.rjo;
import com.bytedance.sdk.openadsdk.utils.bss;
import com.bytedance.sdk.openadsdk.utils.mxq;
import com.bytedance.sdk.openadsdk.utils.ubx;

/* JADX INFO: loaded from: classes.dex */
public class fou extends rjo {
    public fou(Context context) {
        this(context, null);
    }

    private void kq(Context context) {
        setBackgroundColor(Color.parseColor("#000000"));
        setId(520093726);
        int iOq = bss.oq(context, 60.0f);
        com.bytedance.sdk.openadsdk.core.rhi.bob bobVar = new com.bytedance.sdk.openadsdk.core.rhi.bob(context);
        bobVar.setId(mxq.aed);
        bobVar.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
        bobVar.setBackgroundColor(0);
        addView(bobVar);
        com.bytedance.sdk.openadsdk.core.rhi.fou fouVar = new com.bytedance.sdk.openadsdk.core.rhi.fou(context);
        fouVar.setId(mxq.ju);
        fouVar.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        fouVar.setScaleType(ImageView.ScaleType.CENTER_CROP);
        bobVar.addView(fouVar);
        rhi rhiVar = new rhi(context);
        rhiVar.setId(mxq.job);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(iOq, iOq);
        layoutParams.gravity = 17;
        rhiVar.setLayoutParams(layoutParams);
        rhiVar.setIndeterminateDrawable(ubx.kq(context, "tt_video_loading_progress_bar"));
        bobVar.addView(rhiVar);
        com.bytedance.sdk.openadsdk.core.rhi.fou fouVar2 = new com.bytedance.sdk.openadsdk.core.rhi.fou(context);
        fouVar2.setId(mxq.fsp);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams2.addRule(13);
        fouVar2.setLayoutParams(layoutParams2);
        fouVar2.setScaleType(ImageView.ScaleType.CENTER);
        fouVar2.setImageDrawable(ubx.kq(context, "tt_play_movebar_textpage"));
        fouVar2.setVisibility(8);
        addView(fouVar2);
        View oqVar = new oq(context);
        oqVar.setId(mxq.kfr);
        oqVar.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
        addView(oqVar);
    }

    public fou(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public fou(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        kq(context);
    }
}
