package com.bytedance.adsdk.ugeno.core;

import android.animation.AnimatorSet;
import android.animation.ArgbEvaluator;
import android.animation.ObjectAnimator;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class nn {
    private AnimatorSet bob = new AnimatorSet();
    private int csi;
    private View fou;
    Paint kq;
    private kq oq;
    private int rhi;
    private String rjo;

    public nn(View view, kq kqVar) {
        this.fou = view;
        this.oq = kqVar;
        Paint paint = new Paint();
        this.kq = paint;
        paint.setAntiAlias(true);
    }

    public void oq() {
        AnimatorSet animatorSet = this.bob;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
    }

    public void kq() {
        ArrayList arrayList = new ArrayList();
        List<kq.C0224kq> listBob = this.oq.bob();
        if (listBob == null || listBob.size() <= 0) {
            return;
        }
        for (kq.C0224kq c0224kq : listBob) {
            if (c0224kq != null) {
                ObjectAnimator objectAnimator = new ObjectAnimator();
                objectAnimator.setDuration(c0224kq.kq());
                if (TextUtils.equals(c0224kq.csi(), "translateX")) {
                    objectAnimator.setPropertyName("translationX");
                } else if (TextUtils.equals(c0224kq.csi(), "translateY")) {
                    objectAnimator.setPropertyName("translationY");
                } else {
                    objectAnimator.setPropertyName(c0224kq.csi());
                }
                objectAnimator.setStartDelay(c0224kq.fou());
                objectAnimator.setTarget(this.fou);
                if (TextUtils.equals(c0224kq.csi(), "backgroundColor")) {
                    objectAnimator.setIntValues((int) c0224kq.rhi(), (int) c0224kq.rjo());
                    Log.d("UGenAnimation", "playAnimation: from = " + c0224kq.rhi() + "; to=" + c0224kq.rjo());
                } else {
                    objectAnimator.setFloatValues(c0224kq.rhi(), c0224kq.rjo());
                }
                int iOq = (int) this.oq.oq();
                if (iOq != 0) {
                    objectAnimator.setRepeatCount(iOq);
                } else {
                    objectAnimator.setRepeatCount((int) c0224kq.oq());
                }
                if (TextUtils.equals(c0224kq.csi(), "backgroundColor")) {
                    objectAnimator.setEvaluator(new ArgbEvaluator());
                }
                String strRhi = this.oq.rhi();
                if (TextUtils.isEmpty(strRhi)) {
                    strRhi = c0224kq.bob();
                }
                if (TextUtils.equals(strRhi, "reverse")) {
                    objectAnimator.setRepeatMode(2);
                } else {
                    objectAnimator.setRepeatMode(1);
                }
                if (c0224kq.syt() != null && c0224kq.syt().length > 0) {
                    objectAnimator.setFloatValues(c0224kq.syt());
                }
                if (TextUtils.equals(c0224kq.csi(), "rotationX")) {
                    this.fou.post(new Runnable() { // from class: com.bytedance.adsdk.ugeno.core.nn.1
                        @Override // java.lang.Runnable
                        public void run() {
                            nn.this.fou.setPivotX(nn.this.fou.getWidth() / 2.0f);
                            nn.this.fou.setPivotY(nn.this.fou.getHeight());
                        }
                    });
                }
                if (TextUtils.equals(c0224kq.csi(), "ripple")) {
                    this.rjo = c0224kq.nn();
                }
                String strDgq = c0224kq.dgq();
                strDgq.getClass();
                switch (strDgq) {
                    case "accelerate":
                        objectAnimator.setInterpolator(new AccelerateInterpolator());
                        break;
                    case "decelerate":
                        objectAnimator.setInterpolator(new DecelerateInterpolator());
                        break;
                    case "linear":
                    case "standard":
                        objectAnimator.setInterpolator(new LinearInterpolator());
                        break;
                    case "accelerateDecelerate":
                        objectAnimator.setInterpolator(new AccelerateDecelerateInterpolator());
                        break;
                }
                arrayList.add(objectAnimator);
            }
        }
        if (this.oq.fou() != 0) {
            this.bob.setDuration(this.oq.fou());
        }
        this.bob.setStartDelay(this.oq.csi());
        if (TextUtils.equals(this.oq.kq(), "sequentially")) {
            this.bob.playSequentially(arrayList);
        } else {
            this.bob.playTogether(arrayList);
        }
        this.bob.start();
    }

    public void kq(Canvas canvas, IAnimation iAnimation) {
        try {
            if (iAnimation.getRipple() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || TextUtils.isEmpty(this.rjo)) {
                return;
            }
            this.kq.setColor(com.bytedance.adsdk.ugeno.rjo.kq.kq(this.rjo));
            this.kq.setAlpha(90);
            ((ViewGroup) this.fou.getParent()).setClipChildren(true);
            int i10 = this.csi;
            int i11 = this.rhi;
            canvas.drawCircle(i10, i11, Math.min(i10, i11) * 2 * iAnimation.getRipple(), this.kq);
        } catch (Throwable th) {
            Log.d("UGenAnimation", "ripple animation error " + th.getMessage());
        }
    }

    public void kq(int i10, int i11) {
        this.csi = i10 / 2;
        this.rhi = i11 / 2;
    }
}
