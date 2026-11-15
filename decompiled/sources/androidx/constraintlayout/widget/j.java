package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import com.unity3d.services.UnityAdsConstants;
import p240y.l;

/* JADX INFO: loaded from: classes.dex */
public abstract class j extends c {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f9051i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f9052j;

    public j(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // androidx.constraintlayout.widget.c
    protected void g(AttributeSet attributeSet) {
        super.g(attributeSet);
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, i.f8875a1);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i10);
                if (index == i.f8924h1) {
                    this.f9051i = true;
                } else if (index == i.f8973o1) {
                    this.f9052j = true;
                }
            }
        }
    }

    public abstract void n(l lVar, int i10, int i11);

    @Override // androidx.constraintlayout.widget.c, android.view.View
    public void onAttachedToWindow() {
        ViewParent parent;
        super.onAttachedToWindow();
        if ((this.f9051i || this.f9052j) && (parent = getParent()) != null && (parent instanceof ConstraintLayout)) {
            ConstraintLayout constraintLayout = (ConstraintLayout) parent;
            int visibility = getVisibility();
            float elevation = getElevation();
            for (int i10 = 0; i10 < this.f8594b; i10++) {
                View viewH = constraintLayout.h(this.f8593a[i10]);
                if (viewH != null) {
                    if (this.f9051i) {
                        viewH.setVisibility(visibility);
                    }
                    if (this.f9052j && elevation > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                        viewH.setTranslationZ(viewH.getTranslationZ() + elevation);
                    }
                }
            }
        }
    }

    @Override // android.view.View
    public void setElevation(float f10) {
        super.setElevation(f10);
        c();
    }

    @Override // android.view.View
    public void setVisibility(int i10) {
        super.setVisibility(i10);
        c();
    }
}
