package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.GradientDrawable;

/* JADX INFO: loaded from: classes.dex */
public class wcx extends rhi {
    public oq kq;

    public wcx(Context context, DynamicRootView dynamicRootView, com.bytedance.sdk.component.adexpress.dynamic.fou.syt sytVar) {
        super(context, dynamicRootView, sytVar);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.rhi, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.wf
    public boolean dgq() {
        return super.dgq();
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.csi
    protected GradientDrawable getDrawable() {
        oq oqVar = new oq();
        this.kq = oqVar;
        return oqVar;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.csi
    protected oq kq(Bitmap bitmap) {
        kq kqVar = new kq(bitmap, this.kq);
        this.kq = kqVar;
        return kqVar;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.csi
    protected GradientDrawable kq(GradientDrawable.Orientation orientation, int[] iArr) {
        oq oqVar = new oq(orientation, iArr);
        this.kq = oqVar;
        return oqVar;
    }
}
