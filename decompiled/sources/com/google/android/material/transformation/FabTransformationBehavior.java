package com.google.android.material.transformation;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* JADX INFO: loaded from: classes2.dex */
@Deprecated
public abstract class FabTransformationBehavior extends ExpandableTransformationBehavior {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Rect f39781b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final RectF f39782c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final RectF f39783d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int[] f39784e;

    public FabTransformationBehavior() {
        this.f39781b = new Rect();
        this.f39782c = new RectF();
        this.f39783d = new RectF();
        this.f39784e = new int[2];
    }

    @Override // com.google.android.material.transformation.ExpandableBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean e(CoordinatorLayout coordinatorLayout, View view, View view2) {
        if (view.getVisibility() != 8) {
            return false;
        }
        throw new IllegalStateException("This behavior cannot be attached to a GONE view. Set the view to INVISIBLE instead.");
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void g(CoordinatorLayout.f fVar) {
        if (fVar.f9086h == 0) {
            fVar.f9086h = 80;
        }
    }

    public FabTransformationBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f39781b = new Rect();
        this.f39782c = new RectF();
        this.f39783d = new RectF();
        this.f39784e = new int[2];
    }
}
