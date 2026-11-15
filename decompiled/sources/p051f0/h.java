package p051f0;

import android.graphics.Rect;
import android.text.method.TransformationMethod;
import android.view.View;
import androidx.emoji2.text.e;

/* JADX INFO: loaded from: classes.dex */
class h implements TransformationMethod {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final TransformationMethod f43557a;

    h(TransformationMethod transformationMethod) {
        this.f43557a = transformationMethod;
    }

    public TransformationMethod a() {
        return this.f43557a;
    }

    @Override // android.text.method.TransformationMethod
    public CharSequence getTransformation(CharSequence charSequence, View view) {
        if (view.isInEditMode()) {
            return charSequence;
        }
        TransformationMethod transformationMethod = this.f43557a;
        if (transformationMethod != null) {
            charSequence = transformationMethod.getTransformation(charSequence, view);
        }
        return (charSequence == null || e.c().e() != 1) ? charSequence : e.c().p(charSequence);
    }

    @Override // android.text.method.TransformationMethod
    public void onFocusChanged(View view, CharSequence charSequence, boolean z9, int i10, Rect rect) {
        TransformationMethod transformationMethod = this.f43557a;
        if (transformationMethod != null) {
            transformationMethod.onFocusChanged(view, charSequence, z9, i10, rect);
        }
    }
}
