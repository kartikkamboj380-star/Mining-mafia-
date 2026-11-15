package com.bytedance.adsdk.ugeno.rhi;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public class oq extends kq<com.bytedance.adsdk.ugeno.oq.bob> {
    private com.bytedance.adsdk.ugeno.fou fou;

    public oq(Context context) {
        super(context);
    }

    public void kq(com.bytedance.adsdk.ugeno.fou fouVar) {
        this.fou = fouVar;
    }

    @Override // com.bytedance.adsdk.ugeno.rhi.kq
    public View nn(int i10) {
        return ((com.bytedance.adsdk.ugeno.oq.bob) this.kq.get(i10)).ubx();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        com.bytedance.adsdk.ugeno.fou fouVar = this.fou;
        if (fouVar != null) {
            fouVar.rjo();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        com.bytedance.adsdk.ugeno.fou fouVar = this.fou;
        if (fouVar != null) {
            fouVar.syt();
        }
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z9, int i10, int i11, int i12, int i13) {
        com.bytedance.adsdk.ugeno.fou fouVar = this.fou;
        if (fouVar != null) {
            fouVar.rhi();
        }
        super.onLayout(z9, i10, i11, i12, i13);
        com.bytedance.adsdk.ugeno.fou fouVar2 = this.fou;
        if (fouVar2 != null) {
            fouVar2.kq(i10, i11, i12, i13);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i10, int i11) {
        com.bytedance.adsdk.ugeno.fou fouVar = this.fou;
        if (fouVar != null) {
            int[] iArrKq = fouVar.kq(i10, i11);
            super.onMeasure(iArrKq[0], iArrKq[1]);
        } else {
            super.onMeasure(i10, i11);
        }
        com.bytedance.adsdk.ugeno.fou fouVar2 = this.fou;
        if (fouVar2 != null) {
            fouVar2.csi();
        }
    }

    @Override // android.view.View
    protected void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        com.bytedance.adsdk.ugeno.fou fouVar = this.fou;
        if (fouVar != null) {
            fouVar.oq(i10, i11, i12, i13);
        }
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z9) {
        super.onWindowFocusChanged(z9);
    }
}
