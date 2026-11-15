package p147o6;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
final class n extends F.e.d.a.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f47595a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final F.e.d.a.b.c f47596b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final F.a f47597c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final F.e.d.a.b.AbstractC0499d f47598d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final List f47599e;

    static final class b extends F.e.d.a.b.AbstractC0497b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private List f47600a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private F.e.d.a.b.c f47601b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private F.a f47602c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private F.e.d.a.b.AbstractC0499d f47603d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private List f47604e;

        b() {
        }

        @Override // o6.F.e.d.a.b.AbstractC0497b
        public F.e.d.a.b a() {
            List list;
            F.e.d.a.b.AbstractC0499d abstractC0499d = this.f47603d;
            if (abstractC0499d != null && (list = this.f47604e) != null) {
                return new n(this.f47600a, this.f47601b, this.f47602c, abstractC0499d, list);
            }
            StringBuilder sb = new StringBuilder();
            if (this.f47603d == null) {
                sb.append(" signal");
            }
            if (this.f47604e == null) {
                sb.append(" binaries");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb));
        }

        @Override // o6.F.e.d.a.b.AbstractC0497b
        public F.e.d.a.b.AbstractC0497b b(F.a aVar) {
            this.f47602c = aVar;
            return this;
        }

        @Override // o6.F.e.d.a.b.AbstractC0497b
        public F.e.d.a.b.AbstractC0497b c(List list) {
            if (list == null) {
                throw new NullPointerException("Null binaries");
            }
            this.f47604e = list;
            return this;
        }

        @Override // o6.F.e.d.a.b.AbstractC0497b
        public F.e.d.a.b.AbstractC0497b d(F.e.d.a.b.c cVar) {
            this.f47601b = cVar;
            return this;
        }

        @Override // o6.F.e.d.a.b.AbstractC0497b
        public F.e.d.a.b.AbstractC0497b e(F.e.d.a.b.AbstractC0499d abstractC0499d) {
            if (abstractC0499d == null) {
                throw new NullPointerException("Null signal");
            }
            this.f47603d = abstractC0499d;
            return this;
        }

        @Override // o6.F.e.d.a.b.AbstractC0497b
        public F.e.d.a.b.AbstractC0497b f(List list) {
            this.f47600a = list;
            return this;
        }
    }

    @Override // o6.F.e.d.a.b
    public F.a b() {
        return this.f47597c;
    }

    @Override // o6.F.e.d.a.b
    public List c() {
        return this.f47599e;
    }

    @Override // o6.F.e.d.a.b
    public F.e.d.a.b.c d() {
        return this.f47596b;
    }

    @Override // o6.F.e.d.a.b
    public F.e.d.a.b.AbstractC0499d e() {
        return this.f47598d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof F.e.d.a.b) {
            F.e.d.a.b bVar = (F.e.d.a.b) obj;
            List list = this.f47595a;
            if (list != null ? list.equals(bVar.f()) : bVar.f() == null) {
                F.e.d.a.b.c cVar = this.f47596b;
                if (cVar != null ? cVar.equals(bVar.d()) : bVar.d() == null) {
                    F.a aVar = this.f47597c;
                    if (aVar != null ? aVar.equals(bVar.b()) : bVar.b() == null) {
                        if (this.f47598d.equals(bVar.e()) && this.f47599e.equals(bVar.c())) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // o6.F.e.d.a.b
    public List f() {
        return this.f47595a;
    }

    public int hashCode() {
        List list = this.f47595a;
        int iHashCode = ((list == null ? 0 : list.hashCode()) ^ 1000003) * 1000003;
        F.e.d.a.b.c cVar = this.f47596b;
        int iHashCode2 = (iHashCode ^ (cVar == null ? 0 : cVar.hashCode())) * 1000003;
        F.a aVar = this.f47597c;
        return ((((iHashCode2 ^ (aVar != null ? aVar.hashCode() : 0)) * 1000003) ^ this.f47598d.hashCode()) * 1000003) ^ this.f47599e.hashCode();
    }

    public String toString() {
        return "Execution{threads=" + this.f47595a + ", exception=" + this.f47596b + ", appExitInfo=" + this.f47597c + ", signal=" + this.f47598d + ", binaries=" + this.f47599e + "}";
    }

    private n(List list, F.e.d.a.b.c cVar, F.a aVar, F.e.d.a.b.AbstractC0499d abstractC0499d, List list2) {
        this.f47595a = list;
        this.f47596b = cVar;
        this.f47597c = aVar;
        this.f47598d = abstractC0499d;
        this.f47599e = list2;
    }
}
