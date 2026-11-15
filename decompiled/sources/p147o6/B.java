package p147o6;

/* JADX INFO: loaded from: classes3.dex */
final class B extends G {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final G.a f47280a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final G.c f47281b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final G.b f47282c;

    B(G.a aVar, G.c cVar, G.b bVar) {
        if (aVar == null) {
            throw new NullPointerException("Null appData");
        }
        this.f47280a = aVar;
        if (cVar == null) {
            throw new NullPointerException("Null osData");
        }
        this.f47281b = cVar;
        if (bVar == null) {
            throw new NullPointerException("Null deviceData");
        }
        this.f47282c = bVar;
    }

    @Override // p147o6.G
    public G.a a() {
        return this.f47280a;
    }

    @Override // p147o6.G
    public G.b c() {
        return this.f47282c;
    }

    @Override // p147o6.G
    public G.c d() {
        return this.f47281b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof G) {
            G g10 = (G) obj;
            if (this.f47280a.equals(g10.a()) && this.f47281b.equals(g10.d()) && this.f47282c.equals(g10.c())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((this.f47280a.hashCode() ^ 1000003) * 1000003) ^ this.f47281b.hashCode()) * 1000003) ^ this.f47282c.hashCode();
    }

    public String toString() {
        return "StaticSessionData{appData=" + this.f47280a + ", osData=" + this.f47281b + ", deviceData=" + this.f47282c + "}";
    }
}
