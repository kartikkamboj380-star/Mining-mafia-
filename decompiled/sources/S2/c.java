package S2;

import R2.i;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class c extends b {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final f f5482h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(i bitmapPool, N.d decodeBuffers, f platformDecoderOptions) {
        super(bitmapPool, decodeBuffers, platformDecoderOptions);
        Intrinsics.checkNotNullParameter(bitmapPool, "bitmapPool");
        Intrinsics.checkNotNullParameter(decodeBuffers, "decodeBuffers");
        Intrinsics.checkNotNullParameter(platformDecoderOptions, "platformDecoderOptions");
        this.f5482h = platformDecoderOptions;
    }

    @Override // S2.b
    public int d(int i10, int i11, BitmapFactory.Options options) {
        Intrinsics.checkNotNullParameter(options, "options");
        Bitmap.Config config = options.outConfig;
        if (config == null) {
            config = Bitmap.Config.ARGB_8888;
        }
        return Z2.d.i(i10, i11, config);
    }
}
