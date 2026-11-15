package K4;

import android.app.Activity;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.Window;
import com.google.android.gms.internal.ads.C3287du;

/* JADX INFO: renamed from: K4.m0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C0782m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final View f2687a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Activity f2688b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f2689c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f2690d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f2691e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final ViewTreeObserver.OnGlobalLayoutListener f2692f;

    public C0782m0(Activity activity, View view, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener onScrollChangedListener) {
        this.f2688b = activity;
        this.f2687a = view;
        this.f2692f = onGlobalLayoutListener;
    }

    private final void f() {
        if (this.f2689c) {
            return;
        }
        Activity activity = this.f2688b;
        if (activity != null) {
            ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener = this.f2692f;
            ViewTreeObserver viewTreeObserverH = h(activity);
            if (viewTreeObserverH != null) {
                viewTreeObserverH.addOnGlobalLayoutListener(onGlobalLayoutListener);
            }
        }
        View view = this.f2687a;
        ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener2 = this.f2692f;
        G4.t.c();
        C3287du.a(view, onGlobalLayoutListener2);
        this.f2689c = true;
    }

    private final void g() {
        Activity activity = this.f2688b;
        if (activity != null && this.f2689c) {
            ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener = this.f2692f;
            ViewTreeObserver viewTreeObserverH = h(activity);
            if (viewTreeObserverH != null) {
                viewTreeObserverH.removeOnGlobalLayoutListener(onGlobalLayoutListener);
            }
            this.f2689c = false;
        }
    }

    private static ViewTreeObserver h(Activity activity) {
        View decorView;
        Window window = activity.getWindow();
        if (window == null || (decorView = window.getDecorView()) == null) {
            return null;
        }
        return decorView.getViewTreeObserver();
    }

    public final void a(Activity activity) {
        this.f2688b = activity;
    }

    public final void b() {
        this.f2691e = true;
        if (this.f2690d) {
            f();
        }
    }

    public final void c() {
        this.f2691e = false;
        g();
    }

    public final void d() {
        this.f2690d = true;
        if (this.f2691e) {
            f();
        }
    }

    public final void e() {
        this.f2690d = false;
        g();
    }
}
