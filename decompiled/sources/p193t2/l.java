package p193t2;

import Y1.k;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import com.unity3d.services.UnityAdsConstants;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public class l extends g implements i {

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private float f49591G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private boolean f49592H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private boolean f49593I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private final Path f49594J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    private final Path f49595K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    private final RectF f49596L;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    b f49597e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final RectF f49598f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private RectF f49599g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private Matrix f49600h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final float[] f49601i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    final float[] f49602j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    final Paint f49603k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f49604l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private float f49605m;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private int f49606v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private int f49607w;

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f49608a;

        static {
            int[] iArr = new int[b.values().length];
            f49608a = iArr;
            try {
                iArr[b.CLIPPING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f49608a[b.OVERLAY_COLOR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public enum b {
        OVERLAY_COLOR,
        CLIPPING
    }

    public l(Drawable drawable) {
        super((Drawable) k.g(drawable));
        this.f49597e = b.OVERLAY_COLOR;
        this.f49598f = new RectF();
        this.f49601i = new float[8];
        this.f49602j = new float[8];
        this.f49603k = new Paint(1);
        this.f49604l = false;
        this.f49605m = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        this.f49606v = 0;
        this.f49607w = 0;
        this.f49591G = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        this.f49592H = false;
        this.f49593I = false;
        this.f49594J = new Path();
        this.f49595K = new Path();
        this.f49596L = new RectF();
    }

    private void z() {
        float[] fArr;
        this.f49594J.reset();
        this.f49595K.reset();
        this.f49596L.set(getBounds());
        RectF rectF = this.f49596L;
        float f10 = this.f49591G;
        rectF.inset(f10, f10);
        if (this.f49597e == b.OVERLAY_COLOR) {
            this.f49594J.addRect(this.f49596L, Path.Direction.CW);
        }
        if (this.f49604l) {
            this.f49594J.addCircle(this.f49596L.centerX(), this.f49596L.centerY(), Math.min(this.f49596L.width(), this.f49596L.height()) / 2.0f, Path.Direction.CW);
        } else {
            this.f49594J.addRoundRect(this.f49596L, this.f49601i, Path.Direction.CW);
        }
        RectF rectF2 = this.f49596L;
        float f11 = this.f49591G;
        rectF2.inset(-f11, -f11);
        RectF rectF3 = this.f49596L;
        float f12 = this.f49605m;
        rectF3.inset(f12 / 2.0f, f12 / 2.0f);
        if (this.f49604l) {
            this.f49595K.addCircle(this.f49596L.centerX(), this.f49596L.centerY(), Math.min(this.f49596L.width(), this.f49596L.height()) / 2.0f, Path.Direction.CW);
        } else {
            int i10 = 0;
            while (true) {
                fArr = this.f49602j;
                if (i10 >= fArr.length) {
                    break;
                }
                fArr[i10] = (this.f49601i[i10] + this.f49591G) - (this.f49605m / 2.0f);
                i10++;
            }
            this.f49595K.addRoundRect(this.f49596L, fArr, Path.Direction.CW);
        }
        RectF rectF4 = this.f49596L;
        float f13 = this.f49605m;
        rectF4.inset((-f13) / 2.0f, (-f13) / 2.0f);
    }

    @Override // p193t2.i
    public void b(int i10, float f10) {
        this.f49606v = i10;
        this.f49605m = f10;
        z();
        invalidateSelf();
    }

    @Override // p193t2.i
    public void d(boolean z9) {
        this.f49604l = z9;
        z();
        invalidateSelf();
    }

    @Override // p193t2.g, android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        this.f49598f.set(getBounds());
        int i10 = a.f49608a[this.f49597e.ordinal()];
        if (i10 == 1) {
            int iSave = canvas.save();
            canvas.clipPath(this.f49594J);
            super.draw(canvas);
            canvas.restoreToCount(iSave);
        } else if (i10 == 2) {
            if (this.f49592H) {
                RectF rectF = this.f49599g;
                if (rectF == null) {
                    this.f49599g = new RectF(this.f49598f);
                    this.f49600h = new Matrix();
                } else {
                    rectF.set(this.f49598f);
                }
                RectF rectF2 = this.f49599g;
                float f10 = this.f49605m;
                rectF2.inset(f10, f10);
                Matrix matrix = this.f49600h;
                if (matrix != null) {
                    matrix.setRectToRect(this.f49598f, this.f49599g, Matrix.ScaleToFit.FILL);
                }
                int iSave2 = canvas.save();
                canvas.clipRect(this.f49598f);
                canvas.concat(this.f49600h);
                super.draw(canvas);
                canvas.restoreToCount(iSave2);
            } else {
                super.draw(canvas);
            }
            this.f49603k.setStyle(Paint.Style.FILL);
            this.f49603k.setColor(this.f49607w);
            this.f49603k.setStrokeWidth(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            this.f49603k.setFilterBitmap(x());
            this.f49594J.setFillType(Path.FillType.EVEN_ODD);
            canvas.drawPath(this.f49594J, this.f49603k);
            if (this.f49604l) {
                float fWidth = ((this.f49598f.width() - this.f49598f.height()) + this.f49605m) / 2.0f;
                float fHeight = ((this.f49598f.height() - this.f49598f.width()) + this.f49605m) / 2.0f;
                if (fWidth > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                    RectF rectF3 = this.f49598f;
                    float f11 = rectF3.left;
                    canvas.drawRect(f11, rectF3.top, f11 + fWidth, rectF3.bottom, this.f49603k);
                    RectF rectF4 = this.f49598f;
                    float f12 = rectF4.right;
                    canvas.drawRect(f12 - fWidth, rectF4.top, f12, rectF4.bottom, this.f49603k);
                }
                if (fHeight > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                    RectF rectF5 = this.f49598f;
                    float f13 = rectF5.left;
                    float f14 = rectF5.top;
                    canvas.drawRect(f13, f14, rectF5.right, f14 + fHeight, this.f49603k);
                    RectF rectF6 = this.f49598f;
                    float f15 = rectF6.left;
                    float f16 = rectF6.bottom;
                    canvas.drawRect(f15, f16 - fHeight, rectF6.right, f16, this.f49603k);
                }
            }
        }
        if (this.f49606v != 0) {
            this.f49603k.setStyle(Paint.Style.STROKE);
            this.f49603k.setColor(this.f49606v);
            this.f49603k.setStrokeWidth(this.f49605m);
            this.f49594J.setFillType(Path.FillType.EVEN_ODD);
            canvas.drawPath(this.f49595K, this.f49603k);
        }
    }

    @Override // p193t2.i
    public void i(float f10) {
        this.f49591G = f10;
        z();
        invalidateSelf();
    }

    @Override // p193t2.i
    public void j(float f10) {
        Arrays.fill(this.f49601i, f10);
        z();
        invalidateSelf();
    }

    @Override // p193t2.i
    public void n(boolean z9) {
        if (this.f49593I != z9) {
            this.f49593I = z9;
            invalidateSelf();
        }
    }

    @Override // p193t2.i
    public void o(boolean z9) {
        this.f49592H = z9;
        z();
        invalidateSelf();
    }

    @Override // p193t2.g, android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        z();
    }

    @Override // p193t2.i
    public void t(float[] fArr) {
        if (fArr == null) {
            Arrays.fill(this.f49601i, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        } else {
            k.c(fArr.length == 8, "radii should have exactly 8 values");
            System.arraycopy(fArr, 0, this.f49601i, 0, 8);
        }
        z();
        invalidateSelf();
    }

    public boolean x() {
        return this.f49593I;
    }

    public void y(int i10) {
        this.f49607w = i10;
        invalidateSelf();
    }

    @Override // p193t2.i
    public void k(boolean z9) {
    }
}
