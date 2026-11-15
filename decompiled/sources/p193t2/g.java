package p193t2;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes.dex */
public class g extends Drawable implements Drawable.Callback, D, C, InterfaceC7131c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Matrix f49560d = new Matrix();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Drawable f49561a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C7132d f49562b = new C7132d();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected D f49563c;

    public g(Drawable drawable) {
        this.f49561a = drawable;
        C7133e.d(drawable, this, this);
    }

    @Override // p193t2.C
    public void c(D d10) {
        this.f49563c = d10;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Drawable drawable = this.f49561a;
        if (drawable != null) {
            drawable.draw(canvas);
        }
    }

    @Override // p193t2.D
    public void e(Matrix matrix) {
        u(matrix);
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        Drawable drawable = this.f49561a;
        return drawable == null ? super.getConstantState() : drawable.getConstantState();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable getCurrent() {
        return this.f49561a;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        Drawable drawable = this.f49561a;
        return drawable == null ? super.getIntrinsicHeight() : drawable.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        Drawable drawable = this.f49561a;
        return drawable == null ? super.getIntrinsicWidth() : drawable.getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        Drawable drawable = this.f49561a;
        if (drawable == null) {
            return 0;
        }
        return drawable.getOpacity();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(Rect rect) {
        Drawable drawable = this.f49561a;
        return drawable == null ? super.getPadding(rect) : drawable.getPadding(rect);
    }

    @Override // p193t2.InterfaceC7131c
    public Drawable h(Drawable drawable) {
        return v(drawable);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        Drawable drawable = this.f49561a;
        if (drawable == null) {
            return false;
        }
        return drawable.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        Drawable drawable = this.f49561a;
        if (drawable != null) {
            drawable.mutate();
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        Drawable drawable = this.f49561a;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onLevelChange(int i10) {
        Drawable drawable = this.f49561a;
        return drawable == null ? super.onLevelChange(i10) : drawable.setLevel(i10);
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onStateChange(int[] iArr) {
        Drawable drawable = this.f49561a;
        return drawable == null ? super.onStateChange(iArr) : drawable.setState(iArr);
    }

    @Override // p193t2.D
    public void p(RectF rectF) {
        D d10 = this.f49563c;
        if (d10 != null) {
            d10.p(rectF);
        } else {
            rectF.set(getBounds());
        }
    }

    @Override // p193t2.InterfaceC7131c
    public Drawable s() {
        return getCurrent();
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j10) {
        scheduleSelf(runnable, j10);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        this.f49562b.b(i10);
        Drawable drawable = this.f49561a;
        if (drawable != null) {
            drawable.setAlpha(i10);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f49562b.c(colorFilter);
        Drawable drawable = this.f49561a;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setDither(boolean z9) {
        this.f49562b.d(z9);
        Drawable drawable = this.f49561a;
        if (drawable != null) {
            drawable.setDither(z9);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setFilterBitmap(boolean z9) {
        this.f49562b.e(z9);
        Drawable drawable = this.f49561a;
        if (drawable != null) {
            drawable.setFilterBitmap(z9);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setHotspot(float f10, float f11) {
        Drawable drawable = this.f49561a;
        if (drawable != null) {
            drawable.setHotspot(f10, f11);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z9, boolean z10) {
        boolean visible = super.setVisible(z9, z10);
        Drawable drawable = this.f49561a;
        return drawable == null ? visible : drawable.setVisible(z9, z10);
    }

    protected void u(Matrix matrix) {
        D d10 = this.f49563c;
        if (d10 != null) {
            d10.e(matrix);
        } else {
            matrix.reset();
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }

    public Drawable v(Drawable drawable) {
        Drawable drawableW = w(drawable);
        invalidateSelf();
        return drawableW;
    }

    protected Drawable w(Drawable drawable) {
        Drawable drawable2 = this.f49561a;
        C7133e.d(drawable2, null, null);
        C7133e.d(drawable, null, null);
        C7133e.e(drawable, this.f49562b);
        C7133e.a(drawable, this);
        C7133e.d(drawable, this, this);
        this.f49561a = drawable;
        return drawable2;
    }
}
