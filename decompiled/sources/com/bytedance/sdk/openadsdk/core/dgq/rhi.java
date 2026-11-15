package com.bytedance.sdk.openadsdk.core.dgq;

import android.content.Context;
import com.bytedance.sdk.component.adexpress.theme.ThemeStatusBroadcastReceiver;
import com.bytedance.sdk.openadsdk.utils.nz;

/* JADX INFO: loaded from: classes.dex */
public class rhi extends com.bytedance.sdk.component.adexpress.dynamic.kq.kq {
    private final com.bytedance.sdk.component.syt.syt bob;
    private final Runnable fou;
    private final com.bytedance.sdk.component.adexpress.oq.wki kq;
    private com.bytedance.sdk.component.adexpress.oq.rjo oq;

    public rhi(Context context, ThemeStatusBroadcastReceiver themeStatusBroadcastReceiver, boolean z9, com.bytedance.sdk.component.adexpress.dynamic.csi.syt sytVar, com.bytedance.sdk.component.adexpress.oq.wki wkiVar, com.bytedance.sdk.component.adexpress.dynamic.rhi.kq kqVar) {
        super(context, themeStatusBroadcastReceiver, z9, sytVar, wkiVar, kqVar);
        this.bob = new com.bytedance.sdk.component.syt.syt("dynamic_render_template") { // from class: com.bytedance.sdk.openadsdk.core.dgq.rhi.1
            @Override // java.lang.Runnable
            public void run() {
                rhi.this.kq.bob();
                com.bytedance.sdk.openadsdk.core.suf.bob().post(rhi.this.fou);
            }
        };
        this.fou = new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.dgq.rhi.2
            @Override // java.lang.Runnable
            public void run() {
                if (rhi.this.oq != null) {
                    rhi rhiVar = rhi.this;
                    rhi.super.kq(rhiVar.oq);
                }
            }
        };
        this.kq = wkiVar;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.kq.kq
    public void oq() {
        super.oq();
        com.bytedance.sdk.openadsdk.core.suf.bob().removeCallbacks(this.fou);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.kq.kq, com.bytedance.sdk.component.adexpress.oq.fou
    public void kq(com.bytedance.sdk.component.adexpress.oq.rjo rjoVar) {
        this.oq = rjoVar;
        nz.oq(this.bob);
    }
}
