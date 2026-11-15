package p135n4;

/* JADX INFO: loaded from: classes2.dex */
final class m extends w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final w.c f46801a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final w.b f46802b;

    static final class b extends w.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private w.c f46803a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private w.b f46804b;

        b() {
        }

        @Override // n4.w.a
        public w a() {
            return new m(this.f46803a, this.f46804b);
        }

        @Override // n4.w.a
        public w.a b(w.b bVar) {
            this.f46804b = bVar;
            return this;
        }

        @Override // n4.w.a
        public w.a c(w.c cVar) {
            this.f46803a = cVar;
            return this;
        }
    }

    @Override // p135n4.w
    public w.b b() {
        return this.f46802b;
    }

    @Override // p135n4.w
    public w.c c() {
        return this.f46801a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof w) {
            w wVar = (w) obj;
            w.c cVar = this.f46801a;
            if (cVar != null ? cVar.equals(wVar.c()) : wVar.c() == null) {
                w.b bVar = this.f46802b;
                if (bVar != null ? bVar.equals(wVar.b()) : wVar.b() == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        w.c cVar = this.f46801a;
        int iHashCode = ((cVar == null ? 0 : cVar.hashCode()) ^ 1000003) * 1000003;
        w.b bVar = this.f46802b;
        return iHashCode ^ (bVar != null ? bVar.hashCode() : 0);
    }

    public String toString() {
        return "NetworkConnectionInfo{networkType=" + this.f46801a + ", mobileSubtype=" + this.f46802b + "}";
    }

    private m(w.c cVar, w.b bVar) {
        this.f46801a = cVar;
        this.f46802b = bVar;
    }
}
