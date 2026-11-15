package p147o6;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
final class m extends F.e.d.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final F.e.d.a.b f47580a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List f47581b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List f47582c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Boolean f47583d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final F.e.d.a.c f47584e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final List f47585f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f47586g;

    static final class b extends F.e.d.a.AbstractC0494a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private F.e.d.a.b f47587a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private List f47588b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private List f47589c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private Boolean f47590d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private F.e.d.a.c f47591e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private List f47592f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private int f47593g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private byte f47594h;

        @Override // o6.F.e.d.a.AbstractC0494a
        public F.e.d.a a() {
            F.e.d.a.b bVar;
            if (this.f47594h == 1 && (bVar = this.f47587a) != null) {
                return new m(bVar, this.f47588b, this.f47589c, this.f47590d, this.f47591e, this.f47592f, this.f47593g);
            }
            StringBuilder sb = new StringBuilder();
            if (this.f47587a == null) {
                sb.append(" execution");
            }
            if ((1 & this.f47594h) == 0) {
                sb.append(" uiOrientation");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb));
        }

        @Override // o6.F.e.d.a.AbstractC0494a
        public F.e.d.a.AbstractC0494a b(List list) {
            this.f47592f = list;
            return this;
        }

        @Override // o6.F.e.d.a.AbstractC0494a
        public F.e.d.a.AbstractC0494a c(Boolean bool) {
            this.f47590d = bool;
            return this;
        }

        @Override // o6.F.e.d.a.AbstractC0494a
        public F.e.d.a.AbstractC0494a d(F.e.d.a.c cVar) {
            this.f47591e = cVar;
            return this;
        }

        @Override // o6.F.e.d.a.AbstractC0494a
        public F.e.d.a.AbstractC0494a e(List list) {
            this.f47588b = list;
            return this;
        }

        @Override // o6.F.e.d.a.AbstractC0494a
        public F.e.d.a.AbstractC0494a f(F.e.d.a.b bVar) {
            if (bVar == null) {
                throw new NullPointerException("Null execution");
            }
            this.f47587a = bVar;
            return this;
        }

        @Override // o6.F.e.d.a.AbstractC0494a
        public F.e.d.a.AbstractC0494a g(List list) {
            this.f47589c = list;
            return this;
        }

        @Override // o6.F.e.d.a.AbstractC0494a
        public F.e.d.a.AbstractC0494a h(int i10) {
            this.f47593g = i10;
            this.f47594h = (byte) (this.f47594h | 1);
            return this;
        }

        b() {
        }

        private b(F.e.d.a aVar) {
            this.f47587a = aVar.f();
            this.f47588b = aVar.e();
            this.f47589c = aVar.g();
            this.f47590d = aVar.c();
            this.f47591e = aVar.d();
            this.f47592f = aVar.b();
            this.f47593g = aVar.h();
            this.f47594h = (byte) 1;
        }
    }

    @Override // o6.F.e.d.a
    public List b() {
        return this.f47585f;
    }

    @Override // o6.F.e.d.a
    public Boolean c() {
        return this.f47583d;
    }

    @Override // o6.F.e.d.a
    public F.e.d.a.c d() {
        return this.f47584e;
    }

    @Override // o6.F.e.d.a
    public List e() {
        return this.f47581b;
    }

    public boolean equals(Object obj) {
        List list;
        List list2;
        Boolean bool;
        F.e.d.a.c cVar;
        List list3;
        if (obj == this) {
            return true;
        }
        if (obj instanceof F.e.d.a) {
            F.e.d.a aVar = (F.e.d.a) obj;
            if (this.f47580a.equals(aVar.f()) && ((list = this.f47581b) != null ? list.equals(aVar.e()) : aVar.e() == null) && ((list2 = this.f47582c) != null ? list2.equals(aVar.g()) : aVar.g() == null) && ((bool = this.f47583d) != null ? bool.equals(aVar.c()) : aVar.c() == null) && ((cVar = this.f47584e) != null ? cVar.equals(aVar.d()) : aVar.d() == null) && ((list3 = this.f47585f) != null ? list3.equals(aVar.b()) : aVar.b() == null) && this.f47586g == aVar.h()) {
                return true;
            }
        }
        return false;
    }

    @Override // o6.F.e.d.a
    public F.e.d.a.b f() {
        return this.f47580a;
    }

    @Override // o6.F.e.d.a
    public List g() {
        return this.f47582c;
    }

    @Override // o6.F.e.d.a
    public int h() {
        return this.f47586g;
    }

    public int hashCode() {
        int iHashCode = (this.f47580a.hashCode() ^ 1000003) * 1000003;
        List list = this.f47581b;
        int iHashCode2 = (iHashCode ^ (list == null ? 0 : list.hashCode())) * 1000003;
        List list2 = this.f47582c;
        int iHashCode3 = (iHashCode2 ^ (list2 == null ? 0 : list2.hashCode())) * 1000003;
        Boolean bool = this.f47583d;
        int iHashCode4 = (iHashCode3 ^ (bool == null ? 0 : bool.hashCode())) * 1000003;
        F.e.d.a.c cVar = this.f47584e;
        int iHashCode5 = (iHashCode4 ^ (cVar == null ? 0 : cVar.hashCode())) * 1000003;
        List list3 = this.f47585f;
        return ((iHashCode5 ^ (list3 != null ? list3.hashCode() : 0)) * 1000003) ^ this.f47586g;
    }

    @Override // o6.F.e.d.a
    public F.e.d.a.AbstractC0494a i() {
        return new b(this);
    }

    public String toString() {
        return "Application{execution=" + this.f47580a + ", customAttributes=" + this.f47581b + ", internalKeys=" + this.f47582c + ", background=" + this.f47583d + ", currentProcessDetails=" + this.f47584e + ", appProcessDetails=" + this.f47585f + ", uiOrientation=" + this.f47586g + "}";
    }

    private m(F.e.d.a.b bVar, List list, List list2, Boolean bool, F.e.d.a.c cVar, List list3, int i10) {
        this.f47580a = bVar;
        this.f47581b = list;
        this.f47582c = list2;
        this.f47583d = bool;
        this.f47584e = cVar;
        this.f47585f = list3;
        this.f47586g = i10;
    }
}
