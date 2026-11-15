package androidx.appcompat.widget;

import O.AbstractC0845c0;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.util.AttributeSet;
import android.widget.ImageView;

/* JADX INFO: renamed from: androidx.appcompat.widget.q, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1096q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ImageView f8398a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private f0 f8399b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private f0 f8400c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private f0 f8401d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f8402e = 0;

    public C1096q(ImageView imageView) {
        this.f8398a = imageView;
    }

    private boolean a(Drawable drawable) {
        if (this.f8401d == null) {
            this.f8401d = new f0();
        }
        f0 f0Var = this.f8401d;
        f0Var.a();
        ColorStateList colorStateListA = androidx.core.widget.e.a(this.f8398a);
        if (colorStateListA != null) {
            f0Var.f8311d = true;
            f0Var.f8308a = colorStateListA;
        }
        PorterDuff.Mode modeB = androidx.core.widget.e.b(this.f8398a);
        if (modeB != null) {
            f0Var.f8310c = true;
            f0Var.f8309b = modeB;
        }
        if (!f0Var.f8311d && !f0Var.f8310c) {
            return false;
        }
        C1090k.i(drawable, f0Var, this.f8398a.getDrawableState());
        return true;
    }

    private boolean l() {
        return this.f8399b != null;
    }

    void b() {
        if (this.f8398a.getDrawable() != null) {
            this.f8398a.getDrawable().setLevel(this.f8402e);
        }
    }

    void c() {
        Drawable drawable = this.f8398a.getDrawable();
        if (drawable != null) {
            O.b(drawable);
        }
        if (drawable != null) {
            if (l() && a(drawable)) {
                return;
            }
            f0 f0Var = this.f8400c;
            if (f0Var != null) {
                C1090k.i(drawable, f0Var, this.f8398a.getDrawableState());
                return;
            }
            f0 f0Var2 = this.f8399b;
            if (f0Var2 != null) {
                C1090k.i(drawable, f0Var2, this.f8398a.getDrawableState());
            }
        }
    }

    ColorStateList d() {
        f0 f0Var = this.f8400c;
        if (f0Var != null) {
            return f0Var.f8308a;
        }
        return null;
    }

    PorterDuff.Mode e() {
        f0 f0Var = this.f8400c;
        if (f0Var != null) {
            return f0Var.f8309b;
        }
        return null;
    }

    boolean f() {
        return !(this.f8398a.getBackground() instanceof RippleDrawable);
    }

    public void g(AttributeSet attributeSet, int i10) {
        int iN;
        h0 h0VarV = h0.v(this.f8398a.getContext(), attributeSet, p060g.j.f44103P, i10, 0);
        ImageView imageView = this.f8398a;
        AbstractC0845c0.k0(imageView, imageView.getContext(), p060g.j.f44103P, attributeSet, h0VarV.r(), i10, 0);
        try {
            Drawable drawable = this.f8398a.getDrawable();
            if (drawable == null && (iN = h0VarV.n(p060g.j.f44108Q, -1)) != -1 && (drawable = p080i.a.b(this.f8398a.getContext(), iN)) != null) {
                this.f8398a.setImageDrawable(drawable);
            }
            if (drawable != null) {
                O.b(drawable);
            }
            if (h0VarV.s(p060g.j.f44113R)) {
                androidx.core.widget.e.c(this.f8398a, h0VarV.c(p060g.j.f44113R));
            }
            if (h0VarV.s(p060g.j.f44118S)) {
                androidx.core.widget.e.d(this.f8398a, O.e(h0VarV.k(p060g.j.f44118S, -1), null));
            }
        } finally {
            h0VarV.x();
        }
    }

    void h(Drawable drawable) {
        this.f8402e = drawable.getLevel();
    }

    public void i(int i10) {
        if (i10 != 0) {
            Drawable drawableB = p080i.a.b(this.f8398a.getContext(), i10);
            if (drawableB != null) {
                O.b(drawableB);
            }
            this.f8398a.setImageDrawable(drawableB);
        } else {
            this.f8398a.setImageDrawable(null);
        }
        c();
    }

    void j(ColorStateList colorStateList) {
        if (this.f8400c == null) {
            this.f8400c = new f0();
        }
        f0 f0Var = this.f8400c;
        f0Var.f8308a = colorStateList;
        f0Var.f8311d = true;
        c();
    }

    void k(PorterDuff.Mode mode) {
        if (this.f8400c == null) {
            this.f8400c = new f0();
        }
        f0 f0Var = this.f8400c;
        f0Var.f8309b = mode;
        f0Var.f8310c = true;
        c();
    }
}
