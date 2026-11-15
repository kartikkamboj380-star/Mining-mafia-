package p193t2;

import Y1.i;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class o extends g {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private q f49641e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Object f49642f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public PointF f49643g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f49644h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f49645i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Matrix f49646j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final Matrix f49647k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(Drawable drawable, q scaleType) {
        super(drawable);
        Intrinsics.checkNotNullParameter(scaleType, "scaleType");
        this.f49647k = new Matrix();
        this.f49641e = scaleType;
    }

    private final void y() {
        Drawable current = getCurrent();
        if (current == null) {
            return;
        }
        if (this.f49644h == current.getIntrinsicWidth() && this.f49645i == current.getIntrinsicHeight()) {
            return;
        }
        x();
    }

    public final q A() {
        return this.f49641e;
    }

    public final void B(PointF pointF) {
        if (i.a(this.f49643g, pointF)) {
            return;
        }
        if (pointF == null) {
            this.f49643g = null;
        } else {
            if (this.f49643g == null) {
                this.f49643g = new PointF();
            }
            PointF pointF2 = this.f49643g;
            Intrinsics.c(pointF2);
            pointF2.set(pointF);
        }
        x();
        invalidateSelf();
    }

    public final void C(q scaleType) {
        Intrinsics.checkNotNullParameter(scaleType, "scaleType");
        if (i.a(this.f49641e, scaleType)) {
            return;
        }
        this.f49641e = scaleType;
        this.f49642f = null;
        x();
        invalidateSelf();
    }

    @Override // p193t2.g, android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        y();
        if (this.f49646j == null) {
            super.draw(canvas);
            return;
        }
        int iSave = canvas.save();
        canvas.clipRect(getBounds());
        canvas.concat(this.f49646j);
        super.draw(canvas);
        canvas.restoreToCount(iSave);
    }

    @Override // p193t2.g, p193t2.D
    public void e(Matrix transform) {
        Intrinsics.checkNotNullParameter(transform, "transform");
        u(transform);
        y();
        Matrix matrix = this.f49646j;
        if (matrix != null) {
            transform.preConcat(matrix);
        }
    }

    @Override // p193t2.g, android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect bounds) {
        Intrinsics.checkNotNullParameter(bounds, "bounds");
        x();
    }

    @Override // p193t2.g
    public Drawable v(Drawable drawable) {
        Drawable drawableV = super.v(drawable);
        x();
        return drawableV;
    }

    public final void x() {
        float f10;
        Drawable current = getCurrent();
        if (current == null) {
            this.f49645i = 0;
            this.f49644h = 0;
            this.f49646j = null;
            return;
        }
        Rect bounds = getBounds();
        Intrinsics.checkNotNullExpressionValue(bounds, "getBounds(...)");
        int iWidth = bounds.width();
        int iHeight = bounds.height();
        int intrinsicWidth = current.getIntrinsicWidth();
        this.f49644h = intrinsicWidth;
        int intrinsicHeight = current.getIntrinsicHeight();
        this.f49645i = intrinsicHeight;
        if (intrinsicWidth <= 0 || intrinsicHeight <= 0) {
            current.setBounds(bounds);
            this.f49646j = null;
            return;
        }
        if (intrinsicWidth == iWidth && intrinsicHeight == iHeight) {
            current.setBounds(bounds);
            this.f49646j = null;
            return;
        }
        if (this.f49641e == q.f49648a) {
            current.setBounds(bounds);
            this.f49646j = null;
            return;
        }
        current.setBounds(0, 0, intrinsicWidth, intrinsicHeight);
        this.f49647k.reset();
        q qVar = this.f49641e;
        Matrix matrix = this.f49647k;
        PointF pointF = this.f49643g;
        float f11 = 0.5f;
        if (pointF != null) {
            Intrinsics.c(pointF);
            f10 = pointF.x;
        } else {
            f10 = 0.5f;
        }
        PointF pointF2 = this.f49643g;
        if (pointF2 != null) {
            Intrinsics.c(pointF2);
            f11 = pointF2.y;
        }
        qVar.a(matrix, bounds, intrinsicWidth, intrinsicHeight, f10, f11);
        this.f49646j = this.f49647k;
    }

    public final PointF z() {
        return this.f49643g;
    }
}
