package Q6;

/* JADX INFO: loaded from: classes3.dex */
public final class c implements p079h8.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a f5065a;

    public c(a aVar) {
        this.f5065a = aVar;
    }

    public static c a(a aVar) {
        return new c(aVar);
    }

    public static p007a6.f c(a aVar) {
        return (p007a6.f) p079h8.b.c(aVar.b());
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public p007a6.f get() {
        return c(this.f5065a);
    }
}
