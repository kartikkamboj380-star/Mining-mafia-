package com.facebook.imagepipeline.nativecode;

import Y1.k;
import android.graphics.Bitmap;

/* JADX INFO: loaded from: classes.dex */
@Y1.d
public class Bitmaps {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f13957a = 0;

    static {
        c.a();
    }

    @Y1.d
    public static void copyBitmap(Bitmap bitmap, Bitmap bitmap2) {
        k.b(Boolean.valueOf(bitmap2.getConfig() == bitmap.getConfig()));
        k.b(Boolean.valueOf(bitmap.isMutable()));
        k.b(Boolean.valueOf(bitmap.getWidth() == bitmap2.getWidth()));
        k.b(Boolean.valueOf(bitmap.getHeight() == bitmap2.getHeight()));
        nativeCopyBitmap(bitmap, bitmap.getRowBytes(), bitmap2, bitmap2.getRowBytes(), bitmap.getHeight());
    }

    @Y1.d
    private static native void nativeCopyBitmap(Bitmap bitmap, int i10, Bitmap bitmap2, int i11, int i12);
}
