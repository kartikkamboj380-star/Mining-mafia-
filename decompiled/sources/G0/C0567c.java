package G0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import com.unity3d.services.UnityAdsConstants;

/* JADX INFO: renamed from: G0.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0567c extends K {

    /* JADX INFO: renamed from: G0.c$a */
    private static class a extends AnimatorListenerAdapter implements AbstractC0575k.f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final View f817a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f818b = false;

        a(View view) {
            this.f817a = view;
        }

        @Override // G0.AbstractC0575k.f
        public void a(AbstractC0575k abstractC0575k) {
            this.f817a.setTag(AbstractC0572h.f841d, null);
        }

        @Override // G0.AbstractC0575k.f
        public void b(AbstractC0575k abstractC0575k) {
            this.f817a.setTag(AbstractC0572h.f841d, Float.valueOf(this.f817a.getVisibility() == 0 ? y.b(this.f817a) : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT));
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            y.e(this.f817a, 1.0f);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            onAnimationEnd(animator, false);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            if (this.f817a.hasOverlappingRendering() && this.f817a.getLayerType() == 0) {
                this.f818b = true;
                this.f817a.setLayerType(2, null);
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator, boolean z9) {
            if (this.f818b) {
                this.f817a.setLayerType(0, null);
            }
            if (z9) {
                return;
            }
            y.e(this.f817a, 1.0f);
            y.a(this.f817a);
        }

        @Override // G0.AbstractC0575k.f
        public void d(AbstractC0575k abstractC0575k) {
        }

        @Override // G0.AbstractC0575k.f
        public void e(AbstractC0575k abstractC0575k) {
        }

        @Override // G0.AbstractC0575k.f
        public void g(AbstractC0575k abstractC0575k) {
        }

        @Override // G0.AbstractC0575k.f
        public void c(AbstractC0575k abstractC0575k, boolean z9) {
        }
    }

    public C0567c(int i10) {
        s0(i10);
    }

    private Animator t0(View view, float f10, float f11) {
        if (f10 == f11) {
            return null;
        }
        y.e(view, f10);
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) y.f920b, f11);
        a aVar = new a(view);
        objectAnimatorOfFloat.addListener(aVar);
        z().b(aVar);
        return objectAnimatorOfFloat;
    }

    private static float u0(v vVar, float f10) {
        Float f11;
        return (vVar == null || (f11 = (Float) vVar.f911a.get("android:fade:transitionAlpha")) == null) ? f10 : f11.floatValue();
    }

    @Override // G0.K, G0.AbstractC0575k
    public void k(v vVar) {
        super.k(vVar);
        Float fValueOf = (Float) vVar.f912b.getTag(AbstractC0572h.f841d);
        if (fValueOf == null) {
            fValueOf = vVar.f912b.getVisibility() == 0 ? Float.valueOf(y.b(vVar.f912b)) : Float.valueOf(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        }
        vVar.f911a.put("android:fade:transitionAlpha", fValueOf);
    }

    @Override // G0.K
    public Animator p0(ViewGroup viewGroup, View view, v vVar, v vVar2) {
        y.c(view);
        return t0(view, u0(vVar, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT), 1.0f);
    }

    @Override // G0.K
    public Animator r0(ViewGroup viewGroup, View view, v vVar, v vVar2) {
        y.c(view);
        Animator animatorT0 = t0(view, u0(vVar, 1.0f), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        if (animatorT0 == null) {
            y.e(view, u0(vVar2, 1.0f));
        }
        return animatorT0;
    }

    public C0567c() {
    }
}
