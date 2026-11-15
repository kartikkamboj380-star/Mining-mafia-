package p135n4;

/* JADX INFO: loaded from: classes2.dex */
final class e extends o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final o.b f46752a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final p135n4.a f46753b;

    static final class b extends o.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private o.b f46754a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private p135n4.a f46755b;

        b() {
        }

        @Override // n4.o.a
        public o a() {
            return new e(this.f46754a, this.f46755b);
        }

        @Override // n4.o.a
        public o.a b(p135n4.a aVar) {
            this.f46755b = aVar;
            return this;
        }

        @Override // n4.o.a
        public o.a c(o.b bVar) {
            this.f46754a = bVar;
            return this;
        }
    }

    @Override // p135n4.o
    public p135n4.a b() {
        return this.f46753b;
    }

    @Override // p135n4.o
    public o.b c() {
        return this.f46752a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof o) {
            o oVar = (o) obj;
            o.b bVar = this.f46752a;
            if (bVar != null ? bVar.equals(oVar.c()) : oVar.c() == null) {
                p135n4.a aVar = this.f46753b;
                if (aVar != null ? aVar.equals(oVar.b()) : oVar.b() == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        o.b bVar = this.f46752a;
        int iHashCode = ((bVar == null ? 0 : bVar.hashCode()) ^ 1000003) * 1000003;
        p135n4.a aVar = this.f46753b;
        return iHashCode ^ (aVar != null ? aVar.hashCode() : 0);
    }

    public String toString() {
        return "ClientInfo{clientType=" + this.f46752a + ", androidClientInfo=" + this.f46753b + "}";
    }

    private e(o.b bVar, p135n4.a aVar) {
        this.f46752a = bVar;
        this.f46753b = aVar;
    }
}
