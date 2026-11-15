package androidx.appcompat.widget;

import O.AbstractC0845c0;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.SeekBar;
import com.unity3d.services.UnityAdsConstants;

/* JADX INFO: renamed from: androidx.appcompat.widget.z, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
class C1104z extends C1099u {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final SeekBar f8433d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Drawable f8434e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private ColorStateList f8435f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private PorterDuff.Mode f8436g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f8437h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f8438i;

    C1104z(SeekBar seekBar) {
        super(seekBar);
        this.f8435f = null;
        this.f8436g = null;
        this.f8437h = false;
        this.f8438i = false;
        this.f8433d = seekBar;
    }

    private void f() {
        Drawable drawable = this.f8434e;
        if (drawable != null) {
            if (this.f8437h || this.f8438i) {
                Drawable drawableR = G.a.r(drawable.mutate());
                this.f8434e = drawableR;
                if (this.f8437h) {
                    G.a.o(drawableR, this.f8435f);
                }
                if (this.f8438i) {
                    G.a.p(this.f8434e, this.f8436g);
                }
                if (this.f8434e.isStateful()) {
                    this.f8434e.setState(this.f8433d.getDrawableState());
                }
            }
        }
    }

    @Override // androidx.appcompat.widget.C1099u
    void c(AttributeSet attributeSet, int i10) {
        super.c(attributeSet, i10);
        h0 h0VarV = h0.v(this.f8433d.getContext(), attributeSet, p060g.j.f44122T, i10, 0);
        SeekBar seekBar = this.f8433d;
        AbstractC0845c0.k0(seekBar, seekBar.getContext(), p060g.j.f44122T, attributeSet, h0VarV.r(), i10, 0);
        Drawable drawableH = h0VarV.h(p060g.j.f44126U);
        if (drawableH != null) {
            this.f8433d.setThumb(drawableH);
        }
        j(h0VarV.g(p060g.j.f44130V));
        if (h0VarV.s(p060g.j.f44138X)) {
            this.f8436g = O.e(h0VarV.k(p060g.j.f44138X, -1), this.f8436g);
            this.f8438i = true;
        }
        if (h0VarV.s(p060g.j.f44134W)) {
            this.f8435f = h0VarV.c(p060g.j.f44134W);
            this.f8437h = true;
        }
        h0VarV.x();
        f();
    }

    void g(Canvas canvas) {
        if (this.f8434e != null) {
            int max = this.f8433d.getMax();
            if (max > 1) {
                int intrinsicWidth = this.f8434e.getIntrinsicWidth();
                int intrinsicHeight = this.f8434e.getIntrinsicHeight();
                int i10 = intrinsicWidth >= 0 ? intrinsicWidth / 2 : 1;
                int i11 = intrinsicHeight >= 0 ? intrinsicHeight / 2 : 1;
                this.f8434e.setBounds(-i10, -i11, i10, i11);
                float width = ((this.f8433d.getWidth() - this.f8433d.getPaddingLeft()) - this.f8433d.getPaddingRight()) / max;
                int iSave = canvas.save();
                canvas.translate(this.f8433d.getPaddingLeft(), this.f8433d.getHeight() / 2);
                for (int i12 = 0; i12 <= max; i12++) {
                    this.f8434e.draw(canvas);
                    canvas.translate(width, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                }
                canvas.restoreToCount(iSave);
            }
        }
    }

    void h() {
        Drawable drawable = this.f8434e;
        if (drawable != null && drawable.isStateful() && drawable.setState(this.f8433d.getDrawableState())) {
            this.f8433d.invalidateDrawable(drawable);
        }
    }

    void i() {
        Drawable drawable = this.f8434e;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    void j(Drawable drawable) {
        Drawable drawable2 = this.f8434e;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f8434e = drawable;
        if (drawable != null) {
            drawable.setCallback(this.f8433d);
            G.a.m(drawable, this.f8433d.getLayoutDirection());
            if (drawable.isStateful()) {
                drawable.setState(this.f8433d.getDrawableState());
            }
            f();
        }
        this.f8433d.invalidate();
    }
}
