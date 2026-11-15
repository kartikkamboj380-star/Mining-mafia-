package com.bytedance.adsdk.oq.rhi;

import android.view.Choreographer;
import com.bytedance.adsdk.oq.rjo;
import com.unity3d.services.UnityAdsConstants;

/* JADX INFO: loaded from: classes.dex */
public class bob extends kq implements Choreographer.FrameCallback {
    private rjo nn;
    private float oq = 1.0f;
    private boolean bob = false;
    private long fou = 0;
    private float csi = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    private float rhi = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    private int rjo = 0;
    private float syt = -2.1474836E9f;
    private float dgq = 2.1474836E9f;
    protected boolean kq = false;
    private boolean ubx = false;

    private boolean fax() {
        return nn() < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    }

    private float gm() {
        rjo rjoVar = this.nn;
        if (rjoVar == null) {
            return Float.MAX_VALUE;
        }
        return (1.0E9f / rjoVar.vvw()) / Math.abs(this.oq);
    }

    private void mq() {
        if (this.nn == null) {
            return;
        }
        float f10 = this.rhi;
        if (f10 < this.syt || f10 > this.dgq) {
            throw new IllegalStateException(String.format("Frame must be [%f,%f]. It is %f", Float.valueOf(this.syt), Float.valueOf(this.dgq), Float.valueOf(this.rhi)));
        }
    }

    public void bob(boolean z9) {
        this.ubx = z9;
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public void cancel() {
        oq();
        wcx();
    }

    public void dgq() {
        bob(-nn());
    }

    @Override // android.view.Choreographer.FrameCallback
    public void doFrame(long j10) {
        sns();
        if (this.nn == null || !isRunning()) {
            return;
        }
        com.bytedance.adsdk.oq.csi.kq("LottieValueAnimator#doFrame");
        long j11 = this.fou;
        float fGm = (j11 != 0 ? j10 - j11 : 0L) / gm();
        float f10 = this.csi;
        if (fax()) {
            fGm = -fGm;
        }
        float f11 = f10 + fGm;
        boolean zBob = csi.bob(f11, nze(), mxq());
        float f12 = this.csi;
        float fOq = csi.oq(f11, nze(), mxq());
        this.csi = fOq;
        if (this.ubx) {
            fOq = (float) Math.floor(fOq);
        }
        this.rhi = fOq;
        this.fou = j10;
        if (!this.ubx || this.csi != f12) {
            bob();
        }
        if (!zBob) {
            if (getRepeatCount() == -1 || this.rjo < getRepeatCount()) {
                kq();
                this.rjo++;
                if (getRepeatMode() == 2) {
                    this.bob = !this.bob;
                    dgq();
                } else {
                    float fMxq = fax() ? mxq() : nze();
                    this.csi = fMxq;
                    this.rhi = fMxq;
                }
                this.fou = j10;
            } else {
                float fNze = this.oq < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? nze() : mxq();
                this.csi = fNze;
                this.rhi = fNze;
                wcx();
                oq(fax());
            }
        }
        mq();
        com.bytedance.adsdk.oq.csi.oq("LottieValueAnimator#doFrame");
    }

    protected void fou(boolean z9) {
        Choreographer.getInstance().removeFrameCallback(this);
        if (z9) {
            this.kq = false;
        }
    }

    @Override // android.animation.ValueAnimator
    public float getAnimatedFraction() {
        float fNze;
        float fMxq;
        float fNze2;
        if (this.nn == null) {
            return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        }
        if (fax()) {
            fNze = mxq() - this.rhi;
            fMxq = mxq();
            fNze2 = nze();
        } else {
            fNze = this.rhi - nze();
            fMxq = mxq();
            fNze2 = nze();
        }
        return fNze / (fMxq - fNze2);
    }

    @Override // android.animation.ValueAnimator
    public Object getAnimatedValue() {
        return Float.valueOf(rhi());
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public long getDuration() {
        rjo rjoVar = this.nn;
        if (rjoVar == null) {
            return 0L;
        }
        return (long) rjoVar.csi();
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public boolean isRunning() {
        return this.kq;
    }

    public void kq(rjo rjoVar) {
        boolean z9 = this.nn == null;
        this.nn = rjoVar;
        if (z9) {
            kq(Math.max(this.syt, rjoVar.rhi()), Math.min(this.dgq, rjoVar.rjo()));
        } else {
            kq((int) rjoVar.rhi(), (int) rjoVar.rjo());
        }
        float f10 = this.rhi;
        this.rhi = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        this.csi = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        kq((int) f10);
        bob();
    }

    public float mxq() {
        rjo rjoVar = this.nn;
        if (rjoVar == null) {
            return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        }
        float f10 = this.dgq;
        return f10 == 2.1474836E9f ? rjoVar.rjo() : f10;
    }

    public float nn() {
        return this.oq;
    }

    public float nze() {
        rjo rjoVar = this.nn;
        if (rjoVar == null) {
            return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        }
        float f10 = this.syt;
        return f10 == -2.1474836E9f ? rjoVar.rhi() : f10;
    }

    public void oq(float f10) {
        kq(this.syt, f10);
    }

    public float rhi() {
        rjo rjoVar = this.nn;
        return rjoVar == null ? UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT : (this.rhi - rjoVar.rhi()) / (this.nn.rjo() - this.nn.rhi());
    }

    public float rjo() {
        return this.rhi;
    }

    @Override // android.animation.ValueAnimator
    public void setRepeatMode(int i10) {
        super.setRepeatMode(i10);
        if (i10 == 2 || !this.bob) {
            return;
        }
        this.bob = false;
        dgq();
    }

    protected void sns() {
        if (isRunning()) {
            fou(false);
            Choreographer.getInstance().postFrameCallback(this);
        }
    }

    public void suf() {
        this.kq = true;
        sns();
        this.fou = 0L;
        if (fax() && rjo() == nze()) {
            kq(mxq());
        } else if (!fax() && rjo() == mxq()) {
            kq(nze());
        }
        csi();
    }

    public void syt() {
        this.nn = null;
        this.syt = -2.1474836E9f;
        this.dgq = 2.1474836E9f;
    }

    public void ubx() {
        this.kq = true;
        kq(fax());
        kq((int) (fax() ? mxq() : nze()));
        this.fou = 0L;
        this.rjo = 0;
        sns();
    }

    public void vvw() {
        wcx();
        oq(fax());
    }

    protected void wcx() {
        fou(true);
    }

    public void wki() {
        wcx();
        fou();
    }

    public void bob(float f10) {
        this.oq = f10;
    }

    @Override // com.bytedance.adsdk.oq.rhi.kq
    void oq() {
        super.oq();
        oq(fax());
    }

    public void kq(float f10) {
        if (this.csi == f10) {
            return;
        }
        float fOq = csi.oq(f10, nze(), mxq());
        this.csi = fOq;
        if (this.ubx) {
            fOq = (float) Math.floor(fOq);
        }
        this.rhi = fOq;
        this.fou = 0L;
        bob();
    }

    public void kq(int i10) {
        kq(i10, (int) this.dgq);
    }

    public void kq(float f10, float f11) {
        if (f10 <= f11) {
            rjo rjoVar = this.nn;
            float fRhi = rjoVar == null ? -3.4028235E38f : rjoVar.rhi();
            rjo rjoVar2 = this.nn;
            float fRjo = rjoVar2 == null ? Float.MAX_VALUE : rjoVar2.rjo();
            float fOq = csi.oq(f10, fRhi, fRjo);
            float fOq2 = csi.oq(f11, fRhi, fRjo);
            if (fOq == this.syt && fOq2 == this.dgq) {
                return;
            }
            this.syt = fOq;
            this.dgq = fOq2;
            kq((int) csi.oq(this.rhi, fOq, fOq2));
            return;
        }
        throw new IllegalArgumentException(String.format("minFrame (%s) must be <= maxFrame (%s)", Float.valueOf(f10), Float.valueOf(f11)));
    }
}
