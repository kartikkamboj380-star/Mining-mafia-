package G0;

import android.graphics.Matrix;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
class J extends I {
    J() {
    }

    @Override // G0.B
    public float b(View view) {
        return view.getTransitionAlpha();
    }

    @Override // G0.G, G0.B
    public void d(View view, int i10, int i11, int i12, int i13) {
        view.setLeftTopRightBottom(i10, i11, i12, i13);
    }

    @Override // G0.B
    public void e(View view, float f10) {
        view.setTransitionAlpha(f10);
    }

    @Override // G0.I, G0.B
    public void f(View view, int i10) {
        view.setTransitionVisibility(i10);
    }

    @Override // G0.E, G0.B
    public void g(View view, Matrix matrix) {
        view.transformMatrixToGlobal(matrix);
    }

    @Override // G0.E, G0.B
    public void h(View view, Matrix matrix) {
        view.transformMatrixToLocal(matrix);
    }
}
