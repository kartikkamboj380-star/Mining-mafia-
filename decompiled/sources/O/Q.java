package O;

import android.R;
import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import android.view.WindowInsetsController;
import android.view.inputmethod.InputMethodManager;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public final class Q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final c f3779a;

    /* JADX INFO: Access modifiers changed from: private */
    static class a extends c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final View f3780a;

        a(View view) {
            this.f3780a = view;
        }

        @Override // O.Q.c
        void a() {
            View view = this.f3780a;
            if (view != null) {
                ((InputMethodManager) view.getContext().getSystemService("input_method")).hideSoftInputFromWindow(this.f3780a.getWindowToken(), 0);
            }
        }

        @Override // O.Q.c
        void b() {
            final View viewFindViewById = this.f3780a;
            if (viewFindViewById == null) {
                return;
            }
            if (viewFindViewById.isInEditMode() || viewFindViewById.onCheckIsTextEditor()) {
                viewFindViewById.requestFocus();
            } else {
                viewFindViewById = viewFindViewById.getRootView().findFocus();
            }
            if (viewFindViewById == null) {
                viewFindViewById = this.f3780a.getRootView().findViewById(R.id.content);
            }
            if (viewFindViewById == null || !viewFindViewById.hasWindowFocus()) {
                return;
            }
            viewFindViewById.post(new Runnable() { // from class: O.P
                @Override // java.lang.Runnable
                public final void run() {
                    View view = viewFindViewById;
                    ((InputMethodManager) view.getContext().getSystemService("input_method")).showSoftInput(view, 0);
                }
            });
        }
    }

    private static class c {
        c() {
        }

        abstract void a();

        abstract void b();
    }

    public Q(View view) {
        if (Build.VERSION.SDK_INT >= 30) {
            this.f3779a = new b(view);
        } else {
            this.f3779a = new a(view);
        }
    }

    public void a() {
        this.f3779a.a();
    }

    public void b() {
        this.f3779a.b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    static class b extends a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private View f3781b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private WindowInsetsController f3782c;

        b(View view) {
            super(view);
            this.f3781b = view;
        }

        @Override // O.Q.a, O.Q.c
        void a() {
            View view;
            WindowInsetsController windowInsetsController = this.f3782c;
            if (windowInsetsController == null) {
                View view2 = this.f3781b;
                windowInsetsController = view2 != null ? view2.getWindowInsetsController() : null;
            }
            if (windowInsetsController == null) {
                super.a();
                return;
            }
            final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            WindowInsetsController.OnControllableInsetsChangedListener onControllableInsetsChangedListener = new WindowInsetsController.OnControllableInsetsChangedListener() { // from class: O.Y
                @Override // android.view.WindowInsetsController.OnControllableInsetsChangedListener
                public final void onControllableInsetsChanged(WindowInsetsController windowInsetsController2, int i10) {
                    atomicBoolean.set((i10 & 8) != 0);
                }
            };
            windowInsetsController.addOnControllableInsetsChangedListener(onControllableInsetsChangedListener);
            if (!atomicBoolean.get() && (view = this.f3781b) != null) {
                ((InputMethodManager) view.getContext().getSystemService("input_method")).hideSoftInputFromWindow(this.f3781b.getWindowToken(), 0);
            }
            windowInsetsController.removeOnControllableInsetsChangedListener(onControllableInsetsChangedListener);
            windowInsetsController.hide(WindowInsets.Type.ime());
        }

        @Override // O.Q.a, O.Q.c
        void b() {
            View view = this.f3781b;
            if (view != null && Build.VERSION.SDK_INT < 33) {
                ((InputMethodManager) view.getContext().getSystemService("input_method")).isActive();
            }
            WindowInsetsController windowInsetsController = this.f3782c;
            if (windowInsetsController == null) {
                View view2 = this.f3781b;
                windowInsetsController = view2 != null ? view2.getWindowInsetsController() : null;
            }
            if (windowInsetsController != null) {
                windowInsetsController.show(WindowInsets.Type.ime());
            }
            super.b();
        }

        b(WindowInsetsController windowInsetsController) {
            super(null);
            this.f3782c = windowInsetsController;
        }
    }

    Q(WindowInsetsController windowInsetsController) {
        this.f3779a = new b(windowInsetsController);
    }
}
