package p147o6;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
final class p extends F.e.d.a.b.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f47614a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f47615b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List f47616c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final F.e.d.a.b.c f47617d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f47618e;

    static final class b extends F.e.d.a.b.c.AbstractC0498a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f47619a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f47620b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private List f47621c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private F.e.d.a.b.c f47622d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f47623e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private byte f47624f;

        b() {
        }

        @Override // o6.F.e.d.a.b.c.AbstractC0498a
        public F.e.d.a.b.c a() {
            String str;
            List list;
            if (this.f47624f == 1 && (str = this.f47619a) != null && (list = this.f47621c) != null) {
                return new p(str, this.f47620b, list, this.f47622d, this.f47623e);
            }
            StringBuilder sb = new StringBuilder();
            if (this.f47619a == null) {
                sb.append(" type");
            }
            if (this.f47621c == null) {
                sb.append(" frames");
            }
            if ((1 & this.f47624f) == 0) {
                sb.append(" overflowCount");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb));
        }

        @Override // o6.F.e.d.a.b.c.AbstractC0498a
        public F.e.d.a.b.c.AbstractC0498a b(F.e.d.a.b.c cVar) {
            this.f47622d = cVar;
            return this;
        }

        @Override // o6.F.e.d.a.b.c.AbstractC0498a
        public F.e.d.a.b.c.AbstractC0498a c(List list) {
            if (list == null) {
                throw new NullPointerException("Null frames");
            }
            this.f47621c = list;
            return this;
        }

        @Override // o6.F.e.d.a.b.c.AbstractC0498a
        public F.e.d.a.b.c.AbstractC0498a d(int i10) {
            this.f47623e = i10;
            this.f47624f = (byte) (this.f47624f | 1);
            return this;
        }

        @Override // o6.F.e.d.a.b.c.AbstractC0498a
        public F.e.d.a.b.c.AbstractC0498a e(String str) {
            this.f47620b = str;
            return this;
        }

        @Override // o6.F.e.d.a.b.c.AbstractC0498a
        public F.e.d.a.b.c.AbstractC0498a f(String str) {
            if (str == null) {
                throw new NullPointerException("Null type");
            }
            this.f47619a = str;
            return this;
        }
    }

    @Override // o6.F.e.d.a.b.c
    public F.e.d.a.b.c b() {
        return this.f47617d;
    }

    @Override // o6.F.e.d.a.b.c
    public List c() {
        return this.f47616c;
    }

    @Override // o6.F.e.d.a.b.c
    public int d() {
        return this.f47618e;
    }

    @Override // o6.F.e.d.a.b.c
    public String e() {
        return this.f47615b;
    }

    public boolean equals(Object obj) {
        String str;
        F.e.d.a.b.c cVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof F.e.d.a.b.c) {
            F.e.d.a.b.c cVar2 = (F.e.d.a.b.c) obj;
            if (this.f47614a.equals(cVar2.f()) && ((str = this.f47615b) != null ? str.equals(cVar2.e()) : cVar2.e() == null) && this.f47616c.equals(cVar2.c()) && ((cVar = this.f47617d) != null ? cVar.equals(cVar2.b()) : cVar2.b() == null) && this.f47618e == cVar2.d()) {
                return true;
            }
        }
        return false;
    }

    @Override // o6.F.e.d.a.b.c
    public String f() {
        return this.f47614a;
    }

    public int hashCode() {
        int iHashCode = (this.f47614a.hashCode() ^ 1000003) * 1000003;
        String str = this.f47615b;
        int iHashCode2 = (((iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ this.f47616c.hashCode()) * 1000003;
        F.e.d.a.b.c cVar = this.f47617d;
        return ((iHashCode2 ^ (cVar != null ? cVar.hashCode() : 0)) * 1000003) ^ this.f47618e;
    }

    public String toString() {
        return "Exception{type=" + this.f47614a + ", reason=" + this.f47615b + ", frames=" + this.f47616c + ", causedBy=" + this.f47617d + ", overflowCount=" + this.f47618e + "}";
    }

    private p(String str, String str2, List list, F.e.d.a.b.c cVar, int i10) {
        this.f47614a = str;
        this.f47615b = str2;
        this.f47616c = list;
        this.f47617d = cVar;
        this.f47618e = i10;
    }
}
