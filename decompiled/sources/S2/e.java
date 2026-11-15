package S2;

import R2.E;
import R2.i;
import android.os.Build;
import java.nio.ByteBuffer;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e f5483a = new e();

    private e() {
    }

    public static final d a(E poolFactory, boolean z9, boolean z10, f platformDecoderOptions) {
        Intrinsics.checkNotNullParameter(poolFactory, "poolFactory");
        Intrinsics.checkNotNullParameter(platformDecoderOptions, "platformDecoderOptions");
        if (Build.VERSION.SDK_INT >= 26) {
            i iVarB = poolFactory.b();
            Intrinsics.checkNotNullExpressionValue(iVarB, "getBitmapPool(...)");
            return new c(iVarB, b(poolFactory, z10), platformDecoderOptions);
        }
        i iVarB2 = poolFactory.b();
        Intrinsics.checkNotNullExpressionValue(iVarB2, "getBitmapPool(...)");
        return new a(iVarB2, b(poolFactory, z10), platformDecoderOptions);
    }

    public static final N.d b(E poolFactory, boolean z9) {
        Intrinsics.checkNotNullParameter(poolFactory, "poolFactory");
        if (z9) {
            p013b2.b INSTANCE = p013b2.b.f11577a;
            Intrinsics.checkNotNullExpressionValue(INSTANCE, "INSTANCE");
            return INSTANCE;
        }
        int iD = poolFactory.d();
        N.e eVar = new N.e(iD);
        for (int i10 = 0; i10 < iD; i10++) {
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(p013b2.b.e());
            Intrinsics.checkNotNullExpressionValue(byteBufferAllocate, "allocate(...)");
            eVar.a(byteBufferAllocate);
        }
        return eVar;
    }
}
