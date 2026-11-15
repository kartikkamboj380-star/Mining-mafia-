package p193t2;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class h extends g {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Matrix f49564e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f49565f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f49566g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Matrix f49567h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final RectF f49568i;

    public h(Drawable drawable, int i10, int i11) {
        super(drawable);
        this.f49564e = new Matrix();
        this.f49565f = i10 - (i10 % 90);
        this.f49566g = (i11 < 0 || i11 > 8) ? 0 : i11;
        this.f49567h = new Matrix();
        this.f49568i = new RectF();
    }

    @Override // p193t2.g, android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        int i10;
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        if (this.f49565f <= 0 && ((i10 = this.f49566g) == 0 || i10 == 1)) {
            super.draw(canvas);
            return;
        }
        int iSave = canvas.save();
        canvas.concat(this.f49564e);
        super.draw(canvas);
        canvas.restoreToCount(iSave);
    }

    @Override // p193t2.g, p193t2.D
    public void e(Matrix transform) {
        Intrinsics.checkNotNullParameter(transform, "transform");
        u(transform);
        if (this.f49564e.isIdentity()) {
            return;
        }
        transform.preConcat(this.f49564e);
    }

    @Override // p193t2.g, android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        int i10 = this.f49566g;
        return (i10 == 5 || i10 == 7 || this.f49565f % 180 != 0) ? super.getIntrinsicWidth() : super.getIntrinsicHeight();
    }

    @Override // p193t2.g, android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        int i10 = this.f49566g;
        return (i10 == 5 || i10 == 7 || this.f49565f % 180 != 0) ? super.getIntrinsicHeight() : super.getIntrinsicWidth();
    }

    @Override // p193t2.g, android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect bounds) {
        int i10;
        Intrinsics.checkNotNullParameter(bounds, "bounds");
        Drawable current = getCurrent();
        if (current == null) {
            return;
        }
        int i11 = this.f49565f;
        if (i11 <= 0 && ((i10 = this.f49566g) == 0 || i10 == 1)) {
            current.setBounds(bounds);
            return;
        }
        int i12 = this.f49566g;
        if (i12 == 2) {
            this.f49564e.setScale(-1.0f, 1.0f);
        } else if (i12 == 7) {
            this.f49564e.setRotate(270.0f, bounds.centerX(), bounds.centerY());
            this.f49564e.postScale(-1.0f, 1.0f);
        } else if (i12 == 4) {
            this.f49564e.setScale(1.0f, -1.0f);
        } else if (i12 != 5) {
            this.f49564e.setRotate(i11, bounds.centerX(), bounds.centerY());
        } else {
            this.f49564e.setRotate(270.0f, bounds.centerX(), bounds.centerY());
            this.f49564e.postScale(1.0f, -1.0f);
        }
        this.f49567h.reset();
        this.f49564e.invert(this.f49567h);
        this.f49568i.set(bounds);
        this.f49567h.mapRect(this.f49568i);
        RectF rectF = this.f49568i;
        current.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
    }
}
