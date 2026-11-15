package androidx.appcompat.widget;

import O.AbstractC0845c0;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.CheckedTextView;

/* JADX INFO: renamed from: androidx.appcompat.widget.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
class C1088i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final CheckedTextView f8324a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ColorStateList f8325b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private PorterDuff.Mode f8326c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f8327d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f8328e = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f8329f;

    C1088i(CheckedTextView checkedTextView) {
        this.f8324a = checkedTextView;
    }

    void a() {
        Drawable drawableA = androidx.core.widget.b.a(this.f8324a);
        if (drawableA != null) {
            if (this.f8327d || this.f8328e) {
                Drawable drawableMutate = G.a.r(drawableA).mutate();
                if (this.f8327d) {
                    G.a.o(drawableMutate, this.f8325b);
                }
                if (this.f8328e) {
                    G.a.p(drawableMutate, this.f8326c);
                }
                if (drawableMutate.isStateful()) {
                    drawableMutate.setState(this.f8324a.getDrawableState());
                }
                this.f8324a.setCheckMarkDrawable(drawableMutate);
            }
        }
    }

    ColorStateList b() {
        return this.f8325b;
    }

    PorterDuff.Mode c() {
        return this.f8326c;
    }

    void d(AttributeSet attributeSet, int i10) {
        int iN;
        int iN2;
        h0 h0VarV = h0.v(this.f8324a.getContext(), attributeSet, p060g.j.f44104P0, i10, 0);
        CheckedTextView checkedTextView = this.f8324a;
        AbstractC0845c0.k0(checkedTextView, checkedTextView.getContext(), p060g.j.f44104P0, attributeSet, h0VarV.r(), i10, 0);
        try {
            if (h0VarV.s(p060g.j.f44114R0) && (iN2 = h0VarV.n(p060g.j.f44114R0, 0)) != 0) {
                try {
                    CheckedTextView checkedTextView2 = this.f8324a;
                    checkedTextView2.setCheckMarkDrawable(p080i.a.b(checkedTextView2.getContext(), iN2));
                } catch (Resources.NotFoundException unused) {
                    if (h0VarV.s(p060g.j.f44109Q0)) {
                        CheckedTextView checkedTextView3 = this.f8324a;
                        checkedTextView3.setCheckMarkDrawable(p080i.a.b(checkedTextView3.getContext(), iN));
                    }
                }
            } else if (h0VarV.s(p060g.j.f44109Q0) && (iN = h0VarV.n(p060g.j.f44109Q0, 0)) != 0) {
                CheckedTextView checkedTextView4 = this.f8324a;
                checkedTextView4.setCheckMarkDrawable(p080i.a.b(checkedTextView4.getContext(), iN));
            }
            if (h0VarV.s(p060g.j.f44119S0)) {
                androidx.core.widget.b.b(this.f8324a, h0VarV.c(p060g.j.f44119S0));
            }
            if (h0VarV.s(p060g.j.f44123T0)) {
                androidx.core.widget.b.c(this.f8324a, O.e(h0VarV.k(p060g.j.f44123T0, -1), null));
            }
        } finally {
            h0VarV.x();
        }
    }

    void e() {
        if (this.f8329f) {
            this.f8329f = false;
        } else {
            this.f8329f = true;
            a();
        }
    }

    void f(ColorStateList colorStateList) {
        this.f8325b = colorStateList;
        this.f8327d = true;
        a();
    }

    void g(PorterDuff.Mode mode) {
        this.f8326c = mode;
        this.f8328e = true;
        a();
    }
}
