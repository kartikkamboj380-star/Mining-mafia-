package U;

import O.AbstractC0845c0;
import android.content.Context;
import android.util.Log;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.widget.OverScroller;
import com.unity3d.services.UnityAdsConstants;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public class c {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private static final Interpolator f5810x = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f5811a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f5812b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private float[] f5814d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private float[] f5815e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private float[] f5816f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private float[] f5817g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int[] f5818h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int[] f5819i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int[] f5820j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f5821k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private VelocityTracker f5822l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private float f5823m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private float f5824n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f5825o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final int f5826p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f5827q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private OverScroller f5828r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final AbstractC0088c f5829s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private View f5830t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private boolean f5831u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final ViewGroup f5832v;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f5813c = -1;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final Runnable f5833w = new b();

    class a implements Interpolator {
        a() {
        }

        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f10) {
            float f11 = f10 - 1.0f;
            return (f11 * f11 * f11 * f11 * f11) + 1.0f;
        }
    }

    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            c.this.K(0);
        }
    }

    private c(Context context, ViewGroup viewGroup, AbstractC0088c abstractC0088c) {
        if (viewGroup == null) {
            throw new IllegalArgumentException("Parent view may not be null");
        }
        if (abstractC0088c == null) {
            throw new IllegalArgumentException("Callback may not be null");
        }
        this.f5832v = viewGroup;
        this.f5829s = abstractC0088c;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        int i10 = (int) ((context.getResources().getDisplayMetrics().density * 20.0f) + 0.5f);
        this.f5826p = i10;
        this.f5825o = i10;
        this.f5812b = viewConfiguration.getScaledTouchSlop();
        this.f5823m = viewConfiguration.getScaledMaximumFlingVelocity();
        this.f5824n = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f5828r = new OverScroller(context, f5810x);
    }

    private boolean D(int i10) {
        if (C(i10)) {
            return true;
        }
        Log.e("ViewDragHelper", "Ignoring pointerId=" + i10 + " because ACTION_DOWN was not received for this pointer before ACTION_MOVE. It likely happened because  ViewDragHelper did not receive all the events in the event stream.");
        return false;
    }

    private void G() {
        this.f5822l.computeCurrentVelocity(1000, this.f5823m);
        p(g(this.f5822l.getXVelocity(this.f5813c), this.f5824n, this.f5823m), g(this.f5822l.getYVelocity(this.f5813c), this.f5824n, this.f5823m));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4, types: [int] */
    /* JADX WARN: Type inference failed for: r3v3, types: [U.c$c] */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    private void H(float f10, float f11, int i10) {
        int i11;
        boolean zC = c(f10, f11, i10, 1);
        ?? r10 = zC;
        if (c(f11, f10, i10, 4)) {
            r10 = (zC ? 1 : 0) | 4;
        }
        ?? r11 = r10;
        if (c(f10, f11, i10, 2)) {
            r11 = (r10 == true ? 1 : 0) | 2;
        }
        ?? r12 = r11;
        if (c(f11, f10, i10, 8)) {
            i11 = (r11 == true ? 1 : 0) | 8;
        }
        if (r12 == 0) {
            r12 = i11;
            return;
        }
        r12 = i11;
        int[] iArr = this.f5819i;
        iArr[i10] = (iArr[i10] | r12) == true ? 1 : 0;
        this.f5829s.f(r12, i10);
    }

    private void I(float f10, float f11, int i10) {
        s(i10);
        float[] fArr = this.f5814d;
        this.f5816f[i10] = f10;
        fArr[i10] = f10;
        float[] fArr2 = this.f5815e;
        this.f5817g[i10] = f11;
        fArr2[i10] = f11;
        this.f5818h[i10] = y((int) f10, (int) f11);
        this.f5821k |= 1 << i10;
    }

    private void J(MotionEvent motionEvent) {
        int pointerCount = motionEvent.getPointerCount();
        for (int i10 = 0; i10 < pointerCount; i10++) {
            int pointerId = motionEvent.getPointerId(i10);
            if (D(pointerId)) {
                float x10 = motionEvent.getX(i10);
                float y9 = motionEvent.getY(i10);
                this.f5816f[pointerId] = x10;
                this.f5817g[pointerId] = y9;
            }
        }
    }

    private boolean c(float f10, float f11, int i10, int i11) {
        float fAbs = Math.abs(f10);
        float fAbs2 = Math.abs(f11);
        if ((this.f5818h[i10] & i11) == i11 && (this.f5827q & i11) != 0 && (this.f5820j[i10] & i11) != i11 && (this.f5819i[i10] & i11) != i11) {
            int i12 = this.f5812b;
            if (fAbs > i12 || fAbs2 > i12) {
                if (fAbs < fAbs2 * 0.5f && this.f5829s.g(i11)) {
                    int[] iArr = this.f5820j;
                    iArr[i10] = iArr[i10] | i11;
                    return false;
                }
                if ((this.f5819i[i10] & i11) == 0 && fAbs > this.f5812b) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean f(View view, float f10, float f11) {
        if (view == null) {
            return false;
        }
        boolean z9 = this.f5829s.d(view) > 0;
        boolean z10 = this.f5829s.e(view) > 0;
        if (z9 && z10) {
            float f12 = (f10 * f10) + (f11 * f11);
            int i10 = this.f5812b;
            return f12 > ((float) (i10 * i10));
        }
        if (z9) {
            return Math.abs(f10) > ((float) this.f5812b);
        }
        return z10 && Math.abs(f11) > ((float) this.f5812b);
    }

    private float g(float f10, float f11, float f12) {
        float fAbs = Math.abs(f10);
        if (fAbs < f11) {
            return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        }
        if (fAbs > f12) {
            return f10 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? f12 : -f12;
        }
        return f10;
    }

    private int h(int i10, int i11, int i12) {
        int iAbs = Math.abs(i10);
        if (iAbs < i11) {
            return 0;
        }
        if (iAbs > i12) {
            return i10 > 0 ? i12 : -i12;
        }
        return i10;
    }

    private void i() {
        float[] fArr = this.f5814d;
        if (fArr == null) {
            return;
        }
        Arrays.fill(fArr, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        Arrays.fill(this.f5815e, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        Arrays.fill(this.f5816f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        Arrays.fill(this.f5817g, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        Arrays.fill(this.f5818h, 0);
        Arrays.fill(this.f5819i, 0);
        Arrays.fill(this.f5820j, 0);
        this.f5821k = 0;
    }

    private void j(int i10) {
        if (this.f5814d == null || !C(i10)) {
            return;
        }
        this.f5814d[i10] = 0.0f;
        this.f5815e[i10] = 0.0f;
        this.f5816f[i10] = 0.0f;
        this.f5817g[i10] = 0.0f;
        this.f5818h[i10] = 0;
        this.f5819i[i10] = 0;
        this.f5820j[i10] = 0;
        this.f5821k = (~(1 << i10)) & this.f5821k;
    }

    private int k(int i10, int i11, int i12) {
        if (i10 == 0) {
            return 0;
        }
        int width = this.f5832v.getWidth();
        float f10 = width / 2;
        float fQ = f10 + (q(Math.min(1.0f, Math.abs(i10) / width)) * f10);
        int iAbs = Math.abs(i11);
        return Math.min(iAbs > 0 ? Math.round(Math.abs(fQ / iAbs) * 1000.0f) * 4 : (int) (((Math.abs(i10) / i12) + 1.0f) * 256.0f), 600);
    }

    private int l(View view, int i10, int i11, int i12, int i13) {
        float f10;
        float f11;
        float f12;
        float f13;
        int iH = h(i12, (int) this.f5824n, (int) this.f5823m);
        int iH2 = h(i13, (int) this.f5824n, (int) this.f5823m);
        int iAbs = Math.abs(i10);
        int iAbs2 = Math.abs(i11);
        int iAbs3 = Math.abs(iH);
        int iAbs4 = Math.abs(iH2);
        int i14 = iAbs3 + iAbs4;
        int i15 = iAbs + iAbs2;
        if (iH != 0) {
            f10 = iAbs3;
            f11 = i14;
        } else {
            f10 = iAbs;
            f11 = i15;
        }
        float f14 = f10 / f11;
        if (iH2 != 0) {
            f12 = iAbs4;
            f13 = i14;
        } else {
            f12 = iAbs2;
            f13 = i15;
        }
        return (int) ((k(i10, iH, this.f5829s.d(view)) * f14) + (k(i11, iH2, this.f5829s.e(view)) * (f12 / f13)));
    }

    public static c n(ViewGroup viewGroup, float f10, AbstractC0088c abstractC0088c) {
        c cVarO = o(viewGroup, abstractC0088c);
        cVarO.f5812b = (int) (cVarO.f5812b * (1.0f / f10));
        return cVarO;
    }

    public static c o(ViewGroup viewGroup, AbstractC0088c abstractC0088c) {
        return new c(viewGroup.getContext(), viewGroup, abstractC0088c);
    }

    private void p(float f10, float f11) {
        this.f5831u = true;
        this.f5829s.l(this.f5830t, f10, f11);
        this.f5831u = false;
        if (this.f5811a == 1) {
            K(0);
        }
    }

    private float q(float f10) {
        return (float) Math.sin((f10 - 0.5f) * 0.47123894f);
    }

    private void r(int i10, int i11, int i12, int i13) {
        int left = this.f5830t.getLeft();
        int top = this.f5830t.getTop();
        if (i12 != 0) {
            i10 = this.f5829s.a(this.f5830t, i10, i12);
            AbstractC0845c0.W(this.f5830t, i10 - left);
        }
        int i14 = i10;
        if (i13 != 0) {
            i11 = this.f5829s.b(this.f5830t, i11, i13);
            AbstractC0845c0.X(this.f5830t, i11 - top);
        }
        int i15 = i11;
        if (i12 == 0 && i13 == 0) {
            return;
        }
        this.f5829s.k(this.f5830t, i14, i15, i14 - left, i15 - top);
    }

    private void s(int i10) {
        float[] fArr = this.f5814d;
        if (fArr == null || fArr.length <= i10) {
            int i11 = i10 + 1;
            float[] fArr2 = new float[i11];
            float[] fArr3 = new float[i11];
            float[] fArr4 = new float[i11];
            float[] fArr5 = new float[i11];
            int[] iArr = new int[i11];
            int[] iArr2 = new int[i11];
            int[] iArr3 = new int[i11];
            if (fArr != null) {
                System.arraycopy(fArr, 0, fArr2, 0, fArr.length);
                float[] fArr6 = this.f5815e;
                System.arraycopy(fArr6, 0, fArr3, 0, fArr6.length);
                float[] fArr7 = this.f5816f;
                System.arraycopy(fArr7, 0, fArr4, 0, fArr7.length);
                float[] fArr8 = this.f5817g;
                System.arraycopy(fArr8, 0, fArr5, 0, fArr8.length);
                int[] iArr4 = this.f5818h;
                System.arraycopy(iArr4, 0, iArr, 0, iArr4.length);
                int[] iArr5 = this.f5819i;
                System.arraycopy(iArr5, 0, iArr2, 0, iArr5.length);
                int[] iArr6 = this.f5820j;
                System.arraycopy(iArr6, 0, iArr3, 0, iArr6.length);
            }
            this.f5814d = fArr2;
            this.f5815e = fArr3;
            this.f5816f = fArr4;
            this.f5817g = fArr5;
            this.f5818h = iArr;
            this.f5819i = iArr2;
            this.f5820j = iArr3;
        }
    }

    private boolean u(int i10, int i11, int i12, int i13) {
        int left = this.f5830t.getLeft();
        int top = this.f5830t.getTop();
        int i14 = i10 - left;
        int i15 = i11 - top;
        if (i14 == 0 && i15 == 0) {
            this.f5828r.abortAnimation();
            K(0);
            return false;
        }
        this.f5828r.startScroll(left, top, i14, i15, l(this.f5830t, i14, i15, i12, i13));
        K(2);
        return true;
    }

    private int y(int i10, int i11) {
        int i12 = i10 < this.f5832v.getLeft() + this.f5825o ? 1 : 0;
        if (i11 < this.f5832v.getTop() + this.f5825o) {
            i12 |= 4;
        }
        if (i10 > this.f5832v.getRight() - this.f5825o) {
            i12 |= 2;
        }
        return i11 > this.f5832v.getBottom() - this.f5825o ? i12 | 8 : i12;
    }

    public int A() {
        return this.f5811a;
    }

    public boolean B(int i10, int i11) {
        return E(this.f5830t, i10, i11);
    }

    public boolean C(int i10) {
        return ((1 << i10) & this.f5821k) != 0;
    }

    public boolean E(View view, int i10, int i11) {
        return view != null && i10 >= view.getLeft() && i10 < view.getRight() && i11 >= view.getTop() && i11 < view.getBottom();
    }

    public void F(MotionEvent motionEvent) {
        int i10;
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            a();
        }
        if (this.f5822l == null) {
            this.f5822l = VelocityTracker.obtain();
        }
        this.f5822l.addMovement(motionEvent);
        int i11 = 0;
        if (actionMasked == 0) {
            float x10 = motionEvent.getX();
            float y9 = motionEvent.getY();
            int pointerId = motionEvent.getPointerId(0);
            View viewT = t((int) x10, (int) y9);
            I(x10, y9, pointerId);
            R(viewT, pointerId);
            int i12 = this.f5818h[pointerId];
            int i13 = this.f5827q;
            if ((i12 & i13) != 0) {
                this.f5829s.h(i12 & i13, pointerId);
                return;
            }
            return;
        }
        if (actionMasked == 1) {
            if (this.f5811a == 1) {
                G();
            }
            a();
            return;
        }
        if (actionMasked == 2) {
            if (this.f5811a == 1) {
                if (D(this.f5813c)) {
                    int iFindPointerIndex = motionEvent.findPointerIndex(this.f5813c);
                    float x11 = motionEvent.getX(iFindPointerIndex);
                    float y10 = motionEvent.getY(iFindPointerIndex);
                    float[] fArr = this.f5816f;
                    int i14 = this.f5813c;
                    int i15 = (int) (x11 - fArr[i14]);
                    int i16 = (int) (y10 - this.f5817g[i14]);
                    r(this.f5830t.getLeft() + i15, this.f5830t.getTop() + i16, i15, i16);
                    J(motionEvent);
                    return;
                }
                return;
            }
            int pointerCount = motionEvent.getPointerCount();
            while (i11 < pointerCount) {
                int pointerId2 = motionEvent.getPointerId(i11);
                if (D(pointerId2)) {
                    float x12 = motionEvent.getX(i11);
                    float y11 = motionEvent.getY(i11);
                    float f10 = x12 - this.f5814d[pointerId2];
                    float f11 = y11 - this.f5815e[pointerId2];
                    H(f10, f11, pointerId2);
                    if (this.f5811a != 1) {
                        View viewT2 = t((int) x12, (int) y11);
                        if (f(viewT2, f10, f11) && R(viewT2, pointerId2)) {
                            break;
                        }
                    } else {
                        break;
                    }
                }
                i11++;
            }
            J(motionEvent);
            return;
        }
        if (actionMasked == 3) {
            if (this.f5811a == 1) {
                p(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            }
            a();
            return;
        }
        if (actionMasked == 5) {
            int pointerId3 = motionEvent.getPointerId(actionIndex);
            float x13 = motionEvent.getX(actionIndex);
            float y12 = motionEvent.getY(actionIndex);
            I(x13, y12, pointerId3);
            if (this.f5811a != 0) {
                if (B((int) x13, (int) y12)) {
                    R(this.f5830t, pointerId3);
                    return;
                }
                return;
            } else {
                R(t((int) x13, (int) y12), pointerId3);
                int i17 = this.f5818h[pointerId3];
                int i18 = this.f5827q;
                if ((i17 & i18) != 0) {
                    this.f5829s.h(i17 & i18, pointerId3);
                    return;
                }
                return;
            }
        }
        if (actionMasked != 6) {
            return;
        }
        int pointerId4 = motionEvent.getPointerId(actionIndex);
        if (this.f5811a == 1 && pointerId4 == this.f5813c) {
            int pointerCount2 = motionEvent.getPointerCount();
            while (true) {
                if (i11 >= pointerCount2) {
                    i10 = -1;
                    break;
                }
                int pointerId5 = motionEvent.getPointerId(i11);
                if (pointerId5 != this.f5813c) {
                    View viewT3 = t((int) motionEvent.getX(i11), (int) motionEvent.getY(i11));
                    View view = this.f5830t;
                    if (viewT3 == view && R(view, pointerId5)) {
                        i10 = this.f5813c;
                        break;
                    }
                }
                i11++;
            }
            if (i10 == -1) {
                G();
            }
        }
        j(pointerId4);
    }

    void K(int i10) {
        this.f5832v.removeCallbacks(this.f5833w);
        if (this.f5811a != i10) {
            this.f5811a = i10;
            this.f5829s.j(i10);
            if (this.f5811a == 0) {
                this.f5830t = null;
            }
        }
    }

    public void L(int i10) {
        this.f5825o = i10;
    }

    public void M(int i10) {
        this.f5827q = i10;
    }

    public void N(float f10) {
        this.f5824n = f10;
    }

    public boolean O(int i10, int i11) {
        if (this.f5831u) {
            return u(i10, i11, (int) this.f5822l.getXVelocity(this.f5813c), (int) this.f5822l.getYVelocity(this.f5813c));
        }
        throw new IllegalStateException("Cannot settleCapturedViewAt outside of a call to Callback#onViewReleased");
    }

    /* JADX WARN: Code duplicated, block: B:54:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:63:0x0101  */
    public boolean P(MotionEvent motionEvent) {
        View viewT;
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            a();
        }
        if (this.f5822l == null) {
            this.f5822l = VelocityTracker.obtain();
        }
        this.f5822l.addMovement(motionEvent);
        if (actionMasked == 0) {
            float x10 = motionEvent.getX();
            float y9 = motionEvent.getY();
            int pointerId = motionEvent.getPointerId(0);
            I(x10, y9, pointerId);
            View viewT2 = t((int) x10, (int) y9);
            if (viewT2 == this.f5830t && this.f5811a == 2) {
                R(viewT2, pointerId);
            }
            int i10 = this.f5818h[pointerId];
            int i11 = this.f5827q;
            if ((i10 & i11) != 0) {
                this.f5829s.h(i10 & i11, pointerId);
            }
        } else if (actionMasked == 1) {
            a();
        } else if (actionMasked != 2) {
            if (actionMasked == 3) {
                a();
            } else if (actionMasked == 5) {
                int pointerId2 = motionEvent.getPointerId(actionIndex);
                float x11 = motionEvent.getX(actionIndex);
                float y10 = motionEvent.getY(actionIndex);
                I(x11, y10, pointerId2);
                int i12 = this.f5811a;
                if (i12 == 0) {
                    int i13 = this.f5818h[pointerId2];
                    int i14 = this.f5827q;
                    if ((i13 & i14) != 0) {
                        this.f5829s.h(i13 & i14, pointerId2);
                    }
                } else if (i12 == 2 && (viewT = t((int) x11, (int) y10)) == this.f5830t) {
                    R(viewT, pointerId2);
                }
            } else if (actionMasked == 6) {
                j(motionEvent.getPointerId(actionIndex));
            }
        } else if (this.f5814d != null && this.f5815e != null) {
            int pointerCount = motionEvent.getPointerCount();
            for (int i15 = 0; i15 < pointerCount; i15++) {
                int pointerId3 = motionEvent.getPointerId(i15);
                if (D(pointerId3)) {
                    float x12 = motionEvent.getX(i15);
                    float y11 = motionEvent.getY(i15);
                    float f10 = x12 - this.f5814d[pointerId3];
                    float f11 = y11 - this.f5815e[pointerId3];
                    View viewT3 = t((int) x12, (int) y11);
                    boolean z9 = viewT3 != null && f(viewT3, f10, f11);
                    if (!z9) {
                        H(f10, f11, pointerId3);
                        if (this.f5811a != 1) {
                            break;
                        }
                    } else {
                        int left = viewT3.getLeft();
                        int i16 = (int) f10;
                        int iA = this.f5829s.a(viewT3, left + i16, i16);
                        int top = viewT3.getTop();
                        int i17 = (int) f11;
                        int iB = this.f5829s.b(viewT3, top + i17, i17);
                        int iD = this.f5829s.d(viewT3);
                        int iE = this.f5829s.e(viewT3);
                        if ((iD == 0 || (iD > 0 && iA == left)) && (iE == 0 || (iE > 0 && iB == top))) {
                            break;
                        }
                        H(f10, f11, pointerId3);
                        if (this.f5811a != 1 || (z9 && R(viewT3, pointerId3))) {
                            break;
                        }
                    }
                }
            }
            J(motionEvent);
        }
        return this.f5811a == 1;
    }

    public boolean Q(View view, int i10, int i11) {
        this.f5830t = view;
        this.f5813c = -1;
        boolean zU = u(i10, i11, 0, 0);
        if (!zU && this.f5811a == 0 && this.f5830t != null) {
            this.f5830t = null;
        }
        return zU;
    }

    boolean R(View view, int i10) {
        if (view == this.f5830t && this.f5813c == i10) {
            return true;
        }
        if (view == null || !this.f5829s.m(view, i10)) {
            return false;
        }
        this.f5813c = i10;
        b(view, i10);
        return true;
    }

    public void a() {
        this.f5813c = -1;
        i();
        VelocityTracker velocityTracker = this.f5822l;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f5822l = null;
        }
    }

    public void b(View view, int i10) {
        if (view.getParent() == this.f5832v) {
            this.f5830t = view;
            this.f5813c = i10;
            this.f5829s.i(view, i10);
            K(1);
            return;
        }
        throw new IllegalArgumentException("captureChildView: parameter must be a descendant of the ViewDragHelper's tracked parent view (" + this.f5832v + ")");
    }

    public boolean d(int i10) {
        int length = this.f5814d.length;
        for (int i11 = 0; i11 < length; i11++) {
            if (e(i10, i11)) {
                return true;
            }
        }
        return false;
    }

    public boolean e(int i10, int i11) {
        if (!C(i11)) {
            return false;
        }
        boolean z9 = (i10 & 1) == 1;
        boolean z10 = (i10 & 2) == 2;
        float f10 = this.f5816f[i11] - this.f5814d[i11];
        float f11 = this.f5817g[i11] - this.f5815e[i11];
        if (z9 && z10) {
            float f12 = (f10 * f10) + (f11 * f11);
            int i12 = this.f5812b;
            return f12 > ((float) (i12 * i12));
        }
        if (z9) {
            return Math.abs(f10) > ((float) this.f5812b);
        }
        return z10 && Math.abs(f11) > ((float) this.f5812b);
    }

    public boolean m(boolean z9) {
        if (this.f5811a == 2) {
            boolean zComputeScrollOffset = this.f5828r.computeScrollOffset();
            int currX = this.f5828r.getCurrX();
            int currY = this.f5828r.getCurrY();
            int left = currX - this.f5830t.getLeft();
            int top = currY - this.f5830t.getTop();
            if (left != 0) {
                AbstractC0845c0.W(this.f5830t, left);
            }
            if (top != 0) {
                AbstractC0845c0.X(this.f5830t, top);
            }
            if (left != 0 || top != 0) {
                this.f5829s.k(this.f5830t, currX, currY, left, top);
            }
            if (zComputeScrollOffset && currX == this.f5828r.getFinalX() && currY == this.f5828r.getFinalY()) {
                this.f5828r.abortAnimation();
                zComputeScrollOffset = false;
            }
            if (!zComputeScrollOffset) {
                if (z9) {
                    this.f5832v.post(this.f5833w);
                } else {
                    K(0);
                }
            }
        }
        return this.f5811a == 2;
    }

    public View t(int i10, int i11) {
        for (int childCount = this.f5832v.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = this.f5832v.getChildAt(this.f5829s.c(childCount));
            if (i10 >= childAt.getLeft() && i10 < childAt.getRight() && i11 >= childAt.getTop() && i11 < childAt.getBottom()) {
                return childAt;
            }
        }
        return null;
    }

    public View v() {
        return this.f5830t;
    }

    public int w() {
        return this.f5826p;
    }

    public int x() {
        return this.f5825o;
    }

    public int z() {
        return this.f5812b;
    }

    /* JADX INFO: renamed from: U.c$c, reason: collision with other inner class name */
    public static abstract class AbstractC0088c {
        public abstract int a(View view, int i10, int i11);

        public abstract int b(View view, int i10, int i11);

        public int d(View view) {
            return 0;
        }

        public int e(View view) {
            return 0;
        }

        public boolean g(int i10) {
            return false;
        }

        public abstract void j(int i10);

        public abstract void k(View view, int i10, int i11, int i12, int i13);

        public abstract void l(View view, float f10, float f11);

        public abstract boolean m(View view, int i10);

        public int c(int i10) {
            return i10;
        }

        public void f(int i10, int i11) {
        }

        public void h(int i10, int i11) {
        }

        public void i(View view, int i10) {
        }
    }
}
