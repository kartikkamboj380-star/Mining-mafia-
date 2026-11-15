package X2;

import android.graphics.Bitmap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f6679a = new b();

    private b() {
    }

    public static final boolean a(a aVar, p023c2.a aVar2) {
        if (aVar == null || aVar2 == null) {
            return false;
        }
        Object objG = aVar2.G();
        Intrinsics.checkNotNullExpressionValue(objG, "get(...)");
        Bitmap bitmap = (Bitmap) objG;
        if (aVar.a()) {
            bitmap.setHasAlpha(true);
        }
        aVar.b(bitmap);
        return true;
    }
}
