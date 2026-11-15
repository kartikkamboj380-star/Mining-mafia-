package com.bytedance.adsdk.oq;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import com.unity3d.services.UnityAdsConstants;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import org.json.JSONArray;

/* JADX INFO: loaded from: classes.dex */
public class rhi extends ImageView {
    private static final String kq = "rhi";
    private static final ubx<Throwable> oq = new ubx<Throwable>() { // from class: com.bytedance.adsdk.oq.rhi.1
        @Override // com.bytedance.adsdk.oq.ubx
        public void kq(Throwable th) {
            com.bytedance.adsdk.oq.rhi.rhi.kq(th);
        }
    };
    private final ubx<rjo> bob;
    private ubx<Throwable> csi;
    private int dgq;
    private String ebt;
    private long fax;
    private kq fgm;
    private final ubx<Throwable> fou;
    private Handler gm;
    private oq ha;
    private JSONArray ibd;
    private int jhe;
    private com.bytedance.adsdk.oq.bob.bob.bob mq;
    private rjo mxq;
    private int nb;
    private boolean nn;
    private wki<rjo> nze;
    private int ou;
    private int rhi;
    private final dgq rjo;
    private final Runnable rs;
    private final Handler sns;
    private final Set<Object> suf;
    private String syt;
    private boolean ubx;
    private int uml;
    private boolean vvw;
    private int wcx;
    private final Set<fou> wki;

    /* JADX INFO: renamed from: com.bytedance.adsdk.oq.rhi$5, reason: invalid class name */
    static /* synthetic */ class AnonymousClass5 {
        static final /* synthetic */ int[] kq;

        static {
            int[] iArr = new int[ImageView.ScaleType.values().length];
            kq = iArr;
            try {
                iArr[ImageView.ScaleType.CENTER_CROP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                kq[ImageView.ScaleType.CENTER_INSIDE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                kq[ImageView.ScaleType.CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                kq[ImageView.ScaleType.FIT_CENTER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    private static class bob extends View.BaseSavedState {
        public static final Parcelable.Creator<bob> CREATOR = new Parcelable.Creator<bob>() { // from class: com.bytedance.adsdk.oq.rhi.bob.1
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: kq, reason: merged with bridge method [inline-methods] */
            public bob createFromParcel(Parcel parcel) {
                return new bob(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: kq, reason: merged with bridge method [inline-methods] */
            public bob[] newArray(int i10) {
                return new bob[i10];
            }
        };
        float bob;
        String csi;
        boolean fou;
        String kq;
        int oq;
        int rhi;
        int rjo;

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeString(this.kq);
            parcel.writeFloat(this.bob);
            parcel.writeInt(this.fou ? 1 : 0);
            parcel.writeString(this.csi);
            parcel.writeInt(this.rhi);
            parcel.writeInt(this.rjo);
        }

        bob(Parcelable parcelable) {
            super(parcelable);
        }

        private bob(Parcel parcel) {
            super(parcel);
            this.kq = parcel.readString();
            this.bob = parcel.readFloat();
            this.fou = parcel.readInt() == 1;
            this.csi = parcel.readString();
            this.rhi = parcel.readInt();
            this.rjo = parcel.readInt();
        }
    }

    private enum fou {
        SET_ANIMATION,
        SET_PROGRESS,
        SET_REPEAT_MODE,
        SET_REPEAT_COUNT,
        SET_IMAGE_ASSETS,
        PLAY_OPTION
    }

    public interface kq {
    }

    public interface oq {
    }

    public rhi(Context context) {
        super(context);
        this.bob = new ubx<rjo>() { // from class: com.bytedance.adsdk.oq.rhi.6
            @Override // com.bytedance.adsdk.oq.ubx
            public void kq(rjo rjoVar) {
                rhi.this.setComposition(rjoVar);
            }
        };
        this.fou = new ubx<Throwable>() { // from class: com.bytedance.adsdk.oq.rhi.7
            @Override // com.bytedance.adsdk.oq.ubx
            public void kq(Throwable th) {
                if (rhi.this.rhi != 0) {
                    rhi rhiVar = rhi.this;
                    rhiVar.setImageResource(rhiVar.rhi);
                }
                (rhi.this.csi == null ? rhi.oq : rhi.this.csi).kq(th);
            }
        };
        this.rhi = 0;
        this.rjo = new dgq();
        this.nn = false;
        this.ubx = false;
        this.vvw = true;
        this.wki = new HashSet();
        this.suf = new HashSet();
        this.sns = new Handler(Looper.getMainLooper());
        this.wcx = 0;
        this.fax = 0L;
        this.rs = new Runnable() { // from class: com.bytedance.adsdk.oq.rhi.4
            @Override // java.lang.Runnable
            public void run() {
                Log.i("TMe", "--==--- timer callback, timer: " + rhi.this.jhe + ", " + rhi.this.uml);
                if (rhi.this.jhe > rhi.this.uml) {
                    rhi.wcx(rhi.this);
                    com.bytedance.adsdk.oq.bob.bob.bob bobVar = rhi.this.mq;
                    StringBuilder sb = new StringBuilder();
                    sb.append(rhi.this.jhe);
                    bobVar.kq(sb.toString());
                    rhi.this.invalidate();
                    rhi.this.nze();
                    return;
                }
                if (rhi.this.nb < 0 || rhi.this.ou < 0) {
                    Log.i("TMe", "--==--- timer end, frame invalid: " + rhi.this.nb + "," + rhi.this.ou);
                } else {
                    Log.i("TMe", "--==--- timer end, play anim, startframe: " + rhi.this.nb);
                    rhi.this.kq();
                    rhi rhiVar = rhi.this;
                    rhiVar.setFrame(rhiVar.nb);
                    rhi.this.kq(new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.adsdk.oq.rhi.4.1
                        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                        public void onAnimationUpdate(ValueAnimator valueAnimator) {
                            if (rhi.this.getFrame() < rhi.this.ou - 1 || rhi.this.getFrame() >= rhi.this.ou + 2) {
                                return;
                            }
                            Log.i("TMe", "--==--- timer end, play anim, endframe: " + rhi.this.ou);
                            rhi.this.oq(this);
                            rhi.this.rhi();
                        }
                    });
                }
                if ((!TextUtils.isEmpty(rhi.this.ebt) || (rhi.this.ibd != null && rhi.this.ibd.length() > 0)) && rhi.this.ha != null) {
                    oq unused = rhi.this.ha;
                    String unused2 = rhi.this.ebt;
                    JSONArray unused3 = rhi.this.ibd;
                }
            }
        };
        syt();
    }

    static /* synthetic */ int csi(rhi rhiVar) {
        int i10 = rhiVar.wcx;
        rhiVar.wcx = i10 + 1;
        return i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public rjo.kq getGlobalConfig() {
        rjo rjoVarEbt;
        dgq dgqVar = this.rjo;
        if (dgqVar == null || (rjoVarEbt = dgqVar.ebt()) == null) {
            return null;
        }
        return rjoVarEbt.ubx();
    }

    private rjo.oq getGlobalEvent() {
        rjo rjoVarEbt;
        dgq dgqVar = this.rjo;
        if (dgqVar == null || (rjoVarEbt = dgqVar.ebt()) == null) {
            return null;
        }
        return rjoVarEbt.nn();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String getPlayDelayedELExpressTimeS() {
        rjo rjoVarEbt;
        dgq dgqVar = this.rjo;
        if (dgqVar == null || (rjoVarEbt = dgqVar.ebt()) == null) {
            return null;
        }
        return rjoVarEbt.dgq();
    }

    private void setCompositionTask(wki<rjo> wkiVar) {
        this.wki.add(fou.SET_ANIMATION);
        sns();
        wki();
        this.nze = wkiVar.kq(this.bob).bob(this.fou);
    }

    static /* synthetic */ int wcx(rhi rhiVar) {
        int i10 = rhiVar.jhe;
        rhiVar.jhe = i10 - 1;
        return i10;
    }

    public boolean getClipToCompositionBounds() {
        return this.rjo.bob();
    }

    public rjo getComposition() {
        return this.mxq;
    }

    public long getDuration() {
        rjo rjoVar = this.mxq;
        if (rjoVar != null) {
            return (long) rjoVar.csi();
        }
        return 0L;
    }

    public int getFrame() {
        return this.rjo.gm();
    }

    public String getImageAssetsFolder() {
        return this.rjo.fou();
    }

    public boolean getMaintainOriginalImageBounds() {
        return this.rjo.csi();
    }

    public float getMaxFrame() {
        return this.rjo.nze();
    }

    public float getMinFrame() {
        return this.rjo.suf();
    }

    public wcx getPerformanceTracker() {
        return this.rjo.syt();
    }

    public float getProgress() {
        return this.rjo.ha();
    }

    public gm getRenderMode() {
        return this.rjo.rhi();
    }

    public int getRepeatCount() {
        return this.rjo.mq();
    }

    public int getRepeatMode() {
        return this.rjo.fax();
    }

    public float getSpeed() {
        return this.rjo.mxq();
    }

    @Override // android.view.View
    public void invalidate() {
        super.invalidate();
        Drawable drawable = getDrawable();
        if ((drawable instanceof dgq) && ((dgq) drawable).rhi() == gm.SOFTWARE) {
            this.rjo.invalidateSelf();
        }
    }

    @Override // android.widget.ImageView, android.view.View, android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable drawable) {
        Drawable drawable2 = getDrawable();
        dgq dgqVar = this.rjo;
        if (drawable2 == dgqVar) {
            super.invalidateDrawable(dgqVar);
        } else {
            super.invalidateDrawable(drawable);
        }
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (isInEditMode() || !this.ubx) {
            return;
        }
        this.rjo.ubx();
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        mxq();
        Handler handler = this.gm;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
        bob();
        oq();
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        int i10;
        if (!(parcelable instanceof bob)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        bob bobVar = (bob) parcelable;
        super.onRestoreInstanceState(bobVar.getSuperState());
        this.syt = bobVar.kq;
        Set<fou> set = this.wki;
        fou fouVar = fou.SET_ANIMATION;
        if (!set.contains(fouVar) && !TextUtils.isEmpty(this.syt)) {
            setAnimation(this.syt);
        }
        this.dgq = bobVar.oq;
        if (!this.wki.contains(fouVar) && (i10 = this.dgq) != 0) {
            setAnimation(i10);
        }
        if (!this.wki.contains(fou.SET_PROGRESS)) {
            kq(bobVar.bob, false);
        }
        if (!this.wki.contains(fou.PLAY_OPTION) && bobVar.fou) {
            kq();
        }
        if (!this.wki.contains(fou.SET_IMAGE_ASSETS)) {
            setImageAssetsFolder(bobVar.csi);
        }
        if (!this.wki.contains(fou.SET_REPEAT_MODE)) {
            setRepeatMode(bobVar.rhi);
        }
        if (this.wki.contains(fou.SET_REPEAT_COUNT)) {
            return;
        }
        setRepeatCount(bobVar.rjo);
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        bob bobVar = new bob(super.onSaveInstanceState());
        bobVar.kq = this.syt;
        bobVar.oq = this.dgq;
        bobVar.bob = this.rjo.ha();
        bobVar.fou = this.rjo.uml();
        bobVar.csi = this.rjo.fou();
        bobVar.rhi = this.rjo.fax();
        bobVar.rjo = this.rjo.mq();
        return bobVar;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int[][] iArr;
        com.bytedance.adsdk.oq.bob.bob.kq kqVarKq = kq(motionEvent);
        if (kqVarKq == null) {
            if (getGlobalConfig() == null || getGlobalConfig().kq != 1) {
                return super.onTouchEvent(motionEvent);
            }
            return false;
        }
        String strDgq = kqVarKq.dgq();
        if (kqVarKq instanceof com.bytedance.adsdk.oq.bob.bob.oq) {
            if (getGlobalConfig() == null || getGlobalConfig().kq != 1) {
                return super.onTouchEvent(motionEvent);
            }
            return false;
        }
        if (strDgq != null && strDgq.startsWith("CSJCLOSE")) {
            mxq();
        }
        nn nnVarKq = kq(kqVarKq.csi());
        if (nnVarKq != null && motionEvent.getAction() == 1) {
            kq(strDgq, nnVarKq.csi(), nnVarKq.rjo());
            int[][] iArrRhi = nnVarKq.rhi();
            if (iArrRhi != null) {
                kq(iArrRhi);
            } else if (getGlobalEvent() != null && (iArr = getGlobalEvent().oq) != null) {
                kq(iArr);
            }
        }
        if (strDgq == null || !strDgq.startsWith("CSJNTP")) {
            return super.onTouchEvent(motionEvent);
        }
        return false;
    }

    public void setAnimation(int i10) {
        this.dgq = i10;
        this.syt = null;
        setCompositionTask(kq(i10));
    }

    public void setAnimationFromJson(String str) {
        kq(str, (String) null);
    }

    public void setAnimationFromUrl(String str) {
        setCompositionTask(this.vvw ? syt.kq(getContext(), str) : syt.kq(getContext(), str, (String) null));
    }

    public void setApplyingOpacityToLayersEnabled(boolean z9) {
        this.rjo.csi(z9);
    }

    public void setCacheComposition(boolean z9) {
        this.vvw = z9;
    }

    public void setClipToCompositionBounds(boolean z9) {
        this.rjo.kq(z9);
    }

    public void setComposition(rjo rjoVar) {
        if (csi.kq) {
            Log.v(kq, "Set Composition \n".concat(String.valueOf(rjoVar)));
        }
        this.rjo.setCallback(this);
        this.mxq = rjoVar;
        this.nn = true;
        boolean zKq = this.rjo.kq(rjoVar, getContext().getApplicationContext());
        this.nn = false;
        if (getDrawable() != this.rjo || zKq) {
            if (!zKq) {
                wcx();
            }
            onVisibilityChanged(this, getVisibility());
            requestLayout();
            Iterator<Object> it = this.suf.iterator();
            while (it.hasNext()) {
                it.next();
            }
        }
    }

    public void setDefaultFontFileExtension(String str) {
        this.rjo.rjo(str);
    }

    public void setFailureListener(ubx<Throwable> ubxVar) {
        this.csi = ubxVar;
    }

    public void setFallbackResource(int i10) {
        this.rhi = i10;
    }

    public void setFontAssetDelegate(com.bytedance.adsdk.oq.bob bobVar) {
        this.rjo.kq(bobVar);
    }

    public void setFontMap(Map<String, Typeface> map) {
        this.rjo.kq(map);
    }

    public void setFrame(int i10) {
        this.rjo.bob(i10);
    }

    public void setIgnoreDisabledSystemAnimations(boolean z9) {
        this.rjo.rjo(z9);
    }

    public void setImageAssetDelegate(com.bytedance.adsdk.oq.fou fouVar) {
        this.rjo.kq(fouVar);
    }

    public void setImageAssetsFolder(String str) {
        this.rjo.kq(str);
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        wki();
        super.setImageBitmap(bitmap);
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        wki();
        super.setImageDrawable(drawable);
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i10) {
        wki();
        super.setImageResource(i10);
    }

    public void setLottieAnimListener(kq kqVar) {
        this.fgm = kqVar;
    }

    public void setLottieClicklistener(oq oqVar) {
        this.ha = oqVar;
    }

    public void setMaintainOriginalImageBounds(boolean z9) {
        this.rjo.oq(z9);
    }

    public void setMaxFrame(int i10) {
        this.rjo.oq(i10);
    }

    public void setMaxProgress(float f10) {
        this.rjo.oq(f10);
    }

    public void setMinAndMaxFrame(String str) {
        this.rjo.fou(str);
    }

    public void setMinFrame(int i10) {
        this.rjo.kq(i10);
    }

    public void setMinProgress(float f10) {
        this.rjo.kq(f10);
    }

    public void setOutlineMasksAndMattes(boolean z9) {
        this.rjo.fou(z9);
    }

    public void setPerformanceTrackingEnabled(boolean z9) {
        this.rjo.bob(z9);
    }

    public void setProgress(float f10) {
        kq(f10, true);
    }

    public void setRenderMode(gm gmVar) {
        this.rjo.kq(gmVar);
    }

    public void setRepeatCount(int i10) {
        this.wki.add(fou.SET_REPEAT_COUNT);
        this.rjo.csi(i10);
    }

    public void setRepeatMode(int i10) {
        this.wki.add(fou.SET_REPEAT_MODE);
        this.rjo.fou(i10);
    }

    public void setSafeMode(boolean z9) {
        this.rjo.rhi(z9);
    }

    public void setSpeed(float f10) {
        this.rjo.bob(f10);
    }

    public void setTextDelegate(fax faxVar) {
        this.rjo.kq(faxVar);
    }

    public void setUseCompositionFrameRate(boolean z9) {
        this.rjo.syt(z9);
    }

    public void setView(View view) {
        this.rjo.kq(view);
    }

    @Override // android.view.View
    public void unscheduleDrawable(Drawable drawable) {
        dgq dgqVar;
        if (!this.nn && drawable == (dgqVar = this.rjo) && dgqVar.jhe()) {
            rhi();
        } else if (!this.nn && (drawable instanceof dgq)) {
            dgq dgqVar2 = (dgq) drawable;
            if (dgqVar2.jhe()) {
                dgqVar2.rs();
            }
        }
        super.unscheduleDrawable(drawable);
    }

    private void bob(Matrix matrix, float f10, float f11, float f12, float f13) {
        matrix.postTranslate((f10 - f12) / 2.0f, (f11 - f13) / 2.0f);
    }

    private void dgq() {
        kq(new Animator.AnimatorListener() { // from class: com.bytedance.adsdk.oq.rhi.8
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                rhi.this.oq(this);
                rhi.this.suf();
                rhi.this.ubx();
            }
        });
    }

    private void fou(Matrix matrix, float f10, float f11, float f12, float f13) {
        if (f12 >= f10 || f13 >= f11) {
            if (f12 / f13 >= f10 / f11) {
                float f14 = f10 / f12;
                matrix.preScale(f14, f14);
                matrix.postTranslate(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, (f11 - (f13 * f14)) / 2.0f);
                return;
            } else {
                float f15 = f11 / f13;
                matrix.preScale(f15, f15);
                matrix.postTranslate((f10 - (f12 * f15)) / 2.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                return;
            }
        }
        if (f12 / f13 >= f10 / f11) {
            float f16 = f10 / f12;
            matrix.preScale(f16, f16);
            matrix.postTranslate(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, (f11 - (f13 * f16)) / 2.0f);
        } else {
            float f17 = f11 / f13;
            matrix.preScale(f17, f17);
            matrix.postTranslate((f10 - (f12 * f17)) / 2.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        }
    }

    private void mxq() {
        this.sns.removeCallbacksAndMessages(null);
    }

    private void nn() {
        kq(new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.adsdk.oq.rhi.9
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                int i10;
                Object animatedValue = valueAnimator.getAnimatedValue();
                if (!(animatedValue instanceof Float) || ((Float) animatedValue).floatValue() < 0.98f) {
                    return;
                }
                rhi.csi(rhi.this);
                rjo.kq globalConfig = rhi.this.getGlobalConfig();
                if (globalConfig != null && (i10 = globalConfig.fou) > 0 && i10 > rhi.this.wcx) {
                    rhi.this.suf();
                    rhi.this.kq();
                    rhi.this.setProgress(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                } else {
                    rhi.this.oq(this);
                    if (rhi.this.fgm != null) {
                        kq unused = rhi.this.fgm;
                    }
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void nze() {
        this.sns.postDelayed(this.rs, 1000L);
    }

    private void oq(RectF rectF, RectF rectF2) {
        float width = getWidth();
        float height = getHeight();
        float fWidth = this.rjo.getBounds().width();
        float fHeight = this.rjo.getBounds().height();
        if (width == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || height == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || fWidth == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || fHeight == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            return;
        }
        Matrix matrix = new Matrix();
        int i10 = AnonymousClass5.kq[getScaleType().ordinal()];
        if (i10 == 1) {
            kq(matrix, width, height, fWidth, fHeight);
        } else if (i10 == 2) {
            oq(matrix, width, height, fWidth, fHeight);
        } else if (i10 == 3) {
            bob(matrix, width, height, fWidth, fHeight);
        } else if (i10 == 4) {
            fou(matrix, width, height, fWidth, fHeight);
        }
        matrix.mapRect(rectF, rectF2);
    }

    private void sns() {
        this.mxq = null;
        this.rjo.nn();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void suf() {
        dgq dgqVar;
        int i10;
        int i11;
        final int i12;
        if (this.mxq == null || (dgqVar = this.rjo) == null) {
            return;
        }
        fax faxVarNb = dgqVar.nb();
        rjo.bob bobVarSyt = this.mxq.syt();
        if (bobVarSyt == null || faxVarNb == null) {
            return;
        }
        final int i13 = bobVarSyt.kq;
        if (i13 < 0) {
            Log.i("TMe", "--==--- timer fail, ke is invalid: ".concat(String.valueOf(i13)));
            return;
        }
        int[] iArr = bobVarSyt.csi;
        final int i14 = -1;
        if (iArr == null || iArr.length < 2) {
            i10 = -1;
            i11 = -1;
        } else {
            i11 = iArr[0];
            i10 = iArr[1];
        }
        String strKq = faxVarNb.kq(bobVarSyt.bob);
        String strKq2 = faxVarNb.kq(bobVarSyt.fou);
        try {
            i12 = Integer.parseInt(strKq);
            try {
                i14 = Integer.parseInt(strKq2);
            } catch (NumberFormatException unused) {
            }
        } catch (NumberFormatException unused2) {
            i12 = -1;
        }
        Log.i("TMe", "--==--- prepare timer, startS: " + i12 + ", lenS: " + i14);
        if (TextUtils.isEmpty(bobVarSyt.oq)) {
            Log.i("TMe", "--==--- timer fail, id is invalid: " + bobVarSyt.oq);
            return;
        }
        Log.i("TMe", "--==--- timer, id:" + bobVarSyt.oq);
        com.bytedance.adsdk.oq.bob.bob.bob bobVarBob = bob(bobVarSyt.oq);
        if (bobVarBob != null) {
            Log.i("TMe", "--==--- timer success");
            this.ebt = bobVarSyt.rhi;
            this.ibd = bobVarSyt.rjo;
            this.mq = bobVarBob;
            this.jhe = i12;
            this.uml = i12 - i14;
            this.nb = i11;
            this.ou = i10;
            StringBuilder sb = new StringBuilder();
            sb.append(this.jhe);
            bobVarBob.kq(sb.toString());
            kq(new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.adsdk.oq.rhi.3
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public void onAnimationUpdate(ValueAnimator valueAnimator) {
                    if (rhi.this.getFrame() < i13 - 1 || rhi.this.getFrame() >= i13 + 2) {
                        return;
                    }
                    Log.i("TMe", "--==--- enter timer point, frame: " + rhi.this.getFrame());
                    rhi.this.oq(this);
                    if (i12 < 0 || i14 < 0) {
                        Log.i("TMe", "--==--- enter timer callback, NOT start timer");
                    } else {
                        Log.i("TMe", "--==--- enter timer callback, start timer");
                        rhi.this.nze();
                    }
                    rhi.this.rhi();
                }
            });
        }
    }

    private void syt() {
        setSaveEnabled(false);
        this.vvw = true;
        setFallbackResource(0);
        setImageAssetsFolder("");
        kq(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, false);
        kq(false, getContext().getApplicationContext());
        setIgnoreDisabledSystemAnimations(false);
        this.rjo.kq(Boolean.valueOf(com.bytedance.adsdk.oq.rhi.rhi.kq(getContext()) != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT));
        dgq();
        nn();
        vvw();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ubx() {
        final rjo.kq globalConfig = getGlobalConfig();
        if (globalConfig == null || globalConfig.csi <= 0) {
            return;
        }
        if (TextUtils.isEmpty(globalConfig.rhi) && globalConfig.rjo == null) {
            return;
        }
        int maxFrame = globalConfig.csi;
        if (maxFrame > getMaxFrame()) {
            maxFrame = (int) getMaxFrame();
        }
        final float maxFrame2 = maxFrame / getMaxFrame();
        kq(new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.adsdk.oq.rhi.10
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                Object animatedValue = valueAnimator.getAnimatedValue();
                if (!(animatedValue instanceof Float) || ((Float) animatedValue).floatValue() < maxFrame2) {
                    return;
                }
                rhi.this.oq(this);
                if (rhi.this.ha != null) {
                    oq unused = rhi.this.ha;
                }
            }
        });
    }

    private void vvw() {
        kq(new Animator.AnimatorListener() { // from class: com.bytedance.adsdk.oq.rhi.11
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                fax faxVarNb;
                final long jElapsedRealtime = SystemClock.elapsedRealtime() - rhi.this.fax;
                rhi.this.oq(this);
                String playDelayedELExpressTimeS = rhi.this.getPlayDelayedELExpressTimeS();
                if (!TextUtils.isEmpty(playDelayedELExpressTimeS) && (faxVarNb = rhi.this.rjo.nb()) != null) {
                    try {
                        int i10 = Integer.parseInt(faxVarNb.kq(playDelayedELExpressTimeS)) * 1000;
                        if (rhi.this.fax > 0) {
                            long jElapsedRealtime2 = (rhi.this.fax + ((long) i10)) - SystemClock.elapsedRealtime();
                            Log.i("TMe", "--==-- lottie delayed time: ".concat(String.valueOf(jElapsedRealtime2)));
                            if (jElapsedRealtime2 > 0) {
                                rhi.this.rhi();
                                rhi.this.setVisibility(8);
                                if (rhi.this.gm == null) {
                                    rhi.this.gm = new Handler(Looper.getMainLooper());
                                }
                                rhi.this.gm.removeCallbacksAndMessages(null);
                                rhi.this.gm.postDelayed(new Runnable() { // from class: com.bytedance.adsdk.oq.rhi.11.1
                                    @Override // java.lang.Runnable
                                    public void run() {
                                        Log.i("TMe", "--==-- lottie real start play");
                                        rhi.this.setVisibility(0);
                                        rhi.this.kq();
                                        rhi.this.kq(jElapsedRealtime);
                                    }
                                }, jElapsedRealtime2);
                                return;
                            }
                        }
                    } catch (NumberFormatException unused) {
                    }
                }
                rhi.this.kq(jElapsedRealtime);
            }
        });
    }

    private void wcx() {
        boolean zFou = fou();
        setImageDrawable(null);
        setImageDrawable(this.rjo);
        if (zFou) {
            this.rjo.wki();
        }
    }

    private void wki() {
        wki<rjo> wkiVar = this.nze;
        if (wkiVar != null) {
            wkiVar.oq(this.bob);
            this.nze.fou(this.fou);
        }
    }

    public void csi() {
        this.wki.add(fou.PLAY_OPTION);
        this.rjo.ibd();
    }

    public void rhi() {
        this.ubx = false;
        this.rjo.rs();
    }

    public void setMaxFrame(String str) {
        this.rjo.bob(str);
    }

    public void setMinFrame(String str) {
        this.rjo.oq(str);
    }

    private com.bytedance.adsdk.oq.bob.bob.bob bob(String str) {
        com.bytedance.adsdk.oq.bob.bob.oq oqVarOq;
        dgq dgqVar = this.rjo;
        if (dgqVar == null || (oqVarOq = dgqVar.oq()) == null) {
            return null;
        }
        return kq(oqVarOq, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void kq(long j10) {
        Map<String, Object> map;
        rjo.kq globalConfig = getGlobalConfig();
        if (this.fgm != null) {
            HashMap map2 = new HashMap();
            map2.put("duration", Long.valueOf(j10));
            if (globalConfig == null || (map = globalConfig.oq) == null || map.isEmpty()) {
                return;
            }
            map2.putAll(globalConfig.oq);
        }
    }

    public void setAnimation(String str) {
        this.syt = str;
        this.dgq = 0;
        setCompositionTask(oq(str));
    }

    public void bob() {
        this.rjo.wcx();
    }

    private nn kq(String str) {
        dgq dgqVar;
        rjo rjoVarEbt;
        Map<String, nn> mapMxq;
        if (TextUtils.isEmpty(str) || (dgqVar = this.rjo) == null || (rjoVarEbt = dgqVar.ebt()) == null || (mapMxq = rjoVarEbt.mxq()) == null) {
            return null;
        }
        return mapMxq.get(str);
    }

    public boolean fou() {
        return this.rjo.jhe();
    }

    private void oq(Matrix matrix, float f10, float f11, float f12, float f13) {
        if (f12 < f10 && f13 < f11) {
            matrix.postTranslate((f10 - f12) / 2.0f, (f11 - f13) / 2.0f);
            return;
        }
        if (f12 / f13 >= f10 / f11) {
            float f14 = f10 / f12;
            matrix.preScale(f14, f14);
            matrix.postTranslate(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, (f11 - (f13 * f14)) / 2.0f);
        } else {
            float f15 = f11 / f13;
            matrix.preScale(f15, f15);
            matrix.postTranslate((f10 - (f12 * f15)) / 2.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        }
    }

    private void kq(int[][] iArr) {
        if (iArr == null || iArr.length == 0) {
            return;
        }
        try {
            int[] iArr2 = iArr[0];
            int i10 = iArr2[0];
            final int i11 = iArr2[1];
            if (i10 < 0 || i11 < 0) {
                return;
            }
            Log.i("TMe", "--==--- inel enter, play anim, startframe: ".concat(String.valueOf(i10)));
            mxq();
            kq();
            setFrame(i10);
            kq(new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.adsdk.oq.rhi.12
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public void onAnimationUpdate(ValueAnimator valueAnimator) {
                    if (rhi.this.getFrame() < i11 - 1 || rhi.this.getFrame() >= i11 + 2) {
                        return;
                    }
                    Log.i("TMe", "--==--- inel enter, play anim end, endframe: " + i11 + ", realFrame: " + rhi.this.getFrame());
                    rhi.this.oq(this);
                    rhi.this.rhi();
                }
            });
        } catch (Throwable unused) {
        }
    }

    private wki<rjo> oq(final String str) {
        if (isInEditMode()) {
            return new wki<>(new Callable<vvw<rjo>>() { // from class: com.bytedance.adsdk.oq.rhi.2
                @Override // java.util.concurrent.Callable
                /* JADX INFO: renamed from: kq, reason: merged with bridge method [inline-methods] */
                public vvw<rjo> call() {
                    return rhi.this.vvw ? syt.bob(rhi.this.getContext(), str) : syt.bob(rhi.this.getContext(), str, null);
                }
            }, true);
        }
        return this.vvw ? syt.oq(getContext(), str) : syt.oq(getContext(), str, (String) null);
    }

    public void oq(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.rjo.oq(animatorUpdateListener);
    }

    private void kq(String str, String str2, JSONArray jSONArray) {
        rjo.oq globalEvent = getGlobalEvent();
        if (globalEvent != null && str != null) {
            if (TextUtils.isEmpty(str2) && !str.contains("CSJNO")) {
                str2 = globalEvent.kq;
            }
            if ((jSONArray == null || jSONArray.length() <= 0) && !str.contains("CSJLELNO")) {
                jSONArray = globalEvent.bob;
            }
        }
        if (!TextUtils.isEmpty(str2) || jSONArray == null) {
            return;
        }
        jSONArray.length();
    }

    public void oq() {
        this.rjo.sns();
    }

    public void oq(Animator.AnimatorListener animatorListener) {
        this.rjo.oq(animatorListener);
    }

    private com.bytedance.adsdk.oq.bob.bob.kq kq(MotionEvent motionEvent) {
        com.bytedance.adsdk.oq.bob.bob.oq oqVarOq;
        dgq dgqVar = this.rjo;
        if (dgqVar == null || (oqVarOq = dgqVar.oq()) == null) {
            return null;
        }
        return kq(oqVarOq, motionEvent);
    }

    private com.bytedance.adsdk.oq.bob.bob.kq kq(com.bytedance.adsdk.oq.bob.bob.oq oqVar, MotionEvent motionEvent) {
        com.bytedance.adsdk.oq.bob.bob.kq kqVarKq;
        for (com.bytedance.adsdk.oq.bob.bob.kq kqVar : oqVar.vvw()) {
            if (kqVar instanceof com.bytedance.adsdk.oq.bob.bob.oq) {
                if (kqVar.syt() && kqVar.rhi() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                    RectF rectF = new RectF();
                    kqVar.kq(rectF, kqVar.fou(), true);
                    if (rectF.width() >= 3.0f && rectF.height() >= 3.0f && (kqVarKq = kq((com.bytedance.adsdk.oq.bob.bob.oq) kqVar, motionEvent)) != null) {
                        return kqVarKq;
                    }
                }
            } else if (kqVar.syt() && kqVar.rhi() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                RectF rectF2 = new RectF();
                dgq dgqVar = this.rjo;
                if (dgqVar != null && dgqVar.rjo()) {
                    kqVar.kq(rectF2, kqVar.fou(), true);
                    RectF rectFFgm = this.rjo.fgm();
                    if (rectFFgm != null) {
                        kq(rectF2, rectFFgm);
                    }
                } else {
                    RectF rectF3 = new RectF();
                    kqVar.kq(rectF3, kqVar.fou(), true);
                    oq(rectF2, rectF3);
                }
                if (kq(motionEvent, rectF2)) {
                    return kqVar;
                }
            }
        }
        return null;
    }

    private boolean kq(MotionEvent motionEvent, RectF rectF) {
        if (motionEvent != null && rectF != null) {
            float x10 = motionEvent.getX();
            float y9 = motionEvent.getY();
            if (x10 >= rectF.left && x10 <= rectF.right && y9 >= rectF.top && y9 <= rectF.bottom) {
                return true;
            }
        }
        return false;
    }

    private void kq(RectF rectF, RectF rectF2) {
        float width = getWidth();
        float height = getHeight();
        float fWidth = rectF2.width();
        float fHeight = rectF2.height();
        if (width == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || height == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || fWidth == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || fHeight == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            return;
        }
        Matrix matrix = new Matrix();
        int i10 = AnonymousClass5.kq[getScaleType().ordinal()];
        if (i10 == 1) {
            kq(matrix, width, height, fWidth, fHeight);
        } else if (i10 == 2) {
            oq(matrix, width, height, fWidth, fHeight);
        } else if (i10 == 3) {
            bob(matrix, width, height, fWidth, fHeight);
        } else if (i10 == 4) {
            fou(matrix, width, height, fWidth, fHeight);
        }
        matrix.mapRect(rectF);
    }

    private void kq(Matrix matrix, float f10, float f11, float f12, float f13) {
        if (f12 / f13 >= f10 / f11) {
            float f14 = f11 / f13;
            matrix.preScale(f14, f14);
            matrix.postTranslate(-(((f12 * f14) - f10) / 2.0f), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        } else {
            float f15 = f10 / f12;
            matrix.preScale(f15, f15);
            matrix.postTranslate(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, -(((f13 * f15) - f11) / 2.0f));
        }
    }

    public void kq(boolean z9, Context context) {
        this.rjo.kq(z9, context);
    }

    private wki<rjo> kq(final int i10) {
        if (isInEditMode()) {
            return new wki<>(new Callable<vvw<rjo>>() { // from class: com.bytedance.adsdk.oq.rhi.13
                @Override // java.util.concurrent.Callable
                /* JADX INFO: renamed from: kq, reason: merged with bridge method [inline-methods] */
                public vvw<rjo> call() {
                    return rhi.this.vvw ? syt.oq(rhi.this.getContext(), i10) : syt.oq(rhi.this.getContext(), i10, (String) null);
                }
            }, true);
        }
        return this.vvw ? syt.kq(getContext(), i10) : syt.kq(getContext(), i10, (String) null);
    }

    public void kq(String str, String str2) {
        kq(new ByteArrayInputStream(str.getBytes()), str2);
    }

    public void kq(InputStream inputStream, String str) {
        setCompositionTask(syt.kq(inputStream, str));
    }

    private com.bytedance.adsdk.oq.bob.bob.bob kq(com.bytedance.adsdk.oq.bob.bob.oq oqVar, String str) {
        for (com.bytedance.adsdk.oq.bob.bob.kq kqVar : oqVar.vvw()) {
            if (kqVar instanceof com.bytedance.adsdk.oq.bob.bob.oq) {
                com.bytedance.adsdk.oq.bob.bob.bob bobVarKq = kq((com.bytedance.adsdk.oq.bob.bob.oq) kqVar, str);
                if (bobVarKq != null) {
                    return bobVarKq;
                }
            } else if (TextUtils.equals(str, kqVar.dgq()) && (kqVar instanceof com.bytedance.adsdk.oq.bob.bob.bob)) {
                return (com.bytedance.adsdk.oq.bob.bob.bob) kqVar;
            }
        }
        return null;
    }

    public void kq() {
        if (this.fax == 0) {
            this.fax = SystemClock.elapsedRealtime();
        }
        this.wki.add(fou.PLAY_OPTION);
        this.rjo.ubx();
    }

    public void kq(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.rjo.kq(animatorUpdateListener);
    }

    public void kq(Animator.AnimatorListener animatorListener) {
        this.rjo.kq(animatorListener);
    }

    public void kq(boolean z9) {
        this.rjo.csi(z9 ? -1 : 0);
    }

    public Bitmap kq(String str, Bitmap bitmap) {
        return this.rjo.kq(str, bitmap);
    }

    private void kq(float f10, boolean z9) {
        if (z9) {
            this.wki.add(fou.SET_PROGRESS);
        }
        this.rjo.fou(f10);
    }
}
