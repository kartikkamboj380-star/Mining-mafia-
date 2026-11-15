package androidx.appcompat.widget;

import android.content.res.TypedArray;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;

/* JADX INFO: renamed from: androidx.appcompat.widget.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
class C1092m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final EditText f8377a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final p051f0.a f8378b;

    C1092m(EditText editText) {
        this.f8377a = editText;
        this.f8378b = new p051f0.a(editText, false);
    }

    KeyListener a(KeyListener keyListener) {
        return b(keyListener) ? this.f8378b.a(keyListener) : keyListener;
    }

    boolean b(KeyListener keyListener) {
        return !(keyListener instanceof NumberKeyListener);
    }

    void c(AttributeSet attributeSet, int i10) {
        TypedArray typedArrayObtainStyledAttributes = this.f8377a.getContext().obtainStyledAttributes(attributeSet, p060g.j.f44181g0, i10, 0);
        try {
            boolean z9 = typedArrayObtainStyledAttributes.hasValue(p060g.j.f44251u0) ? typedArrayObtainStyledAttributes.getBoolean(p060g.j.f44251u0, true) : true;
            typedArrayObtainStyledAttributes.recycle();
            e(z9);
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }

    InputConnection d(InputConnection inputConnection, EditorInfo editorInfo) {
        return this.f8378b.b(inputConnection, editorInfo);
    }

    void e(boolean z9) {
        this.f8378b.c(z9);
    }
}
