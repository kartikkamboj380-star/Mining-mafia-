package p193t2;

import android.graphics.Matrix;
import android.graphics.Rect;

/* JADX INFO: loaded from: classes.dex */
class r extends p {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final q f49659l = new r();

    private r() {
    }

    @Override // p193t2.p
    public void b(Matrix matrix, Rect rect, int i10, int i11, float f10, float f11, float f12, float f13) {
        matrix.setTranslate((int) (rect.left + ((rect.width() - i10) * 0.5f) + 0.5f), (int) (rect.top + ((rect.height() - i11) * 0.5f) + 0.5f));
    }

    public String toString() {
        return "center";
    }
}
