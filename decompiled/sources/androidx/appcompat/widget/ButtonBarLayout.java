package androidx.appcompat.widget;

import O.AbstractC0845c0;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.LinearLayoutManager;

/* JADX INFO: loaded from: classes.dex */
public class ButtonBarLayout extends LinearLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f7857a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f7858b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f7859c;

    public ButtonBarLayout(@NonNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f7859c = -1;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, p060g.j.f44094N0);
        AbstractC0845c0.k0(this, context, p060g.j.f44094N0, attributeSet, typedArrayObtainStyledAttributes, 0, 0);
        this.f7857a = typedArrayObtainStyledAttributes.getBoolean(p060g.j.f44099O0, true);
        typedArrayObtainStyledAttributes.recycle();
        if (getOrientation() == 1) {
            setStacked(this.f7857a);
        }
    }

    private int a(int i10) {
        int childCount = getChildCount();
        while (i10 < childCount) {
            if (getChildAt(i10).getVisibility() == 0) {
                return i10;
            }
            i10++;
        }
        return -1;
    }

    private boolean b() {
        return this.f7858b;
    }

    private void setStacked(boolean z9) {
        if (this.f7858b != z9) {
            if (!z9 || this.f7857a) {
                this.f7858b = z9;
                setOrientation(z9 ? 1 : 0);
                setGravity(z9 ? 8388613 : 80);
                View viewFindViewById = findViewById(p060g.f.f43954G);
                if (viewFindViewById != null) {
                    viewFindViewById.setVisibility(z9 ? 8 : 4);
                }
                for (int childCount = getChildCount() - 2; childCount >= 0; childCount--) {
                    bringChildToFront(getChildAt(childCount));
                }
            }
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i10, int i11) {
        int iMakeMeasureSpec;
        boolean z9;
        int size = View.MeasureSpec.getSize(i10);
        int paddingBottom = 0;
        if (this.f7857a) {
            if (size > this.f7859c && b()) {
                setStacked(false);
            }
            this.f7859c = size;
        }
        if (b() || View.MeasureSpec.getMode(i10) != 1073741824) {
            iMakeMeasureSpec = i10;
            z9 = false;
        } else {
            iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size, LinearLayoutManager.INVALID_OFFSET);
            z9 = true;
        }
        super.onMeasure(iMakeMeasureSpec, i11);
        if (this.f7857a && !b() && (getMeasuredWidthAndState() & (-16777216)) == 16777216) {
            setStacked(true);
            z9 = true;
        }
        if (z9) {
            super.onMeasure(i10, i11);
        }
        int iA = a(0);
        if (iA >= 0) {
            View childAt = getChildAt(iA);
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) childAt.getLayoutParams();
            int paddingTop = getPaddingTop() + childAt.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            if (b()) {
                int iA2 = a(iA + 1);
                if (iA2 >= 0) {
                    paddingTop += getChildAt(iA2).getPaddingTop() + ((int) (getResources().getDisplayMetrics().density * 16.0f));
                }
                paddingBottom = paddingTop;
            } else {
                paddingBottom = paddingTop + getPaddingBottom();
            }
        }
        if (AbstractC0845c0.A(this) != paddingBottom) {
            setMinimumHeight(paddingBottom);
            if (i11 == 0) {
                super.onMeasure(i10, i11);
            }
        }
    }

    public void setAllowStacking(boolean z9) {
        if (this.f7857a != z9) {
            this.f7857a = z9;
            if (!z9 && b()) {
                setStacked(false);
            }
            requestLayout();
        }
    }
}
