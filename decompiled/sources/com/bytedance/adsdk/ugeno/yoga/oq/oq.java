package com.bytedance.adsdk.ugeno.yoga.oq;

import android.view.View;
import android.view.ViewGroup;
import com.bytedance.adsdk.ugeno.yoga.nn;
import com.bytedance.adsdk.ugeno.yoga.rjo;
import com.bytedance.adsdk.ugeno.yoga.ubx;

/* JADX INFO: loaded from: classes.dex */
public class oq extends ViewGroup {
    @Override // android.view.ViewGroup
    public void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        if (view instanceof oq) {
            throw null;
        }
        nn nnVarKq = ubx.kq();
        bob.kq(new bob.kq(layoutParams), nnVarKq, view);
        nnVarKq.kq(view);
        nnVarKq.kq((rjo) new bob.oq());
        throw null;
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof bob.kq;
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new bob.kq(-1, -1);
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new bob.kq(layoutParams);
    }

    public nn getYogaNode() {
        throw null;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z9, int i10, int i11, int i12, int i13) {
        throw new RuntimeException("Attempting to layout a VirtualYogaLayout");
    }
}
