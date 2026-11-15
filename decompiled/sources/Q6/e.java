package Q6;

/* JADX INFO: loaded from: classes3.dex */
public final class e implements p079h8.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a f5067a;

    public e(a aVar) {
        this.f5067a = aVar;
    }

    public static e a(a aVar) {
        return new e(aVar);
    }

    public static G6.b c(a aVar) {
        return (G6.b) p079h8.b.c(aVar.d());
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public G6.b get() {
        return c(this.f5067a);
    }
}
