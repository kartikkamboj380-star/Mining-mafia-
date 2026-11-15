package G0;

import android.view.View;

/* JADX INFO: loaded from: classes.dex */
abstract class G extends E {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static boolean f763f = true;

    static class a {
        static void a(View view, int i10, int i11, int i12, int i13) {
            view.setLeftTopRightBottom(i10, i11, i12, i13);
        }
    }

    G() {
    }

    @Override // G0.B
    public void d(View view, int i10, int i11, int i12, int i13) {
        if (f763f) {
            try {
                a.a(view, i10, i11, i12, i13);
            } catch (NoSuchMethodError unused) {
                f763f = false;
            }
        }
    }
}
