package androidx.core.widget;

import O.AbstractC0845c0;
import android.content.res.Resources;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import com.unity3d.services.UnityAdsConstants;

/* JADX INFO: loaded from: classes.dex */
public abstract class a implements View.OnTouchListener {

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private static final int f9346I = ViewConfiguration.getTapTimeout();

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private boolean f9347G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private boolean f9348H;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final View f9351c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Runnable f9352d;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f9355g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f9356h;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f9360l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    boolean f9361m;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    boolean f9362v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    boolean f9363w;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final C0148a f9349a = new C0148a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Interpolator f9350b = new AccelerateInterpolator();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private float[] f9353e = {UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT};

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private float[] f9354f = {Float.MAX_VALUE, Float.MAX_VALUE};

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private float[] f9357i = {UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT};

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private float[] f9358j = {UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT};

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private float[] f9359k = {Float.MAX_VALUE, Float.MAX_VALUE};

    /* JADX INFO: renamed from: androidx.core.widget.a$a, reason: collision with other inner class name */
    private static class C0148a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f9364a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f9365b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private float f9366c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private float f9367d;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private float f9373j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private int f9374k;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private long f9368e = Long.MIN_VALUE;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private long f9372i = -1;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private long f9369f = 0;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private int f9370g = 0;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private int f9371h = 0;

        C0148a() {
        }

        private float e(long j10) {
            long j11 = this.f9368e;
            if (j10 < j11) {
                return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            }
            long j12 = this.f9372i;
            if (j12 < 0 || j10 < j12) {
                return a.i((j10 - j11) / this.f9364a, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f) * 0.5f;
            }
            float f10 = this.f9373j;
            return (1.0f - f10) + (f10 * a.i((j10 - j12) / this.f9374k, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f));
        }

        private float g(float f10) {
            return ((-4.0f) * f10 * f10) + (f10 * 4.0f);
        }

        public void a() {
            if (this.f9369f == 0) {
                throw new RuntimeException("Cannot compute scroll delta before calling start()");
            }
            long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            float fG = g(e(jCurrentAnimationTimeMillis));
            long j10 = jCurrentAnimationTimeMillis - this.f9369f;
            this.f9369f = jCurrentAnimationTimeMillis;
            float f10 = j10 * fG;
            this.f9370g = (int) (this.f9366c * f10);
            this.f9371h = (int) (f10 * this.f9367d);
        }

        public int b() {
            return this.f9370g;
        }

        public int c() {
            return this.f9371h;
        }

        public int d() {
            float f10 = this.f9366c;
            return (int) (f10 / Math.abs(f10));
        }

        public int f() {
            float f10 = this.f9367d;
            return (int) (f10 / Math.abs(f10));
        }

        public boolean h() {
            return this.f9372i > 0 && AnimationUtils.currentAnimationTimeMillis() > this.f9372i + ((long) this.f9374k);
        }

        public void i() {
            long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            this.f9374k = a.j((int) (jCurrentAnimationTimeMillis - this.f9368e), 0, this.f9365b);
            this.f9373j = e(jCurrentAnimationTimeMillis);
            this.f9372i = jCurrentAnimationTimeMillis;
        }

        public void j(int i10) {
            this.f9365b = i10;
        }

        public void k(int i10) {
            this.f9364a = i10;
        }

        public void l(float f10, float f11) {
            this.f9366c = f10;
            this.f9367d = f11;
        }

        public void m() {
            long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            this.f9368e = jCurrentAnimationTimeMillis;
            this.f9372i = -1L;
            this.f9369f = jCurrentAnimationTimeMillis;
            this.f9373j = 0.5f;
            this.f9370g = 0;
            this.f9371h = 0;
        }
    }

    private class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            a aVar = a.this;
            if (aVar.f9363w) {
                if (aVar.f9361m) {
                    aVar.f9361m = false;
                    aVar.f9349a.m();
                }
                C0148a c0148a = a.this.f9349a;
                if (c0148a.h() || !a.this.y()) {
                    a.this.f9363w = false;
                    return;
                }
                a aVar2 = a.this;
                if (aVar2.f9362v) {
                    aVar2.f9362v = false;
                    aVar2.f();
                }
                c0148a.a();
                a.this.n(c0148a.b(), c0148a.c());
                AbstractC0845c0.e0(a.this.f9351c, this);
            }
        }
    }

    public a(View view) {
        this.f9351c = view;
        float f10 = Resources.getSystem().getDisplayMetrics().density;
        float f11 = (int) ((1575.0f * f10) + 0.5f);
        s(f11, f11);
        float f12 = (int) ((f10 * 315.0f) + 0.5f);
        t(f12, f12);
        p(1);
        r(Float.MAX_VALUE, Float.MAX_VALUE);
        w(0.2f, 0.2f);
        x(1.0f, 1.0f);
        o(f9346I);
        v(UnityAdsConstants.RequestPolicy.RETRY_WAIT_BASE);
        u(UnityAdsConstants.RequestPolicy.RETRY_WAIT_BASE);
    }

    private float g(int i10, float f10, float f11, float f12) {
        float fL = l(this.f9353e[i10], f11, this.f9354f[i10], f10);
        if (fL == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        }
        float f13 = this.f9357i[i10];
        float f14 = this.f9358j[i10];
        float f15 = this.f9359k[i10];
        float f16 = f13 * f12;
        return fL > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? i(fL * f16, f14, f15) : -i((-fL) * f16, f14, f15);
    }

    static float i(float f10, float f11, float f12) {
        if (f10 > f12) {
            return f12;
        }
        return f10 < f11 ? f11 : f10;
    }

    static int j(int i10, int i11, int i12) {
        if (i10 > i12) {
            return i12;
        }
        return i10 < i11 ? i11 : i10;
    }

    private float k(float f10, float f11) {
        if (f11 == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        }
        int i10 = this.f9355g;
        if (i10 == 0 || i10 == 1) {
            if (f10 < f11) {
                if (f10 >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                    return 1.0f - (f10 / f11);
                }
                if (this.f9363w && i10 == 1) {
                    return 1.0f;
                }
            }
        } else if (i10 == 2 && f10 < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            return f10 / (-f11);
        }
        return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    }

    private float l(float f10, float f11, float f12, float f13) {
        float interpolation;
        float fI = i(f10 * f11, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f12);
        float fK = k(f11 - f13, fI) - k(f13, fI);
        if (fK < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            interpolation = -this.f9350b.getInterpolation(-fK);
        } else {
            if (fK <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            }
            interpolation = this.f9350b.getInterpolation(fK);
        }
        return i(interpolation, -1.0f, 1.0f);
    }

    private void m() {
        if (this.f9361m) {
            this.f9363w = false;
        } else {
            this.f9349a.i();
        }
    }

    private void z() {
        int i10;
        if (this.f9352d == null) {
            this.f9352d = new b();
        }
        this.f9363w = true;
        this.f9361m = true;
        if (this.f9360l || (i10 = this.f9356h) <= 0) {
            this.f9352d.run();
        } else {
            AbstractC0845c0.f0(this.f9351c, this.f9352d, i10);
        }
        this.f9360l = true;
    }

    public abstract boolean b(int i10);

    public abstract boolean e(int i10);

    void f() {
        long jUptimeMillis = SystemClock.uptimeMillis();
        MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0);
        this.f9351c.onTouchEvent(motionEventObtain);
        motionEventObtain.recycle();
    }

    public abstract void n(int i10, int i11);

    public a o(int i10) {
        this.f9356h = i10;
        return this;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0016  */
    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        if (!this.f9347G) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked == 1) {
                m();
            } else if (actionMasked != 2) {
                if (actionMasked == 3) {
                    m();
                }
            }
            return !this.f9348H && this.f9363w;
        }
        this.f9362v = true;
        this.f9360l = false;
        this.f9349a.l(g(0, motionEvent.getX(), view.getWidth(), this.f9351c.getWidth()), g(1, motionEvent.getY(), view.getHeight(), this.f9351c.getHeight()));
        if (!this.f9363w && y()) {
            z();
        }
        if (this.f9348H) {
        }
    }

    public a p(int i10) {
        this.f9355g = i10;
        return this;
    }

    public a q(boolean z9) {
        if (this.f9347G && !z9) {
            m();
        }
        this.f9347G = z9;
        return this;
    }

    public a r(float f10, float f11) {
        float[] fArr = this.f9354f;
        fArr[0] = f10;
        fArr[1] = f11;
        return this;
    }

    public a s(float f10, float f11) {
        float[] fArr = this.f9359k;
        fArr[0] = f10 / 1000.0f;
        fArr[1] = f11 / 1000.0f;
        return this;
    }

    public a t(float f10, float f11) {
        float[] fArr = this.f9358j;
        fArr[0] = f10 / 1000.0f;
        fArr[1] = f11 / 1000.0f;
        return this;
    }

    public a u(int i10) {
        this.f9349a.j(i10);
        return this;
    }

    public a v(int i10) {
        this.f9349a.k(i10);
        return this;
    }

    public a w(float f10, float f11) {
        float[] fArr = this.f9353e;
        fArr[0] = f10;
        fArr[1] = f11;
        return this;
    }

    public a x(float f10, float f11) {
        float[] fArr = this.f9357i;
        fArr[0] = f10 / 1000.0f;
        fArr[1] = f11 / 1000.0f;
        return this;
    }

    boolean y() {
        C0148a c0148a = this.f9349a;
        int iF = c0148a.f();
        int iD = c0148a.d();
        if (iF == 0 || !e(iF)) {
            return iD != 0 && b(iD);
        }
        return true;
    }
}
