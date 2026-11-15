package Q6;

/* JADX INFO: loaded from: classes3.dex */
public final class d implements p079h8.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a f5066a;

    public d(a aVar) {
        this.f5066a = aVar;
    }

    public static d a(a aVar) {
        return new d(aVar);
    }

    public static H6.e c(a aVar) {
        return (H6.e) p079h8.b.c(aVar.c());
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public H6.e get() {
        return c(this.f5066a);
    }
}
