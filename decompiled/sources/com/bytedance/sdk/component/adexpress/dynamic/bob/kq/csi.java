package com.bytedance.sdk.component.adexpress.dynamic.bob.kq;

import android.view.MotionEvent;
import android.view.View;
import com.unity3d.services.UnityAdsConstants;

/* JADX INFO: loaded from: classes.dex */
public class csi implements View.OnTouchListener {
    private boolean bob;
    private int csi;
    private com.bytedance.sdk.component.adexpress.dynamic.bob.syt fou;
    private float kq;
    private float oq;

    public csi(com.bytedance.sdk.component.adexpress.dynamic.bob.syt sytVar, int i10) {
        this.fou = sytVar;
        this.csi = i10;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        com.bytedance.sdk.component.adexpress.dynamic.bob.syt sytVar;
        int action = motionEvent.getAction();
        if (action == 0) {
            this.kq = motionEvent.getY();
        } else if (action != 1) {
            if (action == 2) {
                float y9 = motionEvent.getY();
                this.oq = y9;
                if (Math.abs(y9 - this.kq) > 10.0f) {
                    this.bob = true;
                }
            }
        } else {
            if (!this.bob) {
                return false;
            }
            int iOq = com.bytedance.sdk.component.adexpress.fou.rjo.oq(com.bytedance.sdk.component.adexpress.fou.kq(), Math.abs(this.oq - this.kq));
            if (this.oq - this.kq < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && iOq > this.csi && (sytVar = this.fou) != null) {
                sytVar.kq();
                this.kq = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                this.oq = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                this.bob = false;
            }
        }
        return true;
    }
}
