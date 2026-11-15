package N8;

import I8.L0;
import java.util.Iterator;
import java.util.List;
import java.util.ServiceLoader;

/* JADX INFO: loaded from: classes3.dex */
public final class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final s f3728a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final L0 f3729b;

    static {
        s sVar = new s();
        f3728a = sVar;
        E.f("kotlinx.coroutines.fast.service.loader", true);
        f3729b = sVar.a();
    }

    private s() {
    }

    private final L0 a() {
        Object next;
        L0 l0E;
        try {
            List listD = G8.j.D(G8.j.d(ServiceLoader.load(r.class, r.class.getClassLoader()).iterator()));
            Iterator it = listD.iterator();
            if (it.hasNext()) {
                next = it.next();
                if (it.hasNext()) {
                    int iC = ((r) next).c();
                    do {
                        Object next2 = it.next();
                        int iC2 = ((r) next2).c();
                        if (iC < iC2) {
                            next = next2;
                            iC = iC2;
                        }
                    } while (it.hasNext());
                }
            } else {
                next = null;
            }
            r rVar = (r) next;
            if (rVar != null && (l0E = t.e(rVar, listD)) != null) {
                return l0E;
            }
            t.b(null, null, 3, null);
            return null;
        } catch (Throwable th) {
            t.b(th, null, 2, null);
            return null;
        }
    }
}
