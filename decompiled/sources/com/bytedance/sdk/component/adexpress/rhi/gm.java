package com.bytedance.sdk.component.adexpress.rhi;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.Interpolator;
import android.view.animation.RotateAnimation;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import com.unity3d.services.UnityAdsConstants;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class gm extends LinearLayout {
    private ImageView bob;
    private TextView csi;
    private int dgq;
    private com.bytedance.sdk.component.utils.ou fou;
    private TextView kq;
    private int nn;
    private TextView oq;
    private TextView rhi;
    private kq rjo;
    private LinearLayout syt;
    private int ubx;
    private JSONObject vvw;

    /* JADX INFO: renamed from: com.bytedance.sdk.component.adexpress.rhi.gm$1, reason: invalid class name */
    class AnonymousClass1 implements Runnable {
        AnonymousClass1() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (gm.this.bob != null) {
                final RotateAnimation rotateAnimation = new RotateAnimation(-14.0f, 14.0f, 1, 0.9f, 1, 0.9f);
                rotateAnimation.setInterpolator(new oq(null));
                rotateAnimation.setDuration(1000L);
                rotateAnimation.setAnimationListener(new Animation.AnimationListener() { // from class: com.bytedance.sdk.component.adexpress.rhi.gm.1.1
                    @Override // android.view.animation.Animation.AnimationListener
                    public void onAnimationEnd(Animation animation) {
                        gm.this.postDelayed(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.rhi.gm.1.1.1
                            @Override // java.lang.Runnable
                            public void run() {
                                gm.this.bob.startAnimation(rotateAnimation);
                            }
                        }, 250L);
                    }

                    @Override // android.view.animation.Animation.AnimationListener
                    public void onAnimationRepeat(Animation animation) {
                    }

                    @Override // android.view.animation.Animation.AnimationListener
                    public void onAnimationStart(Animation animation) {
                    }
                });
                gm.this.bob.startAnimation(rotateAnimation);
            }
        }
    }

    public interface kq {
    }

    private static class oq implements Interpolator {
        private oq() {
        }

        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f10) {
            if (f10 <= 0.25f) {
                return (f10 * (-2.0f)) + 0.5f;
            }
            if (f10 <= 0.5f) {
                return (f10 * 4.0f) - 1.0f;
            }
            return f10 <= 0.75f ? (f10 * (-4.0f)) + 3.0f : (f10 * 2.0f) - 1.5f;
        }

        /* synthetic */ oq(AnonymousClass1 anonymousClass1) {
            this();
        }
    }

    public gm(@NonNull Context context, View view, int i10, int i11, int i12, JSONObject jSONObject) {
        super(context);
        this.dgq = i10;
        this.nn = i11;
        this.ubx = i12;
        this.vvw = jSONObject;
        kq(context, view);
    }

    public LinearLayout getShakeLayout() {
        return this.syt;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (isShown()) {
            if (this.fou == null) {
                this.fou = new com.bytedance.sdk.component.utils.ou(getContext().getApplicationContext(), 1);
            }
            new Object() { // from class: com.bytedance.sdk.component.adexpress.rhi.gm.2
            };
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z9) {
    }

    public void setOnShakeViewListener(kq kqVar) {
        this.rjo = kqVar;
    }

    public void setShakeText(String str) {
        if (!TextUtils.isEmpty(str)) {
            this.csi.setText(str);
        } else {
            this.csi.setVisibility(8);
            this.rhi.setVisibility(8);
        }
    }

    protected void kq(Context context, View view) {
        addView(view);
        this.syt = (LinearLayout) findViewById(2097610727);
        this.bob = (ImageView) findViewById(2097610725);
        this.kq = (TextView) findViewById(2097610724);
        this.oq = (TextView) findViewById(2097610726);
        this.csi = (TextView) findViewById(2097610723);
        this.rhi = (TextView) findViewById(2097610728);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(1);
        gradientDrawable.setColor(Color.parseColor("#57000000"));
        this.syt.setBackground(gradientDrawable);
    }

    public void kq() {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, "alpha", UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);
        objectAnimatorOfFloat.setDuration(300L);
        objectAnimatorOfFloat.start();
        postDelayed(new AnonymousClass1(), 500L);
    }
}
