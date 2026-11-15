package com.bytedance.adsdk.ugeno.dgq.oq;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import com.bytedance.adsdk.ugeno.core.wki;
import com.bytedance.adsdk.ugeno.fou;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class kq extends FrameLayout {
    private fou kq;
    private Map<Integer, wki> oq;

    public kq(Context context) {
        super(context);
    }

    public void kq(fou fouVar) {
        this.kq = fouVar;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        fou fouVar = this.kq;
        if (fouVar != null) {
            fouVar.rjo();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        fou fouVar = this.kq;
        if (fouVar != null) {
            fouVar.syt();
        }
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        Map<Integer, wki> map = this.oq;
        if (map == null || !map.containsKey(4)) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        return true;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z9, int i10, int i11, int i12, int i13) {
        fou fouVar = this.kq;
        if (fouVar != null) {
            fouVar.rhi();
        }
        super.onLayout(z9, i10, i11, i12, i13);
        fou fouVar2 = this.kq;
        if (fouVar2 != null) {
            fouVar2.kq(i10, i11, i12, i13);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i10, int i11) {
        fou fouVar = this.kq;
        if (fouVar != null) {
            int[] iArrKq = fouVar.kq(i10, i11);
            super.onMeasure(iArrKq[0], iArrKq[1]);
        } else {
            super.onMeasure(i10, i11);
        }
        fou fouVar2 = this.kq;
        if (fouVar2 != null) {
            fouVar2.csi();
        }
    }

    @Override // android.view.View
    protected void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        fou fouVar = this.kq;
        if (fouVar != null) {
            fouVar.oq(i10, i11, i12, i13);
        }
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z9) {
        super.onWindowFocusChanged(z9);
    }

    public void setEventMap(Map<Integer, wki> map) {
        this.oq = map;
    }
}
