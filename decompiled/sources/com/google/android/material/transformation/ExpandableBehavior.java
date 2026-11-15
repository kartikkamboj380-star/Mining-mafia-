package com.google.android.material.transformation;

import D5.a;
import O.AbstractC0845c0;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.util.List;
import p070h.w;

/* JADX INFO: loaded from: classes2.dex */
@Deprecated
public abstract class ExpandableBehavior extends CoordinatorLayout.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f39780a;

    public ExpandableBehavior() {
        this.f39780a = 0;
    }

    protected a E(CoordinatorLayout coordinatorLayout, View view) {
        List listS = coordinatorLayout.s(view);
        int size = listS.size();
        for (int i10 = 0; i10 < size; i10++) {
            View view2 = (View) listS.get(i10);
            if (e(coordinatorLayout, view, view2)) {
                w.a(view2);
                return null;
            }
        }
        return null;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public abstract boolean e(CoordinatorLayout coordinatorLayout, View view, View view2);

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean h(CoordinatorLayout coordinatorLayout, View view, View view2) {
        w.a(view2);
        throw null;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean l(CoordinatorLayout coordinatorLayout, View view, int i10) {
        if (AbstractC0845c0.R(view)) {
            return false;
        }
        E(coordinatorLayout, view);
        return false;
    }

    public ExpandableBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f39780a = 0;
    }
}
