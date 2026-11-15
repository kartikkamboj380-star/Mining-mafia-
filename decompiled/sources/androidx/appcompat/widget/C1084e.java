package androidx.appcompat.widget;

import O.AbstractC0845c0;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;

/* JADX INFO: renamed from: androidx.appcompat.widget.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
class C1084e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final View f8295a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private f0 f8298d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private f0 f8299e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private f0 f8300f;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f8297c = -1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C1090k f8296b = C1090k.b();

    C1084e(View view) {
        this.f8295a = view;
    }

    private boolean a(Drawable drawable) {
        if (this.f8300f == null) {
            this.f8300f = new f0();
        }
        f0 f0Var = this.f8300f;
        f0Var.a();
        ColorStateList colorStateListR = AbstractC0845c0.r(this.f8295a);
        if (colorStateListR != null) {
            f0Var.f8311d = true;
            f0Var.f8308a = colorStateListR;
        }
        PorterDuff.Mode modeS = AbstractC0845c0.s(this.f8295a);
        if (modeS != null) {
            f0Var.f8310c = true;
            f0Var.f8309b = modeS;
        }
        if (!f0Var.f8311d && !f0Var.f8310c) {
            return false;
        }
        C1090k.i(drawable, f0Var, this.f8295a.getDrawableState());
        return true;
    }

    private boolean k() {
        return this.f8298d != null;
    }

    void b() {
        Drawable background = this.f8295a.getBackground();
        if (background != null) {
            if (k() && a(background)) {
                return;
            }
            f0 f0Var = this.f8299e;
            if (f0Var != null) {
                C1090k.i(background, f0Var, this.f8295a.getDrawableState());
                return;
            }
            f0 f0Var2 = this.f8298d;
            if (f0Var2 != null) {
                C1090k.i(background, f0Var2, this.f8295a.getDrawableState());
            }
        }
    }

    ColorStateList c() {
        f0 f0Var = this.f8299e;
        if (f0Var != null) {
            return f0Var.f8308a;
        }
        return null;
    }

    PorterDuff.Mode d() {
        f0 f0Var = this.f8299e;
        if (f0Var != null) {
            return f0Var.f8309b;
        }
        return null;
    }

    void e(AttributeSet attributeSet, int i10) {
        h0 h0VarV = h0.v(this.f8295a.getContext(), attributeSet, p060g.j.f44082K3, i10, 0);
        View view = this.f8295a;
        AbstractC0845c0.k0(view, view.getContext(), p060g.j.f44082K3, attributeSet, h0VarV.r(), i10, 0);
        try {
            if (h0VarV.s(p060g.j.f44087L3)) {
                this.f8297c = h0VarV.n(p060g.j.f44087L3, -1);
                ColorStateList colorStateListF = this.f8296b.f(this.f8295a.getContext(), this.f8297c);
                if (colorStateListF != null) {
                    h(colorStateListF);
                }
            }
            if (h0VarV.s(p060g.j.f44092M3)) {
                AbstractC0845c0.r0(this.f8295a, h0VarV.c(p060g.j.f44092M3));
            }
            if (h0VarV.s(p060g.j.f44097N3)) {
                AbstractC0845c0.s0(this.f8295a, O.e(h0VarV.k(p060g.j.f44097N3, -1), null));
            }
        } finally {
            h0VarV.x();
        }
    }

    void f(Drawable drawable) {
        this.f8297c = -1;
        h(null);
        b();
    }

    void g(int i10) {
        this.f8297c = i10;
        C1090k c1090k = this.f8296b;
        h(c1090k != null ? c1090k.f(this.f8295a.getContext(), i10) : null);
        b();
    }

    void h(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (this.f8298d == null) {
                this.f8298d = new f0();
            }
            f0 f0Var = this.f8298d;
            f0Var.f8308a = colorStateList;
            f0Var.f8311d = true;
        } else {
            this.f8298d = null;
        }
        b();
    }

    void i(ColorStateList colorStateList) {
        if (this.f8299e == null) {
            this.f8299e = new f0();
        }
        f0 f0Var = this.f8299e;
        f0Var.f8308a = colorStateList;
        f0Var.f8311d = true;
        b();
    }

    void j(PorterDuff.Mode mode) {
        if (this.f8299e == null) {
            this.f8299e = new f0();
        }
        f0 f0Var = this.f8299e;
        f0Var.f8309b = mode;
        f0Var.f8310c = true;
        b();
    }
}
