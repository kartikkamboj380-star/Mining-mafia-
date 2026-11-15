package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.CheckedTextView;
import androidx.annotation.NonNull;

/* JADX INFO: renamed from: androidx.appcompat.widget.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1087h extends CheckedTextView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C1088i f8317a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C1084e f8318b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final C f8319c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private C1093n f8320d;

    public C1087h(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, p060g.a.f43870p);
    }

    @NonNull
    private C1093n getEmojiTextViewHelper() {
        if (this.f8320d == null) {
            this.f8320d = new C1093n(this);
        }
        return this.f8320d;
    }

    @Override // android.widget.CheckedTextView, android.widget.TextView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        C c10 = this.f8319c;
        if (c10 != null) {
            c10.b();
        }
        C1084e c1084e = this.f8318b;
        if (c1084e != null) {
            c1084e.b();
        }
        C1088i c1088i = this.f8317a;
        if (c1088i != null) {
            c1088i.a();
        }
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return androidx.core.widget.i.q(super.getCustomSelectionActionModeCallback());
    }

    public ColorStateList getSupportBackgroundTintList() {
        C1084e c1084e = this.f8318b;
        if (c1084e != null) {
            return c1084e.c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C1084e c1084e = this.f8318b;
        if (c1084e != null) {
            return c1084e.d();
        }
        return null;
    }

    public ColorStateList getSupportCheckMarkTintList() {
        C1088i c1088i = this.f8317a;
        if (c1088i != null) {
            return c1088i.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportCheckMarkTintMode() {
        C1088i c1088i = this.f8317a;
        if (c1088i != null) {
            return c1088i.c();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f8319c.j();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f8319c.k();
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        return AbstractC1094o.a(super.onCreateInputConnection(editorInfo), editorInfo, this);
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z9) {
        super.setAllCaps(z9);
        getEmojiTextViewHelper().d(z9);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C1084e c1084e = this.f8318b;
        if (c1084e != null) {
            c1084e.f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i10) {
        super.setBackgroundResource(i10);
        C1084e c1084e = this.f8318b;
        if (c1084e != null) {
            c1084e.g(i10);
        }
    }

    @Override // android.widget.CheckedTextView
    public void setCheckMarkDrawable(Drawable drawable) {
        super.setCheckMarkDrawable(drawable);
        C1088i c1088i = this.f8317a;
        if (c1088i != null) {
            c1088i.e();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C c10 = this.f8319c;
        if (c10 != null) {
            c10.p();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C c10 = this.f8319c;
        if (c10 != null) {
            c10.p();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(androidx.core.widget.i.r(this, callback));
    }

    public void setEmojiCompatEnabled(boolean z9) {
        getEmojiTextViewHelper().e(z9);
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C1084e c1084e = this.f8318b;
        if (c1084e != null) {
            c1084e.i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C1084e c1084e = this.f8318b;
        if (c1084e != null) {
            c1084e.j(mode);
        }
    }

    public void setSupportCheckMarkTintList(ColorStateList colorStateList) {
        C1088i c1088i = this.f8317a;
        if (c1088i != null) {
            c1088i.f(colorStateList);
        }
    }

    public void setSupportCheckMarkTintMode(PorterDuff.Mode mode) {
        C1088i c1088i = this.f8317a;
        if (c1088i != null) {
            c1088i.g(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        this.f8319c.w(colorStateList);
        this.f8319c.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        this.f8319c.x(mode);
        this.f8319c.b();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i10) {
        super.setTextAppearance(context, i10);
        C c10 = this.f8319c;
        if (c10 != null) {
            c10.q(context, i10);
        }
    }

    public C1087h(Context context, AttributeSet attributeSet, int i10) {
        super(e0.b(context), attributeSet, i10);
        d0.a(this, getContext());
        C c10 = new C(this);
        this.f8319c = c10;
        c10.m(attributeSet, i10);
        c10.b();
        C1084e c1084e = new C1084e(this);
        this.f8318b = c1084e;
        c1084e.e(attributeSet, i10);
        C1088i c1088i = new C1088i(this);
        this.f8317a = c1088i;
        c1088i.d(attributeSet, i10);
        getEmojiTextViewHelper().c(attributeSet, i10);
    }

    @Override // android.widget.CheckedTextView
    public void setCheckMarkDrawable(int i10) {
        setCheckMarkDrawable(p080i.a.b(getContext(), i10));
    }
}
