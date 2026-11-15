package com.bytedance.sdk.component.adexpress.dynamic.animation.kq;

import android.animation.ObjectAnimator;
import android.annotation.SuppressLint;
import android.view.View;
import android.view.ViewGroup;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class syt extends fou {
    public syt(View view, com.bytedance.sdk.component.adexpress.dynamic.fou.kq kqVar) {
        super(view, kqVar);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.kq.fou
    @SuppressLint({"ObjectAnimatorBinding"})
    List<ObjectAnimator> kq() {
        ObjectAnimator duration = ObjectAnimator.ofFloat(this.bob, "rippleValue", UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f).setDuration((int) (this.oq.nn() * 1000.0d));
        ((ViewGroup) this.bob.getParent()).setClipChildren(false);
        ((ViewGroup) this.bob.getParent().getParent()).setClipChildren(false);
        ((ViewGroup) this.bob.getParent().getParent().getParent()).setClipChildren(false);
        this.bob.setTag(2097610712, this.oq.syt());
        ArrayList arrayList = new ArrayList();
        arrayList.add(kq(duration));
        return arrayList;
    }
}
