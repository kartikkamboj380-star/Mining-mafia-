package com.bytedance.sdk.component.adexpress.dynamic.bob;

import android.content.Context;
import android.widget.FrameLayout;
import com.bytedance.sdk.component.adexpress.rhi.jhe;

/* JADX INFO: loaded from: classes.dex */
public class sns<E extends jhe> implements rjo<E> {
    protected com.bytedance.sdk.component.adexpress.dynamic.dynamicview.csi bob;
    protected int csi;
    protected com.bytedance.sdk.component.adexpress.dynamic.fou.rjo fou;
    protected jhe kq;
    protected Context oq;

    public sns(Context context, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.csi csiVar, com.bytedance.sdk.component.adexpress.dynamic.fou.rjo rjoVar, int i10) {
        this.csi = i10;
        this.oq = context;
        this.bob = csiVar;
        this.fou = rjoVar;
        fou();
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.bob.rjo
    /* JADX INFO: renamed from: csi, reason: merged with bridge method [inline-methods] */
    public E bob() {
        return (E) this.kq;
    }

    protected void fou() {
        this.kq = new jhe(this.oq, this.fou.tvh());
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, (int) com.bytedance.sdk.component.adexpress.fou.rjo.kq(this.oq, 200.0f));
        layoutParams.gravity = 81;
        layoutParams.bottomMargin = (int) com.bytedance.sdk.component.adexpress.fou.rjo.kq(this.oq, 100 - this.csi);
        this.kq.setLayoutParams(layoutParams);
        try {
            this.kq.setGuideText(this.fou.jq());
        } catch (Throwable unused) {
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.bob.rjo
    public void kq() {
        this.kq.kq();
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.bob.rjo
    public void oq() {
        this.kq.oq();
    }

    public sns(Context context, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.csi csiVar, com.bytedance.sdk.component.adexpress.dynamic.fou.rjo rjoVar) {
        this(context, csiVar, rjoVar, 0);
    }
}
