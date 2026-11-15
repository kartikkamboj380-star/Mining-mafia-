package com.google.android.material.textfield;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.os.Build;
import com.unity3d.services.UnityAdsConstants;

/* JADX INFO: renamed from: com.google.android.material.textfield.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
abstract class AbstractC6685h extends K5.g {

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    b f39603Q;

    /* JADX INFO: renamed from: com.google.android.material.textfield.h$c */
    private static class c extends AbstractC6685h {
        c(b bVar) {
            super(bVar);
        }

        @Override // K5.g
        protected void r(Canvas canvas) {
            if (this.f39603Q.f39604w.isEmpty()) {
                super.r(canvas);
                return;
            }
            canvas.save();
            if (Build.VERSION.SDK_INT >= 26) {
                canvas.clipOutRect(this.f39603Q.f39604w);
            } else {
                canvas.clipRect(this.f39603Q.f39604w, Region.Op.DIFFERENCE);
            }
            super.r(canvas);
            canvas.restore();
        }
    }

    static AbstractC6685h i0(K5.k kVar) {
        if (kVar == null) {
            kVar = new K5.k();
        }
        return j0(new b(kVar, new RectF()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static AbstractC6685h j0(b bVar) {
        return new c(bVar);
    }

    boolean k0() {
        return !this.f39603Q.f39604w.isEmpty();
    }

    void l0() {
        m0(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
    }

    void m0(float f10, float f11, float f12, float f13) {
        if (f10 == this.f39603Q.f39604w.left && f11 == this.f39603Q.f39604w.top && f12 == this.f39603Q.f39604w.right && f13 == this.f39603Q.f39604w.bottom) {
            return;
        }
        this.f39603Q.f39604w.set(f10, f11, f12, f13);
        invalidateSelf();
    }

    @Override // K5.g, android.graphics.drawable.Drawable
    public Drawable mutate() {
        this.f39603Q = new b(this.f39603Q);
        return this;
    }

    void n0(RectF rectF) {
        m0(rectF.left, rectF.top, rectF.right, rectF.bottom);
    }

    /* JADX INFO: renamed from: com.google.android.material.textfield.h$b */
    private static final class b extends K5.g.c {

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        private final RectF f39604w;

        @Override // K5.g.c, android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            AbstractC6685h abstractC6685hJ0 = AbstractC6685h.j0(this);
            abstractC6685hJ0.invalidateSelf();
            return abstractC6685hJ0;
        }

        private b(K5.k kVar, RectF rectF) {
            super(kVar, null);
            this.f39604w = rectF;
        }

        private b(b bVar) {
            super(bVar);
            this.f39604w = bVar.f39604w;
        }
    }

    private AbstractC6685h(b bVar) {
        super(bVar);
        this.f39603Q = bVar;
    }
}
