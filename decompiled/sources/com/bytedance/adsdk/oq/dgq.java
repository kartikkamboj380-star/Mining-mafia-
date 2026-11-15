package com.bytedance.adsdk.oq;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageView;
import com.bytedance.adsdk.oq.csi.jhe;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class dgq extends Drawable implements Animatable, Drawable.Callback {
    fax bob;
    private Matrix bss;
    private final com.bytedance.adsdk.oq.rhi.bob csi;
    private oq dgq;
    private boolean ebt;
    private com.bytedance.adsdk.oq.bob.bob.oq fax;
    private Rect fgm;
    private rjo fou;
    private boolean gm;
    private Canvas ha;
    private final Matrix ibd;
    private boolean jhe;
    String kq;
    private Paint ktb;
    private int mq;
    private Map<String, Typeface> mxq;
    private boolean nb;
    private final ArrayList<kq> nn;
    private RectF nz;
    private com.bytedance.adsdk.oq.oq.kq nze;
    bob oq;
    private gm ou;
    private boolean rhi;
    private boolean rjo;
    private Bitmap rs;
    private boolean sns;
    private fou suf;
    private boolean syt;
    private boolean tvh;
    private final ValueAnimator.AnimatorUpdateListener ubx;
    private boolean uml;
    private com.bytedance.adsdk.oq.oq.oq vvw;
    private boolean wcx;
    private View wee;
    private Rect wf;
    private String wki;
    private Matrix wol;
    private Rect xn;
    private RectF yyl;
    private RectF zfx;

    private interface kq {
        void kq(rjo rjoVar);
    }

    private enum oq {
        NONE,
        PLAY,
        RESUME
    }

    public dgq() {
        com.bytedance.adsdk.oq.rhi.bob bobVar = new com.bytedance.adsdk.oq.rhi.bob();
        this.csi = bobVar;
        this.rhi = true;
        this.rjo = false;
        this.syt = false;
        this.dgq = oq.NONE;
        this.nn = new ArrayList<>();
        ValueAnimator.AnimatorUpdateListener animatorUpdateListener = new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.adsdk.oq.dgq.1
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                if (dgq.this.fax != null) {
                    dgq.this.fax.kq(dgq.this.csi.rhi());
                }
            }
        };
        this.ubx = animatorUpdateListener;
        this.wcx = false;
        this.gm = true;
        this.mq = 255;
        this.ou = gm.AUTOMATIC;
        this.ebt = false;
        this.ibd = new Matrix();
        this.tvh = false;
        bobVar.addUpdateListener(animatorUpdateListener);
    }

    private boolean ktb() {
        return this.rhi || this.rjo;
    }

    private Context nz() {
        Drawable.Callback callback = getCallback();
        if (callback != null && (callback instanceof View)) {
            return ((View) callback).getContext();
        }
        return null;
    }

    private com.bytedance.adsdk.oq.oq.oq wf() {
        com.bytedance.adsdk.oq.oq.oq oqVar = this.vvw;
        if (oqVar != null && !oqVar.kq(nz())) {
            this.vvw = null;
        }
        if (this.vvw == null) {
            this.vvw = new com.bytedance.adsdk.oq.oq.oq(getCallback(), this.wki, this.suf, this.fou.mxq());
        }
        return this.vvw;
    }

    private boolean wol() {
        Drawable.Callback callback = getCallback();
        if (!(callback instanceof View)) {
            return false;
        }
        ViewParent parent = ((View) callback).getParent();
        return (parent instanceof ViewGroup) && !((ViewGroup) parent).getClipChildren();
    }

    private com.bytedance.adsdk.oq.oq.kq xn() {
        if (getCallback() == null) {
            return null;
        }
        if (this.nze == null) {
            com.bytedance.adsdk.oq.oq.kq kqVar = new com.bytedance.adsdk.oq.oq.kq(getCallback(), this.oq);
            this.nze = kqVar;
            String str = this.kq;
            if (str != null) {
                kqVar.kq(str);
            }
        }
        return this.nze;
    }

    private void yyl() {
        if (this.ha != null) {
            return;
        }
        this.ha = new Canvas();
        this.yyl = new RectF();
        this.wol = new Matrix();
        this.bss = new Matrix();
        this.fgm = new Rect();
        this.zfx = new RectF();
        this.ktb = new com.bytedance.adsdk.oq.kq.kq();
        this.wf = new Rect();
        this.xn = new Rect();
        this.nz = new RectF();
    }

    private void zfx() {
        rjo rjoVar = this.fou;
        if (rjoVar == null) {
            return;
        }
        this.ebt = this.ou.kq(Build.VERSION.SDK_INT, rjoVar.kq(), rjoVar.oq());
    }

    public boolean bob() {
        return this.gm;
    }

    public boolean csi() {
        return this.wcx;
    }

    public boolean dgq() {
        return this.nb;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        csi.kq("Drawable#draw");
        try {
            if (this.ebt) {
                kq(canvas, this.fax);
            } else {
                kq(canvas);
            }
        } catch (Throwable unused) {
        }
        this.tvh = false;
        csi.oq("Drawable#draw");
    }

    public rjo ebt() {
        return this.fou;
    }

    @SuppressLint({"WrongConstant"})
    public int fax() {
        return this.csi.getRepeatMode();
    }

    public RectF fgm() {
        return this.yyl;
    }

    public String fou() {
        return this.wki;
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.mq;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        rjo rjoVar = this.fou;
        if (rjoVar == null) {
            return -1;
        }
        return rjoVar.fou().height();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        rjo rjoVar = this.fou;
        if (rjoVar == null) {
            return -1;
        }
        return rjoVar.fou().width();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    public int gm() {
        return (int) this.csi.rjo();
    }

    public float ha() {
        return this.csi.rhi();
    }

    public void ibd() {
        this.nn.clear();
        this.csi.cancel();
        if (isVisible()) {
            return;
        }
        this.dgq = oq.NONE;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback == null) {
            return;
        }
        callback.invalidateDrawable(this);
    }

    @Override // android.graphics.drawable.Drawable
    public void invalidateSelf() {
        if (this.tvh) {
            return;
        }
        this.tvh = true;
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        return jhe();
    }

    public boolean jhe() {
        com.bytedance.adsdk.oq.rhi.bob bobVar = this.csi;
        if (bobVar == null) {
            return false;
        }
        return bobVar.isRunning();
    }

    public int mq() {
        return this.csi.getRepeatCount();
    }

    public float mxq() {
        return this.csi.nn();
    }

    public fax nb() {
        return this.bob;
    }

    public void nn() {
        if (this.csi.isRunning()) {
            this.csi.cancel();
            if (!isVisible()) {
                this.dgq = oq.NONE;
            }
        }
        this.fou = null;
        this.fax = null;
        this.vvw = null;
        this.csi.syt();
        invalidateSelf();
    }

    public float nze() {
        return this.csi.mxq();
    }

    public boolean ou() {
        return this.mxq == null && this.bob == null && this.fou.suf().size() > 0;
    }

    public gm rhi() {
        return this.ebt ? gm.SOFTWARE : gm.HARDWARE;
    }

    public boolean rjo() {
        return this.ebt;
    }

    public void rs() {
        this.nn.clear();
        this.csi.wki();
        if (isVisible()) {
            return;
        }
        this.dgq = oq.NONE;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j10) {
        Drawable.Callback callback = getCallback();
        if (callback == null) {
            return;
        }
        callback.scheduleDrawable(this, runnable, j10);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        this.mq = i10;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z9, boolean z10) {
        boolean zIsVisible = isVisible();
        boolean visible = super.setVisible(z9, z10);
        if (z9) {
            oq oqVar = this.dgq;
            if (oqVar == oq.PLAY) {
                ubx();
                return visible;
            }
            if (oqVar == oq.RESUME) {
                wki();
                return visible;
            }
        } else {
            if (this.csi.isRunning()) {
                rs();
                this.dgq = oq.RESUME;
                return visible;
            }
            if (zIsVisible) {
                this.dgq = oq.NONE;
            }
        }
        return visible;
    }

    public void sns() {
        this.csi.removeAllUpdateListeners();
        this.csi.addUpdateListener(this.ubx);
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        Drawable.Callback callback = getCallback();
        if ((callback instanceof View) && ((View) callback).isInEditMode()) {
            return;
        }
        ubx();
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        vvw();
    }

    public float suf() {
        return this.csi.nze();
    }

    public wcx syt() {
        rjo rjoVar = this.fou;
        if (rjoVar != null) {
            return rjoVar.bob();
        }
        return null;
    }

    public void ubx() {
        if (this.fax == null) {
            this.nn.add(new kq() { // from class: com.bytedance.adsdk.oq.dgq.6
                @Override // com.bytedance.adsdk.oq.dgq.kq
                public void kq(rjo rjoVar) {
                    dgq.this.ubx();
                }
            });
            return;
        }
        zfx();
        if (ktb() || mq() == 0) {
            if (isVisible()) {
                this.csi.ubx();
                this.dgq = oq.NONE;
            } else {
                this.dgq = oq.PLAY;
            }
        }
        if (ktb()) {
            return;
        }
        bob((int) (mxq() < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? suf() : nze()));
        this.csi.vvw();
        if (isVisible()) {
            return;
        }
        this.dgq = oq.NONE;
    }

    boolean uml() {
        if (isVisible()) {
            return this.csi.isRunning();
        }
        oq oqVar = this.dgq;
        return oqVar == oq.PLAY || oqVar == oq.RESUME;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback == null) {
            return;
        }
        callback.unscheduleDrawable(this, runnable);
    }

    public void vvw() {
        this.nn.clear();
        this.csi.vvw();
        if (isVisible()) {
            return;
        }
        this.dgq = oq.NONE;
    }

    public void wcx() {
        this.csi.removeAllListeners();
    }

    public void wki() {
        if (this.fax == null) {
            this.nn.add(new kq() { // from class: com.bytedance.adsdk.oq.dgq.7
                @Override // com.bytedance.adsdk.oq.dgq.kq
                public void kq(rjo rjoVar) {
                    dgq.this.wki();
                }
            });
            return;
        }
        zfx();
        if (ktb() || mq() == 0) {
            if (isVisible()) {
                this.csi.suf();
                this.dgq = oq.NONE;
            } else {
                this.dgq = oq.RESUME;
            }
        }
        if (ktb()) {
            return;
        }
        bob((int) (mxq() < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? suf() : nze()));
        this.csi.vvw();
        if (isVisible()) {
            return;
        }
        this.dgq = oq.NONE;
    }

    public void bob(boolean z9) {
        this.jhe = z9;
        rjo rjoVar = this.fou;
        if (rjoVar != null) {
            rjoVar.oq(z9);
        }
    }

    public void csi(boolean z9) {
        this.nb = z9;
    }

    public void fou(boolean z9) {
        if (this.uml == z9) {
            return;
        }
        this.uml = z9;
        com.bytedance.adsdk.oq.bob.bob.oq oqVar = this.fax;
        if (oqVar != null) {
            oqVar.kq(z9);
        }
    }

    public void kq(View view) {
        this.wee = view;
    }

    public com.bytedance.adsdk.oq.bob.bob.oq oq() {
        return this.fax;
    }

    public void rhi(boolean z9) {
        this.syt = z9;
    }

    public void rjo(boolean z9) {
        this.rjo = z9;
    }

    public void csi(int i10) {
        this.csi.setRepeatCount(i10);
    }

    public View kq() {
        return this.wee;
    }

    public void oq(boolean z9) {
        this.wcx = z9;
    }

    public nn rhi(String str) {
        rjo rjoVar = this.fou;
        if (rjoVar == null) {
            return null;
        }
        return rjoVar.mxq().get(str);
    }

    public void rjo(String str) {
        this.kq = str;
        com.bytedance.adsdk.oq.oq.kq kqVarXn = xn();
        if (kqVarXn != null) {
            kqVarXn.kq(str);
        }
    }

    public void syt(boolean z9) {
        this.csi.bob(z9);
    }

    public Bitmap csi(String str) {
        com.bytedance.adsdk.oq.oq.oq oqVarWf = wf();
        if (oqVarWf != null) {
            return oqVarWf.kq(str);
        }
        return null;
    }

    public void kq(boolean z9, Context context) {
        if (this.sns == z9) {
            return;
        }
        this.sns = z9;
        if (this.fou != null) {
            kq(context);
        }
    }

    public void oq(final int i10) {
        if (this.fou == null) {
            this.nn.add(new kq() { // from class: com.bytedance.adsdk.oq.dgq.10
                @Override // com.bytedance.adsdk.oq.dgq.kq
                public void kq(rjo rjoVar) {
                    dgq.this.oq(i10);
                }
            });
        } else {
            this.csi.oq(i10 + 0.99f);
        }
    }

    public void bob(final String str) {
        rjo rjoVar = this.fou;
        if (rjoVar == null) {
            this.nn.add(new kq() { // from class: com.bytedance.adsdk.oq.dgq.13
                @Override // com.bytedance.adsdk.oq.dgq.kq
                public void kq(rjo rjoVar2) {
                    dgq.this.bob(str);
                }
            });
            return;
        }
        com.bytedance.adsdk.oq.bob.rhi rhiVarBob = rjoVar.bob(str);
        if (rhiVarBob != null) {
            oq((int) (rhiVarBob.kq + rhiVarBob.oq));
            return;
        }
        throw new IllegalArgumentException("Cannot find marker with name " + str + ".");
    }

    public void fou(final String str) {
        rjo rjoVar = this.fou;
        if (rjoVar == null) {
            this.nn.add(new kq() { // from class: com.bytedance.adsdk.oq.dgq.2
                @Override // com.bytedance.adsdk.oq.dgq.kq
                public void kq(rjo rjoVar2) {
                    dgq.this.fou(str);
                }
            });
            return;
        }
        com.bytedance.adsdk.oq.bob.rhi rhiVarBob = rjoVar.bob(str);
        if (rhiVarBob != null) {
            int i10 = (int) rhiVarBob.kq;
            kq(i10, ((int) rhiVarBob.oq) + i10);
        } else {
            throw new IllegalArgumentException("Cannot find marker with name " + str + ".");
        }
    }

    public void oq(final float f10) {
        rjo rjoVar = this.fou;
        if (rjoVar == null) {
            this.nn.add(new kq() { // from class: com.bytedance.adsdk.oq.dgq.11
                @Override // com.bytedance.adsdk.oq.dgq.kq
                public void kq(rjo rjoVar2) {
                    dgq.this.oq(f10);
                }
            });
        } else {
            this.csi.oq(com.bytedance.adsdk.oq.rhi.csi.kq(rjoVar.rhi(), this.fou.rjo(), f10));
        }
    }

    public void kq(boolean z9) {
        if (z9 != this.gm) {
            this.gm = z9;
            com.bytedance.adsdk.oq.bob.bob.oq oqVar = this.fax;
            if (oqVar != null) {
                oqVar.oq(z9);
            }
            invalidateSelf();
        }
    }

    public void bob(float f10) {
        this.csi.bob(f10);
    }

    public void oq(final String str) {
        rjo rjoVar = this.fou;
        if (rjoVar == null) {
            this.nn.add(new kq() { // from class: com.bytedance.adsdk.oq.dgq.12
                @Override // com.bytedance.adsdk.oq.dgq.kq
                public void kq(rjo rjoVar2) {
                    dgq.this.oq(str);
                }
            });
            return;
        }
        com.bytedance.adsdk.oq.bob.rhi rhiVarBob = rjoVar.bob(str);
        if (rhiVarBob != null) {
            kq((int) rhiVarBob.kq);
            return;
        }
        throw new IllegalArgumentException("Cannot find marker with name " + str + ".");
    }

    public void bob(final int i10) {
        if (this.fou == null) {
            this.nn.add(new kq() { // from class: com.bytedance.adsdk.oq.dgq.4
                @Override // com.bytedance.adsdk.oq.dgq.kq
                public void kq(rjo rjoVar) {
                    dgq.this.bob(i10);
                }
            });
        } else {
            this.csi.kq(i10);
        }
    }

    public void fou(final float f10) {
        if (this.fou == null) {
            this.nn.add(new kq() { // from class: com.bytedance.adsdk.oq.dgq.5
                @Override // com.bytedance.adsdk.oq.dgq.kq
                public void kq(rjo rjoVar) {
                    dgq.this.fou(f10);
                }
            });
            return;
        }
        csi.kq("Drawable#setProgress");
        this.csi.kq(this.fou.kq(f10));
        csi.oq("Drawable#setProgress");
    }

    public void kq(String str) {
        this.wki = str;
    }

    public boolean kq(rjo rjoVar, Context context) {
        if (this.fou == rjoVar) {
            return false;
        }
        this.tvh = true;
        nn();
        this.fou = rjoVar;
        kq(context);
        this.csi.kq(rjoVar);
        fou(this.csi.getAnimatedFraction());
        Iterator it = new ArrayList(this.nn).iterator();
        while (it.hasNext()) {
            kq kqVar = (kq) it.next();
            if (kqVar != null) {
                kqVar.kq(rjoVar);
            }
            it.remove();
        }
        this.nn.clear();
        rjoVar.oq(this.jhe);
        zfx();
        Drawable.Callback callback = getCallback();
        if (callback instanceof ImageView) {
            ImageView imageView = (ImageView) callback;
            imageView.setImageDrawable(null);
            imageView.setImageDrawable(this);
        }
        return true;
    }

    public void oq(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.csi.removeUpdateListener(animatorUpdateListener);
    }

    public void oq(Animator.AnimatorListener animatorListener) {
        this.csi.removeListener(animatorListener);
    }

    private void oq(int i10, int i11) {
        Bitmap bitmap = this.rs;
        if (bitmap != null && bitmap.getWidth() >= i10 && this.rs.getHeight() >= i11) {
            if (this.rs.getWidth() > i10 || this.rs.getHeight() > i11) {
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(this.rs, 0, 0, i10, i11);
                this.rs = bitmapCreateBitmap;
                this.ha.setBitmap(bitmapCreateBitmap);
                this.tvh = true;
                return;
            }
            return;
        }
        Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(i10, i11, Bitmap.Config.ARGB_8888);
        this.rs = bitmapCreateBitmap2;
        this.ha.setBitmap(bitmapCreateBitmap2);
        this.tvh = true;
    }

    public void fou(int i10) {
        this.csi.setRepeatMode(i10);
    }

    public void kq(gm gmVar) {
        this.ou = gmVar;
        zfx();
    }

    private void kq(Context context) {
        rjo rjoVar = this.fou;
        if (rjoVar == null) {
            return;
        }
        com.bytedance.adsdk.oq.bob.bob.oq oqVar = new com.bytedance.adsdk.oq.bob.bob.oq(this, jhe.kq(rjoVar), rjoVar.wki(), rjoVar, context);
        this.fax = oqVar;
        if (this.uml) {
            oqVar.kq(true);
        }
        this.fax.oq(this.gm);
    }

    public void kq(final int i10) {
        if (this.fou == null) {
            this.nn.add(new kq() { // from class: com.bytedance.adsdk.oq.dgq.8
                @Override // com.bytedance.adsdk.oq.dgq.kq
                public void kq(rjo rjoVar) {
                    dgq.this.kq(i10);
                }
            });
        } else {
            this.csi.kq(i10);
        }
    }

    public void kq(final float f10) {
        rjo rjoVar = this.fou;
        if (rjoVar == null) {
            this.nn.add(new kq() { // from class: com.bytedance.adsdk.oq.dgq.9
                @Override // com.bytedance.adsdk.oq.dgq.kq
                public void kq(rjo rjoVar2) {
                    dgq.this.kq(f10);
                }
            });
        } else {
            kq((int) com.bytedance.adsdk.oq.rhi.csi.kq(rjoVar.rhi(), this.fou.rjo(), f10));
        }
    }

    public void kq(final int i10, final int i11) {
        if (this.fou == null) {
            this.nn.add(new kq() { // from class: com.bytedance.adsdk.oq.dgq.3
                @Override // com.bytedance.adsdk.oq.dgq.kq
                public void kq(rjo rjoVar) {
                    dgq.this.kq(i10, i11);
                }
            });
        } else {
            this.csi.kq(i10, i11 + 0.99f);
        }
    }

    public void kq(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.csi.addUpdateListener(animatorUpdateListener);
    }

    public void kq(Animator.AnimatorListener animatorListener) {
        this.csi.addListener(animatorListener);
    }

    public void kq(Boolean bool) {
        this.rhi = bool.booleanValue();
    }

    public void kq(fou fouVar) {
        this.suf = fouVar;
        com.bytedance.adsdk.oq.oq.oq oqVar = this.vvw;
        if (oqVar != null) {
            oqVar.kq(fouVar);
        }
    }

    public void kq(bob bobVar) {
        this.oq = bobVar;
        com.bytedance.adsdk.oq.oq.kq kqVar = this.nze;
        if (kqVar != null) {
            kqVar.kq(bobVar);
        }
    }

    public void kq(Map<String, Typeface> map) {
        if (map == this.mxq) {
            return;
        }
        this.mxq = map;
        invalidateSelf();
    }

    public void kq(fax faxVar) {
        this.bob = faxVar;
    }

    public Bitmap kq(String str, Bitmap bitmap) {
        com.bytedance.adsdk.oq.oq.oq oqVarWf = wf();
        if (oqVarWf == null) {
            return null;
        }
        Bitmap bitmapKq = oqVarWf.kq(str, bitmap);
        invalidateSelf();
        return bitmapKq;
    }

    public Typeface kq(com.bytedance.adsdk.oq.bob.bob bobVar) {
        Map<String, Typeface> map = this.mxq;
        if (map != null) {
            String strKq = bobVar.kq();
            if (map.containsKey(strKq)) {
                return map.get(strKq);
            }
            String strOq = bobVar.oq();
            if (map.containsKey(strOq)) {
                return map.get(strOq);
            }
            String str = bobVar.kq() + "-" + bobVar.bob();
            if (map.containsKey(str)) {
                return map.get(str);
            }
        }
        com.bytedance.adsdk.oq.oq.kq kqVarXn = xn();
        if (kqVarXn != null) {
            return kqVarXn.kq(bobVar);
        }
        return null;
    }

    private void kq(Canvas canvas) {
        com.bytedance.adsdk.oq.bob.bob.oq oqVar = this.fax;
        rjo rjoVar = this.fou;
        if (oqVar == null || rjoVar == null) {
            return;
        }
        this.ibd.reset();
        Rect bounds = getBounds();
        if (!bounds.isEmpty()) {
            this.ibd.preScale(bounds.width() / rjoVar.fou().width(), bounds.height() / rjoVar.fou().height());
            this.ibd.preTranslate(bounds.left, bounds.top);
        }
        oqVar.kq(canvas, this.ibd, this.mq);
    }

    private void kq(Canvas canvas, com.bytedance.adsdk.oq.bob.bob.oq oqVar) {
        if (this.fou == null || oqVar == null) {
            return;
        }
        yyl();
        canvas.getMatrix(this.wol);
        canvas.getClipBounds(this.fgm);
        kq(this.fgm, this.zfx);
        this.wol.mapRect(this.zfx);
        kq(this.zfx, this.fgm);
        if (this.gm) {
            this.yyl.set(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, getIntrinsicWidth(), getIntrinsicHeight());
        } else {
            oqVar.kq(this.yyl, (Matrix) null, false);
        }
        this.wol.mapRect(this.yyl);
        Rect bounds = getBounds();
        float fWidth = bounds.width() / getIntrinsicWidth();
        float fHeight = bounds.height() / getIntrinsicHeight();
        kq(this.yyl, fWidth, fHeight);
        if (!wol()) {
            RectF rectF = this.yyl;
            Rect rect = this.fgm;
            rectF.intersect(rect.left, rect.top, rect.right, rect.bottom);
        }
        int iCeil = (int) Math.ceil(this.yyl.width());
        int iCeil2 = (int) Math.ceil(this.yyl.height());
        if (iCeil == 0 || iCeil2 == 0) {
            return;
        }
        oq(iCeil, iCeil2);
        if (this.tvh) {
            this.ibd.set(this.wol);
            this.ibd.preScale(fWidth, fHeight);
            Matrix matrix = this.ibd;
            RectF rectF2 = this.yyl;
            matrix.postTranslate(-rectF2.left, -rectF2.top);
            this.rs.eraseColor(0);
            oqVar.kq(this.ha, this.ibd, this.mq);
            this.wol.invert(this.bss);
            this.bss.mapRect(this.nz, this.yyl);
            kq(this.nz, this.xn);
        }
        this.wf.set(0, 0, iCeil, iCeil2);
        canvas.drawBitmap(this.rs, this.wf, this.xn, this.ktb);
    }

    private void kq(RectF rectF, Rect rect) {
        rect.set((int) Math.floor(rectF.left), (int) Math.floor(rectF.top), (int) Math.ceil(rectF.right), (int) Math.ceil(rectF.bottom));
    }

    private void kq(Rect rect, RectF rectF) {
        rectF.set(rect.left, rect.top, rect.right, rect.bottom);
    }

    private void kq(RectF rectF, float f10, float f11) {
        rectF.set(rectF.left * f10, rectF.top * f11, rectF.right * f10, rectF.bottom * f11);
    }
}
