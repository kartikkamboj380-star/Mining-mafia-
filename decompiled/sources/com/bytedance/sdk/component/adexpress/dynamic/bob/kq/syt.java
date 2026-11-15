package com.bytedance.sdk.component.adexpress.dynamic.bob.kq;

import android.view.MotionEvent;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public class syt implements View.OnTouchListener {
    private final int bob = 10;
    private float csi;
    private float fou;
    private final com.bytedance.sdk.component.adexpress.dynamic.bob.syt kq;
    private final boolean oq;
    private float rhi;
    private float rjo;

    public syt(com.bytedance.sdk.component.adexpress.dynamic.bob.syt sytVar, boolean z9) {
        this.kq = sytVar;
        this.oq = z9;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        com.bytedance.sdk.component.adexpress.dynamic.bob.syt sytVar;
        com.bytedance.sdk.component.adexpress.dynamic.bob.syt sytVar2;
        int action = motionEvent.getAction();
        if (action == 0) {
            this.fou = motionEvent.getX();
            this.csi = motionEvent.getY();
            new StringBuilder(", mStartY: ").append(this.csi);
        } else if (action == 1) {
            this.rhi = motionEvent.getX();
            this.rjo = motionEvent.getY();
            new StringBuilder(", mEndY: ").append(this.rjo);
            if (this.oq || (sytVar2 = this.kq) == null) {
                float f10 = this.rhi - this.fou;
                float f11 = this.rjo - this.csi;
                if (com.bytedance.sdk.component.adexpress.fou.rjo.oq(com.bytedance.sdk.component.adexpress.fou.kq(), Math.abs((float) Math.sqrt((f10 * f10) + (f11 * f11)))) > 10.0f && (sytVar = this.kq) != null) {
                    sytVar.kq();
                }
            } else {
                sytVar2.kq();
            }
        }
        return true;
    }
}
