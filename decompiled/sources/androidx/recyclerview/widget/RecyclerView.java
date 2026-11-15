package androidx.recyclerview.widget;

import O.AbstractC0845c0;
import O.AbstractC0851f0;
import O.C0840a;
import O.E;
import O.F;
import O.O;
import P.AbstractC0920b;
import android.R;
import android.animation.LayoutTransition;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.Observable;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.Display;
import android.view.FocusFinder;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.OverScroller;
import androidx.annotation.NonNull;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.google.android.gms.common.api.Api;
import com.google.protobuf.CodedOutputStream;
import com.unity3d.services.UnityAdsConstants;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class RecyclerView extends ViewGroup implements O, E {

    /* JADX INFO: renamed from: R0, reason: collision with root package name */
    private static final int[] f10377R0 = {R.attr.nestedScrollingEnabled};

    /* JADX INFO: renamed from: S0, reason: collision with root package name */
    static final boolean f10378S0 = false;

    /* JADX INFO: renamed from: T0, reason: collision with root package name */
    static final boolean f10379T0 = true;

    /* JADX INFO: renamed from: U0, reason: collision with root package name */
    static final boolean f10380U0 = true;

    /* JADX INFO: renamed from: V0, reason: collision with root package name */
    static final boolean f10381V0 = true;

    /* JADX INFO: renamed from: W0, reason: collision with root package name */
    private static final boolean f10382W0 = false;

    /* JADX INFO: renamed from: X0, reason: collision with root package name */
    private static final boolean f10383X0 = false;

    /* JADX INFO: renamed from: Y0, reason: collision with root package name */
    private static final Class[] f10384Y0;

    /* JADX INFO: renamed from: Z0, reason: collision with root package name */
    static final Interpolator f10385Z0;

    /* JADX INFO: renamed from: A0, reason: collision with root package name */
    private List f10386A0;

    /* JADX INFO: renamed from: B0, reason: collision with root package name */
    boolean f10387B0;

    /* JADX INFO: renamed from: C0, reason: collision with root package name */
    boolean f10388C0;

    /* JADX INFO: renamed from: D0, reason: collision with root package name */
    private m.a f10389D0;

    /* JADX INFO: renamed from: E0, reason: collision with root package name */
    boolean f10390E0;

    /* JADX INFO: renamed from: F0, reason: collision with root package name */
    androidx.recyclerview.widget.k f10391F0;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private final ArrayList f10392G;

    /* JADX INFO: renamed from: G0, reason: collision with root package name */
    private final int[] f10393G0;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private s f10394H;

    /* JADX INFO: renamed from: H0, reason: collision with root package name */
    private F f10395H0;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    boolean f10396I;

    /* JADX INFO: renamed from: I0, reason: collision with root package name */
    private final int[] f10397I0;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    boolean f10398J;

    /* JADX INFO: renamed from: J0, reason: collision with root package name */
    private final int[] f10399J0;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    boolean f10400K;

    /* JADX INFO: renamed from: K0, reason: collision with root package name */
    final int[] f10401K0;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    boolean f10402L;

    /* JADX INFO: renamed from: L0, reason: collision with root package name */
    final List f10403L0;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    private int f10404M;

    /* JADX INFO: renamed from: M0, reason: collision with root package name */
    private Runnable f10405M0;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    boolean f10406N;

    /* JADX INFO: renamed from: N0, reason: collision with root package name */
    private boolean f10407N0;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    boolean f10408O;

    /* JADX INFO: renamed from: O0, reason: collision with root package name */
    private int f10409O0;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    private boolean f10410P;

    /* JADX INFO: renamed from: P0, reason: collision with root package name */
    private int f10411P0;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    private int f10412Q;

    /* JADX INFO: renamed from: Q0, reason: collision with root package name */
    private final androidx.recyclerview.widget.p.b f10413Q0;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    boolean f10414R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    private final AccessibilityManager f10415S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    private List f10416T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    boolean f10417U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    boolean f10418V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    private int f10419W;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final x f10420a;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    private int f10421a0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final v f10422b;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    private l f10423b0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    y f10424c;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    private EdgeEffect f10425c0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    a f10426d;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    private EdgeEffect f10427d0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    b f10428e;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    private EdgeEffect f10429e0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final androidx.recyclerview.widget.p f10430f;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    private EdgeEffect f10431f0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    boolean f10432g;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    m f10433g0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    final Runnable f10434h;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    private int f10435h0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    final Rect f10436i;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    private int f10437i0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final Rect f10438j;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    private VelocityTracker f10439j0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    final RectF f10440k;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    private int f10441k0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    h f10442l;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    private int f10443l0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    p f10444m;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    private int f10445m0;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    private int f10446n0;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    private int f10447o0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    private r f10448p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    private final int f10449q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    private final int f10450r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    private float f10451s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    private float f10452t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    private boolean f10453u0;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    final List f10454v;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    final C f10455v0;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    final ArrayList f10456w;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    androidx.recyclerview.widget.e f10457w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    androidx.recyclerview.widget.e.b f10458x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    final A f10459y0;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    private t f10460z0;

    public static class A {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private SparseArray f10462b;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        int f10473m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        long f10474n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        int f10475o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        int f10476p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f10477q;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f10461a = -1;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f10463c = 0;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f10464d = 0;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f10465e = 1;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f10466f = 0;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        boolean f10467g = false;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        boolean f10468h = false;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        boolean f10469i = false;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        boolean f10470j = false;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        boolean f10471k = false;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        boolean f10472l = false;

        void a(int i10) {
            if ((this.f10465e & i10) != 0) {
                return;
            }
            throw new IllegalStateException("Layout state should be one of " + Integer.toBinaryString(i10) + " but it is " + Integer.toBinaryString(this.f10465e));
        }

        public int b() {
            return this.f10468h ? this.f10463c - this.f10464d : this.f10466f;
        }

        public int c() {
            return this.f10461a;
        }

        public boolean d() {
            return this.f10461a != -1;
        }

        public boolean e() {
            return this.f10468h;
        }

        void f(h hVar) {
            this.f10465e = 1;
            this.f10466f = hVar.getItemCount();
            this.f10468h = false;
            this.f10469i = false;
            this.f10470j = false;
        }

        public boolean g() {
            return this.f10472l;
        }

        public String toString() {
            return "State{mTargetPosition=" + this.f10461a + ", mData=" + this.f10462b + ", mItemCount=" + this.f10466f + ", mIsMeasuring=" + this.f10470j + ", mPreviousLayoutItemCount=" + this.f10463c + ", mDeletedInvisibleItemCountSincePreviousLayout=" + this.f10464d + ", mStructureChanged=" + this.f10467g + ", mInPreLayout=" + this.f10468h + ", mRunSimpleAnimations=" + this.f10471k + ", mRunPredictiveAnimations=" + this.f10472l + '}';
        }
    }

    public static abstract class B {
    }

    class C implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f10478a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f10479b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        OverScroller f10480c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Interpolator f10481d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private boolean f10482e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private boolean f10483f;

        C() {
            Interpolator interpolator = RecyclerView.f10385Z0;
            this.f10481d = interpolator;
            this.f10482e = false;
            this.f10483f = false;
            this.f10480c = new OverScroller(RecyclerView.this.getContext(), interpolator);
        }

        private int a(int i10, int i11) {
            int iAbs = Math.abs(i10);
            int iAbs2 = Math.abs(i11);
            boolean z9 = iAbs > iAbs2;
            RecyclerView recyclerView = RecyclerView.this;
            int width = z9 ? recyclerView.getWidth() : recyclerView.getHeight();
            if (!z9) {
                iAbs = iAbs2;
            }
            return Math.min((int) (((iAbs / width) + 1.0f) * 300.0f), 2000);
        }

        private void c() {
            RecyclerView.this.removeCallbacks(this);
            AbstractC0845c0.e0(RecyclerView.this, this);
        }

        public void b(int i10, int i11) {
            RecyclerView.this.setScrollState(2);
            this.f10479b = 0;
            this.f10478a = 0;
            Interpolator interpolator = this.f10481d;
            Interpolator interpolator2 = RecyclerView.f10385Z0;
            if (interpolator != interpolator2) {
                this.f10481d = interpolator2;
                this.f10480c = new OverScroller(RecyclerView.this.getContext(), interpolator2);
            }
            this.f10480c.fling(0, 0, i10, i11, LinearLayoutManager.INVALID_OFFSET, Api.BaseClientBuilder.API_PRIORITY_OTHER, LinearLayoutManager.INVALID_OFFSET, Api.BaseClientBuilder.API_PRIORITY_OTHER);
            d();
        }

        void d() {
            if (this.f10482e) {
                this.f10483f = true;
            } else {
                c();
            }
        }

        public void e(int i10, int i11, int i12, Interpolator interpolator) {
            if (i12 == Integer.MIN_VALUE) {
                i12 = a(i10, i11);
            }
            int i13 = i12;
            if (interpolator == null) {
                interpolator = RecyclerView.f10385Z0;
            }
            if (this.f10481d != interpolator) {
                this.f10481d = interpolator;
                this.f10480c = new OverScroller(RecyclerView.this.getContext(), interpolator);
            }
            this.f10479b = 0;
            this.f10478a = 0;
            RecyclerView.this.setScrollState(2);
            this.f10480c.startScroll(0, 0, i10, i11, i13);
            d();
        }

        public void f() {
            RecyclerView.this.removeCallbacks(this);
            this.f10480c.abortAnimation();
        }

        @Override // java.lang.Runnable
        public void run() {
            int i10;
            int i11;
            int i12;
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.f10444m == null) {
                f();
                return;
            }
            this.f10483f = false;
            this.f10482e = true;
            recyclerView.v();
            OverScroller overScroller = this.f10480c;
            if (overScroller.computeScrollOffset()) {
                int currX = overScroller.getCurrX();
                int currY = overScroller.getCurrY();
                int i13 = currX - this.f10478a;
                int i14 = currY - this.f10479b;
                this.f10478a = currX;
                this.f10479b = currY;
                RecyclerView recyclerView2 = RecyclerView.this;
                int[] iArr = recyclerView2.f10401K0;
                iArr[0] = 0;
                iArr[1] = 0;
                if (recyclerView2.G(i13, i14, iArr, null, 1)) {
                    int[] iArr2 = RecyclerView.this.f10401K0;
                    i13 -= iArr2[0];
                    i14 -= iArr2[1];
                }
                if (RecyclerView.this.getOverScrollMode() != 2) {
                    RecyclerView.this.u(i13, i14);
                }
                RecyclerView recyclerView3 = RecyclerView.this;
                if (recyclerView3.f10442l != null) {
                    int[] iArr3 = recyclerView3.f10401K0;
                    iArr3[0] = 0;
                    iArr3[1] = 0;
                    recyclerView3.i1(i13, i14, iArr3);
                    RecyclerView recyclerView4 = RecyclerView.this;
                    int[] iArr4 = recyclerView4.f10401K0;
                    int i15 = iArr4[0];
                    int i16 = iArr4[1];
                    i13 -= i15;
                    i14 -= i16;
                    z zVar = recyclerView4.f10444m.mSmoothScroller;
                    if (zVar != null && !zVar.isPendingInitialRun() && zVar.isRunning()) {
                        int iB = RecyclerView.this.f10459y0.b();
                        if (iB == 0) {
                            zVar.stop();
                        } else if (zVar.getTargetPosition() >= iB) {
                            zVar.setTargetPosition(iB - 1);
                            zVar.onAnimation(i15, i16);
                        } else {
                            zVar.onAnimation(i15, i16);
                        }
                    }
                    i11 = i16;
                    i10 = i15;
                } else {
                    i10 = 0;
                    i11 = 0;
                }
                int i17 = i13;
                int i18 = i14;
                if (!RecyclerView.this.f10456w.isEmpty()) {
                    RecyclerView.this.invalidate();
                }
                RecyclerView recyclerView5 = RecyclerView.this;
                int[] iArr5 = recyclerView5.f10401K0;
                iArr5[0] = 0;
                iArr5[1] = 0;
                recyclerView5.H(i10, i11, i17, i18, null, 1, iArr5);
                RecyclerView recyclerView6 = RecyclerView.this;
                int[] iArr6 = recyclerView6.f10401K0;
                int i19 = i17 - iArr6[0];
                int i20 = i18 - iArr6[1];
                if (i10 != 0 || i11 != 0) {
                    recyclerView6.J(i10, i11);
                }
                if (!RecyclerView.this.awakenScrollBars()) {
                    RecyclerView.this.invalidate();
                }
                boolean z9 = overScroller.isFinished() || (((overScroller.getCurrX() == overScroller.getFinalX()) || i19 != 0) && ((overScroller.getCurrY() == overScroller.getFinalY()) || i20 != 0));
                z zVar2 = RecyclerView.this.f10444m.mSmoothScroller;
                if ((zVar2 == null || !zVar2.isPendingInitialRun()) && z9) {
                    if (RecyclerView.this.getOverScrollMode() != 2) {
                        int currVelocity = (int) overScroller.getCurrVelocity();
                        if (i19 < 0) {
                            i12 = -currVelocity;
                        } else {
                            i12 = i19 > 0 ? currVelocity : 0;
                        }
                        if (i20 < 0) {
                            currVelocity = -currVelocity;
                        } else if (i20 <= 0) {
                            currVelocity = 0;
                        }
                        RecyclerView.this.b(i12, currVelocity);
                    }
                    if (RecyclerView.f10381V0) {
                        RecyclerView.this.f10458x0.b();
                    }
                } else {
                    d();
                    RecyclerView recyclerView7 = RecyclerView.this;
                    androidx.recyclerview.widget.e eVar = recyclerView7.f10457w0;
                    if (eVar != null) {
                        eVar.f(recyclerView7, i10, i11);
                    }
                }
            }
            z zVar3 = RecyclerView.this.f10444m.mSmoothScroller;
            if (zVar3 != null && zVar3.isPendingInitialRun()) {
                zVar3.onAnimation(0, 0);
            }
            this.f10482e = false;
            if (this.f10483f) {
                c();
            } else {
                RecyclerView.this.setScrollState(0);
                RecyclerView.this.v1(1);
            }
        }
    }

    public static abstract class D {
        static final int FLAG_ADAPTER_FULLUPDATE = 1024;
        static final int FLAG_ADAPTER_POSITION_UNKNOWN = 512;
        static final int FLAG_APPEARED_IN_PRE_LAYOUT = 4096;
        static final int FLAG_BOUNCED_FROM_HIDDEN_LIST = 8192;
        static final int FLAG_BOUND = 1;
        static final int FLAG_IGNORE = 128;
        static final int FLAG_INVALID = 4;
        static final int FLAG_MOVED = 2048;
        static final int FLAG_NOT_RECYCLABLE = 16;
        static final int FLAG_REMOVED = 8;
        static final int FLAG_RETURNED_FROM_SCRAP = 32;
        static final int FLAG_TMP_DETACHED = 256;
        static final int FLAG_UPDATE = 2;
        private static final List<Object> FULLUPDATE_PAYLOADS = Collections.EMPTY_LIST;
        static final int PENDING_ACCESSIBILITY_STATE_NOT_SET = -1;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int f10485a = 0;

        @NonNull
        public final View itemView;
        h mBindingAdapter;
        int mFlags;
        WeakReference<RecyclerView> mNestedRecyclerView;
        RecyclerView mOwnerRecyclerView;
        int mPosition = -1;
        int mOldPosition = -1;
        long mItemId = -1;
        int mItemViewType = -1;
        int mPreLayoutPosition = -1;
        D mShadowedHolder = null;
        D mShadowingHolder = null;
        List<Object> mPayloads = null;
        List<Object> mUnmodifiedPayloads = null;
        private int mIsRecyclableCount = 0;
        v mScrapContainer = null;
        boolean mInChangeScrap = false;
        private int mWasImportantForAccessibilityBeforeHidden = 0;
        int mPendingAccessibilityState = -1;

        public D(View view) {
            if (view == null) {
                throw new IllegalArgumentException("itemView may not be null");
            }
            this.itemView = view;
        }

        private void a() {
            if (this.mPayloads == null) {
                ArrayList arrayList = new ArrayList();
                this.mPayloads = arrayList;
                this.mUnmodifiedPayloads = Collections.unmodifiableList(arrayList);
            }
        }

        void addChangePayload(Object obj) {
            if (obj == null) {
                addFlags(1024);
            } else if ((1024 & this.mFlags) == 0) {
                a();
                this.mPayloads.add(obj);
            }
        }

        void addFlags(int i10) {
            this.mFlags = i10 | this.mFlags;
        }

        void clearOldPosition() {
            this.mOldPosition = -1;
            this.mPreLayoutPosition = -1;
        }

        void clearPayload() {
            List<Object> list = this.mPayloads;
            if (list != null) {
                list.clear();
            }
            this.mFlags &= -1025;
        }

        void clearReturnedFromScrapFlag() {
            this.mFlags &= -33;
        }

        void clearTmpDetachFlag() {
            this.mFlags &= -257;
        }

        boolean doesTransientStatePreventRecycling() {
            return (this.mFlags & 16) == 0 && AbstractC0845c0.O(this.itemView);
        }

        void flagRemovedAndOffsetPosition(int i10, int i11, boolean z9) {
            addFlags(8);
            offsetPosition(i11, z9);
            this.mPosition = i10;
        }

        public final int getAbsoluteAdapterPosition() {
            RecyclerView recyclerView = this.mOwnerRecyclerView;
            if (recyclerView == null) {
                return -1;
            }
            return recyclerView.c0(this);
        }

        @Deprecated
        public final int getAdapterPosition() {
            return getBindingAdapterPosition();
        }

        public final h getBindingAdapter() {
            return this.mBindingAdapter;
        }

        public final int getBindingAdapterPosition() {
            RecyclerView recyclerView;
            h adapter;
            int iC0;
            if (this.mBindingAdapter == null || (recyclerView = this.mOwnerRecyclerView) == null || (adapter = recyclerView.getAdapter()) == null || (iC0 = this.mOwnerRecyclerView.c0(this)) == -1) {
                return -1;
            }
            return adapter.findRelativeAdapterPositionIn(this.mBindingAdapter, this, iC0);
        }

        public final long getItemId() {
            return this.mItemId;
        }

        public final int getItemViewType() {
            return this.mItemViewType;
        }

        public final int getLayoutPosition() {
            int i10 = this.mPreLayoutPosition;
            return i10 == -1 ? this.mPosition : i10;
        }

        public final int getOldPosition() {
            return this.mOldPosition;
        }

        @Deprecated
        public final int getPosition() {
            int i10 = this.mPreLayoutPosition;
            return i10 == -1 ? this.mPosition : i10;
        }

        List<Object> getUnmodifiedPayloads() {
            if ((this.mFlags & 1024) != 0) {
                return FULLUPDATE_PAYLOADS;
            }
            List<Object> list = this.mPayloads;
            return (list == null || list.size() == 0) ? FULLUPDATE_PAYLOADS : this.mUnmodifiedPayloads;
        }

        boolean hasAnyOfTheFlags(int i10) {
            return (i10 & this.mFlags) != 0;
        }

        boolean isAdapterPositionUnknown() {
            return (this.mFlags & 512) != 0 || isInvalid();
        }

        boolean isAttachedToTransitionOverlay() {
            return (this.itemView.getParent() == null || this.itemView.getParent() == this.mOwnerRecyclerView) ? false : true;
        }

        boolean isBound() {
            return (this.mFlags & 1) != 0;
        }

        boolean isInvalid() {
            return (this.mFlags & 4) != 0;
        }

        public final boolean isRecyclable() {
            return (this.mFlags & 16) == 0 && !AbstractC0845c0.O(this.itemView);
        }

        boolean isRemoved() {
            return (this.mFlags & 8) != 0;
        }

        boolean isScrap() {
            return this.mScrapContainer != null;
        }

        boolean isTmpDetached() {
            return (this.mFlags & 256) != 0;
        }

        boolean isUpdated() {
            return (this.mFlags & 2) != 0;
        }

        boolean needsUpdate() {
            return (this.mFlags & 2) != 0;
        }

        void offsetPosition(int i10, boolean z9) {
            if (this.mOldPosition == -1) {
                this.mOldPosition = this.mPosition;
            }
            if (this.mPreLayoutPosition == -1) {
                this.mPreLayoutPosition = this.mPosition;
            }
            if (z9) {
                this.mPreLayoutPosition += i10;
            }
            this.mPosition += i10;
            if (this.itemView.getLayoutParams() != null) {
                ((q) this.itemView.getLayoutParams()).f10515c = true;
            }
        }

        void onEnteredHiddenState(RecyclerView recyclerView) {
            int i10 = this.mPendingAccessibilityState;
            if (i10 != -1) {
                this.mWasImportantForAccessibilityBeforeHidden = i10;
            } else {
                this.mWasImportantForAccessibilityBeforeHidden = AbstractC0845c0.x(this.itemView);
            }
            recyclerView.l1(this, 4);
        }

        void onLeftHiddenState(RecyclerView recyclerView) {
            recyclerView.l1(this, this.mWasImportantForAccessibilityBeforeHidden);
            this.mWasImportantForAccessibilityBeforeHidden = 0;
        }

        void resetInternal() {
            this.mFlags = 0;
            this.mPosition = -1;
            this.mOldPosition = -1;
            this.mItemId = -1L;
            this.mPreLayoutPosition = -1;
            this.mIsRecyclableCount = 0;
            this.mShadowedHolder = null;
            this.mShadowingHolder = null;
            clearPayload();
            this.mWasImportantForAccessibilityBeforeHidden = 0;
            this.mPendingAccessibilityState = -1;
            RecyclerView.s(this);
        }

        void saveOldPosition() {
            if (this.mOldPosition == -1) {
                this.mOldPosition = this.mPosition;
            }
        }

        void setFlags(int i10, int i11) {
            this.mFlags = (i10 & i11) | (this.mFlags & (~i11));
        }

        public final void setIsRecyclable(boolean z9) {
            int i10 = this.mIsRecyclableCount;
            int i11 = z9 ? i10 - 1 : i10 + 1;
            this.mIsRecyclableCount = i11;
            if (i11 < 0) {
                this.mIsRecyclableCount = 0;
                Log.e("View", "isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for " + this);
                return;
            }
            if (!z9 && i11 == 1) {
                this.mFlags |= 16;
            } else if (z9 && i11 == 0) {
                this.mFlags &= -17;
            }
        }

        void setScrapContainer(v vVar, boolean z9) {
            this.mScrapContainer = vVar;
            this.mInChangeScrap = z9;
        }

        boolean shouldBeKeptAsChild() {
            return (this.mFlags & 16) != 0;
        }

        boolean shouldIgnore() {
            return (this.mFlags & 128) != 0;
        }

        void stopIgnoring() {
            this.mFlags &= -129;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder((getClass().isAnonymousClass() ? "ViewHolder" : getClass().getSimpleName()) + "{" + Integer.toHexString(hashCode()) + " position=" + this.mPosition + " id=" + this.mItemId + ", oldPos=" + this.mOldPosition + ", pLpos:" + this.mPreLayoutPosition);
            if (isScrap()) {
                sb.append(" scrap ");
                sb.append(this.mInChangeScrap ? "[changeScrap]" : "[attachedScrap]");
            }
            if (isInvalid()) {
                sb.append(" invalid");
            }
            if (!isBound()) {
                sb.append(" unbound");
            }
            if (needsUpdate()) {
                sb.append(" update");
            }
            if (isRemoved()) {
                sb.append(" removed");
            }
            if (shouldIgnore()) {
                sb.append(" ignored");
            }
            if (isTmpDetached()) {
                sb.append(" tmpDetached");
            }
            if (!isRecyclable()) {
                sb.append(" not recyclable(" + this.mIsRecyclableCount + ")");
            }
            if (isAdapterPositionUnknown()) {
                sb.append(" undefined adapter position");
            }
            if (this.itemView.getParent() == null) {
                sb.append(" no parent");
            }
            sb.append("}");
            return sb.toString();
        }

        void unScrap() {
            this.mScrapContainer.J(this);
        }

        boolean wasReturnedFromScrap() {
            return (this.mFlags & 32) != 0;
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.RecyclerView$a, reason: case insensitive filesystem */
    class RunnableC1179a implements Runnable {
        RunnableC1179a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            RecyclerView recyclerView = RecyclerView.this;
            if (!recyclerView.f10402L || recyclerView.isLayoutRequested()) {
                return;
            }
            RecyclerView recyclerView2 = RecyclerView.this;
            if (!recyclerView2.f10396I) {
                recyclerView2.requestLayout();
            } else if (recyclerView2.f10408O) {
                recyclerView2.f10406N = true;
            } else {
                recyclerView2.v();
            }
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.RecyclerView$b, reason: case insensitive filesystem */
    class RunnableC1180b implements Runnable {
        RunnableC1180b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            m mVar = RecyclerView.this.f10433g0;
            if (mVar != null) {
                mVar.u();
            }
            RecyclerView.this.f10390E0 = false;
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.RecyclerView$c, reason: case insensitive filesystem */
    class InterpolatorC1181c implements Interpolator {
        InterpolatorC1181c() {
        }

        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f10) {
            float f11 = f10 - 1.0f;
            return (f11 * f11 * f11 * f11 * f11) + 1.0f;
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.RecyclerView$d, reason: case insensitive filesystem */
    class C1182d implements androidx.recyclerview.widget.p.b {
        C1182d() {
        }

        @Override // androidx.recyclerview.widget.p.b
        public void a(D d10, m.b bVar, m.b bVar2) {
            RecyclerView.this.l(d10, bVar, bVar2);
        }

        @Override // androidx.recyclerview.widget.p.b
        public void b(D d10) {
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.f10444m.removeAndRecycleView(d10.itemView, recyclerView.f10422b);
        }

        @Override // androidx.recyclerview.widget.p.b
        public void c(D d10, m.b bVar, m.b bVar2) {
            RecyclerView.this.f10422b.J(d10);
            RecyclerView.this.n(d10, bVar, bVar2);
        }

        @Override // androidx.recyclerview.widget.p.b
        public void d(D d10, m.b bVar, m.b bVar2) {
            d10.setIsRecyclable(false);
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.f10417U) {
                if (recyclerView.f10433g0.b(d10, d10, bVar, bVar2)) {
                    RecyclerView.this.O0();
                }
            } else if (recyclerView.f10433g0.d(d10, bVar, bVar2)) {
                RecyclerView.this.O0();
            }
        }
    }

    class e implements b.InterfaceC0167b {
        e() {
        }

        @Override // androidx.recyclerview.widget.b.InterfaceC0167b
        public View a(int i10) {
            return RecyclerView.this.getChildAt(i10);
        }

        @Override // androidx.recyclerview.widget.b.InterfaceC0167b
        public int b() {
            return RecyclerView.this.getChildCount();
        }

        @Override // androidx.recyclerview.widget.b.InterfaceC0167b
        public void c(View view) {
            D dH0 = RecyclerView.h0(view);
            if (dH0 != null) {
                dH0.onEnteredHiddenState(RecyclerView.this);
            }
        }

        @Override // androidx.recyclerview.widget.b.InterfaceC0167b
        public D d(View view) {
            return RecyclerView.h0(view);
        }

        @Override // androidx.recyclerview.widget.b.InterfaceC0167b
        public void e(int i10) {
            D dH0;
            View viewA = a(i10);
            if (viewA != null && (dH0 = RecyclerView.h0(viewA)) != null) {
                if (dH0.isTmpDetached() && !dH0.shouldIgnore()) {
                    throw new IllegalArgumentException("called detach on an already detached child " + dH0 + RecyclerView.this.Q());
                }
                dH0.addFlags(IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER);
            }
            RecyclerView.this.detachViewFromParent(i10);
        }

        @Override // androidx.recyclerview.widget.b.InterfaceC0167b
        public void f(View view, int i10) {
            RecyclerView.this.addView(view, i10);
            RecyclerView.this.z(view);
        }

        @Override // androidx.recyclerview.widget.b.InterfaceC0167b
        public void g() {
            int iB = b();
            for (int i10 = 0; i10 < iB; i10++) {
                View viewA = a(i10);
                RecyclerView.this.A(viewA);
                viewA.clearAnimation();
            }
            RecyclerView.this.removeAllViews();
        }

        @Override // androidx.recyclerview.widget.b.InterfaceC0167b
        public int h(View view) {
            return RecyclerView.this.indexOfChild(view);
        }

        @Override // androidx.recyclerview.widget.b.InterfaceC0167b
        public void i(View view) {
            D dH0 = RecyclerView.h0(view);
            if (dH0 != null) {
                dH0.onLeftHiddenState(RecyclerView.this);
            }
        }

        @Override // androidx.recyclerview.widget.b.InterfaceC0167b
        public void j(int i10) {
            View childAt = RecyclerView.this.getChildAt(i10);
            if (childAt != null) {
                RecyclerView.this.A(childAt);
                childAt.clearAnimation();
            }
            RecyclerView.this.removeViewAt(i10);
        }

        @Override // androidx.recyclerview.widget.b.InterfaceC0167b
        public void k(View view, int i10, ViewGroup.LayoutParams layoutParams) {
            D dH0 = RecyclerView.h0(view);
            if (dH0 != null) {
                if (!dH0.isTmpDetached() && !dH0.shouldIgnore()) {
                    throw new IllegalArgumentException("Called attach on a child which is not detached: " + dH0 + RecyclerView.this.Q());
                }
                dH0.clearTmpDetachFlag();
            }
            RecyclerView.this.attachViewToParent(view, i10, layoutParams);
        }
    }

    class f implements a.InterfaceC0166a {
        f() {
        }

        @Override // androidx.recyclerview.widget.a.InterfaceC0166a
        public void a(int i10, int i11) {
            RecyclerView.this.E0(i10, i11);
            RecyclerView.this.f10387B0 = true;
        }

        @Override // androidx.recyclerview.widget.a.InterfaceC0166a
        public void b(a.b bVar) {
            i(bVar);
        }

        @Override // androidx.recyclerview.widget.a.InterfaceC0166a
        public void c(a.b bVar) {
            i(bVar);
        }

        @Override // androidx.recyclerview.widget.a.InterfaceC0166a
        public void d(int i10, int i11) {
            RecyclerView.this.F0(i10, i11, false);
            RecyclerView.this.f10387B0 = true;
        }

        @Override // androidx.recyclerview.widget.a.InterfaceC0166a
        public void e(int i10, int i11, Object obj) {
            RecyclerView.this.y1(i10, i11, obj);
            RecyclerView.this.f10388C0 = true;
        }

        @Override // androidx.recyclerview.widget.a.InterfaceC0166a
        public D f(int i10) {
            D dA0 = RecyclerView.this.a0(i10, true);
            if (dA0 == null || RecyclerView.this.f10428e.n(dA0.itemView)) {
                return null;
            }
            return dA0;
        }

        @Override // androidx.recyclerview.widget.a.InterfaceC0166a
        public void g(int i10, int i11) {
            RecyclerView.this.D0(i10, i11);
            RecyclerView.this.f10387B0 = true;
        }

        @Override // androidx.recyclerview.widget.a.InterfaceC0166a
        public void h(int i10, int i11) {
            RecyclerView.this.F0(i10, i11, true);
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.f10387B0 = true;
            recyclerView.f10459y0.f10464d += i11;
        }

        void i(a.b bVar) {
            int i10 = bVar.f10604a;
            if (i10 == 1) {
                RecyclerView recyclerView = RecyclerView.this;
                recyclerView.f10444m.onItemsAdded(recyclerView, bVar.f10605b, bVar.f10607d);
                return;
            }
            if (i10 == 2) {
                RecyclerView recyclerView2 = RecyclerView.this;
                recyclerView2.f10444m.onItemsRemoved(recyclerView2, bVar.f10605b, bVar.f10607d);
            } else if (i10 == 4) {
                RecyclerView recyclerView3 = RecyclerView.this;
                recyclerView3.f10444m.onItemsUpdated(recyclerView3, bVar.f10605b, bVar.f10607d, bVar.f10606c);
            } else {
                if (i10 != 8) {
                    return;
                }
                RecyclerView recyclerView4 = RecyclerView.this;
                recyclerView4.f10444m.onItemsMoved(recyclerView4, bVar.f10605b, bVar.f10607d, 1);
            }
        }
    }

    static /* synthetic */ class g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f10491a;

        static {
            int[] iArr = new int[h.a.values().length];
            f10491a = iArr;
            try {
                iArr[h.a.PREVENT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f10491a[h.a.PREVENT_WHEN_EMPTY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public static abstract class h {
        private final i mObservable = new i();
        private boolean mHasStableIds = false;
        private a mStateRestorationPolicy = a.ALLOW;

        public enum a {
            ALLOW,
            PREVENT_WHEN_EMPTY,
            PREVENT
        }

        public final void bindViewHolder(@NonNull D d10, int i10) {
            boolean z9 = d10.mBindingAdapter == null;
            if (z9) {
                d10.mPosition = i10;
                if (hasStableIds()) {
                    d10.mItemId = getItemId(i10);
                }
                d10.setFlags(1, 519);
                K.o.a("RV OnBindView");
            }
            d10.mBindingAdapter = this;
            onBindViewHolder(d10, i10, d10.getUnmodifiedPayloads());
            if (z9) {
                d10.clearPayload();
                ViewGroup.LayoutParams layoutParams = d10.itemView.getLayoutParams();
                if (layoutParams instanceof q) {
                    ((q) layoutParams).f10515c = true;
                }
                K.o.b();
            }
        }

        boolean canRestoreState() {
            int i10 = g.f10491a[this.mStateRestorationPolicy.ordinal()];
            return i10 != 1 && (i10 != 2 || getItemCount() > 0);
        }

        @NonNull
        public final D createViewHolder(@NonNull ViewGroup viewGroup, int i10) {
            try {
                K.o.a("RV CreateView");
                D dOnCreateViewHolder = onCreateViewHolder(viewGroup, i10);
                if (dOnCreateViewHolder.itemView.getParent() != null) {
                    throw new IllegalStateException("ViewHolder views must not be attached when created. Ensure that you are not passing 'true' to the attachToRoot parameter of LayoutInflater.inflate(..., boolean attachToRoot)");
                }
                dOnCreateViewHolder.mItemViewType = i10;
                K.o.b();
                return dOnCreateViewHolder;
            } catch (Throwable th) {
                K.o.b();
                throw th;
            }
        }

        public int findRelativeAdapterPositionIn(@NonNull h hVar, @NonNull D d10, int i10) {
            if (hVar == this) {
                return i10;
            }
            return -1;
        }

        public abstract int getItemCount();

        public long getItemId(int i10) {
            return -1L;
        }

        public int getItemViewType(int i10) {
            return 0;
        }

        @NonNull
        public final a getStateRestorationPolicy() {
            return this.mStateRestorationPolicy;
        }

        public final boolean hasObservers() {
            return this.mObservable.a();
        }

        public final boolean hasStableIds() {
            return this.mHasStableIds;
        }

        public final void notifyDataSetChanged() {
            this.mObservable.b();
        }

        public final void notifyItemChanged(int i10) {
            this.mObservable.d(i10, 1);
        }

        public final void notifyItemInserted(int i10) {
            this.mObservable.f(i10, 1);
        }

        public final void notifyItemMoved(int i10, int i11) {
            this.mObservable.c(i10, i11);
        }

        public final void notifyItemRangeChanged(int i10, int i11) {
            this.mObservable.d(i10, i11);
        }

        public final void notifyItemRangeInserted(int i10, int i11) {
            this.mObservable.f(i10, i11);
        }

        public final void notifyItemRangeRemoved(int i10, int i11) {
            this.mObservable.g(i10, i11);
        }

        public final void notifyItemRemoved(int i10) {
            this.mObservable.g(i10, 1);
        }

        public void onAttachedToRecyclerView(@NonNull RecyclerView recyclerView) {
        }

        public abstract void onBindViewHolder(D d10, int i10);

        public void onBindViewHolder(@NonNull D d10, int i10, @NonNull List<Object> list) {
            onBindViewHolder(d10, i10);
        }

        public abstract D onCreateViewHolder(ViewGroup viewGroup, int i10);

        public void onDetachedFromRecyclerView(@NonNull RecyclerView recyclerView) {
        }

        public boolean onFailedToRecycleView(@NonNull D d10) {
            return false;
        }

        public void onViewAttachedToWindow(@NonNull D d10) {
        }

        public void onViewDetachedFromWindow(@NonNull D d10) {
        }

        public void onViewRecycled(@NonNull D d10) {
        }

        public void registerAdapterDataObserver(@NonNull j jVar) {
            this.mObservable.registerObserver(jVar);
        }

        public void setHasStableIds(boolean z9) {
            if (hasObservers()) {
                throw new IllegalStateException("Cannot change whether this adapter has stable IDs while the adapter has registered observers.");
            }
            this.mHasStableIds = z9;
        }

        public void setStateRestorationPolicy(@NonNull a aVar) {
            this.mStateRestorationPolicy = aVar;
            this.mObservable.h();
        }

        public void unregisterAdapterDataObserver(@NonNull j jVar) {
            this.mObservable.unregisterObserver(jVar);
        }

        public final void notifyItemChanged(int i10, Object obj) {
            this.mObservable.e(i10, 1, obj);
        }

        public final void notifyItemRangeChanged(int i10, int i11, Object obj) {
            this.mObservable.e(i10, i11, obj);
        }
    }

    static class i extends Observable {
        i() {
        }

        public boolean a() {
            return !((Observable) this).mObservers.isEmpty();
        }

        public void b() {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((j) ((Observable) this).mObservers.get(size)).a();
            }
        }

        public void c(int i10, int i11) {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((j) ((Observable) this).mObservers.get(size)).d(i10, i11, 1);
            }
        }

        public void d(int i10, int i11) {
            e(i10, i11, null);
        }

        public void e(int i10, int i11, Object obj) {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((j) ((Observable) this).mObservers.get(size)).b(i10, i11, obj);
            }
        }

        public void f(int i10, int i11) {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((j) ((Observable) this).mObservers.get(size)).c(i10, i11);
            }
        }

        public void g(int i10, int i11) {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((j) ((Observable) this).mObservers.get(size)).e(i10, i11);
            }
        }

        public void h() {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((j) ((Observable) this).mObservers.get(size)).f();
            }
        }
    }

    public static abstract class j {
        public abstract void a();

        public abstract void b(int i10, int i11, Object obj);

        public abstract void c(int i10, int i11);

        public abstract void d(int i10, int i11, int i12);

        public abstract void e(int i10, int i11);

        public abstract void f();
    }

    public interface k {
    }

    public static class l {
        protected EdgeEffect a(RecyclerView recyclerView, int i10) {
            return new EdgeEffect(recyclerView.getContext());
        }
    }

    public static abstract class m {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private a f10496a = null;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private ArrayList f10497b = new ArrayList();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private long f10498c = 120;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private long f10499d = 120;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private long f10500e = 250;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private long f10501f = 250;

        interface a {
            void a(D d10);
        }

        public static class b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f10502a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public int f10503b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public int f10504c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public int f10505d;

            public b a(D d10) {
                return b(d10, 0);
            }

            public b b(D d10, int i10) {
                View view = d10.itemView;
                this.f10502a = view.getLeft();
                this.f10503b = view.getTop();
                this.f10504c = view.getRight();
                this.f10505d = view.getBottom();
                return this;
            }
        }

        static int e(D d10) {
            int i10 = d10.mFlags;
            int i11 = i10 & 14;
            if (d10.isInvalid()) {
                return 4;
            }
            if ((i10 & 4) == 0) {
                int oldPosition = d10.getOldPosition();
                int absoluteAdapterPosition = d10.getAbsoluteAdapterPosition();
                if (oldPosition != -1 && absoluteAdapterPosition != -1 && oldPosition != absoluteAdapterPosition) {
                    return i11 | 2048;
                }
            }
            return i11;
        }

        public abstract boolean a(D d10, b bVar, b bVar2);

        public abstract boolean b(D d10, D d11, b bVar, b bVar2);

        public abstract boolean c(D d10, b bVar, b bVar2);

        public abstract boolean d(D d10, b bVar, b bVar2);

        public abstract boolean f(D d10);

        public boolean g(D d10, List list) {
            return f(d10);
        }

        public final void h(D d10) {
            r(d10);
            a aVar = this.f10496a;
            if (aVar != null) {
                aVar.a(d10);
            }
        }

        public final void i() {
            if (this.f10497b.size() <= 0) {
                this.f10497b.clear();
            } else {
                p070h.w.a(this.f10497b.get(0));
                throw null;
            }
        }

        public abstract void j(D d10);

        public abstract void k();

        public long l() {
            return this.f10498c;
        }

        public long m() {
            return this.f10501f;
        }

        public long n() {
            return this.f10500e;
        }

        public long o() {
            return this.f10499d;
        }

        public abstract boolean p();

        public b q() {
            return new b();
        }

        public void r(D d10) {
        }

        public b s(A a10, D d10) {
            return q().a(d10);
        }

        public b t(A a10, D d10, int i10, List list) {
            return q().a(d10);
        }

        public abstract void u();

        void v(a aVar) {
            this.f10496a = aVar;
        }
    }

    private class n implements m.a {
        n() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.m.a
        public void a(D d10) {
            d10.setIsRecyclable(true);
            if (d10.mShadowedHolder != null && d10.mShadowingHolder == null) {
                d10.mShadowedHolder = null;
            }
            d10.mShadowingHolder = null;
            if (d10.shouldBeKeptAsChild() || RecyclerView.this.X0(d10.itemView) || !d10.isTmpDetached()) {
                return;
            }
            RecyclerView.this.removeDetachedView(d10.itemView, false);
        }
    }

    public static abstract class o {
        @Deprecated
        public void getItemOffsets(@NonNull Rect rect, int i10, @NonNull RecyclerView recyclerView) {
            rect.set(0, 0, 0, 0);
        }

        @Deprecated
        public void onDraw(@NonNull Canvas canvas, @NonNull RecyclerView recyclerView) {
        }

        @Deprecated
        public void onDrawOver(@NonNull Canvas canvas, @NonNull RecyclerView recyclerView) {
        }

        public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, A a10) {
            getItemOffsets(rect, ((q) view.getLayoutParams()).a(), recyclerView);
        }

        public void onDraw(@NonNull Canvas canvas, @NonNull RecyclerView recyclerView, @NonNull A a10) {
            onDraw(canvas, recyclerView);
        }

        public void onDrawOver(@NonNull Canvas canvas, @NonNull RecyclerView recyclerView, @NonNull A a10) {
            onDrawOver(canvas, recyclerView);
        }
    }

    public static abstract class p {
        boolean mAutoMeasure;
        androidx.recyclerview.widget.b mChildHelper;
        private int mHeight;
        private int mHeightMode;
        androidx.recyclerview.widget.o mHorizontalBoundCheck;
        private final androidx.recyclerview.widget.o.b mHorizontalBoundCheckCallback;
        boolean mIsAttachedToWindow;
        private boolean mItemPrefetchEnabled;
        private boolean mMeasurementCacheEnabled;
        int mPrefetchMaxCountObserved;
        boolean mPrefetchMaxObservedInInitialPrefetch;
        RecyclerView mRecyclerView;
        boolean mRequestedSimpleAnimations;
        z mSmoothScroller;
        androidx.recyclerview.widget.o mVerticalBoundCheck;
        private final androidx.recyclerview.widget.o.b mVerticalBoundCheckCallback;
        private int mWidth;
        private int mWidthMode;

        class a implements androidx.recyclerview.widget.o.b {
            a() {
            }

            @Override // androidx.recyclerview.widget.o.b
            public View a(int i10) {
                return p.this.getChildAt(i10);
            }

            @Override // androidx.recyclerview.widget.o.b
            public int b(View view) {
                return p.this.getDecoratedLeft(view) - ((ViewGroup.MarginLayoutParams) ((q) view.getLayoutParams())).leftMargin;
            }

            @Override // androidx.recyclerview.widget.o.b
            public int c() {
                return p.this.getPaddingLeft();
            }

            @Override // androidx.recyclerview.widget.o.b
            public int d() {
                return p.this.getWidth() - p.this.getPaddingRight();
            }

            @Override // androidx.recyclerview.widget.o.b
            public int e(View view) {
                return p.this.getDecoratedRight(view) + ((ViewGroup.MarginLayoutParams) ((q) view.getLayoutParams())).rightMargin;
            }
        }

        class b implements androidx.recyclerview.widget.o.b {
            b() {
            }

            @Override // androidx.recyclerview.widget.o.b
            public View a(int i10) {
                return p.this.getChildAt(i10);
            }

            @Override // androidx.recyclerview.widget.o.b
            public int b(View view) {
                return p.this.getDecoratedTop(view) - ((ViewGroup.MarginLayoutParams) ((q) view.getLayoutParams())).topMargin;
            }

            @Override // androidx.recyclerview.widget.o.b
            public int c() {
                return p.this.getPaddingTop();
            }

            @Override // androidx.recyclerview.widget.o.b
            public int d() {
                return p.this.getHeight() - p.this.getPaddingBottom();
            }

            @Override // androidx.recyclerview.widget.o.b
            public int e(View view) {
                return p.this.getDecoratedBottom(view) + ((ViewGroup.MarginLayoutParams) ((q) view.getLayoutParams())).bottomMargin;
            }
        }

        public interface c {
            void a(int i10, int i11);
        }

        public static class d {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f10509a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public int f10510b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public boolean f10511c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public boolean f10512d;
        }

        public p() {
            a aVar = new a();
            this.mHorizontalBoundCheckCallback = aVar;
            b bVar = new b();
            this.mVerticalBoundCheckCallback = bVar;
            this.mHorizontalBoundCheck = new androidx.recyclerview.widget.o(aVar);
            this.mVerticalBoundCheck = new androidx.recyclerview.widget.o(bVar);
            this.mRequestedSimpleAnimations = false;
            this.mIsAttachedToWindow = false;
            this.mAutoMeasure = false;
            this.mMeasurementCacheEnabled = true;
            this.mItemPrefetchEnabled = true;
        }

        public static int chooseSize(int i10, int i11, int i12) {
            int mode = View.MeasureSpec.getMode(i10);
            int size = View.MeasureSpec.getSize(i10);
            if (mode != Integer.MIN_VALUE) {
                return mode != 1073741824 ? Math.max(i11, i12) : size;
            }
            return Math.min(size, Math.max(i11, i12));
        }

        private void e(View view, int i10, boolean z9) {
            D dH0 = RecyclerView.h0(view);
            if (z9 || dH0.isRemoved()) {
                this.mRecyclerView.f10430f.b(dH0);
            } else {
                this.mRecyclerView.f10430f.p(dH0);
            }
            q qVar = (q) view.getLayoutParams();
            if (dH0.wasReturnedFromScrap() || dH0.isScrap()) {
                if (dH0.isScrap()) {
                    dH0.unScrap();
                } else {
                    dH0.clearReturnedFromScrapFlag();
                }
                this.mChildHelper.c(view, i10, view.getLayoutParams(), false);
            } else if (view.getParent() == this.mRecyclerView) {
                int iM = this.mChildHelper.m(view);
                if (i10 == -1) {
                    i10 = this.mChildHelper.g();
                }
                if (iM == -1) {
                    throw new IllegalStateException("Added View has RecyclerView as parent but view is not a real child. Unfiltered index:" + this.mRecyclerView.indexOfChild(view) + this.mRecyclerView.Q());
                }
                if (iM != i10) {
                    this.mRecyclerView.f10444m.moveView(iM, i10);
                }
            } else {
                this.mChildHelper.a(view, i10, false);
                qVar.f10515c = true;
                z zVar = this.mSmoothScroller;
                if (zVar != null && zVar.isRunning()) {
                    this.mSmoothScroller.onChildAttachedToWindow(view);
                }
            }
            if (qVar.f10516d) {
                dH0.itemView.invalidate();
                qVar.f10516d = false;
            }
        }

        private void f(int i10, View view) {
            this.mChildHelper.d(i10);
        }

        private int[] g(View view, Rect rect) {
            int paddingLeft = getPaddingLeft();
            int paddingTop = getPaddingTop();
            int width = getWidth() - getPaddingRight();
            int height = getHeight() - getPaddingBottom();
            int left = (view.getLeft() + rect.left) - view.getScrollX();
            int top = (view.getTop() + rect.top) - view.getScrollY();
            int iWidth = rect.width() + left;
            int iHeight = rect.height() + top;
            int i10 = left - paddingLeft;
            int iMin = Math.min(0, i10);
            int i11 = top - paddingTop;
            int iMin2 = Math.min(0, i11);
            int i12 = iWidth - width;
            int iMax = Math.max(0, i12);
            int iMax2 = Math.max(0, iHeight - height);
            if (getLayoutDirection() != 1) {
                if (iMin == 0) {
                    iMin = Math.min(i10, iMax);
                }
                iMax = iMin;
            } else if (iMax == 0) {
                iMax = Math.max(iMin, i12);
            }
            if (iMin2 == 0) {
                iMin2 = Math.min(i11, iMax2);
            }
            return new int[]{iMax, iMin2};
        }

        /* JADX WARN: Code duplicated, block: B:5:0x000c A[PHI: r3
          0x000c: PHI (r3v5 int) = (r3v0 int), (r3v2 int), (r3v0 int) binds: [B:7:0x0010, B:11:0x0016, B:4:0x000a] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:6:0x000e  */
        @Deprecated
        public static int getChildMeasureSpec(int i10, int i11, int i12, boolean z9) {
            int i13 = i10 - i11;
            int i14 = 0;
            int iMax = Math.max(0, i13);
            if (z9) {
                if (i12 >= 0) {
                    i14 = 1073741824;
                } else {
                    i12 = 0;
                }
            } else if (i12 >= 0) {
                i14 = 1073741824;
            } else if (i12 == -1) {
                i12 = iMax;
                i14 = 1073741824;
            } else if (i12 == -2) {
                i14 = LinearLayoutManager.INVALID_OFFSET;
                i12 = iMax;
            } else {
                i12 = 0;
            }
            return View.MeasureSpec.makeMeasureSpec(i12, i14);
        }

        public static d getProperties(@NonNull Context context, AttributeSet attributeSet, int i10, int i11) {
            d dVar = new d();
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, p221w0.c.f50237f, i10, i11);
            dVar.f10509a = typedArrayObtainStyledAttributes.getInt(p221w0.c.f50238g, 1);
            dVar.f10510b = typedArrayObtainStyledAttributes.getInt(p221w0.c.f50248q, 1);
            dVar.f10511c = typedArrayObtainStyledAttributes.getBoolean(p221w0.c.f50247p, false);
            dVar.f10512d = typedArrayObtainStyledAttributes.getBoolean(p221w0.c.f50249r, false);
            typedArrayObtainStyledAttributes.recycle();
            return dVar;
        }

        private boolean h(RecyclerView recyclerView, int i10, int i11) {
            View focusedChild = recyclerView.getFocusedChild();
            if (focusedChild == null) {
                return false;
            }
            int paddingLeft = getPaddingLeft();
            int paddingTop = getPaddingTop();
            int width = getWidth() - getPaddingRight();
            int height = getHeight() - getPaddingBottom();
            Rect rect = this.mRecyclerView.f10436i;
            getDecoratedBoundsWithMargins(focusedChild, rect);
            return rect.left - i10 < width && rect.right - i10 > paddingLeft && rect.top - i11 < height && rect.bottom - i11 > paddingTop;
        }

        private static boolean i(int i10, int i11, int i12) {
            int mode = View.MeasureSpec.getMode(i11);
            int size = View.MeasureSpec.getSize(i11);
            if (i12 > 0 && i10 != i12) {
                return false;
            }
            if (mode == Integer.MIN_VALUE) {
                return size >= i10;
            }
            if (mode != 0) {
                return mode == 1073741824 && size == i10;
            }
            return true;
        }

        private void j(v vVar, int i10, View view) {
            D dH0 = RecyclerView.h0(view);
            if (dH0.shouldIgnore()) {
                return;
            }
            if (dH0.isInvalid() && !dH0.isRemoved() && !this.mRecyclerView.f10442l.hasStableIds()) {
                removeViewAt(i10);
                vVar.C(dH0);
            } else {
                detachViewAt(i10);
                vVar.D(view);
                this.mRecyclerView.f10430f.k(dH0);
            }
        }

        public void addDisappearingView(View view) {
            addDisappearingView(view, -1);
        }

        public void addView(View view) {
            addView(view, -1);
        }

        public void assertInLayoutOrScroll(String str) {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView != null) {
                recyclerView.o(str);
            }
        }

        public void assertNotInLayoutOrScroll(String str) {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView != null) {
                recyclerView.p(str);
            }
        }

        public void attachView(@NonNull View view, int i10, q qVar) {
            D dH0 = RecyclerView.h0(view);
            if (dH0.isRemoved()) {
                this.mRecyclerView.f10430f.b(dH0);
            } else {
                this.mRecyclerView.f10430f.p(dH0);
            }
            this.mChildHelper.c(view, i10, qVar, dH0.isRemoved());
        }

        public void calculateItemDecorationsForChild(@NonNull View view, @NonNull Rect rect) {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView == null) {
                rect.set(0, 0, 0, 0);
            } else {
                rect.set(recyclerView.l0(view));
            }
        }

        public abstract boolean canScrollHorizontally();

        public abstract boolean canScrollVertically();

        public boolean checkLayoutParams(q qVar) {
            return qVar != null;
        }

        public void collectAdjacentPrefetchPositions(int i10, int i11, A a10, c cVar) {
        }

        public void collectInitialPrefetchPositions(int i10, c cVar) {
        }

        public abstract int computeHorizontalScrollExtent(A a10);

        public abstract int computeHorizontalScrollOffset(A a10);

        public abstract int computeHorizontalScrollRange(A a10);

        public abstract int computeVerticalScrollExtent(A a10);

        public abstract int computeVerticalScrollOffset(A a10);

        public abstract int computeVerticalScrollRange(A a10);

        public void detachAndScrapAttachedViews(@NonNull v vVar) {
            for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
                j(vVar, childCount, getChildAt(childCount));
            }
        }

        public void detachAndScrapView(@NonNull View view, @NonNull v vVar) {
            j(vVar, this.mChildHelper.m(view), view);
        }

        public void detachAndScrapViewAt(int i10, @NonNull v vVar) {
            j(vVar, i10, getChildAt(i10));
        }

        public void detachView(@NonNull View view) {
            int iM = this.mChildHelper.m(view);
            if (iM >= 0) {
                f(iM, view);
            }
        }

        public void detachViewAt(int i10) {
            f(i10, getChildAt(i10));
        }

        void dispatchAttachedToWindow(RecyclerView recyclerView) {
            this.mIsAttachedToWindow = true;
            onAttachedToWindow(recyclerView);
        }

        void dispatchDetachedFromWindow(RecyclerView recyclerView, v vVar) {
            this.mIsAttachedToWindow = false;
            onDetachedFromWindow(recyclerView, vVar);
        }

        public void endAnimation(View view) {
            m mVar = this.mRecyclerView.f10433g0;
            if (mVar != null) {
                mVar.j(RecyclerView.h0(view));
            }
        }

        public View findContainingItemView(@NonNull View view) {
            View viewS;
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView == null || (viewS = recyclerView.S(view)) == null || this.mChildHelper.n(viewS)) {
                return null;
            }
            return viewS;
        }

        public View findViewByPosition(int i10) {
            int childCount = getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = getChildAt(i11);
                D dH0 = RecyclerView.h0(childAt);
                if (dH0 != null && dH0.getLayoutPosition() == i10 && !dH0.shouldIgnore() && (this.mRecyclerView.f10459y0.e() || !dH0.isRemoved())) {
                    return childAt;
                }
            }
            return null;
        }

        public abstract q generateDefaultLayoutParams();

        public q generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
            if (layoutParams instanceof q) {
                return new q((q) layoutParams);
            }
            return layoutParams instanceof ViewGroup.MarginLayoutParams ? new q((ViewGroup.MarginLayoutParams) layoutParams) : new q(layoutParams);
        }

        public int getBaseline() {
            return -1;
        }

        public int getBottomDecorationHeight(@NonNull View view) {
            return ((q) view.getLayoutParams()).f10514b.bottom;
        }

        public View getChildAt(int i10) {
            androidx.recyclerview.widget.b bVar = this.mChildHelper;
            if (bVar != null) {
                return bVar.f(i10);
            }
            return null;
        }

        public int getChildCount() {
            androidx.recyclerview.widget.b bVar = this.mChildHelper;
            if (bVar != null) {
                return bVar.g();
            }
            return 0;
        }

        public boolean getClipToPadding() {
            RecyclerView recyclerView = this.mRecyclerView;
            return recyclerView != null && recyclerView.f10432g;
        }

        public int getColumnCountForAccessibility(@NonNull v vVar, @NonNull A a10) {
            return -1;
        }

        public int getDecoratedBottom(@NonNull View view) {
            return view.getBottom() + getBottomDecorationHeight(view);
        }

        public void getDecoratedBoundsWithMargins(@NonNull View view, @NonNull Rect rect) {
            RecyclerView.i0(view, rect);
        }

        public int getDecoratedLeft(@NonNull View view) {
            return view.getLeft() - getLeftDecorationWidth(view);
        }

        public int getDecoratedMeasuredHeight(@NonNull View view) {
            Rect rect = ((q) view.getLayoutParams()).f10514b;
            return view.getMeasuredHeight() + rect.top + rect.bottom;
        }

        public int getDecoratedMeasuredWidth(@NonNull View view) {
            Rect rect = ((q) view.getLayoutParams()).f10514b;
            return view.getMeasuredWidth() + rect.left + rect.right;
        }

        public int getDecoratedRight(@NonNull View view) {
            return view.getRight() + getRightDecorationWidth(view);
        }

        public int getDecoratedTop(@NonNull View view) {
            return view.getTop() - getTopDecorationHeight(view);
        }

        public View getFocusedChild() {
            View focusedChild;
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView == null || (focusedChild = recyclerView.getFocusedChild()) == null || this.mChildHelper.n(focusedChild)) {
                return null;
            }
            return focusedChild;
        }

        public int getHeight() {
            return this.mHeight;
        }

        public int getHeightMode() {
            return this.mHeightMode;
        }

        public int getItemCount() {
            RecyclerView recyclerView = this.mRecyclerView;
            h adapter = recyclerView != null ? recyclerView.getAdapter() : null;
            if (adapter != null) {
                return adapter.getItemCount();
            }
            return 0;
        }

        public int getItemViewType(@NonNull View view) {
            return RecyclerView.h0(view).getItemViewType();
        }

        public int getLayoutDirection() {
            return AbstractC0845c0.z(this.mRecyclerView);
        }

        public int getLeftDecorationWidth(@NonNull View view) {
            return ((q) view.getLayoutParams()).f10514b.left;
        }

        public int getMinimumHeight() {
            return AbstractC0845c0.A(this.mRecyclerView);
        }

        public int getMinimumWidth() {
            return AbstractC0845c0.B(this.mRecyclerView);
        }

        public int getPaddingBottom() {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView != null) {
                return recyclerView.getPaddingBottom();
            }
            return 0;
        }

        public int getPaddingEnd() {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView != null) {
                return AbstractC0845c0.D(recyclerView);
            }
            return 0;
        }

        public int getPaddingLeft() {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView != null) {
                return recyclerView.getPaddingLeft();
            }
            return 0;
        }

        public int getPaddingRight() {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView != null) {
                return recyclerView.getPaddingRight();
            }
            return 0;
        }

        public int getPaddingStart() {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView != null) {
                return AbstractC0845c0.E(recyclerView);
            }
            return 0;
        }

        public int getPaddingTop() {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView != null) {
                return recyclerView.getPaddingTop();
            }
            return 0;
        }

        public int getPosition(@NonNull View view) {
            return ((q) view.getLayoutParams()).a();
        }

        public int getRightDecorationWidth(@NonNull View view) {
            return ((q) view.getLayoutParams()).f10514b.right;
        }

        public int getRowCountForAccessibility(@NonNull v vVar, @NonNull A a10) {
            return -1;
        }

        public int getSelectionModeForAccessibility(@NonNull v vVar, @NonNull A a10) {
            return 0;
        }

        public int getTopDecorationHeight(@NonNull View view) {
            return ((q) view.getLayoutParams()).f10514b.top;
        }

        public void getTransformedBoundingBox(@NonNull View view, boolean z9, @NonNull Rect rect) {
            Matrix matrix;
            if (z9) {
                Rect rect2 = ((q) view.getLayoutParams()).f10514b;
                rect.set(-rect2.left, -rect2.top, view.getWidth() + rect2.right, view.getHeight() + rect2.bottom);
            } else {
                rect.set(0, 0, view.getWidth(), view.getHeight());
            }
            if (this.mRecyclerView != null && (matrix = view.getMatrix()) != null && !matrix.isIdentity()) {
                RectF rectF = this.mRecyclerView.f10440k;
                rectF.set(rect);
                matrix.mapRect(rectF);
                rect.set((int) Math.floor(rectF.left), (int) Math.floor(rectF.top), (int) Math.ceil(rectF.right), (int) Math.ceil(rectF.bottom));
            }
            rect.offset(view.getLeft(), view.getTop());
        }

        public int getWidth() {
            return this.mWidth;
        }

        public int getWidthMode() {
            return this.mWidthMode;
        }

        boolean hasFlexibleChildInBothOrientations() {
            int childCount = getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                ViewGroup.LayoutParams layoutParams = getChildAt(i10).getLayoutParams();
                if (layoutParams.width < 0 && layoutParams.height < 0) {
                    return true;
                }
            }
            return false;
        }

        public boolean hasFocus() {
            RecyclerView recyclerView = this.mRecyclerView;
            return recyclerView != null && recyclerView.hasFocus();
        }

        public void ignoreView(@NonNull View view) {
            ViewParent parent = view.getParent();
            RecyclerView recyclerView = this.mRecyclerView;
            if (parent != recyclerView || recyclerView.indexOfChild(view) == -1) {
                throw new IllegalArgumentException("View should be fully attached to be ignored" + this.mRecyclerView.Q());
            }
            D dH0 = RecyclerView.h0(view);
            dH0.addFlags(IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT);
            this.mRecyclerView.f10430f.q(dH0);
        }

        public boolean isAttachedToWindow() {
            return this.mIsAttachedToWindow;
        }

        public abstract boolean isAutoMeasureEnabled();

        public boolean isFocused() {
            RecyclerView recyclerView = this.mRecyclerView;
            return recyclerView != null && recyclerView.isFocused();
        }

        public final boolean isItemPrefetchEnabled() {
            return this.mItemPrefetchEnabled;
        }

        public boolean isLayoutHierarchical(@NonNull v vVar, @NonNull A a10) {
            return false;
        }

        public boolean isMeasurementCacheEnabled() {
            return this.mMeasurementCacheEnabled;
        }

        public boolean isSmoothScrolling() {
            z zVar = this.mSmoothScroller;
            return zVar != null && zVar.isRunning();
        }

        public boolean isViewPartiallyVisible(@NonNull View view, boolean z9, boolean z10) {
            boolean z11 = this.mHorizontalBoundCheck.b(view, 24579) && this.mVerticalBoundCheck.b(view, 24579);
            return z9 ? z11 : !z11;
        }

        public void layoutDecorated(@NonNull View view, int i10, int i11, int i12, int i13) {
            Rect rect = ((q) view.getLayoutParams()).f10514b;
            view.layout(i10 + rect.left, i11 + rect.top, i12 - rect.right, i13 - rect.bottom);
        }

        public void layoutDecoratedWithMargins(@NonNull View view, int i10, int i11, int i12, int i13) {
            q qVar = (q) view.getLayoutParams();
            Rect rect = qVar.f10514b;
            view.layout(i10 + rect.left + ((ViewGroup.MarginLayoutParams) qVar).leftMargin, i11 + rect.top + ((ViewGroup.MarginLayoutParams) qVar).topMargin, (i12 - rect.right) - ((ViewGroup.MarginLayoutParams) qVar).rightMargin, (i13 - rect.bottom) - ((ViewGroup.MarginLayoutParams) qVar).bottomMargin);
        }

        public void measureChild(@NonNull View view, int i10, int i11) {
            q qVar = (q) view.getLayoutParams();
            Rect rectL0 = this.mRecyclerView.l0(view);
            int i12 = i10 + rectL0.left + rectL0.right;
            int i13 = i11 + rectL0.top + rectL0.bottom;
            int childMeasureSpec = getChildMeasureSpec(getWidth(), getWidthMode(), getPaddingLeft() + getPaddingRight() + i12, ((ViewGroup.MarginLayoutParams) qVar).width, canScrollHorizontally());
            int childMeasureSpec2 = getChildMeasureSpec(getHeight(), getHeightMode(), getPaddingTop() + getPaddingBottom() + i13, ((ViewGroup.MarginLayoutParams) qVar).height, canScrollVertically());
            if (shouldMeasureChild(view, childMeasureSpec, childMeasureSpec2, qVar)) {
                view.measure(childMeasureSpec, childMeasureSpec2);
            }
        }

        public void measureChildWithMargins(@NonNull View view, int i10, int i11) {
            q qVar = (q) view.getLayoutParams();
            Rect rectL0 = this.mRecyclerView.l0(view);
            int i12 = i10 + rectL0.left + rectL0.right;
            int i13 = i11 + rectL0.top + rectL0.bottom;
            int childMeasureSpec = getChildMeasureSpec(getWidth(), getWidthMode(), getPaddingLeft() + getPaddingRight() + ((ViewGroup.MarginLayoutParams) qVar).leftMargin + ((ViewGroup.MarginLayoutParams) qVar).rightMargin + i12, ((ViewGroup.MarginLayoutParams) qVar).width, canScrollHorizontally());
            int childMeasureSpec2 = getChildMeasureSpec(getHeight(), getHeightMode(), getPaddingTop() + getPaddingBottom() + ((ViewGroup.MarginLayoutParams) qVar).topMargin + ((ViewGroup.MarginLayoutParams) qVar).bottomMargin + i13, ((ViewGroup.MarginLayoutParams) qVar).height, canScrollVertically());
            if (shouldMeasureChild(view, childMeasureSpec, childMeasureSpec2, qVar)) {
                view.measure(childMeasureSpec, childMeasureSpec2);
            }
        }

        public void moveView(int i10, int i11) {
            View childAt = getChildAt(i10);
            if (childAt != null) {
                detachViewAt(i10);
                attachView(childAt, i11);
            } else {
                throw new IllegalArgumentException("Cannot move a child from non-existing index:" + i10 + this.mRecyclerView.toString());
            }
        }

        public void offsetChildrenHorizontal(int i10) {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView != null) {
                recyclerView.B0(i10);
            }
        }

        public void offsetChildrenVertical(int i10) {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView != null) {
                recyclerView.C0(i10);
            }
        }

        public void onAdapterChanged(h hVar, h hVar2) {
        }

        public boolean onAddFocusables(@NonNull RecyclerView recyclerView, @NonNull ArrayList<View> arrayList, int i10, int i11) {
            return false;
        }

        public void onAttachedToWindow(RecyclerView recyclerView) {
        }

        @Deprecated
        public void onDetachedFromWindow(RecyclerView recyclerView) {
        }

        public abstract View onFocusSearchFailed(View view, int i10, v vVar, A a10);

        public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
            RecyclerView recyclerView = this.mRecyclerView;
            onInitializeAccessibilityEvent(recyclerView.f10422b, recyclerView.f10459y0, accessibilityEvent);
        }

        void onInitializeAccessibilityNodeInfo(P.A a10) {
            RecyclerView recyclerView = this.mRecyclerView;
            onInitializeAccessibilityNodeInfo(recyclerView.f10422b, recyclerView.f10459y0, a10);
        }

        void onInitializeAccessibilityNodeInfoForItem(View view, P.A a10) {
            D dH0 = RecyclerView.h0(view);
            if (dH0 == null || dH0.isRemoved() || this.mChildHelper.n(dH0.itemView)) {
                return;
            }
            RecyclerView recyclerView = this.mRecyclerView;
            onInitializeAccessibilityNodeInfoForItem(recyclerView.f10422b, recyclerView.f10459y0, view, a10);
        }

        public View onInterceptFocusSearch(@NonNull View view, int i10) {
            return null;
        }

        public void onItemsAdded(@NonNull RecyclerView recyclerView, int i10, int i11) {
        }

        public void onItemsChanged(@NonNull RecyclerView recyclerView) {
        }

        public void onItemsMoved(@NonNull RecyclerView recyclerView, int i10, int i11, int i12) {
        }

        public void onItemsRemoved(@NonNull RecyclerView recyclerView, int i10, int i11) {
        }

        public void onItemsUpdated(@NonNull RecyclerView recyclerView, int i10, int i11) {
        }

        public abstract void onLayoutChildren(v vVar, A a10);

        public void onLayoutCompleted(A a10) {
        }

        public void onMeasure(@NonNull v vVar, @NonNull A a10, int i10, int i11) {
            this.mRecyclerView.x(i10, i11);
        }

        @Deprecated
        public boolean onRequestChildFocus(@NonNull RecyclerView recyclerView, @NonNull View view, View view2) {
            return isSmoothScrolling() || recyclerView.v0();
        }

        public void onRestoreInstanceState(Parcelable parcelable) {
        }

        public Parcelable onSaveInstanceState() {
            return null;
        }

        public void onScrollStateChanged(int i10) {
        }

        void onSmoothScrollerStopped(z zVar) {
            if (this.mSmoothScroller == zVar) {
                this.mSmoothScroller = null;
            }
        }

        boolean performAccessibilityAction(int i10, Bundle bundle) {
            RecyclerView recyclerView = this.mRecyclerView;
            return performAccessibilityAction(recyclerView.f10422b, recyclerView.f10459y0, i10, bundle);
        }

        public boolean performAccessibilityActionForItem(@NonNull v vVar, @NonNull A a10, @NonNull View view, int i10, Bundle bundle) {
            return false;
        }

        public void postOnAnimation(Runnable runnable) {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView != null) {
                AbstractC0845c0.e0(recyclerView, runnable);
            }
        }

        public void removeAllViews() {
            for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
                this.mChildHelper.q(childCount);
            }
        }

        public void removeAndRecycleAllViews(@NonNull v vVar) {
            for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
                if (!RecyclerView.h0(getChildAt(childCount)).shouldIgnore()) {
                    removeAndRecycleViewAt(childCount, vVar);
                }
            }
        }

        void removeAndRecycleScrapInt(v vVar) {
            int iJ = vVar.j();
            for (int i10 = iJ - 1; i10 >= 0; i10--) {
                View viewN = vVar.n(i10);
                D dH0 = RecyclerView.h0(viewN);
                if (!dH0.shouldIgnore()) {
                    dH0.setIsRecyclable(false);
                    if (dH0.isTmpDetached()) {
                        this.mRecyclerView.removeDetachedView(viewN, false);
                    }
                    m mVar = this.mRecyclerView.f10433g0;
                    if (mVar != null) {
                        mVar.j(dH0);
                    }
                    dH0.setIsRecyclable(true);
                    vVar.y(viewN);
                }
            }
            vVar.e();
            if (iJ > 0) {
                this.mRecyclerView.invalidate();
            }
        }

        public void removeAndRecycleView(@NonNull View view, @NonNull v vVar) {
            removeView(view);
            vVar.B(view);
        }

        public void removeAndRecycleViewAt(int i10, @NonNull v vVar) {
            View childAt = getChildAt(i10);
            removeViewAt(i10);
            vVar.B(childAt);
        }

        public boolean removeCallbacks(Runnable runnable) {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView != null) {
                return recyclerView.removeCallbacks(runnable);
            }
            return false;
        }

        public void removeDetachedView(@NonNull View view) {
            this.mRecyclerView.removeDetachedView(view, false);
        }

        public void removeView(View view) {
            this.mChildHelper.p(view);
        }

        public void removeViewAt(int i10) {
            if (getChildAt(i10) != null) {
                this.mChildHelper.q(i10);
            }
        }

        public boolean requestChildRectangleOnScreen(@NonNull RecyclerView recyclerView, @NonNull View view, @NonNull Rect rect, boolean z9) {
            return requestChildRectangleOnScreen(recyclerView, view, rect, z9, false);
        }

        public void requestLayout() {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView != null) {
                recyclerView.requestLayout();
            }
        }

        public void requestSimpleAnimationsInNextLayout() {
            this.mRequestedSimpleAnimations = true;
        }

        public abstract int scrollHorizontallyBy(int i10, v vVar, A a10);

        public abstract void scrollToPosition(int i10);

        public abstract int scrollVerticallyBy(int i10, v vVar, A a10);

        @Deprecated
        public void setAutoMeasureEnabled(boolean z9) {
            this.mAutoMeasure = z9;
        }

        void setExactMeasureSpecsFrom(RecyclerView recyclerView) {
            setMeasureSpecs(View.MeasureSpec.makeMeasureSpec(recyclerView.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(recyclerView.getHeight(), 1073741824));
        }

        public final void setItemPrefetchEnabled(boolean z9) {
            if (z9 != this.mItemPrefetchEnabled) {
                this.mItemPrefetchEnabled = z9;
                this.mPrefetchMaxCountObserved = 0;
                RecyclerView recyclerView = this.mRecyclerView;
                if (recyclerView != null) {
                    recyclerView.f10422b.K();
                }
            }
        }

        void setMeasureSpecs(int i10, int i11) {
            this.mWidth = View.MeasureSpec.getSize(i10);
            int mode = View.MeasureSpec.getMode(i10);
            this.mWidthMode = mode;
            if (mode == 0 && !RecyclerView.f10379T0) {
                this.mWidth = 0;
            }
            this.mHeight = View.MeasureSpec.getSize(i11);
            int mode2 = View.MeasureSpec.getMode(i11);
            this.mHeightMode = mode2;
            if (mode2 != 0 || RecyclerView.f10379T0) {
                return;
            }
            this.mHeight = 0;
        }

        public void setMeasuredDimension(Rect rect, int i10, int i11) {
            setMeasuredDimension(chooseSize(i10, rect.width() + getPaddingLeft() + getPaddingRight(), getMinimumWidth()), chooseSize(i11, rect.height() + getPaddingTop() + getPaddingBottom(), getMinimumHeight()));
        }

        void setMeasuredDimensionFromChildren(int i10, int i11) {
            int childCount = getChildCount();
            if (childCount == 0) {
                this.mRecyclerView.x(i10, i11);
                return;
            }
            int i12 = LinearLayoutManager.INVALID_OFFSET;
            int i13 = Integer.MAX_VALUE;
            int i14 = Integer.MIN_VALUE;
            int i15 = Integer.MAX_VALUE;
            for (int i16 = 0; i16 < childCount; i16++) {
                View childAt = getChildAt(i16);
                Rect rect = this.mRecyclerView.f10436i;
                getDecoratedBoundsWithMargins(childAt, rect);
                int i17 = rect.left;
                if (i17 < i15) {
                    i15 = i17;
                }
                int i18 = rect.right;
                if (i18 > i12) {
                    i12 = i18;
                }
                int i19 = rect.top;
                if (i19 < i13) {
                    i13 = i19;
                }
                int i20 = rect.bottom;
                if (i20 > i14) {
                    i14 = i20;
                }
            }
            this.mRecyclerView.f10436i.set(i15, i13, i12, i14);
            setMeasuredDimension(this.mRecyclerView.f10436i, i10, i11);
        }

        public void setMeasurementCacheEnabled(boolean z9) {
            this.mMeasurementCacheEnabled = z9;
        }

        void setRecyclerView(RecyclerView recyclerView) {
            if (recyclerView == null) {
                this.mRecyclerView = null;
                this.mChildHelper = null;
                this.mWidth = 0;
                this.mHeight = 0;
            } else {
                this.mRecyclerView = recyclerView;
                this.mChildHelper = recyclerView.f10428e;
                this.mWidth = recyclerView.getWidth();
                this.mHeight = recyclerView.getHeight();
            }
            this.mWidthMode = 1073741824;
            this.mHeightMode = 1073741824;
        }

        boolean shouldMeasureChild(View view, int i10, int i11, q qVar) {
            return (!view.isLayoutRequested() && this.mMeasurementCacheEnabled && i(view.getWidth(), i10, ((ViewGroup.MarginLayoutParams) qVar).width) && i(view.getHeight(), i11, ((ViewGroup.MarginLayoutParams) qVar).height)) ? false : true;
        }

        boolean shouldMeasureTwice() {
            return false;
        }

        boolean shouldReMeasureChild(View view, int i10, int i11, q qVar) {
            return (this.mMeasurementCacheEnabled && i(view.getMeasuredWidth(), i10, ((ViewGroup.MarginLayoutParams) qVar).width) && i(view.getMeasuredHeight(), i11, ((ViewGroup.MarginLayoutParams) qVar).height)) ? false : true;
        }

        public abstract void smoothScrollToPosition(RecyclerView recyclerView, A a10, int i10);

        public void startSmoothScroll(z zVar) {
            z zVar2 = this.mSmoothScroller;
            if (zVar2 != null && zVar != zVar2 && zVar2.isRunning()) {
                this.mSmoothScroller.stop();
            }
            this.mSmoothScroller = zVar;
            zVar.start(this.mRecyclerView, this);
        }

        public void stopIgnoringView(@NonNull View view) {
            D dH0 = RecyclerView.h0(view);
            dH0.stopIgnoring();
            dH0.resetInternal();
            dH0.addFlags(4);
        }

        void stopSmoothScroller() {
            z zVar = this.mSmoothScroller;
            if (zVar != null) {
                zVar.stop();
            }
        }

        public boolean supportsPredictiveItemAnimations() {
            return false;
        }

        public void addDisappearingView(View view, int i10) {
            e(view, i10, true);
        }

        public void addView(View view, int i10) {
            e(view, i10, false);
        }

        public void onDetachedFromWindow(RecyclerView recyclerView, v vVar) {
            onDetachedFromWindow(recyclerView);
        }

        public void onInitializeAccessibilityEvent(@NonNull v vVar, @NonNull A a10, @NonNull AccessibilityEvent accessibilityEvent) {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView == null || accessibilityEvent == null) {
                return;
            }
            boolean z9 = true;
            if (!recyclerView.canScrollVertically(1) && !this.mRecyclerView.canScrollVertically(-1) && !this.mRecyclerView.canScrollHorizontally(-1) && !this.mRecyclerView.canScrollHorizontally(1)) {
                z9 = false;
            }
            accessibilityEvent.setScrollable(z9);
            h hVar = this.mRecyclerView.f10442l;
            if (hVar != null) {
                accessibilityEvent.setItemCount(hVar.getItemCount());
            }
        }

        public void onInitializeAccessibilityNodeInfo(@NonNull v vVar, @NonNull A a10, @NonNull P.A a11) {
            if (this.mRecyclerView.canScrollVertically(-1) || this.mRecyclerView.canScrollHorizontally(-1)) {
                a11.a(8192);
                a11.L0(true);
            }
            if (this.mRecyclerView.canScrollVertically(1) || this.mRecyclerView.canScrollHorizontally(1)) {
                a11.a(CodedOutputStream.DEFAULT_BUFFER_SIZE);
                a11.L0(true);
            }
            a11.s0(P.A.e.b(getRowCountForAccessibility(vVar, a10), getColumnCountForAccessibility(vVar, a10), isLayoutHierarchical(vVar, a10), getSelectionModeForAccessibility(vVar, a10)));
        }

        public void onItemsUpdated(@NonNull RecyclerView recyclerView, int i10, int i11, Object obj) {
            onItemsUpdated(recyclerView, i10, i11);
        }

        public boolean onRequestChildFocus(@NonNull RecyclerView recyclerView, @NonNull A a10, @NonNull View view, View view2) {
            return onRequestChildFocus(recyclerView, view, view2);
        }

        /* JADX WARN: Code duplicated, block: B:18:0x0044 A[PHI: r8
          0x0044: PHI (r8v8 int) = (r8v4 int), (r8v12 int) binds: [B:24:0x0063, B:15:0x0030] A[DONT_GENERATE, DONT_INLINE]] */
        public boolean performAccessibilityAction(@NonNull v vVar, @NonNull A a10, int i10, Bundle bundle) {
            int height;
            int width;
            int i11;
            int i12;
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView == null) {
                return false;
            }
            if (i10 == 4096) {
                height = recyclerView.canScrollVertically(1) ? (getHeight() - getPaddingTop()) - getPaddingBottom() : 0;
                if (this.mRecyclerView.canScrollHorizontally(1)) {
                    width = (getWidth() - getPaddingLeft()) - getPaddingRight();
                    i11 = height;
                    i12 = width;
                } else {
                    i11 = height;
                    i12 = 0;
                }
            } else if (i10 != 8192) {
                i12 = 0;
                i11 = 0;
            } else {
                height = recyclerView.canScrollVertically(-1) ? -((getHeight() - getPaddingTop()) - getPaddingBottom()) : 0;
                if (this.mRecyclerView.canScrollHorizontally(-1)) {
                    width = -((getWidth() - getPaddingLeft()) - getPaddingRight());
                    i11 = height;
                    i12 = width;
                } else {
                    i11 = height;
                    i12 = 0;
                }
            }
            if (i11 == 0 && i12 == 0) {
                return false;
            }
            this.mRecyclerView.q1(i12, i11, null, LinearLayoutManager.INVALID_OFFSET, true);
            return true;
        }

        boolean performAccessibilityActionForItem(@NonNull View view, int i10, Bundle bundle) {
            RecyclerView recyclerView = this.mRecyclerView;
            return performAccessibilityActionForItem(recyclerView.f10422b, recyclerView.f10459y0, view, i10, bundle);
        }

        public boolean requestChildRectangleOnScreen(@NonNull RecyclerView recyclerView, @NonNull View view, @NonNull Rect rect, boolean z9, boolean z10) {
            int[] iArrG = g(view, rect);
            int i10 = iArrG[0];
            int i11 = iArrG[1];
            if ((z10 && !h(recyclerView, i10, i11)) || (i10 == 0 && i11 == 0)) {
                return false;
            }
            if (z9) {
                recyclerView.scrollBy(i10, i11);
            } else {
                recyclerView.n1(i10, i11);
            }
            return true;
        }

        /* JADX WARN: Code duplicated, block: B:10:0x001a  */
        /* JADX WARN: Code duplicated, block: B:14:0x0022  */
        /* JADX WARN: Code duplicated, block: B:5:0x0010  */
        public static int getChildMeasureSpec(int i10, int i11, int i12, int i13, boolean z9) {
            int iMax = Math.max(0, i10 - i12);
            if (z9) {
                if (i13 >= 0) {
                    i11 = 1073741824;
                } else if (i13 != -1 || (i11 != Integer.MIN_VALUE && (i11 == 0 || i11 != 1073741824))) {
                    i11 = 0;
                    i13 = 0;
                } else {
                    i13 = iMax;
                }
            } else if (i13 >= 0) {
                i11 = 1073741824;
            } else if (i13 == -1) {
                i13 = iMax;
            } else if (i13 != -2) {
                i11 = 0;
                i13 = 0;
            } else if (i11 == Integer.MIN_VALUE || i11 == 1073741824) {
                i13 = iMax;
                i11 = Integer.MIN_VALUE;
            } else {
                i13 = iMax;
                i11 = 0;
            }
            return View.MeasureSpec.makeMeasureSpec(i13, i11);
        }

        public void onInitializeAccessibilityNodeInfoForItem(@NonNull v vVar, @NonNull A a10, @NonNull View view, @NonNull P.A a11) {
        }

        public void attachView(@NonNull View view, int i10) {
            attachView(view, i10, (q) view.getLayoutParams());
        }

        public q generateLayoutParams(Context context, AttributeSet attributeSet) {
            return new q(context, attributeSet);
        }

        public void setMeasuredDimension(int i10, int i11) {
            this.mRecyclerView.setMeasuredDimension(i10, i11);
        }

        public void attachView(@NonNull View view) {
            attachView(view, -1);
        }
    }

    public static abstract class r {
        public abstract boolean onFling(int i10, int i11);
    }

    public interface s {
        void a(RecyclerView recyclerView, MotionEvent motionEvent);

        boolean b(RecyclerView recyclerView, MotionEvent motionEvent);

        void c(boolean z9);
    }

    public static abstract class t {
        public void onScrollStateChanged(RecyclerView recyclerView, int i10) {
        }

        public void onScrolled(RecyclerView recyclerView, int i10, int i11) {
        }
    }

    public static class u {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        SparseArray f10517a = new SparseArray();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f10518b = 0;

        static class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final ArrayList f10519a = new ArrayList();

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            int f10520b = 5;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            long f10521c = 0;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            long f10522d = 0;

            a() {
            }
        }

        private a g(int i10) {
            a aVar = (a) this.f10517a.get(i10);
            if (aVar != null) {
                return aVar;
            }
            a aVar2 = new a();
            this.f10517a.put(i10, aVar2);
            return aVar2;
        }

        void a() {
            this.f10518b++;
        }

        public void b() {
            for (int i10 = 0; i10 < this.f10517a.size(); i10++) {
                ((a) this.f10517a.valueAt(i10)).f10519a.clear();
            }
        }

        void c() {
            this.f10518b--;
        }

        void d(int i10, long j10) {
            a aVarG = g(i10);
            aVarG.f10522d = j(aVarG.f10522d, j10);
        }

        void e(int i10, long j10) {
            a aVarG = g(i10);
            aVarG.f10521c = j(aVarG.f10521c, j10);
        }

        public D f(int i10) {
            a aVar = (a) this.f10517a.get(i10);
            if (aVar == null || aVar.f10519a.isEmpty()) {
                return null;
            }
            ArrayList arrayList = aVar.f10519a;
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                if (!((D) arrayList.get(size)).isAttachedToTransitionOverlay()) {
                    return (D) arrayList.remove(size);
                }
            }
            return null;
        }

        void h(h hVar, h hVar2, boolean z9) {
            if (hVar != null) {
                c();
            }
            if (!z9 && this.f10518b == 0) {
                b();
            }
            if (hVar2 != null) {
                a();
            }
        }

        public void i(D d10) {
            int itemViewType = d10.getItemViewType();
            ArrayList arrayList = g(itemViewType).f10519a;
            if (((a) this.f10517a.get(itemViewType)).f10520b <= arrayList.size()) {
                return;
            }
            d10.resetInternal();
            arrayList.add(d10);
        }

        long j(long j10, long j11) {
            return j10 == 0 ? j11 : ((j10 / 4) * 3) + (j11 / 4);
        }

        boolean k(int i10, long j10, long j11) {
            long j12 = g(i10).f10522d;
            return j12 == 0 || j10 + j12 < j11;
        }

        boolean l(int i10, long j10, long j11) {
            long j12 = g(i10).f10521c;
            return j12 == 0 || j10 + j12 < j11;
        }
    }

    public final class v {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final ArrayList f10523a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        ArrayList f10524b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final ArrayList f10525c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final List f10526d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f10527e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f10528f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        u f10529g;

        public v() {
            ArrayList arrayList = new ArrayList();
            this.f10523a = arrayList;
            this.f10524b = null;
            this.f10525c = new ArrayList();
            this.f10526d = Collections.unmodifiableList(arrayList);
            this.f10527e = 2;
            this.f10528f = 2;
        }

        private boolean H(D d10, int i10, int i11, long j10) {
            d10.mBindingAdapter = null;
            d10.mOwnerRecyclerView = RecyclerView.this;
            int itemViewType = d10.getItemViewType();
            long nanoTime = RecyclerView.this.getNanoTime();
            if (j10 != Long.MAX_VALUE && !this.f10529g.k(itemViewType, nanoTime, j10)) {
                return false;
            }
            RecyclerView.this.f10442l.bindViewHolder(d10, i10);
            this.f10529g.d(d10.getItemViewType(), RecyclerView.this.getNanoTime() - nanoTime);
            b(d10);
            if (!RecyclerView.this.f10459y0.e()) {
                return true;
            }
            d10.mPreLayoutPosition = i11;
            return true;
        }

        private void b(D d10) {
            if (RecyclerView.this.u0()) {
                View view = d10.itemView;
                if (AbstractC0845c0.x(view) == 0) {
                    AbstractC0845c0.v0(view, 1);
                }
                androidx.recyclerview.widget.k kVar = RecyclerView.this.f10391F0;
                if (kVar == null) {
                    return;
                }
                C0840a c0840aN = kVar.n();
                if (c0840aN instanceof androidx.recyclerview.widget.k.a) {
                    ((androidx.recyclerview.widget.k.a) c0840aN).o(view);
                }
                AbstractC0845c0.m0(view, c0840aN);
            }
        }

        private void q(ViewGroup viewGroup, boolean z9) {
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                if (childAt instanceof ViewGroup) {
                    q((ViewGroup) childAt, true);
                }
            }
            if (z9) {
                if (viewGroup.getVisibility() == 4) {
                    viewGroup.setVisibility(0);
                    viewGroup.setVisibility(4);
                } else {
                    int visibility = viewGroup.getVisibility();
                    viewGroup.setVisibility(4);
                    viewGroup.setVisibility(visibility);
                }
            }
        }

        private void r(D d10) {
            View view = d10.itemView;
            if (view instanceof ViewGroup) {
                q((ViewGroup) view, false);
            }
        }

        void A(int i10) {
            a((D) this.f10525c.get(i10), true);
            this.f10525c.remove(i10);
        }

        public void B(View view) {
            D dH0 = RecyclerView.h0(view);
            if (dH0.isTmpDetached()) {
                RecyclerView.this.removeDetachedView(view, false);
            }
            if (dH0.isScrap()) {
                dH0.unScrap();
            } else if (dH0.wasReturnedFromScrap()) {
                dH0.clearReturnedFromScrapFlag();
            }
            C(dH0);
            if (RecyclerView.this.f10433g0 == null || dH0.isRecyclable()) {
                return;
            }
            RecyclerView.this.f10433g0.j(dH0);
        }

        void C(D d10) {
            boolean z9;
            boolean z10 = false;
            boolean z11 = true;
            if (d10.isScrap() || d10.itemView.getParent() != null) {
                StringBuilder sb = new StringBuilder();
                sb.append("Scrapped or attached views may not be recycled. isScrap:");
                sb.append(d10.isScrap());
                sb.append(" isAttached:");
                sb.append(d10.itemView.getParent() != null);
                sb.append(RecyclerView.this.Q());
                throw new IllegalArgumentException(sb.toString());
            }
            if (d10.isTmpDetached()) {
                throw new IllegalArgumentException("Tmp detached view should be removed from RecyclerView before it can be recycled: " + d10 + RecyclerView.this.Q());
            }
            if (d10.shouldIgnore()) {
                throw new IllegalArgumentException("Trying to recycle an ignored view holder. You should first call stopIgnoringView(view) before calling recycle." + RecyclerView.this.Q());
            }
            boolean zDoesTransientStatePreventRecycling = d10.doesTransientStatePreventRecycling();
            h hVar = RecyclerView.this.f10442l;
            if ((hVar != null && zDoesTransientStatePreventRecycling && hVar.onFailedToRecycleView(d10)) || d10.isRecyclable()) {
                if (this.f10528f <= 0 || d10.hasAnyOfTheFlags(526)) {
                    z9 = false;
                } else {
                    int size = this.f10525c.size();
                    if (size >= this.f10528f && size > 0) {
                        A(0);
                        size--;
                    }
                    if (RecyclerView.f10381V0 && size > 0 && !RecyclerView.this.f10458x0.d(d10.mPosition)) {
                        int i10 = size - 1;
                        while (i10 >= 0) {
                            if (!RecyclerView.this.f10458x0.d(((D) this.f10525c.get(i10)).mPosition)) {
                                break;
                            } else {
                                i10--;
                            }
                        }
                        size = i10 + 1;
                    }
                    this.f10525c.add(size, d10);
                    z9 = true;
                }
                if (z9) {
                    z11 = false;
                } else {
                    a(d10, true);
                }
                z10 = z9;
            } else {
                z11 = false;
            }
            RecyclerView.this.f10430f.q(d10);
            if (z10 || z11 || !zDoesTransientStatePreventRecycling) {
                return;
            }
            d10.mBindingAdapter = null;
            d10.mOwnerRecyclerView = null;
        }

        void D(View view) {
            D dH0 = RecyclerView.h0(view);
            if (!dH0.hasAnyOfTheFlags(12) && dH0.isUpdated() && !RecyclerView.this.q(dH0)) {
                if (this.f10524b == null) {
                    this.f10524b = new ArrayList();
                }
                dH0.setScrapContainer(this, true);
                this.f10524b.add(dH0);
                return;
            }
            if (!dH0.isInvalid() || dH0.isRemoved() || RecyclerView.this.f10442l.hasStableIds()) {
                dH0.setScrapContainer(this, false);
                this.f10523a.add(dH0);
            } else {
                throw new IllegalArgumentException("Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool." + RecyclerView.this.Q());
            }
        }

        void E(u uVar) {
            u uVar2 = this.f10529g;
            if (uVar2 != null) {
                uVar2.c();
            }
            this.f10529g = uVar;
            if (uVar == null || RecyclerView.this.getAdapter() == null) {
                return;
            }
            this.f10529g.a();
        }

        void F(B b10) {
        }

        public void G(int i10) {
            this.f10527e = i10;
            K();
        }

        /* JADX WARN: Code duplicated, block: B:18:0x0037 A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:19:0x0039  */
        /* JADX WARN: Code duplicated, block: B:21:0x0043  */
        /* JADX WARN: Code duplicated, block: B:22:0x004e  */
        /* JADX WARN: Code duplicated, block: B:24:0x0054  */
        /* JADX WARN: Code duplicated, block: B:27:0x005c  */
        /* JADX WARN: Code duplicated, block: B:29:0x005f  */
        /* JADX WARN: Code duplicated, block: B:67:0x014a  */
        /* JADX WARN: Code duplicated, block: B:73:0x0176  */
        /* JADX WARN: Code duplicated, block: B:75:0x017c  */
        /* JADX WARN: Code duplicated, block: B:84:0x01a1  */
        /* JADX WARN: Code duplicated, block: B:85:0x01af  */
        /* JADX WARN: Code duplicated, block: B:87:0x01b7  */
        /* JADX WARN: Code duplicated, block: B:88:0x01c5  */
        /* JADX WARN: Code duplicated, block: B:91:0x01cb A[ADDED_TO_REGION] */
        /* JADX WARN: Code duplicated, block: B:93:0x01ce  */
        D I(int i10, boolean z9, long j10) {
            D dCreateViewHolder;
            boolean z10;
            D d10;
            boolean z11;
            boolean zH;
            ViewGroup.LayoutParams layoutParams;
            q qVar;
            int iM;
            RecyclerView recyclerViewW;
            if (i10 < 0 || i10 >= RecyclerView.this.f10459y0.b()) {
                throw new IndexOutOfBoundsException("Invalid item position " + i10 + "(" + i10 + "). Item count:" + RecyclerView.this.f10459y0.b() + RecyclerView.this.Q());
            }
            if (RecyclerView.this.f10459y0.e()) {
                dCreateViewHolder = h(i10);
                if (dCreateViewHolder != null) {
                    z10 = true;
                }
                if (dCreateViewHolder == null && (dCreateViewHolder = m(i10, z9)) != null) {
                    if (L(dCreateViewHolder)) {
                        z10 = true;
                    } else {
                        if (!z9) {
                            dCreateViewHolder.addFlags(4);
                            if (dCreateViewHolder.isScrap()) {
                                RecyclerView.this.removeDetachedView(dCreateViewHolder.itemView, false);
                                dCreateViewHolder.unScrap();
                            } else if (dCreateViewHolder.wasReturnedFromScrap()) {
                                dCreateViewHolder.clearReturnedFromScrapFlag();
                            }
                            C(dCreateViewHolder);
                        }
                        dCreateViewHolder = null;
                    }
                }
                if (dCreateViewHolder == null) {
                    iM = RecyclerView.this.f10426d.m(i10);
                    if (iM >= 0 || iM >= RecyclerView.this.f10442l.getItemCount()) {
                        throw new IndexOutOfBoundsException("Inconsistency detected. Invalid item position " + i10 + "(offset:" + iM + ").state:" + RecyclerView.this.f10459y0.b() + RecyclerView.this.Q());
                    }
                    int itemViewType = RecyclerView.this.f10442l.getItemViewType(iM);
                    if (RecyclerView.this.f10442l.hasStableIds() && (dCreateViewHolder = l(RecyclerView.this.f10442l.getItemId(iM), itemViewType, z9)) != null) {
                        dCreateViewHolder.mPosition = iM;
                        z10 = true;
                    }
                    if (dCreateViewHolder == null) {
                        D dF = i().f(itemViewType);
                        if (dF != null) {
                            dF.resetInternal();
                            if (RecyclerView.f10378S0) {
                                r(dF);
                            }
                        }
                        dCreateViewHolder = dF;
                    }
                    if (dCreateViewHolder == null) {
                        long nanoTime = RecyclerView.this.getNanoTime();
                        if (j10 != Long.MAX_VALUE && !this.f10529g.l(itemViewType, nanoTime, j10)) {
                            return null;
                        }
                        RecyclerView recyclerView = RecyclerView.this;
                        dCreateViewHolder = recyclerView.f10442l.createViewHolder(recyclerView, itemViewType);
                        if (RecyclerView.f10381V0 && (recyclerViewW = RecyclerView.W(dCreateViewHolder.itemView)) != null) {
                            dCreateViewHolder.mNestedRecyclerView = new WeakReference<>(recyclerViewW);
                        }
                        this.f10529g.e(itemViewType, RecyclerView.this.getNanoTime() - nanoTime);
                    }
                }
                d10 = dCreateViewHolder;
                z11 = z10;
                if (z11 && !RecyclerView.this.f10459y0.e() && d10.hasAnyOfTheFlags(8192)) {
                    d10.setFlags(0, 8192);
                    if (RecyclerView.this.f10459y0.f10471k) {
                        int iE = m.e(d10) | CodedOutputStream.DEFAULT_BUFFER_SIZE;
                        RecyclerView recyclerView2 = RecyclerView.this;
                        RecyclerView.this.T0(d10, recyclerView2.f10433g0.t(recyclerView2.f10459y0, d10, iE, d10.getUnmodifiedPayloads()));
                    }
                }
                if (RecyclerView.this.f10459y0.e() || !d10.isBound()) {
                    if (d10.isBound() || d10.needsUpdate() || d10.isInvalid()) {
                        zH = H(d10, RecyclerView.this.f10426d.m(i10), i10, j10);
                    }
                    layoutParams = d10.itemView.getLayoutParams();
                    if (layoutParams == null) {
                        qVar = (q) RecyclerView.this.generateDefaultLayoutParams();
                        d10.itemView.setLayoutParams(qVar);
                    } else if (RecyclerView.this.checkLayoutParams(layoutParams)) {
                        qVar = (q) layoutParams;
                    } else {
                        qVar = (q) RecyclerView.this.generateLayoutParams(layoutParams);
                        d10.itemView.setLayoutParams(qVar);
                    }
                    qVar.f10513a = d10;
                    qVar.f10516d = !z11 && zH;
                    return d10;
                }
                d10.mPreLayoutPosition = i10;
                zH = false;
                layoutParams = d10.itemView.getLayoutParams();
                if (layoutParams == null) {
                    qVar = (q) RecyclerView.this.generateDefaultLayoutParams();
                    d10.itemView.setLayoutParams(qVar);
                } else if (RecyclerView.this.checkLayoutParams(layoutParams)) {
                    qVar = (q) RecyclerView.this.generateLayoutParams(layoutParams);
                    d10.itemView.setLayoutParams(qVar);
                } else {
                    qVar = (q) layoutParams;
                }
                qVar.f10513a = d10;
                qVar.f10516d = !z11 && zH;
                return d10;
            }
            dCreateViewHolder = null;
            z10 = false;
            if (dCreateViewHolder == null) {
                if (L(dCreateViewHolder)) {
                    if (!z9) {
                        dCreateViewHolder.addFlags(4);
                        if (dCreateViewHolder.isScrap()) {
                            RecyclerView.this.removeDetachedView(dCreateViewHolder.itemView, false);
                            dCreateViewHolder.unScrap();
                        } else if (dCreateViewHolder.wasReturnedFromScrap()) {
                            dCreateViewHolder.clearReturnedFromScrapFlag();
                        }
                        C(dCreateViewHolder);
                    }
                    dCreateViewHolder = null;
                } else {
                    z10 = true;
                }
            }
            if (dCreateViewHolder == null) {
                iM = RecyclerView.this.f10426d.m(i10);
                if (iM >= 0) {
                }
                throw new IndexOutOfBoundsException("Inconsistency detected. Invalid item position " + i10 + "(offset:" + iM + ").state:" + RecyclerView.this.f10459y0.b() + RecyclerView.this.Q());
            }
            d10 = dCreateViewHolder;
            z11 = z10;
            if (z11) {
                d10.setFlags(0, 8192);
                if (RecyclerView.this.f10459y0.f10471k) {
                    int iE2 = m.e(d10) | CodedOutputStream.DEFAULT_BUFFER_SIZE;
                    RecyclerView recyclerView3 = RecyclerView.this;
                    RecyclerView.this.T0(d10, recyclerView3.f10433g0.t(recyclerView3.f10459y0, d10, iE2, d10.getUnmodifiedPayloads()));
                }
            }
            if (RecyclerView.this.f10459y0.e()) {
                if (d10.isBound()) {
                }
                zH = H(d10, RecyclerView.this.f10426d.m(i10), i10, j10);
            } else {
                if (d10.isBound()) {
                }
                zH = H(d10, RecyclerView.this.f10426d.m(i10), i10, j10);
            }
            layoutParams = d10.itemView.getLayoutParams();
            if (layoutParams == null) {
                qVar = (q) RecyclerView.this.generateDefaultLayoutParams();
                d10.itemView.setLayoutParams(qVar);
            } else if (RecyclerView.this.checkLayoutParams(layoutParams)) {
                qVar = (q) RecyclerView.this.generateLayoutParams(layoutParams);
                d10.itemView.setLayoutParams(qVar);
            } else {
                qVar = (q) layoutParams;
            }
            qVar.f10513a = d10;
            qVar.f10516d = !z11 && zH;
            return d10;
        }

        void J(D d10) {
            if (d10.mInChangeScrap) {
                this.f10524b.remove(d10);
            } else {
                this.f10523a.remove(d10);
            }
            d10.mScrapContainer = null;
            d10.mInChangeScrap = false;
            d10.clearReturnedFromScrapFlag();
        }

        void K() {
            p pVar = RecyclerView.this.f10444m;
            this.f10528f = this.f10527e + (pVar != null ? pVar.mPrefetchMaxCountObserved : 0);
            for (int size = this.f10525c.size() - 1; size >= 0 && this.f10525c.size() > this.f10528f; size--) {
                A(size);
            }
        }

        boolean L(D d10) {
            if (d10.isRemoved()) {
                return RecyclerView.this.f10459y0.e();
            }
            int i10 = d10.mPosition;
            if (i10 >= 0 && i10 < RecyclerView.this.f10442l.getItemCount()) {
                if (RecyclerView.this.f10459y0.e() || RecyclerView.this.f10442l.getItemViewType(d10.mPosition) == d10.getItemViewType()) {
                    return !RecyclerView.this.f10442l.hasStableIds() || d10.getItemId() == RecyclerView.this.f10442l.getItemId(d10.mPosition);
                }
                return false;
            }
            throw new IndexOutOfBoundsException("Inconsistency detected. Invalid view holder adapter position" + d10 + RecyclerView.this.Q());
        }

        void M(int i10, int i11) {
            int i12;
            int i13 = i11 + i10;
            for (int size = this.f10525c.size() - 1; size >= 0; size--) {
                D d10 = (D) this.f10525c.get(size);
                if (d10 != null && (i12 = d10.mPosition) >= i10 && i12 < i13) {
                    d10.addFlags(2);
                    A(size);
                }
            }
        }

        void a(D d10, boolean z9) {
            RecyclerView.s(d10);
            View view = d10.itemView;
            androidx.recyclerview.widget.k kVar = RecyclerView.this.f10391F0;
            if (kVar != null) {
                C0840a c0840aN = kVar.n();
                AbstractC0845c0.m0(view, c0840aN instanceof androidx.recyclerview.widget.k.a ? ((androidx.recyclerview.widget.k.a) c0840aN).n(view) : null);
            }
            if (z9) {
                g(d10);
            }
            d10.mBindingAdapter = null;
            d10.mOwnerRecyclerView = null;
            i().i(d10);
        }

        public void c() {
            this.f10523a.clear();
            z();
        }

        void d() {
            int size = this.f10525c.size();
            for (int i10 = 0; i10 < size; i10++) {
                ((D) this.f10525c.get(i10)).clearOldPosition();
            }
            int size2 = this.f10523a.size();
            for (int i11 = 0; i11 < size2; i11++) {
                ((D) this.f10523a.get(i11)).clearOldPosition();
            }
            ArrayList arrayList = this.f10524b;
            if (arrayList != null) {
                int size3 = arrayList.size();
                for (int i12 = 0; i12 < size3; i12++) {
                    ((D) this.f10524b.get(i12)).clearOldPosition();
                }
            }
        }

        void e() {
            this.f10523a.clear();
            ArrayList arrayList = this.f10524b;
            if (arrayList != null) {
                arrayList.clear();
            }
        }

        public int f(int i10) {
            if (i10 >= 0 && i10 < RecyclerView.this.f10459y0.b()) {
                return !RecyclerView.this.f10459y0.e() ? i10 : RecyclerView.this.f10426d.m(i10);
            }
            throw new IndexOutOfBoundsException("invalid position " + i10 + ". State item count is " + RecyclerView.this.f10459y0.b() + RecyclerView.this.Q());
        }

        void g(D d10) {
            RecyclerView.this.getClass();
            if (RecyclerView.this.f10454v.size() > 0) {
                p070h.w.a(RecyclerView.this.f10454v.get(0));
                throw null;
            }
            h hVar = RecyclerView.this.f10442l;
            if (hVar != null) {
                hVar.onViewRecycled(d10);
            }
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.f10459y0 != null) {
                recyclerView.f10430f.q(d10);
            }
        }

        D h(int i10) {
            int size;
            int iM;
            ArrayList arrayList = this.f10524b;
            if (arrayList != null && (size = arrayList.size()) != 0) {
                for (int i11 = 0; i11 < size; i11++) {
                    D d10 = (D) this.f10524b.get(i11);
                    if (!d10.wasReturnedFromScrap() && d10.getLayoutPosition() == i10) {
                        d10.addFlags(32);
                        return d10;
                    }
                }
                if (RecyclerView.this.f10442l.hasStableIds() && (iM = RecyclerView.this.f10426d.m(i10)) > 0 && iM < RecyclerView.this.f10442l.getItemCount()) {
                    long itemId = RecyclerView.this.f10442l.getItemId(iM);
                    for (int i12 = 0; i12 < size; i12++) {
                        D d11 = (D) this.f10524b.get(i12);
                        if (!d11.wasReturnedFromScrap() && d11.getItemId() == itemId) {
                            d11.addFlags(32);
                            return d11;
                        }
                    }
                }
            }
            return null;
        }

        u i() {
            if (this.f10529g == null) {
                this.f10529g = new u();
            }
            return this.f10529g;
        }

        int j() {
            return this.f10523a.size();
        }

        public List k() {
            return this.f10526d;
        }

        D l(long j10, int i10, boolean z9) {
            for (int size = this.f10523a.size() - 1; size >= 0; size--) {
                D d10 = (D) this.f10523a.get(size);
                if (d10.getItemId() == j10 && !d10.wasReturnedFromScrap()) {
                    if (i10 == d10.getItemViewType()) {
                        d10.addFlags(32);
                        if (d10.isRemoved() && !RecyclerView.this.f10459y0.e()) {
                            d10.setFlags(2, 14);
                        }
                        return d10;
                    }
                    if (!z9) {
                        this.f10523a.remove(size);
                        RecyclerView.this.removeDetachedView(d10.itemView, false);
                        y(d10.itemView);
                    }
                }
            }
            int size2 = this.f10525c.size();
            while (true) {
                size2--;
                if (size2 < 0) {
                    return null;
                }
                D d11 = (D) this.f10525c.get(size2);
                if (d11.getItemId() == j10 && !d11.isAttachedToTransitionOverlay()) {
                    if (i10 == d11.getItemViewType()) {
                        if (!z9) {
                            this.f10525c.remove(size2);
                        }
                        return d11;
                    }
                    if (!z9) {
                        A(size2);
                        return null;
                    }
                }
            }
        }

        D m(int i10, boolean z9) {
            View viewE;
            int size = this.f10523a.size();
            for (int i11 = 0; i11 < size; i11++) {
                D d10 = (D) this.f10523a.get(i11);
                if (!d10.wasReturnedFromScrap() && d10.getLayoutPosition() == i10 && !d10.isInvalid() && (RecyclerView.this.f10459y0.f10468h || !d10.isRemoved())) {
                    d10.addFlags(32);
                    return d10;
                }
            }
            if (z9 || (viewE = RecyclerView.this.f10428e.e(i10)) == null) {
                int size2 = this.f10525c.size();
                for (int i12 = 0; i12 < size2; i12++) {
                    D d11 = (D) this.f10525c.get(i12);
                    if (!d11.isInvalid() && d11.getLayoutPosition() == i10 && !d11.isAttachedToTransitionOverlay()) {
                        if (!z9) {
                            this.f10525c.remove(i12);
                        }
                        return d11;
                    }
                }
                return null;
            }
            D dH0 = RecyclerView.h0(viewE);
            RecyclerView.this.f10428e.s(viewE);
            int iM = RecyclerView.this.f10428e.m(viewE);
            if (iM != -1) {
                RecyclerView.this.f10428e.d(iM);
                D(viewE);
                dH0.addFlags(8224);
                return dH0;
            }
            throw new IllegalStateException("layout index should not be -1 after unhiding a view:" + dH0 + RecyclerView.this.Q());
        }

        View n(int i10) {
            return ((D) this.f10523a.get(i10)).itemView;
        }

        public View o(int i10) {
            return p(i10, false);
        }

        View p(int i10, boolean z9) {
            return I(i10, z9, Long.MAX_VALUE).itemView;
        }

        void s() {
            int size = this.f10525c.size();
            for (int i10 = 0; i10 < size; i10++) {
                q qVar = (q) ((D) this.f10525c.get(i10)).itemView.getLayoutParams();
                if (qVar != null) {
                    qVar.f10515c = true;
                }
            }
        }

        void t() {
            int size = this.f10525c.size();
            for (int i10 = 0; i10 < size; i10++) {
                D d10 = (D) this.f10525c.get(i10);
                if (d10 != null) {
                    d10.addFlags(6);
                    d10.addChangePayload(null);
                }
            }
            h hVar = RecyclerView.this.f10442l;
            if (hVar == null || !hVar.hasStableIds()) {
                z();
            }
        }

        void u(int i10, int i11) {
            int size = this.f10525c.size();
            for (int i12 = 0; i12 < size; i12++) {
                D d10 = (D) this.f10525c.get(i12);
                if (d10 != null && d10.mPosition >= i10) {
                    d10.offsetPosition(i11, false);
                }
            }
        }

        void v(int i10, int i11) {
            int i12;
            int i13;
            int i14;
            int i15;
            if (i10 < i11) {
                i12 = -1;
                i14 = i10;
                i13 = i11;
            } else {
                i12 = 1;
                i13 = i10;
                i14 = i11;
            }
            int size = this.f10525c.size();
            for (int i16 = 0; i16 < size; i16++) {
                D d10 = (D) this.f10525c.get(i16);
                if (d10 != null && (i15 = d10.mPosition) >= i14 && i15 <= i13) {
                    if (i15 == i10) {
                        d10.offsetPosition(i11 - i10, false);
                    } else {
                        d10.offsetPosition(i12, false);
                    }
                }
            }
        }

        void w(int i10, int i11, boolean z9) {
            int i12 = i10 + i11;
            for (int size = this.f10525c.size() - 1; size >= 0; size--) {
                D d10 = (D) this.f10525c.get(size);
                if (d10 != null) {
                    int i13 = d10.mPosition;
                    if (i13 >= i12) {
                        d10.offsetPosition(-i11, z9);
                    } else if (i13 >= i10) {
                        d10.addFlags(8);
                        A(size);
                    }
                }
            }
        }

        void x(h hVar, h hVar2, boolean z9) {
            c();
            i().h(hVar, hVar2, z9);
        }

        void y(View view) {
            D dH0 = RecyclerView.h0(view);
            dH0.mScrapContainer = null;
            dH0.mInChangeScrap = false;
            dH0.clearReturnedFromScrapFlag();
            C(dH0);
        }

        void z() {
            for (int size = this.f10525c.size() - 1; size >= 0; size--) {
                A(size);
            }
            this.f10525c.clear();
            if (RecyclerView.f10381V0) {
                RecyclerView.this.f10458x0.b();
            }
        }
    }

    public interface w {
    }

    private class x extends j {
        x() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public void a() {
            RecyclerView.this.p(null);
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.f10459y0.f10467g = true;
            recyclerView.R0(true);
            if (RecyclerView.this.f10426d.p()) {
                return;
            }
            RecyclerView.this.requestLayout();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public void b(int i10, int i11, Object obj) {
            RecyclerView.this.p(null);
            if (RecyclerView.this.f10426d.r(i10, i11, obj)) {
                g();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public void c(int i10, int i11) {
            RecyclerView.this.p(null);
            if (RecyclerView.this.f10426d.s(i10, i11)) {
                g();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public void d(int i10, int i11, int i12) {
            RecyclerView.this.p(null);
            if (RecyclerView.this.f10426d.t(i10, i11, i12)) {
                g();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public void e(int i10, int i11) {
            RecyclerView.this.p(null);
            if (RecyclerView.this.f10426d.u(i10, i11)) {
                g();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public void f() {
            h hVar;
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.f10424c == null || (hVar = recyclerView.f10442l) == null || !hVar.canRestoreState()) {
                return;
            }
            RecyclerView.this.requestLayout();
        }

        void g() {
            if (RecyclerView.f10380U0) {
                RecyclerView recyclerView = RecyclerView.this;
                if (recyclerView.f10398J && recyclerView.f10396I) {
                    AbstractC0845c0.e0(recyclerView, recyclerView.f10434h);
                    return;
                }
            }
            RecyclerView recyclerView2 = RecyclerView.this;
            recyclerView2.f10414R = true;
            recyclerView2.requestLayout();
        }
    }

    public static abstract class z {
        private p mLayoutManager;
        private boolean mPendingInitialRun;
        private RecyclerView mRecyclerView;
        private boolean mRunning;
        private boolean mStarted;
        private View mTargetView;
        private int mTargetPosition = -1;
        private final a mRecyclingAction = new a(0, 0);

        public static class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private int f10533a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private int f10534b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private int f10535c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private int f10536d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private Interpolator f10537e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            private boolean f10538f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            private int f10539g;

            public a(int i10, int i11) {
                this(i10, i11, LinearLayoutManager.INVALID_OFFSET, null);
            }

            private void e() {
                if (this.f10537e != null && this.f10535c < 1) {
                    throw new IllegalStateException("If you provide an interpolator, you must set a positive duration");
                }
                if (this.f10535c < 1) {
                    throw new IllegalStateException("Scroll duration must be a positive number");
                }
            }

            boolean a() {
                return this.f10536d >= 0;
            }

            public void b(int i10) {
                this.f10536d = i10;
            }

            void c(RecyclerView recyclerView) {
                int i10 = this.f10536d;
                if (i10 >= 0) {
                    this.f10536d = -1;
                    recyclerView.x0(i10);
                    this.f10538f = false;
                } else {
                    if (!this.f10538f) {
                        this.f10539g = 0;
                        return;
                    }
                    e();
                    recyclerView.f10455v0.e(this.f10533a, this.f10534b, this.f10535c, this.f10537e);
                    int i11 = this.f10539g + 1;
                    this.f10539g = i11;
                    if (i11 > 10) {
                        Log.e("RecyclerView", "Smooth Scroll action is being updated too frequently. Make sure you are not changing it unless necessary");
                    }
                    this.f10538f = false;
                }
            }

            public void d(int i10, int i11, int i12, Interpolator interpolator) {
                this.f10533a = i10;
                this.f10534b = i11;
                this.f10535c = i12;
                this.f10537e = interpolator;
                this.f10538f = true;
            }

            public a(int i10, int i11, int i12, Interpolator interpolator) {
                this.f10536d = -1;
                this.f10538f = false;
                this.f10539g = 0;
                this.f10533a = i10;
                this.f10534b = i11;
                this.f10535c = i12;
                this.f10537e = interpolator;
            }
        }

        public interface b {
            PointF computeScrollVectorForPosition(int i10);
        }

        public PointF computeScrollVectorForPosition(int i10) {
            Object layoutManager = getLayoutManager();
            if (layoutManager instanceof b) {
                return ((b) layoutManager).computeScrollVectorForPosition(i10);
            }
            Log.w("RecyclerView", "You should override computeScrollVectorForPosition when the LayoutManager does not implement " + b.class.getCanonicalName());
            return null;
        }

        public View findViewByPosition(int i10) {
            return this.mRecyclerView.f10444m.findViewByPosition(i10);
        }

        public int getChildCount() {
            return this.mRecyclerView.f10444m.getChildCount();
        }

        public int getChildPosition(View view) {
            return this.mRecyclerView.f0(view);
        }

        public p getLayoutManager() {
            return this.mLayoutManager;
        }

        public int getTargetPosition() {
            return this.mTargetPosition;
        }

        @Deprecated
        public void instantScrollToPosition(int i10) {
            this.mRecyclerView.j1(i10);
        }

        public boolean isPendingInitialRun() {
            return this.mPendingInitialRun;
        }

        public boolean isRunning() {
            return this.mRunning;
        }

        protected void normalize(@NonNull PointF pointF) {
            float f10 = pointF.x;
            float f11 = pointF.y;
            float fSqrt = (float) Math.sqrt((f10 * f10) + (f11 * f11));
            pointF.x /= fSqrt;
            pointF.y /= fSqrt;
        }

        void onAnimation(int i10, int i11) {
            PointF pointFComputeScrollVectorForPosition;
            RecyclerView recyclerView = this.mRecyclerView;
            if (this.mTargetPosition == -1 || recyclerView == null) {
                stop();
            }
            if (this.mPendingInitialRun && this.mTargetView == null && this.mLayoutManager != null && (pointFComputeScrollVectorForPosition = computeScrollVectorForPosition(this.mTargetPosition)) != null) {
                float f10 = pointFComputeScrollVectorForPosition.x;
                if (f10 != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || pointFComputeScrollVectorForPosition.y != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                    recyclerView.i1((int) Math.signum(f10), (int) Math.signum(pointFComputeScrollVectorForPosition.y), null);
                }
            }
            this.mPendingInitialRun = false;
            View view = this.mTargetView;
            if (view != null) {
                if (getChildPosition(view) == this.mTargetPosition) {
                    onTargetFound(this.mTargetView, recyclerView.f10459y0, this.mRecyclingAction);
                    this.mRecyclingAction.c(recyclerView);
                    stop();
                } else {
                    Log.e("RecyclerView", "Passed over target position while smooth scrolling.");
                    this.mTargetView = null;
                }
            }
            if (this.mRunning) {
                onSeekTargetStep(i10, i11, recyclerView.f10459y0, this.mRecyclingAction);
                boolean zA = this.mRecyclingAction.a();
                this.mRecyclingAction.c(recyclerView);
                if (zA && this.mRunning) {
                    this.mPendingInitialRun = true;
                    recyclerView.f10455v0.d();
                }
            }
        }

        protected void onChildAttachedToWindow(View view) {
            if (getChildPosition(view) == getTargetPosition()) {
                this.mTargetView = view;
            }
        }

        protected abstract void onSeekTargetStep(int i10, int i11, A a10, a aVar);

        protected abstract void onStart();

        protected abstract void onStop();

        protected abstract void onTargetFound(View view, A a10, a aVar);

        public void setTargetPosition(int i10) {
            this.mTargetPosition = i10;
        }

        void start(RecyclerView recyclerView, p pVar) {
            recyclerView.f10455v0.f();
            if (this.mStarted) {
                Log.w("RecyclerView", "An instance of " + getClass().getSimpleName() + " was started more than once. Each instance of" + getClass().getSimpleName() + " is intended to only be used once. You should create a new instance for each use.");
            }
            this.mRecyclerView = recyclerView;
            this.mLayoutManager = pVar;
            int i10 = this.mTargetPosition;
            if (i10 == -1) {
                throw new IllegalArgumentException("Invalid target position");
            }
            recyclerView.f10459y0.f10461a = i10;
            this.mRunning = true;
            this.mPendingInitialRun = true;
            this.mTargetView = findViewByPosition(getTargetPosition());
            onStart();
            this.mRecyclerView.f10455v0.d();
            this.mStarted = true;
        }

        protected final void stop() {
            if (this.mRunning) {
                this.mRunning = false;
                onStop();
                this.mRecyclerView.f10459y0.f10461a = -1;
                this.mTargetView = null;
                this.mTargetPosition = -1;
                this.mPendingInitialRun = false;
                this.mLayoutManager.onSmoothScrollerStopped(this);
                this.mLayoutManager = null;
                this.mRecyclerView = null;
            }
        }
    }

    static {
        Class cls = Integer.TYPE;
        f10384Y0 = new Class[]{Context.class, AttributeSet.class, cls, cls};
        f10385Z0 = new InterpolatorC1181c();
    }

    public RecyclerView(Context context) {
        this(context, null);
    }

    private void A0(int i10, int i11, MotionEvent motionEvent, int i12) {
        p pVar = this.f10444m;
        if (pVar == null) {
            Log.e("RecyclerView", "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.f10408O) {
            return;
        }
        int[] iArr = this.f10401K0;
        iArr[0] = 0;
        iArr[1] = 0;
        boolean zCanScrollHorizontally = pVar.canScrollHorizontally();
        boolean zCanScrollVertically = this.f10444m.canScrollVertically();
        t1(zCanScrollVertically ? (zCanScrollHorizontally ? 1 : 0) | 2 : zCanScrollHorizontally ? 1 : 0, i12);
        if (G(zCanScrollHorizontally ? i10 : 0, zCanScrollVertically ? i11 : 0, this.f10401K0, this.f10397I0, i12)) {
            int[] iArr2 = this.f10401K0;
            i10 -= iArr2[0];
            i11 -= iArr2[1];
        }
        h1(zCanScrollHorizontally ? i10 : 0, zCanScrollVertically ? i11 : 0, motionEvent, i12);
        androidx.recyclerview.widget.e eVar = this.f10457w0;
        if (eVar != null && (i10 != 0 || i11 != 0)) {
            eVar.f(this, i10, i11);
        }
        v1(i12);
    }

    private void B() {
        int i10 = this.f10412Q;
        this.f10412Q = 0;
        if (i10 == 0 || !u0()) {
            return;
        }
        AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain();
        accessibilityEventObtain.setEventType(2048);
        AbstractC0920b.b(accessibilityEventObtain, i10);
        sendAccessibilityEventUnchecked(accessibilityEventObtain);
    }

    private void D() {
        this.f10459y0.a(1);
        R(this.f10459y0);
        this.f10459y0.f10470j = false;
        s1();
        this.f10430f.f();
        I0();
        Q0();
        f1();
        A a10 = this.f10459y0;
        a10.f10469i = a10.f10471k && this.f10388C0;
        this.f10388C0 = false;
        this.f10387B0 = false;
        a10.f10468h = a10.f10472l;
        a10.f10466f = this.f10442l.getItemCount();
        V(this.f10393G0);
        if (this.f10459y0.f10471k) {
            int iG = this.f10428e.g();
            for (int i10 = 0; i10 < iG; i10++) {
                D dH0 = h0(this.f10428e.f(i10));
                if (!dH0.shouldIgnore() && (!dH0.isInvalid() || this.f10442l.hasStableIds())) {
                    this.f10430f.e(dH0, this.f10433g0.t(this.f10459y0, dH0, m.e(dH0), dH0.getUnmodifiedPayloads()));
                    if (this.f10459y0.f10469i && dH0.isUpdated() && !dH0.isRemoved() && !dH0.shouldIgnore() && !dH0.isInvalid()) {
                        this.f10430f.c(d0(dH0), dH0);
                    }
                }
            }
        }
        if (this.f10459y0.f10472l) {
            g1();
            A a11 = this.f10459y0;
            boolean z9 = a11.f10467g;
            a11.f10467g = false;
            this.f10444m.onLayoutChildren(this.f10422b, a11);
            this.f10459y0.f10467g = z9;
            for (int i11 = 0; i11 < this.f10428e.g(); i11++) {
                D dH1 = h0(this.f10428e.f(i11));
                if (!dH1.shouldIgnore() && !this.f10430f.i(dH1)) {
                    int iE = m.e(dH1);
                    boolean zHasAnyOfTheFlags = dH1.hasAnyOfTheFlags(8192);
                    if (!zHasAnyOfTheFlags) {
                        iE |= CodedOutputStream.DEFAULT_BUFFER_SIZE;
                    }
                    m.b bVarT = this.f10433g0.t(this.f10459y0, dH1, iE, dH1.getUnmodifiedPayloads());
                    if (zHasAnyOfTheFlags) {
                        T0(dH1, bVarT);
                    } else {
                        this.f10430f.a(dH1, bVarT);
                    }
                }
            }
            t();
        } else {
            t();
        }
        J0();
        u1(false);
        this.f10459y0.f10465e = 2;
    }

    private void E() {
        s1();
        I0();
        this.f10459y0.a(6);
        this.f10426d.j();
        this.f10459y0.f10466f = this.f10442l.getItemCount();
        this.f10459y0.f10464d = 0;
        if (this.f10424c != null && this.f10442l.canRestoreState()) {
            Parcelable parcelable = this.f10424c.f10532c;
            if (parcelable != null) {
                this.f10444m.onRestoreInstanceState(parcelable);
            }
            this.f10424c = null;
        }
        A a10 = this.f10459y0;
        a10.f10468h = false;
        this.f10444m.onLayoutChildren(this.f10422b, a10);
        A a11 = this.f10459y0;
        a11.f10467g = false;
        a11.f10471k = a11.f10471k && this.f10433g0 != null;
        a11.f10465e = 4;
        J0();
        u1(false);
    }

    private void F() {
        RecyclerView recyclerView;
        this.f10459y0.a(4);
        s1();
        I0();
        A a10 = this.f10459y0;
        a10.f10465e = 1;
        if (a10.f10471k) {
            for (int iG = this.f10428e.g() - 1; iG >= 0; iG--) {
                D dH0 = h0(this.f10428e.f(iG));
                if (!dH0.shouldIgnore()) {
                    long jD0 = d0(dH0);
                    m.b bVarS = this.f10433g0.s(this.f10459y0, dH0);
                    D dG = this.f10430f.g(jD0);
                    if (dG == null || dG.shouldIgnore()) {
                        this.f10430f.d(dH0, bVarS);
                    } else {
                        boolean zH = this.f10430f.h(dG);
                        boolean zH2 = this.f10430f.h(dH0);
                        if (zH && dG == dH0) {
                            this.f10430f.d(dH0, bVarS);
                        } else {
                            m.b bVarN = this.f10430f.n(dG);
                            this.f10430f.d(dH0, bVarS);
                            m.b bVarM = this.f10430f.m(dH0);
                            if (bVarN == null) {
                                m0(jD0, dH0, dG);
                            } else {
                                m(dG, dH0, bVarN, bVarM, zH, zH2);
                            }
                        }
                    }
                }
            }
            recyclerView = this;
            recyclerView.f10430f.o(recyclerView.f10413Q0);
        } else {
            recyclerView = this;
        }
        recyclerView.f10444m.removeAndRecycleScrapInt(recyclerView.f10422b);
        A a11 = recyclerView.f10459y0;
        a11.f10463c = a11.f10466f;
        recyclerView.f10417U = false;
        recyclerView.f10418V = false;
        a11.f10471k = false;
        a11.f10472l = false;
        recyclerView.f10444m.mRequestedSimpleAnimations = false;
        ArrayList arrayList = recyclerView.f10422b.f10524b;
        if (arrayList != null) {
            arrayList.clear();
        }
        p pVar = recyclerView.f10444m;
        if (pVar.mPrefetchMaxObservedInInitialPrefetch) {
            pVar.mPrefetchMaxCountObserved = 0;
            pVar.mPrefetchMaxObservedInInitialPrefetch = false;
            recyclerView.f10422b.K();
        }
        recyclerView.f10444m.onLayoutCompleted(recyclerView.f10459y0);
        J0();
        u1(false);
        recyclerView.f10430f.f();
        int[] iArr = recyclerView.f10393G0;
        if (y(iArr[0], iArr[1])) {
            J(0, 0);
        }
        U0();
        d1();
    }

    private boolean L(MotionEvent motionEvent) {
        s sVar = this.f10394H;
        if (sVar == null) {
            if (motionEvent.getAction() == 0) {
                return false;
            }
            return U(motionEvent);
        }
        sVar.a(this, motionEvent);
        int action = motionEvent.getAction();
        if (action == 3 || action == 1) {
            this.f10394H = null;
        }
        return true;
    }

    private void L0(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f10437i0) {
            int i10 = actionIndex == 0 ? 1 : 0;
            this.f10437i0 = motionEvent.getPointerId(i10);
            int x10 = (int) (motionEvent.getX(i10) + 0.5f);
            this.f10445m0 = x10;
            this.f10441k0 = x10;
            int y9 = (int) (motionEvent.getY(i10) + 0.5f);
            this.f10446n0 = y9;
            this.f10443l0 = y9;
        }
    }

    private boolean P0() {
        return this.f10433g0 != null && this.f10444m.supportsPredictiveItemAnimations();
    }

    private void Q0() {
        boolean z9;
        if (this.f10417U) {
            this.f10426d.y();
            if (this.f10418V) {
                this.f10444m.onItemsChanged(this);
            }
        }
        if (P0()) {
            this.f10426d.w();
        } else {
            this.f10426d.j();
        }
        boolean z10 = this.f10387B0 || this.f10388C0;
        this.f10459y0.f10471k = this.f10402L && this.f10433g0 != null && ((z9 = this.f10417U) || z10 || this.f10444m.mRequestedSimpleAnimations) && (!z9 || this.f10442l.hasStableIds());
        A a10 = this.f10459y0;
        a10.f10472l = a10.f10471k && z10 && !this.f10417U && P0();
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0040  */
    /* JADX WARN: Code duplicated, block: B:13:0x0056  */
    /* JADX WARN: Code duplicated, block: B:15:0x005a  */
    /* JADX WARN: Code duplicated, block: B:16:0x0071  */
    private void S0(float f10, float f11, float f12, float f13) {
        boolean z9;
        boolean z10 = true;
        if (f11 >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            if (f11 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                O();
                androidx.core.widget.d.c(this.f10429e0, f11 / getWidth(), f12 / getHeight());
            } else {
                z9 = false;
            }
            if (f13 < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                P();
                androidx.core.widget.d.c(this.f10427d0, (-f13) / getHeight(), f10 / getWidth());
            } else if (f13 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                M();
                androidx.core.widget.d.c(this.f10431f0, f13 / getHeight(), 1.0f - (f10 / getWidth()));
            } else {
                z10 = z9;
            }
            if (z10 && f11 == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && f13 == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                return;
            }
            AbstractC0845c0.d0(this);
        }
        N();
        androidx.core.widget.d.c(this.f10425c0, (-f11) / getWidth(), 1.0f - (f12 / getHeight()));
        z9 = true;
        if (f13 < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            P();
            androidx.core.widget.d.c(this.f10427d0, (-f13) / getHeight(), f10 / getWidth());
        } else if (f13 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            M();
            androidx.core.widget.d.c(this.f10431f0, f13 / getHeight(), 1.0f - (f10 / getWidth()));
        } else {
            z10 = z9;
        }
        if (z10) {
        }
        AbstractC0845c0.d0(this);
    }

    private boolean U(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        int size = this.f10392G.size();
        for (int i10 = 0; i10 < size; i10++) {
            s sVar = (s) this.f10392G.get(i10);
            if (sVar.b(this, motionEvent) && action != 3) {
                this.f10394H = sVar;
                return true;
            }
        }
        return false;
    }

    private void U0() {
        View viewFindViewById;
        if (!this.f10453u0 || this.f10442l == null || !hasFocus() || getDescendantFocusability() == 393216) {
            return;
        }
        if (getDescendantFocusability() == 131072 && isFocused()) {
            return;
        }
        if (!isFocused()) {
            View focusedChild = getFocusedChild();
            if (!f10383X0 || (focusedChild.getParent() != null && focusedChild.hasFocus())) {
                if (!this.f10428e.n(focusedChild)) {
                    return;
                }
            } else if (this.f10428e.g() == 0) {
                requestFocus();
                return;
            }
        }
        View viewX = null;
        D dZ = (this.f10459y0.f10474n == -1 || !this.f10442l.hasStableIds()) ? null : Z(this.f10459y0.f10474n);
        if (dZ != null && !this.f10428e.n(dZ.itemView) && dZ.itemView.hasFocusable()) {
            viewX = dZ.itemView;
        } else if (this.f10428e.g() > 0) {
            viewX = X();
        }
        if (viewX != null) {
            int i10 = this.f10459y0.f10475o;
            if (i10 != -1 && (viewFindViewById = viewX.findViewById(i10)) != null && viewFindViewById.isFocusable()) {
                viewX = viewFindViewById;
            }
            viewX.requestFocus();
        }
    }

    private void V(int[] iArr) {
        int iG = this.f10428e.g();
        if (iG == 0) {
            iArr[0] = -1;
            iArr[1] = -1;
            return;
        }
        int i10 = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        int i11 = LinearLayoutManager.INVALID_OFFSET;
        for (int i12 = 0; i12 < iG; i12++) {
            D dH0 = h0(this.f10428e.f(i12));
            if (!dH0.shouldIgnore()) {
                int layoutPosition = dH0.getLayoutPosition();
                if (layoutPosition < i10) {
                    i10 = layoutPosition;
                }
                if (layoutPosition > i11) {
                    i11 = layoutPosition;
                }
            }
        }
        iArr[0] = i10;
        iArr[1] = i11;
    }

    private void V0() {
        boolean zIsFinished;
        EdgeEffect edgeEffect = this.f10425c0;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            zIsFinished = this.f10425c0.isFinished();
        } else {
            zIsFinished = false;
        }
        EdgeEffect edgeEffect2 = this.f10427d0;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            zIsFinished |= this.f10427d0.isFinished();
        }
        EdgeEffect edgeEffect3 = this.f10429e0;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            zIsFinished |= this.f10429e0.isFinished();
        }
        EdgeEffect edgeEffect4 = this.f10431f0;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            zIsFinished |= this.f10431f0.isFinished();
        }
        if (zIsFinished) {
            AbstractC0845c0.d0(this);
        }
    }

    static RecyclerView W(View view) {
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        if (view instanceof RecyclerView) {
            return (RecyclerView) view;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            RecyclerView recyclerViewW = W(viewGroup.getChildAt(i10));
            if (recyclerViewW != null) {
                return recyclerViewW;
            }
        }
        return null;
    }

    private View X() {
        D dY;
        A a10 = this.f10459y0;
        int i10 = a10.f10473m;
        if (i10 == -1) {
            i10 = 0;
        }
        int iB = a10.b();
        for (int i11 = i10; i11 < iB; i11++) {
            D dY2 = Y(i11);
            if (dY2 == null) {
                break;
            }
            if (dY2.itemView.hasFocusable()) {
                return dY2.itemView;
            }
        }
        int iMin = Math.min(iB, i10);
        do {
            iMin--;
            if (iMin < 0 || (dY = Y(iMin)) == null) {
                return null;
            }
        } while (!dY.itemView.hasFocusable());
        return dY.itemView;
    }

    private void c1(View view, View view2) {
        View view3 = view2 != null ? view2 : view;
        this.f10436i.set(0, 0, view3.getWidth(), view3.getHeight());
        ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
        if (layoutParams instanceof q) {
            q qVar = (q) layoutParams;
            if (!qVar.f10515c) {
                Rect rect = qVar.f10514b;
                Rect rect2 = this.f10436i;
                rect2.left -= rect.left;
                rect2.right += rect.right;
                rect2.top -= rect.top;
                rect2.bottom += rect.bottom;
            }
        }
        if (view2 != null) {
            offsetDescendantRectToMyCoords(view2, this.f10436i);
            offsetRectIntoDescendantCoords(view, this.f10436i);
        }
        this.f10444m.requestChildRectangleOnScreen(this, view, this.f10436i, !this.f10402L, view2 == null);
    }

    private void d1() {
        A a10 = this.f10459y0;
        a10.f10474n = -1L;
        a10.f10473m = -1;
        a10.f10475o = -1;
    }

    private void e1() {
        VelocityTracker velocityTracker = this.f10439j0;
        if (velocityTracker != null) {
            velocityTracker.clear();
        }
        v1(0);
        V0();
    }

    private void f1() {
        int absoluteAdapterPosition;
        View focusedChild = (this.f10453u0 && hasFocus() && this.f10442l != null) ? getFocusedChild() : null;
        D dT = focusedChild != null ? T(focusedChild) : null;
        if (dT == null) {
            d1();
            return;
        }
        this.f10459y0.f10474n = this.f10442l.hasStableIds() ? dT.getItemId() : -1L;
        A a10 = this.f10459y0;
        if (this.f10417U) {
            absoluteAdapterPosition = -1;
        } else {
            absoluteAdapterPosition = dT.isRemoved() ? dT.mOldPosition : dT.getAbsoluteAdapterPosition();
        }
        a10.f10473m = absoluteAdapterPosition;
        this.f10459y0.f10475o = j0(dT.itemView);
    }

    private void g(D d10) {
        View view = d10.itemView;
        boolean z9 = view.getParent() == this;
        this.f10422b.J(g0(view));
        if (d10.isTmpDetached()) {
            this.f10428e.c(view, -1, view.getLayoutParams(), true);
        } else if (z9) {
            this.f10428e.k(view);
        } else {
            this.f10428e.b(view, true);
        }
    }

    private F getScrollingChildHelper() {
        if (this.f10395H0 == null) {
            this.f10395H0 = new F(this);
        }
        return this.f10395H0;
    }

    static D h0(View view) {
        if (view == null) {
            return null;
        }
        return ((q) view.getLayoutParams()).f10513a;
    }

    static void i0(View view, Rect rect) {
        q qVar = (q) view.getLayoutParams();
        Rect rect2 = qVar.f10514b;
        rect.set((view.getLeft() - rect2.left) - ((ViewGroup.MarginLayoutParams) qVar).leftMargin, (view.getTop() - rect2.top) - ((ViewGroup.MarginLayoutParams) qVar).topMargin, view.getRight() + rect2.right + ((ViewGroup.MarginLayoutParams) qVar).rightMargin, view.getBottom() + rect2.bottom + ((ViewGroup.MarginLayoutParams) qVar).bottomMargin);
    }

    private int j0(View view) {
        int id = view.getId();
        while (!view.isFocused() && (view instanceof ViewGroup) && view.hasFocus()) {
            view = ((ViewGroup) view).getFocusedChild();
            if (view.getId() != -1) {
                id = view.getId();
            }
        }
        return id;
    }

    private String k0(Context context, String str) {
        if (str.charAt(0) == '.') {
            return context.getPackageName() + str;
        }
        if (str.contains(".")) {
            return str;
        }
        return RecyclerView.class.getPackage().getName() + '.' + str;
    }

    private void k1(h hVar, boolean z9, boolean z10) {
        h hVar2 = this.f10442l;
        if (hVar2 != null) {
            hVar2.unregisterAdapterDataObserver(this.f10420a);
            this.f10442l.onDetachedFromRecyclerView(this);
        }
        if (!z9 || z10) {
            W0();
        }
        this.f10426d.y();
        h hVar3 = this.f10442l;
        this.f10442l = hVar;
        if (hVar != null) {
            hVar.registerAdapterDataObserver(this.f10420a);
            hVar.onAttachedToRecyclerView(this);
        }
        p pVar = this.f10444m;
        if (pVar != null) {
            pVar.onAdapterChanged(hVar3, this.f10442l);
        }
        this.f10422b.x(hVar3, this.f10442l, z9);
        this.f10459y0.f10467g = true;
    }

    private void m(D d10, D d11, m.b bVar, m.b bVar2, boolean z9, boolean z10) {
        d10.setIsRecyclable(false);
        if (z9) {
            g(d10);
        }
        if (d10 != d11) {
            if (z10) {
                g(d11);
            }
            d10.mShadowedHolder = d11;
            g(d10);
            this.f10422b.J(d10);
            d11.setIsRecyclable(false);
            d11.mShadowingHolder = d10;
        }
        if (this.f10433g0.b(d10, d11, bVar, bVar2)) {
            O0();
        }
    }

    private void m0(long j10, D d10, D d11) {
        int iG = this.f10428e.g();
        for (int i10 = 0; i10 < iG; i10++) {
            D dH0 = h0(this.f10428e.f(i10));
            if (dH0 != d10 && d0(dH0) == j10) {
                h hVar = this.f10442l;
                if (hVar == null || !hVar.hasStableIds()) {
                    throw new IllegalStateException("Two different ViewHolders have the same change ID. This might happen due to inconsistent Adapter update events or if the LayoutManager lays out the same View multiple times.\n ViewHolder 1:" + dH0 + " \n View Holder 2:" + d10 + Q());
                }
                throw new IllegalStateException("Two different ViewHolders have the same stable ID. Stable IDs in your adapter MUST BE unique and SHOULD NOT change.\n ViewHolder 1:" + dH0 + " \n View Holder 2:" + d10 + Q());
            }
        }
        Log.e("RecyclerView", "Problem while matching changed view holders with the newones. The pre-layout information for the change holder " + d11 + " cannot be found but it is necessary for " + d10 + Q());
    }

    private boolean o0() {
        int iG = this.f10428e.g();
        for (int i10 = 0; i10 < iG; i10++) {
            D dH0 = h0(this.f10428e.f(i10));
            if (dH0 != null && !dH0.shouldIgnore() && dH0.isUpdated()) {
                return true;
            }
        }
        return false;
    }

    private void q0() {
        if (AbstractC0845c0.y(this) == 0) {
            AbstractC0845c0.x0(this, 8);
        }
    }

    private void r() {
        e1();
        setScrollState(0);
    }

    private void r0() {
        this.f10428e = new b(new e());
    }

    static void s(D d10) {
        WeakReference<RecyclerView> weakReference = d10.mNestedRecyclerView;
        if (weakReference != null) {
            RecyclerView recyclerView = weakReference.get();
            while (recyclerView != null) {
                if (recyclerView == d10.itemView) {
                    return;
                }
                Object parent = recyclerView.getParent();
                recyclerView = parent instanceof View ? (View) parent : null;
            }
            d10.mNestedRecyclerView = null;
        }
    }

    private void w(Context context, String str, AttributeSet attributeSet, int i10, int i11) {
        Object[] objArr;
        Constructor constructor;
        if (str != null) {
            String strTrim = str.trim();
            if (strTrim.isEmpty()) {
                return;
            }
            String strK0 = k0(context, strTrim);
            try {
                Class<? extends U> clsAsSubclass = Class.forName(strK0, false, isInEditMode() ? getClass().getClassLoader() : context.getClassLoader()).asSubclass(p.class);
                try {
                    constructor = clsAsSubclass.getConstructor(f10384Y0);
                    objArr = new Object[]{context, attributeSet, Integer.valueOf(i10), Integer.valueOf(i11)};
                } catch (NoSuchMethodException e10) {
                    objArr = null;
                    try {
                        constructor = clsAsSubclass.getConstructor(null);
                    } catch (NoSuchMethodException e11) {
                        e11.initCause(e10);
                        throw new IllegalStateException(attributeSet.getPositionDescription() + ": Error creating LayoutManager " + strK0, e11);
                    }
                }
                constructor.setAccessible(true);
                setLayoutManager((p) constructor.newInstance(objArr));
            } catch (ClassCastException e12) {
                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Class is not a LayoutManager " + strK0, e12);
            } catch (ClassNotFoundException e13) {
                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Unable to find LayoutManager " + strK0, e13);
            } catch (IllegalAccessException e14) {
                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Cannot access non-public constructor " + strK0, e14);
            } catch (InstantiationException e15) {
                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + strK0, e15);
            } catch (InvocationTargetException e16) {
                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + strK0, e16);
            }
        }
    }

    private boolean w0(View view, View view2, int i10) {
        int i11;
        if (view2 == null || view2 == this || view2 == view || S(view2) == null) {
            return false;
        }
        if (view == null || S(view) == null) {
            return true;
        }
        this.f10436i.set(0, 0, view.getWidth(), view.getHeight());
        this.f10438j.set(0, 0, view2.getWidth(), view2.getHeight());
        offsetDescendantRectToMyCoords(view, this.f10436i);
        offsetDescendantRectToMyCoords(view2, this.f10438j);
        byte b10 = -1;
        int i12 = this.f10444m.getLayoutDirection() == 1 ? -1 : 1;
        Rect rect = this.f10436i;
        int i13 = rect.left;
        Rect rect2 = this.f10438j;
        int i14 = rect2.left;
        if ((i13 < i14 || rect.right <= i14) && rect.right < rect2.right) {
            i11 = 1;
        } else {
            int i15 = rect.right;
            int i16 = rect2.right;
            i11 = ((i15 > i16 || i13 >= i16) && i13 > i14) ? -1 : 0;
        }
        int i17 = rect.top;
        int i18 = rect2.top;
        if ((i17 < i18 || rect.bottom <= i18) && rect.bottom < rect2.bottom) {
            b10 = 1;
        } else {
            int i19 = rect.bottom;
            int i20 = rect2.bottom;
            if ((i19 <= i20 && i17 < i20) || i17 <= i18) {
                b10 = 0;
            }
        }
        if (i10 == 1) {
            return b10 < 0 || (b10 == 0 && i11 * i12 < 0);
        }
        if (i10 == 2) {
            return b10 > 0 || (b10 == 0 && i11 * i12 > 0);
        }
        if (i10 == 17) {
            return i11 < 0;
        }
        if (i10 == 33) {
            return b10 < 0;
        }
        if (i10 == 66) {
            return i11 > 0;
        }
        if (i10 == 130) {
            return b10 > 0;
        }
        throw new IllegalArgumentException("Invalid direction: " + i10 + Q());
    }

    private void x1() {
        this.f10455v0.f();
        p pVar = this.f10444m;
        if (pVar != null) {
            pVar.stopSmoothScroller();
        }
    }

    private boolean y(int i10, int i11) {
        V(this.f10393G0);
        int[] iArr = this.f10393G0;
        return (iArr[0] == i10 && iArr[1] == i11) ? false : true;
    }

    void A(View view) {
        int size;
        D dH0 = h0(view);
        H0(view);
        h hVar = this.f10442l;
        if (hVar != null && dH0 != null) {
            hVar.onViewDetachedFromWindow(dH0);
        }
        List list = this.f10416T;
        if (list == null || (size = list.size() - 1) < 0) {
            return;
        }
        p070h.w.a(this.f10416T.get(size));
        throw null;
    }

    public void B0(int i10) {
        int iG = this.f10428e.g();
        for (int i11 = 0; i11 < iG; i11++) {
            this.f10428e.f(i11).offsetLeftAndRight(i10);
        }
    }

    void C() {
        if (this.f10442l == null) {
            Log.w("RecyclerView", "No adapter attached; skipping layout");
            return;
        }
        if (this.f10444m == null) {
            Log.e("RecyclerView", "No layout manager attached; skipping layout");
            return;
        }
        this.f10459y0.f10470j = false;
        boolean z9 = this.f10407N0 && !(this.f10409O0 == getWidth() && this.f10411P0 == getHeight());
        this.f10409O0 = 0;
        this.f10411P0 = 0;
        this.f10407N0 = false;
        if (this.f10459y0.f10465e == 1) {
            D();
            this.f10444m.setExactMeasureSpecsFrom(this);
            E();
        } else if (this.f10426d.q() || z9 || this.f10444m.getWidth() != getWidth() || this.f10444m.getHeight() != getHeight()) {
            this.f10444m.setExactMeasureSpecsFrom(this);
            E();
        } else {
            this.f10444m.setExactMeasureSpecsFrom(this);
        }
        F();
    }

    public void C0(int i10) {
        int iG = this.f10428e.g();
        for (int i11 = 0; i11 < iG; i11++) {
            this.f10428e.f(i11).offsetTopAndBottom(i10);
        }
    }

    void D0(int i10, int i11) {
        int iJ = this.f10428e.j();
        for (int i12 = 0; i12 < iJ; i12++) {
            D dH0 = h0(this.f10428e.i(i12));
            if (dH0 != null && !dH0.shouldIgnore() && dH0.mPosition >= i10) {
                dH0.offsetPosition(i11, false);
                this.f10459y0.f10467g = true;
            }
        }
        this.f10422b.u(i10, i11);
        requestLayout();
    }

    void E0(int i10, int i11) {
        int i12;
        int i13;
        int i14;
        int i15;
        int iJ = this.f10428e.j();
        if (i10 < i11) {
            i14 = -1;
            i13 = i10;
            i12 = i11;
        } else {
            i12 = i10;
            i13 = i11;
            i14 = 1;
        }
        for (int i16 = 0; i16 < iJ; i16++) {
            D dH0 = h0(this.f10428e.i(i16));
            if (dH0 != null && (i15 = dH0.mPosition) >= i13 && i15 <= i12) {
                if (i15 == i10) {
                    dH0.offsetPosition(i11 - i10, false);
                } else {
                    dH0.offsetPosition(i14, false);
                }
                this.f10459y0.f10467g = true;
            }
        }
        this.f10422b.v(i10, i11);
        requestLayout();
    }

    void F0(int i10, int i11, boolean z9) {
        int i12 = i10 + i11;
        int iJ = this.f10428e.j();
        for (int i13 = 0; i13 < iJ; i13++) {
            D dH0 = h0(this.f10428e.i(i13));
            if (dH0 != null && !dH0.shouldIgnore()) {
                int i14 = dH0.mPosition;
                if (i14 >= i12) {
                    dH0.offsetPosition(-i11, z9);
                    this.f10459y0.f10467g = true;
                } else if (i14 >= i10) {
                    dH0.flagRemovedAndOffsetPosition(i10 - 1, -i11, z9);
                    this.f10459y0.f10467g = true;
                }
            }
        }
        this.f10422b.w(i10, i11, z9);
        requestLayout();
    }

    public boolean G(int i10, int i11, int[] iArr, int[] iArr2, int i12) {
        return getScrollingChildHelper().d(i10, i11, iArr, iArr2, i12);
    }

    public void G0(View view) {
    }

    public final void H(int i10, int i11, int i12, int i13, int[] iArr, int i14, int[] iArr2) {
        getScrollingChildHelper().e(i10, i11, i12, i13, iArr, i14, iArr2);
    }

    public void H0(View view) {
    }

    void I(int i10) {
        p pVar = this.f10444m;
        if (pVar != null) {
            pVar.onScrollStateChanged(i10);
        }
        M0(i10);
        t tVar = this.f10460z0;
        if (tVar != null) {
            tVar.onScrollStateChanged(this, i10);
        }
        List list = this.f10386A0;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                ((t) this.f10386A0.get(size)).onScrollStateChanged(this, i10);
            }
        }
    }

    void I0() {
        this.f10419W++;
    }

    void J(int i10, int i11) {
        this.f10421a0++;
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        onScrollChanged(scrollX, scrollY, scrollX - i10, scrollY - i11);
        N0(i10, i11);
        t tVar = this.f10460z0;
        if (tVar != null) {
            tVar.onScrolled(this, i10, i11);
        }
        List list = this.f10386A0;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                ((t) this.f10386A0.get(size)).onScrolled(this, i10, i11);
            }
        }
        this.f10421a0--;
    }

    void J0() {
        K0(true);
    }

    void K() {
        int i10;
        for (int size = this.f10403L0.size() - 1; size >= 0; size--) {
            D d10 = (D) this.f10403L0.get(size);
            if (d10.itemView.getParent() == this && !d10.shouldIgnore() && (i10 = d10.mPendingAccessibilityState) != -1) {
                AbstractC0845c0.v0(d10.itemView, i10);
                d10.mPendingAccessibilityState = -1;
            }
        }
        this.f10403L0.clear();
    }

    void K0(boolean z9) {
        int i10 = this.f10419W - 1;
        this.f10419W = i10;
        if (i10 < 1) {
            this.f10419W = 0;
            if (z9) {
                B();
                K();
            }
        }
    }

    void M() {
        if (this.f10431f0 != null) {
            return;
        }
        EdgeEffect edgeEffectA = this.f10423b0.a(this, 3);
        this.f10431f0 = edgeEffectA;
        if (this.f10432g) {
            edgeEffectA.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            edgeEffectA.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void M0(int i10) {
    }

    void N() {
        if (this.f10425c0 != null) {
            return;
        }
        EdgeEffect edgeEffectA = this.f10423b0.a(this, 0);
        this.f10425c0 = edgeEffectA;
        if (this.f10432g) {
            edgeEffectA.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            edgeEffectA.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    public void N0(int i10, int i11) {
    }

    void O() {
        if (this.f10429e0 != null) {
            return;
        }
        EdgeEffect edgeEffectA = this.f10423b0.a(this, 2);
        this.f10429e0 = edgeEffectA;
        if (this.f10432g) {
            edgeEffectA.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            edgeEffectA.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    void O0() {
        if (this.f10390E0 || !this.f10396I) {
            return;
        }
        AbstractC0845c0.e0(this, this.f10405M0);
        this.f10390E0 = true;
    }

    void P() {
        if (this.f10427d0 != null) {
            return;
        }
        EdgeEffect edgeEffectA = this.f10423b0.a(this, 1);
        this.f10427d0 = edgeEffectA;
        if (this.f10432g) {
            edgeEffectA.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            edgeEffectA.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    String Q() {
        return " " + super.toString() + ", adapter:" + this.f10442l + ", layout:" + this.f10444m + ", context:" + getContext();
    }

    final void R(A a10) {
        if (getScrollState() != 2) {
            a10.f10476p = 0;
            a10.f10477q = 0;
        } else {
            OverScroller overScroller = this.f10455v0.f10480c;
            a10.f10476p = overScroller.getFinalX() - overScroller.getCurrX();
            a10.f10477q = overScroller.getFinalY() - overScroller.getCurrY();
        }
    }

    void R0(boolean z9) {
        this.f10418V = z9 | this.f10418V;
        this.f10417U = true;
        z0();
    }

    public View S(View view) {
        ViewParent parent = view.getParent();
        while (parent != null && parent != this && (parent instanceof View)) {
            view = parent;
            parent = view.getParent();
        }
        if (parent == this) {
            return view;
        }
        return null;
    }

    public D T(View view) {
        View viewS = S(view);
        if (viewS == null) {
            return null;
        }
        return g0(viewS);
    }

    void T0(D d10, m.b bVar) {
        d10.setFlags(0, 8192);
        if (this.f10459y0.f10469i && d10.isUpdated() && !d10.isRemoved() && !d10.shouldIgnore()) {
            this.f10430f.c(d0(d10), d10);
        }
        this.f10430f.e(d10, bVar);
    }

    void W0() {
        m mVar = this.f10433g0;
        if (mVar != null) {
            mVar.k();
        }
        p pVar = this.f10444m;
        if (pVar != null) {
            pVar.removeAndRecycleAllViews(this.f10422b);
            this.f10444m.removeAndRecycleScrapInt(this.f10422b);
        }
        this.f10422b.c();
    }

    boolean X0(View view) {
        s1();
        boolean zR = this.f10428e.r(view);
        if (zR) {
            D dH0 = h0(view);
            this.f10422b.J(dH0);
            this.f10422b.C(dH0);
        }
        u1(!zR);
        return zR;
    }

    public D Y(int i10) {
        D d10 = null;
        if (this.f10417U) {
            return null;
        }
        int iJ = this.f10428e.j();
        for (int i11 = 0; i11 < iJ; i11++) {
            D dH0 = h0(this.f10428e.i(i11));
            if (dH0 != null && !dH0.isRemoved() && c0(dH0) == i10) {
                if (!this.f10428e.n(dH0.itemView)) {
                    return dH0;
                }
                d10 = dH0;
            }
        }
        return d10;
    }

    public void Y0(o oVar) {
        p pVar = this.f10444m;
        if (pVar != null) {
            pVar.assertNotInLayoutOrScroll("Cannot remove item decoration during a scroll  or layout");
        }
        this.f10456w.remove(oVar);
        if (this.f10456w.isEmpty()) {
            setWillNotDraw(getOverScrollMode() == 2);
        }
        y0();
        requestLayout();
    }

    public D Z(long j10) {
        h hVar = this.f10442l;
        D d10 = null;
        if (hVar != null && hVar.hasStableIds()) {
            int iJ = this.f10428e.j();
            for (int i10 = 0; i10 < iJ; i10++) {
                D dH0 = h0(this.f10428e.i(i10));
                if (dH0 != null && !dH0.isRemoved() && dH0.getItemId() == j10) {
                    if (!this.f10428e.n(dH0.itemView)) {
                        return dH0;
                    }
                    d10 = dH0;
                }
            }
        }
        return d10;
    }

    public void Z0(s sVar) {
        this.f10392G.remove(sVar);
        if (this.f10394H == sVar) {
            this.f10394H = null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:15:0x002a  */
    /* JADX WARN: Code duplicated, block: B:17:0x0034  */
    /* JADX WARN: Code duplicated, block: B:22:0x0036 A[SYNTHETIC] */
    D a0(int i10, boolean z9) {
        int iJ = this.f10428e.j();
        D d10 = null;
        for (int i11 = 0; i11 < iJ; i11++) {
            D dH0 = h0(this.f10428e.i(i11));
            if (dH0 != null && !dH0.isRemoved()) {
                if (z9) {
                    if (dH0.mPosition != i10) {
                        continue;
                    } else {
                        if (this.f10428e.n(dH0.itemView)) {
                            return dH0;
                        }
                        d10 = dH0;
                    }
                } else if (dH0.getLayoutPosition() != i10) {
                    continue;
                } else {
                    if (this.f10428e.n(dH0.itemView)) {
                        return dH0;
                    }
                    d10 = dH0;
                }
            }
        }
        return d10;
    }

    public void a1(t tVar) {
        List list = this.f10386A0;
        if (list != null) {
            list.remove(tVar);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addFocusables(ArrayList arrayList, int i10, int i11) {
        p pVar = this.f10444m;
        if (pVar == null || !pVar.onAddFocusables(this, arrayList, i10, i11)) {
            super.addFocusables(arrayList, i10, i11);
        }
    }

    void b(int i10, int i11) {
        if (i10 < 0) {
            N();
            if (this.f10425c0.isFinished()) {
                this.f10425c0.onAbsorb(-i10);
            }
        } else if (i10 > 0) {
            O();
            if (this.f10429e0.isFinished()) {
                this.f10429e0.onAbsorb(i10);
            }
        }
        if (i11 < 0) {
            P();
            if (this.f10427d0.isFinished()) {
                this.f10427d0.onAbsorb(-i11);
            }
        } else if (i11 > 0) {
            M();
            if (this.f10431f0.isFinished()) {
                this.f10431f0.onAbsorb(i11);
            }
        }
        if (i10 == 0 && i11 == 0) {
            return;
        }
        AbstractC0845c0.d0(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6 */
    public boolean b0(int i10, int i11) {
        p pVar = this.f10444m;
        if (pVar == null) {
            Log.e("RecyclerView", "Cannot fling without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return false;
        }
        if (this.f10408O) {
            return false;
        }
        int iCanScrollHorizontally = pVar.canScrollHorizontally();
        boolean zCanScrollVertically = this.f10444m.canScrollVertically();
        if (iCanScrollHorizontally == 0 || Math.abs(i10) < this.f10449q0) {
            i10 = 0;
        }
        if (!zCanScrollVertically || Math.abs(i11) < this.f10449q0) {
            i11 = 0;
        }
        if (i10 == 0 && i11 == 0) {
            return false;
        }
        float f10 = i10;
        float f11 = i11;
        if (!dispatchNestedPreFling(f10, f11)) {
            boolean z9 = iCanScrollHorizontally != 0 || zCanScrollVertically;
            dispatchNestedFling(f10, f11, z9);
            r rVar = this.f10448p0;
            if (rVar != null && rVar.onFling(i10, i11)) {
                return true;
            }
            if (z9) {
                if (zCanScrollVertically) {
                    iCanScrollHorizontally = (iCanScrollHorizontally == true ? 1 : 0) | 2;
                }
                t1(iCanScrollHorizontally, 1);
                int i12 = this.f10450r0;
                int iMax = Math.max(-i12, Math.min(i10, i12));
                int i13 = this.f10450r0;
                this.f10455v0.b(iMax, Math.max(-i13, Math.min(i11, i13)));
                return true;
            }
        }
        return false;
    }

    void b1() {
        D d10;
        int iG = this.f10428e.g();
        for (int i10 = 0; i10 < iG; i10++) {
            View viewF = this.f10428e.f(i10);
            D dG0 = g0(viewF);
            if (dG0 != null && (d10 = dG0.mShadowingHolder) != null) {
                View view = d10.itemView;
                int left = viewF.getLeft();
                int top = viewF.getTop();
                if (left != view.getLeft() || top != view.getTop()) {
                    view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
                }
            }
        }
    }

    int c0(D d10) {
        if (d10.hasAnyOfTheFlags(524) || !d10.isBound()) {
            return -1;
        }
        return this.f10426d.e(d10.mPosition);
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof q) && this.f10444m.checkLayoutParams((q) layoutParams);
    }

    @Override // android.view.View
    public int computeHorizontalScrollExtent() {
        p pVar = this.f10444m;
        if (pVar != null && pVar.canScrollHorizontally()) {
            return this.f10444m.computeHorizontalScrollExtent(this.f10459y0);
        }
        return 0;
    }

    @Override // android.view.View
    public int computeHorizontalScrollOffset() {
        p pVar = this.f10444m;
        if (pVar != null && pVar.canScrollHorizontally()) {
            return this.f10444m.computeHorizontalScrollOffset(this.f10459y0);
        }
        return 0;
    }

    @Override // android.view.View
    public int computeHorizontalScrollRange() {
        p pVar = this.f10444m;
        if (pVar != null && pVar.canScrollHorizontally()) {
            return this.f10444m.computeHorizontalScrollRange(this.f10459y0);
        }
        return 0;
    }

    @Override // android.view.View
    public int computeVerticalScrollExtent() {
        p pVar = this.f10444m;
        if (pVar != null && pVar.canScrollVertically()) {
            return this.f10444m.computeVerticalScrollExtent(this.f10459y0);
        }
        return 0;
    }

    @Override // android.view.View
    public int computeVerticalScrollOffset() {
        p pVar = this.f10444m;
        if (pVar != null && pVar.canScrollVertically()) {
            return this.f10444m.computeVerticalScrollOffset(this.f10459y0);
        }
        return 0;
    }

    @Override // android.view.View
    public int computeVerticalScrollRange() {
        p pVar = this.f10444m;
        if (pVar != null && pVar.canScrollVertically()) {
            return this.f10444m.computeVerticalScrollRange(this.f10459y0);
        }
        return 0;
    }

    long d0(D d10) {
        return this.f10442l.hasStableIds() ? d10.getItemId() : d10.mPosition;
    }

    @Override // android.view.View
    public boolean dispatchNestedFling(float f10, float f11, boolean z9) {
        return getScrollingChildHelper().a(f10, f11, z9);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreFling(float f10, float f11) {
        return getScrollingChildHelper().b(f10, f11);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreScroll(int i10, int i11, int[] iArr, int[] iArr2) {
        return getScrollingChildHelper().c(i10, i11, iArr, iArr2);
    }

    @Override // android.view.View
    public boolean dispatchNestedScroll(int i10, int i11, int i12, int i13, int[] iArr) {
        return getScrollingChildHelper().f(i10, i11, i12, i13, iArr);
    }

    @Override // android.view.View
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        onPopulateAccessibilityEvent(accessibilityEvent);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchRestoreInstanceState(SparseArray sparseArray) {
        dispatchThawSelfOnly(sparseArray);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchSaveInstanceState(SparseArray sparseArray) {
        dispatchFreezeSelfOnly(sparseArray);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        boolean z9;
        super.draw(canvas);
        int size = this.f10456w.size();
        boolean z10 = false;
        for (int i10 = 0; i10 < size; i10++) {
            ((o) this.f10456w.get(i10)).onDrawOver(canvas, this, this.f10459y0);
        }
        EdgeEffect edgeEffect = this.f10425c0;
        if (edgeEffect == null || edgeEffect.isFinished()) {
            z9 = false;
        } else {
            int iSave = canvas.save();
            int paddingBottom = this.f10432g ? getPaddingBottom() : 0;
            canvas.rotate(270.0f);
            canvas.translate((-getHeight()) + paddingBottom, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            EdgeEffect edgeEffect2 = this.f10425c0;
            z9 = edgeEffect2 != null && edgeEffect2.draw(canvas);
            canvas.restoreToCount(iSave);
        }
        EdgeEffect edgeEffect3 = this.f10427d0;
        if (edgeEffect3 != null && !edgeEffect3.isFinished()) {
            int iSave2 = canvas.save();
            if (this.f10432g) {
                canvas.translate(getPaddingLeft(), getPaddingTop());
            }
            EdgeEffect edgeEffect4 = this.f10427d0;
            z9 |= edgeEffect4 != null && edgeEffect4.draw(canvas);
            canvas.restoreToCount(iSave2);
        }
        EdgeEffect edgeEffect5 = this.f10429e0;
        if (edgeEffect5 != null && !edgeEffect5.isFinished()) {
            int iSave3 = canvas.save();
            int width = getWidth();
            int paddingTop = this.f10432g ? getPaddingTop() : 0;
            canvas.rotate(90.0f);
            canvas.translate(paddingTop, -width);
            EdgeEffect edgeEffect6 = this.f10429e0;
            z9 |= edgeEffect6 != null && edgeEffect6.draw(canvas);
            canvas.restoreToCount(iSave3);
        }
        EdgeEffect edgeEffect7 = this.f10431f0;
        if (edgeEffect7 != null && !edgeEffect7.isFinished()) {
            int iSave4 = canvas.save();
            canvas.rotate(180.0f);
            if (this.f10432g) {
                canvas.translate((-getWidth()) + getPaddingRight(), (-getHeight()) + getPaddingBottom());
            } else {
                canvas.translate(-getWidth(), -getHeight());
            }
            EdgeEffect edgeEffect8 = this.f10431f0;
            if (edgeEffect8 != null && edgeEffect8.draw(canvas)) {
                z10 = true;
            }
            z9 |= z10;
            canvas.restoreToCount(iSave4);
        }
        if ((z9 || this.f10433g0 == null || this.f10456w.size() <= 0 || !this.f10433g0.p()) ? z9 : true) {
            AbstractC0845c0.d0(this);
        }
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j10) {
        return super.drawChild(canvas, view, j10);
    }

    public int e0(View view) {
        D dH0 = h0(view);
        if (dH0 != null) {
            return dH0.getAbsoluteAdapterPosition();
        }
        return -1;
    }

    public int f0(View view) {
        D dH0 = h0(view);
        if (dH0 != null) {
            return dH0.getLayoutPosition();
        }
        return -1;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public View focusSearch(View view, int i10) {
        View viewOnFocusSearchFailed;
        boolean z9;
        View viewOnInterceptFocusSearch = this.f10444m.onInterceptFocusSearch(view, i10);
        if (viewOnInterceptFocusSearch != null) {
            return viewOnInterceptFocusSearch;
        }
        boolean z10 = (this.f10442l == null || this.f10444m == null || v0() || this.f10408O) ? false : true;
        FocusFinder focusFinder = FocusFinder.getInstance();
        if (z10 && (i10 == 2 || i10 == 1)) {
            if (this.f10444m.canScrollVertically()) {
                int i11 = i10 == 2 ? 130 : 33;
                z9 = focusFinder.findNextFocus(this, view, i11) == null;
                if (f10382W0) {
                    i10 = i11;
                }
            } else {
                z9 = false;
            }
            if (!z9 && this.f10444m.canScrollHorizontally()) {
                int i12 = (this.f10444m.getLayoutDirection() == 1) ^ (i10 == 2) ? 66 : 17;
                boolean z11 = focusFinder.findNextFocus(this, view, i12) == null;
                if (f10382W0) {
                    i10 = i12;
                }
                z9 = z11;
            }
            if (z9) {
                v();
                if (S(view) == null) {
                    return null;
                }
                s1();
                this.f10444m.onFocusSearchFailed(view, i10, this.f10422b, this.f10459y0);
                u1(false);
            }
            viewOnFocusSearchFailed = focusFinder.findNextFocus(this, view, i10);
        } else {
            View viewFindNextFocus = focusFinder.findNextFocus(this, view, i10);
            if (viewFindNextFocus == null && z10) {
                v();
                if (S(view) == null) {
                    return null;
                }
                s1();
                viewOnFocusSearchFailed = this.f10444m.onFocusSearchFailed(view, i10, this.f10422b, this.f10459y0);
                u1(false);
            } else {
                viewOnFocusSearchFailed = viewFindNextFocus;
            }
        }
        if (viewOnFocusSearchFailed == null || viewOnFocusSearchFailed.hasFocusable()) {
            return w0(view, viewOnFocusSearchFailed, i10) ? viewOnFocusSearchFailed : super.focusSearch(view, i10);
        }
        if (getFocusedChild() == null) {
            return super.focusSearch(view, i10);
        }
        c1(viewOnFocusSearchFailed, null);
        return view;
    }

    public D g0(View view) {
        ViewParent parent = view.getParent();
        if (parent == null || parent == this) {
            return h0(view);
        }
        throw new IllegalArgumentException("View " + view + " is not a direct child of " + this);
    }

    void g1() {
        int iJ = this.f10428e.j();
        for (int i10 = 0; i10 < iJ; i10++) {
            D dH0 = h0(this.f10428e.i(i10));
            if (!dH0.shouldIgnore()) {
                dH0.saveOldPosition();
            }
        }
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateDefaultLayoutParams() {
        p pVar = this.f10444m;
        if (pVar != null) {
            return pVar.generateDefaultLayoutParams();
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + Q());
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        p pVar = this.f10444m;
        if (pVar != null) {
            return pVar.generateLayoutParams(getContext(), attributeSet);
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + Q());
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return "androidx.recyclerview.widget.RecyclerView";
    }

    public h getAdapter() {
        return this.f10442l;
    }

    @Override // android.view.View
    public int getBaseline() {
        p pVar = this.f10444m;
        return pVar != null ? pVar.getBaseline() : super.getBaseline();
    }

    @Override // android.view.ViewGroup
    protected int getChildDrawingOrder(int i10, int i11) {
        return super.getChildDrawingOrder(i10, i11);
    }

    @Override // android.view.ViewGroup
    public boolean getClipToPadding() {
        return this.f10432g;
    }

    public androidx.recyclerview.widget.k getCompatAccessibilityDelegate() {
        return this.f10391F0;
    }

    @NonNull
    public l getEdgeEffectFactory() {
        return this.f10423b0;
    }

    public m getItemAnimator() {
        return this.f10433g0;
    }

    public int getItemDecorationCount() {
        return this.f10456w.size();
    }

    public p getLayoutManager() {
        return this.f10444m;
    }

    public int getMaxFlingVelocity() {
        return this.f10450r0;
    }

    public int getMinFlingVelocity() {
        return this.f10449q0;
    }

    long getNanoTime() {
        if (f10381V0) {
            return System.nanoTime();
        }
        return 0L;
    }

    public r getOnFlingListener() {
        return this.f10448p0;
    }

    public boolean getPreserveFocusAfterLayout() {
        return this.f10453u0;
    }

    @NonNull
    public u getRecycledViewPool() {
        return this.f10422b.i();
    }

    public int getScrollState() {
        return this.f10435h0;
    }

    public void h(o oVar) {
        i(oVar, -1);
    }

    boolean h1(int i10, int i11, MotionEvent motionEvent, int i12) {
        int i13;
        int i14;
        int i15;
        int i16;
        v();
        if (this.f10442l != null) {
            int[] iArr = this.f10401K0;
            iArr[0] = 0;
            iArr[1] = 0;
            i1(i10, i11, iArr);
            int[] iArr2 = this.f10401K0;
            int i17 = iArr2[0];
            int i18 = iArr2[1];
            i15 = i10 - i17;
            i16 = i11 - i18;
            i14 = i18;
            i13 = i17;
        } else {
            i13 = 0;
            i14 = 0;
            i15 = 0;
            i16 = 0;
        }
        if (!this.f10456w.isEmpty()) {
            invalidate();
        }
        int[] iArr3 = this.f10401K0;
        iArr3[0] = 0;
        iArr3[1] = 0;
        H(i13, i14, i15, i16, this.f10397I0, i12, iArr3);
        int[] iArr4 = this.f10401K0;
        int i19 = iArr4[0];
        int i20 = i15 - i19;
        int i21 = iArr4[1];
        int i22 = i16 - i21;
        boolean z9 = (i19 == 0 && i21 == 0) ? false : true;
        int i23 = this.f10445m0;
        int[] iArr5 = this.f10397I0;
        int i24 = iArr5[0];
        this.f10445m0 = i23 - i24;
        int i25 = this.f10446n0;
        int i26 = iArr5[1];
        this.f10446n0 = i25 - i26;
        int[] iArr6 = this.f10399J0;
        iArr6[0] = iArr6[0] + i24;
        iArr6[1] = iArr6[1] + i26;
        if (getOverScrollMode() != 2) {
            if (motionEvent != null && !O.D.a(motionEvent, 8194)) {
                S0(motionEvent.getX(), i20, motionEvent.getY(), i22);
            }
            u(i10, i11);
        }
        if (i13 != 0 || i14 != 0) {
            J(i13, i14);
        }
        if (!awakenScrollBars()) {
            invalidate();
        }
        return (!z9 && i13 == 0 && i14 == 0) ? false : true;
    }

    @Override // android.view.View
    public boolean hasNestedScrollingParent() {
        return getScrollingChildHelper().j();
    }

    public void i(o oVar, int i10) {
        p pVar = this.f10444m;
        if (pVar != null) {
            pVar.assertNotInLayoutOrScroll("Cannot add item decoration during a scroll  or layout");
        }
        if (this.f10456w.isEmpty()) {
            setWillNotDraw(false);
        }
        if (i10 < 0) {
            this.f10456w.add(oVar);
        } else {
            this.f10456w.add(i10, oVar);
        }
        y0();
        requestLayout();
    }

    void i1(int i10, int i11, int[] iArr) {
        s1();
        I0();
        K.o.a("RV Scroll");
        R(this.f10459y0);
        int iScrollHorizontallyBy = i10 != 0 ? this.f10444m.scrollHorizontallyBy(i10, this.f10422b, this.f10459y0) : 0;
        int iScrollVerticallyBy = i11 != 0 ? this.f10444m.scrollVerticallyBy(i11, this.f10422b, this.f10459y0) : 0;
        K.o.b();
        b1();
        J0();
        u1(false);
        if (iArr != null) {
            iArr[0] = iScrollHorizontallyBy;
            iArr[1] = iScrollVerticallyBy;
        }
    }

    @Override // android.view.View
    public boolean isAttachedToWindow() {
        return this.f10396I;
    }

    @Override // android.view.ViewGroup
    public final boolean isLayoutSuppressed() {
        return this.f10408O;
    }

    @Override // android.view.View
    public boolean isNestedScrollingEnabled() {
        return getScrollingChildHelper().l();
    }

    public void j(s sVar) {
        this.f10392G.add(sVar);
    }

    public void j1(int i10) {
        if (this.f10408O) {
            return;
        }
        w1();
        p pVar = this.f10444m;
        if (pVar == null) {
            Log.e("RecyclerView", "Cannot scroll to position a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else {
            pVar.scrollToPosition(i10);
            awakenScrollBars();
        }
    }

    public void k(t tVar) {
        if (this.f10386A0 == null) {
            this.f10386A0 = new ArrayList();
        }
        this.f10386A0.add(tVar);
    }

    void l(D d10, m.b bVar, m.b bVar2) {
        d10.setIsRecyclable(false);
        if (this.f10433g0.a(d10, bVar, bVar2)) {
            O0();
        }
    }

    Rect l0(View view) {
        q qVar = (q) view.getLayoutParams();
        if (!qVar.f10515c) {
            return qVar.f10514b;
        }
        if (this.f10459y0.e() && (qVar.b() || qVar.d())) {
            return qVar.f10514b;
        }
        Rect rect = qVar.f10514b;
        rect.set(0, 0, 0, 0);
        int size = this.f10456w.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f10436i.set(0, 0, 0, 0);
            ((o) this.f10456w.get(i10)).getItemOffsets(this.f10436i, view, this, this.f10459y0);
            int i11 = rect.left;
            Rect rect2 = this.f10436i;
            rect.left = i11 + rect2.left;
            rect.top += rect2.top;
            rect.right += rect2.right;
            rect.bottom += rect2.bottom;
        }
        qVar.f10515c = false;
        return rect;
    }

    boolean l1(D d10, int i10) {
        if (!v0()) {
            AbstractC0845c0.v0(d10.itemView, i10);
            return true;
        }
        d10.mPendingAccessibilityState = i10;
        this.f10403L0.add(d10);
        return false;
    }

    boolean m1(AccessibilityEvent accessibilityEvent) {
        if (!v0()) {
            return false;
        }
        int iA = accessibilityEvent != null ? AbstractC0920b.a(accessibilityEvent) : 0;
        this.f10412Q |= iA != 0 ? iA : 0;
        return true;
    }

    void n(D d10, m.b bVar, m.b bVar2) {
        g(d10);
        d10.setIsRecyclable(false);
        if (this.f10433g0.c(d10, bVar, bVar2)) {
            O0();
        }
    }

    public boolean n0() {
        return !this.f10402L || this.f10417U || this.f10426d.p();
    }

    public void n1(int i10, int i11) {
        o1(i10, i11, null);
    }

    void o(String str) {
        if (v0()) {
            return;
        }
        if (str == null) {
            throw new IllegalStateException("Cannot call this method unless RecyclerView is computing a layout or scrolling" + Q());
        }
        throw new IllegalStateException(str + Q());
    }

    public void o1(int i10, int i11, Interpolator interpolator) {
        p1(i10, i11, interpolator, LinearLayoutManager.INVALID_OFFSET);
    }

    /* JADX WARN: Code duplicated, block: B:21:0x004e  */
    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        float refreshRate;
        super.onAttachedToWindow();
        this.f10419W = 0;
        this.f10396I = true;
        this.f10402L = this.f10402L && !isLayoutRequested();
        p pVar = this.f10444m;
        if (pVar != null) {
            pVar.dispatchAttachedToWindow(this);
        }
        this.f10390E0 = false;
        if (f10381V0) {
            ThreadLocal threadLocal = androidx.recyclerview.widget.e.f10700e;
            androidx.recyclerview.widget.e eVar = (androidx.recyclerview.widget.e) threadLocal.get();
            this.f10457w0 = eVar;
            if (eVar == null) {
                this.f10457w0 = new androidx.recyclerview.widget.e();
                Display displayT = AbstractC0845c0.t(this);
                if (isInEditMode() || displayT == null) {
                    refreshRate = 60.0f;
                } else {
                    refreshRate = displayT.getRefreshRate();
                    if (refreshRate < 30.0f) {
                        refreshRate = 60.0f;
                    }
                }
                androidx.recyclerview.widget.e eVar2 = this.f10457w0;
                eVar2.f10704c = (long) (1.0E9f / refreshRate);
                threadLocal.set(eVar2);
            }
            this.f10457w0.a(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        androidx.recyclerview.widget.e eVar;
        super.onDetachedFromWindow();
        m mVar = this.f10433g0;
        if (mVar != null) {
            mVar.k();
        }
        w1();
        this.f10396I = false;
        p pVar = this.f10444m;
        if (pVar != null) {
            pVar.dispatchDetachedFromWindow(this, this.f10422b);
        }
        this.f10403L0.clear();
        removeCallbacks(this.f10405M0);
        this.f10430f.j();
        if (!f10381V0 || (eVar = this.f10457w0) == null) {
            return;
        }
        eVar.j(this);
        this.f10457w0 = null;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int size = this.f10456w.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((o) this.f10456w.get(i10)).onDraw(canvas, this, this.f10459y0);
        }
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0062  */
    @Override // android.view.View
    public boolean onGenericMotionEvent(MotionEvent motionEvent) {
        float f10;
        float axisValue;
        if (this.f10444m != null && !this.f10408O && motionEvent.getAction() == 8) {
            if ((motionEvent.getSource() & 2) != 0) {
                f10 = this.f10444m.canScrollVertically() ? -motionEvent.getAxisValue(9) : 0.0f;
                axisValue = this.f10444m.canScrollHorizontally() ? motionEvent.getAxisValue(10) : 0.0f;
            } else if ((motionEvent.getSource() & 4194304) != 0) {
                float axisValue2 = motionEvent.getAxisValue(26);
                if (this.f10444m.canScrollVertically()) {
                    f10 = -axisValue2;
                } else if (this.f10444m.canScrollHorizontally()) {
                    axisValue = axisValue2;
                    f10 = 0.0f;
                } else {
                    f10 = 0.0f;
                    axisValue = 0.0f;
                }
            } else {
                f10 = 0.0f;
                axisValue = 0.0f;
            }
            if (f10 != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || axisValue != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                A0((int) (axisValue * this.f10451s0), (int) (f10 * this.f10452t0), motionEvent, 1);
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z9;
        if (this.f10408O) {
            return false;
        }
        this.f10394H = null;
        if (U(motionEvent)) {
            r();
            return true;
        }
        p pVar = this.f10444m;
        if (pVar == null) {
            return false;
        }
        boolean zCanScrollHorizontally = pVar.canScrollHorizontally();
        boolean zCanScrollVertically = this.f10444m.canScrollVertically();
        if (this.f10439j0 == null) {
            this.f10439j0 = VelocityTracker.obtain();
        }
        this.f10439j0.addMovement(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            if (this.f10410P) {
                this.f10410P = false;
            }
            this.f10437i0 = motionEvent.getPointerId(0);
            int x10 = (int) (motionEvent.getX() + 0.5f);
            this.f10445m0 = x10;
            this.f10441k0 = x10;
            int y9 = (int) (motionEvent.getY() + 0.5f);
            this.f10446n0 = y9;
            this.f10443l0 = y9;
            if (this.f10435h0 == 2) {
                getParent().requestDisallowInterceptTouchEvent(true);
                setScrollState(1);
                v1(1);
            }
            int[] iArr = this.f10399J0;
            iArr[1] = 0;
            iArr[0] = 0;
            int i10 = zCanScrollHorizontally;
            if (zCanScrollVertically) {
                i10 = (zCanScrollHorizontally ? 1 : 0) | 2;
            }
            t1(i10, 0);
        } else if (actionMasked == 1) {
            this.f10439j0.clear();
            v1(0);
        } else if (actionMasked == 2) {
            int iFindPointerIndex = motionEvent.findPointerIndex(this.f10437i0);
            if (iFindPointerIndex < 0) {
                Log.e("RecyclerView", "Error processing scroll; pointer index for id " + this.f10437i0 + " not found. Did any MotionEvents get skipped?");
                return false;
            }
            int x11 = (int) (motionEvent.getX(iFindPointerIndex) + 0.5f);
            int y10 = (int) (motionEvent.getY(iFindPointerIndex) + 0.5f);
            if (this.f10435h0 != 1) {
                int i11 = x11 - this.f10441k0;
                int i12 = y10 - this.f10443l0;
                if (!zCanScrollHorizontally || Math.abs(i11) <= this.f10447o0) {
                    z9 = false;
                } else {
                    this.f10445m0 = x11;
                    z9 = true;
                }
                if (zCanScrollVertically && Math.abs(i12) > this.f10447o0) {
                    this.f10446n0 = y10;
                    z9 = true;
                }
                if (z9) {
                    setScrollState(1);
                }
            }
        } else if (actionMasked == 3) {
            r();
        } else if (actionMasked == 5) {
            this.f10437i0 = motionEvent.getPointerId(actionIndex);
            int x12 = (int) (motionEvent.getX(actionIndex) + 0.5f);
            this.f10445m0 = x12;
            this.f10441k0 = x12;
            int y11 = (int) (motionEvent.getY(actionIndex) + 0.5f);
            this.f10446n0 = y11;
            this.f10443l0 = y11;
        } else if (actionMasked == 6) {
            L0(motionEvent);
        }
        return this.f10435h0 == 1;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z9, int i10, int i11, int i12, int i13) {
        K.o.a("RV OnLayout");
        C();
        K.o.b();
        this.f10402L = true;
    }

    @Override // android.view.View
    protected void onMeasure(int i10, int i11) {
        p pVar = this.f10444m;
        if (pVar == null) {
            x(i10, i11);
            return;
        }
        boolean z9 = false;
        if (pVar.isAutoMeasureEnabled()) {
            int mode = View.MeasureSpec.getMode(i10);
            int mode2 = View.MeasureSpec.getMode(i11);
            this.f10444m.onMeasure(this.f10422b, this.f10459y0, i10, i11);
            if (mode == 1073741824 && mode2 == 1073741824) {
                z9 = true;
            }
            this.f10407N0 = z9;
            if (z9 || this.f10442l == null) {
                return;
            }
            if (this.f10459y0.f10465e == 1) {
                D();
            }
            this.f10444m.setMeasureSpecs(i10, i11);
            this.f10459y0.f10470j = true;
            E();
            this.f10444m.setMeasuredDimensionFromChildren(i10, i11);
            if (this.f10444m.shouldMeasureTwice()) {
                this.f10444m.setMeasureSpecs(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
                this.f10459y0.f10470j = true;
                E();
                this.f10444m.setMeasuredDimensionFromChildren(i10, i11);
            }
            this.f10409O0 = getMeasuredWidth();
            this.f10411P0 = getMeasuredHeight();
            return;
        }
        if (this.f10398J) {
            this.f10444m.onMeasure(this.f10422b, this.f10459y0, i10, i11);
            return;
        }
        if (this.f10414R) {
            s1();
            I0();
            Q0();
            J0();
            A a10 = this.f10459y0;
            if (a10.f10472l) {
                a10.f10468h = true;
            } else {
                this.f10426d.j();
                this.f10459y0.f10468h = false;
            }
            this.f10414R = false;
            u1(false);
        } else if (this.f10459y0.f10472l) {
            setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
            return;
        }
        h hVar = this.f10442l;
        if (hVar != null) {
            this.f10459y0.f10466f = hVar.getItemCount();
        } else {
            this.f10459y0.f10466f = 0;
        }
        s1();
        this.f10444m.onMeasure(this.f10422b, this.f10459y0, i10, i11);
        u1(false);
        this.f10459y0.f10468h = false;
    }

    @Override // android.view.ViewGroup
    protected boolean onRequestFocusInDescendants(int i10, Rect rect) {
        if (v0()) {
            return false;
        }
        return super.onRequestFocusInDescendants(i10, rect);
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof y)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        y yVar = (y) parcelable;
        this.f10424c = yVar;
        super.onRestoreInstanceState(yVar.a());
        requestLayout();
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        y yVar = new y(super.onSaveInstanceState());
        y yVar2 = this.f10424c;
        if (yVar2 != null) {
            yVar.b(yVar2);
            return yVar;
        }
        p pVar = this.f10444m;
        if (pVar != null) {
            yVar.f10532c = pVar.onSaveInstanceState();
            return yVar;
        }
        yVar.f10532c = null;
        return yVar;
    }

    @Override // android.view.View
    protected void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        if (i10 == i12 && i11 == i13) {
            return;
        }
        t0();
    }

    /* JADX WARN: Code duplicated, block: B:47:0x00df A[PHI: r1
      0x00df: PHI (r1v45 int) = (r1v26 int), (r1v49 int) binds: [B:41:0x00c8, B:45:0x00db] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int i10;
        boolean z9;
        if (this.f10408O || this.f10410P) {
            return false;
        }
        if (L(motionEvent)) {
            r();
            return true;
        }
        p pVar = this.f10444m;
        if (pVar == null) {
            return false;
        }
        boolean zCanScrollHorizontally = pVar.canScrollHorizontally();
        boolean zCanScrollVertically = this.f10444m.canScrollVertically();
        if (this.f10439j0 == null) {
            this.f10439j0 = VelocityTracker.obtain();
        }
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            int[] iArr = this.f10399J0;
            iArr[1] = 0;
            iArr[0] = 0;
        }
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
        int[] iArr2 = this.f10399J0;
        motionEventObtain.offsetLocation(iArr2[0], iArr2[1]);
        if (actionMasked != 0) {
            if (actionMasked == 1) {
                this.f10439j0.addMovement(motionEventObtain);
                this.f10439j0.computeCurrentVelocity(1000, this.f10450r0);
                float f10 = zCanScrollHorizontally ? -this.f10439j0.getXVelocity(this.f10437i0) : 0.0f;
                float f11 = zCanScrollVertically ? -this.f10439j0.getYVelocity(this.f10437i0) : 0.0f;
                if ((f10 == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && f11 == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) || !b0((int) f10, (int) f11)) {
                    setScrollState(0);
                }
                e1();
            } else if (actionMasked == 2) {
                int iFindPointerIndex = motionEvent.findPointerIndex(this.f10437i0);
                if (iFindPointerIndex < 0) {
                    Log.e("RecyclerView", "Error processing scroll; pointer index for id " + this.f10437i0 + " not found. Did any MotionEvents get skipped?");
                    return false;
                }
                int x10 = (int) (motionEvent.getX(iFindPointerIndex) + 0.5f);
                int y9 = (int) (motionEvent.getY(iFindPointerIndex) + 0.5f);
                int iMax = this.f10445m0 - x10;
                int iMax2 = this.f10446n0 - y9;
                if (this.f10435h0 != 1) {
                    if (zCanScrollHorizontally) {
                        iMax = iMax > 0 ? Math.max(0, iMax - this.f10447o0) : Math.min(0, iMax + this.f10447o0);
                        if (iMax != 0) {
                            z9 = true;
                        } else {
                            z9 = false;
                        }
                    } else {
                        z9 = false;
                    }
                    if (zCanScrollVertically) {
                        iMax2 = iMax2 > 0 ? Math.max(0, iMax2 - this.f10447o0) : Math.min(0, iMax2 + this.f10447o0);
                        if (iMax2 != 0) {
                            z9 = true;
                        }
                    }
                    if (z9) {
                        setScrollState(1);
                    }
                }
                int i11 = iMax;
                int i12 = iMax2;
                if (this.f10435h0 == 1) {
                    int[] iArr3 = this.f10401K0;
                    iArr3[0] = 0;
                    iArr3[1] = 0;
                    if (G(zCanScrollHorizontally ? i11 : 0, zCanScrollVertically ? i12 : 0, iArr3, this.f10397I0, 0)) {
                        int[] iArr4 = this.f10401K0;
                        i11 -= iArr4[0];
                        i12 -= iArr4[1];
                        int[] iArr5 = this.f10399J0;
                        int i13 = iArr5[0];
                        int[] iArr6 = this.f10397I0;
                        iArr5[0] = i13 + iArr6[0];
                        iArr5[1] = iArr5[1] + iArr6[1];
                        getParent().requestDisallowInterceptTouchEvent(true);
                    }
                    int[] iArr7 = this.f10397I0;
                    this.f10445m0 = x10 - iArr7[0];
                    this.f10446n0 = y9 - iArr7[1];
                    if (h1(zCanScrollHorizontally ? i11 : 0, zCanScrollVertically ? i12 : 0, motionEvent, 0)) {
                        getParent().requestDisallowInterceptTouchEvent(true);
                    }
                    androidx.recyclerview.widget.e eVar = this.f10457w0;
                    if (eVar != null && (i11 != 0 || i12 != 0)) {
                        eVar.f(this, i11, i12);
                    }
                }
            } else if (actionMasked == 3) {
                r();
            } else if (actionMasked == 5) {
                this.f10437i0 = motionEvent.getPointerId(actionIndex);
                int x11 = (int) (motionEvent.getX(actionIndex) + 0.5f);
                this.f10445m0 = x11;
                this.f10441k0 = x11;
                int y10 = (int) (motionEvent.getY(actionIndex) + 0.5f);
                this.f10446n0 = y10;
                this.f10443l0 = y10;
            } else if (actionMasked == 6) {
                L0(motionEvent);
            }
            motionEventObtain.recycle();
            return true;
        }
        this.f10437i0 = motionEvent.getPointerId(0);
        int x12 = (int) (motionEvent.getX() + 0.5f);
        this.f10445m0 = x12;
        this.f10441k0 = x12;
        int y11 = (int) (motionEvent.getY() + 0.5f);
        this.f10446n0 = y11;
        this.f10443l0 = y11;
        if (zCanScrollVertically) {
            i10 = zCanScrollHorizontally;
            i10 = (zCanScrollHorizontally ? 1 : 0) | 2;
        }
        i10 = zCanScrollHorizontally;
        t1(i10, 0);
        this.f10439j0.addMovement(motionEventObtain);
        motionEventObtain.recycle();
        return true;
    }

    void p(String str) {
        if (v0()) {
            if (str != null) {
                throw new IllegalStateException(str);
            }
            throw new IllegalStateException("Cannot call this method while RecyclerView is computing a layout or scrolling" + Q());
        }
        if (this.f10421a0 > 0) {
            Log.w("RecyclerView", "Cannot call this method in a scroll callback. Scroll callbacks mightbe run during a measure & layout pass where you cannot change theRecyclerView data. Any method call that might change the structureof the RecyclerView or the adapter contents should be postponed tothe next frame.", new IllegalStateException("" + Q()));
        }
    }

    void p0() {
        this.f10426d = new a(new f());
    }

    public void p1(int i10, int i11, Interpolator interpolator, int i12) {
        q1(i10, i11, interpolator, i12, false);
    }

    boolean q(D d10) {
        m mVar = this.f10433g0;
        return mVar == null || mVar.g(d10, d10.getUnmodifiedPayloads());
    }

    void q1(int i10, int i11, Interpolator interpolator, int i12, boolean z9) {
        p pVar = this.f10444m;
        if (pVar == null) {
            Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.f10408O) {
            return;
        }
        if (!pVar.canScrollHorizontally()) {
            i10 = 0;
        }
        if (!this.f10444m.canScrollVertically()) {
            i11 = 0;
        }
        if (i10 == 0 && i11 == 0) {
            return;
        }
        if (i12 != Integer.MIN_VALUE && i12 <= 0) {
            scrollBy(i10, i11);
            return;
        }
        if (z9) {
            int i13 = i10 != 0 ? 1 : 0;
            if (i11 != 0) {
                i13 |= 2;
            }
            t1(i13, 1);
        }
        this.f10455v0.e(i10, i11, i12, interpolator);
    }

    public void r1(int i10) {
        if (this.f10408O) {
            return;
        }
        p pVar = this.f10444m;
        if (pVar == null) {
            Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else {
            pVar.smoothScrollToPosition(this, this.f10459y0, i10);
        }
    }

    @Override // android.view.ViewGroup
    protected void removeDetachedView(View view, boolean z9) {
        D dH0 = h0(view);
        if (dH0 != null) {
            if (dH0.isTmpDetached()) {
                dH0.clearTmpDetachFlag();
            } else if (!dH0.shouldIgnore()) {
                throw new IllegalArgumentException("Called removeDetachedView with a view which is not flagged as tmp detached." + dH0 + Q());
            }
        }
        view.clearAnimation();
        A(view);
        super.removeDetachedView(view, z9);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestChildFocus(View view, View view2) {
        if (!this.f10444m.onRequestChildFocus(this, this.f10459y0, view, view2) && view2 != null) {
            c1(view, view2);
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z9) {
        return this.f10444m.requestChildRectangleOnScreen(this, view, rect, z9);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z9) {
        int size = this.f10392G.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((s) this.f10392G.get(i10)).c(z9);
        }
        super.requestDisallowInterceptTouchEvent(z9);
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        if (this.f10404M != 0 || this.f10408O) {
            this.f10406N = true;
        } else {
            super.requestLayout();
        }
    }

    void s0(StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2) {
        if (stateListDrawable != null && drawable != null && stateListDrawable2 != null && drawable2 != null) {
            Resources resources = getContext().getResources();
            new d(this, stateListDrawable, drawable, stateListDrawable2, drawable2, resources.getDimensionPixelSize(p221w0.b.f50229a), resources.getDimensionPixelSize(p221w0.b.f50231c), resources.getDimensionPixelOffset(p221w0.b.f50230b));
        } else {
            throw new IllegalArgumentException("Trying to set fast scroller without both required drawables." + Q());
        }
    }

    void s1() {
        int i10 = this.f10404M + 1;
        this.f10404M = i10;
        if (i10 != 1 || this.f10408O) {
            return;
        }
        this.f10406N = false;
    }

    @Override // android.view.View
    public void scrollBy(int i10, int i11) {
        p pVar = this.f10444m;
        if (pVar == null) {
            Log.e("RecyclerView", "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.f10408O) {
            return;
        }
        boolean zCanScrollHorizontally = pVar.canScrollHorizontally();
        boolean zCanScrollVertically = this.f10444m.canScrollVertically();
        if (zCanScrollHorizontally || zCanScrollVertically) {
            if (!zCanScrollHorizontally) {
                i10 = 0;
            }
            if (!zCanScrollVertically) {
                i11 = 0;
            }
            h1(i10, i11, null, 0);
        }
    }

    @Override // android.view.View
    public void scrollTo(int i10, int i11) {
        Log.w("RecyclerView", "RecyclerView does not support scrolling to an absolute position. Use scrollToPosition instead");
    }

    @Override // android.view.View, android.view.accessibility.AccessibilityEventSource
    public void sendAccessibilityEventUnchecked(AccessibilityEvent accessibilityEvent) {
        if (m1(accessibilityEvent)) {
            return;
        }
        super.sendAccessibilityEventUnchecked(accessibilityEvent);
    }

    public void setAccessibilityDelegateCompat(androidx.recyclerview.widget.k kVar) {
        this.f10391F0 = kVar;
        AbstractC0845c0.m0(this, kVar);
    }

    public void setAdapter(h hVar) {
        setLayoutFrozen(false);
        k1(hVar, false, true);
        R0(false);
        requestLayout();
    }

    public void setChildDrawingOrderCallback(k kVar) {
        if (kVar == null) {
            return;
        }
        setChildrenDrawingOrderEnabled(false);
    }

    @Override // android.view.ViewGroup
    public void setClipToPadding(boolean z9) {
        if (z9 != this.f10432g) {
            t0();
        }
        this.f10432g = z9;
        super.setClipToPadding(z9);
        if (this.f10402L) {
            requestLayout();
        }
    }

    public void setEdgeEffectFactory(@NonNull l lVar) {
        N.f.g(lVar);
        this.f10423b0 = lVar;
        t0();
    }

    public void setHasFixedSize(boolean z9) {
        this.f10398J = z9;
    }

    public void setItemAnimator(m mVar) {
        m mVar2 = this.f10433g0;
        if (mVar2 != null) {
            mVar2.k();
            this.f10433g0.v(null);
        }
        this.f10433g0 = mVar;
        if (mVar != null) {
            mVar.v(this.f10389D0);
        }
    }

    public void setItemViewCacheSize(int i10) {
        this.f10422b.G(i10);
    }

    @Deprecated
    public void setLayoutFrozen(boolean z9) {
        suppressLayout(z9);
    }

    public void setLayoutManager(p pVar) {
        if (pVar == this.f10444m) {
            return;
        }
        w1();
        if (this.f10444m != null) {
            m mVar = this.f10433g0;
            if (mVar != null) {
                mVar.k();
            }
            this.f10444m.removeAndRecycleAllViews(this.f10422b);
            this.f10444m.removeAndRecycleScrapInt(this.f10422b);
            this.f10422b.c();
            if (this.f10396I) {
                this.f10444m.dispatchDetachedFromWindow(this, this.f10422b);
            }
            this.f10444m.setRecyclerView(null);
            this.f10444m = null;
        } else {
            this.f10422b.c();
        }
        this.f10428e.o();
        this.f10444m = pVar;
        if (pVar != null) {
            if (pVar.mRecyclerView != null) {
                throw new IllegalArgumentException("LayoutManager " + pVar + " is already attached to a RecyclerView:" + pVar.mRecyclerView.Q());
            }
            pVar.setRecyclerView(this);
            if (this.f10396I) {
                this.f10444m.dispatchAttachedToWindow(this);
            }
        }
        this.f10422b.K();
        requestLayout();
    }

    @Override // android.view.ViewGroup
    @Deprecated
    public void setLayoutTransition(LayoutTransition layoutTransition) {
        if (layoutTransition != null) {
            throw new IllegalArgumentException("Providing a LayoutTransition into RecyclerView is not supported. Please use setItemAnimator() instead for animating changes to the items in this RecyclerView");
        }
        super.setLayoutTransition(null);
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z9) {
        getScrollingChildHelper().m(z9);
    }

    public void setOnFlingListener(r rVar) {
        this.f10448p0 = rVar;
    }

    @Deprecated
    public void setOnScrollListener(t tVar) {
        this.f10460z0 = tVar;
    }

    public void setPreserveFocusAfterLayout(boolean z9) {
        this.f10453u0 = z9;
    }

    public void setRecycledViewPool(u uVar) {
        this.f10422b.E(uVar);
    }

    @Deprecated
    public void setRecyclerListener(w wVar) {
    }

    void setScrollState(int i10) {
        if (i10 == this.f10435h0) {
            return;
        }
        this.f10435h0 = i10;
        if (i10 != 2) {
            x1();
        }
        I(i10);
    }

    public void setScrollingTouchSlop(int i10) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        if (i10 != 0) {
            if (i10 == 1) {
                this.f10447o0 = viewConfiguration.getScaledPagingTouchSlop();
                return;
            }
            Log.w("RecyclerView", "setScrollingTouchSlop(): bad argument constant " + i10 + "; using default value");
        }
        this.f10447o0 = viewConfiguration.getScaledTouchSlop();
    }

    public void setViewCacheExtension(B b10) {
        this.f10422b.F(b10);
    }

    @Override // android.view.View
    public boolean startNestedScroll(int i10) {
        return getScrollingChildHelper().o(i10);
    }

    @Override // android.view.View
    public void stopNestedScroll() {
        getScrollingChildHelper().q();
    }

    @Override // android.view.ViewGroup
    public final void suppressLayout(boolean z9) {
        if (z9 != this.f10408O) {
            p("Do not suppressLayout in layout or scroll");
            if (z9) {
                long jUptimeMillis = SystemClock.uptimeMillis();
                onTouchEvent(MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0));
                this.f10408O = true;
                this.f10410P = true;
                w1();
                return;
            }
            this.f10408O = false;
            if (this.f10406N && this.f10444m != null && this.f10442l != null) {
                requestLayout();
            }
            this.f10406N = false;
        }
    }

    void t() {
        int iJ = this.f10428e.j();
        for (int i10 = 0; i10 < iJ; i10++) {
            D dH0 = h0(this.f10428e.i(i10));
            if (!dH0.shouldIgnore()) {
                dH0.clearOldPosition();
            }
        }
        this.f10422b.d();
    }

    void t0() {
        this.f10431f0 = null;
        this.f10427d0 = null;
        this.f10429e0 = null;
        this.f10425c0 = null;
    }

    public boolean t1(int i10, int i11) {
        return getScrollingChildHelper().p(i10, i11);
    }

    void u(int i10, int i11) {
        boolean zIsFinished;
        EdgeEffect edgeEffect = this.f10425c0;
        if (edgeEffect == null || edgeEffect.isFinished() || i10 <= 0) {
            zIsFinished = false;
        } else {
            this.f10425c0.onRelease();
            zIsFinished = this.f10425c0.isFinished();
        }
        EdgeEffect edgeEffect2 = this.f10429e0;
        if (edgeEffect2 != null && !edgeEffect2.isFinished() && i10 < 0) {
            this.f10429e0.onRelease();
            zIsFinished |= this.f10429e0.isFinished();
        }
        EdgeEffect edgeEffect3 = this.f10427d0;
        if (edgeEffect3 != null && !edgeEffect3.isFinished() && i11 > 0) {
            this.f10427d0.onRelease();
            zIsFinished |= this.f10427d0.isFinished();
        }
        EdgeEffect edgeEffect4 = this.f10431f0;
        if (edgeEffect4 != null && !edgeEffect4.isFinished() && i11 < 0) {
            this.f10431f0.onRelease();
            zIsFinished |= this.f10431f0.isFinished();
        }
        if (zIsFinished) {
            AbstractC0845c0.d0(this);
        }
    }

    boolean u0() {
        AccessibilityManager accessibilityManager = this.f10415S;
        return accessibilityManager != null && accessibilityManager.isEnabled();
    }

    void u1(boolean z9) {
        if (this.f10404M < 1) {
            this.f10404M = 1;
        }
        if (!z9 && !this.f10408O) {
            this.f10406N = false;
        }
        if (this.f10404M == 1) {
            if (z9 && this.f10406N && !this.f10408O && this.f10444m != null && this.f10442l != null) {
                C();
            }
            if (!this.f10408O) {
                this.f10406N = false;
            }
        }
        this.f10404M--;
    }

    void v() {
        if (!this.f10402L || this.f10417U) {
            K.o.a("RV FullInvalidate");
            C();
            K.o.b();
            return;
        }
        if (this.f10426d.p()) {
            if (!this.f10426d.o(4) || this.f10426d.o(11)) {
                if (this.f10426d.p()) {
                    K.o.a("RV FullInvalidate");
                    C();
                    K.o.b();
                    return;
                }
                return;
            }
            K.o.a("RV PartialInvalidate");
            s1();
            I0();
            this.f10426d.w();
            if (!this.f10406N) {
                if (o0()) {
                    C();
                } else {
                    this.f10426d.i();
                }
            }
            u1(true);
            J0();
            K.o.b();
        }
    }

    public boolean v0() {
        return this.f10419W > 0;
    }

    public void v1(int i10) {
        getScrollingChildHelper().r(i10);
    }

    public void w1() {
        setScrollState(0);
        x1();
    }

    void x(int i10, int i11) {
        setMeasuredDimension(p.chooseSize(i10, getPaddingLeft() + getPaddingRight(), AbstractC0845c0.B(this)), p.chooseSize(i11, getPaddingTop() + getPaddingBottom(), AbstractC0845c0.A(this)));
    }

    void x0(int i10) {
        if (this.f10444m == null) {
            return;
        }
        setScrollState(2);
        this.f10444m.scrollToPosition(i10);
        awakenScrollBars();
    }

    void y0() {
        int iJ = this.f10428e.j();
        for (int i10 = 0; i10 < iJ; i10++) {
            ((q) this.f10428e.i(i10).getLayoutParams()).f10515c = true;
        }
        this.f10422b.s();
    }

    void y1(int i10, int i11, Object obj) {
        int i12;
        int iJ = this.f10428e.j();
        int i13 = i10 + i11;
        for (int i14 = 0; i14 < iJ; i14++) {
            View viewI = this.f10428e.i(i14);
            D dH0 = h0(viewI);
            if (dH0 != null && !dH0.shouldIgnore() && (i12 = dH0.mPosition) >= i10 && i12 < i13) {
                dH0.addFlags(2);
                dH0.addChangePayload(obj);
                ((q) viewI.getLayoutParams()).f10515c = true;
            }
        }
        this.f10422b.M(i10, i11);
    }

    void z(View view) {
        int size;
        D dH0 = h0(view);
        G0(view);
        h hVar = this.f10442l;
        if (hVar != null && dH0 != null) {
            hVar.onViewAttachedToWindow(dH0);
        }
        List list = this.f10416T;
        if (list == null || (size = list.size() - 1) < 0) {
            return;
        }
        p070h.w.a(this.f10416T.get(size));
        throw null;
    }

    void z0() {
        int iJ = this.f10428e.j();
        for (int i10 = 0; i10 < iJ; i10++) {
            D dH0 = h0(this.f10428e.i(i10));
            if (dH0 != null && !dH0.shouldIgnore()) {
                dH0.addFlags(6);
            }
        }
        y0();
        this.f10422b.t();
    }

    public RecyclerView(@NonNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, p221w0.a.f50228a);
    }

    public static class y extends T.a {
        public static final Parcelable.Creator<y> CREATOR = new a();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Parcelable f10532c;

        class a implements Parcelable.ClassLoaderCreator {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public y createFromParcel(Parcel parcel) {
                return new y(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public y createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new y(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public y[] newArray(int i10) {
                return new y[i10];
            }
        }

        y(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f10532c = parcel.readParcelable(classLoader == null ? p.class.getClassLoader() : classLoader);
        }

        void b(y yVar) {
            this.f10532c = yVar.f10532c;
        }

        @Override // T.a, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeParcelable(this.f10532c, 0);
        }

        y(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public RecyclerView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f10420a = new x();
        this.f10422b = new v();
        this.f10430f = new androidx.recyclerview.widget.p();
        this.f10434h = new RunnableC1179a();
        this.f10436i = new Rect();
        this.f10438j = new Rect();
        this.f10440k = new RectF();
        this.f10454v = new ArrayList();
        this.f10456w = new ArrayList();
        this.f10392G = new ArrayList();
        this.f10404M = 0;
        this.f10417U = false;
        this.f10418V = false;
        this.f10419W = 0;
        this.f10421a0 = 0;
        this.f10423b0 = new l();
        this.f10433g0 = new c();
        this.f10435h0 = 0;
        this.f10437i0 = -1;
        this.f10451s0 = Float.MIN_VALUE;
        this.f10452t0 = Float.MIN_VALUE;
        this.f10453u0 = true;
        this.f10455v0 = new C();
        this.f10458x0 = f10381V0 ? new androidx.recyclerview.widget.e.b() : null;
        this.f10459y0 = new A();
        this.f10387B0 = false;
        this.f10388C0 = false;
        this.f10389D0 = new n();
        this.f10390E0 = false;
        this.f10393G0 = new int[2];
        this.f10397I0 = new int[2];
        this.f10399J0 = new int[2];
        this.f10401K0 = new int[2];
        this.f10403L0 = new ArrayList();
        this.f10405M0 = new RunnableC1180b();
        this.f10409O0 = 0;
        this.f10411P0 = 0;
        this.f10413Q0 = new C1182d();
        setScrollContainer(true);
        setFocusableInTouchMode(true);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f10447o0 = viewConfiguration.getScaledTouchSlop();
        this.f10451s0 = AbstractC0851f0.f(viewConfiguration, context);
        this.f10452t0 = AbstractC0851f0.j(viewConfiguration, context);
        this.f10449q0 = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f10450r0 = viewConfiguration.getScaledMaximumFlingVelocity();
        setWillNotDraw(getOverScrollMode() == 2);
        this.f10433g0.v(this.f10389D0);
        p0();
        r0();
        q0();
        if (AbstractC0845c0.x(this) == 0) {
            AbstractC0845c0.v0(this, 1);
        }
        this.f10415S = (AccessibilityManager) getContext().getSystemService("accessibility");
        setAccessibilityDelegateCompat(new androidx.recyclerview.widget.k(this));
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, p221w0.c.f50237f, i10, 0);
        AbstractC0845c0.k0(this, context, p221w0.c.f50237f, attributeSet, typedArrayObtainStyledAttributes, i10, 0);
        String string = typedArrayObtainStyledAttributes.getString(p221w0.c.f50246o);
        if (typedArrayObtainStyledAttributes.getInt(p221w0.c.f50240i, -1) == -1) {
            setDescendantFocusability(262144);
        }
        this.f10432g = typedArrayObtainStyledAttributes.getBoolean(p221w0.c.f50239h, true);
        boolean z9 = typedArrayObtainStyledAttributes.getBoolean(p221w0.c.f50241j, false);
        this.f10400K = z9;
        if (z9) {
            s0((StateListDrawable) typedArrayObtainStyledAttributes.getDrawable(p221w0.c.f50244m), typedArrayObtainStyledAttributes.getDrawable(p221w0.c.f50245n), (StateListDrawable) typedArrayObtainStyledAttributes.getDrawable(p221w0.c.f50242k), typedArrayObtainStyledAttributes.getDrawable(p221w0.c.f50243l));
        }
        typedArrayObtainStyledAttributes.recycle();
        w(context, string, attributeSet, i10, 0);
        int[] iArr = f10377R0;
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr, i10, 0);
        AbstractC0845c0.k0(this, context, iArr, attributeSet, typedArrayObtainStyledAttributes2, i10, 0);
        boolean z10 = typedArrayObtainStyledAttributes2.getBoolean(0, true);
        typedArrayObtainStyledAttributes2.recycle();
        setNestedScrollingEnabled(z10);
    }

    public static class q extends ViewGroup.MarginLayoutParams {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        D f10513a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final Rect f10514b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        boolean f10515c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        boolean f10516d;

        public q(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f10514b = new Rect();
            this.f10515c = true;
            this.f10516d = false;
        }

        public int a() {
            return this.f10513a.getLayoutPosition();
        }

        public boolean b() {
            return this.f10513a.isUpdated();
        }

        public boolean c() {
            return this.f10513a.isRemoved();
        }

        public boolean d() {
            return this.f10513a.isInvalid();
        }

        public q(int i10, int i11) {
            super(i10, i11);
            this.f10514b = new Rect();
            this.f10515c = true;
            this.f10516d = false;
        }

        public q(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f10514b = new Rect();
            this.f10515c = true;
            this.f10516d = false;
        }

        public q(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f10514b = new Rect();
            this.f10515c = true;
            this.f10516d = false;
        }

        public q(q qVar) {
            super((ViewGroup.LayoutParams) qVar);
            this.f10514b = new Rect();
            this.f10515c = true;
            this.f10516d = false;
        }
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        p pVar = this.f10444m;
        if (pVar != null) {
            return pVar.generateLayoutParams(layoutParams);
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + Q());
    }
}
