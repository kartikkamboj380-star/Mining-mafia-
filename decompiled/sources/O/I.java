package O;

import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes.dex */
public class I {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f3772a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f3773b;

    public I(ViewGroup viewGroup) {
    }

    public int a() {
        return this.f3772a | this.f3773b;
    }

    public void b(View view, View view2, int i10) {
        c(view, view2, i10, 0);
    }

    public void c(View view, View view2, int i10, int i11) {
        if (i11 == 1) {
            this.f3773b = i10;
        } else {
            this.f3772a = i10;
        }
    }

    public void d(View view) {
        e(view, 0);
    }

    public void e(View view, int i10) {
        if (i10 == 1) {
            this.f3773b = 0;
        } else {
            this.f3772a = 0;
        }
    }
}
