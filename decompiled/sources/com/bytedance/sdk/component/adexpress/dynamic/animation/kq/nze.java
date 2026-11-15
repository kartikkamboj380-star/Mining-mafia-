package com.bytedance.sdk.component.adexpress.dynamic.animation.kq;

import android.animation.ObjectAnimator;
import android.view.View;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class nze extends fou {
    public nze(View view, com.bytedance.sdk.component.adexpress.dynamic.fou.kq kqVar) {
        super(view, kqVar);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.kq.fou
    List<ObjectAnimator> kq() {
        float f10;
        float fKq = com.bytedance.sdk.component.adexpress.fou.rjo.kq(com.bytedance.sdk.component.adexpress.fou.kq(), this.oq.rhi());
        float fKq2 = com.bytedance.sdk.component.adexpress.fou.rjo.kq(com.bytedance.sdk.component.adexpress.fou.kq(), this.oq.rjo());
        boolean zEquals = "reverse".equals(this.oq.mxq());
        float f11 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        if (zEquals) {
            f10 = fKq2;
            fKq2 = 0.0f;
            f11 = fKq;
            fKq = 0.0f;
        } else {
            f10 = 0.0f;
        }
        if (com.bytedance.sdk.component.adexpress.fou.oq.kq(this.bob.getContext())) {
            fKq = -fKq;
            f11 = -f11;
        }
        this.bob.setTranslationX(fKq);
        this.bob.setTranslationY(fKq2);
        ObjectAnimator duration = ObjectAnimator.ofFloat(this.bob, "translationX", fKq, f11).setDuration((int) (this.oq.nn() * 1000.0d));
        ObjectAnimator duration2 = ObjectAnimator.ofFloat(this.bob, "translationY", fKq2, f10).setDuration((int) (this.oq.nn() * 1000.0d));
        ArrayList arrayList = new ArrayList();
        arrayList.add(kq(duration));
        arrayList.add(kq(duration2));
        return arrayList;
    }
}
