package com.facebook.imagepipeline.nativecode;

import Y1.k;
import android.graphics.Bitmap;

/* JADX INFO: loaded from: classes.dex */
@Y1.d
public class NativeBlurFilter {
    static {
        d.a();
    }

    public static void a(Bitmap bitmap, int i10, int i11) {
        k.g(bitmap);
        k.b(Boolean.valueOf(i10 > 0));
        k.b(Boolean.valueOf(i11 > 0));
        nativeIterativeBoxBlur(bitmap, i10, i11);
    }

    @Y1.d
    private static native void nativeIterativeBoxBlur(Bitmap bitmap, int i10, int i11);
}
