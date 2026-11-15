package com.bytedance.sdk.component.adexpress.dynamic.animation.kq;

import android.animation.ObjectAnimator;
import android.annotation.SuppressLint;
import android.view.View;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class rjo extends fou {
    public rjo(View view, com.bytedance.sdk.component.adexpress.dynamic.fou.kq kqVar) {
        super(view, kqVar);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.kq.fou
    @SuppressLint({"ObjectAnimatorBinding"})
    List<ObjectAnimator> kq() {
        this.bob.setTag(2097610709, Integer.valueOf(this.oq.bob()));
        ObjectAnimator duration = ObjectAnimator.ofFloat(this.bob, "marqueeValue", UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f).setDuration((int) (this.oq.nn() * 1000.0d));
        ArrayList arrayList = new ArrayList();
        arrayList.add(kq(duration));
        return arrayList;
    }
}
