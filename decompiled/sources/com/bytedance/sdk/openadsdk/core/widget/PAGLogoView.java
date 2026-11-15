package com.bytedance.sdk.openadsdk.core.widget;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.bytedance.sdk.openadsdk.core.model.uml;
import com.bytedance.sdk.openadsdk.utils.bss;

/* JADX INFO: loaded from: classes.dex */
public class PAGLogoView extends LinearLayout {
    protected int containerHeight;
    private com.bytedance.sdk.openadsdk.core.rhi.fou mAdLogo;
    private com.bytedance.sdk.openadsdk.core.rhi.syt mAdText;

    public PAGLogoView(Context context) {
        this(context, null);
    }

    public static PAGLogoView createPAGLogoViewByMaterial(Context context, uml umlVar) {
        PAGLogoView pAGLogoView = new PAGLogoView(context);
        pAGLogoView.initData(umlVar);
        return pAGLogoView;
    }

    private void initView(Context context) {
        int iOq = bss.oq(context, 2.0f);
        this.containerHeight = bss.oq(getContext(), 12.0f);
        this.mAdLogo = new com.bytedance.sdk.openadsdk.core.rhi.fou(context);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(bss.oq(context, 14.0f), bss.oq(context, 6.0f));
        layoutParams.leftMargin = iOq;
        this.mAdLogo.setLayoutParams(layoutParams);
        this.mAdLogo.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        this.mAdText = new com.bytedance.sdk.openadsdk.core.rhi.syt(context);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, this.containerHeight);
        layoutParams2.leftMargin = iOq;
        layoutParams2.rightMargin = iOq;
        this.mAdText.setLayoutParams(layoutParams2);
        this.mAdText.setTextSize(1, 8.0f);
        this.mAdText.setGravity(17);
        this.mAdText.setTextColor(Color.parseColor("#BFFFFFFF"));
        addView(this.mAdLogo);
        addView(this.mAdText);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setColor(Color.parseColor("#26000000"));
        gradientDrawable.setCornerRadius(iOq);
        setBackground(gradientDrawable);
        setGravity(16);
    }

    public void initData(uml umlVar) {
        if (umlVar == null) {
            return;
        }
        initData(umlVar.bvt());
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
    }

    @Override // android.view.View
    public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
        layoutParams.width = -2;
        layoutParams.height = this.containerHeight;
        super.setLayoutParams(com.bytedance.sdk.openadsdk.core.rhi.dgq.kq(this, layoutParams));
    }

    public PAGLogoView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public void initData(com.bytedance.sdk.openadsdk.core.model.oq oqVar) {
        if (oqVar == null) {
            return;
        }
        if (oqVar.csi()) {
            this.mAdLogo.setImageDrawable(com.bytedance.sdk.component.utils.uml.bob(com.bytedance.sdk.openadsdk.core.sns.kq(), "tt_ad_logo"));
        } else {
            String strKq = oqVar.kq();
            if (TextUtils.isEmpty(strKq)) {
                this.mAdLogo.setVisibility(8);
            } else {
                if (strKq.contains("logo")) {
                    this.mAdLogo.setImageDrawable(com.bytedance.sdk.component.utils.uml.bob(com.bytedance.sdk.openadsdk.core.sns.kq(), "tt_ad_logo"));
                } else {
                    com.bytedance.sdk.openadsdk.nn.fou.kq(strKq).bob(1).kq(this.mAdLogo);
                }
                this.mAdLogo.setVisibility(0);
            }
        }
        String strOq = oqVar.oq();
        if (oqVar.csi()) {
            this.mAdText.setText(com.bytedance.sdk.component.utils.uml.kq(com.bytedance.sdk.openadsdk.core.sns.kq(), "tt_logo_en"));
        } else if (TextUtils.isEmpty(strOq)) {
            this.mAdText.setVisibility(8);
        } else {
            this.mAdText.setText(strOq);
            this.mAdText.setVisibility(0);
        }
    }

    public PAGLogoView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        initView(context);
    }

    public PAGLogoView(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        initView(context);
    }
}
