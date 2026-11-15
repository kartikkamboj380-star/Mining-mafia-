package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import androidx.annotation.NonNull;

/* JADX INFO: renamed from: androidx.appcompat.widget.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1085f extends Button {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C1084e f8305a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C f8306b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private C1093n f8307c;

    public C1085f(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, p060g.a.f43868n);
    }

    @NonNull
    private C1093n getEmojiTextViewHelper() {
        if (this.f8307c == null) {
            this.f8307c = new C1093n(this);
        }
        return this.f8307c;
    }

    @Override // android.widget.TextView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        C1084e c1084e = this.f8305a;
        if (c1084e != null) {
            c1084e.b();
        }
        C c10 = this.f8306b;
        if (c10 != null) {
            c10.b();
        }
    }

    @Override // android.widget.TextView
    public int getAutoSizeMaxTextSize() {
        if (s0.f8421c) {
            return super.getAutoSizeMaxTextSize();
        }
        C c10 = this.f8306b;
        if (c10 != null) {
            return c10.e();
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeMinTextSize() {
        if (s0.f8421c) {
            return super.getAutoSizeMinTextSize();
        }
        C c10 = this.f8306b;
        if (c10 != null) {
            return c10.f();
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeStepGranularity() {
        if (s0.f8421c) {
            return super.getAutoSizeStepGranularity();
        }
        C c10 = this.f8306b;
        if (c10 != null) {
            return c10.g();
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int[] getAutoSizeTextAvailableSizes() {
        if (s0.f8421c) {
            return super.getAutoSizeTextAvailableSizes();
        }
        C c10 = this.f8306b;
        return c10 != null ? c10.h() : new int[0];
    }

    @Override // android.widget.TextView
    @SuppressLint({"WrongConstant"})
    public int getAutoSizeTextType() {
        if (s0.f8421c) {
            return super.getAutoSizeTextType() == 1 ? 1 : 0;
        }
        C c10 = this.f8306b;
        if (c10 != null) {
            return c10.i();
        }
        return 0;
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return androidx.core.widget.i.q(super.getCustomSelectionActionModeCallback());
    }

    public ColorStateList getSupportBackgroundTintList() {
        C1084e c1084e = this.f8305a;
        if (c1084e != null) {
            return c1084e.c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C1084e c1084e = this.f8305a;
        if (c1084e != null) {
            return c1084e.d();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f8306b.j();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f8306b.k();
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(Button.class.getName());
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(Button.class.getName());
    }

    @Override // android.widget.TextView, android.view.View
    protected void onLayout(boolean z9, int i10, int i11, int i12, int i13) {
        super.onLayout(z9, i10, i11, i12, i13);
        C c10 = this.f8306b;
        if (c10 != null) {
            c10.o(z9, i10, i11, i12, i13);
        }
    }

    @Override // android.widget.TextView
    protected void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        super.onTextChanged(charSequence, i10, i11, i12);
        C c10 = this.f8306b;
        if (c10 == null || s0.f8421c || !c10.l()) {
            return;
        }
        this.f8306b.c();
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z9) {
        super.setAllCaps(z9);
        getEmojiTextViewHelper().d(z9);
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeUniformWithConfiguration(int i10, int i11, int i12, int i13) {
        if (s0.f8421c) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i10, i11, i12, i13);
            return;
        }
        C c10 = this.f8306b;
        if (c10 != null) {
            c10.t(i10, i11, i12, i13);
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i10) {
        if (s0.f8421c) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i10);
            return;
        }
        C c10 = this.f8306b;
        if (c10 != null) {
            c10.u(iArr, i10);
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeWithDefaults(int i10) {
        if (s0.f8421c) {
            super.setAutoSizeTextTypeWithDefaults(i10);
            return;
        }
        C c10 = this.f8306b;
        if (c10 != null) {
            c10.v(i10);
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C1084e c1084e = this.f8305a;
        if (c1084e != null) {
            c1084e.f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i10) {
        super.setBackgroundResource(i10);
        C1084e c1084e = this.f8305a;
        if (c1084e != null) {
            c1084e.g(i10);
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(androidx.core.widget.i.r(this, callback));
    }

    public void setEmojiCompatEnabled(boolean z9) {
        getEmojiTextViewHelper().e(z9);
    }

    @Override // android.widget.TextView
    public void setFilters(@NonNull InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().a(inputFilterArr));
    }

    public void setSupportAllCaps(boolean z9) {
        C c10 = this.f8306b;
        if (c10 != null) {
            c10.s(z9);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C1084e c1084e = this.f8305a;
        if (c1084e != null) {
            c1084e.i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C1084e c1084e = this.f8305a;
        if (c1084e != null) {
            c1084e.j(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        this.f8306b.w(colorStateList);
        this.f8306b.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        this.f8306b.x(mode);
        this.f8306b.b();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i10) {
        super.setTextAppearance(context, i10);
        C c10 = this.f8306b;
        if (c10 != null) {
            c10.q(context, i10);
        }
    }

    @Override // android.widget.TextView
    public void setTextSize(int i10, float f10) {
        if (s0.f8421c) {
            super.setTextSize(i10, f10);
            return;
        }
        C c10 = this.f8306b;
        if (c10 != null) {
            c10.A(i10, f10);
        }
    }

    public C1085f(Context context, AttributeSet attributeSet, int i10) {
        super(e0.b(context), attributeSet, i10);
        d0.a(this, getContext());
        C1084e c1084e = new C1084e(this);
        this.f8305a = c1084e;
        c1084e.e(attributeSet, i10);
        C c10 = new C(this);
        this.f8306b = c10;
        c10.m(attributeSet, i10);
        c10.b();
        getEmojiTextViewHelper().c(attributeSet, i10);
    }
}
