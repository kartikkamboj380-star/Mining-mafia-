package com.bytedance.adsdk.ugeno.fou.fou;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.view.MotionEvent;
import com.unity3d.services.UnityAdsConstants;

/* JADX INFO: loaded from: classes.dex */
public class vvw extends bob implements com.bytedance.adsdk.ugeno.rjo.dgq.kq {
    private int ubx;
    private Handler vvw;

    public vvw(Context context) {
        super(context);
        this.ubx = UnityAdsConstants.RequestPolicy.RETRY_WAIT_BASE;
        this.vvw = new com.bytedance.adsdk.ugeno.rjo.dgq(Looper.getMainLooper(), this);
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
        int action = motionEvent.getAction();
        if (action == 0) {
            this.vvw.sendEmptyMessageDelayed(1101, this.ubx);
            return false;
        }
        if (action != 1 && action != 3) {
            return false;
        }
        this.vvw.removeMessages(1101);
        return false;
    }

    @Override // com.bytedance.adsdk.ugeno.rjo.dgq.kq
    public void kq(Message message) {
        if (message.what != 1101) {
            return;
        }
        com.bytedance.adsdk.ugeno.fou.ubx ubxVar = this.kq;
        if (ubxVar != null) {
            ubxVar.kq(this.oq, this.rhi, this.bob.oq());
        }
        Handler handler = this.vvw;
        if (handler != null) {
            handler.removeMessages(1101);
        }
    }
}
