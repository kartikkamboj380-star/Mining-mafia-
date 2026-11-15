package com.google.android.material.snackbar;

import F5.d;
import O.AbstractC0845c0;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.text.Layout;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import p186s5.c;
import p186s5.e;

/* JADX INFO: loaded from: classes2.dex */
public class SnackbarContentLayout extends LinearLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private TextView f39479a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Button f39480b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final TimeInterpolator f39481c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f39482d;

    public SnackbarContentLayout(@NonNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f39481c = d.g(context, p186s5.a.f48601N, p196t5.a.f49671b);
    }

    private static void a(View view, int i10, int i11) {
        if (AbstractC0845c0.T(view)) {
            AbstractC0845c0.B0(view, AbstractC0845c0.E(view), i10, AbstractC0845c0.D(view), i11);
        } else {
            view.setPadding(view.getPaddingLeft(), i10, view.getPaddingRight(), i11);
        }
    }

    private boolean b(int i10, int i11, int i12) {
        boolean z9;
        if (i10 != getOrientation()) {
            setOrientation(i10);
            z9 = true;
        } else {
            z9 = false;
        }
        if (this.f39479a.getPaddingTop() == i11 && this.f39479a.getPaddingBottom() == i12) {
            return z9;
        }
        a(this.f39479a, i11, i12);
        return true;
    }

    public Button getActionView() {
        return this.f39480b;
    }

    public TextView getMessageView() {
        return this.f39479a;
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        this.f39479a = (TextView) findViewById(e.f48744N);
        this.f39480b = (Button) findViewById(e.f48743M);
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        if (getOrientation() == 1) {
            return;
        }
        int dimensionPixelSize = getResources().getDimensionPixelSize(c.f48700l);
        int dimensionPixelSize2 = getResources().getDimensionPixelSize(c.f48698k);
        Layout layout = this.f39479a.getLayout();
        boolean z9 = layout != null && layout.getLineCount() > 1;
        if (!z9 || this.f39482d <= 0 || this.f39480b.getMeasuredWidth() <= this.f39482d) {
            if (!z9) {
                dimensionPixelSize = dimensionPixelSize2;
            }
            if (!b(0, dimensionPixelSize, dimensionPixelSize)) {
                return;
            }
        } else if (!b(1, dimensionPixelSize, dimensionPixelSize - dimensionPixelSize2)) {
            return;
        }
        super.onMeasure(i10, i11);
    }

    public void setMaxInlineActionWidth(int i10) {
        this.f39482d = i10;
    }
}
