package com.bytedance.sdk.component.adexpress.dynamic.animation.kq;

import android.animation.ObjectAnimator;
import android.view.View;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class mxq extends fou {
    public mxq(View view, com.bytedance.sdk.component.adexpress.dynamic.fou.kq kqVar) {
        super(view, kqVar);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.kq.fou
    List<ObjectAnimator> kq() {
        ObjectAnimator duration = ObjectAnimator.ofFloat(this.bob, "translationX", UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, com.bytedance.sdk.component.adexpress.fou.rjo.kq(com.bytedance.sdk.component.adexpress.fou.kq(), 20.0f), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, -com.bytedance.sdk.component.adexpress.fou.rjo.kq(com.bytedance.sdk.component.adexpress.fou.kq(), 20.0f), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT).setDuration((int) (this.oq.nn() * 1000.0d));
        ArrayList arrayList = new ArrayList();
        arrayList.add(kq(duration));
        return arrayList;
    }
}
