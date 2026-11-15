package com.google.android.material.timepicker;

import O.AbstractC0845c0;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.google.android.material.internal.p;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p186s5.j;
import p186s5.k;

/* JADX INFO: loaded from: classes2.dex */
class ClockHandView extends View {

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private float f39735G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private boolean f39736H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private double f39737I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private int f39738J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    private int f39739K;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f39740a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final TimeInterpolator f39741b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ValueAnimator f39742c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f39743d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private float f39744e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private float f39745f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f39746g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int f39747h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f39748i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final List f39749j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final int f39750k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final float f39751l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final Paint f39752m;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final RectF f39753v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final int f39754w;

    class a extends AnimatorListenerAdapter {
        a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            animator.end();
        }
    }

    public interface b {
        void a(float f10, boolean z9);
    }

    public ClockHandView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, p186s5.a.f48592E);
    }

    public static /* synthetic */ void a(ClockHandView clockHandView, ValueAnimator valueAnimator) {
        clockHandView.getClass();
        clockHandView.o(((Float) valueAnimator.getAnimatedValue()).floatValue(), true);
    }

    private void c(float f10, float f11) {
        this.f39739K = E5.a.a((float) (getWidth() / 2), (float) (getHeight() / 2), f10, f11) > ((float) h(2)) + p.c(getContext(), 12) ? 1 : 2;
    }

    private void d(Canvas canvas) {
        int height = getHeight() / 2;
        int width = getWidth() / 2;
        int iH = h(this.f39739K);
        float f10 = width;
        float f11 = iH;
        float fCos = (((float) Math.cos(this.f39737I)) * f11) + f10;
        float f12 = height;
        float fSin = (f11 * ((float) Math.sin(this.f39737I))) + f12;
        this.f39752m.setStrokeWidth(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        canvas.drawCircle(fCos, fSin, this.f39750k, this.f39752m);
        double dSin = Math.sin(this.f39737I);
        double dCos = Math.cos(this.f39737I);
        double d10 = iH - this.f39750k;
        this.f39752m.setStrokeWidth(this.f39754w);
        canvas.drawLine(f10, f12, width + ((int) (dCos * d10)), height + ((int) (d10 * dSin)), this.f39752m);
        canvas.drawCircle(f10, f12, this.f39751l, this.f39752m);
    }

    private int f(float f10, float f11) {
        int degrees = (int) Math.toDegrees(Math.atan2(f11 - (getHeight() / 2), f10 - (getWidth() / 2)));
        int i10 = degrees + 90;
        return i10 < 0 ? degrees + 450 : i10;
    }

    private int h(int i10) {
        return i10 == 2 ? Math.round(this.f39738J * 0.66f) : this.f39738J;
    }

    private Pair j(float f10) {
        float fG = g();
        if (Math.abs(fG - f10) > 180.0f) {
            if (fG > 180.0f && f10 < 180.0f) {
                f10 += 360.0f;
            }
            if (fG < 180.0f && f10 > 180.0f) {
                fG += 360.0f;
            }
        }
        return new Pair(Float.valueOf(fG), Float.valueOf(f10));
    }

    private boolean k(float f10, float f11, boolean z9, boolean z10, boolean z11) {
        float f12 = f(f10, f11);
        boolean z12 = false;
        boolean z13 = g() != f12;
        if (z10 && z13) {
            return true;
        }
        if (!z13 && !z9) {
            return false;
        }
        if (z11 && this.f39743d) {
            z12 = true;
        }
        n(f12, z12);
        return true;
    }

    private void o(float f10, boolean z9) {
        float f11 = f10 % 360.0f;
        this.f39735G = f11;
        this.f39737I = Math.toRadians(f11 - 90.0f);
        int height = getHeight() / 2;
        int width = getWidth() / 2;
        float fH = h(this.f39739K);
        float fCos = width + (((float) Math.cos(this.f39737I)) * fH);
        float fSin = height + (fH * ((float) Math.sin(this.f39737I)));
        RectF rectF = this.f39753v;
        int i10 = this.f39750k;
        rectF.set(fCos - i10, fSin - i10, fCos + i10, fSin + i10);
        Iterator it = this.f39749j.iterator();
        while (it.hasNext()) {
            ((b) it.next()).a(f11, z9);
        }
        invalidate();
    }

    public void b(b bVar) {
        this.f39749j.add(bVar);
    }

    public RectF e() {
        return this.f39753v;
    }

    public float g() {
        return this.f39735G;
    }

    public int i() {
        return this.f39750k;
    }

    public void l(int i10) {
        this.f39738J = i10;
        invalidate();
    }

    public void m(float f10) {
        n(f10, false);
    }

    public void n(float f10, boolean z9) {
        ValueAnimator valueAnimator = this.f39742c;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        if (!z9) {
            o(f10, false);
            return;
        }
        Pair pairJ = j(f10);
        this.f39742c.setFloatValues(((Float) pairJ.first).floatValue(), ((Float) pairJ.second).floatValue());
        this.f39742c.setDuration(this.f39740a);
        this.f39742c.setInterpolator(this.f39741b);
        this.f39742c.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.timepicker.a
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                ClockHandView.a(this.f39766a, valueAnimator2);
            }
        });
        this.f39742c.addListener(new a());
        this.f39742c.start();
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        d(canvas);
    }

    @Override // android.view.View
    protected void onLayout(boolean z9, int i10, int i11, int i12, int i13) {
        super.onLayout(z9, i10, i11, i12, i13);
        if (this.f39742c.isRunning()) {
            return;
        }
        m(g());
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z9;
        boolean z10;
        boolean z11;
        int actionMasked = motionEvent.getActionMasked();
        float x10 = motionEvent.getX();
        float y9 = motionEvent.getY();
        if (actionMasked == 0) {
            this.f39744e = x10;
            this.f39745f = y9;
            this.f39746g = true;
            this.f39736H = false;
            z9 = true;
            z10 = false;
            z11 = false;
        } else if (actionMasked == 1 || actionMasked == 2) {
            int i10 = (int) (x10 - this.f39744e);
            int i11 = (int) (y9 - this.f39745f);
            this.f39746g = (i10 * i10) + (i11 * i11) > this.f39747h;
            z10 = this.f39736H;
            boolean z12 = actionMasked == 1;
            if (this.f39748i) {
                c(x10, y9);
            }
            z11 = z12;
            z9 = false;
        } else {
            z10 = false;
            z9 = false;
            z11 = false;
        }
        this.f39736H |= k(x10, y9, z10, z9, z11);
        return true;
    }

    void p(boolean z9) {
        if (this.f39748i && !z9) {
            this.f39739K = 1;
        }
        this.f39748i = z9;
        invalidate();
    }

    public ClockHandView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f39742c = new ValueAnimator();
        this.f39749j = new ArrayList();
        Paint paint = new Paint();
        this.f39752m = paint;
        this.f39753v = new RectF();
        this.f39739K = 1;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, k.f48956L1, i10, j.f48853w);
        this.f39740a = F5.d.f(context, p186s5.a.f48594G, TTAdConstant.MATE_VALID);
        this.f39741b = F5.d.g(context, p186s5.a.f48601N, p196t5.a.f49671b);
        this.f39738J = typedArrayObtainStyledAttributes.getDimensionPixelSize(k.f48974N1, 0);
        this.f39750k = typedArrayObtainStyledAttributes.getDimensionPixelSize(k.f48983O1, 0);
        Resources resources = getResources();
        this.f39754w = resources.getDimensionPixelSize(p186s5.c.f48655D);
        this.f39751l = resources.getDimensionPixelSize(p186s5.c.f48653B);
        int color = typedArrayObtainStyledAttributes.getColor(k.f48965M1, 0);
        paint.setAntiAlias(true);
        paint.setColor(color);
        m(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        this.f39747h = ViewConfiguration.get(context).getScaledTouchSlop();
        AbstractC0845c0.v0(this, 2);
        typedArrayObtainStyledAttributes.recycle();
    }
}
