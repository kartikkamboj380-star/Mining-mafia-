package com.bytedance.sdk.component.adexpress.dynamic.animation.kq;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class nn extends fou {
    private float csi;
    private kq fou;
    private float rhi;

    private class kq {
        private View oq;

        public kq(View view) {
            this.oq = view;
        }

        public void kq(int i10) {
            if (!"top".equals(nn.this.oq.kq())) {
                ViewGroup.LayoutParams layoutParams = this.oq.getLayoutParams();
                layoutParams.height = i10;
                this.oq.setLayoutParams(layoutParams);
                this.oq.requestLayout();
                return;
            }
            if (nn.this.bob instanceof ViewGroup) {
                for (int i11 = 0; i11 < ((ViewGroup) nn.this.bob).getChildCount(); i11++) {
                    ((ViewGroup) nn.this.bob).getChildAt(i11).setTranslationY(i10 - nn.this.csi);
                }
            }
            nn nnVar = nn.this;
            nnVar.bob.setTranslationY(nnVar.csi - i10);
        }
    }

    public nn(View view, com.bytedance.sdk.component.adexpress.dynamic.fou.kq kqVar) {
        super(view, kqVar);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.kq.fou
    List<ObjectAnimator> kq() {
        int i10;
        String str;
        View view = this.bob;
        if ((view instanceof ImageView) && (view.getParent() instanceof com.bytedance.sdk.component.adexpress.dynamic.dynamicview.csi)) {
            this.bob = (View) this.bob.getParent();
        }
        this.bob.setAlpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        ObjectAnimator duration = ObjectAnimator.ofFloat(this.bob, "alpha", UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f).setDuration((int) (this.oq.nn() * 1000.0d));
        this.fou = new kq(this.bob);
        final int i11 = this.bob.getLayoutParams().height;
        this.csi = i11;
        this.rhi = this.bob.getLayoutParams().width;
        if ("left".equals(this.oq.kq()) || "right".equals(this.oq.kq())) {
            i10 = (int) this.rhi;
            str = "width";
        } else {
            str = "height";
            i10 = i11;
        }
        ObjectAnimator duration2 = ObjectAnimator.ofInt(this.fou, str, 0, i10).setDuration((int) (this.oq.nn() * 1000.0d));
        ArrayList arrayList = new ArrayList();
        arrayList.add(kq(duration));
        arrayList.add(kq(duration2));
        ((ObjectAnimator) arrayList.get(0)).addListener(new Animator.AnimatorListener() { // from class: com.bytedance.sdk.component.adexpress.dynamic.animation.kq.nn.1
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator, boolean z9) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                nn.this.fou.kq(i11);
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator, boolean z9) {
            }
        });
        return arrayList;
    }
}
