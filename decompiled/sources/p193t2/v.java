package p193t2;

import android.graphics.Matrix;
import android.graphics.Rect;

/* JADX INFO: loaded from: classes.dex */
class v extends p {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final q f49663l = new v();

    private v() {
    }

    @Override // p193t2.p
    public void b(Matrix matrix, Rect rect, int i10, int i11, float f10, float f11, float f12, float f13) {
        float fMin = Math.min(f12, f13);
        float fWidth = rect.left + ((rect.width() - (i10 * fMin)) * 0.5f);
        float fHeight = rect.top + ((rect.height() - (i11 * fMin)) * 0.5f);
        matrix.setScale(fMin, fMin);
        matrix.postTranslate((int) (fWidth + 0.5f), (int) (fHeight + 0.5f));
    }

    public String toString() {
        return "fit_center";
    }
}
