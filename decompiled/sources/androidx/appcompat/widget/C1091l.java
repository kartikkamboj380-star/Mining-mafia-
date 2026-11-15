package androidx.appcompat.widget;

import O.AbstractC0845c0;
import O.C0846d;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Editable;
import android.text.method.KeyListener;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.DragEvent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.view.textclassifier.TextClassifier;
import android.widget.EditText;
import androidx.annotation.NonNull;

/* JADX INFO: renamed from: androidx.appcompat.widget.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1091l extends EditText implements O.L {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C1084e f8348a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C f8349b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final B f8350c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final androidx.core.widget.j f8351d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final C1092m f8352e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private a f8353f;

    /* JADX INFO: renamed from: androidx.appcompat.widget.l$a */
    class a {
        a() {
        }

        public TextClassifier a() {
            return C1091l.super.getTextClassifier();
        }

        public void b(TextClassifier textClassifier) {
            C1091l.super.setTextClassifier(textClassifier);
        }
    }

    public C1091l(Context context) {
        this(context, null);
    }

    @NonNull
    private a getSuperCaller() {
        if (this.f8353f == null) {
            this.f8353f = new a();
        }
        return this.f8353f;
    }

    @Override // O.L
    public C0846d a(C0846d c0846d) {
        return this.f8351d.a(this, c0846d);
    }

    void d(C1092m c1092m) {
        KeyListener keyListener = getKeyListener();
        if (c1092m.b(keyListener)) {
            boolean zIsFocusable = super.isFocusable();
            boolean zIsClickable = super.isClickable();
            boolean zIsLongClickable = super.isLongClickable();
            int inputType = super.getInputType();
            KeyListener keyListenerA = c1092m.a(keyListener);
            if (keyListenerA == keyListener) {
                return;
            }
            super.setKeyListener(keyListenerA);
            super.setRawInputType(inputType);
            super.setFocusable(zIsFocusable);
            super.setClickable(zIsClickable);
            super.setLongClickable(zIsLongClickable);
        }
    }

    @Override // android.widget.TextView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        C1084e c1084e = this.f8348a;
        if (c1084e != null) {
            c1084e.b();
        }
        C c10 = this.f8349b;
        if (c10 != null) {
            c10.b();
        }
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return androidx.core.widget.i.q(super.getCustomSelectionActionModeCallback());
    }

    public ColorStateList getSupportBackgroundTintList() {
        C1084e c1084e = this.f8348a;
        if (c1084e != null) {
            return c1084e.c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C1084e c1084e = this.f8348a;
        if (c1084e != null) {
            return c1084e.d();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f8349b.j();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f8349b.k();
    }

    @Override // android.widget.TextView
    @NonNull
    public TextClassifier getTextClassifier() {
        B b10;
        return (Build.VERSION.SDK_INT >= 28 || (b10 = this.f8350c) == null) ? getSuperCaller().a() : b10.a();
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        String[] strArrC;
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.f8349b.r(this, inputConnectionOnCreateInputConnection, editorInfo);
        InputConnection inputConnectionA = AbstractC1094o.a(inputConnectionOnCreateInputConnection, editorInfo, this);
        if (inputConnectionA != null && Build.VERSION.SDK_INT <= 30 && (strArrC = AbstractC0845c0.C(this)) != null) {
            R.c.d(editorInfo, strArrC);
            inputConnectionA = R.e.c(this, inputConnectionA, editorInfo);
        }
        return this.f8352e.d(inputConnectionA, editorInfo);
    }

    @Override // android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i10 = Build.VERSION.SDK_INT;
        if (i10 < 30 || i10 >= 33) {
            return;
        }
        ((InputMethodManager) getContext().getSystemService("input_method")).isActive(this);
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onDragEvent(DragEvent dragEvent) {
        if (AbstractC1102x.a(this, dragEvent)) {
            return true;
        }
        return super.onDragEvent(dragEvent);
    }

    @Override // android.widget.EditText, android.widget.TextView
    public boolean onTextContextMenuItem(int i10) {
        if (AbstractC1102x.b(this, i10)) {
            return true;
        }
        return super.onTextContextMenuItem(i10);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C1084e c1084e = this.f8348a;
        if (c1084e != null) {
            c1084e.f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i10) {
        super.setBackgroundResource(i10);
        C1084e c1084e = this.f8348a;
        if (c1084e != null) {
            c1084e.g(i10);
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C c10 = this.f8349b;
        if (c10 != null) {
            c10.p();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C c10 = this.f8349b;
        if (c10 != null) {
            c10.p();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(androidx.core.widget.i.r(this, callback));
    }

    public void setEmojiCompatEnabled(boolean z9) {
        this.f8352e.e(z9);
    }

    @Override // android.widget.TextView
    public void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(this.f8352e.a(keyListener));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C1084e c1084e = this.f8348a;
        if (c1084e != null) {
            c1084e.i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C1084e c1084e = this.f8348a;
        if (c1084e != null) {
            c1084e.j(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        this.f8349b.w(colorStateList);
        this.f8349b.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        this.f8349b.x(mode);
        this.f8349b.b();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i10) {
        super.setTextAppearance(context, i10);
        C c10 = this.f8349b;
        if (c10 != null) {
            c10.q(context, i10);
        }
    }

    @Override // android.widget.TextView
    public void setTextClassifier(TextClassifier textClassifier) {
        B b10;
        if (Build.VERSION.SDK_INT >= 28 || (b10 = this.f8350c) == null) {
            getSuperCaller().b(textClassifier);
        } else {
            b10.b(textClassifier);
        }
    }

    public C1091l(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, p060g.a.f43880z);
    }

    @Override // android.widget.EditText, android.widget.TextView
    public Editable getText() {
        return Build.VERSION.SDK_INT >= 28 ? super.getText() : super.getEditableText();
    }

    public C1091l(Context context, AttributeSet attributeSet, int i10) {
        super(e0.b(context), attributeSet, i10);
        d0.a(this, getContext());
        C1084e c1084e = new C1084e(this);
        this.f8348a = c1084e;
        c1084e.e(attributeSet, i10);
        C c10 = new C(this);
        this.f8349b = c10;
        c10.m(attributeSet, i10);
        c10.b();
        this.f8350c = new B(this);
        this.f8351d = new androidx.core.widget.j();
        C1092m c1092m = new C1092m(this);
        this.f8352e = c1092m;
        c1092m.c(attributeSet, i10);
        d(c1092m);
    }
}
