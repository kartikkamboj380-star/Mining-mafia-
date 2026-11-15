package p165q4;

import javax.inject.Provider;

/* JADX INFO: loaded from: classes2.dex */
public final class a implements Provider {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Object f48064c = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private volatile Provider f48065a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private volatile Object f48066b = f48064c;

    private a(Provider provider) {
        this.f48065a = provider;
    }

    public static Provider a(Provider provider) {
        d.b(provider);
        return provider instanceof a ? provider : new a(provider);
    }

    private static Object b(Object obj, Object obj2) {
        if (obj == f48064c || obj == obj2) {
            return obj2;
        }
        throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj + " & " + obj2 + ". This is likely due to a circular dependency.");
    }

    @Override // javax.inject.Provider
    public Object get() {
        Object obj;
        Object obj2 = this.f48066b;
        Object obj3 = f48064c;
        if (obj2 != obj3) {
            return obj2;
        }
        synchronized (this) {
            try {
                obj = this.f48066b;
                if (obj == obj3) {
                    obj = this.f48065a.get();
                    this.f48066b = b(this.f48066b, obj);
                    this.f48065a = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return obj;
    }
}
