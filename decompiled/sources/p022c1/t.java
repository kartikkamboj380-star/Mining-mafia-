package p022c1;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import com.unity3d.services.UnityAdsConstants;
import p061g0.a;
import p192t1.AbstractC7124b;
import r9.InterfaceC7107j;

/* JADX INFO: loaded from: classes.dex */
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final t f11788a = new t();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Paint f11789b = new Paint(3);

    private t() {
    }

    public final C1208n a(String str, InterfaceC7107j interfaceC7107j, InterfaceC1212s interfaceC1212s) {
        if (!interfaceC1212s.c(str, interfaceC7107j)) {
            return C1208n.f11778d;
        }
        a aVar = new a(new C1209o(interfaceC7107j.peek().k1()));
        return new C1208n(aVar.s(), aVar.l());
    }

    public final Bitmap b(Bitmap bitmap, C1208n c1208n) {
        if (!c1208n.b() && !u.a(c1208n)) {
            return bitmap;
        }
        Matrix matrix = new Matrix();
        float width = bitmap.getWidth() / 2.0f;
        float height = bitmap.getHeight() / 2.0f;
        if (c1208n.b()) {
            matrix.postScale(-1.0f, 1.0f, width, height);
        }
        if (u.a(c1208n)) {
            matrix.postRotate(c1208n.a(), width, height);
        }
        RectF rectF = new RectF(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, bitmap.getWidth(), bitmap.getHeight());
        matrix.mapRect(rectF);
        float f10 = rectF.left;
        if (f10 != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || rectF.top != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            matrix.postTranslate(-f10, -rectF.top);
        }
        Bitmap bitmapCreateBitmap = u.b(c1208n) ? Bitmap.createBitmap(bitmap.getHeight(), bitmap.getWidth(), AbstractC7124b.c(bitmap)) : Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), AbstractC7124b.c(bitmap));
        new Canvas(bitmapCreateBitmap).drawBitmap(bitmap, matrix, f11789b);
        bitmap.recycle();
        return bitmapCreateBitmap;
    }
}
