package androidx.appcompat.widget;

import android.content.res.TypedArray;
import android.text.InputFilter;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.widget.TextView;

/* JADX INFO: renamed from: androidx.appcompat.widget.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
class C1093n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final TextView f8379a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final p051f0.f f8380b;

    C1093n(TextView textView) {
        this.f8379a = textView;
        this.f8380b = new p051f0.f(textView, false);
    }

    InputFilter[] a(InputFilter[] inputFilterArr) {
        return this.f8380b.a(inputFilterArr);
    }

    public boolean b() {
        return this.f8380b.b();
    }

    void c(AttributeSet attributeSet, int i10) {
        TypedArray typedArrayObtainStyledAttributes = this.f8379a.getContext().obtainStyledAttributes(attributeSet, p060g.j.f44181g0, i10, 0);
        try {
            boolean z9 = typedArrayObtainStyledAttributes.hasValue(p060g.j.f44251u0) ? typedArrayObtainStyledAttributes.getBoolean(p060g.j.f44251u0, true) : true;
            typedArrayObtainStyledAttributes.recycle();
            e(z9);
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }

    void d(boolean z9) {
        this.f8380b.c(z9);
    }

    void e(boolean z9) {
        this.f8380b.d(z9);
    }

    public TransformationMethod f(TransformationMethod transformationMethod) {
        return this.f8380b.e(transformationMethod);
    }
}
