package V5;

/* JADX INFO: renamed from: V5.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C0974k implements o {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Object f6120c = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private volatile o f6121a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private volatile Object f6122b = f6120c;

    private C0974k(o oVar) {
        this.f6121a = oVar;
    }

    public static o b(o oVar) {
        return oVar instanceof C0974k ? oVar : new C0974k(oVar);
    }

    @Override // V5.o
    public final Object a() {
        Object objA;
        Object obj = this.f6122b;
        Object obj2 = f6120c;
        if (obj != obj2) {
            return obj;
        }
        synchronized (this) {
            try {
                objA = this.f6122b;
                if (objA == obj2) {
                    objA = this.f6121a.a();
                    Object obj3 = this.f6122b;
                    if (obj3 != obj2 && obj3 != objA) {
                        throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj3 + " & " + objA + ". This is likely due to a circular dependency.");
                    }
                    this.f6122b = objA;
                    this.f6121a = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return objA;
    }
}
