package p193t2;

import V2.b;
import android.graphics.Canvas;
import android.graphics.drawable.NinePatchDrawable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class n extends m {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(NinePatchDrawable ninePatchDrawable) {
        super(ninePatchDrawable);
        Intrinsics.checkNotNullParameter(ninePatchDrawable, "ninePatchDrawable");
    }

    @Override // p193t2.m, android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        if (b.d()) {
            b.a("RoundedNinePatchDrawable#draw");
        }
        if (!g()) {
            super.draw(canvas);
            if (b.d()) {
                b.b();
                return;
            }
            return;
        }
        l();
        h();
        canvas.clipPath(this.f49630e);
        super.draw(canvas);
        if (b.d()) {
            b.b();
        }
    }
}
