package com.bytedance.sdk.component.adexpress.rhi;

import android.content.Context;
import android.text.TextUtils;
import android.view.animation.LinearInterpolator;
import android.view.animation.RotateAnimation;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import com.unity3d.services.UnityAdsConstants;

/* JADX INFO: loaded from: classes.dex */
public class ubx extends FrameLayout {
    private final vvw bob;
    private final RotateAnimation fou;
    private final TextView kq;
    private final ImageView oq;

    public ubx(@NonNull Context context) {
        super(context);
        addView(com.bytedance.sdk.component.adexpress.bob.kq.fou(context));
        this.kq = (TextView) findViewById(2097610742);
        this.oq = (ImageView) findViewById(2097610745);
        this.bob = (vvw) findViewById(2097610744);
        RotateAnimation rotateAnimation = new RotateAnimation(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 30.0f, 1, 0.65f, 1, 0.9f);
        this.fou = rotateAnimation;
        rotateAnimation.setDuration(300L);
        rotateAnimation.setRepeatMode(2);
        rotateAnimation.setRepeatCount(1);
        rotateAnimation.setInterpolator(new LinearInterpolator());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Runnable getHaloAnimation() {
        return new Runnable() { // from class: com.bytedance.sdk.component.adexpress.rhi.ubx.1
            @Override // java.lang.Runnable
            public void run() {
                ubx.this.oq.startAnimation(ubx.this.fou);
                ubx.this.postDelayed(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.rhi.ubx.1.1
                    @Override // java.lang.Runnable
                    public void run() {
                        ubx.this.bob.kq(4);
                    }
                }, 100L);
                ubx.this.postDelayed(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.rhi.ubx.1.2
                    @Override // java.lang.Runnable
                    public void run() {
                        ubx.this.bob.kq(4);
                    }
                }, 300L);
                ubx ubxVar = ubx.this;
                ubxVar.postDelayed(ubxVar.getHaloAnimation(), 1200L);
            }
        };
    }

    public void setText(String str) {
        if (TextUtils.isEmpty(str)) {
            str = "Slide or click to jump to the details page or third-party application";
        }
        TextView textView = this.kq;
        if (textView != null) {
            textView.setText(str);
        }
    }

    public void kq() {
        postDelayed(getHaloAnimation(), 300L);
    }

    public void oq() {
        this.fou.cancel();
    }
}
