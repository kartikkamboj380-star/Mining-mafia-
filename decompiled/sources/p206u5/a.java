package p206u5;

import H5.c;
import H5.d;
import K5.g;
import K5.k;
import O.AbstractC0845c0;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.material.internal.j;
import com.google.android.material.internal.m;
import com.unity3d.services.UnityAdsConstants;
import java.lang.ref.WeakReference;
import java.text.NumberFormat;
import p186s5.e;
import p186s5.i;

/* JADX INFO: loaded from: classes2.dex */
public class a extends Drawable implements j.b {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final int f49926v = p186s5.j.f48844n;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static final int f49927w = p186s5.a.f48618c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final WeakReference f49928a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final g f49929b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final j f49930c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Rect f49931d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final b f49932e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private float f49933f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private float f49934g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f49935h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private float f49936i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private float f49937j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private float f49938k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private WeakReference f49939l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private WeakReference f49940m;

    /* JADX INFO: renamed from: u5.a$a, reason: collision with other inner class name */
    class RunnableC0544a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ View f49941a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ FrameLayout f49942b;

        RunnableC0544a(View view, FrameLayout frameLayout) {
            this.f49941a = view;
            this.f49942b = frameLayout;
        }

        @Override // java.lang.Runnable
        public void run() {
            a.this.Z(this.f49941a, this.f49942b);
        }
    }

    private a(Context context, int i10, int i11, int i12, b.a aVar) {
        this.f49928a = new WeakReference(context);
        m.c(context);
        this.f49931d = new Rect();
        j jVar = new j(this);
        this.f49930c = jVar;
        jVar.g().setTextAlign(Paint.Align.CENTER);
        b bVar = new b(context, i10, i11, i12, aVar);
        this.f49932e = bVar;
        this.f49929b = new g(k.b(context, C() ? bVar.o() : bVar.k(), C() ? bVar.n() : bVar.j()).m());
        R();
    }

    private int A() {
        int iT = C() ? this.f49932e.t() : this.f49932e.u();
        if (this.f49932e.f49954k == 1) {
            iT += C() ? this.f49932e.f49953j : this.f49932e.f49952i;
        }
        return iT + this.f49932e.d();
    }

    private int B() {
        int iE = this.f49932e.E();
        if (C()) {
            iE = this.f49932e.D();
            Context context = (Context) this.f49928a.get();
            if (context != null) {
                iE = p196t5.a.c(iE, iE - this.f49932e.v(), p196t5.a.b(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f, 0.3f, 1.0f, c.f(context) - 1.0f));
            }
        }
        if (this.f49932e.f49954k == 0) {
            iE -= Math.round(this.f49938k);
        }
        return iE + this.f49932e.e();
    }

    private boolean C() {
        return E() || D();
    }

    private boolean F() {
        FrameLayout frameLayoutL = l();
        return frameLayoutL != null && frameLayoutL.getId() == e.f48775v;
    }

    private void G() {
        this.f49930c.g().setAlpha(getAlpha());
        invalidateSelf();
    }

    private void H() {
        ColorStateList colorStateListValueOf = ColorStateList.valueOf(this.f49932e.g());
        if (this.f49929b.v() != colorStateListValueOf) {
            this.f49929b.W(colorStateListValueOf);
            invalidateSelf();
        }
    }

    private void I() {
        this.f49930c.l(true);
        K();
        a0();
        invalidateSelf();
    }

    private void J() {
        WeakReference weakReference = this.f49939l;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        View view = (View) this.f49939l.get();
        WeakReference weakReference2 = this.f49940m;
        Z(view, weakReference2 != null ? (FrameLayout) weakReference2.get() : null);
    }

    private void K() {
        Context context = (Context) this.f49928a.get();
        if (context == null) {
            return;
        }
        this.f49929b.setShapeAppearanceModel(k.b(context, C() ? this.f49932e.o() : this.f49932e.k(), C() ? this.f49932e.n() : this.f49932e.j()).m());
        invalidateSelf();
    }

    private void L() {
        d dVar;
        Context context = (Context) this.f49928a.get();
        if (context == null || this.f49930c.e() == (dVar = new d(context, this.f49932e.C()))) {
            return;
        }
        this.f49930c.k(dVar, context);
        M();
        a0();
        invalidateSelf();
    }

    private void M() {
        this.f49930c.g().setColor(this.f49932e.l());
        invalidateSelf();
    }

    private void N() {
        b0();
        this.f49930c.l(true);
        a0();
        invalidateSelf();
    }

    private void O() {
        if (E()) {
            return;
        }
        I();
    }

    private void P() {
        I();
    }

    private void Q() {
        boolean zI = this.f49932e.I();
        setVisible(zI, false);
        if (!c.f49985a || l() == null || zI) {
            return;
        }
        ((ViewGroup) l().getParent()).invalidate();
    }

    private void R() {
        K();
        L();
        N();
        I();
        G();
        H();
        M();
        J();
        a0();
        Q();
    }

    private void X(View view) {
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        if (viewGroup == null || viewGroup.getId() != e.f48775v) {
            WeakReference weakReference = this.f49940m;
            if (weakReference == null || weakReference.get() != viewGroup) {
                Y(view);
                FrameLayout frameLayout = new FrameLayout(view.getContext());
                frameLayout.setId(e.f48775v);
                frameLayout.setClipChildren(false);
                frameLayout.setClipToPadding(false);
                frameLayout.setLayoutParams(view.getLayoutParams());
                frameLayout.setMinimumWidth(view.getWidth());
                frameLayout.setMinimumHeight(view.getHeight());
                int iIndexOfChild = viewGroup.indexOfChild(view);
                viewGroup.removeViewAt(iIndexOfChild);
                view.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                frameLayout.addView(view);
                viewGroup.addView(frameLayout, iIndexOfChild);
                this.f49940m = new WeakReference(frameLayout);
                frameLayout.post(new RunnableC0544a(view, frameLayout));
            }
        }
    }

    private static void Y(View view) {
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        viewGroup.setClipChildren(false);
        viewGroup.setClipToPadding(false);
    }

    private void a0() {
        Context context = (Context) this.f49928a.get();
        WeakReference weakReference = this.f49939l;
        View view = weakReference != null ? (View) weakReference.get() : null;
        if (context == null || view == null) {
            return;
        }
        Rect rect = new Rect();
        rect.set(this.f49931d);
        Rect rect2 = new Rect();
        view.getDrawingRect(rect2);
        WeakReference weakReference2 = this.f49940m;
        ViewGroup viewGroup = weakReference2 != null ? (ViewGroup) weakReference2.get() : null;
        if (viewGroup != null || c.f49985a) {
            if (viewGroup == null) {
                viewGroup = (ViewGroup) view.getParent();
            }
            viewGroup.offsetDescendantRectToMyCoords(view, rect2);
        }
        c(rect2, view);
        c.f(this.f49931d, this.f49933f, this.f49934g, this.f49937j, this.f49938k);
        float f10 = this.f49936i;
        if (f10 != -1.0f) {
            this.f49929b.T(f10);
        }
        if (rect.equals(this.f49931d)) {
            return;
        }
        this.f49929b.setBounds(this.f49931d);
    }

    private void b(View view) {
        float y9;
        float x10;
        View viewL = l();
        if (viewL == null) {
            if (!(view.getParent() instanceof View)) {
                return;
            }
            float y10 = view.getY();
            x10 = view.getX();
            viewL = (View) view.getParent();
            y9 = y10;
        } else if (!F()) {
            y9 = 0.0f;
            x10 = 0.0f;
        } else {
            if (!(viewL.getParent() instanceof View)) {
                return;
            }
            y9 = viewL.getY();
            x10 = viewL.getX();
            viewL = (View) viewL.getParent();
        }
        float fZ = z(viewL, y9);
        float fO = o(viewL, x10);
        float fJ = j(viewL, y9);
        float fU = u(viewL, x10);
        if (fZ < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            this.f49934g += Math.abs(fZ);
        }
        if (fO < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            this.f49933f += Math.abs(fO);
        }
        if (fJ > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            this.f49934g -= Math.abs(fJ);
        }
        if (fU > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            this.f49933f -= Math.abs(fU);
        }
    }

    private void b0() {
        if (p() != -2) {
            this.f49935h = ((int) Math.pow(10.0d, ((double) p()) - 1.0d)) - 1;
        } else {
            this.f49935h = q();
        }
    }

    private void c(Rect rect, View view) {
        float f10 = C() ? this.f49932e.f49947d : this.f49932e.f49946c;
        this.f49936i = f10;
        if (f10 != -1.0f) {
            this.f49937j = f10;
            this.f49938k = f10;
        } else {
            this.f49937j = Math.round((C() ? this.f49932e.f49950g : this.f49932e.f49948e) / 2.0f);
            this.f49938k = Math.round((C() ? this.f49932e.f49951h : this.f49932e.f49949f) / 2.0f);
        }
        if (C()) {
            String strI = i();
            this.f49937j = Math.max(this.f49937j, (this.f49930c.h(strI) / 2.0f) + this.f49932e.i());
            float fMax = Math.max(this.f49938k, (this.f49930c.f(strI) / 2.0f) + this.f49932e.m());
            this.f49938k = fMax;
            this.f49937j = Math.max(this.f49937j, fMax);
        }
        int iB = B();
        int iH = this.f49932e.h();
        if (iH == 8388691 || iH == 8388693) {
            this.f49934g = rect.bottom - iB;
        } else {
            this.f49934g = rect.top + iB;
        }
        int iA = A();
        int iH2 = this.f49932e.h();
        if (iH2 == 8388659 || iH2 == 8388691) {
            this.f49933f = AbstractC0845c0.z(view) == 0 ? (rect.left - this.f49937j) + iA : (rect.right + this.f49937j) - iA;
        } else {
            this.f49933f = AbstractC0845c0.z(view) == 0 ? (rect.right + this.f49937j) - iA : (rect.left - this.f49937j) + iA;
        }
        if (this.f49932e.H()) {
            b(view);
        }
    }

    public static a f(Context context) {
        return new a(context, 0, f49927w, f49926v, null);
    }

    static a g(Context context, b.a aVar) {
        return new a(context, 0, f49927w, f49926v, aVar);
    }

    private void h(Canvas canvas) {
        String strI = i();
        if (strI != null) {
            Rect rect = new Rect();
            this.f49930c.g().getTextBounds(strI, 0, strI.length(), rect);
            float fExactCenterY = this.f49934g - rect.exactCenterY();
            canvas.drawText(strI, this.f49933f, rect.bottom <= 0 ? (int) fExactCenterY : Math.round(fExactCenterY), this.f49930c.g());
        }
    }

    private String i() {
        if (E()) {
            return x();
        }
        if (D()) {
            return s();
        }
        return null;
    }

    private float j(View view, float f10) {
        if (!(view.getParent() instanceof View)) {
            return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        }
        return ((this.f49934g + this.f49938k) - (((View) view.getParent()).getHeight() - view.getY())) + f10;
    }

    private CharSequence m() {
        return this.f49932e.r();
    }

    private float o(View view, float f10) {
        return (this.f49933f - this.f49937j) + view.getX() + f10;
    }

    private String s() {
        if (this.f49935h == -2 || r() <= this.f49935h) {
            return NumberFormat.getInstance(this.f49932e.z()).format(r());
        }
        Context context = (Context) this.f49928a.get();
        return context == null ? "" : String.format(this.f49932e.z(), context.getString(i.f48820p), Integer.valueOf(this.f49935h), "+");
    }

    private String t() {
        Context context;
        if (this.f49932e.s() == 0 || (context = (Context) this.f49928a.get()) == null) {
            return null;
        }
        return (this.f49935h == -2 || r() <= this.f49935h) ? context.getResources().getQuantityString(this.f49932e.s(), r(), Integer.valueOf(r())) : context.getString(this.f49932e.p(), Integer.valueOf(this.f49935h));
    }

    private float u(View view, float f10) {
        if (!(view.getParent() instanceof View)) {
            return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        }
        return ((this.f49933f + this.f49937j) - (((View) view.getParent()).getWidth() - view.getX())) + f10;
    }

    private String x() {
        String strW = w();
        int iP = p();
        if (iP == -2 || strW == null || strW.length() <= iP) {
            return strW;
        }
        Context context = (Context) this.f49928a.get();
        if (context == null) {
            return "";
        }
        return String.format(context.getString(i.f48813i), strW.substring(0, iP - 1), "…");
    }

    private CharSequence y() {
        CharSequence charSequenceQ = this.f49932e.q();
        return charSequenceQ != null ? charSequenceQ : w();
    }

    private float z(View view, float f10) {
        return (this.f49934g - this.f49938k) + view.getY() + f10;
    }

    public boolean D() {
        return !this.f49932e.G() && this.f49932e.F();
    }

    public boolean E() {
        return this.f49932e.G();
    }

    public void S(int i10) {
        this.f49932e.L(i10);
        H();
    }

    public void T(int i10) {
        if (this.f49930c.g().getColor() != i10) {
            this.f49932e.M(i10);
            M();
        }
    }

    public void U(int i10) {
        int iMax = Math.max(0, i10);
        if (this.f49932e.y() != iMax) {
            this.f49932e.N(iMax);
            O();
        }
    }

    public void V(String str) {
        if (TextUtils.equals(this.f49932e.B(), str)) {
            return;
        }
        this.f49932e.O(str);
        P();
    }

    public void W(boolean z9) {
        this.f49932e.P(z9);
        Q();
    }

    public void Z(View view, FrameLayout frameLayout) {
        this.f49939l = new WeakReference(view);
        boolean z9 = c.f49985a;
        if (z9 && frameLayout == null) {
            X(view);
        } else {
            this.f49940m = new WeakReference(frameLayout);
        }
        if (!z9) {
            Y(view);
        }
        a0();
        invalidateSelf();
    }

    @Override // com.google.android.material.internal.j.b
    public void a() {
        invalidateSelf();
    }

    public void d() {
        if (this.f49932e.F()) {
            this.f49932e.a();
            O();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        if (getBounds().isEmpty() || getAlpha() == 0 || !isVisible()) {
            return;
        }
        this.f49929b.draw(canvas);
        if (C()) {
            h(canvas);
        }
    }

    public void e() {
        if (this.f49932e.G()) {
            this.f49932e.b();
            P();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f49932e.f();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f49931d.height();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f49931d.width();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        return false;
    }

    public CharSequence k() {
        if (!isVisible()) {
            return null;
        }
        if (E()) {
            return y();
        }
        return D() ? t() : m();
    }

    public FrameLayout l() {
        WeakReference weakReference = this.f49940m;
        if (weakReference != null) {
            return (FrameLayout) weakReference.get();
        }
        return null;
    }

    public int n() {
        return this.f49932e.u();
    }

    @Override // android.graphics.drawable.Drawable, com.google.android.material.internal.j.b
    public boolean onStateChange(int[] iArr) {
        return super.onStateChange(iArr);
    }

    public int p() {
        return this.f49932e.w();
    }

    public int q() {
        return this.f49932e.x();
    }

    public int r() {
        if (this.f49932e.F()) {
            return this.f49932e.y();
        }
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        this.f49932e.K(i10);
        G();
    }

    b.a v() {
        return this.f49932e.A();
    }

    public String w() {
        return this.f49932e.B();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
    }
}
