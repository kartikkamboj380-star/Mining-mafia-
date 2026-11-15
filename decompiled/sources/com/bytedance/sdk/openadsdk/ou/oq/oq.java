package com.bytedance.sdk.openadsdk.ou.oq;

import android.view.View;
import com.bytedance.sdk.openadsdk.core.model.uml;
import com.unity3d.services.UnityAdsConstants;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes.dex */
public abstract class oq {
    protected final AtomicBoolean bob;
    private final AtomicBoolean csi;
    private volatile boolean dgq = false;
    private final AtomicLong fou;
    protected WeakReference<View> kq;
    protected uml oq;
    private final csi.kq rhi;
    private final int rjo;
    private final Integer syt;

    public oq(Integer num, View view, uml umlVar, int i10, csi.kq kqVar) {
        this.syt = num;
        this.rjo = i10;
        this.oq = umlVar;
        this.rhi = kqVar;
        kq(view);
        this.bob = new AtomicBoolean(false);
        this.fou = new AtomicLong(-1L);
        this.csi = new AtomicBoolean(false);
    }

    public static oq kq(boolean z9, Integer num, View view, uml umlVar, csi.kq kqVar) {
        return z9 ? new syt(num, view, umlVar, kqVar) : new bob(num, view, umlVar, kqVar);
    }

    protected abstract boolean bob();

    protected kq csi() {
        WeakReference<View> weakReference = this.kq;
        if (weakReference == null) {
            return new kq(-1, -1, -1.0f);
        }
        View view = weakReference.get();
        return view == null ? new kq(0, 0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) : new kq(view.getWidth(), view.getHeight(), view.getAlpha());
    }

    public boolean dgq() {
        return this.csi.get();
    }

    protected void fou() {
        if (this.csi.compareAndSet(false, true)) {
            fou.kq(this.oq, csi(), this.rhi);
        }
    }

    public void nn() {
        this.dgq = true;
        rjo.oq(this);
    }

    public int oq() {
        if (dgq()) {
            return 1;
        }
        WeakReference<View> weakReference = this.kq;
        View view = weakReference != null ? weakReference.get() : null;
        if (view == null || this.dgq) {
            return 3;
        }
        if (ubx().equals(view.getTag(33554433))) {
            return (ubx().equals(view.getTag(33554433)) && bob()) ? 1 : 2;
        }
        nn();
        csi.oq(ubx());
        return 3;
    }

    protected abstract void oq(int i10);

    public abstract int rhi();

    public void rjo() {
        if (dgq()) {
            return;
        }
        if (!this.bob.get()) {
            syt();
        } else if (!this.fou.compareAndSet(-1L, System.currentTimeMillis()) && System.currentTimeMillis() - this.fou.get() >= this.rjo) {
            fou();
        }
    }

    public void syt() {
        this.fou.set(-1L);
    }

    public Integer ubx() {
        return this.syt;
    }

    public boolean vvw() {
        return this.bob.get();
    }

    public void wki() {
        this.bob.set(false);
        syt();
    }

    public void kq() {
        if (this.bob.compareAndSet(false, true)) {
            rjo.kq(this);
        }
    }

    public void kq(int i10) {
        if (i10 == 4) {
            kq();
            return;
        }
        if (i10 == 8) {
            wki();
        } else if (i10 == 9) {
            fou();
        } else {
            oq(i10);
        }
    }

    public void kq(View view) {
        if (view != null) {
            view.setTag(33554433, ubx());
        }
        this.kq = new WeakReference<>(view);
    }
}
