package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.content.Context;
import android.text.TextUtils;
import android.widget.FrameLayout;
import android.widget.TextView;

/* JADX INFO: loaded from: classes.dex */
public class rjo extends rhi {
    public rjo(Context context, DynamicRootView dynamicRootView, com.bytedance.sdk.component.adexpress.dynamic.fou.syt sytVar) {
        super(context, dynamicRootView, sytVar);
        com.bytedance.sdk.component.adexpress.dynamic.animation.view.kq kqVar = new com.bytedance.sdk.component.adexpress.dynamic.animation.view.kq(context);
        this.nze = kqVar;
        kqVar.setTag(Integer.valueOf(getClickArea()));
        addView(this.nze, getWidgetLayoutParams());
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.rhi, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.wf
    public boolean dgq() {
        super.dgq();
        if (TextUtils.equals("download-progress-button", this.wki.nn().oq()) && TextUtils.isEmpty(this.vvw.nn())) {
            this.nze.setVisibility(4);
            return true;
        }
        this.nze.setTextAlignment(this.vvw.syt());
        ((TextView) this.nze).setText(this.vvw.nn());
        ((TextView) this.nze).setTextColor(this.vvw.rjo());
        ((TextView) this.nze).setTextSize(this.vvw.csi());
        ((TextView) this.nze).setGravity(17);
        ((TextView) this.nze).setIncludeFontPadding(false);
        if ("fillButton".equals(this.wki.nn().oq())) {
            this.nze.setPadding(0, 0, 0, 0);
        } else {
            this.nze.setPadding(this.vvw.bob(), this.vvw.oq(), this.vvw.fou(), this.vvw.kq());
        }
        return true;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.rhi
    protected FrameLayout.LayoutParams getWidgetLayoutParams() {
        if (!com.bytedance.sdk.component.adexpress.fou.oq() || !"fillButton".equals(this.wki.nn().oq())) {
            return super.getWidgetLayoutParams();
        }
        ((TextView) this.nze).setEllipsize(TextUtils.TruncateAt.END);
        ((TextView) this.nze).setMaxLines(1);
        FrameLayout.LayoutParams widgetLayoutParams = super.getWidgetLayoutParams();
        widgetLayoutParams.width -= this.vvw.wcx() * 2;
        widgetLayoutParams.height -= this.vvw.wcx() * 2;
        widgetLayoutParams.topMargin += this.vvw.wcx();
        int iWcx = widgetLayoutParams.leftMargin + this.vvw.wcx();
        widgetLayoutParams.leftMargin = iWcx;
        widgetLayoutParams.setMarginStart(iWcx);
        widgetLayoutParams.setMarginEnd(widgetLayoutParams.rightMargin);
        return widgetLayoutParams;
    }
}
