package O;

import android.view.View;
import android.view.ViewTreeObserver;

/* JADX INFO: loaded from: classes.dex */
public final class M implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final View f3774a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ViewTreeObserver f3775b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Runnable f3776c;

    private M(View view, Runnable runnable) {
        this.f3774a = view;
        this.f3775b = view.getViewTreeObserver();
        this.f3776c = runnable;
    }

    public static M a(View view, Runnable runnable) {
        if (view == null) {
            throw new NullPointerException("view == null");
        }
        if (runnable == null) {
            throw new NullPointerException("runnable == null");
        }
        M m10 = new M(view, runnable);
        view.getViewTreeObserver().addOnPreDrawListener(m10);
        view.addOnAttachStateChangeListener(m10);
        return m10;
    }

    public void b() {
        if (this.f3775b.isAlive()) {
            this.f3775b.removeOnPreDrawListener(this);
        } else {
            this.f3774a.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        this.f3774a.removeOnAttachStateChangeListener(this);
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        b();
        this.f3776c.run();
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
        this.f3775b = view.getViewTreeObserver();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        b();
    }
}
