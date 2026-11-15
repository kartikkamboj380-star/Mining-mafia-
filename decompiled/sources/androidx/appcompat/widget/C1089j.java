package androidx.appcompat.widget;

import O.AbstractC0845c0;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.CompoundButton;

/* JADX INFO: renamed from: androidx.appcompat.widget.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
class C1089j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final CompoundButton f8331a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ColorStateList f8332b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private PorterDuff.Mode f8333c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f8334d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f8335e = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f8336f;

    C1089j(CompoundButton compoundButton) {
        this.f8331a = compoundButton;
    }

    void a() {
        Drawable drawableA = androidx.core.widget.c.a(this.f8331a);
        if (drawableA != null) {
            if (this.f8334d || this.f8335e) {
                Drawable drawableMutate = G.a.r(drawableA).mutate();
                if (this.f8334d) {
                    G.a.o(drawableMutate, this.f8332b);
                }
                if (this.f8335e) {
                    G.a.p(drawableMutate, this.f8333c);
                }
                if (drawableMutate.isStateful()) {
                    drawableMutate.setState(this.f8331a.getDrawableState());
                }
                this.f8331a.setButtonDrawable(drawableMutate);
            }
        }
    }

    ColorStateList b() {
        return this.f8332b;
    }

    PorterDuff.Mode c() {
        return this.f8333c;
    }

    void d(AttributeSet attributeSet, int i10) {
        int iN;
        int iN2;
        h0 h0VarV = h0.v(this.f8331a.getContext(), attributeSet, p060g.j.f44127U0, i10, 0);
        CompoundButton compoundButton = this.f8331a;
        AbstractC0845c0.k0(compoundButton, compoundButton.getContext(), p060g.j.f44127U0, attributeSet, h0VarV.r(), i10, 0);
        try {
            if (h0VarV.s(p060g.j.f44135W0) && (iN2 = h0VarV.n(p060g.j.f44135W0, 0)) != 0) {
                try {
                    CompoundButton compoundButton2 = this.f8331a;
                    compoundButton2.setButtonDrawable(p080i.a.b(compoundButton2.getContext(), iN2));
                } catch (Resources.NotFoundException unused) {
                    if (h0VarV.s(p060g.j.f44131V0)) {
                        CompoundButton compoundButton3 = this.f8331a;
                        compoundButton3.setButtonDrawable(p080i.a.b(compoundButton3.getContext(), iN));
                    }
                }
            } else if (h0VarV.s(p060g.j.f44131V0) && (iN = h0VarV.n(p060g.j.f44131V0, 0)) != 0) {
                CompoundButton compoundButton4 = this.f8331a;
                compoundButton4.setButtonDrawable(p080i.a.b(compoundButton4.getContext(), iN));
            }
            if (h0VarV.s(p060g.j.f44139X0)) {
                androidx.core.widget.c.d(this.f8331a, h0VarV.c(p060g.j.f44139X0));
            }
            if (h0VarV.s(p060g.j.f44143Y0)) {
                androidx.core.widget.c.e(this.f8331a, O.e(h0VarV.k(p060g.j.f44143Y0, -1), null));
            }
        } finally {
            h0VarV.x();
        }
    }

    void e() {
        if (this.f8336f) {
            this.f8336f = false;
        } else {
            this.f8336f = true;
            a();
        }
    }

    void f(ColorStateList colorStateList) {
        this.f8332b = colorStateList;
        this.f8334d = true;
        a();
    }

    void g(PorterDuff.Mode mode) {
        this.f8333c = mode;
        this.f8335e = true;
        a();
    }
}
