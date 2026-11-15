package androidx.recyclerview.widget;

import android.view.View;

/* JADX INFO: loaded from: classes.dex */
abstract class l {
    static int a(RecyclerView.A a10, i iVar, View view, View view2, RecyclerView.p pVar, boolean z9) {
        if (pVar.getChildCount() == 0 || a10.b() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z9) {
            return Math.abs(pVar.getPosition(view) - pVar.getPosition(view2)) + 1;
        }
        return Math.min(iVar.o(), iVar.d(view2) - iVar.g(view));
    }

    static int b(RecyclerView.A a10, i iVar, View view, View view2, RecyclerView.p pVar, boolean z9, boolean z10) {
        if (pVar.getChildCount() == 0 || a10.b() == 0 || view == null || view2 == null) {
            return 0;
        }
        int iMax = z10 ? Math.max(0, (a10.b() - Math.max(pVar.getPosition(view), pVar.getPosition(view2))) - 1) : Math.max(0, Math.min(pVar.getPosition(view), pVar.getPosition(view2)));
        if (z9) {
            return Math.round((iMax * (Math.abs(iVar.d(view2) - iVar.g(view)) / (Math.abs(pVar.getPosition(view) - pVar.getPosition(view2)) + 1))) + (iVar.n() - iVar.g(view)));
        }
        return iMax;
    }

    static int c(RecyclerView.A a10, i iVar, View view, View view2, RecyclerView.p pVar, boolean z9) {
        if (pVar.getChildCount() == 0 || a10.b() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z9) {
            return a10.b();
        }
        return (int) (((iVar.d(view2) - iVar.g(view)) / (Math.abs(pVar.getPosition(view) - pVar.getPosition(view2)) + 1)) * a10.b());
    }
}
