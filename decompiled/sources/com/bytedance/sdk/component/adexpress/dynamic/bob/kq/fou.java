package com.bytedance.sdk.component.adexpress.dynamic.bob.kq;

import android.view.MotionEvent;
import android.view.View;
import com.unity3d.services.UnityAdsConstants;

/* JADX INFO: loaded from: classes.dex */
public class fou implements View.OnTouchListener {
    private float bob;
    private boolean csi = true;
    private com.bytedance.sdk.component.adexpress.dynamic.bob.syt dgq;
    private float fou;
    private float kq;
    private int nn;
    private float oq;
    private float rhi;
    private float rjo;
    private boolean syt;
    private boolean ubx;

    public fou(com.bytedance.sdk.component.adexpress.dynamic.bob.syt sytVar, int i10, boolean z9) {
        this.dgq = sytVar;
        this.nn = i10;
        this.ubx = z9;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        com.bytedance.sdk.component.adexpress.dynamic.bob.syt sytVar;
        com.bytedance.sdk.component.adexpress.dynamic.bob.syt sytVar2;
        com.bytedance.sdk.component.adexpress.dynamic.bob.syt sytVar3;
        int action = motionEvent.getAction();
        if (action == 0) {
            this.kq = motionEvent.getX();
            this.oq = motionEvent.getY();
            this.rhi = motionEvent.getY();
            this.csi = true;
        } else if (action != 1) {
            if (action == 2) {
                float y9 = motionEvent.getY();
                this.rjo = y9;
                if (Math.abs(y9 - this.rhi) > 10.0f) {
                    this.syt = true;
                }
                this.fou = motionEvent.getX();
                this.bob = motionEvent.getY();
                if (Math.abs(this.fou - this.kq) > 8.0f || Math.abs(this.bob - this.oq) > 8.0f) {
                    this.csi = false;
                }
            }
        } else {
            if (!this.syt && !this.csi) {
                return false;
            }
            if (this.ubx || (sytVar3 = this.dgq) == null) {
                int iOq = com.bytedance.sdk.component.adexpress.fou.rjo.oq(com.bytedance.sdk.component.adexpress.fou.kq(), Math.abs(this.rjo - this.rhi));
                if (this.rjo - this.rhi < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && iOq > this.nn && (sytVar2 = this.dgq) != null) {
                    sytVar2.kq();
                } else if (this.csi && (sytVar = this.dgq) != null) {
                    sytVar.kq();
                }
            } else {
                sytVar3.kq();
            }
        }
        return true;
    }
}
