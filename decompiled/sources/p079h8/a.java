package p079h8;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Object f44869c = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private volatile c f44870a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private volatile Object f44871b = f44869c;

    private a(c cVar) {
        this.f44870a = cVar;
    }

    public static c a(c cVar) {
        b.b(cVar);
        return cVar instanceof a ? cVar : new a(cVar);
    }

    private static Object b(Object obj, Object obj2) {
        if (obj == f44869c || obj == obj2) {
            return obj2;
        }
        throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj + " & " + obj2 + ". This is likely due to a circular dependency.");
    }

    @Override // javax.inject.Provider
    public Object get() {
        Object obj;
        Object obj2 = this.f44871b;
        Object obj3 = f44869c;
        if (obj2 != obj3) {
            return obj2;
        }
        synchronized (this) {
            try {
                obj = this.f44871b;
                if (obj == obj3) {
                    obj = this.f44870a.get();
                    this.f44871b = b(this.f44871b, obj);
                    this.f44870a = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return obj;
    }
}
