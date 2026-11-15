package com.bytedance.adsdk.ugeno.kq;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class kq extends AnimatorListenerAdapter {
    private ValueAnimator bob;
    private int csi;
    private oq dgq;
    private Context fou;
    private com.bytedance.adsdk.ugeno.oq.bob kq;
    private bob oq;
    private int rhi = 1;
    private com.bytedance.adsdk.ugeno.kq.kq.kq rjo;
    private String syt;

    public kq(Context context, com.bytedance.adsdk.ugeno.oq.bob bobVar, bob bobVar2) {
        this.kq = bobVar;
        this.oq = bobVar2;
        this.fou = context;
    }

    public void bob() {
        ValueAnimator valueAnimator = this.bob;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
    }

    public String csi() {
        return this.syt;
    }

    public ValueAnimator fou() {
        com.bytedance.adsdk.ugeno.kq.oq.kq bobVar;
        bob bobVar2 = this.oq;
        if (bobVar2 == null || this.kq == null) {
            return null;
        }
        Map<String, TreeMap<Float, String>> mapOq = bobVar2.oq();
        ArrayList arrayList = new ArrayList();
        if (mapOq != null && !mapOq.isEmpty()) {
            for (Map.Entry<String, TreeMap<Float, String>> entry : mapOq.entrySet()) {
                if (entry != null) {
                    String key = entry.getKey();
                    String strBob = csi.kq(key).bob();
                    strBob.getClass();
                    switch (strBob) {
                        case "int":
                            bobVar = new com.bytedance.adsdk.ugeno.kq.oq.bob(this.fou, this.kq, key, entry.getValue());
                            break;
                        case "float":
                            bobVar = new com.bytedance.adsdk.ugeno.kq.oq.oq(this.fou, this.kq, key, entry.getValue());
                            break;
                        case "point":
                            bobVar = new com.bytedance.adsdk.ugeno.kq.oq.fou(this.fou, this.kq, key, entry.getValue());
                            break;
                        default:
                            bobVar = null;
                            break;
                    }
                    if (bobVar != null) {
                        arrayList.addAll(bobVar.csi());
                    }
                }
            }
        }
        JSONObject jSONObjectKq = this.oq.kq();
        if (jSONObjectKq != null) {
            com.bytedance.adsdk.ugeno.kq.kq.kq kqVarKq = com.bytedance.adsdk.ugeno.kq.kq.kq.C0229kq.kq(this.kq, jSONObjectKq);
            this.rjo = kqVarKq;
            if (kqVarKq != null) {
                arrayList.addAll(kqVarKq.bob());
            }
        }
        final View viewUbx = this.kq.ubx();
        if (viewUbx == null) {
            return null;
        }
        final bob.kq kqVarRjo = this.oq.rjo();
        if (kqVarRjo != null) {
            viewUbx.post(new Runnable() { // from class: com.bytedance.adsdk.ugeno.kq.kq.1
                @Override // java.lang.Runnable
                public void run() {
                    int width = viewUbx.getWidth();
                    int height = viewUbx.getHeight();
                    viewUbx.setPivotX(fou.kq(kqVarRjo.kq, width));
                    viewUbx.setPivotY(fou.kq(kqVarRjo.oq, height));
                }
            });
        }
        ObjectAnimator objectAnimatorOfPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(viewUbx, (PropertyValuesHolder[]) arrayList.toArray(new PropertyValuesHolder[0]));
        this.csi = fou.kq(this.oq.fou());
        objectAnimatorOfPropertyValuesHolder.setDuration(this.oq.bob());
        int i10 = this.csi;
        if (i10 != Integer.MIN_VALUE) {
            objectAnimatorOfPropertyValuesHolder.setRepeatCount(i10);
        }
        this.rhi = this.oq.nn();
        this.syt = this.oq.dgq();
        objectAnimatorOfPropertyValuesHolder.setStartDelay(this.oq.rhi());
        objectAnimatorOfPropertyValuesHolder.setRepeatMode(fou.kq(this.oq.csi()));
        objectAnimatorOfPropertyValuesHolder.setInterpolator(fou.oq(this.oq.syt()));
        objectAnimatorOfPropertyValuesHolder.addListener(this);
        this.bob = objectAnimatorOfPropertyValuesHolder;
        return objectAnimatorOfPropertyValuesHolder;
    }

    public void kq() {
        ValueAnimator valueAnimator = this.bob;
        if (valueAnimator == null || this.rhi == 0 || this.csi == Integer.MIN_VALUE) {
            return;
        }
        valueAnimator.start();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        oq oqVar = this.dgq;
        if (oqVar != null) {
            oqVar.oq();
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        super.onAnimationStart(animator);
        oq oqVar = this.dgq;
        if (oqVar != null) {
            oqVar.kq();
        }
    }

    public void oq() {
        ValueAnimator valueAnimator = this.bob;
        if (valueAnimator != null) {
            valueAnimator.start();
        }
    }

    public void oq(Canvas canvas) {
        com.bytedance.adsdk.ugeno.kq.kq.kq kqVar = this.rjo;
        if (kqVar != null) {
            kqVar.oq(canvas);
        }
    }

    public void kq(oq oqVar) {
        this.dgq = oqVar;
    }

    public void kq(Canvas canvas) {
        com.bytedance.adsdk.ugeno.kq.kq.kq kqVar = this.rjo;
        if (kqVar != null) {
            kqVar.kq(canvas);
        }
    }

    public void kq(int i10, int i11) {
        com.bytedance.adsdk.ugeno.kq.kq.kq kqVar = this.rjo;
        if (kqVar != null) {
            kqVar.kq(i10, i11);
        }
    }
}
