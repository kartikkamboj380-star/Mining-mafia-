package H2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class C {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Class f1124b = C.class;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Map f1125a = new HashMap();

    private C() {
    }

    public static C d() {
        return new C();
    }

    private synchronized void e() {
        Z1.a.y(f1124b, "Count = %d", Integer.valueOf(this.f1125a.size()));
    }

    public void a() {
        ArrayList arrayList;
        synchronized (this) {
            arrayList = new ArrayList(this.f1125a.values());
            this.f1125a.clear();
        }
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            O2.j jVar = (O2.j) arrayList.get(i10);
            if (jVar != null) {
                jVar.close();
            }
        }
    }

    public synchronized boolean b(S1.d dVar) {
        Y1.k.g(dVar);
        if (!this.f1125a.containsKey(dVar)) {
            return false;
        }
        O2.j jVar = (O2.j) this.f1125a.get(dVar);
        synchronized (jVar) {
            if (O2.j.a0(jVar)) {
                return true;
            }
            this.f1125a.remove(dVar);
            Z1.a.G(f1124b, "Found closed reference %d for key %s (%d)", Integer.valueOf(System.identityHashCode(jVar)), dVar.a(), Integer.valueOf(System.identityHashCode(dVar)));
            return false;
        }
    }

    public synchronized O2.j c(S1.d dVar) {
        Y1.k.g(dVar);
        O2.j jVarC = (O2.j) this.f1125a.get(dVar);
        if (jVarC != null) {
            synchronized (jVarC) {
                if (!O2.j.a0(jVarC)) {
                    this.f1125a.remove(dVar);
                    Z1.a.G(f1124b, "Found closed reference %d for key %s (%d)", Integer.valueOf(System.identityHashCode(jVarC)), dVar.a(), Integer.valueOf(System.identityHashCode(dVar)));
                    return null;
                }
                jVarC = O2.j.c(jVarC);
            }
        }
        return jVarC;
    }

    public synchronized void f(S1.d dVar, O2.j jVar) {
        Y1.k.g(dVar);
        Y1.k.b(Boolean.valueOf(O2.j.a0(jVar)));
        O2.j.h((O2.j) this.f1125a.put(dVar, O2.j.c(jVar)));
        e();
    }

    public boolean g(S1.d dVar) {
        O2.j jVar;
        Y1.k.g(dVar);
        synchronized (this) {
            jVar = (O2.j) this.f1125a.remove(dVar);
        }
        if (jVar == null) {
            return false;
        }
        try {
            return jVar.X();
        } finally {
            jVar.close();
        }
    }

    public synchronized boolean h(S1.d dVar, O2.j jVar) {
        Y1.k.g(dVar);
        Y1.k.g(jVar);
        Y1.k.b(Boolean.valueOf(O2.j.a0(jVar)));
        O2.j jVar2 = (O2.j) this.f1125a.get(dVar);
        if (jVar2 == null) {
            return false;
        }
        p023c2.a aVarN = jVar2.n();
        p023c2.a aVarN2 = jVar.n();
        if (aVarN != null && aVarN2 != null) {
            try {
                if (aVarN.G() == aVarN2.G()) {
                    this.f1125a.remove(dVar);
                    p023c2.a.x(aVarN2);
                    p023c2.a.x(aVarN);
                    O2.j.h(jVar2);
                    e();
                    return true;
                }
            } catch (Throwable th) {
                p023c2.a.x(aVarN2);
                p023c2.a.x(aVarN);
                O2.j.h(jVar2);
                throw th;
            }
        }
        p023c2.a.x(aVarN2);
        p023c2.a.x(aVarN);
        O2.j.h(jVar2);
        return false;
    }
}
