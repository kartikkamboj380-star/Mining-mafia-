package I8;

/* JADX INFO: loaded from: classes3.dex */
public abstract class E {
    public static final Object a(Object obj, p169q8.b bVar) {
        if (!(obj instanceof C)) {
            return p129m8.m.b(obj);
        }
        m8.m.a aVar = p129m8.m.f46450b;
        return p129m8.m.b(p129m8.n.a(((C) obj).f1702a));
    }

    public static final Object b(Object obj) {
        Throwable thD = p129m8.m.d(obj);
        return thD == null ? obj : new C(thD, false, 2, null);
    }

    public static final Object c(Object obj, InterfaceC0683n interfaceC0683n) {
        Throwable thD = p129m8.m.d(obj);
        return thD == null ? obj : new C(thD, false, 2, null);
    }
}
