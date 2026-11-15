package com.bytedance.sdk.openadsdk.core.widget;

import android.annotation.SuppressLint;
import android.view.MotionEvent;
import android.view.View;
import com.bytedance.sdk.openadsdk.utils.bss;
import com.unity3d.services.UnityAdsConstants;

/* JADX INFO: loaded from: classes.dex */
public class gm {
    private float csi;
    private float fou;
    private final kq kq;
    private int rhi;
    private int rjo;
    private boolean ubx;
    private final boolean oq = false;
    private boolean bob = false;
    private boolean syt = true;
    private boolean dgq = false;
    private final View.OnTouchListener nn = new View.OnTouchListener() { // from class: com.bytedance.sdk.openadsdk.core.widget.gm.1
        @Override // android.view.View.OnTouchListener
        @SuppressLint({"ClickableViewAccessibility"})
        public boolean onTouch(View view, MotionEvent motionEvent) {
            if (gm.this.kq.uml()) {
                return !gm.this.bob;
            }
            float x10 = motionEvent.getX();
            float y9 = motionEvent.getY();
            int action = motionEvent.getAction();
            if (action == 0) {
                gm gmVar = gm.this;
                gmVar.ubx = gmVar.kq(motionEvent);
                gm.this.fou = x10;
                gm.this.csi = y9;
                gm.this.rhi = (int) x10;
                gm.this.rjo = (int) y9;
                gm.this.syt = true;
                if (gm.this.kq != null && gm.this.bob) {
                    gm.this.kq.kq(view, true);
                }
            } else if (action == 1) {
                if (Math.abs(x10 - gm.this.rhi) > 20.0f || Math.abs(y9 - gm.this.rjo) > 20.0f) {
                    gm.this.syt = false;
                }
                gm.this.syt = true;
                gm.this.dgq = false;
                gm.this.fou = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                gm.this.csi = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                gm.this.rhi = 0;
                if (gm.this.kq != null) {
                    gm.this.kq.kq(view, gm.this.syt);
                }
                gm.this.ubx = false;
            } else if (action == 3) {
                gm.this.ubx = false;
            }
            return !gm.this.bob;
        }
    };

    public interface kq {
        void kq(View view, boolean z9);

        boolean uml();
    }

    public gm(kq kqVar) {
        this.kq = kqVar;
    }

    public void kq(View view) {
        if (view != null) {
            view.setOnTouchListener(this.nn);
        }
    }

    public void kq(boolean z9) {
        this.bob = z9;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean kq(MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() != 0) {
            return false;
        }
        int iBob = bss.bob(com.bytedance.sdk.openadsdk.core.sns.kq().getApplicationContext());
        int iCsi = bss.csi(com.bytedance.sdk.openadsdk.core.sns.kq().getApplicationContext());
        float rawX = motionEvent.getRawX();
        float rawY = motionEvent.getRawY();
        float f10 = iBob;
        if (rawX <= f10 * 0.01f || rawX >= f10 * 0.99f) {
            return true;
        }
        float f11 = iCsi;
        return rawY <= 0.01f * f11 || rawY >= f11 * 0.99f;
    }
}
