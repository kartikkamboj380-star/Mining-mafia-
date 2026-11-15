package G2;

import J2.C0716a;
import R2.E;
import R2.i;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c f929a = new c();

    private c() {
    }

    public static final b a(E poolFactory, S2.d platformDecoder, C0716a closeableReferenceFactory) {
        Intrinsics.checkNotNullParameter(poolFactory, "poolFactory");
        Intrinsics.checkNotNullParameter(platformDecoder, "platformDecoder");
        Intrinsics.checkNotNullParameter(closeableReferenceFactory, "closeableReferenceFactory");
        i iVarB = poolFactory.b();
        Intrinsics.checkNotNullExpressionValue(iVarB, "getBitmapPool(...)");
        return new a(iVarB, closeableReferenceFactory);
    }
}
