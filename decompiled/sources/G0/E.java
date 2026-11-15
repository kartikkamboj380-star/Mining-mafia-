package G0;

import android.graphics.Matrix;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
abstract class E extends B {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static boolean f761d = true;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static boolean f762e = true;

    static class a {
        static void a(View view, Matrix matrix) {
            view.transformMatrixToGlobal(matrix);
        }

        static void b(View view, Matrix matrix) {
            view.transformMatrixToLocal(matrix);
        }
    }

    E() {
    }

    @Override // G0.B
    public void g(View view, Matrix matrix) {
        if (f761d) {
            try {
                a.a(view, matrix);
            } catch (NoSuchMethodError unused) {
                f761d = false;
            }
        }
    }

    @Override // G0.B
    public void h(View view, Matrix matrix) {
        if (f762e) {
            try {
                a.b(view, matrix);
            } catch (NoSuchMethodError unused) {
                f762e = false;
            }
        }
    }
}
