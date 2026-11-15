package H2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final D f1163a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final LinkedHashMap f1164b = new LinkedHashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f1165c = 0;

    public m(D d10) {
        this.f1163a = d10;
    }

    private int f(Object obj) {
        if (obj == null) {
            return 0;
        }
        return this.f1163a.a(obj);
    }

    public synchronized Object a(Object obj) {
        return this.f1164b.get(obj);
    }

    public synchronized int b() {
        return this.f1164b.size();
    }

    public synchronized Object c() {
        return this.f1164b.isEmpty() ? null : this.f1164b.keySet().iterator().next();
    }

    public synchronized ArrayList d(Y1.l lVar) {
        ArrayList arrayList;
        try {
            arrayList = new ArrayList(this.f1164b.entrySet().size());
            for (Map.Entry entry : this.f1164b.entrySet()) {
                if (lVar == null || lVar.apply(entry.getKey())) {
                    arrayList.add(entry);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return arrayList;
    }

    public synchronized int e() {
        return this.f1165c;
    }

    public synchronized Object g(Object obj, Object obj2) {
        Object objRemove;
        objRemove = this.f1164b.remove(obj);
        this.f1165c -= f(objRemove);
        this.f1164b.put(obj, obj2);
        this.f1165c += f(obj2);
        return objRemove;
    }

    public synchronized Object h(Object obj) {
        Object objRemove;
        objRemove = this.f1164b.remove(obj);
        this.f1165c -= f(objRemove);
        return objRemove;
    }

    public synchronized ArrayList i(Y1.l lVar) {
        ArrayList arrayList;
        try {
            arrayList = new ArrayList();
            Iterator it = this.f1164b.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                if (lVar == null || lVar.apply(entry.getKey())) {
                    arrayList.add(entry.getValue());
                    this.f1165c -= f(entry.getValue());
                    it.remove();
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return arrayList;
    }

    public synchronized void j() {
        if (this.f1164b.isEmpty()) {
            this.f1165c = 0;
        }
    }
}
