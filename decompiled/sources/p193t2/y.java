package p193t2;

import android.graphics.Matrix;
import android.graphics.Rect;

/* JADX INFO: loaded from: classes.dex */
class y extends p {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final q f49666l = new y();

    private y() {
    }

    @Override // p193t2.p
    public void b(Matrix matrix, Rect rect, int i10, int i11, float f10, float f11, float f12, float f13) {
        float f14 = rect.left;
        float fHeight = rect.top + ((rect.height() - (i11 * f12)) * 0.5f);
        matrix.setScale(f12, f12);
        matrix.postTranslate((int) (f14 + 0.5f), (int) (fHeight + 0.5f));
    }

    public String toString() {
        return "fit_x";
    }
}
