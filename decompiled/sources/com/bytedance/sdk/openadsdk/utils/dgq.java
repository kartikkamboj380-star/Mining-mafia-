package com.bytedance.sdk.openadsdk.utils;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public class dgq implements suf, Runnable {
    private long csi;
    private long fou;
    private final Activity oq;
    private boolean rhi;
    private final kq rjo;
    private boolean syt;
    private final AtomicBoolean dgq = new AtomicBoolean(false);
    private final Handler bob = new Handler(Looper.getMainLooper());
    private View kq = fou();

    public interface kq {
        View kq();

        void oq();
    }

    private dgq(Activity activity, int i10, kq kqVar) {
        this.rjo = kqVar;
        this.oq = activity;
        this.fou = i10;
    }

    private void csi() {
        this.syt = false;
        this.csi = SystemClock.elapsedRealtime();
        Handler handler = this.bob;
        if (handler != null) {
            handler.postDelayed(this, this.fou);
        }
    }

    private View fou() {
        kq kqVar = this.rjo;
        if (kqVar != null) {
            return kqVar.kq();
        }
        return null;
    }

    public static suf kq(Activity activity, kq kqVar) {
        int iAqe = com.bytedance.sdk.openadsdk.core.settings.ubx.bob().aqe();
        return iAqe < 0 ? new suf() { // from class: com.bytedance.sdk.openadsdk.utils.dgq.1
            @Override // com.bytedance.sdk.openadsdk.utils.suf
            public void bob() {
            }

            @Override // com.bytedance.sdk.openadsdk.utils.suf
            public void kq() {
            }

            @Override // com.bytedance.sdk.openadsdk.utils.suf
            public void oq() {
            }

            @Override // com.bytedance.sdk.openadsdk.utils.suf
            public void kq(long j10) {
            }
        } : new dgq(activity, Math.min(iAqe, 50) * 1000, kqVar);
    }

    private void rhi() {
        Activity activity;
        View childAt;
        if (this.rhi || (activity = this.oq) == null || activity.isFinishing() || this.oq.isDestroyed()) {
            return;
        }
        if (this.kq == null) {
            this.kq = fou();
        }
        View view = this.kq;
        if (view != null) {
            if (oq(view)) {
                kq(this.kq);
                View view2 = this.kq;
                if ((view2 instanceof ViewGroup) && ((ViewGroup) view2).getChildCount() > 0 && (childAt = ((ViewGroup) this.kq).getChildAt(0)) != null && oq(childAt)) {
                    kq(childAt);
                }
                kq kqVar = this.rjo;
                if (kqVar != null) {
                    kqVar.oq();
                }
            }
            rjo();
        }
        this.rhi = true;
    }

    private void rjo() {
        ViewParent parent = this.kq.getParent();
        if (parent instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) parent;
            if (viewGroup.indexOfChild(this.kq) != viewGroup.getChildCount() - 1) {
                this.kq.bringToFront();
            }
        }
    }

    @Override // com.bytedance.sdk.openadsdk.utils.suf
    public void bob() {
        if (this.rhi) {
            return;
        }
        this.rhi = true;
        Handler handler = this.bob;
        if (handler != null) {
            try {
                handler.removeCallbacks(this);
            } catch (Throwable th) {
                com.bytedance.sdk.component.utils.fax.bob(th.getMessage(), new Object[0]);
            }
        }
    }

    @Override // com.bytedance.sdk.openadsdk.utils.suf
    public void oq() {
        if (this.csi <= 0 || this.rhi) {
            return;
        }
        if (!this.syt) {
            this.fou -= SystemClock.elapsedRealtime() - this.csi;
        }
        this.syt = true;
        if (this.fou <= 0) {
            rhi();
            return;
        }
        Handler handler = this.bob;
        if (handler != null) {
            try {
                handler.removeCallbacks(this);
            } catch (Throwable th) {
                com.bytedance.sdk.component.utils.fax.bob(th.getMessage(), new Object[0]);
            }
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        rhi();
    }

    @Override // com.bytedance.sdk.openadsdk.utils.suf
    public void kq(long j10) {
        if (this.dgq.compareAndSet(false, true)) {
            if (j10 < 0) {
                j10 = 0;
            }
            this.fou += j10;
            csi();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.utils.suf
    public void kq() {
        if (this.csi == 0 || !this.syt) {
            return;
        }
        csi();
    }

    private void kq(View view) {
        view.setVisibility(0);
        view.setAlpha(1.0f);
    }

    private boolean oq(View view) {
        if (view == null) {
            return true;
        }
        return !view.isShown() || ((double) view.getAlpha()) <= 0.9d;
    }
}
