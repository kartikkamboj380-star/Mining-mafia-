package com.bytedance.sdk.component.adexpress.dynamic.bob.kq;

import android.view.MotionEvent;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public class rhi implements View.OnTouchListener {
    private static int bob = 10;
    private com.bytedance.sdk.component.adexpress.dynamic.bob.syt csi;
    private boolean fou;
    private float kq;
    private float oq;

    public rhi(com.bytedance.sdk.component.adexpress.dynamic.bob.syt sytVar) {
        this.csi = sytVar;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            this.kq = motionEvent.getX();
            this.oq = motionEvent.getY();
        } else if (action != 1) {
            if (action == 2) {
                float x10 = motionEvent.getX();
                float y9 = motionEvent.getY();
                if (Math.abs(x10 - this.kq) >= bob || Math.abs(y9 - this.oq) >= bob) {
                    this.fou = true;
                }
            } else if (action == 3) {
                this.fou = false;
            }
        } else {
            if (this.fou) {
                this.fou = false;
                return false;
            }
            float x11 = motionEvent.getX();
            float y10 = motionEvent.getY();
            if (Math.abs(x11 - this.kq) >= bob || Math.abs(y10 - this.oq) >= bob) {
                this.fou = false;
            } else {
                com.bytedance.sdk.component.adexpress.dynamic.bob.syt sytVar = this.csi;
                if (sytVar != null) {
                    sytVar.kq();
                }
            }
        }
        return true;
    }
}
