package com.bytedance.sdk.openadsdk.common;

import android.R;
import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.GradientDrawable;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.bytedance.sdk.component.utils.uml;
import com.bytedance.sdk.openadsdk.utils.bss;
import com.unity3d.services.UnityAdsConstants;

/* JADX INFO: loaded from: classes.dex */
public class fax extends com.bytedance.sdk.openadsdk.core.rhi.bob {
    private kq bob;
    private boolean fou;
    private Context kq;
    private LinearLayout oq;

    public interface kq {
        void bob();

        void fou();

        void kq();

        void oq();
    }

    public fax(Context context, boolean z9) {
        super(context);
        this.kq = context;
        this.fou = z9;
        oq();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void bob(View view) {
        kq kqVar = this.bob;
        if (kqVar != null) {
            kqVar.bob();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void csi(View view) {
        kq kqVar = this.bob;
        if (kqVar != null) {
            kqVar.kq();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void fou(View view) {
        kq kqVar = this.bob;
        if (kqVar != null) {
            kqVar.oq();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ boolean kq(View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() == 1) {
            Rect rect = new Rect();
            this.oq.getGlobalVisibleRect(rect);
            if (!rect.contains((int) motionEvent.getRawX(), (int) motionEvent.getRawY())) {
                kq();
            }
        }
        return true;
    }

    @SuppressLint({"ClickableViewAccessibility"})
    private void oq() {
        setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        setBackgroundColor(Color.parseColor("#80000000"));
        setOnTouchListener(new View.OnTouchListener() { // from class: com.bytedance.sdk.openadsdk.common.a
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return this.f13632a.kq(view, motionEvent);
            }
        });
        LinearLayout linearLayout = new LinearLayout(this.kq);
        this.oq = linearLayout;
        linearLayout.setOrientation(1);
        this.oq.setGravity(80);
        this.oq.setPadding(kq(16.0f), 0, kq(16.0f), kq(58.0f));
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadius(kq(16.0f));
        gradientDrawable.setColor(Color.parseColor("#E1E1E1"));
        this.oq.setBackground(gradientDrawable);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        layoutParams.gravity = 81;
        layoutParams.bottomMargin = kq(16.0f);
        this.oq.setLayoutParams(layoutParams);
        com.bytedance.sdk.openadsdk.core.rhi.bob bobVar = new com.bytedance.sdk.openadsdk.core.rhi.bob(this.kq);
        bobVar.setPadding(kq(6.0f), 0, kq(6.0f), 0);
        bobVar.setLayoutParams(new LinearLayout.LayoutParams(-1, kq(44.0f)));
        com.bytedance.sdk.openadsdk.core.rhi.syt sytVar = new com.bytedance.sdk.openadsdk.core.rhi.syt(this.kq);
        Context context = this.kq;
        sytVar.setText(context.getString(uml.oq(context, "tt_more_title")));
        sytVar.setTextColor(Color.parseColor("#000000"));
        sytVar.setTextSize(2, 17.0f);
        sytVar.setGravity(17);
        sytVar.setTypeface(Typeface.defaultFromStyle(1));
        bobVar.addView(sytVar, new FrameLayout.LayoutParams(-1, -1));
        ImageView imageView = new ImageView(this.kq);
        imageView.setImageResource(uml.fou(this.kq, "tt_titlebar_close_drawable"));
        imageView.setPadding(kq(10.0f), kq(10.0f), kq(10.0f), kq(10.0f));
        imageView.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.common.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f13633a.rhi(view);
            }
        });
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(kq(44.0f), kq(44.0f));
        layoutParams2.gravity = 8388629;
        bobVar.addView(imageView, layoutParams2);
        this.oq.addView(bobVar);
        com.bytedance.sdk.openadsdk.core.rhi.csi csiVarKq = kq(8);
        Context context2 = this.kq;
        kq(csiVarKq, context2.getString(uml.oq(context2, "tt_more_retry")), "tt_more_retry_icon", new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.common.c
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f13634a.csi(view);
            }
        });
        Context context3 = this.kq;
        kq(csiVarKq, context3.getString(uml.oq(context3, "tt_more_copy_link")), "tt_more_copy_icon", new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.common.d
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f13635a.fou(view);
            }
        });
        Context context4 = this.kq;
        kq(csiVarKq, context4.getString(uml.oq(context4, "tt_more_open_browser")), "tt_more_browser_icon", new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.common.e
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f13636a.bob(view);
            }
        });
        this.oq.addView(csiVarKq);
        com.bytedance.sdk.openadsdk.core.rhi.csi csiVarKq2 = kq(8);
        Context context5 = this.kq;
        kq(csiVarKq2, context5.getString(uml.oq(context5, "tt_more_report")), "tt_more_report_icon", new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.common.f
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f13637a.oq(view);
            }
        });
        this.oq.addView(csiVarKq2);
        addView(this.oq);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void rhi(View view) {
        kq();
    }

    public void setOnMenuItemClickListener(kq kqVar) {
        this.bob = kqVar;
    }

    private void kq(com.bytedance.sdk.openadsdk.core.rhi.csi csiVar, String str, String str2, View.OnClickListener onClickListener) {
        com.bytedance.sdk.openadsdk.core.rhi.csi csiVar2 = new com.bytedance.sdk.openadsdk.core.rhi.csi(this.kq);
        csiVar2.setOrientation(0);
        csiVar2.setGravity(16);
        csiVar2.setOnClickListener(onClickListener);
        ImageView imageView = new ImageView(this.kq);
        imageView.setImageResource(uml.fou(this.kq, str2));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(kq(20.0f), kq(20.0f));
        layoutParams.setMargins(kq(16.0f), kq(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT), kq(16.0f), kq(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT));
        csiVar2.addView(imageView, layoutParams);
        com.bytedance.sdk.openadsdk.core.rhi.syt sytVar = new com.bytedance.sdk.openadsdk.core.rhi.syt(this.kq);
        sytVar.setText(str);
        sytVar.setTextColor(Color.parseColor("#000000"));
        sytVar.setTextSize(2, 16.0f);
        sytVar.setGravity(8388627);
        sytVar.setTypeface(Typeface.defaultFromStyle(0));
        csiVar2.addView(sytVar, new LinearLayout.LayoutParams(-2, -2));
        ViewGroup.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, kq(52.0f));
        if (csiVar.getChildCount() > 0) {
            View view = new View(this.kq);
            view.setBackgroundColor(Color.parseColor("#1F000000"));
            csiVar.addView(view, new LinearLayout.LayoutParams(-1, kq(1.0f)));
        }
        csiVar.addView(csiVar2, layoutParams2);
    }

    private com.bytedance.sdk.openadsdk.core.rhi.csi kq(int i10) {
        com.bytedance.sdk.openadsdk.core.rhi.csi csiVar = new com.bytedance.sdk.openadsdk.core.rhi.csi(this.kq);
        csiVar.setOrientation(1);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadius(kq(i10));
        gradientDrawable.setColor(-1);
        csiVar.setBackgroundDrawable(gradientDrawable);
        csiVar.setPadding(kq(8.0f), kq(8.0f), kq(8.0f), kq(8.0f));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.topMargin = kq(8.0f);
        csiVar.setLayoutParams(layoutParams);
        return csiVar;
    }

    public void kq(View view) {
        View viewFindViewById = view.getRootView().findViewById(R.id.content);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        if (getParent() == null) {
            ((ViewGroup) viewFindViewById).addView(this, layoutParams);
        }
        setVisibility(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void oq(View view) {
        kq kqVar = this.bob;
        if (kqVar != null) {
            kqVar.fou();
        }
    }

    public void kq() {
        setVisibility(8);
        if (getParent() != null) {
            ((ViewGroup) getParent()).removeView(this);
        }
    }

    private int kq(float f10) {
        return bss.oq(this.kq, f10);
    }
}
