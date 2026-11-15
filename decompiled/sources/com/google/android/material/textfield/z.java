package com.google.android.material.textfield;

import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.EditText;

/* JADX INFO: loaded from: classes2.dex */
class z extends t {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f39709e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private EditText f39710f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final View.OnClickListener f39711g;

    z(s sVar, int i10) {
        super(sVar);
        this.f39709e = p186s5.d.f48720a;
        this.f39711g = new View.OnClickListener() { // from class: com.google.android.material.textfield.y
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                z.v(this.f39708a, view);
            }
        };
        if (i10 != 0) {
            this.f39709e = i10;
        }
    }

    public static /* synthetic */ void v(z zVar, View view) {
        EditText editText = zVar.f39710f;
        if (editText == null) {
            return;
        }
        int selectionEnd = editText.getSelectionEnd();
        if (zVar.w()) {
            zVar.f39710f.setTransformationMethod(null);
        } else {
            zVar.f39710f.setTransformationMethod(PasswordTransformationMethod.getInstance());
        }
        if (selectionEnd >= 0) {
            zVar.f39710f.setSelection(selectionEnd);
        }
        zVar.r();
    }

    private boolean w() {
        EditText editText = this.f39710f;
        return editText != null && (editText.getTransformationMethod() instanceof PasswordTransformationMethod);
    }

    private static boolean x(EditText editText) {
        if (editText != null) {
            return editText.getInputType() == 16 || editText.getInputType() == 128 || editText.getInputType() == 144 || editText.getInputType() == 224;
        }
        return false;
    }

    @Override // com.google.android.material.textfield.t
    void b(CharSequence charSequence, int i10, int i11, int i12) {
        r();
    }

    @Override // com.google.android.material.textfield.t
    int c() {
        return p186s5.i.f48803A;
    }

    @Override // com.google.android.material.textfield.t
    int d() {
        return this.f39709e;
    }

    @Override // com.google.android.material.textfield.t
    View.OnClickListener f() {
        return this.f39711g;
    }

    @Override // com.google.android.material.textfield.t
    boolean l() {
        return true;
    }

    @Override // com.google.android.material.textfield.t
    boolean m() {
        return !w();
    }

    @Override // com.google.android.material.textfield.t
    void n(EditText editText) {
        this.f39710f = editText;
        r();
    }

    @Override // com.google.android.material.textfield.t
    void s() {
        if (x(this.f39710f)) {
            this.f39710f.setTransformationMethod(PasswordTransformationMethod.getInstance());
        }
    }

    @Override // com.google.android.material.textfield.t
    void u() {
        EditText editText = this.f39710f;
        if (editText != null) {
            editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
        }
    }
}
