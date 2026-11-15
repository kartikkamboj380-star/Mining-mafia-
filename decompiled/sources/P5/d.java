package P5;

/* JADX INFO: loaded from: classes2.dex */
public final class d implements f {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Object f4688c = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private volatile f f4689a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private volatile Object f4690b = f4688c;

    private d(f fVar) {
        this.f4689a = fVar;
    }

    public static f a(f fVar) {
        fVar.getClass();
        return fVar instanceof d ? fVar : new d(fVar);
    }

    @Override // P5.f
    public final Object zza() {
        Object objZza;
        Object obj = this.f4690b;
        Object obj2 = f4688c;
        if (obj != obj2) {
            return obj;
        }
        synchronized (this) {
            try {
                objZza = this.f4690b;
                if (objZza == obj2) {
                    objZza = this.f4689a.zza();
                    Object obj3 = this.f4690b;
                    if (obj3 != obj2 && obj3 != objZza) {
                        throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj3 + " & " + objZza + ". This is likely due to a circular dependency.");
                    }
                    this.f4690b = objZza;
                    this.f4689a = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return objZza;
    }
}
