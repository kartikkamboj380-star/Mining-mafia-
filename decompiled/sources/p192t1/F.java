package p192t1;

import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.ColorSpace;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;
import android.os.Build;
import androidx.vectordrawable.graphics.drawable.f;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import p012b1.C;
import p012b1.C1190a;
import p012b1.D;
import p012b1.n;

/* JADX INFO: loaded from: classes.dex */
public abstract class F {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final ColorSpace f49485a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Bitmap.Config[] f49486b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Bitmap.Config f49487c;

    static {
        int i10 = Build.VERSION.SDK_INT;
        f49486b = i10 >= 26 ? new Bitmap.Config[]{Bitmap.Config.ARGB_8888, Bitmap.Config.RGBA_F16} : new Bitmap.Config[]{Bitmap.Config.ARGB_8888};
        f49487c = i10 >= 26 ? Bitmap.Config.HARDWARE : Bitmap.Config.ARGB_8888;
    }

    public static final Bitmap.Config a() {
        return f49487c;
    }

    public static final int b(Drawable drawable) {
        Bitmap bitmap;
        BitmapDrawable bitmapDrawable = drawable instanceof BitmapDrawable ? (BitmapDrawable) drawable : null;
        return (bitmapDrawable == null || (bitmap = bitmapDrawable.getBitmap()) == null) ? drawable.getIntrinsicHeight() : bitmap.getHeight();
    }

    public static final ColorSpace c() {
        return f49485a;
    }

    public static final int d(Configuration configuration) {
        return configuration.uiMode & 48;
    }

    public static final Bitmap.Config[] e() {
        return f49486b;
    }

    public static final int f(Drawable drawable) {
        Bitmap bitmap;
        BitmapDrawable bitmapDrawable = drawable instanceof BitmapDrawable ? (BitmapDrawable) drawable : null;
        return (bitmapDrawable == null || (bitmap = bitmapDrawable.getBitmap()) == null) ? drawable.getIntrinsicWidth() : bitmap.getWidth();
    }

    public static final boolean g(C c10) {
        return Intrinsics.b(c10.c(), "file") && Intrinsics.b(CollectionsKt.firstOrNull(D.f(c10)), "android_asset");
    }

    public static final boolean h(Drawable drawable) {
        return (drawable instanceof VectorDrawable) || (drawable instanceof f);
    }

    public static final void i(n nVar) {
        if (nVar instanceof C1190a) {
            ((C1190a) nVar).d().prepareToDraw();
        }
    }
}
