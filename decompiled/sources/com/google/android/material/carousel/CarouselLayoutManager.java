package com.google.android.material.carousel;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.common.api.Api;
import com.google.android.material.carousel.CarouselLayoutManager;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import p186s5.k;

/* JADX INFO: loaded from: classes2.dex */
public class CarouselLayoutManager extends RecyclerView.p implements com.google.android.material.carousel.b, RecyclerView.z.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    int f38886a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f38887b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    int f38888c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f38889d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final c f38890e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private com.google.android.material.carousel.d f38891f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private g f38892g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private f f38893h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f38894i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private Map f38895j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private com.google.android.material.carousel.c f38896k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final View.OnLayoutChangeListener f38897l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f38898m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f38899n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f38900o;

    class a extends androidx.recyclerview.widget.g {
        a(Context context) {
            super(context);
        }

        @Override // androidx.recyclerview.widget.g
        public int calculateDxToMakeVisible(View view, int i10) {
            if (CarouselLayoutManager.this.f38892g == null || !CarouselLayoutManager.this.d()) {
                return 0;
            }
            CarouselLayoutManager carouselLayoutManager = CarouselLayoutManager.this;
            return carouselLayoutManager.A(carouselLayoutManager.getPosition(view));
        }

        @Override // androidx.recyclerview.widget.g
        public int calculateDyToMakeVisible(View view, int i10) {
            if (CarouselLayoutManager.this.f38892g == null || CarouselLayoutManager.this.d()) {
                return 0;
            }
            CarouselLayoutManager carouselLayoutManager = CarouselLayoutManager.this;
            return carouselLayoutManager.A(carouselLayoutManager.getPosition(view));
        }

        @Override // androidx.recyclerview.widget.RecyclerView.z
        public PointF computeScrollVectorForPosition(int i10) {
            return CarouselLayoutManager.this.computeScrollVectorForPosition(i10);
        }
    }

    private static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final View f38902a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final float f38903b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final float f38904c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final d f38905d;

        b(View view, float f10, float f11, d dVar) {
            this.f38902a = view;
            this.f38903b = f10;
            this.f38904c = f11;
            this.f38905d = dVar;
        }
    }

    private static class c extends RecyclerView.o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Paint f38906a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private List f38907b;

        c() {
            Paint paint = new Paint();
            this.f38906a = paint;
            this.f38907b = Collections.unmodifiableList(new ArrayList());
            paint.setStrokeWidth(5.0f);
            paint.setColor(-65281);
        }

        void d(List list) {
            this.f38907b = Collections.unmodifiableList(list);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.o
        public void onDrawOver(Canvas canvas, RecyclerView recyclerView, RecyclerView.A a10) {
            super.onDrawOver(canvas, recyclerView, a10);
            this.f38906a.setStrokeWidth(recyclerView.getResources().getDimension(p186s5.c.f48715v));
            for (f.c cVar : this.f38907b) {
                this.f38906a.setColor(F.a.c(-65281, -16776961, cVar.f38938c));
                if (((CarouselLayoutManager) recyclerView.getLayoutManager()).d()) {
                    canvas.drawLine(cVar.f38937b, ((CarouselLayoutManager) recyclerView.getLayoutManager()).S(), cVar.f38937b, ((CarouselLayoutManager) recyclerView.getLayoutManager()).N(), this.f38906a);
                } else {
                    canvas.drawLine(((CarouselLayoutManager) recyclerView.getLayoutManager()).P(), cVar.f38937b, ((CarouselLayoutManager) recyclerView.getLayoutManager()).Q(), cVar.f38937b, this.f38906a);
                }
            }
        }
    }

    private static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final f.c f38908a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final f.c f38909b;

        d(f.c cVar, f.c cVar2) {
            N.f.a(cVar.f38936a <= cVar2.f38936a);
            this.f38908a = cVar;
            this.f38909b = cVar2;
        }
    }

    public CarouselLayoutManager() {
        this(new h());
    }

    private static int B(int i10, int i11, int i12, int i13) {
        int i14 = i11 + i10;
        if (i14 < i12) {
            return i12 - i11;
        }
        return i14 > i13 ? i13 - i11 : i10;
    }

    private int C(g gVar) {
        boolean zX = X();
        f fVarH = zX ? gVar.h() : gVar.l();
        return (int) (R() - t((zX ? fVarH.h() : fVarH.a()).f38936a, fVarH.f() / 2.0f));
    }

    private void D(RecyclerView.v vVar, RecyclerView.A a10) {
        f0(vVar);
        if (getChildCount() == 0) {
            w(vVar, this.f38894i - 1);
            v(vVar, a10, this.f38894i);
        } else {
            int position = getPosition(getChildAt(0));
            int position2 = getPosition(getChildAt(getChildCount() - 1));
            w(vVar, position - 1);
            v(vVar, a10, position2 + 1);
        }
        n0();
    }

    private View E() {
        return getChildAt(X() ? 0 : getChildCount() - 1);
    }

    private View F() {
        return getChildAt(X() ? getChildCount() - 1 : 0);
    }

    private int G() {
        return d() ? a() : b();
    }

    private float H(View view) {
        Rect rect = new Rect();
        super.getDecoratedBoundsWithMargins(view, rect);
        return d() ? rect.centerX() : rect.centerY();
    }

    private int I() {
        int i10;
        int i11;
        if (getChildCount() <= 0) {
            return 0;
        }
        RecyclerView.q qVar = (RecyclerView.q) getChildAt(0).getLayoutParams();
        if (this.f38896k.f38918a == 0) {
            i10 = ((ViewGroup.MarginLayoutParams) qVar).leftMargin;
            i11 = ((ViewGroup.MarginLayoutParams) qVar).rightMargin;
        } else {
            i10 = ((ViewGroup.MarginLayoutParams) qVar).topMargin;
            i11 = ((ViewGroup.MarginLayoutParams) qVar).bottomMargin;
        }
        return i10 + i11;
    }

    private f J(int i10) {
        f fVar;
        Map map = this.f38895j;
        return (map == null || (fVar = (f) map.get(Integer.valueOf(I.a.b(i10, 0, Math.max(0, getItemCount() + (-1)))))) == null) ? this.f38892g.g() : fVar;
    }

    private int K() {
        if (getClipToPadding() || !this.f38891f.f()) {
            return 0;
        }
        return getOrientation() == 1 ? getPaddingTop() : getPaddingLeft();
    }

    private float L(float f10, d dVar) {
        f.c cVar = dVar.f38908a;
        float f11 = cVar.f38939d;
        f.c cVar2 = dVar.f38909b;
        return p196t5.a.b(f11, cVar2.f38939d, cVar.f38937b, cVar2.f38937b, f10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int N() {
        return this.f38896k.e();
    }

    private int O() {
        return this.f38896k.f();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int P() {
        return this.f38896k.g();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int Q() {
        return this.f38896k.h();
    }

    private int R() {
        return this.f38896k.i();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int S() {
        return this.f38896k.j();
    }

    private int T() {
        if (getClipToPadding() || !this.f38891f.f()) {
            return 0;
        }
        return getOrientation() == 1 ? getPaddingBottom() : getPaddingRight();
    }

    private int U(int i10, f fVar) {
        return X() ? (int) (((G() - fVar.h().f38936a) - (i10 * fVar.f())) - (fVar.f() / 2.0f)) : (int) (((i10 * fVar.f()) - fVar.a().f38936a) + (fVar.f() / 2.0f));
    }

    private int V(int i10, f fVar) {
        int i11 = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        for (f.c cVar : fVar.e()) {
            float f10 = (i10 * fVar.f()) + (fVar.f() / 2.0f);
            int iG = (X() ? (int) ((G() - cVar.f38936a) - f10) : (int) (f10 - cVar.f38936a)) - this.f38886a;
            if (Math.abs(i11) > Math.abs(iG)) {
                i11 = iG;
            }
        }
        return i11;
    }

    private static d W(List list, float f10, boolean z9) {
        float f11 = Float.MAX_VALUE;
        int i10 = -1;
        int i11 = -1;
        int i12 = -1;
        int i13 = -1;
        float f12 = -3.4028235E38f;
        float f13 = Float.MAX_VALUE;
        float f14 = Float.MAX_VALUE;
        for (int i14 = 0; i14 < list.size(); i14++) {
            f.c cVar = (f.c) list.get(i14);
            float f15 = z9 ? cVar.f38937b : cVar.f38936a;
            float fAbs = Math.abs(f15 - f10);
            if (f15 <= f10 && fAbs <= f11) {
                i10 = i14;
                f11 = fAbs;
            }
            if (f15 > f10 && fAbs <= f13) {
                i12 = i14;
                f13 = fAbs;
            }
            if (f15 <= f14) {
                i11 = i14;
                f14 = f15;
            }
            if (f15 > f12) {
                i13 = i14;
                f12 = f15;
            }
        }
        if (i10 == -1) {
            i10 = i11;
        }
        if (i12 == -1) {
            i12 = i13;
        }
        return new d((f.c) list.get(i10), (f.c) list.get(i12));
    }

    private boolean Y(float f10, d dVar) {
        float fT = t(f10, L(f10, dVar) / 2.0f);
        if (X()) {
            return fT < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        }
        return fT > ((float) G());
    }

    private boolean Z(float f10, d dVar) {
        float fS = s(f10, L(f10, dVar) / 2.0f);
        if (X()) {
            return fS > ((float) G());
        }
        return fS < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    }

    private void a0() {
        if (this.f38889d && Log.isLoggable("CarouselLayoutManager", 3)) {
            Log.d("CarouselLayoutManager", "internal representation of views on the screen");
            for (int i10 = 0; i10 < getChildCount(); i10++) {
                View childAt = getChildAt(i10);
                Log.d("CarouselLayoutManager", "item position " + getPosition(childAt) + ", center:" + H(childAt) + ", child index:" + i10);
            }
            Log.d("CarouselLayoutManager", "==============");
        }
    }

    private b b0(RecyclerView.v vVar, float f10, int i10) {
        View viewO = vVar.o(i10);
        measureChildWithMargins(viewO, 0, 0);
        float fS = s(f10, this.f38893h.f() / 2.0f);
        d dVarW = W(this.f38893h.g(), fS, false);
        return new b(viewO, fS, x(viewO, fS, dVarW), dVarW);
    }

    private float c0(View view, float f10, float f11, Rect rect) {
        float fS = s(f10, f11);
        d dVarW = W(this.f38893h.g(), fS, false);
        float fX = x(view, fS, dVarW);
        super.getDecoratedBoundsWithMargins(view, rect);
        k0(view, fS, dVarW);
        this.f38896k.l(view, rect, f11, fX);
        return fX;
    }

    private int convertFocusDirectionToLayoutDirection(int i10) {
        int orientation = getOrientation();
        if (i10 == 1) {
            return -1;
        }
        if (i10 == 2) {
            return 1;
        }
        if (i10 == 17) {
            if (orientation == 0) {
                return X() ? 1 : -1;
            }
            return LinearLayoutManager.INVALID_OFFSET;
        }
        if (i10 == 33) {
            if (orientation == 1) {
                return -1;
            }
            return LinearLayoutManager.INVALID_OFFSET;
        }
        if (i10 == 66) {
            if (orientation == 0) {
                return X() ? -1 : 1;
            }
            return LinearLayoutManager.INVALID_OFFSET;
        }
        if (i10 == 130) {
            if (orientation == 1) {
                return 1;
            }
            return LinearLayoutManager.INVALID_OFFSET;
        }
        Log.d("CarouselLayoutManager", "Unknown focus request:" + i10);
        return LinearLayoutManager.INVALID_OFFSET;
    }

    private void d0(RecyclerView.v vVar) {
        View viewO = vVar.o(0);
        measureChildWithMargins(viewO, 0, 0);
        f fVarG = this.f38891f.g(this, viewO);
        if (X()) {
            fVarG = f.n(fVarG, G());
        }
        this.f38892g = g.f(this, fVarG, I(), K(), T());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e0() {
        this.f38892g = null;
        requestLayout();
    }

    private void f0(RecyclerView.v vVar) {
        while (getChildCount() > 0) {
            View childAt = getChildAt(0);
            float fH = H(childAt);
            if (!Z(fH, W(this.f38893h.g(), fH, true))) {
                break;
            } else {
                removeAndRecycleView(childAt, vVar);
            }
        }
        while (getChildCount() - 1 >= 0) {
            View childAt2 = getChildAt(getChildCount() - 1);
            float fH2 = H(childAt2);
            if (!Y(fH2, W(this.f38893h.g(), fH2, true))) {
                return;
            } else {
                removeAndRecycleView(childAt2, vVar);
            }
        }
    }

    private void g0(RecyclerView recyclerView, int i10) {
        if (d()) {
            recyclerView.scrollBy(i10, 0);
        } else {
            recyclerView.scrollBy(0, i10);
        }
    }

    private void i0(Context context, AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, k.f48982O0);
            h0(typedArrayObtainStyledAttributes.getInt(k.f48991P0, 0));
            setOrientation(typedArrayObtainStyledAttributes.getInt(k.f49217n5, 0));
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    private void k0(View view, float f10, d dVar) {
    }

    public static /* synthetic */ void l(final CarouselLayoutManager carouselLayoutManager, View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        carouselLayoutManager.getClass();
        if (i10 == i14 && i11 == i15 && i12 == i16 && i13 == i17) {
            return;
        }
        view.post(new Runnable() { // from class: w5.b
            @Override // java.lang.Runnable
            public final void run() {
                this.f50355a.e0();
            }
        });
    }

    private void l0(g gVar) {
        int i10 = this.f38888c;
        int i11 = this.f38887b;
        if (i10 <= i11) {
            this.f38893h = X() ? gVar.h() : gVar.l();
        } else {
            this.f38893h = gVar.j(this.f38886a, i11, i10);
        }
        this.f38890e.d(this.f38893h.g());
    }

    private void m0() {
        int itemCount = getItemCount();
        int i10 = this.f38898m;
        if (itemCount == i10 || this.f38892g == null) {
            return;
        }
        if (this.f38891f.h(this, i10)) {
            e0();
        }
        this.f38898m = itemCount;
    }

    private void n0() {
        if (!this.f38889d || getChildCount() < 1) {
            return;
        }
        int i10 = 0;
        while (i10 < getChildCount() - 1) {
            int position = getPosition(getChildAt(i10));
            int i11 = i10 + 1;
            int position2 = getPosition(getChildAt(i11));
            if (position > position2) {
                a0();
                throw new IllegalStateException("Detected invalid child order. Child at index [" + i10 + "] had adapter position [" + position + "] and child at index [" + i11 + "] had adapter position [" + position2 + "].");
            }
            i10 = i11;
        }
    }

    private void r(View view, int i10, b bVar) {
        float f10 = this.f38893h.f() / 2.0f;
        addView(view, i10);
        float f11 = bVar.f38904c;
        this.f38896k.k(view, (int) (f11 - f10), (int) (f11 + f10));
        k0(view, bVar.f38903b, bVar.f38905d);
    }

    private float s(float f10, float f11) {
        return X() ? f10 - f11 : f10 + f11;
    }

    private int scrollBy(int i10, RecyclerView.v vVar, RecyclerView.A a10) {
        if (getChildCount() == 0 || i10 == 0) {
            return 0;
        }
        if (this.f38892g == null) {
            d0(vVar);
        }
        int iB = B(i10, this.f38886a, this.f38887b, this.f38888c);
        this.f38886a += iB;
        l0(this.f38892g);
        float f10 = this.f38893h.f() / 2.0f;
        float fY = y(getPosition(getChildAt(0)));
        Rect rect = new Rect();
        float f11 = X() ? this.f38893h.h().f38937b : this.f38893h.a().f38937b;
        float f12 = Float.MAX_VALUE;
        for (int i11 = 0; i11 < getChildCount(); i11++) {
            View childAt = getChildAt(i11);
            float fAbs = Math.abs(f11 - c0(childAt, fY, f10, rect));
            if (childAt != null && fAbs < f12) {
                this.f38899n = getPosition(childAt);
                f12 = fAbs;
            }
            fY = s(fY, this.f38893h.f());
        }
        D(vVar, a10);
        return iB;
    }

    private float t(float f10, float f11) {
        return X() ? f10 + f11 : f10 - f11;
    }

    private void u(RecyclerView.v vVar, int i10, int i11) {
        if (i10 < 0 || i10 >= getItemCount()) {
            return;
        }
        b bVarB0 = b0(vVar, y(i10), i10);
        r(bVarB0.f38902a, i11, bVarB0);
    }

    private void v(RecyclerView.v vVar, RecyclerView.A a10, int i10) {
        float fY = y(i10);
        while (i10 < a10.b()) {
            b bVarB0 = b0(vVar, fY, i10);
            if (Y(bVarB0.f38904c, bVarB0.f38905d)) {
                return;
            }
            fY = s(fY, this.f38893h.f());
            if (!Z(bVarB0.f38904c, bVarB0.f38905d)) {
                r(bVarB0.f38902a, -1, bVarB0);
            }
            i10++;
        }
    }

    private void w(RecyclerView.v vVar, int i10) {
        float fY = y(i10);
        while (i10 >= 0) {
            b bVarB0 = b0(vVar, fY, i10);
            if (Z(bVarB0.f38904c, bVarB0.f38905d)) {
                return;
            }
            fY = t(fY, this.f38893h.f());
            if (!Y(bVarB0.f38904c, bVarB0.f38905d)) {
                r(bVarB0.f38902a, 0, bVarB0);
            }
            i10--;
        }
    }

    private float x(View view, float f10, d dVar) {
        f.c cVar = dVar.f38908a;
        float f11 = cVar.f38937b;
        f.c cVar2 = dVar.f38909b;
        float fB = p196t5.a.b(f11, cVar2.f38937b, cVar.f38936a, cVar2.f38936a, f10);
        if (dVar.f38909b != this.f38893h.c() && dVar.f38908a != this.f38893h.j()) {
            return fB;
        }
        float fD = this.f38896k.d((RecyclerView.q) view.getLayoutParams()) / this.f38893h.f();
        f.c cVar3 = dVar.f38909b;
        return fB + ((f10 - cVar3.f38936a) * ((1.0f - cVar3.f38938c) + fD));
    }

    private float y(int i10) {
        return s(R() - this.f38886a, this.f38893h.f() * i10);
    }

    private int z(RecyclerView.A a10, g gVar) {
        boolean zX = X();
        f fVarL = zX ? gVar.l() : gVar.h();
        f.c cVarA = zX ? fVarL.a() : fVarL.h();
        int iB = (int) (((((a10.b() - 1) * fVarL.f()) * (zX ? -1.0f : 1.0f)) - (cVarA.f38936a - R())) + (O() - cVarA.f38936a) + (zX ? -cVarA.f38942g : cVarA.f38943h));
        return zX ? Math.min(0, iB) : Math.max(0, iB);
    }

    int A(int i10) {
        return (int) (this.f38886a - U(i10, J(i10)));
    }

    int M(int i10, f fVar) {
        return U(i10, fVar) - this.f38886a;
    }

    boolean X() {
        return d() && getLayoutDirection() == 1;
    }

    @Override // com.google.android.material.carousel.b
    public int a() {
        return getWidth();
    }

    @Override // com.google.android.material.carousel.b
    public int b() {
        return getHeight();
    }

    @Override // com.google.android.material.carousel.b
    public int c() {
        return this.f38900o;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public boolean canScrollHorizontally() {
        return d();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public boolean canScrollVertically() {
        return !d();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int computeHorizontalScrollExtent(RecyclerView.A a10) {
        if (getChildCount() == 0 || this.f38892g == null || getItemCount() <= 1) {
            return 0;
        }
        return (int) (getWidth() * (this.f38892g.g().f() / computeHorizontalScrollRange(a10)));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int computeHorizontalScrollOffset(RecyclerView.A a10) {
        return this.f38886a;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int computeHorizontalScrollRange(RecyclerView.A a10) {
        return this.f38888c - this.f38887b;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.z.b
    public PointF computeScrollVectorForPosition(int i10) {
        if (this.f38892g == null) {
            return null;
        }
        int iM = M(i10, J(i10));
        return d() ? new PointF(iM, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) : new PointF(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, iM);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int computeVerticalScrollExtent(RecyclerView.A a10) {
        if (getChildCount() == 0 || this.f38892g == null || getItemCount() <= 1) {
            return 0;
        }
        return (int) (getHeight() * (this.f38892g.g().f() / computeVerticalScrollRange(a10)));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int computeVerticalScrollOffset(RecyclerView.A a10) {
        return this.f38886a;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int computeVerticalScrollRange(RecyclerView.A a10) {
        return this.f38888c - this.f38887b;
    }

    @Override // com.google.android.material.carousel.b
    public boolean d() {
        return this.f38896k.f38918a == 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public RecyclerView.q generateDefaultLayoutParams() {
        return new RecyclerView.q(-2, -2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void getDecoratedBoundsWithMargins(View view, Rect rect) {
        super.getDecoratedBoundsWithMargins(view, rect);
        float fCenterY = rect.centerY();
        if (d()) {
            fCenterY = rect.centerX();
        }
        float fL = L(fCenterY, W(this.f38893h.g(), fCenterY, true));
        boolean zD = d();
        float fHeight = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        float fWidth = zD ? (rect.width() - fL) / 2.0f : 0.0f;
        if (!d()) {
            fHeight = (rect.height() - fL) / 2.0f;
        }
        rect.set((int) (rect.left + fWidth), (int) (rect.top + fHeight), (int) (rect.right - fWidth), (int) (rect.bottom - fHeight));
    }

    public int getOrientation() {
        return this.f38896k.f38918a;
    }

    public void h0(int i10) {
        this.f38900o = i10;
        e0();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public boolean isAutoMeasureEnabled() {
        return true;
    }

    public void j0(com.google.android.material.carousel.d dVar) {
        this.f38891f = dVar;
        e0();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void measureChildWithMargins(View view, int i10, int i11) {
        throw new IllegalStateException("All children of a RecyclerView using CarouselLayoutManager must use MaskableFrameLayout as their root ViewGroup.");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void onAttachedToWindow(RecyclerView recyclerView) {
        super.onAttachedToWindow(recyclerView);
        this.f38891f.e(recyclerView.getContext());
        e0();
        recyclerView.addOnLayoutChangeListener(this.f38897l);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void onDetachedFromWindow(RecyclerView recyclerView, RecyclerView.v vVar) {
        super.onDetachedFromWindow(recyclerView, vVar);
        recyclerView.removeOnLayoutChangeListener(this.f38897l);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public View onFocusSearchFailed(View view, int i10, RecyclerView.v vVar, RecyclerView.A a10) {
        int iConvertFocusDirectionToLayoutDirection;
        if (getChildCount() == 0 || (iConvertFocusDirectionToLayoutDirection = convertFocusDirectionToLayoutDirection(i10)) == Integer.MIN_VALUE) {
            return null;
        }
        if (iConvertFocusDirectionToLayoutDirection == -1) {
            if (getPosition(view) == 0) {
                return null;
            }
            u(vVar, getPosition(getChildAt(0)) - 1, 0);
            return F();
        }
        if (getPosition(view) == getItemCount() - 1) {
            return null;
        }
        u(vVar, getPosition(getChildAt(getChildCount() - 1)) + 1, -1);
        return E();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        if (getChildCount() > 0) {
            accessibilityEvent.setFromIndex(getPosition(getChildAt(0)));
            accessibilityEvent.setToIndex(getPosition(getChildAt(getChildCount() - 1)));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void onItemsAdded(RecyclerView recyclerView, int i10, int i11) {
        super.onItemsAdded(recyclerView, i10, i11);
        m0();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void onItemsRemoved(RecyclerView recyclerView, int i10, int i11) {
        super.onItemsRemoved(recyclerView, i10, i11);
        m0();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void onLayoutChildren(RecyclerView.v vVar, RecyclerView.A a10) {
        if (a10.b() <= 0 || G() <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            removeAndRecycleAllViews(vVar);
            this.f38894i = 0;
            return;
        }
        boolean zX = X();
        boolean z9 = this.f38892g == null;
        if (z9) {
            d0(vVar);
        }
        int iC = C(this.f38892g);
        int iZ = z(a10, this.f38892g);
        this.f38887b = zX ? iZ : iC;
        if (zX) {
            iZ = iC;
        }
        this.f38888c = iZ;
        if (z9) {
            this.f38886a = iC;
            this.f38895j = this.f38892g.i(getItemCount(), this.f38887b, this.f38888c, X());
            int i10 = this.f38899n;
            if (i10 != -1) {
                this.f38886a = U(i10, J(i10));
            }
        }
        int i11 = this.f38886a;
        this.f38886a = i11 + B(0, i11, this.f38887b, this.f38888c);
        this.f38894i = I.a.b(this.f38894i, 0, a10.b());
        l0(this.f38892g);
        detachAndScrapAttachedViews(vVar);
        D(vVar, a10);
        this.f38898m = getItemCount();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void onLayoutCompleted(RecyclerView.A a10) {
        super.onLayoutCompleted(a10);
        if (getChildCount() == 0) {
            this.f38894i = 0;
        } else {
            this.f38894i = getPosition(getChildAt(0));
        }
        n0();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public boolean requestChildRectangleOnScreen(RecyclerView recyclerView, View view, Rect rect, boolean z9, boolean z10) {
        int iV;
        if (this.f38892g == null || (iV = V(getPosition(view), J(getPosition(view)))) == 0) {
            return false;
        }
        g0(recyclerView, V(getPosition(view), this.f38892g.j(this.f38886a + B(iV, this.f38886a, this.f38887b, this.f38888c), this.f38887b, this.f38888c)));
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int scrollHorizontallyBy(int i10, RecyclerView.v vVar, RecyclerView.A a10) {
        if (canScrollHorizontally()) {
            return scrollBy(i10, vVar, a10);
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void scrollToPosition(int i10) {
        this.f38899n = i10;
        if (this.f38892g == null) {
            return;
        }
        this.f38886a = U(i10, J(i10));
        this.f38894i = I.a.b(i10, 0, Math.max(0, getItemCount() - 1));
        l0(this.f38892g);
        requestLayout();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int scrollVerticallyBy(int i10, RecyclerView.v vVar, RecyclerView.A a10) {
        if (canScrollVertically()) {
            return scrollBy(i10, vVar, a10);
        }
        return 0;
    }

    public void setOrientation(int i10) {
        if (i10 != 0 && i10 != 1) {
            throw new IllegalArgumentException("invalid orientation:" + i10);
        }
        assertNotInLayoutOrScroll(null);
        com.google.android.material.carousel.c cVar = this.f38896k;
        if (cVar == null || i10 != cVar.f38918a) {
            this.f38896k = com.google.android.material.carousel.c.b(this, i10);
            e0();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void smoothScrollToPosition(RecyclerView recyclerView, RecyclerView.A a10, int i10) {
        a aVar = new a(recyclerView.getContext());
        aVar.setTargetPosition(i10);
        startSmoothScroll(aVar);
    }

    public CarouselLayoutManager(com.google.android.material.carousel.d dVar) {
        this(dVar, 0);
    }

    public CarouselLayoutManager(com.google.android.material.carousel.d dVar, int i10) {
        this.f38889d = false;
        this.f38890e = new c();
        this.f38894i = 0;
        this.f38897l = new View.OnLayoutChangeListener() { // from class: w5.a
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
                CarouselLayoutManager.l(this.f50354a, view, i11, i12, i13, i14, i15, i16, i17, i18);
            }
        };
        this.f38899n = -1;
        this.f38900o = 0;
        j0(dVar);
        setOrientation(i10);
    }

    @SuppressLint({"UnknownNullness"})
    public CarouselLayoutManager(Context context, AttributeSet attributeSet, int i10, int i11) {
        this.f38889d = false;
        this.f38890e = new c();
        this.f38894i = 0;
        this.f38897l = new View.OnLayoutChangeListener() { // from class: w5.a
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19) {
                CarouselLayoutManager.l(this.f50354a, view, i12, i13, i14, i15, i16, i17, i18, i19);
            }
        };
        this.f38899n = -1;
        this.f38900o = 0;
        j0(new h());
        i0(context, attributeSet);
    }
}
