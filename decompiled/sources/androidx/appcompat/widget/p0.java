package androidx.appcompat.widget;

import O.AbstractC0845c0;
import O.AbstractC0851f0;
import android.text.TextUtils;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityManager;

/* JADX INFO: loaded from: classes.dex */
class p0 implements View.OnLongClickListener, View.OnHoverListener, View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static p0 f8386k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static p0 f8387l;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final View f8388a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final CharSequence f8389b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f8390c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Runnable f8391d = new Runnable() { // from class: androidx.appcompat.widget.n0
        @Override // java.lang.Runnable
        public final void run() {
            this.f8381a.h(false);
        }
    };

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Runnable f8392e = new Runnable() { // from class: androidx.appcompat.widget.o0
        @Override // java.lang.Runnable
        public final void run() {
            this.f8382a.d();
        }
    };

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f8393f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f8394g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private q0 f8395h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f8396i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f8397j;

    private p0(View view, CharSequence charSequence) {
        this.f8388a = view;
        this.f8389b = charSequence;
        this.f8390c = AbstractC0851f0.g(ViewConfiguration.get(view.getContext()));
        c();
        view.setOnLongClickListener(this);
        view.setOnHoverListener(this);
    }

    private void b() {
        this.f8388a.removeCallbacks(this.f8391d);
    }

    private void c() {
        this.f8397j = true;
    }

    private void e() {
        this.f8388a.postDelayed(this.f8391d, ViewConfiguration.getLongPressTimeout());
    }

    private static void f(p0 p0Var) {
        p0 p0Var2 = f8386k;
        if (p0Var2 != null) {
            p0Var2.b();
        }
        f8386k = p0Var;
        if (p0Var != null) {
            p0Var.e();
        }
    }

    public static void g(View view, CharSequence charSequence) {
        p0 p0Var = f8386k;
        if (p0Var != null && p0Var.f8388a == view) {
            f(null);
        }
        if (!TextUtils.isEmpty(charSequence)) {
            new p0(view, charSequence);
            return;
        }
        p0 p0Var2 = f8387l;
        if (p0Var2 != null && p0Var2.f8388a == view) {
            p0Var2.d();
        }
        view.setOnLongClickListener(null);
        view.setLongClickable(false);
        view.setOnHoverListener(null);
    }

    private boolean i(MotionEvent motionEvent) {
        int x10 = (int) motionEvent.getX();
        int y9 = (int) motionEvent.getY();
        if (!this.f8397j && Math.abs(x10 - this.f8393f) <= this.f8390c && Math.abs(y9 - this.f8394g) <= this.f8390c) {
            return false;
        }
        this.f8393f = x10;
        this.f8394g = y9;
        this.f8397j = false;
        return true;
    }

    void d() {
        if (f8387l == this) {
            f8387l = null;
            q0 q0Var = this.f8395h;
            if (q0Var != null) {
                q0Var.c();
                this.f8395h = null;
                c();
                this.f8388a.removeOnAttachStateChangeListener(this);
            } else {
                Log.e("TooltipCompatHandler", "sActiveHandler.mPopup == null");
            }
        }
        if (f8386k == this) {
            f(null);
        }
        this.f8388a.removeCallbacks(this.f8392e);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void h(boolean z9) {
        long longPressTimeout;
        long j10;
        long j11;
        if (this.f8388a.isAttachedToWindow()) {
            f(null);
            p0 p0Var = f8387l;
            if (p0Var != null) {
                p0Var.d();
            }
            f8387l = this;
            this.f8396i = z9;
            q0 q0Var = new q0(this.f8388a.getContext());
            this.f8395h = q0Var;
            q0Var.e(this.f8388a, this.f8393f, this.f8394g, this.f8396i, this.f8389b);
            this.f8388a.addOnAttachStateChangeListener(this);
            if (this.f8396i) {
                j11 = 2500;
            } else {
                if ((AbstractC0845c0.K(this.f8388a) & 1) == 1) {
                    longPressTimeout = ViewConfiguration.getLongPressTimeout();
                    j10 = 3000;
                } else {
                    longPressTimeout = ViewConfiguration.getLongPressTimeout();
                    j10 = 15000;
                }
                j11 = j10 - longPressTimeout;
            }
            this.f8388a.removeCallbacks(this.f8392e);
            this.f8388a.postDelayed(this.f8392e, j11);
        }
    }

    @Override // android.view.View.OnHoverListener
    public boolean onHover(View view, MotionEvent motionEvent) {
        if (this.f8395h != null && this.f8396i) {
            return false;
        }
        AccessibilityManager accessibilityManager = (AccessibilityManager) this.f8388a.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled()) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action != 7) {
            if (action == 10) {
                c();
                d();
            }
        } else if (this.f8388a.isEnabled() && this.f8395h == null && i(motionEvent)) {
            f(this);
        }
        return false;
    }

    @Override // android.view.View.OnLongClickListener
    public boolean onLongClick(View view) {
        this.f8393f = view.getWidth() / 2;
        this.f8394g = view.getHeight() / 2;
        h(true);
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        d();
    }
}
