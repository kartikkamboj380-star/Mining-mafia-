package com.bytedance.sdk.openadsdk.core.ubx.oq.rhi;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;

/* JADX INFO: loaded from: classes.dex */
public class kq extends com.bytedance.adsdk.ugeno.dgq.oq.kq {
    private final com.bytedance.adsdk.ugeno.dgq.oq.kq kq;
    private final com.bytedance.adsdk.ugeno.dgq.oq.kq oq;

    public kq(Context context) {
        super(context);
        com.bytedance.adsdk.ugeno.dgq.oq.kq kqVar = new com.bytedance.adsdk.ugeno.dgq.oq.kq(context);
        this.kq = kqVar;
        addView(kqVar, new FrameLayout.LayoutParams(-1, -1));
        com.bytedance.adsdk.ugeno.dgq.oq.kq kqVar2 = new com.bytedance.adsdk.ugeno.dgq.oq.kq(context);
        this.oq = kqVar2;
        kqVar2.setBackgroundColor(0);
        addView(kqVar2, new FrameLayout.LayoutParams(-1, -1));
    }

    public com.bytedance.adsdk.ugeno.dgq.oq.kq getMarkView() {
        return this.oq;
    }

    public com.bytedance.adsdk.ugeno.dgq.oq.kq getVideoView() {
        return this.kq;
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.oq.setOnClickListener(onClickListener);
    }

    @Override // android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public void setOnTouchListener(View.OnTouchListener onTouchListener) {
        this.oq.setOnTouchListener(onTouchListener);
    }
}
