package I8;

import N8.C0831h;

/* JADX INFO: loaded from: classes3.dex */
public abstract class T {
    public static final String a(Object obj) {
        return obj.getClass().getSimpleName();
    }

    public static final String b(Object obj) {
        return Integer.toHexString(System.identityHashCode(obj));
    }

    public static final String c(p169q8.b bVar) {
        Object objB;
        if (bVar instanceof C0831h) {
            return ((C0831h) bVar).toString();
        }
        try {
            m8.m.a aVar = p129m8.m.f46450b;
            objB = p129m8.m.b(bVar + '@' + b(bVar));
        } catch (Throwable th) {
            m8.m.a aVar2 = p129m8.m.f46450b;
            objB = p129m8.m.b(p129m8.n.a(th));
        }
        if (p129m8.m.d(objB) != null) {
            objB = bVar.getClass().getName() + '@' + b(bVar);
        }
        return (String) objB;
    }
}
