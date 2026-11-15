package com.google.android.material.textfield;

import P.AbstractC0921c;
import android.content.Context;
import android.text.Editable;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.widget.EditText;
import com.google.android.material.internal.CheckableImageButton;

/* JADX INFO: loaded from: classes2.dex */
abstract class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final TextInputLayout f39658a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final s f39659b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final Context f39660c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final CheckableImageButton f39661d;

    t(s sVar) {
        this.f39658a = sVar.f39636a;
        this.f39659b = sVar;
        this.f39660c = sVar.getContext();
        this.f39661d = sVar.r();
    }

    void a(Editable editable) {
    }

    void b(CharSequence charSequence, int i10, int i11, int i12) {
    }

    int c() {
        return 0;
    }

    int d() {
        return 0;
    }

    View.OnFocusChangeListener e() {
        return null;
    }

    View.OnClickListener f() {
        return null;
    }

    View.OnFocusChangeListener g() {
        return null;
    }

    AbstractC0921c.a h() {
        return null;
    }

    boolean i(int i10) {
        return true;
    }

    boolean j() {
        return false;
    }

    boolean k() {
        return false;
    }

    boolean l() {
        return false;
    }

    boolean m() {
        return false;
    }

    void n(EditText editText) {
    }

    void p(View view, AccessibilityEvent accessibilityEvent) {
    }

    void q(boolean z9) {
    }

    final void r() {
        this.f39659b.L(false);
    }

    void s() {
    }

    boolean t() {
        return false;
    }

    void u() {
    }

    void o(View view, P.A a10) {
    }
}
