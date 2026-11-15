package com.bytedance.adsdk.ugeno.core.oq;

import android.content.Context;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import com.bytedance.adsdk.ugeno.core.nze;
import com.bytedance.adsdk.ugeno.core.wki;

/* JADX INFO: loaded from: classes.dex */
public class bob {
    private wki bob;
    private boolean csi;
    private Context fou;
    private float kq;
    private float oq;
    private final int rhi;

    public bob(Context context, wki wkiVar) {
        this.fou = context;
        this.bob = wkiVar;
        this.rhi = ViewConfiguration.get(context).getScaledTouchSlop();
    }

    public boolean kq(nze nzeVar, com.bytedance.adsdk.ugeno.oq.bob bobVar, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            this.kq = motionEvent.getX();
            this.oq = motionEvent.getY();
        } else if (action != 1) {
            if (action == 2) {
                float x10 = motionEvent.getX();
                float y9 = motionEvent.getY();
                if (Math.abs(x10 - this.kq) >= this.rhi || Math.abs(y9 - this.oq) >= this.rhi) {
                    this.csi = true;
                }
            } else if (action == 3) {
                this.csi = false;
            }
        } else {
            if (this.csi) {
                this.csi = false;
                return false;
            }
            float x11 = motionEvent.getX();
            float y10 = motionEvent.getY();
            if (Math.abs(x11 - this.kq) >= this.rhi || Math.abs(y10 - this.oq) >= this.rhi) {
                this.csi = false;
            } else if (nzeVar != null) {
                nzeVar.kq(this.bob, bobVar, bobVar);
                return true;
            }
        }
        return true;
    }
}
