package com.bytedance.sdk.component.adexpress.dynamic.animation.kq;

import android.animation.ObjectAnimator;
import android.annotation.SuppressLint;
import android.view.View;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class vvw extends fou {
    public vvw(View view, com.bytedance.sdk.component.adexpress.dynamic.fou.kq kqVar) {
        super(view, kqVar);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.kq.fou
    @SuppressLint({"ObjectAnimatorBinding"})
    List<ObjectAnimator> kq() {
        int i10;
        int i11;
        this.bob.setTag(2097610711, Integer.valueOf(this.oq.fou()));
        View view = this.bob;
        if (view == null || !com.bytedance.sdk.component.adexpress.fou.oq.kq(view.getContext())) {
            i10 = 0;
            i11 = 1;
        } else {
            i11 = 0;
            i10 = 1;
        }
        ObjectAnimator duration = ObjectAnimator.ofFloat(this.bob, "shineValue", i10, i11).setDuration((int) (this.oq.nn() * 1000.0d));
        ArrayList arrayList = new ArrayList();
        arrayList.add(kq(duration));
        return arrayList;
    }
}
