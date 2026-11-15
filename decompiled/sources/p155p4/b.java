package p155p4;

/* JADX INFO: loaded from: classes2.dex */
final class b extends g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final g.a f47863a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f47864b;

    b(g.a aVar, long j10) {
        if (aVar == null) {
            throw new NullPointerException("Null status");
        }
        this.f47863a = aVar;
        this.f47864b = j10;
    }

    @Override // p155p4.g
    public long b() {
        return this.f47864b;
    }

    @Override // p155p4.g
    public g.a c() {
        return this.f47863a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof g) {
            g gVar = (g) obj;
            if (this.f47863a.equals(gVar.c()) && this.f47864b == gVar.b()) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int iHashCode = (this.f47863a.hashCode() ^ 1000003) * 1000003;
        long j10 = this.f47864b;
        return iHashCode ^ ((int) (j10 ^ (j10 >>> 32)));
    }

    public String toString() {
        return "BackendResponse{status=" + this.f47863a + ", nextRequestWaitMillis=" + this.f47864b + "}";
    }
}
