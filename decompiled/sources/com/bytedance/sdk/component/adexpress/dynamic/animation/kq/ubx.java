package com.bytedance.sdk.component.adexpress.dynamic.animation.kq;

import android.animation.ObjectAnimator;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class ubx extends fou {
    public ubx(View view, com.bytedance.sdk.component.adexpress.dynamic.fou.kq kqVar) {
        super(view, kqVar);
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        if (viewGroup != null) {
            viewGroup.setClipChildren(false);
            viewGroup.setClipToPadding(false);
            ViewGroup viewGroup2 = (ViewGroup) viewGroup.getParent();
            if (viewGroup2 == null || !(viewGroup2 instanceof com.bytedance.sdk.component.adexpress.dynamic.dynamicview.csi)) {
                return;
            }
            viewGroup2.setClipChildren(false);
            viewGroup2.setClipToPadding(false);
            ViewGroup viewGroup3 = (ViewGroup) viewGroup2.getParent();
            if (viewGroup3 == null || !(viewGroup3 instanceof com.bytedance.sdk.component.adexpress.dynamic.dynamicview.csi)) {
                return;
            }
            viewGroup3.setClipChildren(false);
            viewGroup3.setClipToPadding(false);
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.kq.fou
    List<ObjectAnimator> kq() {
        float f10;
        float fUbx = (float) this.oq.ubx();
        float fVvw = (float) this.oq.vvw();
        String strMxq = this.oq.mxq();
        float f11 = 1.0f;
        if ("reverse".equals(strMxq) || "alternate-reverse".equals(strMxq)) {
            f10 = 1.0f;
        } else {
            f10 = fVvw;
            fVvw = 1.0f;
            f11 = fUbx;
            fUbx = 1.0f;
        }
        this.bob.setTag(2097610710, this.oq.oq());
        ObjectAnimator duration = ObjectAnimator.ofFloat(this.bob, "scaleX", fUbx, f11).setDuration((int) (this.oq.nn() * 1000.0d));
        ObjectAnimator duration2 = ObjectAnimator.ofFloat(this.bob, "scaleY", fVvw, f10).setDuration((int) (this.oq.nn() * 1000.0d));
        ArrayList arrayList = new ArrayList();
        arrayList.add(kq(duration));
        arrayList.add(kq(duration2));
        return arrayList;
    }
}
