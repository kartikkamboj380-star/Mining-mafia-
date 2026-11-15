package com.bytedance.sdk.component.adexpress.dynamic.animation.kq;

import android.animation.ObjectAnimator;
import android.view.View;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class kq extends fou {
    public kq(View view, com.bytedance.sdk.component.adexpress.dynamic.fou.kq kqVar) {
        super(view, kqVar);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.kq.fou
    List<ObjectAnimator> kq() {
        float fWcx = this.oq.wcx() / 100.0f;
        float fGm = this.oq.gm() / 100.0f;
        if ("reverse".equals(this.oq.mxq()) && this.oq.suf() <= 0.0d) {
            fGm = fWcx;
            fWcx = fGm;
        }
        this.bob.setAlpha(fWcx);
        ObjectAnimator duration = ObjectAnimator.ofFloat(this.bob, "alpha", fWcx, fGm).setDuration((int) (this.oq.nn() * 1000.0d));
        ArrayList arrayList = new ArrayList();
        arrayList.add(kq(duration));
        return arrayList;
    }
}
