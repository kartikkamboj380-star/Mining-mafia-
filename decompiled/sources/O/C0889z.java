package O;

import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import androidx.lifecycle.AbstractC1164j;
import androidx.lifecycle.InterfaceC1168n;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: renamed from: O.z, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0889z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Runnable f3902a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final CopyOnWriteArrayList f3903b = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Map f3904c = new HashMap();

    /* JADX INFO: renamed from: O.z$a */
    private static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final AbstractC1164j f3905a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private InterfaceC1168n f3906b;

        a(AbstractC1164j abstractC1164j, InterfaceC1168n interfaceC1168n) {
            this.f3905a = abstractC1164j;
            this.f3906b = interfaceC1168n;
            abstractC1164j.a(interfaceC1168n);
        }

        void a() {
            this.f3905a.d(this.f3906b);
            this.f3906b = null;
        }
    }

    public C0889z(Runnable runnable) {
        this.f3902a = runnable;
    }

    public static /* synthetic */ void a(C0889z c0889z, AbstractC1164j.b bVar, C c10, androidx.lifecycle.r rVar, AbstractC1164j.a aVar) {
        c0889z.getClass();
        if (aVar == AbstractC1164j.a.f(bVar)) {
            c0889z.c(c10);
            return;
        }
        if (aVar == AbstractC1164j.a.ON_DESTROY) {
            c0889z.j(c10);
        } else if (aVar == AbstractC1164j.a.d(bVar)) {
            c0889z.f3903b.remove(c10);
            c0889z.f3902a.run();
        }
    }

    public static /* synthetic */ void b(C0889z c0889z, C c10, androidx.lifecycle.r rVar, AbstractC1164j.a aVar) {
        c0889z.getClass();
        if (aVar == AbstractC1164j.a.ON_DESTROY) {
            c0889z.j(c10);
        }
    }

    public void c(C c10) {
        this.f3903b.add(c10);
        this.f3902a.run();
    }

    public void d(final C c10, androidx.lifecycle.r rVar) {
        c(c10);
        AbstractC1164j lifecycle = rVar.getLifecycle();
        a aVar = (a) this.f3904c.remove(c10);
        if (aVar != null) {
            aVar.a();
        }
        this.f3904c.put(c10, new a(lifecycle, new InterfaceC1168n() { // from class: O.y
            @Override // androidx.lifecycle.InterfaceC1168n
            public final void onStateChanged(androidx.lifecycle.r rVar2, AbstractC1164j.a aVar2) {
                C0889z.b(this.f3900a, c10, rVar2, aVar2);
            }
        }));
    }

    public void e(final C c10, androidx.lifecycle.r rVar, final AbstractC1164j.b bVar) {
        AbstractC1164j lifecycle = rVar.getLifecycle();
        a aVar = (a) this.f3904c.remove(c10);
        if (aVar != null) {
            aVar.a();
        }
        this.f3904c.put(c10, new a(lifecycle, new InterfaceC1168n() { // from class: O.x
            @Override // androidx.lifecycle.InterfaceC1168n
            public final void onStateChanged(androidx.lifecycle.r rVar2, AbstractC1164j.a aVar2) {
                C0889z.a(this.f3897a, bVar, c10, rVar2, aVar2);
            }
        }));
    }

    public void f(Menu menu, MenuInflater menuInflater) {
        Iterator it = this.f3903b.iterator();
        while (it.hasNext()) {
            ((C) it.next()).d(menu, menuInflater);
        }
    }

    public void g(Menu menu) {
        Iterator it = this.f3903b.iterator();
        while (it.hasNext()) {
            ((C) it.next()).a(menu);
        }
    }

    public boolean h(MenuItem menuItem) {
        Iterator it = this.f3903b.iterator();
        while (it.hasNext()) {
            if (((C) it.next()).c(menuItem)) {
                return true;
            }
        }
        return false;
    }

    public void i(Menu menu) {
        Iterator it = this.f3903b.iterator();
        while (it.hasNext()) {
            ((C) it.next()).b(menu);
        }
    }

    public void j(C c10) {
        this.f3903b.remove(c10);
        a aVar = (a) this.f3904c.remove(c10);
        if (aVar != null) {
            aVar.a();
        }
        this.f3902a.run();
    }
}
