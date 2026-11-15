package kotlin.jvm.internal;

/* JADX INFO: loaded from: classes3.dex */
public class F {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final G f45974a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final F8.c[] f45975b;

    static {
        G g10 = null;
        try {
            g10 = (G) Class.forName("kotlin.reflect.jvm.internal.ReflectionFactoryImpl").newInstance();
        } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | InstantiationException unused) {
        }
        if (g10 == null) {
            g10 = new G();
        }
        f45974a = g10;
        f45975b = new F8.c[0];
    }

    public static F8.e a(j jVar) {
        return f45974a.a(jVar);
    }

    public static F8.c b(Class cls) {
        return f45974a.b(cls);
    }

    public static F8.d c(Class cls) {
        return f45974a.c(cls, "");
    }

    public static F8.g d(n nVar) {
        return f45974a.d(nVar);
    }

    public static F8.h e(p pVar) {
        return f45974a.e(pVar);
    }

    public static F8.j f(t tVar) {
        return f45974a.f(tVar);
    }

    public static F8.k g(v vVar) {
        return f45974a.g(vVar);
    }

    public static F8.l h(x xVar) {
        return f45974a.h(xVar);
    }

    public static String i(InterfaceC7039i interfaceC7039i) {
        return f45974a.i(interfaceC7039i);
    }

    public static String j(m mVar) {
        return f45974a.j(mVar);
    }
}
