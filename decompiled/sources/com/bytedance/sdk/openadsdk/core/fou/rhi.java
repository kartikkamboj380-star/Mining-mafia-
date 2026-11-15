package com.bytedance.sdk.openadsdk.core.fou;

import android.content.Context;
import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewTreeObserver;
import com.bytedance.sdk.component.utils.rs;
import com.bytedance.sdk.openadsdk.core.suf;
import com.bytedance.sdk.openadsdk.core.xn;
import com.bytedance.sdk.openadsdk.utils.nz;

/* JADX INFO: loaded from: classes.dex */
public class rhi extends com.bytedance.adsdk.ugeno.rhi.kq<View> implements rs.kq {
    private long csi;
    private kq dgq;
    private final Handler fou;
    private final Runnable nn;
    private boolean rhi;
    private boolean rjo;
    private oq syt;
    private final ViewTreeObserver.OnScrollChangedListener ubx;

    public interface kq {
        void kq(boolean z9);
    }

    public interface oq {
        void kq(boolean z9);
    }

    public rhi(Context context) {
        super(context);
        this.fou = new rs(suf.oq().getLooper(), this);
        this.rhi = true;
        this.rjo = true;
        this.nn = new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.fou.rhi.1
            @Override // java.lang.Runnable
            public void run() {
                if (rhi.this.dgq != null) {
                    rhi.this.dgq.kq(rhi.this.rjo);
                }
            }
        };
        this.ubx = new ViewTreeObserver.OnScrollChangedListener() { // from class: com.bytedance.sdk.openadsdk.core.fou.rhi.2
            @Override // android.view.ViewTreeObserver.OnScrollChangedListener
            public void onScrollChanged() {
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                if (jElapsedRealtime - rhi.this.csi > 500) {
                    rhi.this.csi = jElapsedRealtime;
                    rhi.this.fou.sendEmptyMessageDelayed(1, 500L);
                }
            }
        };
    }

    private void rjo() {
        boolean zKq = xn.kq(this, 50, -1, false);
        this.rjo = zKq;
        if (zKq == this.rhi) {
            return;
        }
        this.rhi = zKq;
        nz.kq(this.nn);
    }

    @Override // com.bytedance.adsdk.ugeno.rhi.kq
    public View nn(int i10) {
        return (View) this.kq.get(i10);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        getViewTreeObserver().addOnScrollChangedListener(this.ubx);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ViewTreeObserver viewTreeObserver = getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnScrollChangedListener(this.ubx);
        }
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z9) {
        super.onWindowFocusChanged(z9);
        oq oqVar = this.syt;
        if (oqVar != null) {
            oqVar.kq(z9);
        }
    }

    public void setSwiperVisibleChangeListener(kq kqVar) {
        this.dgq = kqVar;
    }

    public void setSwiperWindowFocusChangedListener(oq oqVar) {
        this.syt = oqVar;
    }

    @Override // com.bytedance.sdk.component.utils.rs.kq
    public void kq(Message message) {
        if (message.what == 1) {
            rjo();
        }
    }
}
