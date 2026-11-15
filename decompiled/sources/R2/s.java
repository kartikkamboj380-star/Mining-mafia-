package R2;

import android.graphics.Bitmap;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class s implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Set f5159a;

    public s() {
        Set setB = Y1.m.b();
        Intrinsics.checkNotNullExpressionValue(setB, "newIdentityHashSet(...)");
        this.f5159a = setB;
    }

    @Override // p013b2.f
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public Bitmap get(int i10) {
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(1, (int) Math.ceil(((double) i10) / 2.0d), Bitmap.Config.RGB_565);
        Intrinsics.checkNotNullExpressionValue(bitmapCreateBitmap, "createBitmap(...)");
        this.f5159a.add(bitmapCreateBitmap);
        return bitmapCreateBitmap;
    }

    @Override // p013b2.f, p023c2.g
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public void a(Bitmap value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f5159a.remove(value);
        value.recycle();
    }
}
