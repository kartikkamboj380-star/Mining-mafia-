package com.facebook.imagepipeline.nativecode;

import I2.i;
import O2.j;
import R2.C0957g;
import R2.h;
import Y1.k;
import Y1.p;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.ColorSpace;
import android.graphics.Rect;
import android.os.Build;
import com.facebook.soloader.InterfaceC1419g;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
@Y1.d
public abstract class DalvikPurgeableDecoder implements S2.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected static final byte[] f13958b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C0957g f13959a = h.a();

    @InterfaceC1419g
    private static class OreoUtils {
        private OreoUtils() {
        }

        static void a(BitmapFactory.Options options, ColorSpace colorSpace) {
            if (colorSpace == null) {
                colorSpace = ColorSpace.get(ColorSpace.Named.SRGB);
            }
            options.inPreferredColorSpace = colorSpace;
        }
    }

    static {
        c.a();
        f13958b = new byte[]{-1, -39};
    }

    protected DalvikPurgeableDecoder() {
    }

    public static boolean e(p023c2.a aVar, int i10) {
        p013b2.h hVar = (p013b2.h) aVar.G();
        return i10 >= 2 && hVar.k(i10 + (-2)) == -1 && hVar.k(i10 - 1) == -39;
    }

    public static BitmapFactory.Options f(int i10, Bitmap.Config config) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inDither = true;
        options.inPreferredConfig = config;
        options.inPurgeable = true;
        options.inInputShareable = true;
        options.inSampleSize = i10;
        options.inMutable = true;
        return options;
    }

    @Y1.d
    private static native void nativePinBitmap(Bitmap bitmap);

    @Override // S2.d
    public p023c2.a a(j jVar, Bitmap.Config config, Rect rect, ColorSpace colorSpace) {
        BitmapFactory.Options optionsF = f(jVar.N(), config);
        if (Build.VERSION.SDK_INT >= 26) {
            OreoUtils.a(optionsF, colorSpace);
        }
        p023c2.a aVarN = jVar.n();
        k.g(aVarN);
        try {
            return g(c(aVarN, optionsF));
        } finally {
            p023c2.a.x(aVarN);
        }
    }

    @Override // S2.d
    public p023c2.a b(j jVar, Bitmap.Config config, Rect rect, int i10, ColorSpace colorSpace) {
        BitmapFactory.Options optionsF = f(jVar.N(), config);
        if (Build.VERSION.SDK_INT >= 26) {
            OreoUtils.a(optionsF, colorSpace);
        }
        p023c2.a aVarN = jVar.n();
        k.g(aVarN);
        try {
            return g(d(aVarN, i10, optionsF));
        } finally {
            p023c2.a.x(aVarN);
        }
    }

    protected abstract Bitmap c(p023c2.a aVar, BitmapFactory.Options options);

    protected abstract Bitmap d(p023c2.a aVar, int i10, BitmapFactory.Options options);

    public p023c2.a g(Bitmap bitmap) {
        k.g(bitmap);
        try {
            nativePinBitmap(bitmap);
            if (this.f13959a.g(bitmap)) {
                return p023c2.a.a0(bitmap, this.f13959a.e());
            }
            int iJ = Z2.d.j(bitmap);
            bitmap.recycle();
            throw new i(String.format(Locale.US, "Attempted to pin a bitmap of size %d bytes. The current pool count is %d, the current pool size is %d bytes. The current pool max count is %d, the current pool max size is %d bytes.", Integer.valueOf(iJ), Integer.valueOf(this.f13959a.b()), Long.valueOf(this.f13959a.f()), Integer.valueOf(this.f13959a.c()), Integer.valueOf(this.f13959a.d())));
        } catch (Exception e10) {
            bitmap.recycle();
            throw p.a(e10);
        }
    }
}
