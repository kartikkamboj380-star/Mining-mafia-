package p192t1;

import B8.a;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import p022c1.C1206l;
import p142o1.e;
import p142o1.f;

/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final g f49492a = new g();

    private g() {
    }

    private final boolean b(Bitmap bitmap, Bitmap.Config config) {
        return bitmap.getConfig() == AbstractC7124b.e(config);
    }

    private final boolean c(boolean z9, Bitmap bitmap, f fVar, e eVar) {
        if (z9) {
            return true;
        }
        long jB = C1206l.b(bitmap.getWidth(), bitmap.getHeight(), fVar, eVar, f.f47166d);
        return C1206l.d(bitmap.getWidth(), bitmap.getHeight(), p.c(jB), p.d(jB), eVar) == 1.0d;
    }

    public final Bitmap a(Drawable drawable, Bitmap.Config config, f fVar, e eVar, boolean z9) {
        if (drawable instanceof BitmapDrawable) {
            Bitmap bitmap = ((BitmapDrawable) drawable).getBitmap();
            if (b(bitmap, config) && c(z9, bitmap, fVar, eVar)) {
                return bitmap;
            }
        }
        Drawable drawableMutate = drawable.mutate();
        int iF = F.f(drawableMutate);
        int i10 = IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING;
        if (iF <= 0) {
            iF = 512;
        }
        int iB = F.b(drawableMutate);
        if (iB > 0) {
            i10 = iB;
        }
        long jB = C1206l.b(iF, i10, fVar, eVar, f.f47166d);
        double d10 = C1206l.d(iF, i10, p.c(jB), p.d(jB), eVar);
        int iB2 = a.b(((double) iF) * d10);
        int iB3 = a.b(d10 * ((double) i10));
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iB2, iB3, AbstractC7124b.e(config));
        Rect bounds = drawableMutate.getBounds();
        int i11 = bounds.left;
        int i12 = bounds.top;
        int i13 = bounds.right;
        int i14 = bounds.bottom;
        drawableMutate.setBounds(0, 0, iB2, iB3);
        drawableMutate.draw(new Canvas(bitmapCreateBitmap));
        drawableMutate.setBounds(i11, i12, i13, i14);
        return bitmapCreateBitmap;
    }
}
