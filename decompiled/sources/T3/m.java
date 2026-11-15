package T3;

import android.view.View;
import android.view.animation.Animation;
import android.view.animation.Transformation;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class m extends Animation {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float f5753a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final WeakReference f5754b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final float f5755c;

    public static final class a implements Animation.AnimationListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final WeakReference f5756a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f5757b;

        public a(View view) {
            Intrinsics.checkNotNullParameter(view, "view");
            this.f5756a = new WeakReference(view);
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            Intrinsics.checkNotNullParameter(animation, "animation");
            View view = (View) this.f5756a.get();
            if (view == null || !this.f5757b) {
                return;
            }
            view.setLayerType(0, null);
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
            Intrinsics.checkNotNullParameter(animation, "animation");
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
            Intrinsics.checkNotNullParameter(animation, "animation");
            View view = (View) this.f5756a.get();
            if (view != null && view.hasOverlappingRendering() && view.getLayerType() == 0) {
                this.f5757b = true;
                view.setLayerType(2, null);
            }
        }
    }

    public m(View view, float f10, float f11) {
        Intrinsics.checkNotNullParameter(view, "view");
        this.f5753a = f10;
        this.f5754b = new WeakReference(view);
        this.f5755c = f11 - f10;
        setAnimationListener(new a(view));
        p064g3.b.a("OpacityAnimation", p064g3.a.ERROR);
    }

    @Override // android.view.animation.Animation
    public void applyTransformation(float f10, Transformation t10) {
        Intrinsics.checkNotNullParameter(t10, "t");
        View view = (View) this.f5754b.get();
        if (view != null) {
            view.setAlpha(this.f5753a + (this.f5755c * f10));
        }
    }

    @Override // android.view.animation.Animation
    public boolean willChangeBounds() {
        return false;
    }
}
