package I8;

/* JADX INFO: loaded from: classes3.dex */
public final class Y0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Y0 f1750a = new Y0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final ThreadLocal f1751b = N8.L.a(new N8.D("ThreadLocalEventLoop"));

    private Y0() {
    }

    public final AbstractC0678k0 a() {
        return (AbstractC0678k0) f1751b.get();
    }

    public final AbstractC0678k0 b() {
        ThreadLocal threadLocal = f1751b;
        AbstractC0678k0 abstractC0678k0 = (AbstractC0678k0) threadLocal.get();
        if (abstractC0678k0 != null) {
            return abstractC0678k0;
        }
        AbstractC0678k0 abstractC0678k0A = AbstractC0684n0.a();
        threadLocal.set(abstractC0678k0A);
        return abstractC0678k0A;
    }

    public final void c() {
        f1751b.set(null);
    }

    public final void d(AbstractC0678k0 abstractC0678k0) {
        f1751b.set(abstractC0678k0);
    }
}
