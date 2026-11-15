package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.CheckBox;
import androidx.annotation.NonNull;

/* JADX INFO: renamed from: androidx.appcompat.widget.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1086g extends CheckBox implements androidx.core.widget.k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C1089j f8312a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C1084e f8313b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final C f8314c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private C1093n f8315d;

    public C1086g(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, p060g.a.f43869o);
    }

    @NonNull
    private C1093n getEmojiTextViewHelper() {
        if (this.f8315d == null) {
            this.f8315d = new C1093n(this);
        }
        return this.f8315d;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        C1084e c1084e = this.f8313b;
        if (c1084e != null) {
            c1084e.b();
        }
        C c10 = this.f8314c;
        if (c10 != null) {
            c10.b();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        C1084e c1084e = this.f8313b;
        if (c1084e != null) {
            return c1084e.c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C1084e c1084e = this.f8313b;
        if (c1084e != null) {
            return c1084e.d();
        }
        return null;
    }

    @Override // androidx.core.widget.k
    public ColorStateList getSupportButtonTintList() {
        C1089j c1089j = this.f8312a;
        if (c1089j != null) {
            return c1089j.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportButtonTintMode() {
        C1089j c1089j = this.f8312a;
        if (c1089j != null) {
            return c1089j.c();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f8314c.j();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f8314c.k();
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z9) {
        super.setAllCaps(z9);
        getEmojiTextViewHelper().d(z9);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C1084e c1084e = this.f8313b;
        if (c1084e != null) {
            c1084e.f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i10) {
        super.setBackgroundResource(i10);
        C1084e c1084e = this.f8313b;
        if (c1084e != null) {
            c1084e.g(i10);
        }
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(Drawable drawable) {
        super.setButtonDrawable(drawable);
        C1089j c1089j = this.f8312a;
        if (c1089j != null) {
            c1089j.e();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C c10 = this.f8314c;
        if (c10 != null) {
            c10.p();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C c10 = this.f8314c;
        if (c10 != null) {
            c10.p();
        }
    }

    public void setEmojiCompatEnabled(boolean z9) {
        getEmojiTextViewHelper().e(z9);
    }

    @Override // android.widget.TextView
    public void setFilters(@NonNull InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().a(inputFilterArr));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C1084e c1084e = this.f8313b;
        if (c1084e != null) {
            c1084e.i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C1084e c1084e = this.f8313b;
        if (c1084e != null) {
            c1084e.j(mode);
        }
    }

    @Override // androidx.core.widget.k
    public void setSupportButtonTintList(ColorStateList colorStateList) {
        C1089j c1089j = this.f8312a;
        if (c1089j != null) {
            c1089j.f(colorStateList);
        }
    }

    @Override // androidx.core.widget.k
    public void setSupportButtonTintMode(PorterDuff.Mode mode) {
        C1089j c1089j = this.f8312a;
        if (c1089j != null) {
            c1089j.g(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        this.f8314c.w(colorStateList);
        this.f8314c.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        this.f8314c.x(mode);
        this.f8314c.b();
    }

    public C1086g(Context context, AttributeSet attributeSet, int i10) {
        super(e0.b(context), attributeSet, i10);
        d0.a(this, getContext());
        C1089j c1089j = new C1089j(this);
        this.f8312a = c1089j;
        c1089j.d(attributeSet, i10);
        C1084e c1084e = new C1084e(this);
        this.f8313b = c1084e;
        c1084e.e(attributeSet, i10);
        C c10 = new C(this);
        this.f8314c = c10;
        c10.m(attributeSet, i10);
        getEmojiTextViewHelper().c(attributeSet, i10);
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(int i10) {
        setButtonDrawable(p080i.a.b(getContext(), i10));
    }
}
