package com.bytedance.sdk.component.adexpress.dynamic.animation.kq;

import android.animation.ObjectAnimator;
import android.view.View;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class rhi extends fou {
    public rhi(View view, com.bytedance.sdk.component.adexpress.dynamic.fou.kq kqVar) {
        super(view, kqVar);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.kq.fou
    List<ObjectAnimator> kq() {
        float f10 = this.bob.getLayoutParams().width;
        this.bob.setTranslationX(f10);
        ObjectAnimator duration = ObjectAnimator.ofFloat(this.bob, "translationX", f10, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT).setDuration((int) (this.oq.nn() * 1000.0d));
        ObjectAnimator duration2 = ObjectAnimator.ofFloat(this.bob, "alpha", UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f).setDuration((int) (this.oq.nn() * 1000.0d));
        ArrayList arrayList = new ArrayList();
        arrayList.add(kq(duration));
        arrayList.add(kq(duration2));
        return arrayList;
    }
}
