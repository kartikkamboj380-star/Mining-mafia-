package com.bytedance.sdk.component.adexpress.dynamic.bob.kq;

import android.view.MotionEvent;
import android.view.View;
import com.bytedance.sdk.component.adexpress.dynamic.bob.dgq;

/* JADX INFO: loaded from: classes.dex */
public class oq implements View.OnTouchListener {
    private long bob;
    private dgq csi;
    private boolean fou;
    private float kq;
    private float oq;
    private com.bytedance.sdk.component.adexpress.dynamic.bob.syt rhi;

    public oq(dgq dgqVar, com.bytedance.sdk.component.adexpress.dynamic.bob.syt sytVar) {
        this.csi = dgqVar;
        this.rhi = sytVar;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            this.bob = System.currentTimeMillis();
            this.kq = motionEvent.getX();
            this.oq = motionEvent.getY();
            this.csi.csi();
        } else if (action != 1) {
            if (action == 2) {
                float x10 = motionEvent.getX();
                float y9 = motionEvent.getY();
                if (Math.abs(x10 - this.kq) >= com.bytedance.sdk.component.adexpress.fou.rjo.kq(com.bytedance.sdk.component.adexpress.fou.kq(), 10.0f) || Math.abs(y9 - this.oq) >= com.bytedance.sdk.component.adexpress.fou.rjo.kq(com.bytedance.sdk.component.adexpress.fou.kq(), 10.0f)) {
                    this.fou = true;
                    this.csi.rhi();
                }
            }
        } else {
            if (this.fou) {
                return false;
            }
            if (System.currentTimeMillis() - this.bob >= 1500) {
                com.bytedance.sdk.component.adexpress.dynamic.bob.syt sytVar = this.rhi;
                if (sytVar != null) {
                    sytVar.kq();
                }
            } else {
                this.csi.rhi();
            }
        }
        return true;
    }
}
