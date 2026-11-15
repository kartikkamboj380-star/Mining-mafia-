package com.bytedance.sdk.openadsdk.common;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import com.bytedance.sdk.openadsdk.utils.bss;

/* JADX INFO: loaded from: classes.dex */
public class ubx {
    private com.bytedance.sdk.openadsdk.core.widget.syt bob;
    private com.bytedance.sdk.openadsdk.core.rhi.syt csi;
    private com.bytedance.sdk.openadsdk.core.widget.sns fou;
    protected View kq = csi();
    protected Context oq;

    public ubx(Context context) {
        this.oq = context;
    }

    private View csi() {
        com.bytedance.sdk.openadsdk.core.rhi.csi csiVar = new com.bytedance.sdk.openadsdk.core.rhi.csi(this.oq);
        csiVar.setGravity(1);
        csiVar.setOrientation(1);
        com.bytedance.sdk.openadsdk.core.widget.sns snsVar = new com.bytedance.sdk.openadsdk.core.widget.sns(this.oq);
        this.fou = snsVar;
        snsVar.setId(520093745);
        int iOq = bss.oq(this.oq, 64.0f);
        csiVar.addView(this.fou, new LinearLayout.LayoutParams(iOq, iOq));
        com.bytedance.sdk.openadsdk.core.rhi.syt sytVar = new com.bytedance.sdk.openadsdk.core.rhi.syt(this.oq);
        this.csi = sytVar;
        sytVar.setId(520093746);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(bss.oq(this.oq, 219.0f), -2);
        layoutParams.topMargin = bss.oq(this.oq, 16.0f);
        this.csi.setLayoutParams(layoutParams);
        this.csi.setEllipsize(TextUtils.TruncateAt.END);
        this.csi.setGravity(17);
        this.csi.setMaxWidth(bss.oq(this.oq, 150.0f));
        this.csi.setMaxLines(2);
        this.csi.setTextColor(-1);
        this.csi.setTextSize(1, 16.0f);
        csiVar.addView(this.csi);
        this.bob = new com.bytedance.sdk.openadsdk.core.widget.syt(this.oq);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(bss.oq(this.oq, 219.0f), bss.oq(this.oq, 6.0f));
        layoutParams2.topMargin = bss.oq(this.oq, 32.0f);
        csiVar.addView(this.bob, layoutParams2);
        return csiVar;
    }

    public com.bytedance.sdk.openadsdk.core.rhi.syt bob() {
        return this.csi;
    }

    public void fou() {
        this.kq = null;
        this.oq = null;
    }

    public View kq() {
        return this.kq;
    }

    public com.bytedance.sdk.openadsdk.core.widget.sns oq() {
        return this.fou;
    }

    public void kq(int i10) {
        this.bob.setProgress(i10);
    }
}
