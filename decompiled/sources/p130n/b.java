package p130n;

import android.content.Context;
import android.view.MenuItem;
import android.view.SubMenu;
import p190t.k;

/* JADX INFO: loaded from: classes.dex */
abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final Context f46518a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private k f46519b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private k f46520c;

    b(Context context) {
        this.f46518a = context;
    }

    final MenuItem c(MenuItem menuItem) {
        if (!(menuItem instanceof H.b)) {
            return menuItem;
        }
        H.b bVar = (H.b) menuItem;
        if (this.f46519b == null) {
            this.f46519b = new k();
        }
        MenuItem menuItem2 = (MenuItem) this.f46519b.get(bVar);
        if (menuItem2 != null) {
            return menuItem2;
        }
        c cVar = new c(this.f46518a, bVar);
        this.f46519b.put(bVar, cVar);
        return cVar;
    }

    final void e() {
        k kVar = this.f46519b;
        if (kVar != null) {
            kVar.clear();
        }
        k kVar2 = this.f46520c;
        if (kVar2 != null) {
            kVar2.clear();
        }
    }

    final void f(int i10) {
        if (this.f46519b == null) {
            return;
        }
        int i11 = 0;
        while (i11 < this.f46519b.size()) {
            if (((H.b) this.f46519b.g(i11)).getGroupId() == i10) {
                this.f46519b.i(i11);
                i11--;
            }
            i11++;
        }
    }

    final void g(int i10) {
        if (this.f46519b == null) {
            return;
        }
        for (int i11 = 0; i11 < this.f46519b.size(); i11++) {
            if (((H.b) this.f46519b.g(i11)).getItemId() == i10) {
                this.f46519b.i(i11);
                return;
            }
        }
    }

    final SubMenu d(SubMenu subMenu) {
        return subMenu;
    }
}
