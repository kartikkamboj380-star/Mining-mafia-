package com.bytedance.sdk.openadsdk.core.widget;

import android.content.Context;
import android.view.View;
import com.bytedance.sdk.openadsdk.core.model.uml;
import com.bytedance.sdk.openadsdk.utils.bss;

/* JADX INFO: loaded from: classes.dex */
public class bob extends com.bytedance.sdk.openadsdk.core.rhi.fou {
    public bob(Context context) {
        super(context);
        kq();
    }

    private void kq() {
        setVisibility(8);
        setId(com.bytedance.sdk.openadsdk.utils.mxq.ne);
    }

    public void kq(int i10, uml umlVar) {
        if (umlVar.bns() || (umlVar.rn() && umlVar.uml())) {
            bss.kq((View) this, 0);
            com.bytedance.sdk.openadsdk.gm.oq.oq().kq((int) bss.kq(getContext(), i10, true), this, umlVar);
        }
    }
}
