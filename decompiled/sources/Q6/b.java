package Q6;

/* JADX INFO: loaded from: classes3.dex */
public final class b implements p079h8.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a f5064a;

    public b(a aVar) {
        this.f5064a = aVar;
    }

    public static b a(a aVar) {
        return new b(aVar);
    }

    public static com.google.firebase.perf.config.a c(a aVar) {
        return (com.google.firebase.perf.config.a) p079h8.b.c(aVar.a());
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.google.firebase.perf.config.a get() {
        return c(this.f5064a);
    }
}
