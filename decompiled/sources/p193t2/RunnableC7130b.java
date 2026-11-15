package p193t2;

import Y1.k;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import com.unity3d.services.UnityAdsConstants;

/* JADX INFO: renamed from: t2.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class RunnableC7130b extends g implements Runnable {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f49533e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f49534f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    float f49535g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f49536h;

    public RunnableC7130b(Drawable drawable, int i10) {
        this(drawable, i10, true);
    }

    private int x() {
        return (int) ((20.0f / this.f49533e) * 360.0f);
    }

    private void y() {
        if (this.f49536h) {
            return;
        }
        this.f49536h = true;
        scheduleSelf(this, SystemClock.uptimeMillis() + 20);
    }

    @Override // p193t2.g, android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        int iSave = canvas.save();
        Rect bounds = getBounds();
        int i10 = bounds.right;
        int i11 = bounds.left;
        int i12 = i10 - i11;
        int i13 = bounds.bottom;
        int i14 = bounds.top;
        int i15 = i13 - i14;
        float f10 = this.f49535g;
        if (!this.f49534f) {
            f10 = 360.0f - f10;
        }
        canvas.rotate(f10, i11 + (i12 / 2), i14 + (i15 / 2));
        super.draw(canvas);
        canvas.restoreToCount(iSave);
        y();
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f49536h = false;
        this.f49535g += x();
        invalidateSelf();
    }

    public RunnableC7130b(Drawable drawable, int i10, boolean z9) {
        super((Drawable) k.g(drawable));
        this.f49535g = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        this.f49536h = false;
        this.f49533e = i10;
        this.f49534f = z9;
    }
}
