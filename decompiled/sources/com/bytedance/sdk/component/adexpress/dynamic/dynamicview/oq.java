package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.drawable.GradientDrawable;
import androidx.annotation.NonNull;
import com.unity3d.services.UnityAdsConstants;

/* JADX INFO: loaded from: classes.dex */
public class oq extends GradientDrawable {
    protected Path kq;
    private final Paint oq;

    public oq() {
        this.kq = new Path();
        Paint paint = new Paint(1);
        this.oq = paint;
        paint.setColor(-1);
    }

    @Override // android.graphics.drawable.GradientDrawable, android.graphics.drawable.Drawable
    public void draw(@NonNull Canvas canvas) {
        Path path = this.kq;
        if (path == null || path.isEmpty()) {
            kq(canvas);
            return;
        }
        int iSaveLayer = canvas.saveLayer(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, canvas.getWidth(), canvas.getHeight(), this.oq, 31);
        kq(canvas);
        this.oq.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        canvas.drawPath(this.kq, this.oq);
        this.oq.setXfermode(null);
        canvas.restoreToCount(iSaveLayer);
    }

    protected void kq(Canvas canvas) {
        super.draw(canvas);
    }

    public void kq(int i10, int i11, int i12, int i13) {
        this.kq.addRect(i10, i11, i12, i13, Path.Direction.CW);
        invalidateSelf();
    }

    public oq(GradientDrawable.Orientation orientation, int[] iArr) {
        super(orientation, iArr);
        this.kq = new Path();
        Paint paint = new Paint(1);
        this.oq = paint;
        paint.setColor(-1);
    }
}
