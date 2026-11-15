package com.bytedance.sdk.component.adexpress.dynamic.animation.kq;

import android.animation.ObjectAnimator;
import android.view.View;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class dgq extends fou {
    public dgq(View view, com.bytedance.sdk.component.adexpress.dynamic.fou.kq kqVar) {
        super(view, kqVar);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.kq.fou
    List<ObjectAnimator> kq() {
        ObjectAnimator duration = ObjectAnimator.ofFloat(this.bob, "rotation", UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 360.0f).setDuration((int) (this.oq.nn() * 1000.0d));
        ArrayList arrayList = new ArrayList();
        arrayList.add(kq(duration));
        return arrayList;
    }
}
