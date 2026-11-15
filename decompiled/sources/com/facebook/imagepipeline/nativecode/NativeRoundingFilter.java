package com.facebook.imagepipeline.nativecode;

import Y1.k;
import android.graphics.Bitmap;

/* JADX INFO: loaded from: classes.dex */
@Y1.d
public class NativeRoundingFilter {
    static {
        d.a();
    }

    @Y1.d
    private static native void nativeAddRoundedCornersFilter(Bitmap bitmap, int i10, int i11, int i12, int i13);

    @Y1.d
    private static native void nativeToCircleFastFilter(Bitmap bitmap, boolean z9);

    @Y1.d
    private static native void nativeToCircleFilter(Bitmap bitmap, boolean z9);

    @Y1.d
    private static native void nativeToCircleWithBorderFilter(Bitmap bitmap, int i10, int i11, boolean z9);

    @Y1.d
    public static void toCircle(Bitmap bitmap, boolean z9) {
        k.g(bitmap);
        if (bitmap.getWidth() < 3 || bitmap.getHeight() < 3) {
            return;
        }
        nativeToCircleFilter(bitmap, z9);
    }

    @Y1.d
    public static void toCircleFast(Bitmap bitmap, boolean z9) {
        k.g(bitmap);
        if (bitmap.getWidth() < 3 || bitmap.getHeight() < 3) {
            return;
        }
        nativeToCircleFastFilter(bitmap, z9);
    }
}
