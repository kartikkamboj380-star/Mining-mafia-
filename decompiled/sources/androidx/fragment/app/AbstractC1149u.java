package androidx.fragment.app;

import android.R;
import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.AnimationUtils;
import android.view.animation.Transformation;

/* JADX INFO: renamed from: androidx.fragment.app.u, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
abstract class AbstractC1149u {
    private static int a(ComponentCallbacksC1144o componentCallbacksC1144o, boolean z9, boolean z10) {
        if (z10) {
            return z9 ? componentCallbacksC1144o.getPopEnterAnim() : componentCallbacksC1144o.getPopExitAnim();
        }
        return z9 ? componentCallbacksC1144o.getEnterAnim() : componentCallbacksC1144o.getExitAnim();
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0071 A[Catch: RuntimeException -> 0x0077, TRY_LEAVE, TryCatch #0 {RuntimeException -> 0x0077, blocks: (B:32:0x006b, B:34:0x0071), top: B:45:0x006b }] */
    static a b(Context context, ComponentCallbacksC1144o componentCallbacksC1144o, boolean z9, boolean z10) {
        Animator animatorLoadAnimator;
        int nextTransition = componentCallbacksC1144o.getNextTransition();
        int iA = a(componentCallbacksC1144o, z9, z10);
        componentCallbacksC1144o.setAnimations(0, 0, 0, 0);
        ViewGroup viewGroup = componentCallbacksC1144o.mContainer;
        if (viewGroup != null && viewGroup.getTag(p071h0.b.f44741c) != null) {
            componentCallbacksC1144o.mContainer.setTag(p071h0.b.f44741c, null);
        }
        ViewGroup viewGroup2 = componentCallbacksC1144o.mContainer;
        if (viewGroup2 != null && viewGroup2.getLayoutTransition() != null) {
            return null;
        }
        Animation animationOnCreateAnimation = componentCallbacksC1144o.onCreateAnimation(nextTransition, z9, iA);
        if (animationOnCreateAnimation != null) {
            return new a(animationOnCreateAnimation);
        }
        Animator animatorOnCreateAnimator = componentCallbacksC1144o.onCreateAnimator(nextTransition, z9, iA);
        if (animatorOnCreateAnimator != null) {
            return new a(animatorOnCreateAnimator);
        }
        if (iA == 0 && nextTransition != 0) {
            iA = d(context, nextTransition, z9);
        }
        if (iA != 0) {
            boolean zEquals = "anim".equals(context.getResources().getResourceTypeName(iA));
            if (zEquals) {
                try {
                    Animation animationLoadAnimation = AnimationUtils.loadAnimation(context, iA);
                    if (animationLoadAnimation != null) {
                        return new a(animationLoadAnimation);
                    }
                } catch (Resources.NotFoundException e10) {
                    throw e10;
                } catch (RuntimeException unused) {
                    try {
                        animatorLoadAnimator = AnimatorInflater.loadAnimator(context, iA);
                        if (animatorLoadAnimator != null) {
                            return new a(animatorLoadAnimator);
                        }
                    } catch (RuntimeException e11) {
                        if (zEquals) {
                            throw e11;
                        }
                        Animation animationLoadAnimation2 = AnimationUtils.loadAnimation(context, iA);
                        if (animationLoadAnimation2 != null) {
                            return new a(animationLoadAnimation2);
                        }
                    }
                }
            } else {
                animatorLoadAnimator = AnimatorInflater.loadAnimator(context, iA);
                if (animatorLoadAnimator != null) {
                    return new a(animatorLoadAnimator);
                }
            }
        }
        return null;
    }

    private static int c(Context context, int i10) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(R.style.Animation.Activity, new int[]{i10});
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, -1);
        typedArrayObtainStyledAttributes.recycle();
        return resourceId;
    }

    private static int d(Context context, int i10, boolean z9) {
        if (i10 == 4097) {
            return z9 ? p071h0.a.f44737e : p071h0.a.f44738f;
        }
        if (i10 == 8194) {
            return z9 ? p071h0.a.f44733a : p071h0.a.f44734b;
        }
        if (i10 == 8197) {
            return z9 ? c(context, R.attr.activityCloseEnterAnimation) : c(context, R.attr.activityCloseExitAnimation);
        }
        if (i10 == 4099) {
            return z9 ? p071h0.a.f44735c : p071h0.a.f44736d;
        }
        if (i10 != 4100) {
            return -1;
        }
        return z9 ? c(context, R.attr.activityOpenEnterAnimation) : c(context, R.attr.activityOpenExitAnimation);
    }

    /* JADX INFO: renamed from: androidx.fragment.app.u$a */
    static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Animation f10120a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Animator f10121b;

        a(Animation animation) {
            this.f10120a = animation;
            this.f10121b = null;
            if (animation == null) {
                throw new IllegalStateException("Animation cannot be null");
            }
        }

        a(Animator animator) {
            this.f10120a = null;
            this.f10121b = animator;
            if (animator == null) {
                throw new IllegalStateException("Animator cannot be null");
            }
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.u$b */
    static class b extends AnimationSet implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final ViewGroup f10122a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final View f10123b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f10124c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f10125d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private boolean f10126e;

        b(Animation animation, ViewGroup viewGroup, View view) {
            super(false);
            this.f10126e = true;
            this.f10122a = viewGroup;
            this.f10123b = view;
            addAnimation(animation);
            viewGroup.post(this);
        }

        @Override // android.view.animation.AnimationSet, android.view.animation.Animation
        public boolean getTransformation(long j10, Transformation transformation) {
            this.f10126e = true;
            if (this.f10124c) {
                return !this.f10125d;
            }
            if (!super.getTransformation(j10, transformation)) {
                this.f10124c = true;
                O.M.a(this.f10122a, this);
            }
            return true;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f10124c || !this.f10126e) {
                this.f10122a.endViewTransition(this.f10123b);
                this.f10125d = true;
            } else {
                this.f10126e = false;
                this.f10122a.post(this);
            }
        }

        @Override // android.view.animation.Animation
        public boolean getTransformation(long j10, Transformation transformation, float f10) {
            this.f10126e = true;
            if (this.f10124c) {
                return !this.f10125d;
            }
            if (!super.getTransformation(j10, transformation, f10)) {
                this.f10124c = true;
                O.M.a(this.f10122a, this);
            }
            return true;
        }
    }
}
