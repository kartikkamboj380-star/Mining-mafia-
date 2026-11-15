package p193t2;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import com.unity3d.services.UnityAdsConstants;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public class k extends Drawable implements i {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    float[] f49578c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float[] f49576a = new float[8];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final float[] f49577b = new float[8];

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final Paint f49579d = new Paint(1);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f49580e = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private float f49581f = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private float f49582g = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f49583h = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f49584i = false;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f49585j = false;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    final Path f49586k = new Path();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    final Path f49587l = new Path();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f49588m = 0;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final RectF f49589v = new RectF();

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private int f49590w = 255;

    public k(int i10) {
        e(i10);
    }

    public static k a(ColorDrawable colorDrawable) {
        return new k(colorDrawable.getColor());
    }

    private void f() {
        float[] fArr;
        float[] fArr2;
        this.f49586k.reset();
        this.f49587l.reset();
        this.f49589v.set(getBounds());
        RectF rectF = this.f49589v;
        float f10 = this.f49581f;
        rectF.inset(f10 / 2.0f, f10 / 2.0f);
        int i10 = 0;
        if (this.f49580e) {
            this.f49587l.addCircle(this.f49589v.centerX(), this.f49589v.centerY(), Math.min(this.f49589v.width(), this.f49589v.height()) / 2.0f, Path.Direction.CW);
        } else {
            int i11 = 0;
            while (true) {
                fArr = this.f49577b;
                if (i11 >= fArr.length) {
                    break;
                }
                fArr[i11] = (this.f49576a[i11] + this.f49582g) - (this.f49581f / 2.0f);
                i11++;
            }
            this.f49587l.addRoundRect(this.f49589v, fArr, Path.Direction.CW);
        }
        RectF rectF2 = this.f49589v;
        float f11 = this.f49581f;
        rectF2.inset((-f11) / 2.0f, (-f11) / 2.0f);
        float f12 = this.f49582g + (this.f49584i ? this.f49581f : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        this.f49589v.inset(f12, f12);
        if (this.f49580e) {
            this.f49586k.addCircle(this.f49589v.centerX(), this.f49589v.centerY(), Math.min(this.f49589v.width(), this.f49589v.height()) / 2.0f, Path.Direction.CW);
        } else if (this.f49584i) {
            if (this.f49578c == null) {
                this.f49578c = new float[8];
            }
            while (true) {
                fArr2 = this.f49578c;
                if (i10 >= fArr2.length) {
                    break;
                }
                fArr2[i10] = this.f49576a[i10] - this.f49581f;
                i10++;
            }
            this.f49586k.addRoundRect(this.f49589v, fArr2, Path.Direction.CW);
        } else {
            this.f49586k.addRoundRect(this.f49589v, this.f49576a, Path.Direction.CW);
        }
        float f13 = -f12;
        this.f49589v.inset(f13, f13);
    }

    @Override // p193t2.i
    public void b(int i10, float f10) {
        if (this.f49583h != i10) {
            this.f49583h = i10;
            invalidateSelf();
        }
        if (this.f49581f != f10) {
            this.f49581f = f10;
            f();
            invalidateSelf();
        }
    }

    public boolean c() {
        return this.f49585j;
    }

    @Override // p193t2.i
    public void d(boolean z9) {
        this.f49580e = z9;
        f();
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        this.f49579d.setColor(C7133e.c(this.f49588m, this.f49590w));
        this.f49579d.setStyle(Paint.Style.FILL);
        this.f49579d.setFilterBitmap(c());
        canvas.drawPath(this.f49586k, this.f49579d);
        if (this.f49581f != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            this.f49579d.setColor(C7133e.c(this.f49583h, this.f49590w));
            this.f49579d.setStyle(Paint.Style.STROKE);
            this.f49579d.setStrokeWidth(this.f49581f);
            canvas.drawPath(this.f49587l, this.f49579d);
        }
    }

    public void e(int i10) {
        if (this.f49588m != i10) {
            this.f49588m = i10;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f49590w;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return C7133e.b(C7133e.c(this.f49588m, this.f49590w));
    }

    @Override // p193t2.i
    public void i(float f10) {
        if (this.f49582g != f10) {
            this.f49582g = f10;
            f();
            invalidateSelf();
        }
    }

    @Override // p193t2.i
    public void j(float f10) {
        Y1.k.c(f10 >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, "radius should be non negative");
        Arrays.fill(this.f49576a, f10);
        f();
        invalidateSelf();
    }

    @Override // p193t2.i
    public void n(boolean z9) {
        if (this.f49585j != z9) {
            this.f49585j = z9;
            invalidateSelf();
        }
    }

    @Override // p193t2.i
    public void o(boolean z9) {
        if (this.f49584i != z9) {
            this.f49584i = z9;
            f();
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        f();
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        if (i10 != this.f49590w) {
            this.f49590w = i10;
            invalidateSelf();
        }
    }

    @Override // p193t2.i
    public void t(float[] fArr) {
        if (fArr == null) {
            Arrays.fill(this.f49576a, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        } else {
            Y1.k.c(fArr.length == 8, "radii should have exactly 8 values");
            System.arraycopy(fArr, 0, this.f49576a, 0, 8);
        }
        f();
        invalidateSelf();
    }

    @Override // p193t2.i
    public void k(boolean z9) {
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
    }
}
