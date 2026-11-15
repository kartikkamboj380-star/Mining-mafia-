package com.bytedance.adsdk.ugeno.fou.fou;

import android.content.Context;
import android.util.Log;
import android.view.MotionEvent;
import com.bytedance.adsdk.ugeno.fou.wki;
import com.unity3d.services.UnityAdsConstants;

/* JADX INFO: loaded from: classes.dex */
public class dgq extends bob {
    private wki suf;
    private float ubx;
    private float vvw;
    private boolean wki;

    public dgq(Context context) {
        super(context);
    }

    @Override // com.bytedance.adsdk.ugeno.fou.fou.bob
    public boolean kq(Object... objArr) {
        if (objArr == null || objArr.length <= 0) {
            return false;
        }
        MotionEvent motionEvent = (MotionEvent) objArr[0];
        wki wkiVar = this.suf;
        return wkiVar != null ? wkiVar.kq(this.oq, motionEvent, this.kq, this) : kq(this.oq, motionEvent);
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0041  */
    /* JADX WARN: Code duplicated, block: B:21:0x004b  */
    public boolean kq(com.bytedance.adsdk.ugeno.oq.bob bobVar, MotionEvent motionEvent) {
        float rawX;
        int action = motionEvent.getAction();
        if (action == 0) {
            this.ubx = motionEvent.getRawX();
            this.vvw = motionEvent.getRawY();
        } else if (action == 1) {
            if (this.wki) {
                this.wki = false;
                this.ubx = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                this.vvw = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                Log.d("GesThrough_UGTapEvent", "Non-tap event");
                return false;
            }
            rawX = motionEvent.getRawX();
            float rawY = motionEvent.getRawY();
            if (Math.abs(rawX - this.ubx) >= 15.0f && Math.abs(rawY - this.vvw) < 15.0f) {
                Log.d("GesThrough_UGTapEvent", "Tap event, direct handling");
                com.bytedance.adsdk.ugeno.fou.ubx ubxVar = this.kq;
                if (ubxVar != null) {
                    ubxVar.kq(bobVar, this.rhi, this.bob.oq());
                    this.ubx = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                    this.vvw = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                    return true;
                }
            } else {
                this.wki = false;
                Log.d("GesThrough_UGTapEvent", "Non-tap event");
                return false;
            }
        } else if (action == 2) {
            float rawX2 = motionEvent.getRawX();
            float rawY2 = motionEvent.getRawY();
            if (Math.abs(rawX2 - this.ubx) >= 15.0f || Math.abs(rawY2 - this.vvw) >= 15.0f) {
                this.wki = true;
            }
        } else if (action == 3) {
            this.wki = false;
            if (this.wki) {
                this.wki = false;
                this.ubx = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                this.vvw = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                Log.d("GesThrough_UGTapEvent", "Non-tap event");
                return false;
            }
            rawX = motionEvent.getRawX();
            float rawY3 = motionEvent.getRawY();
            if (Math.abs(rawX - this.ubx) >= 15.0f) {
            }
            this.wki = false;
            Log.d("GesThrough_UGTapEvent", "Non-tap event");
            return false;
        }
        return true;
    }

    public void kq(wki wkiVar) {
        this.suf = wkiVar;
    }
}
