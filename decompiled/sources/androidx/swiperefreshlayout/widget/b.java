package androidx.swiperefreshlayout.widget;

import N.f;
import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import com.unity3d.services.UnityAdsConstants;

/* JADX INFO: loaded from: classes.dex */
public class b extends Drawable implements Animatable {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final Interpolator f10954g = new LinearInterpolator();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final Interpolator f10955h = new p091j0.b();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final int[] f10956i = {-16777216};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final c f10957a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private float f10958b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Resources f10959c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Animator f10960d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    float f10961e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    boolean f10962f;

    class a implements ValueAnimator.AnimatorUpdateListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ c f10963a;

        a(c cVar) {
            this.f10963a = cVar;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            b.this.n(fFloatValue, this.f10963a);
            b.this.b(fFloatValue, this.f10963a, false);
            b.this.invalidateSelf();
        }
    }

    /* JADX INFO: renamed from: androidx.swiperefreshlayout.widget.b$b, reason: collision with other inner class name */
    class C0176b implements Animator.AnimatorListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ c f10965a;

        C0176b(c cVar) {
            this.f10965a = cVar;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
            b.this.b(1.0f, this.f10965a, true);
            this.f10965a.A();
            this.f10965a.l();
            b bVar = b.this;
            if (!bVar.f10962f) {
                bVar.f10961e += 1.0f;
                return;
            }
            bVar.f10962f = false;
            animator.cancel();
            animator.setDuration(1332L);
            animator.start();
            this.f10965a.x(false);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            b.this.f10961e = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        }
    }

    private static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final RectF f10967a = new RectF();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final Paint f10968b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final Paint f10969c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final Paint f10970d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        float f10971e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        float f10972f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        float f10973g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        float f10974h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        int[] f10975i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f10976j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        float f10977k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        float f10978l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        float f10979m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        boolean f10980n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        Path f10981o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        float f10982p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        float f10983q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f10984r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        int f10985s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        int f10986t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        int f10987u;

        c() {
            Paint paint = new Paint();
            this.f10968b = paint;
            Paint paint2 = new Paint();
            this.f10969c = paint2;
            Paint paint3 = new Paint();
            this.f10970d = paint3;
            this.f10971e = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            this.f10972f = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            this.f10973g = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            this.f10974h = 5.0f;
            this.f10982p = 1.0f;
            this.f10986t = 255;
            paint.setStrokeCap(Paint.Cap.SQUARE);
            paint.setAntiAlias(true);
            paint.setStyle(Paint.Style.STROKE);
            paint2.setStyle(Paint.Style.FILL);
            paint2.setAntiAlias(true);
            paint3.setColor(0);
        }

        void A() {
            this.f10977k = this.f10971e;
            this.f10978l = this.f10972f;
            this.f10979m = this.f10973g;
        }

        void a(Canvas canvas, Rect rect) {
            RectF rectF = this.f10967a;
            float f10 = this.f10983q;
            float fMin = (this.f10974h / 2.0f) + f10;
            if (f10 <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                fMin = (Math.min(rect.width(), rect.height()) / 2.0f) - Math.max((this.f10984r * this.f10982p) / 2.0f, this.f10974h / 2.0f);
            }
            rectF.set(rect.centerX() - fMin, rect.centerY() - fMin, rect.centerX() + fMin, rect.centerY() + fMin);
            float f11 = this.f10971e;
            float f12 = this.f10973g;
            float f13 = (f11 + f12) * 360.0f;
            float f14 = ((this.f10972f + f12) * 360.0f) - f13;
            this.f10968b.setColor(this.f10987u);
            this.f10968b.setAlpha(this.f10986t);
            float f15 = this.f10974h / 2.0f;
            rectF.inset(f15, f15);
            canvas.drawCircle(rectF.centerX(), rectF.centerY(), rectF.width() / 2.0f, this.f10970d);
            float f16 = -f15;
            rectF.inset(f16, f16);
            canvas.drawArc(rectF, f13, f14, false, this.f10968b);
            b(canvas, f13, f14, rectF);
        }

        void b(Canvas canvas, float f10, float f11, RectF rectF) {
            if (this.f10980n) {
                Path path = this.f10981o;
                if (path == null) {
                    Path path2 = new Path();
                    this.f10981o = path2;
                    path2.setFillType(Path.FillType.EVEN_ODD);
                } else {
                    path.reset();
                }
                float fMin = Math.min(rectF.width(), rectF.height()) / 2.0f;
                float f12 = (this.f10984r * this.f10982p) / 2.0f;
                this.f10981o.moveTo(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                this.f10981o.lineTo(this.f10984r * this.f10982p, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                Path path3 = this.f10981o;
                float f13 = this.f10984r;
                float f14 = this.f10982p;
                path3.lineTo((f13 * f14) / 2.0f, this.f10985s * f14);
                this.f10981o.offset((fMin + rectF.centerX()) - f12, rectF.centerY() + (this.f10974h / 2.0f));
                this.f10981o.close();
                this.f10969c.setColor(this.f10987u);
                this.f10969c.setAlpha(this.f10986t);
                canvas.save();
                canvas.rotate(f10 + f11, rectF.centerX(), rectF.centerY());
                canvas.drawPath(this.f10981o, this.f10969c);
                canvas.restore();
            }
        }

        int c() {
            return this.f10986t;
        }

        float d() {
            return this.f10972f;
        }

        int e() {
            return this.f10975i[f()];
        }

        int f() {
            return (this.f10976j + 1) % this.f10975i.length;
        }

        float g() {
            return this.f10971e;
        }

        int h() {
            return this.f10975i[this.f10976j];
        }

        float i() {
            return this.f10978l;
        }

        float j() {
            return this.f10979m;
        }

        float k() {
            return this.f10977k;
        }

        void l() {
            t(f());
        }

        void m() {
            this.f10977k = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            this.f10978l = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            this.f10979m = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            y(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            v(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            w(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        }

        void n(int i10) {
            this.f10986t = i10;
        }

        void o(float f10, float f11) {
            this.f10984r = (int) f10;
            this.f10985s = (int) f11;
        }

        void p(float f10) {
            if (f10 != this.f10982p) {
                this.f10982p = f10;
            }
        }

        void q(float f10) {
            this.f10983q = f10;
        }

        void r(int i10) {
            this.f10987u = i10;
        }

        void s(ColorFilter colorFilter) {
            this.f10968b.setColorFilter(colorFilter);
        }

        void t(int i10) {
            this.f10976j = i10;
            this.f10987u = this.f10975i[i10];
        }

        void u(int[] iArr) {
            this.f10975i = iArr;
            t(0);
        }

        void v(float f10) {
            this.f10972f = f10;
        }

        void w(float f10) {
            this.f10973g = f10;
        }

        void x(boolean z9) {
            if (this.f10980n != z9) {
                this.f10980n = z9;
            }
        }

        void y(float f10) {
            this.f10971e = f10;
        }

        void z(float f10) {
            this.f10974h = f10;
            this.f10968b.setStrokeWidth(f10);
        }
    }

    public b(Context context) {
        this.f10959c = ((Context) f.g(context)).getResources();
        c cVar = new c();
        this.f10957a = cVar;
        cVar.u(f10956i);
        k(2.5f);
        m();
    }

    private void a(float f10, c cVar) {
        n(f10, cVar);
        float fFloor = (float) (Math.floor(cVar.j() / 0.8f) + 1.0d);
        cVar.y(cVar.k() + (((cVar.i() - 0.01f) - cVar.k()) * f10));
        cVar.v(cVar.i());
        cVar.w(cVar.j() + ((fFloor - cVar.j()) * f10));
    }

    private int c(float f10, int i10, int i11) {
        int i12 = (i10 >> 24) & 255;
        int i13 = (i10 >> 16) & 255;
        int i14 = (i10 >> 8) & 255;
        int i15 = i10 & 255;
        return ((i12 + ((int) ((((i11 >> 24) & 255) - i12) * f10))) << 24) | ((i13 + ((int) ((((i11 >> 16) & 255) - i13) * f10))) << 16) | ((i14 + ((int) ((((i11 >> 8) & 255) - i14) * f10))) << 8) | (i15 + ((int) (f10 * ((i11 & 255) - i15))));
    }

    private void h(float f10) {
        this.f10958b = f10;
    }

    private void i(float f10, float f11, float f12, float f13) {
        c cVar = this.f10957a;
        float f14 = this.f10959c.getDisplayMetrics().density;
        cVar.z(f11 * f14);
        cVar.q(f10 * f14);
        cVar.t(0);
        cVar.o(f12 * f14, f13 * f14);
    }

    private void m() {
        c cVar = this.f10957a;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);
        valueAnimatorOfFloat.addUpdateListener(new a(cVar));
        valueAnimatorOfFloat.setRepeatCount(-1);
        valueAnimatorOfFloat.setRepeatMode(1);
        valueAnimatorOfFloat.setInterpolator(f10954g);
        valueAnimatorOfFloat.addListener(new C0176b(cVar));
        this.f10960d = valueAnimatorOfFloat;
    }

    void b(float f10, c cVar, boolean z9) {
        float interpolation;
        float interpolation2;
        if (this.f10962f) {
            a(f10, cVar);
            return;
        }
        if (f10 != 1.0f || z9) {
            float fJ = cVar.j();
            if (f10 < 0.5f) {
                interpolation = cVar.k();
                interpolation2 = (f10955h.getInterpolation(f10 / 0.5f) * 0.79f) + 0.01f + interpolation;
            } else {
                float fK = cVar.k() + 0.79f;
                interpolation = fK - (((1.0f - f10955h.getInterpolation((f10 - 0.5f) / 0.5f)) * 0.79f) + 0.01f);
                interpolation2 = fK;
            }
            float f11 = fJ + (0.20999998f * f10);
            float f12 = (f10 + this.f10961e) * 216.0f;
            cVar.y(interpolation);
            cVar.v(interpolation2);
            cVar.w(f11);
            h(f12);
        }
    }

    public void d(boolean z9) {
        this.f10957a.x(z9);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Rect bounds = getBounds();
        canvas.save();
        canvas.rotate(this.f10958b, bounds.exactCenterX(), bounds.exactCenterY());
        this.f10957a.a(canvas, bounds);
        canvas.restore();
    }

    public void e(float f10) {
        this.f10957a.p(f10);
        invalidateSelf();
    }

    public void f(int... iArr) {
        this.f10957a.u(iArr);
        this.f10957a.t(0);
        invalidateSelf();
    }

    public void g(float f10) {
        this.f10957a.w(f10);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f10957a.c();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        return this.f10960d.isRunning();
    }

    public void j(float f10, float f11) {
        this.f10957a.y(f10);
        this.f10957a.v(f11);
        invalidateSelf();
    }

    public void k(float f10) {
        this.f10957a.z(f10);
        invalidateSelf();
    }

    public void l(int i10) {
        if (i10 == 0) {
            i(11.0f, 3.0f, 12.0f, 6.0f);
        } else {
            i(7.5f, 2.5f, 10.0f, 5.0f);
        }
        invalidateSelf();
    }

    void n(float f10, c cVar) {
        if (f10 > 0.75f) {
            cVar.r(c((f10 - 0.75f) / 0.25f, cVar.h(), cVar.e()));
        } else {
            cVar.r(cVar.h());
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        this.f10957a.n(i10);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f10957a.s(colorFilter);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        this.f10960d.cancel();
        this.f10957a.A();
        if (this.f10957a.d() != this.f10957a.g()) {
            this.f10962f = true;
            this.f10960d.setDuration(666L);
            this.f10960d.start();
        } else {
            this.f10957a.t(0);
            this.f10957a.m();
            this.f10960d.setDuration(1332L);
            this.f10960d.start();
        }
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        this.f10960d.cancel();
        h(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        this.f10957a.x(false);
        this.f10957a.t(0);
        this.f10957a.m();
        invalidateSelf();
    }
}
