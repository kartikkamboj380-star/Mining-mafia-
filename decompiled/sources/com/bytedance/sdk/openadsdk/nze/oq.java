package com.bytedance.sdk.openadsdk.nze;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.bytedance.sdk.openadsdk.core.rhi.rjo;
import com.bytedance.sdk.openadsdk.core.rhi.syt;
import com.bytedance.sdk.openadsdk.utils.bss;
import com.bytedance.sdk.openadsdk.utils.mxq;
import com.bytedance.sdk.openadsdk.utils.ubx;

/* JADX INFO: loaded from: classes.dex */
public class oq extends rjo {
    public oq(Context context) {
        this(context, null);
    }

    private void kq(Context context) {
        setId(mxq.kfr);
        setVisibility(8);
        setBackgroundColor(Color.parseColor("#7f000000"));
        com.bytedance.sdk.openadsdk.core.rhi.fou fouVar = new com.bytedance.sdk.openadsdk.core.rhi.fou(getContext());
        fouVar.setId(mxq.yo);
        fouVar.setScaleType(ImageView.ScaleType.CENTER_CROP);
        fouVar.setImageTintMode(PorterDuff.Mode.SRC_OVER);
        fouVar.setImageTintList(ColorStateList.valueOf(Color.parseColor("#7f000000")));
        fouVar.setBackgroundColor(Color.parseColor("#7f000000"));
        fouVar.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
        addView(fouVar);
        rjo rjoVar = new rjo(context);
        rjoVar.setId(mxq.vt);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(13);
        rjoVar.setLayoutParams(layoutParams);
        addView(rjoVar);
        int iOq = bss.oq(context, 44.0f);
        com.bytedance.sdk.openadsdk.core.widget.kq kqVar = new com.bytedance.sdk.openadsdk.core.widget.kq(context);
        int i10 = mxq.tvh;
        kqVar.setId(i10);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(iOq, iOq);
        layoutParams2.addRule(14);
        kqVar.setLayoutParams(layoutParams2);
        kqVar.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        rjoVar.addView(kqVar);
        syt sytVar = new syt(context);
        sytVar.setId(mxq.wbn);
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(iOq, iOq);
        layoutParams3.addRule(8, i10);
        layoutParams3.addRule(19, i10);
        layoutParams3.addRule(5, i10);
        layoutParams3.addRule(7, i10);
        layoutParams3.addRule(18, i10);
        layoutParams3.addRule(6, i10);
        layoutParams3.addRule(14);
        sytVar.setLayoutParams(layoutParams3);
        sytVar.setBackground(ubx.kq(context, "tt_circle_solid_mian"));
        sytVar.setGravity(17);
        sytVar.setTextColor(-1);
        sytVar.setTextSize(2, 19.0f);
        sytVar.setTypeface(Typeface.defaultFromStyle(1));
        sytVar.setVisibility(8);
        rjoVar.addView(sytVar);
        syt sytVar2 = new syt(context);
        int i11 = mxq.syw;
        sytVar2.setId(i11);
        RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams4.addRule(3, i10);
        layoutParams4.addRule(14);
        layoutParams4.topMargin = bss.oq(context, 6.0f);
        sytVar2.setLayoutParams(layoutParams4);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        sytVar2.setEllipsize(truncateAt);
        sytVar2.setMaxLines(1);
        sytVar2.setTextColor(-1);
        sytVar2.setTextSize(2, 12.0f);
        rjoVar.addView(sytVar2);
        syt sytVar3 = new syt(context);
        sytVar3.setId(mxq.ls);
        RelativeLayout.LayoutParams layoutParams5 = new RelativeLayout.LayoutParams(bss.oq(context, 100.0f), bss.oq(context, 28.0f));
        layoutParams5.addRule(14);
        layoutParams5.addRule(3, i11);
        layoutParams5.topMargin = bss.oq(context, 20.0f);
        sytVar3.setLayoutParams(layoutParams5);
        sytVar3.setMinWidth(bss.oq(context, 72.0f));
        sytVar3.setMaxLines(1);
        sytVar3.setEllipsize(truncateAt);
        sytVar3.setTextColor(-1);
        sytVar3.setTextSize(2, 14.0f);
        sytVar3.setBackground(ubx.kq(context, "tt_ad_cover_btn_begin_bg"));
        sytVar3.setGravity(17);
        int iOq2 = bss.oq(context, 10.0f);
        int iOq3 = bss.oq(context, 2.0f);
        sytVar3.setPadding(iOq2, iOq3, iOq2, iOq3);
        sytVar3.setVisibility(8);
        rjoVar.addView(sytVar3);
    }

    public oq(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public oq(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        kq(context);
    }
}
