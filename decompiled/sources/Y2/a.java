package Y2;

import O2.d;
import O2.f;
import android.graphics.drawable.Drawable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class a implements N2.a {
    @Override // N2.a
    public boolean a(d image) {
        Intrinsics.checkNotNullParameter(image, "image");
        return image instanceof f;
    }

    @Override // N2.a
    public Drawable b(d image) {
        Intrinsics.checkNotNullParameter(image, "image");
        f fVar = image instanceof f ? (f) image : null;
        if (fVar != null) {
            return fVar.G0();
        }
        return null;
    }
}
