package R2;

import android.graphics.Bitmap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class r implements i {
    @Override // p013b2.f
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public Bitmap get(int i10) {
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(1, (int) Math.ceil(((double) i10) / 2.0d), Bitmap.Config.RGB_565);
        Intrinsics.checkNotNullExpressionValue(bitmapCreateBitmap, "createBitmap(...)");
        return bitmapCreateBitmap;
    }

    @Override // p013b2.f, p023c2.g
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public void a(Bitmap value) {
        Intrinsics.checkNotNullParameter(value, "value");
        value.recycle();
    }
}
