package Q6;

/* JADX INFO: loaded from: classes3.dex */
public final class h implements p079h8.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a f5070a;

    public h(a aVar) {
        this.f5070a = aVar;
    }

    public static h a(a aVar) {
        return new h(aVar);
    }

    public static G6.b c(a aVar) {
        return (G6.b) p079h8.b.c(aVar.g());
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public G6.b get() {
        return c(this.f5070a);
    }
}
