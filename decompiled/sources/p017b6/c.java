package p017b6;

import G6.b;
import android.content.Context;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p037d6.a;

/* JADX INFO: loaded from: classes.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b f11628a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f11629b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Integer f11630c = null;

    public c(Context context, b bVar, String str) {
        this.f11628a = bVar;
        this.f11629b = str;
    }

    private void a(a.c cVar) {
        ((a) this.f11628a.get()).d(cVar);
    }

    private void b(List list) {
        ArrayDeque arrayDeque = new ArrayDeque(f());
        int i10 = i();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            b bVar = (b) it.next();
            while (arrayDeque.size() >= i10) {
                k(((a.c) arrayDeque.pollFirst()).f43138b);
            }
            a.c cVarF = bVar.f(this.f11629b);
            a(cVarF);
            arrayDeque.offer(cVarF);
        }
    }

    private static List c(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(b.b((Map) it.next()));
        }
        return arrayList;
    }

    private boolean d(List list, b bVar) {
        String strC = bVar.c();
        String strE = bVar.e();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            b bVar2 = (b) it.next();
            if (bVar2.c().equals(strC) && bVar2.e().equals(strE)) {
                return true;
            }
        }
        return false;
    }

    private List f() {
        return ((a) this.f11628a.get()).g(this.f11629b, "");
    }

    private ArrayList g(List list, List list2) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            b bVar = (b) it.next();
            if (!d(list2, bVar)) {
                arrayList.add(bVar);
            }
        }
        return arrayList;
    }

    private ArrayList h(List list, List list2) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            b bVar = (b) it.next();
            if (!d(list2, bVar)) {
                arrayList.add(bVar.f(this.f11629b));
            }
        }
        return arrayList;
    }

    private int i() {
        if (this.f11630c == null) {
            this.f11630c = Integer.valueOf(((a) this.f11628a.get()).f(this.f11629b));
        }
        return this.f11630c.intValue();
    }

    private void k(String str) {
        ((a) this.f11628a.get()).clearConditionalUserProperty(str, null, null);
    }

    private void l(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            k(((a.c) it.next()).f43138b);
        }
    }

    private void n(List list) throws a {
        if (list.isEmpty()) {
            j();
            return;
        }
        List listE = e();
        l(h(listE, list));
        b(g(list, listE));
    }

    private void o() throws a {
        if (this.f11628a.get() == null) {
            throw new a("The Analytics SDK is not available. Please check that the Analytics SDK is included in your app dependencies.");
        }
    }

    public List e() throws a {
        o();
        List listF = f();
        ArrayList arrayList = new ArrayList();
        Iterator it = listF.iterator();
        while (it.hasNext()) {
            arrayList.add(b.a((a.c) it.next()));
        }
        return arrayList;
    }

    public void j() throws a {
        o();
        l(f());
    }

    public void m(List list) throws a {
        o();
        if (list == null) {
            throw new IllegalArgumentException("The replacementExperiments list is null.");
        }
        n(c(list));
    }
}
