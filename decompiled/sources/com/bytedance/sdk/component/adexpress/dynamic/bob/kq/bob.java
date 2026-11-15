package com.bytedance.sdk.component.adexpress.dynamic.bob.kq;

import android.view.MotionEvent;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public class bob implements View.OnTouchListener {
    private float bob;
    private boolean csi;
    private boolean dgq;
    private float fou;
    private float kq;
    private float oq;
    private com.bytedance.sdk.component.adexpress.dynamic.bob.syt rhi;
    private int rjo;
    private boolean syt;

    public bob(com.bytedance.sdk.component.adexpress.dynamic.bob.syt sytVar) {
        this(sytVar, 5);
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        com.bytedance.sdk.component.adexpress.dynamic.bob.syt sytVar;
        com.bytedance.sdk.component.adexpress.dynamic.bob.syt sytVar2;
        com.bytedance.sdk.component.adexpress.dynamic.bob.syt sytVar3;
        if (this.dgq) {
            return true;
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            this.kq = motionEvent.getX();
            this.oq = motionEvent.getY();
        } else if (action != 1) {
            if (action == 2) {
                this.fou = motionEvent.getX();
                this.bob = motionEvent.getY();
                if (Math.abs(this.fou - this.kq) > 10.0f) {
                    this.csi = true;
                }
                if (Math.abs(this.fou - this.kq) > 8.0f || Math.abs(this.bob - this.oq) > 8.0f) {
                    this.syt = false;
                }
                int iOq = com.bytedance.sdk.component.adexpress.fou.rjo.oq(com.bytedance.sdk.component.adexpress.fou.kq(), Math.abs(this.fou - this.kq));
                if (this.fou > this.kq && iOq > this.rjo && (sytVar3 = this.rhi) != null) {
                    sytVar3.kq();
                    this.dgq = true;
                }
            }
        } else {
            if (!this.csi && !this.syt) {
                return false;
            }
            float x10 = motionEvent.getX();
            float y9 = motionEvent.getY();
            int iOq2 = com.bytedance.sdk.component.adexpress.fou.rjo.oq(com.bytedance.sdk.component.adexpress.fou.kq(), Math.abs(this.fou - this.kq));
            if (this.fou > this.kq && iOq2 > this.rjo && (sytVar2 = this.rhi) != null) {
                sytVar2.kq();
                this.dgq = true;
            }
            float fAbs = Math.abs(x10 - this.kq);
            float fAbs2 = Math.abs(y9 - this.oq);
            if ((fAbs < 8.0f || fAbs2 < 8.0f) && (sytVar = this.rhi) != null) {
                sytVar.oq();
                this.dgq = true;
            }
        }
        return true;
    }

    public bob(com.bytedance.sdk.component.adexpress.dynamic.bob.syt sytVar, int i10) {
        this.rjo = 5;
        this.syt = true;
        this.rhi = sytVar;
        if (i10 > 0) {
            this.rjo = i10;
        }
    }
}
