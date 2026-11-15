package K5;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Looper;
import android.util.AttributeSet;
import android.util.Log;
import com.unity3d.services.UnityAdsConstants;
import java.util.BitSet;

/* JADX INFO: loaded from: classes2.dex */
public class g extends Drawable implements n {

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private static final String f2782O = "g";

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    private static final Paint f2783P;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private final J5.a f2784G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private final l.b f2785H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private final l f2786I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private PorterDuffColorFilter f2787J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    private PorterDuffColorFilter f2788K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    private int f2789L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    private final RectF f2790M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    private boolean f2791N;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private c f2792a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final m.g[] f2793b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final m.g[] f2794c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final BitSet f2795d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f2796e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Matrix f2797f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Path f2798g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Path f2799h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final RectF f2800i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final RectF f2801j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final Region f2802k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final Region f2803l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private k f2804m;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final Paint f2805v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final Paint f2806w;

    class a implements l.b {
        a() {
        }

        @Override // K5.l.b
        public void a(m mVar, Matrix matrix, int i10) {
            g.this.f2795d.set(i10, mVar.e());
            g.this.f2793b[i10] = mVar.f(matrix);
        }

        @Override // K5.l.b
        public void b(m mVar, Matrix matrix, int i10) {
            g.this.f2795d.set(i10 + 4, mVar.e());
            g.this.f2794c[i10] = mVar.f(matrix);
        }
    }

    class b implements k.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ float f2808a;

        b(float f10) {
            this.f2808a = f10;
        }

        @Override // K5.k.c
        public K5.c a(K5.c cVar) {
            return cVar instanceof i ? cVar : new K5.b(this.f2808a, cVar);
        }
    }

    static {
        Paint paint = new Paint(1);
        f2783P = paint;
        paint.setColor(-1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
    }

    public g() {
        this(new k());
    }

    private float C() {
        return K() ? this.f2806w.getStrokeWidth() / 2.0f : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    }

    private boolean I() {
        c cVar = this.f2792a;
        int i10 = cVar.f2826q;
        if (i10 == 1 || cVar.f2827r <= 0) {
            return false;
        }
        return i10 == 2 || S();
    }

    private boolean J() {
        Paint.Style style = this.f2792a.f2831v;
        return style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.FILL;
    }

    private boolean K() {
        Paint.Style style = this.f2792a.f2831v;
        return (style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.STROKE) && this.f2806w.getStrokeWidth() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    }

    private void M() {
        super.invalidateSelf();
    }

    private void P(Canvas canvas) {
        if (I()) {
            canvas.save();
            R(canvas);
            if (!this.f2791N) {
                n(canvas);
                canvas.restore();
                return;
            }
            int iWidth = (int) (this.f2790M.width() - getBounds().width());
            int iHeight = (int) (this.f2790M.height() - getBounds().height());
            if (iWidth < 0 || iHeight < 0) {
                throw new IllegalStateException("Invalid shadow bounds. Check that the treatments result in a valid path.");
            }
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(((int) this.f2790M.width()) + (this.f2792a.f2827r * 2) + iWidth, ((int) this.f2790M.height()) + (this.f2792a.f2827r * 2) + iHeight, Bitmap.Config.ARGB_8888);
            Canvas canvas2 = new Canvas(bitmapCreateBitmap);
            float f10 = (getBounds().left - this.f2792a.f2827r) - iWidth;
            float f11 = (getBounds().top - this.f2792a.f2827r) - iHeight;
            canvas2.translate(-f10, -f11);
            n(canvas2);
            canvas.drawBitmap(bitmapCreateBitmap, f10, f11, (Paint) null);
            bitmapCreateBitmap.recycle();
            canvas.restore();
        }
    }

    private static int Q(int i10, int i11) {
        return (i10 * (i11 + (i11 >>> 7))) >>> 8;
    }

    private void R(Canvas canvas) {
        canvas.translate(z(), A());
    }

    private boolean e0(int[] iArr) {
        boolean z9;
        int color;
        int colorForState;
        int color2;
        int colorForState2;
        if (this.f2792a.f2813d == null || color2 == (colorForState2 = this.f2792a.f2813d.getColorForState(iArr, (color2 = this.f2805v.getColor())))) {
            z9 = false;
        } else {
            this.f2805v.setColor(colorForState2);
            z9 = true;
        }
        if (this.f2792a.f2814e == null || color == (colorForState = this.f2792a.f2814e.getColorForState(iArr, (color = this.f2806w.getColor())))) {
            return z9;
        }
        this.f2806w.setColor(colorForState);
        return true;
    }

    private PorterDuffColorFilter f(Paint paint, boolean z9) {
        if (!z9) {
            return null;
        }
        int color = paint.getColor();
        int iL = l(color);
        this.f2789L = iL;
        if (iL != color) {
            return new PorterDuffColorFilter(iL, PorterDuff.Mode.SRC_IN);
        }
        return null;
    }

    private boolean f0() {
        PorterDuffColorFilter porterDuffColorFilter = this.f2787J;
        PorterDuffColorFilter porterDuffColorFilter2 = this.f2788K;
        c cVar = this.f2792a;
        this.f2787J = k(cVar.f2816g, cVar.f2817h, this.f2805v, true);
        c cVar2 = this.f2792a;
        this.f2788K = k(cVar2.f2815f, cVar2.f2817h, this.f2806w, false);
        c cVar3 = this.f2792a;
        if (cVar3.f2830u) {
            this.f2784G.d(cVar3.f2816g.getColorForState(getState(), 0));
        }
        return (N.b.a(porterDuffColorFilter, this.f2787J) && N.b.a(porterDuffColorFilter2, this.f2788K)) ? false : true;
    }

    private void g(RectF rectF, Path path) {
        h(rectF, path);
        if (this.f2792a.f2819j != 1.0f) {
            this.f2797f.reset();
            Matrix matrix = this.f2797f;
            float f10 = this.f2792a.f2819j;
            matrix.setScale(f10, f10, rectF.width() / 2.0f, rectF.height() / 2.0f);
            path.transform(this.f2797f);
        }
        path.computeBounds(this.f2790M, true);
    }

    private void g0() {
        float fH = H();
        this.f2792a.f2827r = (int) Math.ceil(0.75f * fH);
        this.f2792a.f2828s = (int) Math.ceil(fH * 0.25f);
        f0();
        M();
    }

    private void i() {
        k kVarY = B().y(new b(-C()));
        this.f2804m = kVarY;
        this.f2786I.e(kVarY, this.f2792a.f2820k, t(), this.f2799h);
    }

    private PorterDuffColorFilter j(ColorStateList colorStateList, PorterDuff.Mode mode, boolean z9) {
        int colorForState = colorStateList.getColorForState(getState(), 0);
        if (z9) {
            colorForState = l(colorForState);
        }
        this.f2789L = colorForState;
        return new PorterDuffColorFilter(colorForState, mode);
    }

    private PorterDuffColorFilter k(ColorStateList colorStateList, PorterDuff.Mode mode, Paint paint, boolean z9) {
        return (colorStateList == null || mode == null) ? f(paint, z9) : j(colorStateList, mode, z9);
    }

    public static g m(Context context, float f10, ColorStateList colorStateList) {
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(p256z5.a.c(context, p186s5.a.f48637s, g.class.getSimpleName()));
        }
        g gVar = new g();
        gVar.L(context);
        gVar.W(colorStateList);
        gVar.V(f10);
        return gVar;
    }

    private void n(Canvas canvas) {
        if (this.f2795d.cardinality() > 0) {
            Log.w(f2782O, "Compatibility shadow requested but can't be drawn for all operations in this shape.");
        }
        if (this.f2792a.f2828s != 0) {
            canvas.drawPath(this.f2798g, this.f2784G.c());
        }
        for (int i10 = 0; i10 < 4; i10++) {
            this.f2793b[i10].a(this.f2784G, this.f2792a.f2827r, canvas);
            this.f2794c[i10].a(this.f2784G, this.f2792a.f2827r, canvas);
        }
        if (this.f2791N) {
            int iZ = z();
            int iA = A();
            canvas.translate(-iZ, -iA);
            canvas.drawPath(this.f2798g, f2783P);
            canvas.translate(iZ, iA);
        }
    }

    private void o(Canvas canvas) {
        p(canvas, this.f2805v, this.f2798g, this.f2792a.f2810a, s());
    }

    private void p(Canvas canvas, Paint paint, Path path, k kVar, RectF rectF) {
        if (!kVar.u(rectF)) {
            canvas.drawPath(path, paint);
        } else {
            float fA = kVar.t().a(rectF) * this.f2792a.f2820k;
            canvas.drawRoundRect(rectF, fA, fA, paint);
        }
    }

    private RectF t() {
        this.f2801j.set(s());
        float fC = C();
        this.f2801j.inset(fC, fC);
        return this.f2801j;
    }

    public int A() {
        c cVar = this.f2792a;
        return (int) (((double) cVar.f2828s) * Math.cos(Math.toRadians(cVar.f2829t)));
    }

    public k B() {
        return this.f2792a.f2810a;
    }

    public ColorStateList D() {
        return this.f2792a.f2816g;
    }

    public float E() {
        return this.f2792a.f2810a.r().a(s());
    }

    public float F() {
        return this.f2792a.f2810a.t().a(s());
    }

    public float G() {
        return this.f2792a.f2825p;
    }

    public float H() {
        return u() + G();
    }

    public void L(Context context) {
        this.f2792a.f2811b = new C5.a(context);
        g0();
    }

    public boolean N() {
        C5.a aVar = this.f2792a.f2811b;
        return aVar != null && aVar.d();
    }

    public boolean O() {
        return this.f2792a.f2810a.u(s());
    }

    public boolean S() {
        return (O() || this.f2798g.isConvex() || Build.VERSION.SDK_INT >= 29) ? false : true;
    }

    public void T(float f10) {
        setShapeAppearanceModel(this.f2792a.f2810a.w(f10));
    }

    public void U(K5.c cVar) {
        setShapeAppearanceModel(this.f2792a.f2810a.x(cVar));
    }

    public void V(float f10) {
        c cVar = this.f2792a;
        if (cVar.f2824o != f10) {
            cVar.f2824o = f10;
            g0();
        }
    }

    public void W(ColorStateList colorStateList) {
        c cVar = this.f2792a;
        if (cVar.f2813d != colorStateList) {
            cVar.f2813d = colorStateList;
            onStateChange(getState());
        }
    }

    public void X(float f10) {
        c cVar = this.f2792a;
        if (cVar.f2820k != f10) {
            cVar.f2820k = f10;
            this.f2796e = true;
            invalidateSelf();
        }
    }

    public void Y(int i10, int i11, int i12, int i13) {
        c cVar = this.f2792a;
        if (cVar.f2818i == null) {
            cVar.f2818i = new Rect();
        }
        this.f2792a.f2818i.set(i10, i11, i12, i13);
        invalidateSelf();
    }

    public void Z(float f10) {
        c cVar = this.f2792a;
        if (cVar.f2823n != f10) {
            cVar.f2823n = f10;
            g0();
        }
    }

    public void a0(float f10, int i10) {
        d0(f10);
        c0(ColorStateList.valueOf(i10));
    }

    public void b0(float f10, ColorStateList colorStateList) {
        d0(f10);
        c0(colorStateList);
    }

    public void c0(ColorStateList colorStateList) {
        c cVar = this.f2792a;
        if (cVar.f2814e != colorStateList) {
            cVar.f2814e = colorStateList;
            onStateChange(getState());
        }
    }

    public void d0(float f10) {
        this.f2792a.f2821l = f10;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        this.f2805v.setColorFilter(this.f2787J);
        int alpha = this.f2805v.getAlpha();
        this.f2805v.setAlpha(Q(alpha, this.f2792a.f2822m));
        this.f2806w.setColorFilter(this.f2788K);
        this.f2806w.setStrokeWidth(this.f2792a.f2821l);
        int alpha2 = this.f2806w.getAlpha();
        this.f2806w.setAlpha(Q(alpha2, this.f2792a.f2822m));
        if (this.f2796e) {
            i();
            g(s(), this.f2798g);
            this.f2796e = false;
        }
        P(canvas);
        if (J()) {
            o(canvas);
        }
        if (K()) {
            r(canvas);
        }
        this.f2805v.setAlpha(alpha);
        this.f2806w.setAlpha(alpha2);
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f2792a.f2822m;
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        return this.f2792a;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        if (this.f2792a.f2826q == 2) {
            return;
        }
        if (O()) {
            outline.setRoundRect(getBounds(), E() * this.f2792a.f2820k);
        } else {
            g(s(), this.f2798g);
            B5.d.j(outline, this.f2798g);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(Rect rect) {
        Rect rect2 = this.f2792a.f2818i;
        if (rect2 == null) {
            return super.getPadding(rect);
        }
        rect.set(rect2);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public Region getTransparentRegion() {
        this.f2802k.set(getBounds());
        g(s(), this.f2798g);
        this.f2803l.setPath(this.f2798g, this.f2802k);
        this.f2802k.op(this.f2803l, Region.Op.DIFFERENCE);
        return this.f2802k;
    }

    protected final void h(RectF rectF, Path path) {
        l lVar = this.f2786I;
        c cVar = this.f2792a;
        lVar.d(cVar.f2810a, cVar.f2820k, rectF, this.f2785H, path);
    }

    @Override // android.graphics.drawable.Drawable
    public void invalidateSelf() {
        this.f2796e = true;
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        if (super.isStateful()) {
            return true;
        }
        ColorStateList colorStateList = this.f2792a.f2816g;
        if (colorStateList != null && colorStateList.isStateful()) {
            return true;
        }
        ColorStateList colorStateList2 = this.f2792a.f2815f;
        if (colorStateList2 != null && colorStateList2.isStateful()) {
            return true;
        }
        ColorStateList colorStateList3 = this.f2792a.f2814e;
        if (colorStateList3 != null && colorStateList3.isStateful()) {
            return true;
        }
        ColorStateList colorStateList4 = this.f2792a.f2813d;
        return colorStateList4 != null && colorStateList4.isStateful();
    }

    protected int l(int i10) {
        float fH = H() + x();
        C5.a aVar = this.f2792a.f2811b;
        return aVar != null ? aVar.c(i10, fH) : i10;
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        this.f2792a = new c(this.f2792a);
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        this.f2796e = true;
        super.onBoundsChange(rect);
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onStateChange(int[] iArr) {
        boolean z9 = e0(iArr) || f0();
        if (z9) {
            invalidateSelf();
        }
        return z9;
    }

    protected void q(Canvas canvas, Paint paint, Path path, RectF rectF) {
        p(canvas, paint, path, this.f2792a.f2810a, rectF);
    }

    protected void r(Canvas canvas) {
        p(canvas, this.f2806w, this.f2799h, this.f2804m, t());
    }

    protected RectF s() {
        this.f2800i.set(getBounds());
        return this.f2800i;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        c cVar = this.f2792a;
        if (cVar.f2822m != i10) {
            cVar.f2822m = i10;
            M();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f2792a.f2812c = colorFilter;
        M();
    }

    @Override // K5.n
    public void setShapeAppearanceModel(k kVar) {
        this.f2792a.f2810a = kVar;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setTint(int i10) {
        setTintList(ColorStateList.valueOf(i10));
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        this.f2792a.f2816g = colorStateList;
        f0();
        M();
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        c cVar = this.f2792a;
        if (cVar.f2817h != mode) {
            cVar.f2817h = mode;
            f0();
            M();
        }
    }

    public float u() {
        return this.f2792a.f2824o;
    }

    public ColorStateList v() {
        return this.f2792a.f2813d;
    }

    public float w() {
        return this.f2792a.f2820k;
    }

    public float x() {
        return this.f2792a.f2823n;
    }

    public int y() {
        return this.f2789L;
    }

    public int z() {
        c cVar = this.f2792a;
        return (int) (((double) cVar.f2828s) * Math.sin(Math.toRadians(cVar.f2829t)));
    }

    public g(Context context, AttributeSet attributeSet, int i10, int i11) {
        this(k.e(context, attributeSet, i10, i11).m());
    }

    public g(k kVar) {
        this(new c(kVar, null));
    }

    protected g(c cVar) {
        l lVar;
        this.f2793b = new m.g[4];
        this.f2794c = new m.g[4];
        this.f2795d = new BitSet(8);
        this.f2797f = new Matrix();
        this.f2798g = new Path();
        this.f2799h = new Path();
        this.f2800i = new RectF();
        this.f2801j = new RectF();
        this.f2802k = new Region();
        this.f2803l = new Region();
        Paint paint = new Paint(1);
        this.f2805v = paint;
        Paint paint2 = new Paint(1);
        this.f2806w = paint2;
        this.f2784G = new J5.a();
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            lVar = l.k();
        } else {
            lVar = new l();
        }
        this.f2786I = lVar;
        this.f2790M = new RectF();
        this.f2791N = true;
        this.f2792a = cVar;
        paint2.setStyle(Paint.Style.STROKE);
        paint.setStyle(Paint.Style.FILL);
        f0();
        e0(getState());
        this.f2785H = new a();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static class c extends Drawable.ConstantState {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        k f2810a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        C5.a f2811b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        ColorFilter f2812c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        ColorStateList f2813d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        ColorStateList f2814e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        ColorStateList f2815f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        ColorStateList f2816g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        PorterDuff.Mode f2817h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        Rect f2818i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        float f2819j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        float f2820k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        float f2821l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        int f2822m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        float f2823n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        float f2824o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        float f2825p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f2826q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f2827r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        int f2828s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        int f2829t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        boolean f2830u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        Paint.Style f2831v;

        public c(k kVar, C5.a aVar) {
            this.f2813d = null;
            this.f2814e = null;
            this.f2815f = null;
            this.f2816g = null;
            this.f2817h = PorterDuff.Mode.SRC_IN;
            this.f2818i = null;
            this.f2819j = 1.0f;
            this.f2820k = 1.0f;
            this.f2822m = 255;
            this.f2823n = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            this.f2824o = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            this.f2825p = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            this.f2826q = 0;
            this.f2827r = 0;
            this.f2828s = 0;
            this.f2829t = 0;
            this.f2830u = false;
            this.f2831v = Paint.Style.FILL_AND_STROKE;
            this.f2810a = kVar;
            this.f2811b = aVar;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return 0;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            g gVar = new g(this);
            gVar.f2796e = true;
            return gVar;
        }

        public c(c cVar) {
            this.f2813d = null;
            this.f2814e = null;
            this.f2815f = null;
            this.f2816g = null;
            this.f2817h = PorterDuff.Mode.SRC_IN;
            this.f2818i = null;
            this.f2819j = 1.0f;
            this.f2820k = 1.0f;
            this.f2822m = 255;
            this.f2823n = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            this.f2824o = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            this.f2825p = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            this.f2826q = 0;
            this.f2827r = 0;
            this.f2828s = 0;
            this.f2829t = 0;
            this.f2830u = false;
            this.f2831v = Paint.Style.FILL_AND_STROKE;
            this.f2810a = cVar.f2810a;
            this.f2811b = cVar.f2811b;
            this.f2821l = cVar.f2821l;
            this.f2812c = cVar.f2812c;
            this.f2813d = cVar.f2813d;
            this.f2814e = cVar.f2814e;
            this.f2817h = cVar.f2817h;
            this.f2816g = cVar.f2816g;
            this.f2822m = cVar.f2822m;
            this.f2819j = cVar.f2819j;
            this.f2828s = cVar.f2828s;
            this.f2826q = cVar.f2826q;
            this.f2830u = cVar.f2830u;
            this.f2820k = cVar.f2820k;
            this.f2823n = cVar.f2823n;
            this.f2824o = cVar.f2824o;
            this.f2825p = cVar.f2825p;
            this.f2827r = cVar.f2827r;
            this.f2829t = cVar.f2829t;
            this.f2815f = cVar.f2815f;
            this.f2831v = cVar.f2831v;
            if (cVar.f2818i != null) {
                this.f2818i = new Rect(cVar.f2818i);
            }
        }
    }
}
