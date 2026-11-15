package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
public class dgq extends rhi {
    public dgq(Context context, @NonNull DynamicRootView dynamicRootView, @NonNull com.bytedance.sdk.component.adexpress.dynamic.fou.syt sytVar) {
        super(context, dynamicRootView, sytVar);
        if (com.bytedance.sdk.component.adexpress.fou.oq()) {
            this.nze = new ImageView(context);
        } else {
            this.nze = new com.bytedance.sdk.component.adexpress.rhi.dgq(context);
        }
        this.nze.setTag(3);
        addView(this.nze, getWidgetLayoutParams());
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.rhi, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.wf
    public boolean dgq() {
        super.dgq();
        if (com.bytedance.sdk.component.adexpress.fou.oq()) {
            Drawable drawableKq = com.bytedance.sdk.component.adexpress.fou.bob.kq(getContext(), this.vvw);
            if (drawableKq != null) {
                this.nze.setBackground(drawableKq);
            }
            int iFou = com.bytedance.sdk.component.utils.uml.fou(getContext(), "tt_close_btn");
            if (iFou > 0) {
                ((ImageView) this.nze).setImageResource(iFou);
            }
            ((ImageView) this.nze).setScaleType(ImageView.ScaleType.FIT_XY);
            return true;
        }
        int iKq = (int) com.bytedance.sdk.component.adexpress.fou.rjo.kq(this.ubx, this.vvw.sns());
        View view = this.nze;
        if (view instanceof com.bytedance.sdk.component.adexpress.rhi.dgq) {
            ((com.bytedance.sdk.component.adexpress.rhi.dgq) view).setRadius((int) com.bytedance.sdk.component.adexpress.fou.rjo.kq(this.ubx, this.vvw.nze()));
            ((com.bytedance.sdk.component.adexpress.rhi.dgq) this.nze).setStrokeWidth(iKq);
            ((com.bytedance.sdk.component.adexpress.rhi.dgq) this.nze).setStrokeColor(this.vvw.mxq());
            ((com.bytedance.sdk.component.adexpress.rhi.dgq) this.nze).setBgColor(this.vvw.rs());
            ((com.bytedance.sdk.component.adexpress.rhi.dgq) this.nze).setDislikeColor(this.vvw.rjo());
            ((com.bytedance.sdk.component.adexpress.rhi.dgq) this.nze).setDislikeWidth((int) com.bytedance.sdk.component.adexpress.fou.rjo.kq(this.ubx, 1.0f));
        }
        return true;
    }
}
