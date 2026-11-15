package androidx.recyclerview.widget;

import O.AbstractC0845c0;
import android.R;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.view.MotionEvent;
import com.unity3d.services.UnityAdsConstants;

/* JADX INFO: loaded from: classes.dex */
class d extends RecyclerView.o implements RecyclerView.s {

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private static final int[] f10664D = {R.attr.state_pressed};

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private static final int[] f10665E = new int[0];

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    int f10666A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private final Runnable f10667B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final RecyclerView.t f10668C;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f10669a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f10670b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final StateListDrawable f10671c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final Drawable f10672d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f10673e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f10674f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final StateListDrawable f10675g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Drawable f10676h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final int f10677i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final int f10678j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    int f10679k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    int f10680l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    float f10681m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    int f10682n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    int f10683o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    float f10684p;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private RecyclerView f10687s;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    final ValueAnimator f10694z;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f10685q = 0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f10686r = 0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f10688t = false;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private boolean f10689u = false;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private int f10690v = 0;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private int f10691w = 0;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final int[] f10692x = new int[2];

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private final int[] f10693y = new int[2];

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            d.this.k(UnityAdsConstants.RequestPolicy.RETRY_WAIT_BASE);
        }
    }

    class b extends RecyclerView.t {
        b() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.t
        public void onScrolled(RecyclerView recyclerView, int i10, int i11) {
            d.this.v(recyclerView.computeHorizontalScrollOffset(), recyclerView.computeVerticalScrollOffset());
        }
    }

    private class c extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f10697a = false;

        c() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f10697a = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (this.f10697a) {
                this.f10697a = false;
                return;
            }
            if (((Float) d.this.f10694z.getAnimatedValue()).floatValue() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                d dVar = d.this;
                dVar.f10666A = 0;
                dVar.s(0);
            } else {
                d dVar2 = d.this;
                dVar2.f10666A = 2;
                dVar2.p();
            }
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.d$d, reason: collision with other inner class name */
    private class C0169d implements ValueAnimator.AnimatorUpdateListener {
        C0169d() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            int iFloatValue = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f);
            d.this.f10671c.setAlpha(iFloatValue);
            d.this.f10672d.setAlpha(iFloatValue);
            d.this.p();
        }
    }

    d(RecyclerView recyclerView, StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2, int i10, int i11, int i12) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);
        this.f10694z = valueAnimatorOfFloat;
        this.f10666A = 0;
        this.f10667B = new a();
        this.f10668C = new b();
        this.f10671c = stateListDrawable;
        this.f10672d = drawable;
        this.f10675g = stateListDrawable2;
        this.f10676h = drawable2;
        this.f10673e = Math.max(i10, stateListDrawable.getIntrinsicWidth());
        this.f10674f = Math.max(i10, drawable.getIntrinsicWidth());
        this.f10677i = Math.max(i10, stateListDrawable2.getIntrinsicWidth());
        this.f10678j = Math.max(i10, drawable2.getIntrinsicWidth());
        this.f10669a = i11;
        this.f10670b = i12;
        stateListDrawable.setAlpha(255);
        drawable.setAlpha(255);
        valueAnimatorOfFloat.addListener(new c());
        valueAnimatorOfFloat.addUpdateListener(new C0169d());
        d(recyclerView);
    }

    private void e() {
        this.f10687s.removeCallbacks(this.f10667B);
    }

    private void f() {
        this.f10687s.Y0(this);
        this.f10687s.Z0(this);
        this.f10687s.a1(this.f10668C);
        e();
    }

    private void g(Canvas canvas) {
        int i10 = this.f10686r;
        int i11 = this.f10677i;
        int i12 = i10 - i11;
        int i13 = this.f10683o;
        int i14 = this.f10682n;
        int i15 = i13 - (i14 / 2);
        this.f10675g.setBounds(0, 0, i14, i11);
        this.f10676h.setBounds(0, 0, this.f10685q, this.f10678j);
        canvas.translate(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, i12);
        this.f10676h.draw(canvas);
        canvas.translate(i15, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        this.f10675g.draw(canvas);
        canvas.translate(-i15, -i12);
    }

    private void h(Canvas canvas) {
        int i10 = this.f10685q;
        int i11 = this.f10673e;
        int i12 = i10 - i11;
        int i13 = this.f10680l;
        int i14 = this.f10679k;
        int i15 = i13 - (i14 / 2);
        this.f10671c.setBounds(0, 0, i11, i14);
        this.f10672d.setBounds(0, 0, this.f10674f, this.f10686r);
        if (!m()) {
            canvas.translate(i12, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            this.f10672d.draw(canvas);
            canvas.translate(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, i15);
            this.f10671c.draw(canvas);
            canvas.translate(-i12, -i15);
            return;
        }
        this.f10672d.draw(canvas);
        canvas.translate(this.f10673e, i15);
        canvas.scale(-1.0f, 1.0f);
        this.f10671c.draw(canvas);
        canvas.scale(-1.0f, 1.0f);
        canvas.translate(-this.f10673e, -i15);
    }

    private int[] i() {
        int[] iArr = this.f10693y;
        int i10 = this.f10670b;
        iArr[0] = i10;
        iArr[1] = this.f10685q - i10;
        return iArr;
    }

    private int[] j() {
        int[] iArr = this.f10692x;
        int i10 = this.f10670b;
        iArr[0] = i10;
        iArr[1] = this.f10686r - i10;
        return iArr;
    }

    private void l(float f10) {
        int[] iArrI = i();
        float fMax = Math.max(iArrI[0], Math.min(iArrI[1], f10));
        if (Math.abs(this.f10683o - fMax) < 2.0f) {
            return;
        }
        int iR = r(this.f10684p, fMax, iArrI, this.f10687s.computeHorizontalScrollRange(), this.f10687s.computeHorizontalScrollOffset(), this.f10685q);
        if (iR != 0) {
            this.f10687s.scrollBy(iR, 0);
        }
        this.f10684p = fMax;
    }

    private boolean m() {
        return AbstractC0845c0.z(this.f10687s) == 1;
    }

    private void q(int i10) {
        e();
        this.f10687s.postDelayed(this.f10667B, i10);
    }

    private int r(float f10, float f11, int[] iArr, int i10, int i11, int i12) {
        int i13 = iArr[1] - iArr[0];
        if (i13 == 0) {
            return 0;
        }
        int i14 = i10 - i12;
        int i15 = (int) (((f11 - f10) / i13) * i14);
        int i16 = i11 + i15;
        if (i16 >= i14 || i16 < 0) {
            return 0;
        }
        return i15;
    }

    private void t() {
        this.f10687s.h(this);
        this.f10687s.j(this);
        this.f10687s.k(this.f10668C);
    }

    private void w(float f10) {
        int[] iArrJ = j();
        float fMax = Math.max(iArrJ[0], Math.min(iArrJ[1], f10));
        if (Math.abs(this.f10680l - fMax) < 2.0f) {
            return;
        }
        int iR = r(this.f10681m, fMax, iArrJ, this.f10687s.computeVerticalScrollRange(), this.f10687s.computeVerticalScrollOffset(), this.f10686r);
        if (iR != 0) {
            this.f10687s.scrollBy(0, iR);
        }
        this.f10681m = fMax;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.s
    public void a(RecyclerView recyclerView, MotionEvent motionEvent) {
        if (this.f10690v == 0) {
            return;
        }
        if (motionEvent.getAction() == 0) {
            boolean zO = o(motionEvent.getX(), motionEvent.getY());
            boolean zN = n(motionEvent.getX(), motionEvent.getY());
            if (zO || zN) {
                if (zN) {
                    this.f10691w = 1;
                    this.f10684p = (int) motionEvent.getX();
                } else if (zO) {
                    this.f10691w = 2;
                    this.f10681m = (int) motionEvent.getY();
                }
                s(2);
                return;
            }
            return;
        }
        if (motionEvent.getAction() == 1 && this.f10690v == 2) {
            this.f10681m = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            this.f10684p = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            s(1);
            this.f10691w = 0;
            return;
        }
        if (motionEvent.getAction() == 2 && this.f10690v == 2) {
            u();
            if (this.f10691w == 1) {
                l(motionEvent.getX());
            }
            if (this.f10691w == 2) {
                w(motionEvent.getY());
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.s
    public boolean b(RecyclerView recyclerView, MotionEvent motionEvent) {
        int i10 = this.f10690v;
        if (i10 != 1) {
            return i10 == 2;
        }
        boolean zO = o(motionEvent.getX(), motionEvent.getY());
        boolean zN = n(motionEvent.getX(), motionEvent.getY());
        if (motionEvent.getAction() != 0 || (!zO && !zN)) {
            return false;
        }
        if (zN) {
            this.f10691w = 1;
            this.f10684p = (int) motionEvent.getX();
        } else if (zO) {
            this.f10691w = 2;
            this.f10681m = (int) motionEvent.getY();
        }
        s(2);
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.s
    public void c(boolean z9) {
    }

    public void d(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.f10687s;
        if (recyclerView2 == recyclerView) {
            return;
        }
        if (recyclerView2 != null) {
            f();
        }
        this.f10687s = recyclerView;
        if (recyclerView != null) {
            t();
        }
    }

    void k(int i10) {
        int i11 = this.f10666A;
        if (i11 == 1) {
            this.f10694z.cancel();
        } else if (i11 != 2) {
            return;
        }
        this.f10666A = 3;
        ValueAnimator valueAnimator = this.f10694z;
        valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        this.f10694z.setDuration(i10);
        this.f10694z.start();
    }

    boolean n(float f10, float f11) {
        if (f11 < this.f10686r - this.f10677i) {
            return false;
        }
        int i10 = this.f10683o;
        int i11 = this.f10682n;
        return f10 >= ((float) (i10 - (i11 / 2))) && f10 <= ((float) (i10 + (i11 / 2)));
    }

    boolean o(float f10, float f11) {
        if (m()) {
            if (f10 > this.f10673e) {
                return false;
            }
        } else if (f10 < this.f10685q - this.f10673e) {
            return false;
        }
        int i10 = this.f10680l;
        int i11 = this.f10679k;
        return f11 >= ((float) (i10 - (i11 / 2))) && f11 <= ((float) (i10 + (i11 / 2)));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void onDrawOver(Canvas canvas, RecyclerView recyclerView, RecyclerView.A a10) {
        if (this.f10685q != this.f10687s.getWidth() || this.f10686r != this.f10687s.getHeight()) {
            this.f10685q = this.f10687s.getWidth();
            this.f10686r = this.f10687s.getHeight();
            s(0);
        } else if (this.f10666A != 0) {
            if (this.f10688t) {
                h(canvas);
            }
            if (this.f10689u) {
                g(canvas);
            }
        }
    }

    void p() {
        this.f10687s.invalidate();
    }

    void s(int i10) {
        if (i10 == 2 && this.f10690v != 2) {
            this.f10671c.setState(f10664D);
            e();
        }
        if (i10 == 0) {
            p();
        } else {
            u();
        }
        if (this.f10690v == 2 && i10 != 2) {
            this.f10671c.setState(f10665E);
            q(1200);
        } else if (i10 == 1) {
            q(1500);
        }
        this.f10690v = i10;
    }

    public void u() {
        int i10 = this.f10666A;
        if (i10 != 0) {
            if (i10 != 3) {
                return;
            } else {
                this.f10694z.cancel();
            }
        }
        this.f10666A = 1;
        ValueAnimator valueAnimator = this.f10694z;
        valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 1.0f);
        this.f10694z.setDuration(500L);
        this.f10694z.setStartDelay(0L);
        this.f10694z.start();
    }

    void v(int i10, int i11) {
        int iComputeVerticalScrollRange = this.f10687s.computeVerticalScrollRange();
        int i12 = this.f10686r;
        this.f10688t = iComputeVerticalScrollRange - i12 > 0 && i12 >= this.f10669a;
        int iComputeHorizontalScrollRange = this.f10687s.computeHorizontalScrollRange();
        int i13 = this.f10685q;
        boolean z9 = iComputeHorizontalScrollRange - i13 > 0 && i13 >= this.f10669a;
        this.f10689u = z9;
        boolean z10 = this.f10688t;
        if (!z10 && !z9) {
            if (this.f10690v != 0) {
                s(0);
                return;
            }
            return;
        }
        if (z10) {
            float f10 = i12;
            this.f10680l = (int) ((f10 * (i11 + (f10 / 2.0f))) / iComputeVerticalScrollRange);
            this.f10679k = Math.min(i12, (i12 * i12) / iComputeVerticalScrollRange);
        }
        if (this.f10689u) {
            float f11 = i13;
            this.f10683o = (int) ((f11 * (i10 + (f11 / 2.0f))) / iComputeHorizontalScrollRange);
            this.f10682n = Math.min(i13, (i13 * i13) / iComputeHorizontalScrollRange);
        }
        int i14 = this.f10690v;
        if (i14 == 0 || i14 == 1) {
            s(1);
        }
    }
}
