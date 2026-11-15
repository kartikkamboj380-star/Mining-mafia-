package G2;

import J2.C0716a;
import R2.i;
import android.graphics.Bitmap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class a extends b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final i f927a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C0716a f928b;

    public a(i bitmapPool, C0716a closeableReferenceFactory) {
        Intrinsics.checkNotNullParameter(bitmapPool, "bitmapPool");
        Intrinsics.checkNotNullParameter(closeableReferenceFactory, "closeableReferenceFactory");
        this.f927a = bitmapPool;
        this.f928b = closeableReferenceFactory;
    }

    @Override // G2.b
    public p023c2.a d(int i10, int i11, Bitmap.Config bitmapConfig) {
        Intrinsics.checkNotNullParameter(bitmapConfig, "bitmapConfig");
        Bitmap bitmap = (Bitmap) this.f927a.get(Z2.d.i(i10, i11, bitmapConfig));
        if (bitmap.getAllocationByteCount() < i10 * i11 * Z2.d.h(bitmapConfig)) {
            throw new IllegalStateException("Check failed.");
        }
        bitmap.reconfigure(i10, i11, bitmapConfig);
        p023c2.a aVarC = this.f928b.c(bitmap, this.f927a);
        Intrinsics.checkNotNullExpressionValue(aVarC, "create(...)");
        return aVarC;
    }
}
