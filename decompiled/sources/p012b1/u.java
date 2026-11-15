package p012b1;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes.dex */
public abstract class u {
    public static final Drawable a(n nVar, Resources resources) {
        if (nVar instanceof i) {
            return ((i) nVar).d();
        }
        return nVar instanceof C1190a ? new BitmapDrawable(resources, ((C1190a) nVar).d()) : new o(nVar);
    }

    public static final C1190a b(Bitmap bitmap, boolean z9) {
        return new C1190a(bitmap, z9);
    }

    public static final n c(Drawable drawable) {
        return drawable instanceof BitmapDrawable ? d(((BitmapDrawable) drawable).getBitmap(), false, 1, null) : new i(drawable, false);
    }

    public static /* synthetic */ C1190a d(Bitmap bitmap, boolean z9, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z9 = true;
        }
        return b(bitmap, z9);
    }

    public static final Bitmap e(n nVar, int i10, int i11) {
        Bitmap.Config config = nVar instanceof C1190a ? ((C1190a) nVar).d().getConfig() : null;
        if (config == null) {
            config = Bitmap.Config.ARGB_8888;
        }
        return f(nVar, i10, i11, config);
    }

    public static final Bitmap f(n nVar, int i10, int i11, Bitmap.Config config) {
        if (nVar instanceof C1190a) {
            C1190a c1190a = (C1190a) nVar;
            if (c1190a.d().getWidth() == i10 && c1190a.d().getHeight() == i11 && c1190a.d().getConfig() == config) {
                return c1190a.d();
            }
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i10, i11, config);
        nVar.c(new Canvas(bitmapCreateBitmap));
        return bitmapCreateBitmap;
    }

    public static /* synthetic */ Bitmap g(n nVar, int i10, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = nVar.getWidth();
        }
        if ((i12 & 2) != 0) {
            i11 = nVar.getHeight();
        }
        return e(nVar, i10, i11);
    }
}
