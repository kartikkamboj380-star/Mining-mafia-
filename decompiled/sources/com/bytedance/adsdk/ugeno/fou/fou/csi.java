package com.bytedance.adsdk.ugeno.fou.fou;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.gms.common.api.Api;
import com.unity3d.services.UnityAdsConstants;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public class csi extends bob {
    private AtomicBoolean mxq;
    private int nze;
    private int sns;
    private int suf;
    private float ubx;
    private float vvw;
    private String wcx;
    private int wki;

    public csi(Context context) {
        super(context);
        this.wki = 0;
        this.suf = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        this.nze = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        this.mxq = new AtomicBoolean(true);
        this.sns = 0;
        this.wcx = "up";
    }

    @Override // com.bytedance.adsdk.ugeno.fou.fou.bob
    public boolean kq(Object... objArr) {
        if (objArr == null || objArr.length <= 0) {
            return false;
        }
        Map<String, String> map = this.csi;
        if (map != null) {
            this.wcx = TextUtils.isEmpty(map.get("direction")) ? "all" : this.csi.get("direction");
            this.wki = com.bytedance.adsdk.ugeno.rjo.bob.kq(this.csi.get("distance"), 0);
            if (this.suf == Integer.MAX_VALUE) {
                this.suf = com.bytedance.adsdk.ugeno.rjo.bob.kq(this.csi.get("frequency"), Api.BaseClientBuilder.API_PRIORITY_OTHER);
            }
            if (this.nze == Integer.MAX_VALUE) {
                this.nze = com.bytedance.adsdk.ugeno.rjo.bob.kq(this.csi.get("effectiveDuration"), Api.BaseClientBuilder.API_PRIORITY_OTHER);
            }
            this.sns = com.bytedance.adsdk.ugeno.rjo.bob.kq(this.csi.get("inView"), 0);
            Log.d("GesThrough_UGSlideEvent", "mFrequency: " + this.suf + ", mEffectiveDuration: " + this.nze + ", inEffectiveDuation: " + this.mxq.get());
        }
        MotionEvent motionEvent = (MotionEvent) objArr[0];
        kq();
        return kq(this.oq, motionEvent);
    }

    private void kq() {
        if (this.nze == Integer.MAX_VALUE || this.oq == null || System.currentTimeMillis() - this.oq.ou() < this.nze) {
            return;
        }
        this.mxq.set(false);
        Log.d("GesThrough_UGSlideEvent", "inEffectiveDuation -> false");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:32:0x007c  */
    private boolean kq(com.bytedance.adsdk.ugeno.oq.bob bobVar, MotionEvent motionEvent) {
        byte b10;
        int action = motionEvent.getAction();
        if (action == 0) {
            this.ubx = motionEvent.getX();
            this.vvw = motionEvent.getY();
        } else if (action == 1 || action == 3) {
            float x10 = motionEvent.getX();
            float y9 = motionEvent.getY();
            if (this.wki == 0 && this.kq != null) {
                Log.d("GesThrough_UGSlideEvent", "Slide event, check limit");
                return kq(bobVar, x10, y9);
            }
            int iOq = com.bytedance.adsdk.ugeno.rjo.syt.oq(this.nn, x10 - this.ubx);
            int iOq2 = com.bytedance.adsdk.ugeno.rjo.syt.oq(this.nn, y9 - this.vvw);
            switch (this.wcx) {
                case "up":
                    b10 = 0;
                    break;
                case "all":
                    b10 = 4;
                    break;
                case "down":
                    b10 = 1;
                    break;
                case "left":
                    b10 = 2;
                    break;
                case "right":
                    b10 = 3;
                    break;
                default:
                    b10 = -1;
                    break;
            }
            if (b10 == 0) {
                iOq = -iOq2;
            } else if (b10 == 1) {
                iOq = iOq2;
            } else if (b10 == 2) {
                iOq = -iOq;
            } else if (b10 != 3) {
                iOq = (int) Math.abs(Math.sqrt(Math.pow(iOq, 2.0d) + Math.pow(iOq2, 2.0d)));
            }
            if (iOq >= this.wki) {
                Log.d("GesThrough_UGSlideEvent", "Slide event, check limit");
                if (this.kq != null) {
                    this.ubx = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                    this.vvw = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                    return kq(bobVar, x10, y9);
                }
            } else {
                Log.d("GesThrough_UGSlideEvent", "Non-slide event");
                return false;
            }
        }
        return true;
    }

    private boolean kq(com.bytedance.adsdk.ugeno.oq.bob bobVar, float f10, float f11) {
        if (this.suf <= 0) {
            Log.d("GesThrough_UGSlideEvent", "frequency <= 0, no trigger slide");
            return false;
        }
        if (!this.mxq.get()) {
            Log.d("GesThrough_UGSlideEvent", "not in effective duration, no trigger slide");
            return false;
        }
        if (this.sns == 1 && !kq(bobVar.ubx(), f10, f11)) {
            Log.d("GesThrough_UGSlideEvent", "not in view, no trigger slide");
            return false;
        }
        Log.d("GesThrough_UGSlideEvent", "Slide event, direct handling");
        this.kq.kq(bobVar, this.rhi, this.bob.oq());
        int i10 = this.suf;
        if (i10 != Integer.MAX_VALUE) {
            this.suf = i10 - 1;
        }
        return true;
    }

    private boolean kq(View view, float f10, float f11) {
        return f10 >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && f10 < ((float) view.getWidth()) && f11 >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && f11 < ((float) view.getHeight());
    }
}
