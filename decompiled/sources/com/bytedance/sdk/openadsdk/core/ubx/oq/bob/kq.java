package com.bytedance.sdk.openadsdk.core.ubx.oq.bob;

import android.content.Context;
import android.widget.FrameLayout;

/* JADX INFO: loaded from: classes.dex */
public class kq extends com.bytedance.adsdk.ugeno.dgq.oq.kq {
    private final com.bytedance.adsdk.ugeno.dgq.oq.kq kq;

    public kq(Context context) {
        super(context);
        com.bytedance.adsdk.ugeno.dgq.oq.kq kqVar = new com.bytedance.adsdk.ugeno.dgq.oq.kq(context);
        this.kq = kqVar;
        addView(kqVar, new FrameLayout.LayoutParams(-1, -1));
    }

    public com.bytedance.adsdk.ugeno.dgq.oq.kq getPlayableView() {
        return this.kq;
    }
}
