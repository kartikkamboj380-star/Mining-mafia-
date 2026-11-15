package com.bytedance.sdk.component.dgq;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import com.bytedance.sdk.component.utils.fax;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class fou extends bob {
    private final long bob;
    private final rhi csi;
    private float dgq;
    private final Context fou;
    private final View.OnTouchListener kq;
    private String nn;
    private final int oq;
    private View.OnTouchListener rhi;
    private long rjo = -1;
    private float syt;

    public fou(Context context, View.OnTouchListener onTouchListener, int i10, long j10, rhi rhiVar) {
        this.fou = context;
        this.kq = onTouchListener;
        this.oq = i10;
        this.bob = j10;
        this.csi = rhiVar;
    }

    private boolean kq(long j10) {
        long j11 = this.rjo;
        if (j11 == -1) {
            this.rjo = j10;
            return false;
        }
        int i10 = this.oq;
        if (i10 == 1) {
            if (j10 - j11 <= this.bob) {
                return true;
            }
            this.rjo = j10;
            return false;
        }
        if (i10 == 2) {
            if (j10 - j11 <= this.bob) {
                this.rjo = j10;
                return true;
            }
            this.rjo = j10;
        }
        return false;
    }

    @Override // android.view.View.OnTouchListener
    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouch(View view, MotionEvent motionEvent) {
        fou fouVar;
        int action = motionEvent.getAction();
        motionEvent.getX();
        motionEvent.getY();
        float x10 = motionEvent.getX();
        float y9 = motionEvent.getY();
        if (action == 0) {
            fouVar = this;
            fouVar.syt = x10;
            fouVar.dgq = y9;
        } else if (action != 1) {
            fouVar = this;
        } else {
            fouVar = this;
            if (fouVar.kq(x10, y9, this.syt, this.dgq, this.fou)) {
                if (kq(SystemClock.elapsedRealtime())) {
                    motionEvent.setAction(3);
                    kq(1, x10, y9);
                } else {
                    kq(0, x10, y9);
                }
            }
        }
        View.OnTouchListener onTouchListener = fouVar.kq;
        if (onTouchListener != null) {
            onTouchListener.onTouch(view, motionEvent);
        }
        View.OnTouchListener onTouchListener2 = fouVar.rhi;
        if (onTouchListener2 != null) {
            onTouchListener2.onTouch(view, motionEvent);
        }
        return false;
    }

    private void kq(int i10, float f10, float f11) {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put("is_interceptor", i10);
            jSONObject2.put("click_x", f10);
            jSONObject2.put("click_y", f11);
            jSONObject.put("lp_click_type", this.oq);
            jSONObject.put("lp_click_interval", this.bob);
        } catch (Throwable th) {
            fax.kq("LpClickIntervalTouchListener", "sendLpClickInterceptEvent", th);
        }
        if (com.bytedance.sdk.component.dgq.kq.kq.kq().oq() != null) {
            com.bytedance.sdk.component.dgq.kq.oq oqVarOq = com.bytedance.sdk.component.dgq.kq.kq.kq().oq();
            rhi rhiVar = this.csi;
            oqVarOq.kq(rhiVar != null ? rhiVar.getMaterialMeta() : null, this.nn, "click_interval_intercept", jSONObject, jSONObject2);
        }
    }

    public void kq(String str) {
        this.nn = str;
    }

    @Override // com.bytedance.sdk.component.dgq.bob
    public void kq(View.OnTouchListener onTouchListener) {
        this.rhi = onTouchListener;
    }
}
