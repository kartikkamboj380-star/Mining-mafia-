package com.bytedance.sdk.openadsdk.common;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"ViewConstructor"})
public class nze extends View {
    private final kq kq;
    private View oq;

    public interface kq {
        View kq(Context context);
    }

    public nze(Context context, kq kqVar) {
        super(context);
        this.kq = kqVar;
        kq();
    }

    private void kq() {
        setVisibility(8);
        setWillNotDraw(true);
    }

    private View oq() {
        kq kqVar;
        if (this.oq == null && (kqVar = this.kq) != null) {
            this.oq = kqVar.kq(getContext());
            kq(this.oq, (ViewGroup) getParent());
        }
        return this.oq;
    }

    @Override // android.view.View
    @SuppressLint({"MissingSuperCall"})
    protected void dispatchDraw(Canvas canvas) {
    }

    @Override // android.view.View
    @SuppressLint({"MissingSuperCall"})
    public void draw(Canvas canvas) {
    }

    @Override // android.view.View
    protected void onMeasure(int i10, int i11) {
        setMeasuredDimension(0, 0);
    }

    @Override // android.view.View
    public void setVisibility(int i10) {
        View view = this.oq;
        if (view != null) {
            view.setVisibility(i10);
            return;
        }
        super.setVisibility(i10);
        if (i10 == 0 || i10 == 4) {
            oq();
        }
    }

    private void kq(View view, ViewGroup viewGroup) {
        int iIndexOfChild = viewGroup.indexOfChild(this);
        viewGroup.removeViewInLayout(this);
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams != null) {
            viewGroup.addView(view, iIndexOfChild, layoutParams);
        } else {
            viewGroup.addView(view, iIndexOfChild);
        }
    }
}
