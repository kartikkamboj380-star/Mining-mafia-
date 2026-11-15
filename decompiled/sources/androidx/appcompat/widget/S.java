package androidx.appcompat.widget;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import com.unity3d.services.UnityAdsConstants;

/* JADX INFO: loaded from: classes.dex */
public abstract class S implements View.OnTouchListener, View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float f7946a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f7947b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f7948c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final View f7949d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Runnable f7950e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Runnable f7951f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f7952g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f7953h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final int[] f7954i = new int[2];

    private class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ViewParent parent = S.this.f7949d.getParent();
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
        }
    }

    private class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            S.this.i();
        }
    }

    public S(View view) {
        this.f7949d = view;
        view.setLongClickable(true);
        view.addOnAttachStateChangeListener(this);
        this.f7946a = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        int tapTimeout = ViewConfiguration.getTapTimeout();
        this.f7947b = tapTimeout;
        this.f7948c = (tapTimeout + ViewConfiguration.getLongPressTimeout()) / 2;
    }

    private void b() {
        Runnable runnable = this.f7951f;
        if (runnable != null) {
            this.f7949d.removeCallbacks(runnable);
        }
        Runnable runnable2 = this.f7950e;
        if (runnable2 != null) {
            this.f7949d.removeCallbacks(runnable2);
        }
    }

    private boolean j(MotionEvent motionEvent) {
        P p10;
        View view = this.f7949d;
        p130n.e eVarE = e();
        if (eVarE != null && eVarE.a() && (p10 = (P) eVarE.o()) != null && p10.isShown()) {
            MotionEvent motionEventObtainNoHistory = MotionEvent.obtainNoHistory(motionEvent);
            m(view, motionEventObtainNoHistory);
            n(p10, motionEventObtainNoHistory);
            boolean zE = p10.e(motionEventObtainNoHistory, this.f7953h);
            motionEventObtainNoHistory.recycle();
            int actionMasked = motionEvent.getActionMasked();
            boolean z9 = (actionMasked == 1 || actionMasked == 3) ? false : true;
            if (zE && z9) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x003d  */
    private boolean k(MotionEvent motionEvent) {
        View view = this.f7949d;
        if (!view.isEnabled()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f7953h = motionEvent.getPointerId(0);
            if (this.f7950e == null) {
                this.f7950e = new a();
            }
            view.postDelayed(this.f7950e, this.f7947b);
            if (this.f7951f == null) {
                this.f7951f = new b();
            }
            view.postDelayed(this.f7951f, this.f7948c);
        } else if (actionMasked == 1) {
            b();
        } else if (actionMasked == 2) {
            int iFindPointerIndex = motionEvent.findPointerIndex(this.f7953h);
            if (iFindPointerIndex >= 0 && !l(view, motionEvent.getX(iFindPointerIndex), motionEvent.getY(iFindPointerIndex), this.f7946a)) {
                b();
                view.getParent().requestDisallowInterceptTouchEvent(true);
                return true;
            }
        } else if (actionMasked == 3) {
            b();
        }
        return false;
    }

    private static boolean l(View view, float f10, float f11, float f12) {
        float f13 = -f12;
        return f10 >= f13 && f11 >= f13 && f10 < ((float) (view.getRight() - view.getLeft())) + f12 && f11 < ((float) (view.getBottom() - view.getTop())) + f12;
    }

    private boolean m(View view, MotionEvent motionEvent) {
        int[] iArr = this.f7954i;
        view.getLocationOnScreen(iArr);
        motionEvent.offsetLocation(iArr[0], iArr[1]);
        return true;
    }

    private boolean n(View view, MotionEvent motionEvent) {
        int[] iArr = this.f7954i;
        view.getLocationOnScreen(iArr);
        motionEvent.offsetLocation(-iArr[0], -iArr[1]);
        return true;
    }

    public abstract p130n.e e();

    protected abstract boolean f();

    protected boolean g() {
        p130n.e eVarE = e();
        if (eVarE == null || !eVarE.a()) {
            return true;
        }
        eVarE.dismiss();
        return true;
    }

    void i() {
        b();
        View view = this.f7949d;
        if (view.isEnabled() && !view.isLongClickable() && f()) {
            view.getParent().requestDisallowInterceptTouchEvent(true);
            long jUptimeMillis = SystemClock.uptimeMillis();
            MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0);
            view.onTouchEvent(motionEventObtain);
            motionEventObtain.recycle();
            this.f7952g = true;
        }
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        boolean z9;
        boolean z10 = this.f7952g;
        if (z10) {
            z9 = j(motionEvent) || !g();
        } else {
            z9 = k(motionEvent) && f();
            if (z9) {
                long jUptimeMillis = SystemClock.uptimeMillis();
                MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0);
                this.f7949d.onTouchEvent(motionEventObtain);
                motionEventObtain.recycle();
            }
        }
        this.f7952g = z9;
        return z9 || z10;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        this.f7952g = false;
        this.f7953h = -1;
        Runnable runnable = this.f7950e;
        if (runnable != null) {
            this.f7949d.removeCallbacks(runnable);
        }
    }
}
