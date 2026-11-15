package p068g7;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements e {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Object f44422c = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private volatile e f44423a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private volatile Object f44424b = f44422c;

    private a(e eVar) {
        this.f44423a = eVar;
    }

    public static e a(e eVar) {
        d.b(eVar);
        return eVar instanceof a ? eVar : new a(eVar);
    }

    private static Object b(Object obj, Object obj2) {
        if (obj == f44422c || obj == obj2) {
            return obj2;
        }
        throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj + " & " + obj2 + ". This is likely due to a circular dependency.");
    }

    @Override // javax.inject.Provider
    public Object get() {
        Object obj;
        Object obj2 = this.f44424b;
        Object obj3 = f44422c;
        if (obj2 != obj3) {
            return obj2;
        }
        synchronized (this) {
            try {
                obj = this.f44424b;
                if (obj == obj3) {
                    obj = this.f44423a.get();
                    this.f44424b = b(this.f44424b, obj);
                    this.f44423a = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return obj;
    }
}
