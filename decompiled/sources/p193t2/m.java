package p193t2;

import V2.b;
import Y1.k;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import com.unity3d.services.UnityAdsConstants;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public abstract class m extends Drawable implements i, C {

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    RectF f49612G;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    Matrix f49618M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    Matrix f49619N;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    private D f49625T;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Drawable f49626a;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    float[] f49636k;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected boolean f49627b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected boolean f49628c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected float f49629d = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected final Path f49630e = new Path();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    protected boolean f49631f = true;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    protected int f49632g = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    protected final Path f49633h = new Path();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final float[] f49634i = new float[8];

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    final float[] f49635j = new float[8];

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    final RectF f49637l = new RectF();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    final RectF f49638m = new RectF();

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    final RectF f49639v = new RectF();

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    final RectF f49640w = new RectF();

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    final Matrix f49613H = new Matrix();

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    final Matrix f49614I = new Matrix();

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    final Matrix f49615J = new Matrix();

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    final Matrix f49616K = new Matrix();

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    final Matrix f49617L = new Matrix();

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    final Matrix f49620O = new Matrix();

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    private float f49621P = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    private boolean f49622Q = false;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    private boolean f49623R = false;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    private boolean f49624S = true;

    m(Drawable drawable) {
        this.f49626a = drawable;
    }

    private static Matrix a(Matrix matrix) {
        if (matrix == null) {
            return null;
        }
        return new Matrix(matrix);
    }

    private static boolean f(Matrix matrix, Matrix matrix2) {
        if (matrix == null && matrix2 == null) {
            return true;
        }
        if (matrix == null || matrix2 == null) {
            return false;
        }
        return matrix.equals(matrix2);
    }

    @Override // p193t2.i
    public void b(int i10, float f10) {
        if (this.f49632g == i10 && this.f49629d == f10) {
            return;
        }
        this.f49632g = i10;
        this.f49629d = f10;
        this.f49624S = true;
        invalidateSelf();
    }

    @Override // p193t2.C
    public void c(D d10) {
        this.f49625T = d10;
    }

    @Override // android.graphics.drawable.Drawable
    public void clearColorFilter() {
        this.f49626a.clearColorFilter();
    }

    @Override // p193t2.i
    public void d(boolean z9) {
        this.f49627b = z9;
        this.f49624S = true;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        if (b.d()) {
            b.a("RoundedDrawable#draw");
        }
        this.f49626a.draw(canvas);
        if (b.d()) {
            b.b();
        }
    }

    public boolean e() {
        return this.f49623R;
    }

    boolean g() {
        return this.f49627b || this.f49628c || this.f49629d > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f49626a.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public ColorFilter getColorFilter() {
        return this.f49626a.getColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f49626a.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f49626a.getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return this.f49626a.getOpacity();
    }

    protected void h() {
        float[] fArr;
        if (this.f49624S) {
            this.f49633h.reset();
            RectF rectF = this.f49637l;
            float f10 = this.f49629d;
            rectF.inset(f10 / 2.0f, f10 / 2.0f);
            if (this.f49627b) {
                this.f49633h.addCircle(this.f49637l.centerX(), this.f49637l.centerY(), Math.min(this.f49637l.width(), this.f49637l.height()) / 2.0f, Path.Direction.CW);
            } else {
                int i10 = 0;
                while (true) {
                    fArr = this.f49635j;
                    if (i10 >= fArr.length) {
                        break;
                    }
                    fArr[i10] = (this.f49634i[i10] + this.f49621P) - (this.f49629d / 2.0f);
                    i10++;
                }
                this.f49633h.addRoundRect(this.f49637l, fArr, Path.Direction.CW);
            }
            RectF rectF2 = this.f49637l;
            float f11 = this.f49629d;
            rectF2.inset((-f11) / 2.0f, (-f11) / 2.0f);
            this.f49630e.reset();
            float f12 = this.f49621P + (this.f49622Q ? this.f49629d : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            this.f49637l.inset(f12, f12);
            if (this.f49627b) {
                this.f49630e.addCircle(this.f49637l.centerX(), this.f49637l.centerY(), Math.min(this.f49637l.width(), this.f49637l.height()) / 2.0f, Path.Direction.CW);
            } else if (this.f49622Q) {
                if (this.f49636k == null) {
                    this.f49636k = new float[8];
                }
                for (int i11 = 0; i11 < this.f49635j.length; i11++) {
                    this.f49636k[i11] = this.f49634i[i11] - this.f49629d;
                }
                this.f49630e.addRoundRect(this.f49637l, this.f49636k, Path.Direction.CW);
            } else {
                this.f49630e.addRoundRect(this.f49637l, this.f49634i, Path.Direction.CW);
            }
            float f13 = -f12;
            this.f49637l.inset(f13, f13);
            this.f49630e.setFillType(Path.FillType.WINDING);
            this.f49624S = false;
        }
    }

    @Override // p193t2.i
    public void i(float f10) {
        if (this.f49621P != f10) {
            this.f49621P = f10;
            this.f49624S = true;
            invalidateSelf();
        }
    }

    @Override // p193t2.i
    public void j(float f10) {
        k.i(f10 >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        Arrays.fill(this.f49634i, f10);
        this.f49628c = f10 != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        this.f49624S = true;
        invalidateSelf();
    }

    protected void l() {
        Matrix matrix;
        Matrix matrix2;
        D d10 = this.f49625T;
        if (d10 != null) {
            d10.e(this.f49615J);
            this.f49625T.p(this.f49637l);
        } else {
            this.f49615J.reset();
            this.f49637l.set(getBounds());
        }
        this.f49639v.set(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, getIntrinsicWidth(), getIntrinsicHeight());
        this.f49640w.set(this.f49626a.getBounds());
        Matrix matrix3 = this.f49613H;
        RectF rectF = this.f49639v;
        RectF rectF2 = this.f49640w;
        Matrix.ScaleToFit scaleToFit = Matrix.ScaleToFit.FILL;
        matrix3.setRectToRect(rectF, rectF2, scaleToFit);
        if (this.f49622Q) {
            RectF rectF3 = this.f49612G;
            if (rectF3 == null) {
                this.f49612G = new RectF(this.f49637l);
            } else {
                rectF3.set(this.f49637l);
            }
            RectF rectF4 = this.f49612G;
            float f10 = this.f49629d;
            rectF4.inset(f10, f10);
            if (this.f49618M == null) {
                this.f49618M = new Matrix();
            }
            this.f49618M.setRectToRect(this.f49637l, this.f49612G, scaleToFit);
        } else {
            Matrix matrix4 = this.f49618M;
            if (matrix4 != null) {
                matrix4.reset();
            }
        }
        if (!this.f49615J.equals(this.f49616K) || !this.f49613H.equals(this.f49614I) || ((matrix2 = this.f49618M) != null && !f(matrix2, this.f49619N))) {
            this.f49631f = true;
            this.f49615J.invert(this.f49617L);
            this.f49620O.set(this.f49615J);
            if (this.f49622Q && (matrix = this.f49618M) != null) {
                this.f49620O.postConcat(matrix);
            }
            this.f49620O.preConcat(this.f49613H);
            this.f49616K.set(this.f49615J);
            this.f49614I.set(this.f49613H);
            if (this.f49622Q) {
                Matrix matrix5 = this.f49619N;
                if (matrix5 == null) {
                    this.f49619N = a(this.f49618M);
                } else {
                    matrix5.set(this.f49618M);
                }
            } else {
                Matrix matrix6 = this.f49619N;
                if (matrix6 != null) {
                    matrix6.reset();
                }
            }
        }
        if (this.f49637l.equals(this.f49638m)) {
            return;
        }
        this.f49624S = true;
        this.f49638m.set(this.f49637l);
    }

    @Override // p193t2.i
    public void n(boolean z9) {
        if (this.f49623R != z9) {
            this.f49623R = z9;
            invalidateSelf();
        }
    }

    @Override // p193t2.i
    public void o(boolean z9) {
        if (this.f49622Q != z9) {
            this.f49622Q = z9;
            this.f49624S = true;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        this.f49626a.setBounds(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        this.f49626a.setAlpha(i10);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(int i10, PorterDuff.Mode mode) {
        this.f49626a.setColorFilter(i10, mode);
    }

    @Override // p193t2.i
    public void t(float[] fArr) {
        if (fArr == null) {
            Arrays.fill(this.f49634i, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            this.f49628c = false;
        } else {
            k.c(fArr.length == 8, "radii should have exactly 8 values");
            System.arraycopy(fArr, 0, this.f49634i, 0, 8);
            this.f49628c = false;
            for (int i10 = 0; i10 < 8; i10++) {
                this.f49628c |= fArr[i10] > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            }
        }
        this.f49624S = true;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f49626a.setColorFilter(colorFilter);
    }

    public void k(boolean z9) {
    }
}
