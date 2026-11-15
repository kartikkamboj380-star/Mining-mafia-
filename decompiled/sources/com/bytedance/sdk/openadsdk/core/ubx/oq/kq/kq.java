package com.bytedance.sdk.openadsdk.core.ubx.oq.kq;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Camera;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import com.unity3d.services.UnityAdsConstants;

/* JADX INFO: loaded from: classes.dex */
class kq extends View {
    private int bob;
    private int bss;
    private int csi;
    private com.bytedance.adsdk.ugeno.dgq.rhi.kq dgq;
    private final RectF ebt;
    private ValueAnimator[] fax;
    private final Path fgm;
    private int fou;
    private ValueAnimator[] gm;
    private final Path ha;
    private final RectF ibd;
    private float[] jhe;
    private final Runnable jq;
    private int kq;
    private final float[] ktb;
    private float ls;
    private float[] mq;
    private float[] mxq;
    private final RectF nb;
    private Handler nn;
    private long nz;
    private float[] nze;
    private int oq;
    private final RectF ou;
    private oq[] oxe;
    private float pfu;
    private float rhi;
    private com.bytedance.sdk.openadsdk.core.ubx.oq.kq.oq rjo;
    private final Path rs;
    private float rz;
    private boolean[] sns;
    private String[] suf;
    private Paint syt;
    private float syw;
    private float tvh;
    private String[] ubx;
    private final AccelerateDecelerateInterpolator uml;
    private Camera vvw;
    private float wbn;
    private boolean[] wcx;
    private int wee;
    private final float[] wf;
    private Matrix wki;
    private int wol;
    private Paint xn;
    private C0284kq[] ye;
    private int yyl;
    private final Path zfx;

    /* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.core.ubx.oq.kq.kq$kq, reason: collision with other inner class name */
    private static class C0284kq implements Animator.AnimatorListener {
        private final int kq;
        private final kq oq;

        public C0284kq(kq kqVar, int i10) {
            this.oq = kqVar;
            this.kq = i10;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.oq.wcx[this.kq] = false;
            this.oq.ubx[this.kq] = this.oq.suf[this.kq];
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }
    }

    private static class oq implements Animator.AnimatorListener {
        private final int kq;
        private final kq oq;

        public oq(kq kqVar, int i10) {
            this.oq = kqVar;
            this.kq = i10;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.oq.sns[this.kq] = false;
            this.oq.fax[this.kq].start();
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }
    }

    public kq(Context context) {
        super(context);
        this.nn = new Handler(Looper.getMainLooper());
        this.ubx = new String[3];
        this.vvw = new Camera();
        this.wki = new Matrix();
        this.suf = new String[3];
        this.nze = new float[3];
        this.mxq = new float[3];
        this.sns = new boolean[3];
        this.wcx = new boolean[3];
        this.gm = new ValueAnimator[3];
        this.fax = new ValueAnimator[3];
        this.mq = new float[3];
        this.jhe = new float[3];
        this.uml = new AccelerateDecelerateInterpolator();
        this.nb = new RectF();
        this.ou = new RectF();
        this.ebt = new RectF();
        this.ibd = new RectF();
        this.rs = new Path();
        this.ha = new Path();
        this.fgm = new Path();
        this.zfx = new Path();
        this.ktb = new float[8];
        this.wf = new float[8];
        this.nz = 0L;
        this.jq = new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.ubx.oq.kq.kq.1
            @Override // java.lang.Runnable
            public void run() {
                kq.kq(kq.this);
                kq.this.invalidate();
                if (kq.this.kq > 0) {
                    kq.this.nn.postDelayed(this, 1000L);
                } else {
                    kq.this.nn.removeCallbacks(this);
                    kq.this.oq();
                }
            }
        };
        fou();
        csi();
        bob();
    }

    static /* synthetic */ int kq(kq kqVar) {
        int i10 = kqVar.kq;
        kqVar.kq = i10 - 1;
        return i10;
    }

    @Override // android.view.View
    @SuppressLint({"DefaultLocale"})
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.fou <= 0 || this.csi <= 0) {
            return;
        }
        this.nb.set((getWidth() - this.fou) / 2.0f, (getHeight() - this.csi) / 2.0f, (getWidth() + this.fou) / 2.0f, (getHeight() + this.csi) / 2.0f);
        RectF rectF = this.nb;
        float f10 = this.rhi;
        canvas.drawRoundRect(rectF, f10, f10, this.syt);
        int i10 = this.kq;
        this.yyl = i10 / 3600;
        int i11 = i10 % 3600;
        this.wol = i11;
        this.bss = i11 / 60;
        this.wee = i11 % 60;
        this.tvh = this.fou;
        this.wbn = this.csi;
        float width = (getWidth() - getPaddingLeft()) - getPaddingRight();
        this.syw = width;
        float f11 = this.tvh * 3.0f;
        this.ls = f11;
        float f12 = width - f11;
        this.rz = f12;
        this.pfu = f12 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? f12 / 2.0f : 10.0f;
        kq(this.yyl, this.bss, this.wee);
        float paddingLeft = getPaddingLeft();
        float fCenterY = this.nb.centerY();
        float f13 = this.wbn;
        kq(canvas, paddingLeft, fCenterY - (f13 / 2.0f), this.tvh, f13, String.format("%02d", Integer.valueOf(this.yyl)), 0);
        float paddingLeft2 = this.pfu + getPaddingLeft() + this.tvh;
        float fCenterY2 = this.nb.centerY();
        float f14 = this.wbn;
        kq(canvas, paddingLeft2, fCenterY2 - (f14 / 2.0f), this.tvh, f14, String.format("%02d", Integer.valueOf(this.bss)), 1);
        float paddingLeft3 = ((this.tvh + this.pfu) * 2.0f) + getPaddingLeft();
        float fCenterY3 = this.nb.centerY();
        float f15 = this.wbn;
        kq(canvas, paddingLeft3, fCenterY3 - (f15 / 2.0f), this.tvh, f15, String.format("%02d", Integer.valueOf(this.wee)), 2);
        kq(canvas, getPaddingLeft() + this.tvh + (this.pfu / 2.0f), this.nb.centerY());
        kq(canvas, getPaddingLeft() + (this.tvh * 2.0f) + ((this.pfu * 3.0f) / 2.0f), this.nb.centerY());
        com.bytedance.sdk.openadsdk.core.ubx.oq.kq.oq oqVar = this.rjo;
        if (oqVar != null) {
            oqVar.kq(canvas);
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i10, int i11) {
        com.bytedance.sdk.openadsdk.core.ubx.oq.kq.oq oqVar = this.rjo;
        if (oqVar == null) {
            super.onMeasure(i10, i11);
            return;
        }
        int[] iArrKq = oqVar.kq(i10, i11);
        if (this.csi > 0) {
            int mode = View.MeasureSpec.getMode(iArrKq[1]);
            int size = View.MeasureSpec.getSize(iArrKq[1]);
            if (mode == 0 || size > this.csi) {
                iArrKq[1] = View.MeasureSpec.makeMeasureSpec(this.csi, 1073741824);
            }
        }
        super.onMeasure(iArrKq[0], iArrKq[1]);
    }

    private void bob() {
        this.oxe = new oq[3];
        this.ye = new C0284kq[3];
        for (int i10 = 0; i10 < 3; i10++) {
            this.oxe[i10] = new oq(this, i10);
            this.ye[i10] = new C0284kq(this, i10);
        }
    }

    private void csi() {
        if (this.dgq == null) {
            com.bytedance.adsdk.ugeno.dgq.rhi.kq kqVar = new com.bytedance.adsdk.ugeno.dgq.rhi.kq(getContext());
            this.dgq = kqVar;
            this.xn = kqVar.getPaint();
        }
    }

    private void fou() {
        Paint paint = new Paint();
        this.syt = paint;
        paint.setColor(this.oq);
        this.syt.setAntiAlias(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void oq(int i10, ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        this.nze[i10] = fFloatValue;
        this.mq[i10] = 1.0f - (fFloatValue / (-90.0f));
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis - this.nz >= 16) {
            invalidate();
            this.nz = jCurrentTimeMillis;
        }
    }

    public void kq(int i10, int i11, int i12, int i13, int i14, float f10) {
        int iMin = Math.min(i10, 360060);
        this.oq = i11;
        this.bob = i12;
        this.fou = i13;
        this.csi = i14;
        this.rhi = f10;
        this.kq = iMin;
        this.nn.post(this.jq);
        Paint paint = this.syt;
        if (paint != null) {
            paint.setColor(this.oq);
        }
        float[] fArr = this.ktb;
        float f11 = this.rhi;
        fArr[3] = f11;
        fArr[2] = f11;
        fArr[1] = f11;
        fArr[0] = f11;
        fArr[7] = 0.0f;
        fArr[6] = 0.0f;
        fArr[5] = 0.0f;
        fArr[4] = 0.0f;
        float[] fArr2 = this.wf;
        fArr2[3] = 0.0f;
        fArr2[2] = 0.0f;
        fArr2[1] = 0.0f;
        fArr2[0] = 0.0f;
        fArr2[7] = f11;
        fArr2[6] = f11;
        fArr2[5] = f11;
        fArr2[4] = f11;
        invalidate();
    }

    public void oq() {
        for (int i10 = 0; i10 < 3; i10++) {
            ValueAnimator valueAnimator = this.gm[i10];
            if (valueAnimator != null && valueAnimator.isRunning()) {
                this.gm[i10].cancel();
            }
            ValueAnimator valueAnimator2 = this.fax[i10];
            if (valueAnimator2 != null && valueAnimator2.isRunning()) {
                this.fax[i10].cancel();
            }
        }
    }

    public void kq(com.bytedance.sdk.openadsdk.core.ubx.oq.kq.oq oqVar) {
        this.rjo = oqVar;
    }

    private void kq(Canvas canvas, float f10, float f11, float f12, float f13, String str, int i10) {
        this.ou.set(f10, f11, f12 + f10, f13 + f11);
        float fCenterY = this.ou.centerY();
        float fCenterY2 = this.ou.centerY() - ((this.dgq.getPaint().descent() + this.dgq.getPaint().ascent()) / 2.0f);
        RectF rectF = this.ebt;
        RectF rectF2 = this.ou;
        rectF.set(rectF2.left, rectF2.top, rectF2.right, fCenterY);
        this.rs.reset();
        Path path = this.rs;
        RectF rectF3 = this.ebt;
        float[] fArr = this.ktb;
        Path.Direction direction = Path.Direction.CW;
        path.addRoundRect(rectF3, fArr, direction);
        this.syt.setColor(this.oq);
        canvas.drawPath(this.rs, this.syt);
        this.xn.setTextAlign(Paint.Align.CENTER);
        canvas.drawText(str, this.ou.centerX(), fCenterY2, this.xn);
        RectF rectF4 = this.ibd;
        RectF rectF5 = this.ou;
        rectF4.set(rectF5.left, fCenterY, rectF5.right, rectF5.bottom);
        this.ha.reset();
        this.ha.addRoundRect(this.ibd, this.wf, direction);
        this.syt.setColor(this.bob);
        canvas.drawPath(this.ha, this.syt);
        canvas.drawText(str, this.ou.centerX(), fCenterY2, this.dgq.getPaint());
        boolean z9 = this.sns[i10];
        if (z9 || this.wcx[i10]) {
            if (z9) {
                canvas.save();
                this.wki.reset();
                this.vvw.save();
                this.vvw.rotateX(this.nze[i10]);
                this.vvw.getMatrix(this.wki);
                this.wki.preTranslate(-this.ou.centerX(), -fCenterY);
                this.wki.postTranslate(this.ou.centerX(), fCenterY);
                canvas.concat(this.wki);
                this.fgm.reset();
                this.fgm.addRoundRect(this.ebt, this.ktb, direction);
                this.syt.setColor(this.oq);
                canvas.drawPath(this.fgm, this.syt);
                int alpha = this.xn.getAlpha();
                this.xn.setAlpha((int) (this.mq[i10] * 255.0f));
                canvas.drawText(this.ubx[i10], this.ou.centerX(), fCenterY2, this.xn);
                this.xn.setAlpha(alpha);
                this.vvw.restore();
                canvas.restore();
            }
            if (this.wcx[i10]) {
                canvas.save();
                this.wki.reset();
                this.vvw.save();
                this.vvw.rotateX(this.mxq[i10]);
                this.vvw.getMatrix(this.wki);
                this.wki.preTranslate(-this.ou.centerX(), -fCenterY);
                this.wki.postTranslate(this.ou.centerX(), fCenterY);
                canvas.concat(this.wki);
                this.zfx.reset();
                this.zfx.addRoundRect(this.ibd, this.wf, direction);
                this.syt.setColor(this.bob);
                canvas.drawPath(this.zfx, this.syt);
                int alpha2 = this.xn.getAlpha();
                this.xn.setAlpha((int) (this.jhe[i10] * 255.0f));
                canvas.drawText(this.suf[i10], this.ou.centerX(), fCenterY2, this.xn);
                this.xn.setAlpha(alpha2);
                this.vvw.restore();
                canvas.restore();
            }
        }
    }

    private void kq(Canvas canvas, float f10, float f11) {
        canvas.drawText(":", f10, f11 - ((this.xn.descent() + this.xn.ascent()) / 2.0f), this.xn);
    }

    @SuppressLint({"DefaultLocale"})
    private void kq(int i10, int i11, int i12) {
        String str = this.ubx[0];
        String str2 = String.format("%02d", Integer.valueOf(i10));
        if (!str2.equals(str) && !this.sns[0] && !this.wcx[0] && str != null) {
            kq(0, str, str2);
        }
        String str3 = this.ubx[1];
        String str4 = String.format("%02d", Integer.valueOf(i11));
        if (!str4.equals(str3) && !this.sns[1] && !this.wcx[1] && str3 != null) {
            kq(1, str3, str4);
        }
        String str5 = this.ubx[2];
        String str6 = String.format("%02d", Integer.valueOf(i12));
        if (!str6.equals(str5) && !this.sns[2] && !this.wcx[2] && str5 != null) {
            kq(2, str5, str6);
        }
        String[] strArr = this.ubx;
        if (strArr[0] == null) {
            strArr[0] = str2;
        }
        if (strArr[1] == null) {
            strArr[1] = str4;
        }
        if (strArr[2] == null) {
            strArr[2] = str6;
        }
    }

    private void kq(final int i10, String str, String str2) {
        this.ubx[i10] = str;
        this.suf[i10] = str2;
        this.sns[i10] = true;
        this.wcx[i10] = true;
        this.nze[i10] = 0.0f;
        this.mxq[i10] = 90.0f;
        this.mq[i10] = 1.0f;
        this.jhe[i10] = 0.0f;
        ValueAnimator[] valueAnimatorArr = this.gm;
        ValueAnimator valueAnimator = valueAnimatorArr[i10];
        if (valueAnimator == null) {
            valueAnimatorArr[i10] = ValueAnimator.ofFloat(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, -90.0f);
            this.gm[i10].setDuration(250L);
            this.gm[i10].setInterpolator(this.uml);
            this.gm[i10].addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.sdk.openadsdk.core.ubx.oq.kq.a
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                    this.f13639a.oq(i10, valueAnimator2);
                }
            });
            this.gm[i10].addListener(this.oxe[i10]);
        } else {
            valueAnimator.setFloatValues(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, -90.0f);
        }
        ValueAnimator[] valueAnimatorArr2 = this.fax;
        ValueAnimator valueAnimator2 = valueAnimatorArr2[i10];
        if (valueAnimator2 == null) {
            valueAnimatorArr2[i10] = ValueAnimator.ofFloat(-90.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            this.fax[i10].setDuration(250L);
            this.fax[i10].setInterpolator(this.uml);
            this.fax[i10].addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.sdk.openadsdk.core.ubx.oq.kq.b
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator3) {
                    this.f13641a.kq(i10, valueAnimator3);
                }
            });
            this.fax[i10].addListener(this.ye[i10]);
        } else {
            valueAnimator2.setFloatValues(-90.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        }
        if (this.gm[i10].isRunning()) {
            this.gm[i10].cancel();
        }
        if (this.fax[i10].isRunning()) {
            this.fax[i10].cancel();
        }
        this.gm[i10].start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void kq(int i10, ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        this.mxq[i10] = fFloatValue;
        this.jhe[i10] = (fFloatValue + 90.0f) / 90.0f;
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis - this.nz >= 16) {
            invalidate();
            this.nz = jCurrentTimeMillis;
        }
    }

    public com.bytedance.adsdk.ugeno.dgq.rhi.kq kq() {
        return this.dgq;
    }

    public void kq(com.bytedance.adsdk.ugeno.dgq.rhi.kq kqVar) {
        this.dgq = kqVar;
    }
}
