package com.bytedance.adsdk.ugeno.fou.fou;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.view.MotionEvent;
import com.unity3d.services.UnityAdsConstants;

/* JADX INFO: loaded from: classes.dex */
public class ubx extends bob implements com.bytedance.adsdk.ugeno.rjo.dgq.kq {
    private int ubx;
    private boolean vvw;
    private Handler wki;

    public ubx(Context context) {
        super(context);
        this.ubx = UnityAdsConstants.RequestPolicy.RETRY_WAIT_BASE;
        this.wki = new com.bytedance.adsdk.ugeno.rjo.dgq(Looper.getMainLooper(), this);
    }

    @Override // com.bytedance.adsdk.ugeno.fou.fou.bob
    public boolean kq(Object... objArr) {
        if (objArr == null || objArr.length <= 0) {
            return false;
        }
        MotionEvent motionEvent = (MotionEvent) objArr[0];
        this.ubx = com.bytedance.adsdk.ugeno.rjo.bob.kq(this.csi.get("delay"), UnityAdsConstants.RequestPolicy.RETRY_WAIT_BASE);
        return kq(this.oq, motionEvent);
    }

    private boolean kq(com.bytedance.adsdk.ugeno.oq.bob bobVar, MotionEvent motionEvent) {
        com.bytedance.adsdk.ugeno.fou.ubx ubxVar;
        int action = motionEvent.getAction();
        if (action == 0) {
            this.wki.sendEmptyMessageDelayed(1102, this.ubx);
        } else {
            if (action == 1) {
                if (this.vvw && (ubxVar = this.kq) != null) {
                    ubxVar.kq(this.oq, this.rhi, this.bob.oq());
                    this.vvw = false;
                    Handler handler = this.wki;
                    if (handler != null) {
                        handler.removeMessages(1102);
                    }
                    return true;
                }
                Handler handler2 = this.wki;
                if (handler2 != null) {
                    handler2.removeMessages(1102);
                }
                this.vvw = false;
                return false;
            }
            if (action == 3) {
                Handler handler3 = this.wki;
                if (handler3 != null) {
                    handler3.removeMessages(1102);
                }
                this.vvw = false;
            }
        }
        return true;
    }

    @Override // com.bytedance.adsdk.ugeno.rjo.dgq.kq
    public void kq(Message message) {
        if (message.what != 1102) {
            return;
        }
        this.vvw = true;
        Handler handler = this.wki;
        if (handler != null) {
            handler.removeMessages(1102);
        }
    }
}
