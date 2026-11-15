package O;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.animation.Interpolator;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: O.k0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0861k0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final WeakReference f3845a;

    /* JADX INFO: renamed from: O.k0$a */
    class a extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC0863l0 f3846a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ View f3847b;

        a(InterfaceC0863l0 interfaceC0863l0, View view) {
            this.f3846a = interfaceC0863l0;
            this.f3847b = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f3846a.a(this.f3847b);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f3846a.b(this.f3847b);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            this.f3846a.c(this.f3847b);
        }
    }

    C0861k0(View view) {
        this.f3845a = new WeakReference(view);
    }

    private void h(View view, InterfaceC0863l0 interfaceC0863l0) {
        if (interfaceC0863l0 != null) {
            view.animate().setListener(new a(interfaceC0863l0, view));
        } else {
            view.animate().setListener(null);
        }
    }

    public C0861k0 b(float f10) {
        View view = (View) this.f3845a.get();
        if (view != null) {
            view.animate().alpha(f10);
        }
        return this;
    }

    public void c() {
        View view = (View) this.f3845a.get();
        if (view != null) {
            view.animate().cancel();
        }
    }

    public long d() {
        View view = (View) this.f3845a.get();
        if (view != null) {
            return view.animate().getDuration();
        }
        return 0L;
    }

    public C0861k0 e(long j10) {
        View view = (View) this.f3845a.get();
        if (view != null) {
            view.animate().setDuration(j10);
        }
        return this;
    }

    public C0861k0 f(Interpolator interpolator) {
        View view = (View) this.f3845a.get();
        if (view != null) {
            view.animate().setInterpolator(interpolator);
        }
        return this;
    }

    public C0861k0 g(InterfaceC0863l0 interfaceC0863l0) {
        View view = (View) this.f3845a.get();
        if (view != null) {
            h(view, interfaceC0863l0);
        }
        return this;
    }

    public C0861k0 i(long j10) {
        View view = (View) this.f3845a.get();
        if (view != null) {
            view.animate().setStartDelay(j10);
        }
        return this;
    }

    public C0861k0 j(final InterfaceC0867n0 interfaceC0867n0) {
        final View view = (View) this.f3845a.get();
        if (view != null) {
            view.animate().setUpdateListener(interfaceC0867n0 != null ? new ValueAnimator.AnimatorUpdateListener() { // from class: O.j0
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    interfaceC0867n0.a(view);
                }
            } : null);
        }
        return this;
    }

    public void k() {
        View view = (View) this.f3845a.get();
        if (view != null) {
            view.animate().start();
        }
    }

    public C0861k0 l(float f10) {
        View view = (View) this.f3845a.get();
        if (view != null) {
            view.animate().translationY(f10);
        }
        return this;
    }
}
