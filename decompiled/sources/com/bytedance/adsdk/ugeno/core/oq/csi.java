package com.bytedance.adsdk.ugeno.core.oq;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import android.view.MotionEvent;
import com.bytedance.adsdk.ugeno.core.nze;
import com.bytedance.adsdk.ugeno.core.wki;
import com.bytedance.adsdk.ugeno.rjo.syt;
import com.google.android.gms.common.api.Api;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public class csi {
    private String dgq;
    private Context nn;
    private wki rjo;
    private wki syt;
    private boolean ubx;
    private boolean vvw;
    private kq wki;
    private float kq = Float.MIN_VALUE;
    private float oq = Float.MIN_VALUE;
    private int bob = 0;
    private int fou = Api.BaseClientBuilder.API_PRIORITY_OTHER;
    private int csi = Api.BaseClientBuilder.API_PRIORITY_OTHER;
    private AtomicBoolean rhi = new AtomicBoolean(true);

    public csi(Context context, wki wkiVar, boolean z9, boolean z10) {
        this.nn = context;
        this.rjo = wkiVar;
        this.ubx = z9;
        this.vvw = z10;
        bob();
    }

    private void bob() {
        if (this.vvw) {
            this.wki = new kq();
        }
        wki wkiVar = this.rjo;
        if (wkiVar == null) {
            return;
        }
        this.bob = wkiVar.bob().optInt("slideThreshold");
        this.dgq = this.rjo.bob().optString("slideDirection");
        this.fou = this.rjo.bob().optInt("frequency", Api.BaseClientBuilder.API_PRIORITY_OTHER);
        this.csi = this.rjo.bob().optInt("effectiveDuration", Api.BaseClientBuilder.API_PRIORITY_OTHER);
        Log.d("GesThrough_UGSREvent", "mFrequency: " + this.fou + ", mEffectiveDuration: " + this.csi + ", inEffectiveDuation: " + this.rhi.get());
    }

    public void oq() {
        this.kq = Float.MIN_VALUE;
        this.oq = Float.MIN_VALUE;
    }

    public void kq() {
        if (this.csi == Integer.MAX_VALUE) {
            return;
        }
        new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: com.bytedance.adsdk.ugeno.core.oq.csi.1
            @Override // java.lang.Runnable
            public void run() {
                csi.this.rhi.set(false);
                Log.d("GesThrough_UGSREvent", "inEffectiveDuation -> false");
            }
        }, this.csi);
    }

    /* JADX WARN: Code duplicated, block: B:39:0x009c  */
    /* JADX WARN: Code duplicated, block: B:40:0x009e  */
    /* JADX WARN: Code duplicated, block: B:42:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:44:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:45:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:48:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:49:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:52:0x00db  */
    /* JADX WARN: Code duplicated, block: B:54:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:56:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:57:0x00ef  */
    public boolean kq(nze nzeVar, com.bytedance.adsdk.ugeno.oq.bob bobVar, MotionEvent motionEvent, boolean z9) {
        float x10;
        float y9;
        int iOq;
        int iOq2;
        kq kqVar = this.wki;
        if (kqVar != null) {
            if (kqVar.kq(motionEvent)) {
                Log.d("GesThrough_UGSREvent", "mockEvent，skip");
                return false;
            }
            this.wki.kq(bobVar, motionEvent);
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            this.kq = motionEvent.getX();
            this.oq = motionEvent.getY();
        } else if (action == 1) {
            x10 = motionEvent.getX();
            y9 = motionEvent.getY();
            if (!this.ubx && Math.abs(x10 - this.kq) <= 10.0f && Math.abs(y9 - this.oq) <= 10.0f && nzeVar != null) {
                oq();
                nzeVar.kq(this.syt, bobVar, bobVar);
                return true;
            }
            if (this.bob != 0 && nzeVar != null) {
                oq();
                kq(nzeVar, this.rjo, bobVar);
                return true;
            }
            iOq = syt.oq(this.nn, x10 - this.kq);
            iOq2 = syt.oq(this.nn, y9 - this.oq);
            if (TextUtils.equals(this.dgq, "up")) {
                iOq = -iOq2;
            } else if (!TextUtils.equals(this.dgq, "down")) {
                iOq = iOq2;
            } else if (TextUtils.equals(this.dgq, "left")) {
                iOq = -iOq;
            } else if (!TextUtils.equals(this.dgq, "right")) {
                iOq = (int) Math.abs(Math.sqrt(Math.pow(iOq, 2.0d) + Math.pow(iOq2, 2.0d)));
            }
            if (iOq >= this.bob) {
                Log.d("GesThrough_UGSREvent", "Right-slide event, direct handling");
                if (nzeVar != null) {
                    oq();
                    kq(nzeVar, this.rjo, bobVar);
                    return true;
                }
                oq();
            } else {
                oq();
                Log.d("GesThrough_UGSREvent", "Non-right-slide event");
                kq(bobVar);
                return false;
            }
        } else if (action == 3) {
            if (this.kq != Float.MIN_VALUE && this.oq != Float.MIN_VALUE) {
                Log.d("GesThrough_UGSREvent", "Sequence CANCEL, processed as UP event");
                x10 = motionEvent.getX();
                y9 = motionEvent.getY();
                if (!this.ubx) {
                }
                if (this.bob != 0) {
                }
                iOq = syt.oq(this.nn, x10 - this.kq);
                iOq2 = syt.oq(this.nn, y9 - this.oq);
                if (TextUtils.equals(this.dgq, "up")) {
                    iOq = -iOq2;
                } else if (!TextUtils.equals(this.dgq, "down")) {
                    iOq = iOq2;
                } else if (TextUtils.equals(this.dgq, "left")) {
                    iOq = -iOq;
                } else if (!TextUtils.equals(this.dgq, "right")) {
                    iOq = (int) Math.abs(Math.sqrt(Math.pow(iOq, 2.0d) + Math.pow(iOq2, 2.0d)));
                }
                if (iOq >= this.bob) {
                    Log.d("GesThrough_UGSREvent", "Right-slide event, direct handling");
                    if (nzeVar != null) {
                        oq();
                        kq(nzeVar, this.rjo, bobVar);
                        return true;
                    }
                    oq();
                } else {
                    oq();
                    Log.d("GesThrough_UGSREvent", "Non-right-slide event");
                    kq(bobVar);
                    return false;
                }
            } else {
                Log.d("GesThrough_UGSREvent", "Sequence CANCEL, don't handle");
                return false;
            }
        }
        return true;
    }

    public csi(Context context, wki wkiVar, wki wkiVar2, boolean z9, boolean z10) {
        this.nn = context;
        this.rjo = wkiVar;
        this.syt = wkiVar2;
        this.ubx = z9;
        this.vvw = z10;
        bob();
    }

    private void kq(com.bytedance.adsdk.ugeno.oq.bob bobVar) {
        if (this.wki != null) {
            Log.d("GesThrough_UGSREvent", "need gesture through, replayGestureMotions");
            this.wki.kq(bobVar);
        }
    }

    private void kq(nze nzeVar, wki wkiVar, com.bytedance.adsdk.ugeno.oq.bob bobVar) {
        if (this.fou <= 0) {
            Log.d("GesThrough_UGSREvent", "frequency <= 0, no trigger slide");
            kq(bobVar);
        } else {
            if (!this.rhi.get()) {
                Log.d("GesThrough_UGSREvent", "not in effective duration, no trigger slide");
                kq(bobVar);
                return;
            }
            nzeVar.kq(wkiVar, bobVar, bobVar);
            int i10 = this.fou;
            if (i10 != Integer.MAX_VALUE) {
                this.fou = i10 - 1;
            }
        }
    }
}
