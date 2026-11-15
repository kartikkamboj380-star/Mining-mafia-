package com.google.android.material.appbar;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* JADX INFO: loaded from: classes2.dex */
abstract class f extends CoordinatorLayout.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private g f38686a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f38687b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f38688c;

    public f() {
        this.f38687b = 0;
        this.f38688c = 0;
    }

    public int E() {
        g gVar = this.f38686a;
        if (gVar != null) {
            return gVar.b();
        }
        return 0;
    }

    protected void F(CoordinatorLayout coordinatorLayout, View view, int i10) {
        coordinatorLayout.K(view, i10);
    }

    public boolean G(int i10) {
        g gVar = this.f38686a;
        if (gVar != null) {
            return gVar.e(i10);
        }
        this.f38687b = i10;
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean l(CoordinatorLayout coordinatorLayout, View view, int i10) {
        F(coordinatorLayout, view, i10);
        if (this.f38686a == null) {
            this.f38686a = new g(view);
        }
        this.f38686a.c();
        this.f38686a.a();
        int i11 = this.f38687b;
        if (i11 != 0) {
            this.f38686a.e(i11);
            this.f38687b = 0;
        }
        int i12 = this.f38688c;
        if (i12 == 0) {
            return true;
        }
        this.f38686a.d(i12);
        this.f38688c = 0;
        return true;
    }

    public f(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f38687b = 0;
        this.f38688c = 0;
    }
}
