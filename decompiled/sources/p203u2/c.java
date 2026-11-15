package p203u2;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import p193t2.E;
import p193t2.F;
import p193t2.g;

/* JADX INFO: loaded from: classes.dex */
public class c extends g implements E {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    Drawable f49818e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private F f49819f;

    public c(Drawable drawable) {
        super(drawable);
        this.f49818e = null;
    }

    @Override // p193t2.g, android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        if (isVisible()) {
            F f10 = this.f49819f;
            if (f10 != null) {
                f10.onDraw();
            }
            super.draw(canvas);
            Drawable drawable = this.f49818e;
            if (drawable != null) {
                drawable.setBounds(getBounds());
                this.f49818e.draw(canvas);
            }
        }
    }

    @Override // p193t2.g, android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return -1;
    }

    @Override // p193t2.g, android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return -1;
    }

    @Override // p193t2.E
    public void l(F f10) {
        this.f49819f = f10;
    }

    @Override // p193t2.g, android.graphics.drawable.Drawable
    public boolean setVisible(boolean z9, boolean z10) {
        F f10 = this.f49819f;
        if (f10 != null) {
            f10.n(z9);
        }
        return super.setVisible(z9, z10);
    }

    public void x(Drawable drawable) {
        this.f49818e = drawable;
        invalidateSelf();
    }
}
