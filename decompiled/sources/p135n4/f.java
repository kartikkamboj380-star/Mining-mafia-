package p135n4;

/* JADX INFO: loaded from: classes2.dex */
final class f extends p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final s f46756a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final p.b f46757b;

    static final class b extends p.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private s f46758a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private p.b f46759b;

        b() {
        }

        @Override // n4.p.a
        public p a() {
            return new f(this.f46758a, this.f46759b);
        }

        @Override // n4.p.a
        public p.a b(s sVar) {
            this.f46758a = sVar;
            return this;
        }

        @Override // n4.p.a
        public p.a c(p.b bVar) {
            this.f46759b = bVar;
            return this;
        }
    }

    @Override // p135n4.p
    public s b() {
        return this.f46756a;
    }

    @Override // p135n4.p
    public p.b c() {
        return this.f46757b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof p) {
            p pVar = (p) obj;
            s sVar = this.f46756a;
            if (sVar != null ? sVar.equals(pVar.b()) : pVar.b() == null) {
                p.b bVar = this.f46757b;
                if (bVar != null ? bVar.equals(pVar.c()) : pVar.c() == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        s sVar = this.f46756a;
        int iHashCode = ((sVar == null ? 0 : sVar.hashCode()) ^ 1000003) * 1000003;
        p.b bVar = this.f46757b;
        return iHashCode ^ (bVar != null ? bVar.hashCode() : 0);
    }

    public String toString() {
        return "ComplianceData{privacyContext=" + this.f46756a + ", productIdOrigin=" + this.f46757b + "}";
    }

    private f(s sVar, p.b bVar) {
        this.f46756a = sVar;
        this.f46757b = bVar;
    }
}
