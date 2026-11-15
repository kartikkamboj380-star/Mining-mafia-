package com.google.android.material.internal;

import G0.AbstractC0575k;
import G0.v;
import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class k extends AbstractC0575k {

    class a implements ValueAnimator.AnimatorUpdateListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ TextView f39321a;

        a(TextView textView) {
            this.f39321a = textView;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            this.f39321a.setScaleX(fFloatValue);
            this.f39321a.setScaleY(fFloatValue);
        }
    }

    private void m0(v vVar) {
        View view = vVar.f912b;
        if (view instanceof TextView) {
            vVar.f911a.put("android:textscale:scale", Float.valueOf(((TextView) view).getScaleX()));
        }
    }

    @Override // G0.AbstractC0575k
    public void g(v vVar) {
        m0(vVar);
    }

    @Override // G0.AbstractC0575k
    public void k(v vVar) {
        m0(vVar);
    }

    @Override // G0.AbstractC0575k
    public Animator o(ViewGroup viewGroup, v vVar, v vVar2) {
        if (vVar == null || vVar2 == null || !(vVar.f912b instanceof TextView)) {
            return null;
        }
        View view = vVar2.f912b;
        if (!(view instanceof TextView)) {
            return null;
        }
        TextView textView = (TextView) view;
        Map map = vVar.f911a;
        Map map2 = vVar2.f911a;
        float fFloatValue = map.get("android:textscale:scale") != null ? ((Float) map.get("android:textscale:scale")).floatValue() : 1.0f;
        float fFloatValue2 = map2.get("android:textscale:scale") != null ? ((Float) map2.get("android:textscale:scale")).floatValue() : 1.0f;
        if (fFloatValue == fFloatValue2) {
            return null;
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(fFloatValue, fFloatValue2);
        valueAnimatorOfFloat.addUpdateListener(new a(textView));
        return valueAnimatorOfFloat;
    }
}
